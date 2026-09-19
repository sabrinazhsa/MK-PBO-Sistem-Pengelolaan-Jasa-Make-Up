/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author HP VICTUS
 */

public class LayananMakeUp {
    protected String namaKlien;
    protected String noHPKlien;
    protected String jenisLayanan;
    protected String makeupLook;
    protected String tanggalPemesanan;
    protected double hargaAwal;

    public LayananMakeUp(String namaKlien, String noHPKlien, String jenisLayanan, String tanggalPemesanan, String makeupLook, double hargaAwal) {
        this.namaKlien = namaKlien;
        this.noHPKlien = noHPKlien;
        this.jenisLayanan = jenisLayanan;
        this.tanggalPemesanan = tanggalPemesanan;
        this.makeupLook = makeupLook;
        this.hargaAwal = hargaAwal;
    }

    public double hitungTotalBiaya() {
        return hargaAwal;
    }

    public void tampilkanDetailPesanan() {
        System.out.println("Nama Klien         : " + namaKlien);
        System.out.println("Nomor HP Klien     : " + noHPKlien);
        System.out.println("Jenis Layanan      : " + jenisLayanan);
        System.out.println("Tampilan Make Up   : " + makeupLook);
        System.out.println("Tanggal Pengerjaan : " + tanggalPemesanan);
    }
}