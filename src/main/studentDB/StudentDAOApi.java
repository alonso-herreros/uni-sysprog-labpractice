package studentDB;

public interface StudentDAOApi {
		
	public Student[] findAll();
	
	public float minGrade();

	public float maxGrade();
	
	public float avgGrade();

}
