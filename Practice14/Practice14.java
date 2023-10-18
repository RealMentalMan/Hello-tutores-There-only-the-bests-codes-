package Practice14;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Practice14 {
    public void Ex1(String input, String reg) {
        Pattern regular = Pattern.compile(reg);
        String[] words = regular.split(input);
        for (String s : words) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Practice14 reg = new Practice14();
        System.out.println("Введите строку: ");
        String s = in.nextLine();
        System.out.println("Введите  регулярнoe выражениe: ");
        String r = in.nextLine();
        reg.Ex1(s, r);

    }
}