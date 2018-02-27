public class DaysofWeek {
    public static void main(String [] args){
        int day=1;
        String dayname=" ";
        String working="";
        switch (day){
            case 1: dayname="Sunday";
                    working="Sleep in";
                break;
            case 2: dayname="Monday";
                    working="Go to work";
                break;
            case 3: dayname="Tuesday";
                working="Go to work";
                break;
            case 4: dayname="Wednesday";
                working="Go to work";
                break;
            case 5: dayname="Thursday";
                working="Go to work";
                break;
            case 6: dayname="Friday";
                working="Go to work";
                break;
            case 7: dayname="Saturday";
                    working="Sleep in";
                break;


        }
        System.out.println("Its "+dayname+ " " +working);
    }
}
