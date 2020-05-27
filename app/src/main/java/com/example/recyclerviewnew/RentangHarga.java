package com.example.recyclerviewnew;

public class RentangHarga {
    private String rentangHarga;
    private int jumlahKamar;

    public RentangHarga(String rentangHarga, int jumlahKamar) {
        this.rentangHarga = rentangHarga;
        this.jumlahKamar = jumlahKamar;
    }

    public String getRentangHarga(){
        return rentangHarga;
    }

    public void setRentangHarga(String rentangHarga) {
        this.rentangHarga = rentangHarga;
    }

    public int getJumlahKamar(){
        return jumlahKamar;
    }

    public void setJumlahKamar(int jumlahKamar) {
        this.jumlahKamar = jumlahKamar;
    }
}
