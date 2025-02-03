import javax.swing.*;
import java.util.Random;

public class HelloFrame extends JFrame {
    private JButton btKopiruj;
    private JPanel pnMain;
    private JPanel pnGenerovani;
    private JLabel labelNahodne;
    private JTextField txtFNahodneCislo;
    private JButton btGeneruj;
    private JTextArea txtAVypis;

    public HelloFrame() {
        initComponents();
    }

    private  void initComponents() {
        setContentPane(pnMain);
        setTitle("Hello Gui");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        btGeneruj.addActionListener(e -> generuj(txtFNahodneCislo));
        btKopiruj.addActionListener(e -> kopiruj());
    }

    private void generuj(JTextField txtFNahodneCislo) {
        Random generator = new Random();
        int nahodne = generator.nextInt(100+1);
        txtFNahodneCislo.setText(Integer.toString(nahodne));
    }

    private void kopiruj() {
        txtAVypis.append(txtFNahodneCislo.getText()+"\n");

    }

}
