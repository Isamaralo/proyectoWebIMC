

public class Persona {
	
	private double peso;
	private double altura;
	private TipoIMCService imc;
	
	
	public Persona(double peso, double altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public TipoIMCService getImc() {
		return imc;
	}
	public void setImc(TipoIMCService imc) {
		this.imc = imc;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.imc.toString();
	}
	
}
