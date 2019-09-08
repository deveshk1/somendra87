package chattingapp.gui;

import javax.swing.*;

public class ChattingScreen {
    private JPanel chattingScreenPanel;
    private JButton Disconnect;
    private JTextArea messageDisplayArea;
    private JTextField ipAddress;
    private JTextField portNumber;
    private JButton connect;
    private JTextField messageTextField;
    private JButton sendButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("ChattingScreen");
        frame.setContentPane(new ChattingScreen().chattingScreenPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
