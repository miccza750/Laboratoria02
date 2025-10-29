import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JTextField loginInput;
    private JPanel panel;
    private JProgressBar progressBar1;
    private JProgressBar progressBar2;
    private JButton wyjdźButton;
    private JButton sprawdźButton;
    private JPasswordField passwordField1;
    private JLabel lblWait;

    public Login(){
        super("labolatory 2");
        JFrame frame = new JFrame("Przykład GUI w Javie");
        frame.setContentPane(panel);
        frame.setSize(500, 300);
        frame.setVisible(true);
        sprawdźButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userInput = loginInput.getText();
                String hasloInput = new String(passwordField1.getPassword());
                if (userInput.equals("login") && hasloInput.equals("haslo")) {
                    proggression();
                    lblWait.setText("Zalogowano do systemu");
                    System system = new System();
                } else {
                    lblWait.setText("Spróbuj ponownie");
                }
            }
        });
    }
    private void proggression(){
        int i = 0;
        while (i<100){
            lblWait.setText("Proszę czekać...");
            progressBar1.setValue(i);
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

