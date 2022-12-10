/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mulaimodulpr.uts_no2_05a_3006;

/**
 *
 * @author acer
 */
public class ProjectPlanner_3006 extends SalariedEmployee_3006{
    String nama_3006;
    int nip_3006, proyek_3006;
    double gaji_3006, komisi_3006, pajak_3006, gajiPokok_3006;
    
    public double gaji_project() {
        pajak_3006 = (0.05 * gajiPokok_3006);
        gaji_3006 = gajiPokok_3006 + (komisi_3006 * proyek_3006) - pajak_3006;
        return gaji_3006;
    } 
    
    public void tampilDataProjectPlanner_3006(){
        System.out.println("Nama               : " + nama_3006);
        System.out.println("NIP                : " + nip_3006);
        System.out.println("Gaji Pokok         : " + gaji_3006);
        System.out.println("Komisi             : " + komisi_3006);
        System.out.println("Total Hasil Proyek : " + proyek_3006);
     }
}