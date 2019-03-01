package com;

public class Test40_Extends {

	public static void main(String[] args) {
	
	}

}


class Person{
	
	public String age;
	public String sex;
	
	protected void say() {
		System.out.println("----说话----");
	}
}

class Teacher extends Person{
	
	public String subject;
	
	protected void teach() {
		System.err.println("----讲课----");
	}
}

class Student extends Person{
	public String grade;
	protected void learn() {
		System.out.println("----学习----");
	}
}

class ClassTeacher extends Teacher{
	
	public String className;
	
	protected void manager() {
		System.out.println("----管理班级----");
	}
}

class ClassRoom {
	public int stuNum;
	public String loaction;
	
}

