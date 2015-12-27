import javax.swing.*;
import java.awt.*;

/**
 * Created by Matthewelbing on 12/27/15.
 */
public class UI {
    private JFrame frame;

    private JPanel panel, buttonPanel;

    private JTextField firstName, lastName, age, weight, position;

    private JButton sumbit, exit;
    public UI(){
        frame = new JFrame("Registration");

        panel = new JPanel();
        buttonPanel = new JPanel();

        firstName = new JTextField("First Name");
        lastName = new JTextField("Last Name");
        age = new JTextField("Age");
        weight = new JTextField("Weight");
        position = new JTextField("Position");

        frame.setBounds(800, 800, 0, 0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        panel.add(firstName);
        panel.add(lastName);
        panel.add(age);
        panel.add(weight);
        panel.add(position);

        buttonPanel.add(sumbit);
        buttonPanel.add(exit);

        sumbit.addActionListener(e -> {

        });
        exit.addActionListener(e -> {
            System.exit(0);
        });


    }

}
