import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import java.util.List;

public class kontakt {
    private JList list1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton zapiszNowegoButton;
    private JButton zapiszIstniejącegoButton;
    private JPanel panel1;

    kontakt()
    {
        super();
        JFrame frame = new JFrame("Przykład GUI w Javie");
        frame.setContentPane(panel1);
        frame.setSize(500, 300);
        frame.setVisible(true);
        ArrayList<Osoby> osoba = new ArrayList<Osoby>();
        Osoby maciek = new Osoby("maciek","","","","13-04-2005");
        osoba.add(maciek);
        list1.setFont(new java.awt.Font("Tahoma", 0, 24));
        DefaultListModel listModel1 = new DefaultListModel();
        listModel1.addElement(osoba[0]);
        list1.setModel(listModel1);
    }
}
