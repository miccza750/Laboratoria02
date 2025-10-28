import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class lab01 {
    private JPanel panel1;
    private JTextField input;
    private JLabel input1;
    private JLabel wynik;
    private JButton oblicz;

    public lab01() {
        oblicz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(input.getText());
                int wynik1 = (a*9/5)+32;
                wynik.setText(String.valueOf(wynik1 + "stopni Fahrenheita"));
            }
        });
    }

    public static void main(String[] args) {
    JFrame frame = new JFrame("Przykład GUI w Javie");
        frame.setContentPane(new lab01().panel1);
        frame.setSize(300, 100);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
}


}
