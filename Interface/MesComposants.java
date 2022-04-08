package montp2;
import java.awt.*;

import javax.swing.*;
public class MesComposants extends JFrame{
	static JTextField fname, lname, mail, phone;
	public MesComposants() {
		super("registre");
		JPanel panneau = new JPanel();
		panneau.setLayout(new BorderLayout());
		this.setLocation(350,150);
		this.setSize(700,300);
		panneau.setLayout(new BorderLayout());
		panneau.add(createPan1(), BorderLayout.CENTER);
		panneau.add(createPan2(), BorderLayout.SOUTH);
		this.getContentPane().add(panneau);
		this.pack();
		this.setVisible(true);
	}
    public static JPanel createPan1() {
    	JLabel lab1 = new JLabel("First Name");
    	JLabel lab2 = new JLabel("Last Name");
    	JLabel lab3 = new JLabel("Email D");
    	JLabel lab4 = new JLabel("Phone No");
    	JPanel pan = new JPanel();
    	pan.setLayout(new GridLayout(4,1));
    	fname = new JTextField(15);
    	lname = new JTextField(15);
    	mail = new JTextField(15);
    	phone = new JTextField(15);
    	pan.add(enter(lab1,fname));
    	pan.add(enter(lab2,lname));
    	pan.add(enter(lab3,mail));
    	pan.add(enter(lab4,phone));
    	return pan;
    }
    public static JPanel enter(JLabel lab, JTextField text) {
    	JPanel pan = new JPanel();
    	pan.setLayout(new FlowLayout());
    	pan.add(lab);
    	pan.add(text);
    	return pan;
    }
    public static JPanel createPan2() {
    	JPanel pan = new JPanel();
    	pan.setLayout(new FlowLayout());
    	JButton register = new JButton("Register");
    	JButton clear = new JButton("Clear");
    	pan.add(register);
    	pan.add(clear);
    	register.addActionListener(new Enregistrer());
    	clear.addActionListener(new Enregistrer());
    	return pan;
    }
    
}
