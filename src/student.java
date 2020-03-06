import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.io.IOException;

public class student extends Frame implements ActionListener {
	String msg;
	Button b1 = new Button("save");

	Label l11 = new Label("Student details", Label.CENTER);
	Label l1 = new Label("Name:", Label.LEFT);
	Label l2 = new Label("age:", Label.LEFT);
	Label l3 = new Label("Sex(M/F):", Label.LEFT);
	Label l4 = new Label("Address:", Label.LEFT);
	Label l5 = new Label("", Label.RIGHT);
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	TextField t1 = new TextField();
	Choice c1 = new Choice();
	CheckboxGroup cbg = new CheckboxGroup();
	Checkbox ck1 = new Checkbox("Male", false, cbg);
	Checkbox ck2 = new Checkbox("Female", false, cbg);
	TextArea t2 = new TextArea("", 180, 90, TextArea.SCROLLBARS_VERTICAL_ONLY);

	public Label getL1() {
		return l1;
	}

	public void setL1(Label l1) {
		this.l1 = l1;
	}

	public Label getL2() {
		return l2;
	}

	public void setL2(Label l2) {
		this.l2 = l2;
	}

	public Label getL3() {
		return l3;
	}

	public void setL3(Label l3) {
		this.l3 = l3;
	}

	public Label getL4() {
		return l4;
	}

	public void setL4(Label l4) {
		this.l4 = l4;
	}

	public Label getL5() {
		return l5;
	}

	public void setL5(Label l5) {
		this.l5 = l5;
	}

	public Choice getC1() {
		return c1;
	}

	public void setC1(Choice c1) {
		this.c1 = c1;
	}

	public Checkbox getCk1() {
		return ck1;
	}

	public void setCk1(Checkbox ck1) {
		this.ck1 = ck1;
	}

	public Checkbox getCk2() {
		return ck2;
	}

	public void setCk2(Checkbox ck2) {
		this.ck2 = ck2;
	}

	public Choice getAge() {
		return age;
	}

	public void setAge(Choice age) {
		this.age = age;
	}

	Choice age = new Choice();

	public student() {
		addWindowListener(new myWindowAdapter());
		setBackground(Color.cyan);
		setForeground(Color.black);
		setLayout(null);
		add(l11);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(t1);
		add(t2);
		add(ck1);
		add(ck2);

		add(age);
		add(b1);
		b1.addActionListener(this);
		add(b1);
		age.add("17");
		age.add("18");
		age.add("19");
		age.add("20");
		age.add("21");
		l1.setBounds(25, 65, 90, 20);
		l2.setBounds(25, 90, 90, 20);
		l3.setBounds(25, 120, 90, 20);
		l4.setBounds(25, 185, 90, 20);
		l5.setBounds(25, 260, 90, 20);
		l11.setBounds(10, 40, 280, 20);
		t1.setBounds(120, 65, 170, 20);
		t2.setBounds(120, 185, 170, 60);
		ck1.setBounds(120, 120, 50, 20);
		ck2.setBounds(170, 120, 60, 20);
		age.setBounds(120, 90, 50, 20);
		b1.setBounds(120, 350, 50, 30);
	}

	public void paint(Graphics g) {
		g.drawString(msg, 200, 450);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("save")) {
			msg = "Student details saved!";
			setForeground(Color.red);
			paint(getGraphics());
		}
	}

	public static void main(String g[]) {
		student stu = new student();
		stu.setSize(new Dimension(500, 500));
		stu.setTitle("student registration");
		stu.setVisible(true);
	}
}

class myWindowAdapter extends WindowAdapter {
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}

	public void actionPerformed(ActionEvent e) {
		

	}

}