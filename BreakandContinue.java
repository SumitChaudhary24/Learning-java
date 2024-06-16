public class BreakandContinue {
    public static void main(String[] args) {
        //Break
        for (int i = 0; i <=10; i++) {
            System.out.println(i);
            if(i>=5)break;
        }//Continue
        for (int k = 0; k <=10 ; k++) {
            if(k==4) continue;
            System.out.println("Gave toffee to: "+k);

        }



    }
}