/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mulaimodulpr.uts_no2_05a_3006;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author acer
 */
public class UTS_NO2_05A_3006 {
    public static void main(String[] args) {
        SalariedEmployee_3006 Se = new SalariedEmployee_3006();
        CommissionEmployee_3006 Ce = new CommissionEmployee_3006();
        ProjectPlanner_3006 Pp = new ProjectPlanner_3006();
        System.out.println();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("`````` Perusahaan Parudin ``````");
            System.out.println("------------- Data Pegawai -----------");
        
            Se.nama_3006 = "Siparudin";
            Se.nip_3006 = 21103006;
            Se.gaji_3006 = 9050000;
            Ce.penjualan_3006 = 70;
           
            Ce.nama_3006 = "Ariyojamal";
            Ce.nip_3006 = 21103888;
            Ce.gaji_3006 = 3000000;
            Ce.komisi_3006 = 21120000;
            Ce.penjualan_3006 = 155;
          
            Pp.nama_3006 = "Gondrong";
            Pp.nip_3006 = 211030999;
            Pp.gaji_3006 = 2800000;
            Pp.komisi_3006 = 5050000;
            Pp.proyek_3006 = 150;
            
            Se.tampilDataSalariedEmployee_3006();
            System.out.println("");
            Ce.tampilDataCommissionEmployee_3006();
            System.out.println("");
            Pp.tampilDataProjectPlanner_3006();
            System.out.println("");
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}