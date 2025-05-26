package Module_6_Core_Java;
/*W.A.J.P. Create an abstract class 'Parent' with a method 'message'. It 
has two subclasses each having a method with the same name 
'message' that prints "This is first subclass" and "This is second 
subclass" respectively. 
Call the methods 'message' by creating an object for each subclass.
 * 
 */

//Abstract class with abstract method
abstract class Parent {
 abstract void message();
}

//First subclass that extends Parent
class FirstSubclass extends Parent {
 @Override
 void message() {
     System.out.println("This is first subclass");
 }
}

//Second subclass that extends Parent
class SecondSubclass extends Parent {
 @Override
 void message() {
     System.out.println("This is second subclass");
 }
}
 

public class AbstractClass {
	public static void main(String[] args) {
		
		Parent sub1=new FirstSubclass();
		sub1.message();
		
		Parent sub2=new SecondSubclass();
		sub2.message();
	}

}
