
public class RectIf extends MyFrame {
	public void run() {
		int x = 0;
		int size = 10;
		setColor(0,128,0);
		for(int i = 0; i < 9;i++) {
			fillRect(x,x,size,size);
			x += size;
			size += 10;
			
			
		}
	}

}
