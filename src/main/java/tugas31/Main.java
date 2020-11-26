/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas31;

/**
 *
 * @author
 * Aris Prabowo
 * 10119914 - IF10K
 */
public class Main {
    public static void main(String[] args) {
      String[] nim = {"10110269", "10110270", "10110271", "10110269"};
      String[] nama = {"Rizki Adam Kurniawan", "Indra Tiola", "Robi Tanzil Ganefi", "Muhammad Nur Awaludin"};
      Mahasiswa mahasiswaList[] = new Mahasiswa[nim.length];
      for(var i=0;i<mahasiswaList.length;i++){
          mahasiswaList[i] = new Mahasiswa();
          mahasiswaList[i].nim = nim[i];
          mahasiswaList[i].nama = nama[i];
          mahasiswaList[i].perkenalanDiri();
      }
    }
}
