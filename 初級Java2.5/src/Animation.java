
public class Animation extends MyFrame {
	public void run() {
		setColor(0, 128, 0);
		int y = 100;
		int x = 30;
		System.out.println("初回の座標値  " + x + " " + y);
		while (true) {
			while (x <= 170) {
				clear();
				fillRect(x, y, 10, 100);
				x += 5;
				System.out.println("1つ目のループ " + x + " " + y);
				sleep(0.1);
			}
			while (x >= 30) {
				clear();
				fillRect(x, y, 10, 100);
				x -= 5;
				System.out.println("2つ目のループ " + x + " " + y);
				sleep(0.1);
			}
		}

	}
}
