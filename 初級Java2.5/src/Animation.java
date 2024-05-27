
public class Animation extends MyFrame {
	public void run() {
		setColor(0, 128, 0);
		double y = 50;
		double x = 30;
		while (true) {
			while (y < 178) {
				clear();
				fillRect(x, y, 10, 100);
				x += Math.sin(Math.toRadians(x));
				y += Math.sin(Math.toRadians(y));
				System.out.println(y);
				sleep(0.005);
			}
			while (y >= 50) {
				clear();
				fillRect(x, y, 10, 100);
				x -= Math.sin(Math.toRadians(x));
				y -= Math.sin(Math.toRadians(y));
				System.out.println(y);
				sleep(0.005);
			}
		}
	}
}
