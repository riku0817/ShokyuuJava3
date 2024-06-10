import java.util.Vector;

public class DisplayCarsTrainsTrucks extends MyFrame {
	public void run() {
		Vector<Vehicle> vehicles = new Vector<Vehicle>();
		vehicles.add(new Car(60, 30, 3, 0));
		vehicles.add(new Car(90, 80, -2, 0));
		vehicles.add(new Train(120, 140, 4, 0));
		vehicles.add(new Train(80, 180, -3, 0));
		vehicles.add(new Truck(80, 120, 2, 0));
		vehicles.add(new Truck(160, 190, 3, 0));
		for (int i = 0; i < 30; i++) {
			clear();
			for (int j = 0; j < vehicles.size(); j++) {
				vehicles.get(j).draw(this);
				vehicles.get(j).move();
			}
			sleep(0.1);
		}
	}
	
}
