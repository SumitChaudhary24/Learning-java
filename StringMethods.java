public class StringMethods {
    public static void main(String[] args) {
        String name = "sUmiT";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String newName = "    Sumit    ";
        System.out.println(newName.trim());

        System.out.println("Basketball".startsWith("Basket"));
        System.out.println("Basketball".endsWith("ball"));

        System.out.println("29".equals("29"));
        System.out.println("29".equals("24234"));
        System.out.println("23234".equalsIgnoreCase("23534"));

        System.out.println("Basketball".charAt(5));
        System.out.println("Basketball".charAt(0));

        int age = 23;
        String stringAge = String.valueOf(age);
        System.out.println(age);
        System.out.println(stringAge);

        String sentence = "I love java,java is a good programming language";
        String newSentence = sentence.replace("java","Python");
        System.out.println(sentence);
        System.out.println(newSentence);

        System.out.println(sentence.contains("java"));
        System.out.println(newSentence.contains("Python"));

        String substring = sentence.substring(2,4);
        System.out.println(substring);
        String substring2 = newSentence.substring(4,7);
        System.out.println(substring2);

        String words[] = sentence.split(" ");
        for(String word:words) {
            System.out.println(word);

            String fruit = "Apple";
            char letters[] = fruit.toCharArray();

            for(char letter:letters){
                System.out.println(letter);

                }
            String animal = "   ";
            if(animal.isEmpty()){
                System.out.println("It is empty");
            }else if(animal.isBlank()){
                System.out.println("It is Blank");
            }
        }


    }
}
