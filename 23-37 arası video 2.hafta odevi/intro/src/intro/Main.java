package intro;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello world!");
		
		// de�i�ken isimlendirmeleri javada camelCase yaz�l�r
		String ortaMetin= "ilginizi �ekebilir";
		String altMetin="vade s�resi";
		
		System.out.println(ortaMetin);
		
		int vade = 12;
		
		double dolarDun=18.20;
		double dolarBugun=18.20;
		
		boolean dolarDustuMu=false;
		
		String okYonu="";
		
		if(dolarBugun<dolarDun) {
			okYonu="down.swg";
			System.out.println(okYonu);
		} else if(dolarBugun>dolarDun) { okYonu="up.swg";
		System.out.println(okYonu);}
		
		else {
			okYonu="equal.swg";
			System.out.println(okYonu);
			
		
		}
		
		String[] krediler= {"H�zl� Kredi","Maa��n� Halkbanktan"	, "Mutlu Emekli"};
		
		System.out.println(krediler[0]);
		System.out.println(krediler[1]);
		System.out.println(krediler[2]);
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		
		

	}

}
