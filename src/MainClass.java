import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args) {
		// Create an Racer array object using the default constructor
		Racer[] racList = new Racer[3];	
		
		//create a new Racer and collect information
		racList[0] = new HotRod();
		collectRacerInformation(racList[0]);
		displayRacerInformation(racList[0]);
		racList[1] = new StreetTuner();
		collectRacerInformation(racList[1]);
		displayRacerInformation(racList[1]);
		racList[2] = new HotRod();
		collectRacerInformation(racList[2]);
		displayRacerInformation(racList[2]);		
	} 
	
	public static void collectRacerInformation(Racer rac)
	{
		//Collect the general racer data
		rac.setName(getInput("Name of Racer: "));
		
		boolean badInput = true;
		String strSpeed = "";
		int speed = 0;
		do{
			try{
				strSpeed = JOptionPane.showInputDialog("Speed: ");
				speed = Integer.parseInt(strSpeed);
				rac.setSpeed(speed);
				badInput = false;
			}
			catch (Exception ex){
				JOptionPane.showMessageDialog(null, strSpeed + " is not an integer", "Error", JOptionPane.PLAIN_MESSAGE);
			}
		}
		while (badInput);
		badInput = true;
		
		String strCyl = "";
		int cylinders = 0;
		do{
			try{
				strCyl = JOptionPane.showInputDialog("Number of Cylinders: ");
				cylinders = Integer.parseInt(strCyl);
				rac.getEngine().setCylinders(cylinders);
				badInput = false;
			}
			catch (Exception ex){
				JOptionPane.showMessageDialog(null, strCyl + " is not an integer", "Error", JOptionPane.PLAIN_MESSAGE);
			}
		}
		while (badInput);
		badInput = true;
		
		String strHors = "";
		int horsepower = 0;
		do{
			try{
				strHors = JOptionPane.showInputDialog("Total Horsepower: ");
				horsepower = Integer.parseInt(strHors);
				rac.getEngine().setHorsepower(horsepower);
				badInput = false;
			}
			catch (Exception ex){
				JOptionPane.showMessageDialog(null, strHors + " is not an integer", "Error", JOptionPane.PLAIN_MESSAGE);
			}
		}
		while (badInput);
		badInput = true;
		
		//determine if Hot Rod, and if so ask for existence of blower
		if(rac.getClass() == HotRod.class){			
			HotRod hr = (HotRod)rac;
			hr.setBlower(Boolean.parseBoolean(getInput("Blower present?")));
		}
		//if a Street Tuner, ask for existence of Nitrous
		else if(rac.getClass() == StreetTuner.class){
			StreetTuner st = (StreetTuner)rac;
			st.setNitrous(Boolean.parseBoolean(getInput("Nitrous present?")));
		}
		
	}

	public static void displayRacerInformation(Racer rac)
	{
		if(rac.getClass() == HotRod.class){
			displayDivider("Hot Rod Racer Information");			
			System.out.println(rac.toString());									
		}
		else if(rac.getClass() == StreetTuner.class){
			displayDivider("Street Tuner Racer Information");
			System.out.println(rac.toString());
		}
		rac.isDead();
		if(rac.isDead()== true)
			System.out.println("Is the Racer dead? " + "Yes");
		else
			System.out.println("Is the Racer dead? " + "No");
	}
	
	
	public static void displayDivider(String outputTitle)
	{
		System.out.println("**************** " + outputTitle +" ****************\n");	
	}
	
	//method getInput
	public static String getInput(String inputType)
	{
		String strInput = "";
		strInput = JOptionPane.showInputDialog("Enter " + inputType);
		return strInput;		
	}
	
} 
