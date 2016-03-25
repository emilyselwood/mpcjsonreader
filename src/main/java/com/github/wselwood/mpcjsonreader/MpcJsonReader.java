package com.github.wselwood.mpcjsonreader;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

public class MpcJsonReader {

    public static void main(String[] args) throws IOException {

        if (args.length != 2) {
            System.out.println("Wrong number of args");
            return;
        }

        ObjectMapper om = new ObjectMapper();

        FileInputStream fio = new FileInputStream(args[0]);
        InputStream stream;
        if (args[0].endsWith(".gz")) {
            stream = new GZIPInputStream(fio);
        } else {
            stream = fio;
        }

        Pattern pattern = Pattern.compile(args[1]);

        ObjectReader objReader = om.readerFor(MPCObjectList.class);
        MPCObjectList result = objReader.readValue(stream);

        System.out.println("num entries: " + result.size());

        result.stream()
                .filter(o -> o.getName() != null && pattern.matcher(o.getName()).matches())
                .forEach(o -> System.out.println("ref: " + o.getRef() + " name: " + o.getName()));

        stream.close();

    }

}

