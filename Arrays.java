public class Array {
    public static void main(String[] args) {

//        int age[]; //Declaration
//        age= new int[5];  //allocation
        //        OR
        int age[]= new int[5];

        age[0]=21;
        age[1]=18;
        age[2]=16;
        age[3]=19;
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age[3]);
        System.out.println(age[4]); // age 4 is stored default as 0

        System.out.println(age.length);

        int marks[]= {99,77,86,99};

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);

        String names[]= {"Ram","Harish","Shyam","Rohit"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Student name is: "+names[i]);

            //For-each loop
            for(String name:names) {
                System.out.println("This is: "+name);


                }

            }

        }

}