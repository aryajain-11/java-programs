import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class AddsGui {
    public static void main(String[] args) {
        Addition obj = new Addition();
    }
    
}
class Addition extends JFrame implements ActionListener{
    JTextField t1 ,t2;
    JButton b;
    JLabel l1 ;
    public Addition(){
         t1 = new JTextField();
         t2 = new JTextField();
        
         b = new JButton("Add");

         l1 = new JLabel("Result");
        

         add(t1);
         add(t2);
         add (b);
         add(l1);

         b.addActionListener(this);
        
         setLayout((new FlowLayout()));
         setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        int  num1 = Integer.parseInt(t1.getText());
        int num2 =  Integer.parseInt(t2.getText());

        int value = num1 + num2;
        l1.setText(value + "");

    }
}
