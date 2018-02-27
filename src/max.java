public class max {
    public static void main(String[] args) {
        //int i = 0;

        int[] array = {1, 2, 30, 4, 6};
        int max = 0;
        //String [] arrays = {"a", "b", "c"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+" ");

            //int j=array[i];
            if (array[i] > max) {
                max = array[i];
            }
        }
      //
        System.out.println("max :"+max);

    }
}