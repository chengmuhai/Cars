package car;

public class Goods extends Car {
	
 		private double goodCapacity;

		public Goods(int number, String brand, double fee, double goodCapacity) {
			super(number, brand, fee);
			this.goodCapacity = goodCapacity;
		}

		public double getGoodCapacity() {
			return goodCapacity;
		}
		
		public void setGoodCapacity(double goodCapacity) {
			this.goodCapacity = goodCapacity;
		}
		
		public String toString(){
 			return number + "\t" + brand + "\t" + fee + "/ฬ์\t" + goodCapacity + "ถึ\n";
 		}
 	}


