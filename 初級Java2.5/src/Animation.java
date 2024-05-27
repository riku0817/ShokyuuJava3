
public class Animation extends MyFrame {
	public void run() {
		setColor(0, 128, 0);
		int y = 50;
		int ylocation = y;
		int x = 30;
		while (true) {
			while (x <= 350) {
				clear();
				fillRect(x, y, 10, 100);
				x += 5;
				sleep(0.03);
			}
			while (y <= ylocation + 50) {
				clear();
				fillRect(x, y, 10, 100);
				y += 5;
				sleep(0.03);
			}
			ylocation = y;
			while (x >= 30) {
				clear();
				fillRect(x, y, 10, 100);
				x -= 5;
				sleep(0.03);
			}
			while (y <= ylocation + 50) {
				clear();
				fillRect(x, y, 10, 100);
				y += 5;
				sleep(0.03);
			}
			ylocation = y;
		}

	}
}
