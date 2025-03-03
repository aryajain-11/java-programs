import javax.swing.JFrame;
import javax.swing.*;
public class Swingdemo {
    public static void main(String[] args) {
        abc obj = new abc();
        obj.setVisible(true);
        obj.setSize(400, 400);
        
    }
    
}
class abc extends JFrame {
    public abc(){
        
       
        JLabel l = new JLabel("Hello world ");
        JLabel l1 = new JLabel("Welcome ");
        add(l);
        add(l1);

        setLayout(getLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

