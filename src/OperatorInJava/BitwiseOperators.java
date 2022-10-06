package OperatorInJava;

public class BitwiseOperators {
    public static void main(String[] args) {

        int number1 = 12, number2 = 25, result;
        int number = 35;

        //The bitwise OR | operator returns 1 if at least one of the operands is 1. Otherwise, it returns 0.
        // bitwise OR between 12 and 25
        result = number1 | number2;
        System.out.println("bitwise number1 | number2 = " + result);    // prints 29


        //The bitwise AND & operator returns 1 if and only if both the operands are 1. Otherwise, it returns 0.
        // bitwise AND between 12 and 25
        result = number1 & number2;
        System.out.println("bitwise number1 & number2 = " + result);    // prints 8

        //The bitwise XOR ^ operator returns 1 if and only if one of the operands is 1.
        // However, if both the operands are 0 or if both are 1, then the result is 0.
        // bitwise XOR between 12 and 25
        result = number1 ^ number2;
        System.out.println("bitwise number1 ^ number2 = " + result);    // prints 21

        //The bitwise complement operator is a unary operator (works with only one operand). It is denoted by ~.
        //It changes binary digits 1 to 0 and 0 to 1.
        //N = -(N + 1)
        result = ~number;
        System.out.println("bitwise number = " + result);    // prints -36
    }
}
