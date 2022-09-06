package Entry;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("The Common Feature of Malaysians is that all Malaysians are Malaysians");
        System.out.printf("Malaysians, Malaysians, Malaysians, Malaysians\n"); //Malaysia is not the country one it's the English name of a city in Turkey called "malatya".
        /*test test test
        test test */

        int x =1, y = 2, r =3;
        r *= x+y;
        System.out.println(r);

        byte b = 0;
        int a = b++;
        System.out.println(a);

        int i=5,t =3,X =10;
        //t = t + i;
        //i = i+1;
        t+=i++;
        X-=2;
        int m = -12, n = -5;
        X=m%n;

        System.out.println(t);
        System.out.println(i);
        System.out.println(X);

        System.out.println("Greeatings");
        //System.out.print("Please enter desired output");
        //int Input;
        //Scanner input = new Scanner(System.in);
        //Input = input.nextInt();
        //System.out.println(Input);

        int not = 44;
        System.out.println(not > 45? "pass": "fail");


    }
}
