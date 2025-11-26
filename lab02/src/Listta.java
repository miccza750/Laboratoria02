import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listta {
    private JComboBox comboBox1;
    private JButton button1;
    private JPanel panel1;
    private JLabel text1;

    Listta(){
        super();
        JFrame frame = new JFrame("Przykład GUI w Javie");
        frame.setContentPane(panel1);
        frame.setSize(500, 300);
        frame.setVisible(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = (String) comboBox1.getSelectedItem();
                text1.setText(text);
            }
        });
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
