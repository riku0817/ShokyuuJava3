
public class RectIf extends MyFrame {
	public void run() {
		int x = 30;
		int y = 20;
		int z= 250;
		setColor(0,128,0);
		for(int i = 0; i < 10;i++) {
			fillRect(x,100,10,200);
			x += 20;
			
			
		}
		setColor(255,255,255);
		for(int i = 0; i < 10;i++) {
			fillRect(y,z,30,30);
			y += 20;
			z -= 10;
		}
		
	}

}
