/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author HP VICTUS
 */

public class MakeUpPengantin extends LayananMakeUp {
    private int jumlahSesiRias;
    private boolean includeSanggul;

    public MakeUpPengantin(String namaKlien, String noHpKlien, String tanggalPelaksanaan, String makeUpLook, int jumlahSesiRias, boolean includeSanggul) {
        super(namaKlien, noHpKlien, "Make Up Pengantin", tanggalPelaksanaan, makeUpLook, 1000000);
        this.jumlahSesiRias = jumlahSesiRias;
        this.includeSanggul = includeSanggul;
    }

    public double hitungTotalBiaya() {
        double total = hargaAwal * jumlahSesiRias;
        if (includeSanggul) {
            total += 200000;
        }
        return total;
    }

    public void tampilkanDetailPesanan() {
        super.tampilkanDetailPesanan();
        System.out.println("Jumlah Sesi Rias    : " + jumlahSesiRias + " Sesi");
        System.out.println("Include Sanggul     : " + (includeSanggul ? "Ya (+Rp200.000)" : "Tidak"));
        System.out.println("Total Biaya         : Rp " + (long) hitungTotalBiaya());
    }
}