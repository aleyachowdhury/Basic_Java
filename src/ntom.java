import java.util.Scanner;

public class ntom {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a start number");
        int start=s.nextInt();
        System.out.println("Enter an end number");
        int end= s.nextInt();
        for(int i=start; i<=end;i++ ){
            System.out.println(i);
        }

    }
}
