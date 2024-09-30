package fase05.L05Exercicio04.dominio;

public static class ContaPoupanca extends ContaBancaria{
	    int dia_de_rendimento;
	    
	    public void calcularNovoSaldo(float taxa){
	        this.saldo *=(1+(taxa/100));
	    }
	}
