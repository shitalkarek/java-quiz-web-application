package quizapplication;

import javax.swing.*;  //JFRAME COMES UNDER SWING 
import java.awt.*;    //color class comes under awt pacages
import java.awt.event.*; //for implementing actionlistener   &&  actionlistner have the actions like clicking buttons

public class Login extends JFrame implements ActionListener{
 
    JButton rules, back;  //globally declaring  now change to JButtons rules to rules only 
    JTextField tfname;   //GLobally declaring  now change to JTextfield  to tfname only 
    
    Login() {
        getContentPane().setBackground(Color.WHITE); //GETCONTENT USE FOR PICK UP THE FULL CONTENT (LOGIN)
        setLayout(null); //to set own layout
        //inside jframe there is a class imageicon !! to pick up the image from directory we use getsystemresources
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz1.png"));
        JLabel image = new JLabel(i1);  //TO FOX THE COMPONENT 
        image.setBounds(0, 0, 600, 500); //set the component location
        add(image); //treat it as a component and we have to create the object of the component using add
        
        JLabel heading = new JLabel("JAVA QUIZ"); //use to write something over the frame
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254));
        add(heading); //without using add function we cannot add any component to frame
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 254));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);  //for defining the action
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);  //frame will be visible bydefault it remains hidden
    }
    
    public void actionPerformed(ActionEvent ae) {   //actionperformed overrides the actioneventlistner here
        if (ae.getSource() == rules) {
            String name = tfname.getText();   //to store whatever value enter by user (textfield)
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {  //checking   but first declare it globbaly then error will go
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login(); //annonomous object
    }
}