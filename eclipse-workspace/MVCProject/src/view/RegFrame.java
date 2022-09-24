package view;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

import controller.MyWindowListener;
import controller.RegistrationController;
import view.RegFrame;

public class RegFrame extends Frame {
	Button BtNewUser, BtLogin, BtClear;
	Label lbUserName, lbPassword, lbcity;
	TextField txtUserame, txtPassword, txtcity;

	public RegFrame() {
		txtUserame = new TextField(20);
		txtPassword = new TextField(20);
		txtcity = new TextField(20);
		BtNewUser = new Button("Register");
		BtLogin = new Button("Login");
		BtClear = new Button("Clear");
		lbUserName = new Label("Enter the Username");
		lbPassword = new Label("Enter Password");
		lbcity = new Label("Enter city");
		this.add(lbUserName);
		this.add(txtUserame);
		this.add(lbPassword);
		this.add(txtPassword);
		this.add(lbcity);
		this.add(txtcity);
		this.add(BtNewUser);
		this.add(BtLogin);
		this.add(BtClear);
		txtPassword.setEchoChar('*');
		this.setBounds(200, 200, 250, 250);
		this.setResizable(false);
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		this.setTitle("Regiter Page");

		MyWindowListener mw = new MyWindowListener(this);
		this.addWindowListener(mw);
		RegistrationController rc = new RegistrationController(this);
		BtNewUser.addActionListener(rc);
		BtClear.addActionListener(rc);
// Frame.addWindowListener(WindowListener); 
	}

	public Button getBtNewUser() {
		return BtNewUser;
	}

	public void setBtNewUser(Button btNewUser) {
		BtNewUser = btNewUser;
	}

	public Button getBtLogin() {
		return BtLogin;
	}

	public void setBtLogin(Button btLogin) {
		BtLogin = btLogin;
	}

	public Button getBtClear() {
		return BtClear;
	}

	public void setBtClear(Button btClear) {
		BtClear = btClear;
	}

	public Label getLbUserName() {
		return lbUserName;
	}

	public void setLbUserName(Label lbUserName) {
		this.lbUserName = lbUserName;
	}

	public Label getLbPassword() {
		return lbPassword;
	}

	public void setLbPassword(Label lbPassword) {
		this.lbPassword = lbPassword;
	}

	public Label getLbcity() {
		return lbcity;
	}

	public void setLbcity(Label lbcity) {
		this.lbcity = lbcity;
	}

	public TextField getTxtUserame() {
		return txtUserame;
	}

	public void setTxtUserame(TextField txtUserame) {
		this.txtUserame = txtUserame;
	}

	public TextField getTxtPassword() {
		return txtPassword;
	}

	public void setTxtPassword(TextField txtPassword) {
		this.txtPassword = txtPassword;
	}

	public TextField getTxtcity() {
		return txtcity;
	}

	public void setTxtcity(TextField txtcity) {
		this.txtcity = txtcity;
	}
}