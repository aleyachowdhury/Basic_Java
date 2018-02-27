import java.util.Scanner;

public class cToF {
    public static void main(String [] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Temperature in C?");
        double tempC =s.nextInt();
        double tempF=0;
        tempF = (tempC*1.8)+32;
        System.out.println(tempF);


    }
}
