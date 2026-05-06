package percobaan3methodjop;
import javax.swing.JOptionPane;
public class percobaan3methodjop {
    
    //kita awali dengan method operasi dulu
    //persegi panjang dulu
    double lpp(double p, double l){//pakai variabel p dan l dari method main
        return (p*l); // bisa simpan langsung, ngga perlu variabel baru lagi pakai rumus pesregi panjang
    }
        //segitiga
    double lst(double a, double t){//menggunakan variabel a dan t dari method main
        return (a*t*0.5); //langsung aja simpan pakai rumus luas segitiga
    }
    //lingkaran
    double lbulat(double r){//meminjam r dari method main
        return (Math.PI*Math.pow(r, 2));//langsung simpan pakai rumus luas lingkaran
    }
    
         //kita perlu deklarasikan variable yang akan digunakan method operasi
        //ini mending main taruh bawah biar gampang ngaturnya, jadi rumus dulu baru output gitu
    public static void main(String[] args) {
        //untuk menyimpan nilai dari methodluar ke method main
        percobaan3methodjop fira = new percobaan3methodjop();

        //operasi untuk luas persegi panjang
        double p = Double.parseDouble(JOptionPane.showInputDialog(null, "Berapa Nilai Sisi Panjang?", "Menghitung Luas Persegi Panjang", (3)));
        double l = Double.parseDouble(JOptionPane.showInputDialog(null, "Berapa Nilai Sisi Lebar?", "Menghitung Luas Persegi Panjang", (3)));

        //operasi untuk luas segitiga
        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Berapa Nilai Alas Segitiga?", "Menghitung Luas Segitiga", (3)));
        double t = Double.parseDouble(JOptionPane.showInputDialog(null, "Berapa Nilai Tinggi Alas Segitiga?", "Menghitung Luas Segitiga", (3)));

        //operasi untuk luas lingkaran
        double r = Double.parseDouble(JOptionPane.showInputDialog(null, "Berapa Nilai Jari-jari?", "Menghitung Luas Lingkaran", (3)));

        //lanjut deklarasi varibel untuk menyimpan dan menampilkan hasil akhir
        double persegipanjang = fira.lpp(p, l);
        double segitiga = fira.lst(a, t);
        double lingkaran = fira.lbulat(r);
        
        //menampilkan hasil operasi
        JOptionPane.showMessageDialog(null,("LUAS PERSEGI PANJANG\t= "+persegipanjang+"\nLUAS SEGITIGA\t= "+segitiga+"\nLUAS LINGKARAN\t= "+lingkaran),"HASIL AKHIR",(1));
    }
}
