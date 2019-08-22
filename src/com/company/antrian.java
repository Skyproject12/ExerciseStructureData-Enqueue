package com.company;

public class antrian <L> {
    String nama;
    String pesanan;
    int jumlah;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPesanan() {
        return pesanan;
    }

    public void setPesanan(String pesanan) {
        this.pesanan = pesanan;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public String toString() {
        return "nama\t:"+ nama +"\n"+
                "pesanan\t:" + pesanan +"\n"+
                "jumlah\t:" + jumlah
                ;
    }
}
