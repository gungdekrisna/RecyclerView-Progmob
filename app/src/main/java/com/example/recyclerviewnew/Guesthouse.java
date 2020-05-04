package com.example.recyclerviewnew;

public class Guesthouse {
    private String nama;
    private String jumlahKamar;
    private String lokasi;
    private int icon;
    private String harga;
    private int hargaInt;
    private String kecamatan;
    private int jumlahKamarInt;

    public Guesthouse(String nama, String jumlahKamar, String lokasi, int icon, String harga, int hargaInt, String kecamatan, int jumlahKamarInt) {
        this.nama = nama;
        this.jumlahKamar = jumlahKamar;
        this.lokasi = lokasi;
        this.icon = icon;
        this.harga = harga;
        this.hargaInt = hargaInt;
        this.kecamatan = kecamatan;
        this.jumlahKamarInt = jumlahKamarInt;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJumlahKamar() {
        return jumlahKamar;
    }

    public void setJumlahKamar(String jumlahKamar) {
        this.jumlahKamar = jumlahKamar;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public int getHargaInt() {
        return hargaInt;
    }

    public void setHargaInt(int hargaInt) {
        this.hargaInt = hargaInt;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public int getJumlahKamarInt() {
        return jumlahKamarInt;
    }

    public void setJumlahKamarInt(int jumlahKamarInt) {
        this.jumlahKamarInt = jumlahKamarInt;
    }
}
