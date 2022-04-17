package Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    public Login(){
        JFrame chatWindow = new JFrame("Mi chat");
        //chatWindow.setSize(500,200);
        chatWindow.setResizable(false);
        chatWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chatWindow.setLocationRelativeTo(null);
        chatWindow.setLayout(new GridBagLayout());

        JLabel login =new JLabel("Login");
        JLabel password = new JLabel("Password");

        JButton loginBtn =new JButton("Ok");
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        JButton registrationBtn = new JButton("Registration");
        registrationBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Registration registration = new Registration();
            }
        });

        JTextField loginField = new JTextField(15);
        JPasswordField passField = new JPasswordField(15);

        chatWindow.add(login, new GridBagConstraints(0,0,1,1,1,1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2,2,2,2),0,0));

        chatWindow.add(password, new GridBagConstraints(0,1,1,1,1,1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2,2,2,2),0,0));

        chatWindow.add(loginField, new GridBagConstraints(1,0,1,1,1,1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2,2,2,2),0,0));

        chatWindow.add(passField, new GridBagConstraints(1,1,1,1,1,1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2,2,2,2),0,0));

        chatWindow.add(loginBtn, new GridBagConstraints(0,3,1,1,2,1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2,2,2,2),0,0));

        chatWindow.add(registrationBtn, new GridBagConstraints(1,3,1,1,1,1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2,2,2,2),0,0));


        chatWindow.setVisible(true);
        chatWindow.pack();
    }
}