package practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Page1 {
	public void open() {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		JButton btn1 = new JButton("btn1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		
		JButton btn2 = new JButton("btn2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
    
		JButton btn3 = new JButton("btn3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		
		//		111111111
  
		//		ccccccccc
		
		f.setVisible(true);
		
	}
}
