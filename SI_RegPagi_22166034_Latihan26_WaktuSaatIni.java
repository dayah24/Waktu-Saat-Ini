/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166034_latihan26_waktusaatini;
import java.util.*;
import java.text.*;
/**
 *
 * @author LENOVO
 * Nama     : Nur Hidayah
 * Kelas    : PBO 026
 * NIM      : 22166034
 * Deskripsi Program : Waktu Saat Ini
 */
public class SI_RegPagi_22166034_Latihan26_WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date HariSekarang = new Date( );
        SimpleDateFormat ft = 
        new SimpleDateFormat ("E, dd.MM.yyyy hh:mm:ss a zzz");

      System.out.println("Hari ini adalah hari: " + ft.format(HariSekarang));
    }
}
    