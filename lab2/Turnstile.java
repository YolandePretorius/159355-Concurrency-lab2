package lab2;

public class Turnstile extends Thread{
	
	int id;
	Counter people;
	Bakery bakery;
	
	Turnstile(int id, Counter counter, Bakery b){
		this.id = id;
		this.people = counter;
		this.bakery = b;
	}
	
	public void run(){
		try{
			for(int i = 1; i <= 10; i++){
				Thread.sleep(500);
			
				System.out.println(i + " " + getName());

				bakery.wantToEnterCS(id);
				// this executes inside the critical section
				people.increment();
				// now leave the critical section
				bakery.exitCS(id);
			}
		} catch (InterruptedException ie) {};
	}
}

