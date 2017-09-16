package demo;

import java.util.Arrays;
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
		
		if(students.length==0)
		return null;
		
		else
			return Arrays.copyOf(students,students.length);
	}
	@Override
	public void setStudents(Student[] students) {
		
		// Add your implementation here
		this.students=students;
		
		
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		//return null;
		return this.students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		this.students[index]=student;
		
		
		
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		int k;
		int len=this.students.length;
		for( k=len;k>0;k--) 
			this.students[k]=this.students[k-1];
			this.students[0]=student;
		    this.students[k+1]=null;
		
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		int len=this.students.length;
		this.students[len] = student;
		this.students[len+1]=null;
		
		
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		int k=0;
		int len = this.students.length;
		for(k=len;k>index;k--)
			 this.students[k]=this.students[k-1];
		     this.students[index]=student;
		     this.students[len+1]=null;
		     
		
		
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		int k;
		int len= this.students.length;
		for(k=index;k<len;k++)
			  this.students[k]=this.students[k+1];
		      this.students[len+1]=null;
		
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		int z;
		int j;
		int i =this.students.length;
		for(j=0;j<i;j++) {
			if(this.students[j].equals(student)) {
				
				   break;
		}
		}
		for(z=j;z<i;z++) {
			this.students[z]=this.students[z+1];
		}
		
		this.students[i+1]=null;
		
		
		
		
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		
		int k=0;
		int len = this.students.length;
		/*
		for(k=index;k<len;k++)
			 this.students[k]=this.students[k+1];
		     //this.students[index]=student;
		     this.students[len+1]=null;
		     
		*/
		this.students[index+1]=null;
		
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		
		int len = this.students.length;
		int j;
		for(j=0;j<len;j++) {
			if(this.students[j].equals(student)) 
				break;
				
		
		
		
		}
		this.students[j+1]=null;
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		//students[]= Arrays.copyOfRange(student,0,index-1);
		int j=this.students.length;
		for(int i=0; i<= j-index;i++)
		this.students[i]=this.students[i+index+1];
		this.students[j+1]=null;
 
		
		
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		int i=this.students.length;
		int index=0;
             for(int j=0;j<i;j++)
		if((this.students[j]).equals(student))
		{index=j;
		break;
                }
		int j=this.students.length;
		for(i=0;i<=j-index;i++)
		this.students[i]=this.students[i+index+1];
		this.students[i+1]=null;
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		
		
		
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
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
