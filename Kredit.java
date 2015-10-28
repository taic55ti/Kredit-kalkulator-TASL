/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kredit;

 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class Kredit {
    private JTextField pField;
    private JLabel pLabel;
    private JLabel kmLabel;
    private JTextField termField;
    private JLabel termLabel;
    private JLabel litersLabel;
    private JTextField priceField;
    private JLabel priceLabel;
    private JLabel rurLabel;
    private JButton calcButton;
    private JLabel resultLabel;
    private JFrame mainFrame;
    
    Kredit() {
        pLabel = new JLabel("Ïðîöåíòíàÿ ñòàâêà");
        pField = new JTextField("0");
        pField.setHorizontalAlignment(JTextField.RIGHT);
        kmLabel = new JLabel("%");
        termLabel = new JLabel("Êîëè÷åñòâî ìåñÿöåâ");
        termField = new JTextField("0");
        termField.setHorizontalAlignment(JTextField.RIGHT);
        litersLabel = new JLabel("ì.");
        priceLabel = new JLabel("Ñóììà êðåäèòà");
        priceField = new JTextField("0");
        priceField.setHorizontalAlignment(JTextField.RIGHT);
        rurLabel = new JLabel("Ðóá.");
        calcButton = new JButton("Ðàññ÷èòàòü");
        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
            	C
            	
        
       À
       
       
       
        Ë
        
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Kredit();
            }
        });
    }
 
}

