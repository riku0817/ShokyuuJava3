
public class Start {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MyFrame frame1=new MyFrame();
        frame1.setLocation(400,100);
        frame1.setSize(640,480);
        
        MyFrame frame2=new MyFrame();
        frame2.setLocation(0,100);
        
        MyFrame frame3=new RectFrame();
        frame3.setLocation(50,300);
        
        MyFrame frame4=new RectFrame();
        frame4.setLocation(450,300);
        
        int x = 2;
        int y = 3;
        System.out.println(x*y);
	}

}
