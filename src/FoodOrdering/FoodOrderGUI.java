package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public FoodOrderGUI () {


        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double total = 0.0;

                double disc = 0.0;

                    if (cPizza.isSelected()) {
                        total += 100.0;
                    }
                    if (cBurger.isSelected()) {
                        total += 80.0;
                    }
                    if (cFries.isSelected()) {
                        total += 65.0;
                    }
                    if (cSoftDrinks.isSelected()) {
                        total += 55.0;
                    }
                    if (cTea.isSelected()) {
                        total += 50.0;
                    }
                    if (cSundae.isSelected()) {
                        total += 40.0;
                    }

                    if (rb5.isSelected()) {
                        disc = 0.05;
                    } else if (rb10.isSelected()) {
                        disc = 0.1;
                    } else if (rb15.isSelected()) {
                        disc = 0.15;
                    } else if (rbNone.isSelected()) {
                        disc = 0.0;
                    }

                    double cost = total - (total * disc);

                    JOptionPane.showMessageDialog(null, "The total price is Php " + String.format("%.2f", cost));
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderGUI app = new FoodOrderGUI();
        app.setContentPane(app.panel1);
        app.setSize(600,600);
        app.setTitle("Food Ordering System");
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}