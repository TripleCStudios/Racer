import java.util.Random;

public class HotRod extends Racer {
	//initialize boolean
	private boolean blower;
	
	//default constructor
	public HotRod(){
		super();
		blower = true;
	}
	
	//specific constructor
	public HotRod(String name, int speed, Engine engine, boolean blower){
		super(name, speed, engine);
		setBlower(blower);
		
	}

	public boolean isBlower() {
		return blower;
	}

	public void setBlower(boolean blower) {		
		this.blower = blower;
	}
	
	Random rnd = new Random();
	
	//method for dead vehicle
	public boolean isDead(){
		if (getSpeed() > 50 && rnd.nextDouble() > 0.6)
			if(getEngine().getHorsepower() < 300 && blower == true)
				return false;
			else
				return true;
		else if (getSpeed() > 100 && rnd.nextDouble() > 0.4)
			if (getEngine().getHorsepower() >= 300 && blower == true)
				return true;
			else
				return false;
		else
			return false;		
	}
	
	public String toString(){
		String output = "";
		output += super.toString();
		output += "Blower: " + blower + "\n";
		return output;		
	}
}

