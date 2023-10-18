package Practice16;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

class Guessing extends JFrame {
    JTextField jta = new JTextField(10);
    JButton button = new JButton("Угадать!");
    JButton button2 = new JButton("Читы)");
    int trys = 3;

    Guessing() {
        super("Игра в угадай-ку!");

        Random rand = new Random();
        int num = rand.nextInt(21);
        setLayout(new FlowLayout());
        setSize(500, 250);

        add(new JLabel("Привет, пользователь! Угадай-ка число от 0 до 20 с 3-ёх попыток!"));

        add(jta);
        add(button);
        add(button2);
        button2.addActionListener(aje -> {
            JOptionPane.showMessageDialog(null,"Не думал, что ты воспользуешься читами, но загаданное число:" + num, "Читы", JOptionPane.INFORMATION_MESSAGE);
        });
        button.addActionListener(ae -> {
            try {
                int x1 = Integer.parseInt(jta.getText().trim());

                if (trys > 0) {
                    trys--;
                    if (x1 != num) {
                        if (x1 > num) {
                            JOptionPane.showMessageDialog(null, "Упс! Не угадал! Загаданное числе меньше указанного, попыток осталось: " + trys, "Результат", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Упс! Не угадал! Загаданное числе больше указанного, попыток осталось: " + trys, "Результат", JOptionPane.INFORMATION_MESSAGE);
                        }

                        if (trys == 0){
                            button.setText("Что теперь?");
                        }
                    }

                    else {
                        JOptionPane.showMessageDialog(null, "Ура! Это победа! Ты угадал! Молодец!", "Результат", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }
                }
                else {

                    JOptionPane.showMessageDialog(null, "К сожалению попыток не соталось, число неотгадано. Ты проиграл!", "Результат", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ой! Что-то не так! Перезапусти программу и введи число заново!", "Ошибка!", JOptionPane.ERROR_MESSAGE);
            }
        });
        setVisible(true);
    }


    public static void main(String[] args) {
        new Guessing();
    }
}
