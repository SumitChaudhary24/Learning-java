public class Methods {
    public static void main(String[] args) {
//      greet();
//        System.out.println(1);
//        System.out.println(2);
        average(4,6,false);
    }                                 //Calling a method
    static void greet() {
        System.out.println(3);
        System.out.println("Hello World");
        System.out.println(4);
    }

    public static void average(int a, int b,boolean shouldAverage) {
        int avg = (a+b)/2;
        System.out.println("The Average is: "+avg);

    }
}