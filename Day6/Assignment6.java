public class Assignment6 {
	    String Brand;
	    String ManufacturingCountry;
	    int Ports;
	    int Voltage;
	    int Bandwidth;

	    public Switcher(int Ports, int Voltage,int Bandwidth, String Brand,String ManufacturingCountry) {
	            this.Ports=Ports;
	            this.Voltage=Voltage;
	            this.Brand=Brand;
	            this.Bandwidth=Bandwidth;
	            this.ManufacturingCountry=ManufacturingCountry;
	    }
	    public void On() {
	        System.out.println("Switched Turned On");
	    }
	    public void Off() {
	        System.out.println("Switched Turned Off");
	    }
	    public void Disabled() {
	        System.out.println("Switched Disabled");
	    }
	    public void display() {
	        System.out.println("Ports: "+this.Ports);
	        System.out.println("Voltage: "+this.Voltage);
	        System.out.println("Bandwidth: "+this.Bandwidth);
	        System.out.println("Brand: "+this.Brand);
	        System.out.println("ManufacturingCountry: "+this.ManufacturingCountry);

	    }
	}