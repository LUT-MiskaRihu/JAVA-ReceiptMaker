import javax.swing.*;

public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private JScrollPane spProducts;
    private JTextField tfTitle;
    private JTextField tfTotalDiscountP;
    private JTextField tfSubtotal;
    private JTextField tfTotalDiscountE;
    private JTextField tfTotalPrice;
    private JButton btnAdd;
    private JButton btnRemoveAll;

    public MainFrame(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }

    public static void main(String[] args) {
        JFrame frame = new MainFrame("Receipt Maker");
        frame.setVisible(true);
    }
}
