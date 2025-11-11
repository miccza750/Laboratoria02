import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
public class hasla {
    private JPanel panel1;
    private JPasswordField passwordField1;
    private JButton zalogujButton;
    private JPasswordField passwordField2;
    public String haslo;
    public String login;
    public hasla() {

        zalogujButton.addActionListener(new ActionListener() {
            char[] haslo1 = passwordField1.getPassword();
            char[] haslo2 = passwordField2.getPassword();
            @Override
            public void actionPerformed(ActionEvent e) {

                if (Arrays.equals(haslo1, haslo2)) {
                    okno Okno = new okno("Hasła się zgadzają");
                }
                    okno Okno = new okno("Hasła się nie zgadzają");
                }

        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("");
        frame.setContentPane(new hasla().panel1);
        frame.setSize(250, 200);
       // frame.setLayout(new hasla());
        frame.setVisible(true);
    }

}

