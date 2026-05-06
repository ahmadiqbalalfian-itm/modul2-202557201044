package percobaan2method;
import java.util.Scanner;
public class percoban2method {
    
    //kita masukkan rumus-rumus untuk setiap bangun ruang
    //lingkaran lebih dulu karena basisnya
    double l_bulat(double r) {//impor variabel dari method main
        double l = Math.pow(r, 2)/*pangkat*/*Math.PI/*phi*/;
        return l; //simpan luas untuk digunakan bangun ruang lain
    }
    
    //selanjutnya kerucut
    double vkerucut(double r, double t){//ini mengimpor variabel yang diperlukan
        double l = l_bulat(r);//menghitung luas dari nilai yang disimpan method l_bulat
        double v = l*(t/3.0);//rumusnya biar agak pendek. 3 harus dikasih koma karena double
        return v;//simpan volume keurucut
    }
    
    //kemudian tabung
    double vtabung(double r, double t){//impor variabel jari-jari dan tinggi
        double l = l_bulat(r); //luas dari l_bulat
        double v = l*t;//rumusnya biar agak pendek. 3 harus dikasih koma karena double
        return v;//simpan volume keurucut
    }
    
    //lanjut bola
    double v_bola (double r){
        double v = (4.0/3.0)/*rumus dari volume bola*/*Math.pow(r, 3)/*pangkat*/*Math.PI/*phi (lebih detail dari 3,14 dan 22/7)*/;
        return v;//simpan volem bola
    }
    
    public static void main(String[] args) {//method main untuk program yang memerlukan output
        percoban2method iqbal = new percoban2method();
        /*judulnya*/System.out.println("MENGHITUNG VOLUME BANGUN RUANG BERBASIS LINGKARAN\n1. Tabung\n2. Kerucut\n3. Bola");
        /*import scanner*/Scanner firamasuk = new Scanner(System.in);
        //deklarasi inti, bahan utama dari bangun ruang basis lingkaran
        System.out.print("Jari-jari Lingkarannya Berapa?\t: ");
        double r = firamasuk.nextDouble();
        System.out.print("Tinggi Bangun Ruangnya?\t : ");
        double t = firamasuk.nextDouble();

        //kita perlu deklarasikan variabel baru, kemudian diberikan nilai dari method sebelumnya
        double bulat = iqbal.l_bulat(r); //untuk menampilkan operasi bangun bulat, menampilkan nilai luas lingkaran yang disimpan di methodl_bulat sebelumnya
        double bola = iqbal.v_bola(r); //meunjukkan hasil perhitungan volume bola dari return v_bola
        double tabung = iqbal.vtabung(r, t); //mengeluarkan nilai volem tabung dari method v_tabung
        double kerucut = iqbal.vkerucut(r, t); //tampilkan kerucut, dengan nilai volume kerucut dari method v_kerucut

        System.out.println(">>>>>>>>VOLUME BANGUN RUANG<<<<<<<<<");
        System.out.println("VOLUME BOLA = " +bola);
        
        
        System.out.println("Bonus luas lingkaran= " +bulat);
        
        
    }
}