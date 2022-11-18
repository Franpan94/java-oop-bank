package jana60.bank;



public class Main {
    public static void main(String[] args) {
    	
    	Conto c = new Conto(12345678, "Rocco");
    	System.out.println(c);
    	System.out.println("--------------------");
    	
    	c.addMoney(100);
    	System.out.println(c);
    	System.out.println("--------------------");
    	
    	boolean risultatoPrelievo = c.getMoney(50);
    	System.out.println("Esito prelievo: " + risultatoPrelievo);
    	System.out.println(c);
    	System.out.println("--------------------");
    	
    	risultatoPrelievo = c.getMoney(60);
    	System.out.println("Esito prelievo: " + risultatoPrelievo);
    	System.out.println(c);
	}
}
