package pkg6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Faktorisasi Prima");
        long a;
        boolean k = true;
        long[] faktor = new long[99999999];
        
        while(k){
            System.out.print("a = ");
            
            a = input.nextLong();
            long f = 2;
        
            System.out.print("Faktor Prima Dari a = {");
            
            int z = 0;
        
            while(z == 0){
                if((a % f) == 0){
                    System.out.print(f);
                    faktor[z] = f;
                    a /= f;
                    z++;
                    
                }else{
                    f++;
                }
            }
            
            while(a != 1){
                if((a % f) == 0){
                    System.out.print(", " + f);
                    faktor[z] = f;
                    a /= f;
                    z++;
                }else{
                    f++;
                }
            }
            System.out.println("}");
            System.out.println(faktor[0]);
        }
    }
}