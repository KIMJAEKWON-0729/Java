package car;

public class Car {
	private String model;
	private String series;
	private int price;
	public Car(String model, String series, int price) {
		super();
		this.model = model;
		this.series = series;
		this.price = price;
		}
	public String toString() {
		return model+series+price;
	}
	
	
}
