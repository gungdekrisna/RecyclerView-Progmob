package com.example.recyclerviewnew;

public class Lokasi {
    private String lokasi;
    private String rentangHarga;
    private String jumlahKamar;
    private int img_lokasi;

    public Lokasi(String lokasi, String rentangHarga, String jumlahKamar, int img_lokasi) {
        this.lokasi = lokasi;
        this.jumlahKamar = jumlahKamar;
        this.rentangHarga = rentangHarga;
        this.img_lokasi = img_lokasi;
    }

    public String getLokasi(){
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getRentangHarga(){
        return rentangHarga;
    }

    public void setRentangHarga(String rentangHarga) {
        this.rentangHarga = rentangHarga;
    }

    public String getJumlahKamar(){
        return jumlahKamar;
    }

    public void setJumlahKamar(String jumlahKamar) {
        this.jumlahKamar = jumlahKamar;
    }

    public int getImg_lokasi() {
        return img_lokasi;
    }

    public void setImg_lokasi(int img_lokasi) {
        this.img_lokasi = img_lokasi;
    }
}
