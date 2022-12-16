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
                try {
                    int year = Integer.parseInt(tfYear.getText());

                    if (year < 0) {
                        throw new NegativeInputException("Year cannot be negative");
                    }

                    if (year % 4 == 0) {
                        if (year % 400 != 0 && year % 100 == 0) {
                            JOptionPane.showMessageDialog(null, "Not a leap year");
                        } else {
                            JOptionPane.showMessageDialog(null, "Leap year");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Not a leap year");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Input Invalid.");
                } catch (NegativeInputException ex) {
                    JOptionPane.showMessageDialog(null, "Input is a Negative Number.");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error Occurred");
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

class NegativeInputException extends Exception {
    public NegativeInputException(String message) {
        super(message);
    }
}