package percobaan3methodjop;
public class percobaan3methodjop {
    //kita perlu deklarasikan variable yang akan digunakan method operasi
    public static void main(String[] args) {
        //ini deklarasi untuk variabel utama yang akan digunakan pada method operasi
        double p,l,a,t,r;
    }
    
    //kita awali dengan method operasi dulu
    //persegi panjang dulu
    double lpp(double p, double l){
        return (p*l);
    }
        //segitiga
    double lsegitiga(double a, double t){
        return (0.5*a*t);
    }
    //lingkaran
    double lsegitiga(double r){
        return (Math.PI*Math.pow(r, 2));
    }
}
