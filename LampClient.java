package labTotay;

public class LampClient {
	public static void main(String[] args) {
		Battery battery = new Battery();
		FlashLamp flashlamp=new FlashLamp();
		
		flashlamp.setBattery(battery);
		flashlamp.turnOn();
		System.out.println(battery.getEnergy());
		flashlamp.turnOff();
		
		for(int i = 0; i< 10; i++) {
			flashlamp.turnOn();
		}
		System.out.println(battery.getEnergy());
		
	}

}
