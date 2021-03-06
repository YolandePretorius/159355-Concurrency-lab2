package lab2;

public class Turnstile extends Thread{
	
	int id;
	Counter people;
	Bakery bakery;
	Boolean EnterGate;
	
	Turnstile(int id, Counter counter, Bakery b, Boolean EnterGate){ // enter gate == true then increment people
		this.id = id;
		this.people = counter;
		this.bakery = b;
		this.EnterGate = EnterGate;
	}
	
	public void run(){
		try{
			
			
			for(int i = 1; i <= 4; i++){
				Thread.sleep(500);
			
				System.out.println(i + " " + getName());
								
				bakery.wantToEnterCS(id);
				// this executes inside the critical section
					if(EnterGate == true) {
						people.increment();
					}
					if((EnterGate == false) && (people.value > 0)){
						 people.decrement();
					 }			
			
				 }
				// now leave the critical section
				bakery.exitCS(id);
			
		} catch (InterruptedException ie) {};
	}
}

