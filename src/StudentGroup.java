import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		
			if(students==null)
			{
			throw new IllegalArgumentException();
			}
		
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0 && index>students.length)
		{
			throw new IllegalArgumentException();
		}
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(student==null)
		{
		throw new IllegalArgumentException();
		}
		if(index<0 && index>students.length)
		{
			throw new IllegalArgumentException();
		}
		students[index]=student;
		
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student==null)
		{
		throw new IllegalArgumentException();
		}
		int l=students.length+1;
		Student[] temp=new Student[l];
		int i;
		temp[0]=student;
		for(i=0;i<l-1;i++)
		{
			temp[i+1]=students[i];
		}
		Student[] students=new Student[l];
		for(i=0;i<l;i++)
		{
			students[i]=temp[i];
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student==null)
		{
		throw new IllegalArgumentException();
		}
		students[students.length-1]=student;

		
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		
		if(student==null)
		{
		throw new IllegalArgumentException();
		}
		if(index<0 && index>students.length)
		{
			throw new IllegalArgumentException();
		}
		Student s=students[index];
		students[index]=student;
		students[students.length-1]=s;

	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index<0 && index>students.length)
		{
			throw new IllegalArgumentException();
		}
		students[index]=null;
		int i=index,l=students.length;
		Student[] students=new Student[l-1];
		while(i<l-1)
		{
			students[i]=students[++i];
		}

	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(students==null)
		{
		throw new IllegalArgumentException();
		}
		int i,l=students.length;
		
		for(i=0;i<l;i++)
			{
			if(students[i].compareTo(student)==0)
			{
				students[i]=null;
			}
			}

		Student[] students=new Student[l-1];
		while(i<l-1)
		{
			students[i]=students[++i];
		}
		
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index<0 && index>students.length)
		{
			throw new IllegalArgumentException();
		}
		int i,l=students.length,c=0;


		Student[] temp=new Student[l];
		for(i=0;i<=index;i++)
		{
			temp[i]=students[i];
		}
		
		for(i=index+1;i<l;i++)
			{
			students[i]=null;
			c++;
			}
		Student[] students=new Student[l-c];
		for(i=0;i<=index;i++)
		{
			students[i]=temp[i];
		}
		
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		if(students==null)
		{
		throw new IllegalArgumentException();
		}
		int i,x=0,l=students.length;
		int c=0;
		
		for(i=0;i<l;i++)
			{
			if(students[i].compareTo(student)==0)
			{
				x=i;
			}
			}
		for(i=x+1;i<l;i++)
		{
		students[i]=null;
		c++;
		}
		Student[] temp=new Student[l];
		for(i=0;i<=x;i++)
		{
			temp[i]=students[i];
		}
		Student[] students=new Student[l-c];
		for(i=0;i<=x;i++)
		{
			students[i]=temp[i];
		}
		
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(index<0 && index>students.length)
		{
			throw new IllegalArgumentException();
		}

		
		int i,l=students.length,c=0;

		int x=index;
		Student[] temp=new Student[l];
		for(i=0;i<l;i++)
		{
			temp[i]=students[x];
			x++;
		}
		
		for(i=0;i<index;i++)
			{
			students[i]=null;
			c++;
			}
		Student[] students=new Student[l-c];
		for(i=0;i<l-c;i++)
		{
			students[i]=temp[i];
		}
		
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		if(students==null)
		{
		throw new IllegalArgumentException();
		}
		int i,x=0,l=students.length;
		int c=0;
		
		for(i=0;i<l;i++)
			{
			if(students[i].compareTo(student)==0)
			{
				x=i;
			}
			}
		
		Student[] temp=new Student[l];
		for(i=x;i<l;i++)
		{
			temp[i]=students[i];
		}
		
		for(i=0;i<x;i++)
		{
		students[i]=null;
		c++;
		}
		Student[] students=new Student[l-c];
		for(i=0;i<l-c;i++)
		{
			students[i]=temp[i];
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		
		int l=students.length;
		int i,j;  

		Student[] temp=new Student[l];
        for(i=0; i < l; i++){  
                for(j=1; j < (l-i); j++){  
                         if(students[j-1].getAvgMark() > students[j].getAvgMark())
                         {  
                                //swap elements  
                                temp[0] = students[j-1];  
                                students[j-1] = students[j];  
                                students[j] = temp[0];  
                        }  
                         
                }  
        }  
		

	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here

		for(int i=0;i<students.length;i++)
		{
			
		}
		
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
