
public class RectIf extends MyFrame {
	public void run() {
		int x = 30;
		int color = 0;
		for(int i = 0; i < 10;i++) {
			// Color変数代入
            setColor(color,color,color);
			fillRect(x,80,10,100);
			color += 20;
			x += 20;
		}
	}

}
