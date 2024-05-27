
public class Animation extends MyFrame{
	public void run() {
		setColor(0,128,0);
		int x = 30;
		int y = 170;
		while(y >= 70) {
			clear();
			fillRect(x,y,10,100);
			y -= 5;
			sleep(0.1);
		}
		while(x <= 180) {
			clear();
			fillRect(x,y,10,100);
			x += 5;
			sleep(0.1);
		}
	}
}
