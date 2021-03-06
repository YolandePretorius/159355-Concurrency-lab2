package lab2;

public class Counter {
	volatile int value = 0;

	Counter() {
		System.out.println("TOTAL: " + value);
	}

	void increment() {
  	  int temp = value;   //read[v]
  	  Simulate.HWinterrupt();
  	  value = temp + 1;       //write[v+1]
  	  System.out.println("TOTAL: " + value);
	}
	
	void decrement() {
	  	  int temp = value;   //read[v]
	  	  Simulate.HWinterrupt();
	  	  value = temp - 1;       //write[v+1]
	  	  System.out.println("TOTAL: " + value);
		}
}

class Simulate {
    public static void HWinterrupt() {
        if (Math.random() < 0.5)
           try{
           	Thread.sleep(200);
           } catch(InterruptedException ie) {};
    }
}

