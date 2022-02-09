package HomeWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chat extends JFrame {
    String[] nameData = {"Mike","Leo","Patrick","John"};

    public Chat(){
        JTextArea textField = new JTextArea(10,80);
        textField.setBackground(Color.WHITE);
        JTextArea textMessegeField = new JTextArea(10,80);
        textMessegeField.setBackground(Color.lightGray);
        JScrollPane scrollPane = new JScrollPane(textField);
        JList list = new JList<>(nameData);
        list.setBackground(Color.CYAN);
        JButton sendBtn = new JButton("Send");

        textField.setWrapStyleWord(true);

        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        add(scrollPane, new GridBagConstraints(1,0,2,3,1,1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH,
                new Insets(2,2,2,2),0,0));
        add(textMessegeField, new GridBagConstraints(1,3,2,2,1,1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2,2,2,2),0,0));
        add(list, new GridBagConstraints(0,0,1,2,1,1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2,2,2,2),0,0));
        add(sendBtn, new GridBagConstraints(1,5,0,0,0,0,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2,2,2,2),0,0));

        sendBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                        String text = textMessegeField.getText();
                        textField.append(text + "\n");
                        textMessegeField.setText("");
                        ListFiles.fileSave(text);
                        ListFiles.createFile();
            }
        });

        pack();
        setVisible(true);

    }
}
