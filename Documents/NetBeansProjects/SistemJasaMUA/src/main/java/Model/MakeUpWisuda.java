/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author HP VICTUS
 */

public class MakeUpWisuda extends LayananMakeUp {
    private int jumlahOrangDirias;
    private boolean adaRetouchKit;

    public MakeUpWisuda(String namaKlien, String noHpKlien, String tanggalPelaksanaan, String makeUpLook, int jumlahOrangDirias, boolean adaRetouchKit) {
        super(namaKlien, noHpKlien, "Make Up Wisuda", tanggalPelaksanaan, makeUpLook, 250000);
        this.jumlahOrangDirias = jumlahOrangDirias;
        this.adaRetouchKit = adaRetouchKit;
    }

    public double hitungTotalBiaya() {
        double total = hargaAwal * jumlahOrangDirias;
        if (adaRetouchKit) {
            total += 50000;
        }
        return total;
    }

    public void tampilkanDetailPesanan() {
        super.tampilkanDetailPesanan(); 
        System.out.println("Jumlah Orang        : " + jumlahOrangDirias + " Orang");
        System.out.println("Retouch Kit         : " + (adaRetouchKit ? "Ya (+Rp50.000)" : "Tidak"));
        System.out.println("Total Biaya         : Rp " + (long) hitungTotalBiaya());
    }
}