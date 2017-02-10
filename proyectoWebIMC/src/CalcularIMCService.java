

public class CalcularIMCService {
	
	public double calcula (Persona persona)
	{
		double imc = 0;
		
			imc = (persona.getPeso() / (persona.getAltura()*persona.getAltura()));
		
		return imc;
	}
}

