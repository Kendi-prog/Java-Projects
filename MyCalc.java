/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mycalc;
import javax.swing.*;
import java.awt.event.*;


public class MyCalc implements ActionListener{
JTextField tf1,tf2,tf3;
JButton b1,b2,b3,b4,b5;

   MyCalc(){
   JFrame f = new JFrame("Kendi's Calculator");
   JLabel l1 = new JLabel("Hello User. Welcome to my Calculator. ");
   l1.setBounds(100,0,300,30);
   JLabel l2 = new JLabel("Enter 1st Number: ");
   l2.setBounds(100,60,180,30);
   JLabel l3 = new JLabel("Enter 2nd Number: ");
   l3.setBounds(100,140,180,30);
   JLabel l4 = new JLabel("Result: ");
   l4.setBounds(100,220,180,30);
    tf1 = new JTextField();
   tf1.setBounds(100,100,180,30);
   tf2 = new JTextField();
   tf2.setBounds(100,180,180,30);
    tf3 = new JTextField();
   tf3.setBounds(100,260,180,30);
    b1 = new JButton("Sum");
   b1.setBounds(50,300,100,30);
    b2 = new JButton("Difference");
   b2.setBounds(200,300,100,30);
    b3 = new JButton("Quotient");
   b3.setBounds(50,340,100,30);
    b4 = new JButton("Multiplication");
   b4.setBounds(200,340,100,30);
    b5 = new JButton("Remainder");
   b5.setBounds(120,380,100,30);
   
   b1.addActionListener(this);
   b2.addActionListener(this);
   b3.addActionListener(this);
   b4.addActionListener(this);
   b5.addActionListener(this);
    
   f.add(l1);
   f.add(l2);
   f.add(l3);
   f.add(l4);
   f.add(tf1);
   f.add(tf2);
   f.add(tf3);
   f.add(b1);
   f.add(b2);
   f.add(b3);
   f.add(b4);
   f.add(b5);
   f.setLayout(null);
   f.setSize(500,500);
   f.setVisible(true);
   } 
    public void actionPerformed(ActionEvent e) {  
        String s1 = tf1.getText();  
        String s2 = tf2.getText(); 
        int a=Integer.parseInt(s1);  
        int b=Integer.parseInt(s2);  
        int c=0;  
        if(e.getSource()== b1){  
            c=a+b;  
        }else if(e.getSource()== b2){  
            c=a-b;  
        } else if(e.getSource()== b3){
            c = a/b;
        }  else if(e.getSource()==b4){
            c = a*b;
        }else if(e.getSource()==b5){
            c=a%b;
        }
        String result=String.valueOf(c);  
        tf3.setText(result);  
    } 
    public static void main(String[] args) {
       new MyCalc();
    }
    
}
