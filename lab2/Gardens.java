package lab2;

public class Gardens {
	 static Turnstile west;
	 static Turnstile east;
	 static Counter people;
	 static Bakery bakery;
	 
	public static void main(String[] args) {
		people = new Counter();
		bakery = new Bakery(2);
	 	
	 	west = new Turnstile(0, people, bakery);
	 	east = new Turnstile(1, people, bakery);
	 	
	 	west.start();
	 	east.start();
	}
}

