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
	public void setStudents(Student[] students) throws IllegalArgumentException {
		// Add your implementation here
		if(students==null)
		{	
			throw new IllegalArgumentException();
		}
		else
		{
			int l = students.length;
			for(int i=0;i<l;i++)
			{
				this.students[i] = students[i];
			}
		}
	}

	@Override
	public Student getStudent(int index) throws IllegalArgumentException {
		// Add your implementation here
		if(index < 0 || index >=students.length)
			throw new IllegalArgumentException();
		else
		 return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		if(index<0 || index >= students.length || student==null)
			throw new IllegalArgumentException();
		else
			students[index] = student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student == null)
			throw new IllegalArgumentException();
		else
		{
			Student temp[] = new Student[students.length+1]; 
			temp[0] = student;
			for(int i=1;i<students.length+1;i++)
			{
				temp[i] = students[i-1];
			}
			
			students = null;
			students = temp;
			
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student == null)
			throw new IllegalArgumentException();
		else
		{
			Student temp[] = new Student[students.length+1];
			
			for(int i=0;i<students.length;i++)
			{
				temp[i] = students[i];
			}
			temp[students.length] = student;
			
			students = null;
			students = temp;
		}
	}

	@Override
	public void add(Student student, int index) {
		if(student == null)
			throw new IllegalArgumentException();
		else
		{
			Student temp[] = new Student[students.length+1];
			
			for(int i=0;i<index;i++)
			{
				temp[i] = students[i];
			}
			temp[index] = student;
			
			for(int i=index+1;i<students.length+1;i++)
			{
				temp[i] = students[i];
			}
			students = null;			
			students = temp;
		}
	}

	@Override
	public void remove(int index) {

		// Add your implementation here
		if(index <0 || index > students.length)
			throw new IllegalArgumentException();
		else
		{
			int x = 0;
			Student temp[] = new Student[students.length-1];
			
			for(int i=0;i<index;i++)
			{
				temp[x] = students[i];
				x++;
			}
			
			for(int i=index+1;i<students.length;i++)
			{
				temp[x] = students[i];
				x++;
			}
			
			students = null;
			
			students = temp;
		}
		
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(student == null)
			throw new IllegalArgumentException();
		else
		{
			int z=0,c=0;
			for(z=0;z<students.length;z++)
			{
				if(students[z] == student)
				{
					break;
				}
				else
				{
					c++;
				}
			}
			if(c == students.length)
			{
				throw new IllegalArgumentException("Student not exist");
			}
			
			int x=0;
	        Student s[] = new Student[students.length-1];
			
			for(int i=0;i<z;i++)
			{
				s[x] = students[i];
				x++;
			}
			
			for(int i=z+1;i<students.length;i++)
			{
				s[x] = students[i];
				x++;
			}
			
			students = null;
			
			students = s;
			
			
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		
		
		if(index < 0 || index >= students.length)
			throw new IllegalArgumentException();
		else
		{
			Student temp[] = new Student[index+1];
			for(int i=0;i<=index;i++)
			{
				temp[i] = students[i];
			}
            students = null;
			students = temp;
		
		}
		
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		if(student == null)
			throw new IllegalArgumentException();
		else
		{
			int i=0;
			for(i=0;i<students.length;i++)
			{
				if(students[i] == student)
				{
					break;
				}
			}
			
			Student temp[] = new Student[i+1];
			for(int j=0;j<=i;j++)
			{
				temp[j] = students[j];
			}
            students = null;
			
			students = temp;
			
			
		}
		
		
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(index < 0 || index >= students.length)
			throw new IllegalArgumentException();
		else
		{
			Student temp[] = new Student[students.length-index-1];
			int c=0;
			for(int i=index;i<students.length;i++)
			{
				temp[c] = students[i]; 
				c++;
			}
			
            students = null;
			
			students = temp;
			
		}
		
		
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		
		if(student == null)
			throw new IllegalArgumentException();
		else
		{
			int i=0;
			for(i=0;i<students.length;i++)
			{
				if(students[i] == student)
				{
					break;
				}
			}
			
			
			Student temp[] = new Student[students.length-i-1];
			int c=0;
			for(int j=i;j<students.length;j++)
			{
				temp[c] = students[i]; 
				c++;
			}
			
            students = null;
			
			students = temp;
			
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		for(int i=0;i<students.length;i++)
		{
			for(int j=0;j<students.length-i;j++)
			{
				if( students[j].compareTo(students[j+1]) > 0)
				{
						Student temp = students[j];
						students[j] = students[j+1];
						students[j+1] = temp;
				}
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		
		if(date == null)
			throw new IllegalArgumentException();
		
			int length= 0;
			for(int i=0;i<students.length;i++)
			{
				if(students[i].getBirthDate().before(date))
				{
					length++;
				}
			}
			
			Student temp[] = new Student[length];
			int c=0;
			for(int i=0;i<students.length;i++)
			{
				if(students[i].getBirthDate().before(date))
				{
					temp[c] = students[i];
					c++;
				}
			}
			
		return temp;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		
		if(firstDate == null || lastDate == null)
			throw new IllegalArgumentException();
		
			int length= 0;
			for(int i=0;i<students.length;i++)
			{
				if(students[i].getBirthDate().after(firstDate) &&students[i].getBirthDate().before(lastDate) )
				{
					length++;
				}
			}
			
			Student temp[] = new Student[length];
			int c=0;
			for(int i=0;i<students.length;i++)
			{
				if(students[i].getBirthDate().after(firstDate) && students[i].getBirthDate().before(lastDate) )
				{
					temp[c] = students[i];
					c++;
				}
			}
			
		return temp;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		
		
		if(date==null)
			throw new IllegalArgumentException();
		
		Date d1=new Date(date.getDate()+days);
			int c=0,c1=0;
			if(date==null)
			{	
				throw new IllegalArgumentException();
			
			}
			for(int i=0;i<students.length;i++){
				if(students[i].getBirthDate()==date || students[i].getBirthDate()==d1 ){
					c++;
				}
			}
			Student[] s =  new Student[c];
			for(int i=0;i<students.length;i++){
				if(students[i].getBirthDate()==date || students[i].getBirthDate()==d1 ){
					s[c1]=students[i];
					c1++;
				}
			}
			return s;
		
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		if(indexOfStudent==0)
			throw new IllegalArgumentException();
		Date d=new Date();
		long age=(d.getTime()/(1000 * 60 * 60 * 24*365))-(students[indexOfStudent].getBirthDate().getTime()/(1000 * 60 * 60 * 24*365));
		return (int)age;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		
		int cnt=0;
		for(int i=0;i<students.length;i++)
		{
			int age1=this.getCurrentAgeByDate(i);
			if(age1==age)
			{
				cnt++;
			}
		}
		Student[] s=new Student[cnt];
		cnt=0;
		for(int i=0;i<students.length;i++)
		{
			int age1=this.getCurrentAgeByDate(i);
			if(age1==age)
			{
				s[i]=students[i];
			}
		}
		return s;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}
}
