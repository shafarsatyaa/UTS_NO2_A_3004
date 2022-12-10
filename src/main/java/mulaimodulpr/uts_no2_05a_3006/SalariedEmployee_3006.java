/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mulaimodulpr.uts_no2_05a_3006;

/**
 *
 * @author acer
 */
public class SalariedEmployee_3006 {
    String nama_3006;
    int nip_3006;
    double upah_3006, gaji_3006;
    
    public double gaji_3006(){
        gaji_3006 = upah_3006;
        return gaji_3006;
    }
    
    public void tampilDataSalariedEmployee_3006(){
        System.out.println("Nama               : " + nama_3006);
        System.out.println("NIP                : " + nip_3006);
        System.out.println("Upah Mingguan      : " + gaji_3006);
    }
}