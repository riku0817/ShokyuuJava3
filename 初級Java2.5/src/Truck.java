
public class Truck extends Vehicle {
	public Truck(int x, int y, int vx, int vy) {
		super(x, y, vx, vy);
	}

	public void draw(MyFrame frame) {
		frame.fillRect(x + 100, y + 105, 30, 30);
		frame.fillRect(x + 10, y + 130, 120, 25);
		frame.fillOval(x + 20, y + 155, 15, 15);
		frame.fillOval(x + 35, y + 155, 15, 15);
		frame.fillOval(x + 110, y + 155, 15, 15);
	}
}
