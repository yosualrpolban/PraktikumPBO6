package AntarKelas;

/* Komposisi dan depedency */

class Cpu {
	  private String nama;
	  public Cpu(String nama) {
	    this.nama = nama;
	  }
	  public String getNama() {
	    return this.nama;
	  }
}

class Mouse {
	  private String merk;
	  public Mouse(String merk) {
	    this.merk = merk;
	  }
	  public String getMerk() {
	    return this.merk; 
	  }
}

class Keyboard {
	  private String jenis;
	  public Keyboard(String jenis) {
	    this.jenis = jenis; 
	  }
	  public String getJenis() {
	    return this.jenis;
	  }
	}

 class Komputer {
	  private String merk;
	  private String tipe;
	  private Mouse mouse;
	  private Keyboard keyboard;
	  private Cpu cpu;
	  public Komputer(String merk, String tipe) {
	    this.merk = merk;
	    this.tipe = tipe;
	  }
	  public void addKomponen(Mouse mouse, Keyboard keyboard, Cpu cpu) {
	    this.mouse = mouse;
	    this.keyboard = keyboard;
	    this.cpu = cpu;
	  }
	  
	  public void getKomponen() {
		  System.out.println("Merk : "+ merk);
		  System.out.println("Type : "+ tipe);
		  System.out.println("Mouse : "+ mouse.getMerk());
		  System.out.println("Keyboard : "+ keyboard.getJenis());
		  System.out.println("CPU : "+ cpu.getNama());
	  }
}

public class Komposisi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Komputer komputer = new Komputer("Asus","A450CC");
		    // membuat komponen nya
		    komputer.addKomponen(new Mouse("Logitec"), new Keyboard("Logitec"), new Cpu("intel i7"));
		    
		    komputer.getKomponen();
	}
}
