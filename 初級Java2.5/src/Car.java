
public class Car {
	int x, y, vx, vy;

	public Car(int x, int y, int vx, int vy) {
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
	}

	public void draw(MyFrame frame) {
		frame.fillRect(85,105,35,30);
		frame.fillRect(70,120,65,20);
		frame.fillOval(77,140,18,18);
		frame.fillOval(110,140,18,18);
	}

	public void move() {
		x += vx;
		y += vy;
	}
}
