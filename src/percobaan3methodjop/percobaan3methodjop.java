package percobaan3methodjop;
public class percobaan3methodjop {
    //kita perlu deklarasikan variable yang akan digunakan method operasi
    public static void main(String[] args) {
        //ini deklarasi untuk variabel utama yang akan digunakan pada method operasi
        double p,l,a,t,r;
    }
    
    //kita awali dengan method operasi dulu
    //persegi panjang dulu
    double lpp(double p, double l){//pakai variabel p dan l dari method main
        return (p*l); // rumus pesregi panjang
    }
        //segitiga
    double lsegitiga(double a, double t){//menggunakan variabel a dan t dari method main
        return (a*t*0.5); //rumus segitiga
    }
    //lingkaran
    double lsegitiga(double r){//meminjam r dari method main
        return (Math.PI*Math.pow(r, 2));//rumus luas lingkaran
    }
}
