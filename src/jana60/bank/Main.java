package jana60.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Inserisci nome proprietario del conto: ");
    	String nomeProprietario = sc.nextLine();
    	
    	System.out.print("Inserisci numero conto: ");
    	int numeroConto = sc.nextInt();
    	
    	System.out.print("Quanto vuole versare? ");
    	int versamento = sc.nextInt();
    	
    	System.out.print("Quanto vuole prelevare? ");
    	int prelievo = sc.nextInt();
    	
    	Conto c = new Conto(numeroConto, nomeProprietario, versamento, prelievo);
    	System.out.println(c);
	}
}
