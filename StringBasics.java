public class StringBasics {
    public static void main(String[] args) {
        String name = "Sumit";
        String sameName = "Sumit";
        String newName = new String("Sumit");

        System.out.println(name);
        System.out.println(newName);

        System.out.println("Sumit Chaudhary");

//        if(name == sameName){
//            System.out.println("Both are same");
//        }else{
//            System.out.println("They are not same");
//        }
//        if(name == newName){
//            System.out.println("Both are same");
//        }else{
//            System.out.println("They are not same");
//        }
        if(name.equals(newName)){
            System.out.println("Both have equal values");
        }else{
            System.out.println("Both are not equal");
        }
    }
}