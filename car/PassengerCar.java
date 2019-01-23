package car;

 public class PassengerCar extends Car{
	 
		private  int personCapacity;
		
		public PassengerCar(int number, String brand, double fee,
				int personCapacity) {
			super(number, brand, fee);
			this.personCapacity = personCapacity;
		}



		public int getPersonCapacity() {
			return personCapacity;
		}




		public void setPersonCapacity(int personCapacity) {
			this.personCapacity = personCapacity;
		}


		public String toString(){
 			return number + "\t" + brand + "\t" + fee + "/Ìì\t" + personCapacity + "ÈË\n";
 		}
 	}