public class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 24;
        int b = 74;
        int c = a+b;
        System.out.println(c);
        int d = 46;
        int e = 24;
        int f = d-e;
        System.out.println(f);
        int g = 116;
        int h = 323;
        int i = g*h;
        System.out.println(i);
        int j = 2342;
        int k = 32;
        int l = j/k; //Not get the value in decimal, to get the value in decimal follow next step
        System.out.println(l);
        int m = 2342;
        int n = 32;
        double o = (double)m/n; //Use typecasting to get the values in decimal
        System.out.println(o);
        int p = 12;
        int q = 7;
        int r = p%q;
        System.out.println(r);
        //Assignment Operators
        int s = 7;
        int t = 4;
        s += t;
        System.out.println(s);
        int w = 10;
        int x = 6;
        w -= x;
        System.out.println(w);
        int y = 54;
        int z = 12;
        y *= z;
        System.out.println(y);
        int one = 24;
        int two = 2;
        one /= two;
        System.out.println(one);
        int three = 60;
        int four = 12;
        three %= four;
        System.out.println(three);
        //Relational Operators
        int firstNumber = 24;
        int secondNumber = 12;
        System.out.println(firstNumber == secondNumber);
        System.out.println(firstNumber != secondNumber);
        System.out.println(firstNumber > secondNumber);
        System.out.println(firstNumber < secondNumber);
        System.out.println(firstNumber >= secondNumber);
        System.out.println(firstNumber <= secondNumber);
        // Logical Operators
        boolean firstExpression = true;
        boolean secondExpression = false;
        System.out.println(firstExpression && secondExpression);
        System.out.println(firstExpression || secondExpression);
        System.out.println(!firstExpression);
        System.out.println(!secondExpression);
        //Increment and Decrement Operators
        int first = 24;
        first++;
        System.out.println(first);
        int second = 24;
        second--;
        System.out.println(second);

    }
}