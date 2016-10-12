package exDI_IOC;

public class Driver {
	private Moveable m;

//	//의존성 주입(생성자를 통해서)
//	Driver(Moveable m) {
//		this.m = m;
//	}
	//의존성 주입(Setter를 통해서)
	public void setMoveable(Moveable m) {
		this.m = m;
	}
	public void drive() {
		m.engineOn();
		m.go();
		m.engineOff();
	}
}
