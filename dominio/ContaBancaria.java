package fase05.L05Exercicio04.dominio;

	public static class ContaBancaria{
	    String cliente;
	    int num_conta;
	    float saldo;
	    public void sacar(float valor){
	        if(valor < this.saldo){
	            this.saldo -=valor;
	            
	        }
	    }
	    public void mostrarSaldo(){
	        System.out.println("O saldo eh " + this.saldo);
	    }
	    public void depositar(float valor){
	        this.saldo+=valor;
	    }
	}
