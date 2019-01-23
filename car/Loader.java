package car;

public class Loader extends Car {
	private int personCapacity;
		private double goodCapacity; //����
		

		public Loader(int number, String brand, double fee, int personCapacity,
				double goodCapacity) {
			super(number, brand, fee);
			this.personCapacity = personCapacity;
			this.goodCapacity = goodCapacity;
		}

		public int getPersonCapacity(){
			return personCapacity;
		}
		
		public double getGoodCapacity(){
			return goodCapacity;
		}
		
		public String toString(){
			return number + "\t" + brand + "\t" + fee + "/��\t" + personCapacity + "��" + goodCapacity + "��\n";
		}

}
