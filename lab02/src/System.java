import javax.swing.*;

public class System {
    private JLabel wybierz;
    private JRadioButton linusRadioButton;
    private JRadioButton windowsRadioButton;
    private JRadioButton macosRadioButton;
    private JLabel Icon;
    private JButton wyjdźButton;
    private JButton dalejButton;
    private JPanel panel;
    private ImageIcon linux = new ImageIcon(getClass().getResource("linux.png"));
    private ImageIcon windows = new ImageIcon(getClass().getResource("windows.png"));
    private ImageIcon macos = new ImageIcon(getClass().getResource("macos.png"));
    public System() {
        JFrame frame = new JFrame("Przykład GUI w Javie");
        frame.setContentPane(panel);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
