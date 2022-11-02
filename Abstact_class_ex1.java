package abstract_exampels;
// In a class there should be atleast one abstract method in class
abstract class employee{    // abstract key word is used and created class
	abstract  void disdlay();  // abstract key word is used and created method // abstact method should have only declaration
	                           
 }

class junior extends employee{    // we cant create obj for abstract METHOD // SO sub class created and extends USING INHERITANCE
	void display()                 // METHOD CREATED
	{
		System.out.println("Tell me the role");
	}
}
    

public class Abstact_class_ex1 {
 public static void main(String[] args) {
	 junior obj=new junior();     // obj is created for sub class
	obj.display();                //calling method
}
}
