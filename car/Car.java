package car;


import java.util.Scanner;

public class Car {  
		int number;
		String brand;
		double fee;
		double goodCapacity; // ÔØ»õ
		int personCapacity; //ÔØÈËÊı
		
		
		public Car() {
			
		}


		public Car(int number, String brand, double fee) {
		
			this.number = number;
			this.brand = brand;
			this.fee = fee;
			
		}


		public int getNumber() {
			return number;
		}


		public void setNumber(int number) {
			this.number = number;
		}


		public String getBrand() {
			return brand;
		}


		public void setBrand(String brand) {
			this.brand = brand;
		}


		public double getFee() {
			return fee;
		}


		public void setFee(double fee) {
			this.fee = fee;
		}


		public double getGoodCapacity() {
			return goodCapacity;
		}


		public void setGoodCapacity(double goodCapacity) {
			this.goodCapacity = goodCapacity;
		}


		public int getPersonCapacity() {
			return personCapacity;
		}


		public void setPersonCapacity(int personCapacity) {
			this.personCapacity = personCapacity;
		}

		

		
}
		