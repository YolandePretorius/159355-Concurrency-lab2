package lab2;

public class Gardens {
	 static Turnstile west;
	 static Turnstile westOut;
	 static Turnstile east;
	 static Turnstile EastOut;
	 static Counter people;
	 static Bakery bakery;
	
	 
	public static void main(String[] args) {
		people = new Counter();
		bakery = new Bakery(4);
	 	
	 
	 	
		west = new Turnstile(0, people, bakery, true); // true : add people to count
	 	westOut = new Turnstile(1, people, bakery,false); // false: remove people from count
	 	east = new Turnstile(2, people, bakery,true);
	 	EastOut = new Turnstile(3, people, bakery,false);
	 
	 	westOut.start();
	 	west.start();
	 	east.start();
	 	EastOut.start();
	}
}

