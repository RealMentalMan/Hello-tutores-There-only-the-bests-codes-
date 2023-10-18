package Practice13;

import java.util.Scanner;

public class num{
    public static StringBuffer recreate(String num){
        int cur = 0;
        StringBuffer sBufferReverse = new StringBuffer(num.length());
        for (int pos = num.length() - 1; pos >= 0 ; pos--) {
            sBufferReverse.append(num.charAt(pos));
            cur++;
            if (cur ==4 || cur ==7 || cur ==10 ){sBufferReverse.append("-");}
        }
        sBufferReverse.append("+");
        sBufferReverse.reverse();
        return sBufferReverse;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите 11-значный номер телефона");
        String number = input.nextLine().replaceAll("[-+.^:,]","");
        System.out.println(number);
        System.out.println(recreate(number));
    }
}