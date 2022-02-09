package HomeWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration extends JFrame {
    JLabel nameLbl = new JLabel("Enter your name :");
    JLabel passLbl = new JLabel("Enter your password :");
    JLabel emailLbl = new JLabel("Enter your Email :");

    JTextField nameField = new JTextField(20);
    JTextField passField = new JTextField(20);
    JTextField emailField = new JTextField(20);

    JButton confirmBtn = new JButton("Confirm");
    JButton cancelBtn = new JButton("Cancel");



    public Registration(){
        setTitle("Registration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        add(nameLbl, new GridBagConstraints(0,0,1,1,1,1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2,2,2,2),0,0));
        add(passLbl, new GridBagConstraints(0,1,1,1,1,1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(0,2,2,2),0,0));
        add(emailLbl, new GridBagConstraints(0,2,1,1,1,1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2,2,2,2),0,0));

        add(nameField, new GridBagConstraints(1,0,4,1,1,1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2,2,2,2),0,0));
        add(passField, new GridBagConstraints(1,1,4,1,1,1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2,2,2,2),0,0));
        add(emailField, new GridBagConstraints(1,2,4,1,1,1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2,2,2,2),0,0));


        add(confirmBtn, new GridBagConstraints(0,3,1,1,1,1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2,2,2,2),0,0));
        add(cancelBtn, new GridBagConstraints(1,3,1,1,1,1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2,2,2,2),0,0));
        confirmBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            if(nameField.getText().equals("")||passField.getText().equals("")||emailField.getText().equals("")){
                JOptionPane.showMessageDialog(nameField,"Empty");
            }else{

            }
            }
        });
        cancelBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        pack();
        setVisible(true);
    }

}
