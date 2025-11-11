import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class okno extends JFrame{
    private JPanel panel1;
    private JTextArea textArea1;

    public okno(String Fraza) {
        super(Fraza);
        setContentPane(panel1);
        setSize(250, 200);
        textArea1.setText(Fraza);
        setVisible(true);
    }

}

