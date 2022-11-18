package jana60.bank;

public class Conto {
    private int numeroConto;
    private String nomeProprietario;
    private int saldo;
    private int versamento;
    private int prelievo;
     
     public Conto(int numeroConto, String nomeProprietario, int versamento, int prelievo){
    	 this.numeroConto = numeroConto;
    	 this.nomeProprietario = nomeProprietario;
    	 this.versamento = versamento;
    	 this.prelievo = prelievo;
    	 
    	 saldo = 0;
    	 
     }

	public int getNumeroConto() {
		return numeroConto;
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}
	
	public int getSaldo() {
		if(saldo < 0) {
			System.out.println("Non è stato possibile effettuare il prelievo dato che il conto è vuoto");
		}
		return saldo;
	}
	
	public int addMoney() {
		return saldo + versamento;
	}
	
	public int getMoney() {
		return saldo - prelievo;
	}
	
	public String toString() {
		return "-------------------------------------------" + 
	           "\nNome proprietario del conto: " + nomeProprietario +
	           "\nNumero conto: " + numeroConto + "\nTotale versato: " + versamento +
	           "\nTotale prelevato: " + getMoney() + "\nSaldo attuale: " + getSaldo();
	}

}
