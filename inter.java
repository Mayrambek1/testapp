import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.*;

class inter{
	//public static void main(String args[]){
	JTextField field;
		inter(){

		listener list = new listener(this);
		field = new JTextField();
		field.setBounds(10,10, 500, 45);
		
		JButton button1 = new JButton("1");
		button1.setBounds(10,60, 70, 45);
		button1.addActionListener(list);
		
		JButton button2 = new JButton("2");
		button2.setBounds(90,60, 70, 45);
		button2.addActionListener(list);
		
		JButton buttonPlus = new JButton("+");
		buttonPlus.setBounds(170,60, 70, 45);
		buttonPlus.addActionListener(list);
		
		JButton buttonEqulas = new JButton("=");
		buttonEqulas.setBounds(250,60, 70, 45);
		buttonEqulas.addActionListener(list);
		
		JButton buttonC = new JButton("C");
		buttonC.setBounds(330,60, 70, 45);
		buttonC.addActionListener(list);
		
		JButton button1x = new JButton("1/x");
		button1x.setBounds(410,60, 70, 45);
		button1x.addActionListener(list);
		
		JButton buttonSqrt = new JButton("Sqrt");
		buttonSqrt.setBounds(10,110, 70, 45);
		buttonSqrt.addActionListener(list);
		
		JFrame frame = new JFrame();
		frame.setTitle("App by BI-1-19");
		frame.setSize(550, 600);
		frame.setLocation(150,150);
		frame.setLayout(null);
		frame.add(field);
		frame.add(button1);
		frame.add(button2);
		frame.add(buttonPlus);
		frame.add(buttonSqrt);
		frame.add(button1x);
		frame.add(buttonEqulas);
		frame.add(buttonC);
		frame.setVisible(true);
	}
}