public class Conditions {
    public static void main(String[] args) {
        //If-else statements
        int age = 18;
        if (age >= 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You cannot vote");
        }//if-else-if statements
        int day = 2;
        if(day==1) {
            System.out.println("Go to play online games");
        } else if (day==2) {
            System.out.println("Go to play football");
        } else if (day==3) {
            System.out.println("Go to play basketball");
        } else if (day==4) {
            System.out.println("Go to Dance class");
        } else if (day==5) {
            System.out.println("Go to coaching");
        } else if (day==6) {
            System.out.println("Do some coding");
        } else {
            System.out.println("Go to Home");
        }//Nested if-else statements
        int a=23;
        int b=20;
        int c=13;
        if(a>b) {
            System.out.println("a is bigger than b");
            if(a>c) {
                System.out.println("a is bigger than c");
                System.out.println("a is the largest: "+a);
            }else{
                System.out.println("c is bigger than a");
                System.out.println("c is the largest: "+c);
            }
        }else {
            System.out.println("b is bigger than a");
            if (b > c) {
                System.out.println("b is bigger than c");
                System.out.println("b is the largest: " + b);
            } else {
                System.out.println("c is bigger than b");
                System.out.println("c is the largest: " + c);
            }//Java Ternary Operator
        }
        int d = 23;
        int e = 29;
        int max = 0;
        max= d>e ? d:e;
        System.out.println("value of max is: "+max);
    }

}