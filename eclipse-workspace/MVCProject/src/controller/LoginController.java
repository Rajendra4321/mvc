package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import db.DAO;
import model.User;
import view.LoginFrame;
import view.RegFrame;

public class LoginController implements ActionListener {

	LoginFrame lf;

	public LoginController(LoginFrame LoginFrame) {
		lf = LoginFrame;
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == lf.getBtNewUser()) {
			lf.dispose();
			new RegFrame();
		}
		if (e.getSource() == lf.getBtClear())

		{

			lf.getTxtUserame().setText("\0");
			lf.getTxtPassword().setText(" \0");
		}

		if (e.getSource() == lf.getBtLogin()) {
			User u1 = new User();
			u1.setUsername(lf.getTxtUserame().getText());
			u1.setPassword(lf.getTxtPassword().getText());

			DAO d1 = new DAO();
			u1 = d1.Validate(u1);

			if (u1 != null) {
				JOptionPane.showMessageDialog(lf, "Login Successful");
			} else {
				JOptionPane.showMessageDialog(lf, "Invalid Login");
			}
		}
	}
}
