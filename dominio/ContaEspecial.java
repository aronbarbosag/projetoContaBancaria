package fase05.L05Exercicio04.dominio;

	public static class ContaEspecial extends ContaBancaria{
	    float limite;
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
