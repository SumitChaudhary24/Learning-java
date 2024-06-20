import java.sql.SQLOutput;

public class Mathclass {
    public static void main(String[] args) {
        int a = 23;
        int b = 43;
        System.out.println(Math.min(a,b));
        System.out.println(Math.max(a,b));
        System.out.println(Math.sqrt(144));
        System.out.println(Math.pow(2,100));
        System.out.println(Math.abs(-29));
        System.out.println(Math.floor(4.6));
        System.out.println(Math.ceil(4.6));
        System.out.println(Math.round(6.4));
        System.out.println(getrandom(10,20));
    }
    public static int getrandom(int a, int b){
        return(int) (Math.random()*(b-a+1)+a);
    }
}