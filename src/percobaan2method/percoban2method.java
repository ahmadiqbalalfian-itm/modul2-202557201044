package percobaan2method;
import java.util.Scanner;
public class percoban2method {

    public static void main(String[] args) {
        percoban2method alatiqbal = new percoban2method();
        System.out.println("MENGHITUNG VOLUME BANGUN RUANG BERBASIS LINGKARAN\n1. Tabung\n2. Kerucut\n3. Bola");
        
        Scanner firamasuk = new Scanner(System.in);
        
        System.out.print("Jari-jari Lingkarannya Berapa?\t: ");
        double r = firamasuk.nextDouble();
        
        System.out.print("Tinggi Bangun Ruangnya?\t : ");
        double t = firamasuk.nextDouble();
        
    }
    
    //kita masukkan rumus-rumus untuk setiap bangun ruang
    //lingkaran lebih dulu karena basisnya
    double l_bulat(double r) {//impor variabel dari method main
        double l = Math.pow(r, 2)/*pangkat*/*Math.PI/*phi*/;
        return l; //simpan luas
    }
    
    //selanjutnya kerucut
    double vkerucut(double r, double t){//ini mengimpor variabel yang diperlukan
        double l = l_bulat(r);
        double v = l*(t/3.0);//rumusnya biar agak pendek. 3 harus dikasih koma karena double
        return v;//simpan volume keurucut
    }
}