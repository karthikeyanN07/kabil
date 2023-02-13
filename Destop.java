
public class Destop implements HardWare,SoftWare {
	public void destopModel () {
		System.out.println("123");
	}
	public void hardwareResources() {
		System.out.println("hard disk");

	}
	public void softwareResources() {
		System.out.println("applications");

	}
	public static void main(String[] args) {
		Destop d = new Destop();
		d.destopModel();
		d.hardwareResources();
		d.softwareResources();
	}
		
	}

	
