package chattingapp.gui;

import javax.swing.*;
import java.awt.event.*;

public class MainScreen extends JFrame{
    private JTextField ipAddressTextField;
    private JTextField portNumberTextField;
    private JButton disconnectButton;
    private JButton connectButton;
    private JTextArea chatTextAreaTextArea;
    private JTextField typeHereToSendTextField;
    private JButton sendButton;
    private JPanel chatApplicationPanel;

    public MainScreen() {
        ipAddressTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ipAddress");
            }
        });
        portNumberTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        disconnectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        connectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        chatTextAreaTextArea.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });

        typeHereToSendTextField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
        sendButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
    }



    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("chatting App");
        frame.setContentPane(new MainScreen().chatApplicationPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
