package Model;

import java.util.Observable;

public class Model extends Observable {
	 public final int BALL_SIZE = 20;
	 public int xPosition = 0;
	 public int yPosition = 0;
	 public int xLimit;
	 public int yLimit;
     int xDelta = 6;
     int yDelta = 4;
	
	public void makeOneStep() {
		xPosition += xDelta;
		if (xPosition < 0) {
			xPosition = 0;
			xDelta = -xDelta;
	}
		if (xPosition >= xLimit) {
			xPosition = xLimit;
			xDelta = -xDelta;
	}
		yPosition += yDelta;
		if (yPosition < 0 || yPosition >= yLimit) {
			yDelta = -yDelta;
			yPosition += yDelta;
	}
		setChanged();
		notifyObservers();
	}
}
