public class sum_num {

    public static void main(String[] args) {
        int a=1;
        int total=0;

        do{
            total = total+a  ;
            a++;
            if (a> 100) {
                System.out.println(total);
            }


        }

        while(a<=100);



    }

}
