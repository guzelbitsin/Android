package com.example.myapplication.Model;

public class Yemek {

    private int yemekId;
    private String yemekAdi;
    private String yemekAciklama;
    private String yemekTur;
    private String yemekPisirmeSuresi;
    private String yemekHazirlamaSuresi;
    private String yemekResim;
    private String yemekMalzemeler;

    public Yemek(int yemekId, String yemekAdi, String yemekAciklama, String yemekTur, String yemekPisirmeSuresi, String yemekHazirlamaSuresi, String yemekKisiSayisi, String yemekResim, String yemekMalzemeler) {
    }

    public Yemek(int yemekId, String yemekAdi, String yemekAciklama, String yemekTur, String yemekPisirmeSuresi, String yemekHazirlamaSuresi, String yemekResim, String yemekMalzemeler) {
        this.yemekId = yemekId;
        this.yemekAdi = yemekAdi;
        this.yemekAciklama = yemekAciklama;
        this.yemekTur = yemekTur;
        this.yemekPisirmeSuresi = yemekPisirmeSuresi;
        this.yemekHazirlamaSuresi = yemekHazirlamaSuresi;
        this.yemekResim = yemekResim;
        this.yemekMalzemeler = yemekMalzemeler;
    }

    public int getYemekId() {
        return yemekId;
    }

    public void setYemekId(int yemekId) {
        this.yemekId = yemekId;
    }

    public String getYemekAdi() {
        return yemekAdi;
    }

    public void setYemekAdi(String yemekAdi) {
        this.yemekAdi = yemekAdi;
    }

    public String getYemekAciklama() {
        return yemekAciklama;
    }

    public void setYemekAciklama(String yemekAciklama) {
        this.yemekAciklama = yemekAciklama;
    }

    public String getYemekTur() {
        return yemekTur;
    }

    public void setYemekTur(String yemekTur) {
        this.yemekTur = yemekTur;
    }

    public String getYemekPisirmeSuresi() {
        return yemekPisirmeSuresi;
    }

    public void setYemekPisirmeSuresi(String yemekPisirmeSuresi) {
        this.yemekPisirmeSuresi = yemekPisirmeSuresi;
    }

    public String getYemekHazirlamaSuresi() {
        return yemekHazirlamaSuresi;
    }

    public void setYemekHazirlamaSuresi(String yemekHazirlamaSuresi) {
        this.yemekHazirlamaSuresi = yemekHazirlamaSuresi;
    }

    public String getYemekResim() {
        return yemekResim;
    }

    public void setYemekResim(String yemekResim) {
        this.yemekResim = yemekResim;
    }

    public String getYemekMalzemeler() {
        return yemekMalzemeler;
    }

    public void setYemekMalzemeler(String yemekMalzemeler) {
        this.yemekMalzemeler = yemekMalzemeler;
    }
}
