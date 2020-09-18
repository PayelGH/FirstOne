package pragraPackage;
//IMPORTANT:TO GET CORRECT ANSWERS NEED TO DISABLE CODES NOT REQUIRED
public class OperatorsInJava {
    public static void main  (String[]args) {
        //Arithmetic Operators: +, -, *, /, %
        int num1 = 10;
        int num2 = 20;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

        //Assignments operators in java are: =, +=, -=, *=, /=, %=, always from right to left
        int num3= 5;
        int num4= 15;
        num3=num4;
        System.out.println(num3);
        num3+=num4;
        System.out.println(num3);
        num3-=num4;
        System.out.println(num3);
        num3*=num4;
        System.out.println(num3);
        num3/=num4;
        System.out.println(num3);
        num3%=num4;
        System.out.println(num3);

        //increment and decrement operators
        int num5=2;
        int num8=3;
        System.out.println(num5*(num8++)); //postfix increment is applied after execution so not recorded ans:6
        System.out.println(num5*(++num8)); //prefix increment is applied before execution so is recorded ans:8
        System.out.println(num5*(num8--));//postfix decrement is applied after execution so not recorded ans:6
        System.out.println(num5*(--num8));//prefix decrement is applied before execution so  recorded ans:4
       //Relational operators :  ==, !=, >, <, >=, <= works on boolean and if else statements :refer to class ifElse

        //Ternary Operator -simpler version of if else, here the result of first condition is before colon
        //and result of second condition is after it
        int a = 100, b = 30;
        int numx = a > b ? a : b;
        System.out.println(numx);

    }
}
