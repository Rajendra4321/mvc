package controller;

import java.awt.event.*;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.RegFrame;
import view.LoginFrame;

public class RegistrationController implements ActionListener {

	RegFrame rf;

	public RegistrationController(RegFrame RegFrame) {
		rf = RegFrame;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == rf.getBtNewUser()) {
			String uname = rf.getTxtUserame().getText();
			String pass = rf.getTxtPassword().getText();
			String city = rf.getTxtcity().getText();
			System.out.println(" " + uname + " " + pass + " " + city);
//System.out.println("hello"); 

			model.User u1 = new model.User();
			u1.setUsername(uname);
			u1.setPassword(pass);
			u1.setCity(city);
			db.DAO d1 = new db.DAO();

			if (d1.register(u1)) {
				JOptionPane.showMessageDialog(rf, "Registration Successful");
				rf.dispose();
				new LoginFrame();
				System.out.println("Registration successful");
			} else {
				JOptionPane.showMessageDialog(rf, "Registration Failed");
				System.out.println("Registration Failed");
			}
			d1.register(u1);
		}
		if (e.getSource() == rf.getBtClear()) {
//System.out.println("clear"); 

			rf.getTxtUserame().setText("\0");
			rf.getTxtPassword().setText("\0");
			rf.getTxtcity().setText("\0");
		}

	}

}