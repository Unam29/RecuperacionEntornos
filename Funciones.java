package pruebas;

public class Funciones {

	// Funcion 1
	
	public static Boolean funcion1(String cadena) {
		int contador = 0;
		for (int x = 0; x < cadena.length(); x++) {
			if ((cadena.charAt(x) == 'a') || (cadena.charAt(x) == 'e') || (cadena.charAt(x) == 'i')
					|| (cadena.charAt(x) == 'o') || (cadena.charAt(x) == 'u')) {
				contador++;
			}
		}
		if (contador >= 28) {
			return true;
		} else {
			return false;
		}
	}

	// Funcion 2
	
	public static Boolean funcion2(String cad, String cad2) {
		int consonante = 0;
		for (int x = 0; x < cad.length(); x++) {
			char letra = cad.charAt(x);
			if (consonantecad(letra)) {
				consonantes++;
			}
		}
		int consonante2 = 0;
		for (int x = 0; x < cad2.length(); x++) {
			char letra = cad2.charAt(x);
			if (consonantecad(letra)) {
				consonante++;
			}
		}
		if (consonante > consonante2) {
			return true;
		} else if (consonante < consonante2) {
			return false;
		} else {
			return null;
		}
	}

	public static boolean consonantescadenas(char letra) {
		return "bcdfghjklmnpqrstvwxyz".contains(String.valueOf(letra).toLowerCase());
	}

	// Funcion 3
	
	public static int funcion3(int[] num) {
		int suma = 0;
		for (int a = 0; i < num.length; a++) {
			if (num[a] >= 10 && num[a] <= 28) {
				suma += num[a];
			}
		}

		return suma;
	}

	// Funcion 4
	
	public static String funcion4(int[] notas) {
		int media = 0;
		for (int i = 0; i < notas.length; i++) {
			media = media + notas[i];
		}
		media = media / notas.length;

		if (media >= 0 && media <= 4) {
			return "insuficiente";
		} else if (media >= 5 && media < 6) {
			return "suficiente";
		} else if (media >= 6 && media < 7) {
			return "bien";
		} else if (media >= 7 && media < 9) {
			return "notable";
		} else if (media >= 9 && media <= 10) {
			return "sobresaliente";
		} else {
			
			return  null;
		}
	}

	// Funcion 5
	
	public static int funcion5(String caracter, int num1, int num2) {
		int resp = 0;
		String caractersuma = "+";
		String caracterresta = "-";
		String caractermulti = "*";

		if (caracter == caractersuma) {
			resp = num1 + num2;
		} else if (caracter == caracterresta) {
			resp = num1 - num2;
		} else if (caracter == caractermulti) {
			resp = num1 * num2;
		} else {
			resp = 0;
		}
		return resp;
	}
}
