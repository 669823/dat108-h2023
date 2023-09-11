package waitnotify;


public class Main {
	
	private static String melding;
	
	public static void main(String[] args) {
		Object lock = new Object();
		//En tråd som skriver ut melding på skjermen
		Thread printlnTraad = new Thread(){
			@Override
			public void run(){
				while(melding == null){
					try {
						synchronized(lock){
							lock.wait();
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(melding);
			}
		};
		
		//En tråd som gir melding en verdi
		
		Thread giVerdiTraad = new Thread(() -> {melding = "Hello"; 
		synchronized(lock){
			lock.notifyAll();
		}
	});
		printlnTraad.start();
		giVerdiTraad.start();
		
}
}
		
			
		
	
		
	

