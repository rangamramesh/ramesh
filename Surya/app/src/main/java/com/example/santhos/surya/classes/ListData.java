package com.example.santhos.surya.classes;

/**
 * Created by santhos on 20/9/17.
 */

public class ListData {
    private  String head;
    private  String fare;
    private String matter;
    private  String rsfare;

    public ListData(String head, String fare, String matter, String rsfare) {
        this.head = head;
        this.fare = fare;
        this.matter = matter;
        this.rsfare = rsfare;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }

    public String getRsfare() {
        return rsfare;
    }

    public void setRsfare(String rsfare) {
        this.rsfare = rsfare;
    }
}
