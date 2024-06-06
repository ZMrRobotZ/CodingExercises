package lezioni;

public class Artifact {
	
	int serial_number;
	int century;
	String culture;
	
	static int count = 0;
	
	public Artifact(int serial_number) {
		this.serial_number = serial_number;
	}
	
	public Artifact(int serial_number, String culture, int century) {
		this.serial_number = serial_number;
		this.culture = culture;
		this.century = century;
	}
	
	public Artifact(int serial_number, String culture) {
		this.serial_number = serial_number;
		this.culture = culture;
	}
	
	public static void main(String[] args) {
		Artifact vaso = new Artifact(2121121);
		Artifact anfora = new Artifact(213341, "Aztechi");
		Artifact pettine = new Artifact(21234, "Romano", 12);
		
		System.out.println("Possediamo un vaso con SN: " + vaso.serial_number);
		System.out.println("Possediamo un'anfora con SN: " + anfora.serial_number + " dell'era " + anfora.culture);
		System.out.println("Possediamo un'anfora con SN: " + pettine.serial_number + " dell'era " + pettine.culture + " del secolo: " + pettine.century);
		
	}

}
