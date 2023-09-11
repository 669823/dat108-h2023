package busywait;


public class Main {
	
	private static String melding;
	
	public static void main(String[] args) {
		
		//En tråd som skriver ut melding på skjermen
		Thread printlnTraad = new Thread(){
			@Override
			public void run(){
				while(melding == null){
					try{Thread.sleep(10);}
					 catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(melding);
			}
		};
		
		//En tråd som gir melding en verdi
		
		Thread giVerdiTraad = new Thread(() -> melding = "Hello");
		printlnTraad.start();
		giVerdiTraad.start();


		
			
		
	
		
	}};

