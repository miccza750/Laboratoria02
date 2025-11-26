import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class System {
    private JLabel wybierz;
    private JRadioButton button1;
    private JRadioButton button2;
    private JRadioButton button3RadioButton;
    private JLabel Icon;
    private JButton wyjdźButton;
    private JButton dalejButton;
    private JPanel panel;
    private JLabel ikona;
    public ImageIcon Linux = new ImageIcon(getClass().getResource("linux.png"));
    public ImageIcon windows = new ImageIcon(getClass().getResource("windows.png"));
    public ImageIcon macos = new ImageIcon(getClass().getResource("macos.png"));
    public System() {
        super();
        JFrame frame = new JFrame("Przykład GUI w Javie");
        frame.setContentPane(panel);
        frame.setSize(500, 300);
        frame.setVisible(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(button1.isSelected()) {
                    ikona.setIcon(Linux);
                }
                if(button2.isSelected()) {
                    ikona.setIcon(windows);
                }
                if(button3RadioButton.isSelected()) {
                    ikona.setIcon(macos);
                }
            }
        });
    }
}
