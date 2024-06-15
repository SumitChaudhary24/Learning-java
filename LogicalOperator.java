public class LogicalOperator {
    public static void main(String[] args) {
        int time = 21;
        if(time >=10 && time<=20){
            System.out.println("Office is Open");
        }else{
            System.out.println("Office is Closed");
        }
        if(time==12 || time==18){
            System.out.println("It is Lunch time");
        }else{
            System.out.println("It is not Lunch time");
        }

    }
}
