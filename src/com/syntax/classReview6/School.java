package com.syntax.classReview6;

public class School {
	
	public static void main(String[] args) {
		
		Student student1=new Student();
		
		student1.name="Samira";
		student1.lastName="Pashayeva";
		student1.address="Virginia";
		
		student1.studentId=101;
		student1.age=25;
		student1.grade='A';
		
		/*subject cannot be resolved or 
		 *student1.subject="Java";
		 */
		
		Student student2=new Student();
		student2.name="Omid";
		student2.lastName="Mahmoodi";
		student2.address="California";
		student2.age=18;
		student2.studentId=102;
		student2.grade='A';
		student2.study();
		student2.doHomework();
		student1.printInfo();
		System.out.println("------------------");
		
		student1.study();
		student1.doHomework();
		
		student1.takeSubject("Java");
		student2.takeSubject("Biology");
		
	}

}
