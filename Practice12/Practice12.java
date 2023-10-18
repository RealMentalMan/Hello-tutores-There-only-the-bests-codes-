package Practice12;

public class Practice12 {
    public static void main(String[] args) {

        String name = "C:\\Users\\ZAQWERTY\\Desktop\\Universe(ity)\\Джава\\teхt.txt";

        Practice1212345 pr = new Practice1212345();
        System.out.println("1: Запись в файл введённой с клавиатуры информации");
        pr.t_1(name);
        System.out.println("2: вывод информации из файла на экран");
        pr.t_2(name);
        System.out.println("3: Заменa информации в файле на информацию, введённую с клавиатуры");
        pr.t_1(name);
        System.out.println("4: Добавление в конец исходного файла текст, введённый с клавиатуры");
        pr.t_4(name);
        System.out.println("Result");
        pr.t_2(name);




    }
}