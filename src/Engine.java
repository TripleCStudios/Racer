
public class Engine {
	//variable initialization  
		private int cylinders, horsepower;
			
		//default constructor arguments
		public Engine(){
			cylinders = 0;
			horsepower = 0;
		}
			
		//specific constructor argument
		public Engine(int cylinders, int horsepower){
			this.cylinders = cylinders;
			this.horsepower = horsepower;	
		}

		//getters and setters
		public int getCylinders() {
			return cylinders;
		}

		public void setCylinders(int cylinders) {
			this.cylinders = cylinders;
		}
		
		public void setCylinders(String cyl){
			int cylVar = Integer.parseInt(cyl);
			this.cylinders = cylVar;
		}

		public int getHorsepower() {
			return horsepower;
		}

		public void setHorsepower(int horsepower) {
			this.horsepower = horsepower;
		}
		
		public void setHorsepower(String horsP){
			int horsPVar = Integer.parseInt(horsP);
			this.horsepower = horsPVar;
		}
		
		//method for displaying engine specifications
		public String toString(){
			String output = "";
			output += "Number of Cylinders: " + cylinders + "\n";
			output += "Total Horsepower: " + horsepower + "\n";
			return output;
		}
	
	




}
