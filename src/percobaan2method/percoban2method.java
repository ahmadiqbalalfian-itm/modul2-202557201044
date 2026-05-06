package percobaan2method;
import java.util.Scanner;
public class percoban2method {
    //kita masukkan rumus-rumus untuk setiap bangun ruang
    //lingkaran lebih dulu karena basisnya
    double l_bulat(double d) {//impor variabel dari method main
        double l = Math.pow((d/2), 2)/*pangkat*/ * Math.PI/*phi*/;
        return l; //simpan luas untuk digunakan bangun ruang lain
    }
    //selanjutnya kerucut
    double vkerucut(double d, double t) {//ini mengimpor variabel yang diperlukan
        double l = l_bulat(d);//menghitung luas dari nilai yang disimpan method l_bulat
        double v = l * (t / 3.0);//rumusnya biar agak pendek. 3 harus dikasih koma karena double
        return v;//simpan volume keurucut
    }
    //kemudian tabung
    double vtabung(double d, double t) {//impor variabel jari-jari dan tinggi
        double l = l_bulat(d); //luas dari l_bulat
        double v = l * t;//rumusnya biar agak pendek. 3 harus dikasih koma karena double
        return v;//simpan volume keurucut
    }
    //lanjut bola
    double v_bola(double d) {
        double v = (4.0 / 3.0)/*rumus dari volume bola*/ * Math.pow((d/2), 3)/*pangkat*/ * Math.PI/*phi (lebih detail dari 3,14 dan 22/7)*/;
        return v;//simpan volem bola
    }
    public static void main(String[] args) {//method main untuk program yang memerlukan output
        percoban2method iqbal = new percoban2method();
        /*judulnya*/
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><>\n MENGHITUNG VOLUME BANGUN RUANG BERBASIS LINGKARAN/BULAT\n1. Tabung\n2. Kerucut\n3. Bola\n<><><><><><><><><><><><><><><><><><><><><><><><><><><><>\n\n");
        /*import scanner*/
        Scanner firamasuk = new Scanner(System.in);
        //deklarasi inti, bahan utama dari bangun ruang basis lingkaran
        System.out.print("\t-------------------------\nDiameter Lingkarannya Berapa?\t: ");
        double d = firamasuk.nextDouble();
        System.out.print("Tinggi Bangun Ruangnya?\t\t: ");
        double t = firamasuk.nextDouble();

        //kita perlu deklarasikan variabel baru, kemudian diberikan nilai dari method sebelumnya
        double bulat = iqbal.l_bulat(d); //untuk menampilkan operasi bangun bulat, menampilkan nilai luas lingkaran yang disimpan di methodl_bulat sebelumnya
        double bola = iqbal.v_bola(d); //meunjukkan hasil perhitungan volume bola dari return v_bola
        double tabung = iqbal.vtabung(d, t); //mengeluarkan nilai volem tabung dari method v_tabung
        double kerucut = iqbal.vkerucut(d, t); //tampilkan kerucut, dengan nilai volume kerucut dari method v_kerucut

        //menampilkan hasil operasi dari method-method sebelumnya menggunakan variabel baru yang dibuat
        System.out.println("\t-------------------------\n\n\n>>>>>>>>VOLUME BANGUN RUANG<<<<<<<<<\n");
        // Output dirapikan dengan 2 angka di belakang koma
        System.out.println("VOLUME BOLA \t\t= " + String.format("%.2f", bola));
        System.out.println("VOLUME TABUNG \t\t= " + String.format("%.2f", tabung));
        System.out.println("VOLUME KERUCUT \t\t= " + String.format("%.2f", kerucut));
        System.out.println("\n>>>>>>>>> BONUS <<<<<<<<<");
        System.out.println("LUAS LINGKARAN/ALAS\t= " + String.format("%.2f", bulat));
        
        firamasuk.close();//menutup scanner
    }
}