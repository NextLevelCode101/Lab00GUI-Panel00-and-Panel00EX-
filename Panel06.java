import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel06 extends JPanel
   {
   private JLabel label;         //private field
   public Panel06()
      {
       setLayout(new FlowLayout());

       label = new JLabel("0.0000000000000000");
       label.setFont(new Font("Serif", Font.BOLD, 20));
       label.setForeground(Color.BLUE);
       add(label);

       JButton button = new JButton("Random");  //local
       button.addActionListener(new Listener());
       add(button);
      }
      private class Listener implements ActionListener
       {
       public void actionPerformed(ActionEvent e)
         {
          double x = Math.random()*10;            //local variable
          label.setText("" + x);
         }
      }
   }


