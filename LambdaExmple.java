/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lambdaexmple;
public class LambdaExmple {
    public static void main(String[] args) {
        // Define lambda expression for addition
        MathOperation addition = (a, b) -> System.out.println(a + b);

        // Call the lambda expression
        addition.operate(5, 3);
    }

    // Functional interface for math operations
    interface MathOperation {
        void operate(int a, int b);
    }
}
