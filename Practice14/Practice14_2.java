package Practice14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Practice14_2 {
    public boolean reg(String input) {
        Pattern re = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher match = re.matcher(input);
        return match.matches();
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Practice14_2 regul = new Practice14_2();
        System.out.println("Введите строку: ");
        String s1 = in.nextLine();
        System.out.println(regul.reg(s1));
    }
}