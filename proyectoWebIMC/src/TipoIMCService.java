

public enum TipoIMCService {DESNUTRIDO, BAJOPESO, NORMAL, SOBREPESO, OBESO;
	
	public static TipoIMCService traduceIMC (double imc){
		
		TipoIMCService devuelvo = null;
		
			if (imc<16)
				devuelvo = TipoIMCService.DESNUTRIDO;
			else if (imc>=16 && imc<18.5)
					devuelvo = TipoIMCService.BAJOPESO;
				else if (imc>=18.5 && imc<25)
						devuelvo = TipoIMCService.NORMAL;
					else if (imc>=25 && imc <31)
							devuelvo = TipoIMCService.SOBREPESO;
					else devuelvo = TipoIMCService.OBESO;
			
		return devuelvo;
	}

}
