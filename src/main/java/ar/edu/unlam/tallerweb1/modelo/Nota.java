package ar.edu.unlam.tallerweb1.modelo;

public class Nota {
	private int valor;
	
	public Nota(int valor) {
		if (valor <= 0 || valor > 10) {
			throw new IllegalArgumentException("el rango de la nota es invalido");
		}
		this.valor = valor;
		
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public boolean aprobo() {
		if(this.valor >= 4){
			return true;
		}
		return false;
	}
	public boolean promociono() {
		if(this.valor >= 7){
			return true;
		}
		return false;
	}
}
