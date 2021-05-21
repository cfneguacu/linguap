package linguap;

public class Linguap {

	public static void main(String[] args) {
		
		String frase = "um filme legal";
				
		String resultado = "";
		
		for(int i = 0; i< frase.length(); i++) {
						
			if(frase.charAt(i)!=' ') {
				resultado = resultado+"p"+frase.charAt(i);
			}else {
				resultado = resultado+" ";
			}
		}
		
		System.out.print(resultado);
		
	}

}
