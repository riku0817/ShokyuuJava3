
public class Animation extends MyFrame {
	public void run() {
		setColor(0, 128, 0);
		int y = 100;
		int x = 30;
		for (int i = 0; i < 3; i++) {
			while (x <= 170) {
				clear();
				fillRect(x, y, 10, 100);
				x += 5;
				sleep(0.03);
			}
			while (x >= 30) {
				clear();
				fillRect(x, y, 10, 100);
				x -= 5;
				sleep(0.03);
			}
		}

	}
}
