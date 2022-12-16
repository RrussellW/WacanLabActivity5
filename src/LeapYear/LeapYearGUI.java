package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LeapYearGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int year=Integer.parseInt(tfYear.getText());

                if(year%4==0){
                    if(year%400!=0&&year%100==0){
                        JOptionPane.showMessageDialog(null,"Not a leap year");
                    }else{
                        JOptionPane.showMessageDialog(null,"Leap year");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Not a leap year");
                }
            }
        });
    }

    public static void main(String[] args) {
        LeapYearGUI checker = new LeapYearGUI();
        checker.setContentPane(checker.panel1);
        checker.setSize(300,300);
        checker.setTitle("Leap Year Checker");
        checker.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        checker.setVisible(true);
    }
}
