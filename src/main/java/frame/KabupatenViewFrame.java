package frame;

import javax.swing.*;

public class KabupatenViewFrame extends JFrame {
    private JPanel mainPanel;
    private JPanel cariPanel;
    private JScrollPane viewScrollPane;
    private JTextField cariTextField;
    private JButton cariButton;
    private JTable viewTable;
    private JPanel buttonPanel;
    private JButton tambahButton;
    private JButton ubahButton;
    private JButton Hapusbutton;
    private JButton batalButton;
    private JButton cetakButton;
    private JButton tutupButton;

    public void init() {
        setContentPane(mainPanel);
        setTitle("Data Kabupaten");
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
