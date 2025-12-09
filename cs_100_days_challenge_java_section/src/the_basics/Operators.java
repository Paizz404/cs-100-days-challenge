package the_basics;

public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);
        int multiCalculation = 3 * 4 -8 / 2 + 15 % 4;
        int multiCalculation2 = (3 * 4 -8 )/ 2 + 15 % 4;

        System.out.println(multiCalculation);
        System.out.println(multiCalculation2);
        System.out.println("*********");

        int c = 5;
        boolean comResult1 = a < b;
        boolean comResult2 = a > b;
        boolean comResult3 = a <= b;
        boolean comResult4 = c >= b;
        boolean comResult5 = c == b;
        boolean comResult6 = c != b;

        System.out.println(comResult1);
        System.out.println(comResult2);
        System.out.println(comResult3);
        System.out.println(comResult5);
        System.out.println(comResult5);
        System.out.println(comResult6);

        System.out.println("**************");
        boolean logicalResult1 = a > b && a < c;
        boolean logicalResult2 = a > b || a < c;

        System.out.println(logicalResult1);
        System.out.println(logicalResult2);

        System.out.println("**********");

        boolean preResult1 = a + b > b +c && b * c < a / b;
        var preResult2 = a + b > b +c || b * c < a / b;

        System.out.println("Pre Result 1 is "+preResult1);
        System.out.println("Pre Result 2 is "+preResult2);

    }


}
/*Operators
   Operator Precedence

    Arithmetic Operators => * / % + -
    Relational Operators (or) Comparison => < > <= >= == !=
    Logical Operator => && ||
    Assignment => =
 */
