package MultiThreading;

public class Launch1 {

	public static void main(String[] args) {

		
		System.out.println("Hello1");
	 
		Thread t= Thread.currentThread();//store Thread type t
		//Thread[main,5,main]--> name , priority, which stack currently running
		System.out.println(t); //Thread[main,5,main]
		
		String name = Thread.currentThread().getName();
		System.out.println(name); //main
		/*
		t.setName("Nazeer"); //set(change) the thread name
		t.setPriority(4);
		System.out.println(t); //Thread[Nazeer,4,main]  */
			
		

	}

}
