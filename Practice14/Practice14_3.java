package Practice14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice14_3 {
    public boolean regax(String input) {
        Pattern regular = Pattern.compile("[0-3][0-9]/[0-1][0-9]/[0-9][0-9][0-9][0-9]");
        Matcher m = regular.matcher(input);
        return m.matches();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s2 = in.nextLine();
        Practice14_3 reg = new Practice14_3();
        System.out.println(reg.regax(s2));
    }
}
