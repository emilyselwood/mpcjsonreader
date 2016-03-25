package com.github.wselwood.mpcjsonreader;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

class MPCObject {
    @JsonProperty("Ref")
    private String ref;
    @JsonProperty("Perihelion_dist")
    private double perihelionDist;
    @JsonProperty("i")
    private double i;
    @JsonProperty("NEO_flag")
    private int neoFlag;
    @JsonProperty("Ast_obs")
    private String astObs;
    @JsonProperty("Peri")
    private double Peri;
    @JsonProperty("Tp")
    private double tp;
    @JsonProperty("One_opposition_object_flag")
    private int oneOppositionObjectFlag;
    @JsonProperty("M")
    private double m;
    @JsonProperty("n")
    private double n;
    @JsonProperty("Other_desigs")
    private List<String> otherDesigs;
    @JsonProperty("U")
    private String u;
    @JsonProperty("Critical_list_numbered_object_flag")
    private int criticalListNumberedObjectFlag;
    @JsonProperty("Designation")
    private String designation;
    @JsonProperty("a")
    private double a;
    @JsonProperty("Number")
    private String number;
    @JsonProperty("rms")
    private double rms;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Semilatus_rectum")
    private double semilatusRectum;
    @JsonProperty("Perturbers_2")
    private String perturbers2;
    @JsonProperty("Node")
    private double node;
    @JsonProperty("H")
    private double h;
    @JsonProperty("Aphelion_dist")
    private double aphelionDist;
    @JsonProperty("PHA_flag")
    private int phaFlag;
    @JsonProperty("Num_opps")
    private int numOpps;
    @JsonProperty("Epoch")
    private double epoch;
    @JsonProperty("G")
    private double g;
    @JsonProperty("e")
    private double e;
    @JsonProperty("Computer")
    private String computer;
    @JsonProperty("Orbital_period")
    private double orbitalPeriod;
    @JsonProperty("Synodic_period")
    private double synodicPeriod;
    @JsonProperty("Perturbers")
    private String perturbers;
    @JsonProperty("Hex_flags")
    private String hexFlags;
    @JsonProperty("One_km_NEO_flag")
    private int oneKMNeoFlag;
    @JsonProperty("Arc_years")
    private String arcYears;
    @JsonProperty("Num_obs")
    private int numObs;
    @JsonProperty("Arc_length")
    private double arcLength;
    @JsonProperty("Last_obs")
    private String lastObs;

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public double getPerihelionDist() {
        return perihelionDist;
    }

    public void setPerihelionDist(double perihelionDist) {
        this.perihelionDist = perihelionDist;
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    public int getNeoFlag() {
        return neoFlag;
    }

    public void setNeoFlag(int neoFlag) {
        this.neoFlag = neoFlag;
    }

    public String getAstObs() {
        return astObs;
    }

    public void setAstObs(String astObs) {
        this.astObs = astObs;
    }

    public double getPeri() {
        return Peri;
    }

    public void setPeri(double peri) {
        this.Peri = peri;
    }

    public double getTp() {
        return tp;
    }

    public void setTp(double tp) {
        this.tp = tp;
    }

    public int getOneOppositionObjectFlag() {
        return oneOppositionObjectFlag;
    }

    public void setOneOppositionObjectFlag(int oneOppositionObjectFlag) {
        this.oneOppositionObjectFlag = oneOppositionObjectFlag;
    }

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public List<String> getOtherDesigs() {
        return otherDesigs;
    }

    public void setOtherDesigs(List<String> otherDesigs) {
        this.otherDesigs = otherDesigs;
    }

    public String getU() {
        return u;
    }

    public void setU(String u) {
        this.u = u;
    }

    public int getCriticalListNumberedObjectFlag() {
        return criticalListNumberedObjectFlag;
    }

    public void setCriticalListNumberedObjectFlag(int criticalListNumberedObjectFlag) {
        this.criticalListNumberedObjectFlag = criticalListNumberedObjectFlag;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getRms() {
        return rms;
    }

    public void setRms(double rms) {
        this.rms = rms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSemilatusRectum() {
        return semilatusRectum;
    }

    public void setSemilatusRectum(double semilatusRectum) {
        this.semilatusRectum = semilatusRectum;
    }

    public String getPerturbers2() {
        return perturbers2;
    }

    public void setPerturbers2(String perturbers2) {
        this.perturbers2 = perturbers2;
    }

    public double getNode() {
        return node;
    }

    public void setNode(double node) {
        this.node = node;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getAphelionDist() {
        return aphelionDist;
    }

    public void setAphelionDist(double aphelionDist) {
        this.aphelionDist = aphelionDist;
    }

    public int getPhaFlag() {
        return phaFlag;
    }

    public void setPhaFlag(int phaFlag) {
        this.phaFlag = phaFlag;
    }

    public int getNumOpps() {
        return numOpps;
    }

    public void setNumOpps(int numOpps) {
        this.numOpps = numOpps;
    }

    public double getEpoch() {
        return epoch;
    }

    public void setEpoch(double epoch) {
        this.epoch = epoch;
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public String getComputer() {
        return computer;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public double getSynodicPeriod() {
        return synodicPeriod;
    }

    public void setSynodicPeriod(double synodicPeriod) {
        this.synodicPeriod = synodicPeriod;
    }

    public String getPerturbers() {
        return perturbers;
    }

    public void setPerturbers(String perturbers) {
        this.perturbers = perturbers;
    }

    public String getHexFlags() {
        return hexFlags;
    }

    public void setHexFlags(String hexFlags) {
        this.hexFlags = hexFlags;
    }

    public int getOneKMNeoFlag() {
        return oneKMNeoFlag;
    }

    public void setOneKMNeoFlag(int oneKMNeoFlag) {
        this.oneKMNeoFlag = oneKMNeoFlag;
    }

    public String getArcYears() {
        return arcYears;
    }

    public void setArcYears(String arcYears) {
        this.arcYears = arcYears;
    }

    public int getNumObs() {
        return numObs;
    }

    public void setNumObs(int numObs) {
        this.numObs = numObs;
    }

    public double getArcLength() {
        return arcLength;
    }

    public void setArcLength(double arcLength) {
        this.arcLength = arcLength;
    }

    public String getLastObs() {
        return lastObs;
    }

    public void setLastObs(String lastObs) {
        this.lastObs = lastObs;
    }
}
