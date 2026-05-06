package trycatch;
public class trycatchfinally202557201044 {
    public static void main(String[] args) {
        int bil = 10;
        String b[]={"a","i","a"};
        try{
            System.out.println(bil/0);
        }catch(ArithmeticException iq){
            System.out.println("Error Aritmatikanya");
            System.out.println(iq.getMessage());
        }

        try{
            System.out.println(b[3]);
        }catch (ArrayIndexOutOfBoundsException i){
            System.out.println("ERROR! panjang arraynya kelebihan, ngga segitu");
            System.out.println(i.getMessage());
        } catch (Exception q){
            System.out.println("Terdeteksi Error");
            System.out.println(q.getMessage());
        }
    }
}
