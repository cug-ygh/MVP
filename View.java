package View;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;

import Model.Model;
import Presenter.Presenter;

public class View extends Canvas implements Observer{
	Presenter presenter;
	int stepNumber = 0;
	
	public View(Presenter presenter) {
		this.presenter=presenter;
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(presenter.xPosition, presenter.yPosition,presenter.BALL_SIZE,
				presenter.BALL_SIZE);
				presenter.showStatus("Step " + (stepNumber++) + ", x = "
				+ presenter.xPosition + ", y = " + presenter.yPosition);
	}
	
	public void update(Observable obs, Object arg) {
		repaint();
	}
}
