package view;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionListener;
import controller.*;

public class LoginFrame extends Frame {
	Button BtNewUser, BtLogin, BtClear;
	Label lbUserName, lbPassword;
	TextField txtUserame, txtPassword;

	public LoginFrame() {
		txtUserame = new TextField(20);
		txtPassword = new TextField(20);

		BtNewUser = new Button("New User");
		BtLogin = new Button("Login");
		BtClear = new Button("Clear");
		lbUserName = new Label("Enter the Username");
		lbPassword = new Label("Enter Password");

		this.add(lbUserName);
		this.add(txtUserame);
		this.add(lbPassword);
		this.add(txtPassword);

		this.add(BtNewUser);
		this.add(BtLogin);
		this.add(BtClear);
		txtPassword.setEchoChar('*');
		this.setBounds(200, 200, 250, 250);
		this.setResizable(false);
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		this.setTitle("Login Page");

		MyWindowListener mw = new MyWindowListener(this);
		this.addWindowListener(mw);

		LoginController lc = new LoginController(this);
		BtLogin.addActionListener(lc);
		BtNewUser.addActionListener(lc);
		BtClear.addActionListener(lc);
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

}