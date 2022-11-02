package abstract_exampels;
           //abstract class that has abstract and non-abstract methods  
	 abstract class MOBILE{  // ABSTRACT CLASS CREATED WITH KEYWORD ABSTRACT
	    
	     abstract void display();    //ABSTRACT METHOD
	   
	     void openPhone(){//NON ABSTRACT
		   System.out.println("MOBILE IS OPENED USING UNLOCK PATTERN");
		   }  
	 } 
	//Creating a SUB-class which extends SUPER CLASS USING INHERITANCE
	 class SAMSUNG extends MOBILE{  
	 void display(){
		 System.out.println("MOBILE UNLOCKED AND READY TO USE");
		 }  
	} 
	 
	
	 public class abstract_ex2 {  
	 public static void main(String args[]){  
	  MOBILE obj = new SAMSUNG();  // OBJ IS CREATED TO CALL ABSTRACT AND NON-ABSTRACT METHODS  
	  obj.display();  
	  obj.openPhone();  
	 }  
	} 
