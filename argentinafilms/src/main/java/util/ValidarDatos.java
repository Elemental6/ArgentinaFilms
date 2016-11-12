package util;

public final class ValidarDatos {

	public static boolean validarString(String variable){
		boolean valido = true;
		
		if (variable.equals(null)) valido = false;
		if (!variable.matches("[a-zA-Z]+")) valido = false;
		if (variable.length()>100) valido = false;
		
		return valido;
	}
	
	@SuppressWarnings("unused")
	public static boolean validarInteger(String variable){
		boolean valido = true;
		try{
			if (!variable.matches("[-+]?\\d*\\.?\\d+")) valido = false;  
			if (variable.equals(null)) valido = false;
			Integer numero = Integer.parseInt(variable);
		}
		catch (Exception e){
			valido = false;
		}
		
		
		
		return valido;
	}
}
