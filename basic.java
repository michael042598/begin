import java.awt.*;
import javax.swing.*;

public class basic{

	public static void main(String args[]){
		JFrame frame = new JFrame(" Sample ");
				
		JButton button = new JButton("Submit"); 
		button.setBounds(50, 250, 200, 30);
		frame.add(button);
		
			JTextField t1,t2, t3;  
		t1=new JTextField(" Field 1 ");  
		t1.setBounds(50,100, 200,30);  
		t2=new JTextField(" Field 2 ");  
		t2.setBounds(50,150, 200,30);
		t3=new JTextField(" Field 3 ");
		t3.setBounds(50,200,200,30);
		frame.add(t1); frame.add(t2); frame.add(t3);
		frame.setSize(400,400);  
		frame.setLayout(null);  
		frame.setVisible(true);  
		
		JLabel label = new JLabel("This is my first GUI ", SwingConstants.CENTER);
		frame.getContentPane().add(label, BorderLayout.CENTER);
		
		frame.setSize(300,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		System.out.println("Printing gui:");
	}
}
