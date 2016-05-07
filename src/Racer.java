
public abstract class Racer {
	//variable initialization
	private String name;
	private int speed;
	private Engine Engine;
	
	//default constructor
	public Racer(){
		name = "not given";
		speed = 0;
		this.Engine = new Engine();
	}
	
	//specific constructor
	public Racer(String name, int speed, Engine engine){
		this.name = name;
		this.speed = speed;
		this.Engine = engine;
	}

	public abstract boolean isDead();
	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Engine getEngine() {
		return Engine;
	}

	public void setEngine(Engine engine) {
		Engine = engine;
	}
	//method for displaying engine specifications
	public String toString(){
		String output = "";
		output += "Name: " + name + "\n";
		output += "Speed: " + speed + "\n";
		output += "**Engine Information**" + "\n" + this.Engine.toString();
		return output;
	}
}
