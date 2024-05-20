
public class RectIf extends MyFrame {
	public void run() {
		int x = 30;
		int y = 10;
		setColor(0,128,0);
		for(int i = 0; i < 9;i++) {
			fillRect(x,100,10,y);
			x += 20;
			y += 20;
		}
	}

}
