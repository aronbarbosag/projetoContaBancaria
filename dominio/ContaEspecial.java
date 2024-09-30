package dominio;

	public static class ContaEspecial extends ContaBancaria{
	    float limite;
	public ContaEspecial(String cliente, int num_conta, float saldo, float limite) {
        super(cliente, num_conta, saldo);
        this.limite = limite;
    }
	    public void sacar(float valor){
	        if(this.saldo>this.limite){
	            this.saldo-=valor;
	        }
	        else{
	            System.out.println("Erro ao Sacar, Seu limite eh: " + limite);
	        }
	    }
	}
}
