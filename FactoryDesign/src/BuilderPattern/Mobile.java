package BuilderPattern;

public class Mobile {
	Boolean touchScreenAvailable;
	Boolean enabled5G;
	Integer ram;
	Integer cameraPixel;
	String brandName;
	String deviceName;
	
	public Mobile(MobileBuilder builder) {
		this.brandName=builder.brandName;
		this.deviceName=builder.deviceName;
		this.cameraPixel = builder.cameraPixel;
    	this.enabled5G = builder.enabled5G;
    	this.touchScreenAvailable = builder.touchScreenAvailable;
    	this.ram = builder.ram;
	}
	public void printDetails() {
		System.out.println("Mobile "+deviceName+" of brand "+brandName+" with following features : touch screen enabled "+touchScreenAvailable+",5G enabled "+enabled5G+", ram "+ram+", camera pixel "+cameraPixel+".");
	}
	public static class MobileBuilder{
		Boolean touchScreenAvailable;
		Boolean enabled5G;
		Integer ram;
		Integer cameraPixel;
		String brandName;
		String deviceName;
		
		public MobileBuilder(String brandName, String deviceName) {
			this.brandName=brandName;
			this.deviceName=deviceName;
		}
		public MobileBuilder setTouchScreenAvailable(Boolean value) {
			this.touchScreenAvailable=value;
			return this;
		}
		public MobileBuilder setEnabled5G(Boolean value)
	}
}
