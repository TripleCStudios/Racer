import java.util.Random;

public class StreetTuner extends Racer{
	//initialize boolean
		private boolean nitrous;
		
		//default constructor
		public StreetTuner(){
			super();
			nitrous = true;
		}
		
		//specific constructor
		public StreetTuner(String name, int speed, Engine engine, boolean nitrous){
			super(name, speed, engine);
			setNitrous(nitrous);
			
		}

		public boolean isNitrous() {
			return nitrous;
		}

		public void setNitrous(boolean nitrous) {		
			this.nitrous = nitrous;
		}
		
		Random rnd = new Random();
		
		//method for dead vehicle
		public boolean isDead(){
			if (getSpeed() > 50 && rnd.nextDouble() > 0.6)
				if(getEngine().getHorsepower() < 300 && nitrous == true)
					return false;
				else
					return true;
			else if (getSpeed() > 100 && rnd.nextDouble() > 0.4)
				if (getEngine().getHorsepower() >= 300 && nitrous == true)
					return true;
				else
					return false;
			else
				return false;		
		}
		
		public String toString(){
			String output = "";
			output += super.toString();
			output += "Nitrous: " + nitrous + "\n";
			return output;		
		}
}
