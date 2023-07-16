package constructor;

public class Person {
	String Name;
	int Age;
	
	// one method create a constructor
/*	Person(String a, int b) 
	 {
	   System.out.println("Hay, My name is "+a);  	
	   System.out.println("i'm "+a +" year old");	 
	 }
	*/
	
	Person(String a, int b){
		this.Name=a;
		this.Age=b;
	}
	
	void printPersion() {
		System.out.println("Hyy, My name is "+Name);  	
		System.out.println("i'm "+Age +" year old");	 
		 	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person obj=new Person("Bharat veer", 23);
        Person obj1=new Person("Sagar choudhary", 21);
        Person obj2=new Person("Kunal choudhary", 15);
        obj.printPersion();
        obj1.printPersion();
        obj2.printPersion();
	}

}
