package exDI_IOC;

public class Car implements Moveable {
	public void go() {
		System.out.println("Car goes...");
		System.out.println(".....");
		System.out.println(".....");
	}

	public void engineOn() {
		System.out.println("Car engine started");
	}

	public void engineOff() {
		System.out.println("Car engine stopped");
	}
}
