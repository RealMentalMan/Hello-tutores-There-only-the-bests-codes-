package Practice15;

import javax.swing.*;

class Calculator extends JFrame {
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton plus = new JButton(" Сложить");
    JButton minus = new JButton(" Вычесть");
    JButton multiply = new JButton(" Умножить");
    JButton div = new JButton(" Поделить");

    Calculator() {
        super("Example");

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setSize(150, 250);

        add(new JLabel("Первое число"));
        add(jta1);
        add(new JLabel("Второе число"));
        add(jta2);

        add(plus);
        add(minus);
        add(multiply);
        add(div);

        plus.addActionListener(ae -> {
            try {
                double x1 = Double.parseDouble(jta1.getText().trim());
                double x2 = Double.parseDouble(jta2.getText().trim());

                JOptionPane.showMessageDialog(null, "Результат = " + (x1 + x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Неверный ввод!", "alert", JOptionPane.ERROR_MESSAGE);
            }
        });

        minus.addActionListener(ae -> {
            try {
                double x1 = Double.parseDouble(jta1.getText().trim());
                double x2 = Double.parseDouble(jta2.getText().trim());

                JOptionPane.showMessageDialog(null, "Результат = " + (x1 - x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Неверный ввод!", "alert", JOptionPane.ERROR_MESSAGE);
            }
        });

        multiply.addActionListener(ae -> {
            try {
                double x1 = Double.parseDouble(jta1.getText().trim());
                double x2 = Double.parseDouble(jta2.getText().trim());

                JOptionPane.showMessageDialog(null, "Результат = " + (x1 * x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Неверный ввод!", "alert", JOptionPane.ERROR_MESSAGE);
            }
        });

        div.addActionListener(ae -> {
            try {
                double x1 = Double.parseDouble(jta1.getText().trim());
                double x2 = Double.parseDouble(jta2.getText().trim());
                if (x2 != 0) {
                    JOptionPane.showMessageDialog(null, "Результат = " + (x1 / x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Результат = " + "ошибка, ведь делить на ноль могут только взрослые", "Alert", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Неверный ввод!", "alert", JOptionPane.ERROR_MESSAGE);
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
