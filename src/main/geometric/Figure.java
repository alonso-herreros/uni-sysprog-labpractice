package geometric;

public abstract class Figure {

	private String name;// Name of the figure
	
	// Constructor of the figure
	public Figure(String name) {
		this.name = name;
	}
	
	// Calculates the area of a figure
	abstract public double area();
	
	// Indicates if the figure is regular or not
	abstract public boolean isRegular();
	
	// Gets the name of the figure
	protected String getName() {
		return name;
	}
	
	// Sets the name of the figure
	protected void setName(String name) {
		this.name = name;
	}
}
