package labTotayEx3;

public class RunTemperature {
	public static void main(String[] args) {
		Temperature temperature= new Temperature();
		temperature.setCTemp(12.5);
	System.out.println(temperature.getCTemp());
	System.out.println(temperature.getFtemp(0));
	System.out.println(temperature.getKtemp(0));
	}

}
