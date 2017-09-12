import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		
		Student o1=new Student(21,"joy",new Date(),97);
		Student o2=new Student(22,"man",new Date(),95);
		
		StudentGroup sg=new StudentGroup(2);
		sg.setStudent(o1,0);
		sg.setStudent(o2,1);
		sg.bubbleSort();
		
	//	sg.remove(1);
	
	}

}
