package labTotayEx3;

public class Temperature {
	private double cTemp;
	public Temperature() {
		this.cTemp=1;
	}
	public  Temperature(double cTemp) {
		this.cTemp=cTemp;
	}
    public void setCTemp(double value) {
    	this.cTemp=value;
		
		
	}
    public double getCTemp() {
    	return this.cTemp;
    }
   
    public double getFtemp(double fTemp) {
    	return fTemp=(cTemp*9/5)+32;
    }
	
    public double getKtemp(double kTemp) {
    	return kTemp=cTemp+273.15;
    }

}
