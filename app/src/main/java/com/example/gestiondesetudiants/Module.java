package com.example.gestiondesetudiants;

public class Module {

    private int code;
    private String intitulé;
    private int coef;
    private float td;
    private float tp;
    private float emd;
    private float moy;
    private String id_etud;

    public Module() {
    }

    public Module(String intitulé, int coef, float td, float tp, float emd, float moy) {
        this.intitulé = intitulé;
        this.coef = coef;
        this.td = td;
        this.tp = tp;
        this.emd = emd;
        this.moy = moy;
    }

    public Module(int code, String intitulé, int coef, float td, float tp, float emd, float moy, String id_etud) {
        this.code = code;
        this.intitulé = intitulé;
        this.coef = coef;
        this.td = td;
        this.tp = tp;
        this.emd = emd;
        this.moy = moy;
        this.id_etud=id_etud;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getIntitulé() {
        return intitulé;
    }

    public void setIntitulé(String intitulé) {
        this.intitulé = intitulé;
    }

    public int getCoef() {
        return coef;
    }

    public void setCoef(int coef) {
        this.coef = coef;
    }

    public float getTd() {
        return td;
    }

    public void setTd(float td) {
        this.td = td;
    }

    public float getTp() {
        return tp;
    }

    public void setTp(float tp) {
        this.tp = tp;
    }

    public float getEmd() {
        return emd;
    }

    public void setEmd(float emd) {
        this.emd = emd;
    }

    public float getMoy() {
        return moy;
    }

    public void setMoy(float moy) {
        this.moy = moy;
    }

    public String getId_etud() {
        return id_etud;
    }

    public void setId_etud(String id_etud) {
        this.id_etud = id_etud;
    }

    public String toStringtd() {
        return  td+"";
    }

    public String toStringtp() { return tp+""; }

    public String toStringmoy() { return moy+""; }

    public String toStringcoef() { return coef+""; }

    public String toStringexam() { return emd+""; }
}
