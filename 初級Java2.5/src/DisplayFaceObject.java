
public class DisplayFaceObject extends MyFrame {
	public void run() {
		Face[] faces = new Face[1];
		faces[0] = new Face(50, 50, 10, 5);
		for (int i = 0; i < 30; i++) {
			clear();
			for (int j = 0; j < faces.length; j++) {
				faces[j].draw(this);
				faces[j].move();
			}
			sleep(0.1);
		}
	}
}
