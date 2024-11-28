package View;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainMenu {    
    public MainMenu() {
        initComponents();
    }
    
    private void initComponents() {
        
        JFrame mainFrame = new JFrame("MAIN MENU");

        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainFrame.setSize(200, 250);
        mainFrame.setLocationRelativeTo(null); 
        
        JButton registerButton = new JButton("REGISTRASI");
        JButton printButton = new JButton("PRINT DATA");
        JButton exitButton = new JButton("KELUAR");
        
        registerButton.addActionListener(e -> {
            mainFrame.dispose();
            new InputMenu();
        });

        // findButton.addActionListener(e -> {
        //     mainFrame.dispose();
        //     
        // });

        // exitButton.addActionListener(e -> {
        //     mainFrame.dispose();
        // });
        
        JPanel mainPanel = new JPanel();
        mainPanel.add(registerButton);
        mainPanel.add(printButton);
        mainPanel.add(exitButton);
        
        mainFrame.getContentPane().add(mainPanel, BorderLayout.CENTER);
        mainFrame.setVisible(true);
    }
    public static void main(String[] args) {
        MainMenu menu = new MainMenu();
    }
}
