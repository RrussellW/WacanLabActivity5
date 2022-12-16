package LeapYear;

import javax.swing.*;

public class LeapYearGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;
    private JLabel jlInputYear;


    public static void main(String[] args) {
        LeapYearGUI checker = new LeapYearGUI();
        checker.setContentPane(checker.panel1);
        checker.setSize(300,300);
        checker.setTitle("Leap Year Checker");
        checker.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        checker.setVisible(true);
    }
}
