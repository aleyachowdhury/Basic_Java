public class practice_obj {
    public static void main (String [] args){
        //creating object
        Employee e1 = new Employee();
        Employee e2= new Employee();
        //initializing object
        e1.id = 3030;
        e2.id=3031;
        e1.name= "John";
        e2.name ="Conney";

        System.out.println(e1.id + "   "+ e1.name);
        System.out.println(e2.id + "   "+ e2.name);




    }


    static class Employee{
        int id;
        String name;
    }
}
