package controller;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindowListener implements WindowListener {

	Frame h1;

	public MyWindowListener(Frame lf) {
		this.h1 = lf;
	}

	public void windowOpened(WindowEvent e) {

	}

	public void windowClosing(WindowEvent e) {
//this.dispose(); 
		h1.dispose();

	}

	public void windowClosed(WindowEvent e) {
// TODO Auto-generated method stub 

	}

	public void windowIconified(WindowEvent e) {
// TODO Auto-generated method stub 

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
// TODO Auto-generated method stub 

	}

	@Override
	public void windowActivated(WindowEvent e) {
// TODO Auto-generated method stub 

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
// TODO Auto-generated method stub 

	}
}