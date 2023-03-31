import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Next extends JFrame implements ActionListener{
JPanel p1;
JLabel l1;
ImageIcon bg1;
JButton b1,b2;
public Next(){
    this.setTitle("Welcome");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(800, 800);
    this.setResizable(false);
 

    p1 = new JPanel();
    p1.setLayout(null);
    p1.setBounds(0, 0, 800, 800);
    p1.setVisible(true);
    
    

    l1 = new JLabel("Welcome");
    l1.setBounds(300,250,300,200);
    l1.setFont(new Font("Aireal",Font.BOLD,55));
    l1.setForeground(Color.ORANGE);
    l1.setVisible(true);
    p1.add(l1);
    this.add(p1);
    this.setVisible(true);


    b1 = new JButton("BACK?");
    b1.setBounds(176,650,120,50);
    b1.setFont(new Font("Arial", Font.BOLD, 16));
    b1.setBackground(Color.ORANGE);
    b1.setForeground(Color.WHITE);
    b1.setVisible(true);
    p1.add(b1);

    b2 = new JButton("EXIT!");
    b2.setBounds(520,650,120,50);
    b2.setFont(new Font("Arial", Font.BOLD, 16));
    b2.setBackground(Color.ORANGE);
    b2.setForeground(Color.WHITE);
    b2.setVisible(true);
    p1.add(b2);
    this.add(p1);
    this.add(p1);
    this.setVisible(true);
    b1.addActionListener(this);
    b2.addActionListener(this);


}
public void actionPerformed(ActionEvent ae)
		{
            if(ae.getSource()==b1)
			{
	           LogIn n = new LogIn();
               this.setVisible(false);
               n.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				System.exit(0);
			}

}
}
