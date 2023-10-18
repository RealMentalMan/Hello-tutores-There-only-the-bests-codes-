package Practice13;

import java.util.Scanner;
import java.util.StringTokenizer;

public class adress {
    public static void sorted(String str) {
        StringTokenizer res = new StringTokenizer(str, ",.;");
        while (res.hasMoreTokens())
            System.out.print(res.nextToken() + " ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку формата “Страна[d] Регион[d] Город[d] Улица[d] Дом[d] Корпус[d] Квартира” ([d] – разделитель, например, (,.;)");
        String information = input.nextLine();
        sorted(information);
    }
}