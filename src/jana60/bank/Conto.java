package jana60.bank;

public class Conto {
    private int numeroConto;
    private String nomeProprietario;
    private int saldo;
   
     
     public Conto(int numeroConto, String nomeProprietario){
    	 this.numeroConto = numeroConto;
    	 this.nomeProprietario = nomeProprietario;
    	 
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
		return saldo;
	}
	
	public void addMoney(int versamento) {
		saldo += versamento;
	}
	
	public boolean getMoney(int prelievo) {
		if(prelievo <= saldo) {
			saldo -= prelievo;
		    return true;
		}
			 
		else
			return false;
	}
	
	public String toString() {
		return  
	           "Nome proprietario del conto: " + nomeProprietario +
	           "\nNumero conto: " + numeroConto + 
	            "\nSaldo attuale: " + getSaldo();
	}

}
