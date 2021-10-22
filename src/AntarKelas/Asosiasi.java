package AntarKelas;
class Person {
	 private String name;
	 Person(String name) {
	    this.name = name;
	  }
	  
	  public String getPersonName() {
		  return this.name;
	  }
}

class KTP {
	  private int NoKTP;
//	  Passport(String name, long id) {
//	    super(name, id);
//	    this.personName = name;
//	
	 KTP(int noKTP) {
		  this.NoKTP = noKTP;
	 } 
	 public int getNoKTP() {
		 return this.NoKTP;
	 }
}	
public class Asosiasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Person name = new Person("Divya");
	    KTP noKTP = new KTP(1233344);
	    
	    System.out.println(name.getPersonName());
	    System.out.println("No KTP : " + noKTP.getNoKTP());
	}

}
