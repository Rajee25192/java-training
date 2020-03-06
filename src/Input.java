import java.applet.Applet;

import java.awt.*;

import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class Input extends Applet implements ActionListener

{

	Label lab1;

	TextField t1, t2;

	int num;

	double d;

	TextField text = new TextField(20);
	 TextArea area = new TextArea(10,20);
	 
	public void init()

	{

		lab1 = new Label("Enter an the quantity and price");

		add(lab1);

		t1 = new TextField(5);

		add(t1);

		t2 = new TextField(10);

		add(t2);

		t2.addActionListener(this);

	}

	public void paint(Graphics g)

	{

		g.drawString("The quantity is " + num + " and the cost is " + d, 10, 100);

	}

	public void actionPerformed(ActionEvent e)

	{

		num = Integer.parseInt(t1.getText());

		d = Double.parseDouble(t2.getText());

		repaint();

	}

	  public class WriteText {
	      WriteText() { 
	         try {
	            String str = text.getText();
	            
	            if(str.equals("")) { 
	               JOptionPane.showMessageDialog(null, "Please enter the file name!");
	               text.requestFocus();
	            } else { 
	               File f = new File(str);
	               System.out.println(f);
	               if(f.exists()) {
	                  BufferedWriter out = new BufferedWriter(new FileWriter(f,true));
	                  if(area.getText().equals("")) {
	                     JOptionPane.showMessageDialog (null,"Please enter your text!");
	                     area.requestFocus();
	                  } else {
	                     out.write(area.getText());
	                     if(f.canWrite()) {
	                        JOptionPane.showMessageDialog(null, "Text is written in "+str);
	                        text.setText("");
	                        area.setText("");
	                        text.requestFocus();
	                     } else {
	                        JOptionPane.showMessageDialog(null, "Text isn't written in "+str);
	                     }
	                     out.close();
	                  }
	               } else {
	                  JOptionPane.showMessageDialog (null,"File not found!");
	                  text.setText("");
	                  text.requestFocus();
	               }
	            }
	         } catch(Exception x) {
	            x.printStackTrace();
	         }
	      }
	   }
	}

