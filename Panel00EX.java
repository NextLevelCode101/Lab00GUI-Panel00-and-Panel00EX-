import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel00EX extends JPanel
   {

    private JLabel label;         //private field
    public Panel00EX()
      {

         setLayout(new FlowLayout());
         label = new JLabel("0.0");
         label.setFont(new Font("Serif", Font.BOLD, 25));
         label.setForeground(Color.RED);
         add(label);

         JButton button = new JButton("Random");
         JButton newA = new JButton("Test");
         JButton newB = new JButton ("Fun");
         JButton newC = new JButton("Summer");
         JButton newD = new JButton("Last Day of School");

         button.addActionListener(new Listener());
         newA.addActionListener(new nList());

         newB.addActionListener(new nList());
         newC.addActionListener(new nList());
         newD.addActionListener(new nList());

         add(button);
         add(newA);
         add(newB);
         add(newC);
         add(newD);
      }

      private class Listener implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            double x = Math.random();  //local variable
            label.setText(" " + x);
         }
      }


      private class nList implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            double x = Math.random()*100;
            label.setText("" + x);
         }
      }
   }
