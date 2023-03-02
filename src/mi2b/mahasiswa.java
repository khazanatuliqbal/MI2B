/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi2b;

/**
 *
 * @author HP
 */
public class mahasiswa {
    String nama,nobp,kelas,prodi,jurusan;
    
    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa();
        mhs.nama = "Iqbal";
        mhs.nobp = "2101092010";
        mhs.kelas = "B";
        mhs.prodi = "MI";
        mhs.jurusan = "Teknologi Informasi";
        
        System.out.println("Nama :" +mhs.nama+ "\n"
                 + "No BP :" +mhs.nobp+"\n"
                       + "Jurusan :"+mhs.jurusan+"\n"
                            + "Prodi : "+mhs.prodi+"\n"
                                + "Kelas "+mhs.kelas+"\n");
        
        System.out.println("");
        mahasiswa mhs2 = new mahasiswa();
        mhs2.nama = "Iqbal";
        mhs2.nobp = "2101092010";
        mhs2.kelas = "B";
        mhs2.prodi = "MI";
        mhs2.jurusan = "Teknologi Informasi";
        
        System.out.println("Nama :" +mhs2.nama+ "\n"
                 + "No BP :" +mhs2.nobp+"\n"
                       + "Jurusan :"+mhs2.jurusan+"\n"
                            + "Prodi : "+mhs2.prodi+"\n"
                                + "Kelas "+mhs2.kelas+"\n");
    }
    
}
