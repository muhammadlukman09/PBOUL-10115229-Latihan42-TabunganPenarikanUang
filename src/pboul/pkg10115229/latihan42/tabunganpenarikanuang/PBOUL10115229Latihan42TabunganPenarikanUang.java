/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan42.tabunganpenarikanuang;

import java.util.Scanner;

/**
 *
 * @author Lukman
 */
public class PBOUL10115229Latihan42TabunganPenarikanUang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("==== Program Penarikan Uang ====");
       System.out.print("Masukkan Saldo Awal \t\t: ");
       Scanner scs = new Scanner(System.in);
       int saldoAwal = scs.nextInt();
       
       Tabungan tab = new Tabungan(saldoAwal);
       Scanner sca = new Scanner(System.in);
       System.out.print("Jumlah uang yang diambil \t: ");
       int ambil = sca.nextInt();
       
       if(ambil > saldoAwal){
           System.out.println("\nOpppss, SALDO ANDA TIDAK CUKUP !!");
           System.out.println("Saldo anda sekarang \t\t: "+tab.ambilUang(0)+"\n");
       }else{
           System.out.println("\nSUKSES !!");
           System.out.println("Saldo anda sekarang \t\t: "+tab.ambilUang(ambil)+"\n");
       }
    }
    }
    

