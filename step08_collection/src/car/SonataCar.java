package car;
/*
-launch:int       -->���
-mileage:double   -->����

+SonataCar()
+SonataCar(String:model, series:String,launch:int,price:int,mileage:double)
+toString():String
*/
class SonataCar extends Car{
	int launch;
	double mileage;
	

	public SonataCar(String model, String series, int price,int launch, double mileage) {
		super(model, series, price);
	}
	public String toString(){
		return super.toString()+launch+mileage;
	}
	
	
}
