package Practice_22;
import java.util.*;
public class Simple {
    private static final Stack<Double> stack = new Stack<>();
    private static final Scanner input = new Scanner(System.in);


    public static void calculator() {

        System.out.println("Это RPN калькулятор!");

        takeInput();
    }

    private static void takeInput() {
        String numOrOperand = "0";
        int c = 0;
        while (!numOrOperand.equals("x")) {

            if (c == 0) {

                System.out.println("Введите левый операнд: ");
                c++;
            }
            else if (c == 1) {
                System.out.println("Введите правый операнд:");
                c++;
            }
            else if (c == 2) {
                System.out.println("Введите символ операции или правый операнд: ");
            }
            numOrOperand = input.next();
            try {
                double intNumOrOperand = Double.parseDouble(numOrOperand);
                stack.push(intNumOrOperand);
            } catch (Exception e) {
                switch (numOrOperand) {

                    case "*" -> { double a2 = stack.pop();
                            double a1 = stack.pop();
                            double res = a2 * a1;
                        stack.push(res);
                    }
                    case "/" -> {
                        double a2 = stack.pop();
                        double a1 = stack.pop();
                        double res = a1 / a2;
                        stack.push(res);
                    }
                    case "+" -> {
                        double a2 = stack.pop();
                        double a1 = stack.pop();
                        double res = a2 + a1;
                        stack.push(res);
                    }
                    case "-" -> {
                        double a2 = stack.pop();
                        double a1 = stack.pop();
                        double res = a1 - a2;
                        stack.push(res);
                    }


                    case "=" -> System.out.println(stack.pop());
                    case "c" -> {
                        if (!stack.empty()) {
                            for (int i = 0; i < stack.size(); i++) {
                                stack.pop();
                                c = 0;
                            }
                        }
                    }
                    case "w" -> {
                        System.out.println("Содержимое: ");
                        for (Double integer : stack) {
                            System.out.println(integer);
                        }
                    }
                }
                if (stack.size() == 1) {
                    c = 1;
                }
            }

        }
    }


    public static void main(String[] args) {
        try {
            calculator();
        } catch (Exception e) {
            System.out.println("Тааак! Что-то не так!");
        }

    }
}