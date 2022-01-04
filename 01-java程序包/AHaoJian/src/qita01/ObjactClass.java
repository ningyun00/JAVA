package qita01;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;

public class ObjactClass {

	public static void main(String[] args) {
		int a = 1;
		Boy b = new Boy();
		b.name = "Œ‰";
		b.money = 0;
		
		JFrame f = new JFrame();
		f.setSize(1000,1000);
		
		f.setLayout(null);
		
		JButton button = new JButton();
		button.setSize(250,250);
		button.setText("×¬Ç®");
		button.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 b.makeMoney();
					boolean A = b.marry(3);
					System.out.println(b.name+"½ñÈÕ×¬Ç®£º"+b.money+"Ôª");
			}		
			 
		});f.add(button);
		f.setVisible(true);
	}

}
