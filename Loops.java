import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //For loops
        for(int i = 0; i<=10;i++){
            System.out.println(i);
        }
        //Making table using For loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
        // Sum of any number n
        Scanner tc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int k = tc.nextInt();
        int sum = 0;
        for(int p = 1; p<=k; p++){
            sum = sum + p;
        }
        System.out.println("Sum is: "+sum);
        //While loops
        Scanner oc = new Scanner(System.in);
        boolean haslearnt = false;
        while(!haslearnt){
            System.out.println("Go to school and try to learn");
            System.out.println("Have you learn: ");
            haslearnt = oc.nextBoolean();
        }//Do-while loop
        int s = 8;
        do{
            System.out.println(s);
            s++;
        }while (s<=5);
        System.out.println("Out of the loop");
        //Nested loops
        for (int count = 0; count < 10; count++) {
            for (int m = 1; m <6 ; m++) {
                System.out.print(m+" ");
                
            }
            System.out.println("printed: "+count);
        }
    }
}
