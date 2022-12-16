package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI () {

        lblResult.setEditable(false);
        btnCompute.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    double num1 = Double.parseDouble(tfNumber1.getText());
                    double num2 = Double.parseDouble(tfNumber2.getText());

                    String operator = (String) cbOperations.getSelectedItem();

                    double result = 0;

                    if (operator != null) {
                        switch (operator) {
                            case "+":
                                result = num1 + num2;
                                break;
                            case "-":
                                result = num1 - num2;
                                break;
                            case "*":
                                result = num1 * num2;
                                break;
                            case "/":
                                if(num2 == 0){
                                    throw new ArithmeticException();
                                }
                                result = num1 / num2;
                                break;
                        }
                    }

                    lblResult.setText(String.format("%.2f", result));
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(null, "Input Cannot Be Zero");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Input Invalid");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error Occurred");
                }

            }
        });
    }

    public static void main(String[] args) {
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setContentPane(app.panel1);
        app.setSize(600,300);
        app.setTitle("Simple Calculator");
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
