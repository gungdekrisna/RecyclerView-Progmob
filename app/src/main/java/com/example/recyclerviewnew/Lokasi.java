package com.example.recyclerviewnew;

public class Lokasi {
    private String lokasi;
    private String rentangHarga;
    private String jumlahKamar;

    public Lokasi(String lokasi, String rentangHarga, String jumlahKamar) {
        this.lokasi = lokasi;
        this.jumlahKamar = jumlahKamar;
        this.rentangHarga = rentangHarga;
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
}
