
public class Car {
	int x, y, vx, vy;

	public Car(int x, int y, int vx, int vy) {
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
	}

	// 85   105
	public void draw(MyFrame frame) {
		frame.fillRect(x, y, 35, 30);
		frame.fillRect(x - 15, y+15, 65, 20);
		frame.fillOval(x - 8, y+35, 18, 18);
		frame.fillOval(x + 25, y+35, 18, 18);
	}

	public void move() {
		x += vx;
		y += vy;
	}
}
