import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome {
    private JPanel panel;
    private JProgressBar progressBar1;
    private JProgressBar progressBar2;
    private JButton wyjdźButton;
    private JButton dalejButton;
    public Welcome(){
        JFrame frame = new JFrame("Przykład GUI w Javie");
        frame.setContentPane(panel);
        frame.setSize(500, 300);
        frame.setVisible(true);
        dalejButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login login = new Login();
            }
        });
    }
}
