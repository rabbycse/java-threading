import java.util.Scanner;

public class Main {

	static Scanner myScanner = new Scanner(System.in);
	private static OurThread thread1 = new OurThread("Child 1",0,1,500, true);
	private static OurThread thread2 = new OurThread("Child 2",100,10,1000, true);
	private static OurThread thread3 = new OurThread("Child 3",1000,100,2000, true);
    
	public static void main(String[] args) {
		
		thread1.start();
		thread2.start();
		thread3.start(); 
		
		System.out.println("Please write a Command: ");
		
		String commandString = myScanner.nextLine();
		
		while(!commandString.toLowerCase().equals("exit")){
			if(commandString.equals("1")) {
				System.out.println("Counter in Thread 1: "+thread1.getCounter());
				threadStatus();
			}else if(commandString.contentEquals("2")) {
				System.out.println("Counter in Thread 2: "+thread2.getCounter());
				threadStatus();
			}else if(commandString.contentEquals("3")) {
				System.out.println("Counter in Thread 3: "+thread3.getCounter());
				threadStatus();
			}else if(commandString.contentEquals("1S")) {
				thread1.stopThread();
				System.out.println("Thread 1 Stopped");
				threadStatus();
			}else if(commandString.contentEquals("2S")) {
				thread2.stopThread();
				System.out.println("Thread 2 Stopped");
				threadStatus();
			}else if(commandString.contentEquals("3S")) {
				thread3.stopThread();
				System.out.println("Thread 3 Stopped");
				threadStatus();
			}else {
				System.out.println("Please give a proper command !");
			}
			commandString = myScanner.nextLine();
	
		}
		
		//---------------Thread Join-------------
		while(thread1.isAlive()) {
			
		}
		System.out.println("Thread 1 is stopped");
		
        while(thread2.isAlive()) {
			
		}
		System.out.println("Thread 2 is stopped");
        
		while(thread3.isAlive()) {
			
		}
		System.out.println("Thread 3 is stopped");
		
		System.out.println("Main Thread Exiting");

	}
	
	//--------------------Thread Alive--------------
	private static void threadStatus() {
		System.out.println("Thread 1 is alive: "+thread1.isAlive());
		System.out.println("Thread 2 is alive: "+thread2.isAlive());
		System.out.println("Thread 3 is alive: "+thread3.isAlive());
	}

}
