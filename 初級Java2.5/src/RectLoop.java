
public class RectLoop extends MyFrame {
	public void run() {
		int x = 30;
		setColor(0,128,0);
		while(x<=210) {
			fillRect(x,80,10,100);
			x += 20;
		}
		
	}

}
