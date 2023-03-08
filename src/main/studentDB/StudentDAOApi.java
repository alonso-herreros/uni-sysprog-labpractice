package studentDB;

import java.util.ArrayList;

public interface StudentDAOApi {
		
	public Student[] findAll();
	
	public float minGrade();

	public float maxGrade();
	
	public float avgGrade();

}
