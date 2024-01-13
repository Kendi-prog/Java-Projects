package mycalc2;
import javax.swing.*;
import java.awt.event.*;

public class MYCALC2 implements ActionListener {
JFrame f;
JTextField tf;
JButton b7,b8,b9,bDEL,bAC,b4,b5,b6,bmul,bdiv,b1,b2,b3,badd,bsub,b0,bdec,bmod,bneg,bequ;
double xd;
double num1,num2,check;

MYCALC2(){
    f = new JFrame("Kendi's Calculator");
    tf = new JTextField();
    tf.setBounds(50,30,600,90);
    b7 = new JButton("7️");
    b7.setBounds(100,150,70,70);
    b8 = new JButton("8");
    b8.setBounds(200,150,70,70);
    b9 = new JButton("9");
    b9.setBounds(300,150,70,70);
    bDEL = new JButton("DEL");
    bDEL.setBounds(400,150,70,70);
    bAC = new JButton("AC");
    bAC.setBounds(500,150,70,70);
    b4 = new JButton("4");
    b4.setBounds(100,250,70,70);
    b5 = new JButton("5");
    b5.setBounds(200,250,70,70);
    b6 = new JButton("6");
    b6.setBounds(300,250,70,70);
    bmul = new JButton("✖");
    bmul.setBounds(400,250,70,70);
    bdiv = new JButton("➗");
    bdiv.setBounds(500,250,70,70);
    b1 = new JButton("1");
    b1.setBounds(100,350,70,70);
    b2 = new JButton("2");
    b2.setBounds(200,350,70,70);
    b3 = new JButton("3");
    b3.setBounds(300,350,70,70);
    badd = new JButton("➕");
    badd.setBounds(400,350,70,70);
    bsub = new JButton("➖");
    bsub.setBounds(500,350,70,70);
    b0 = new JButton("0");
    b0.setBounds(100,450,70,70);
    bdec = new JButton(".");
    bdec.setBounds(200,450,70,70);
    bmod = new JButton("%");
    bmod.setBounds(300,450,70,70);
    bneg = new JButton("➕/➖");
    bneg.setBounds(400,450,70,70);
    bequ = new JButton("=");
    bequ.setBounds(500,450,70,70);
    
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    bDEL.addActionListener(this);
    bAC.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    bmul.addActionListener(this);
    bdiv.addActionListener(this);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    badd.addActionListener(this);
    bsub.addActionListener(this);
    b0.addActionListener(this);
    bdec.addActionListener(this);
    bmod.addActionListener(this);
    bneg.addActionListener(this);
    bequ.addActionListener(this);
    
    
    
    f.add(tf); 
    f.add(b7);
    f.add(b8);
    f.add(b9);
    f.add(bDEL);
    f.add(bAC);
    f.add(b4);
    f.add(b5);
    f.add(b6);
    f.add(bmul);
    f.add(bdiv);
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(badd);
    f.add(bsub);
    f.add(b0);
    f.add(bdec);
    f.add(bmod);
    f.add(bneg);
    f.add(bequ);
    f.setSize(800,800);
    f.setLayout(null);
    f.setVisible(true);
}

public void actionPerformed(ActionEvent e){ 
  String s1  ,s2 ;
                        //NUMBER BUTTON 
if(e.getSource()==b1){
 s2 = tf.getText();
 s1 = s2 +"1";
 tf.setText(s1);
}
if(e.getSource()==b2){
s2 = tf.getText();
s1 = s2+"2";
tf.setText(s1);
}
if(e.getSource()==b3){
s2 = tf.getText();
s1= s2+"3";
tf.setText(s1);
}
if(e.getSource()==b4){
s2 = tf.getText();
s1 = s2+"4";
tf.setText(s1);
}
if(e.getSource()==b5){
s2 = tf.getText();
s1 = s2+"5";
tf.setText(s1);
}
if(e.getSource()==b6){
s2 = tf.getText();
s1 = s2+"6";
tf.setText(s1);
}
if(e.getSource()==b7){
s2 = tf.getText();
s1 = s2+"7";
tf.setText(s1);
}
if(e.getSource()==b8){
s2 = tf.getText();
s1 = s2+"8";
tf.setText(s1);
}
if(e.getSource()==b9){
s2 = tf.getText();
s1 = s2+"9";
tf.setText(s1);
}
if(e.getSource()==b0){
s2 = tf.getText();
s1 = s2+"0";
tf.setText(s1);
}
if(e.getSource()==bdec){  //ADD DECIMAL PTS
s2 = tf.getText();
s1 = s2+".";
tf.setText(s1);
}
if(e.getSource()==bneg){ //FOR NEGATIVE
s2 = tf.getText();
s1="-"+s2;
tf.setText(s1);
}
if(e.getSource()==bDEL){  // FOR  BACKSPACE
s2 = tf.getText();
  try{
    s1 = s2.substring(0, s2.length()-1);
    }catch(StringIndexOutOfBoundsException f){return;}
  tf.setText(s1);
}
                //ARITHMETIC BUTTON
if(e.getSource()==badd){                     //FOR ADDITION
  try{
    num1=Double.parseDouble(tf.getText());
    }catch(NumberFormatException f){
      tf.setText("Invalid Format");
      return;
    }
  s1 = "";
  tf.setText(s1);
  check=1;
}
if(e.getSource()==bsub){                    //FOR SUBTRACTION
  try{
    num1=Double.parseDouble(tf.getText());
    }catch(NumberFormatException f){
      tf.setText("Invalid Format");
      return;
    }
  s1 = "";
  
  tf.setText( s1);
  check=2;
}
if(e.getSource()==bmul){                   //FOR MULTIPLICATION
  try{
    num1=Double.parseDouble(tf.getText());
    }catch(NumberFormatException f){
      tf.setText("Invalid Format");
      return;
    }
  s1 = "";
  tf.setText(s1);
  check=3;
}
if(e.getSource()==bdiv){                   //FOR DIVISION
  try{
    num1=Double.parseDouble(tf.getText());
    }catch(NumberFormatException f){
      tf.setText("Invalid Format");
      return;
    }
  s1 = "";
  tf.setText(s1);
  check=4;
}
if(e.getSource()==bmod){                  //FOR MOD/REMAINDER
  try{
    num1=Double.parseDouble(tf.getText());
    }catch(NumberFormatException f){
      tf.setText("Invalid Format");
      return;
    }
  s1 ="";
  tf.setText(s1);
  check=5;
}
                         //RESULT BUTTON
if(e.getSource()==bequ){          
  try{
    num2=Double.parseDouble(tf.getText());
    }catch(Exception f){
      tf.setText("ENTER NUMBER FIRST ");
      return;
    }
  if(check==1){
    xd = num1+num2;
   tf.setText(num1 + "➕" +num2 + "=" + xd);}
  if(check==2){
    xd =num1-num2;
   tf.setText(num1 + "➖" +num2 + "=" + xd);}
  if(check==3){
    xd =num1*num2;
   tf.setText(num1 + "✖" +num2 + "=" + xd);}
  if(check==4){
    xd =num1/num2; 
   tf.setText(num1 + "➗" +num2 + "=" + xd);}
  
  if(check==5){
    xd =num1%num2;    
  //tf.setText(String.valueOf(xd));
  tf.setText(num1 + "%" +num2 + "=" + xd);}
  s1 = s2 = "";
}
                        //FOR CLEARING THE LABEL and Memory
if(e.getSource()==bAC){
  num1=0;
  num2=0;
  check=0;
  xd=0;
  s1="";
  tf.setText(s1);
   } 

 
    }


    public static void main(String[] args) {
        new MYCALC2();
    }
    
}
