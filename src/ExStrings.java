//Exemplo Strings

public class ExStrings{
	public static void main(String[] args) {
		String StrOriginal = "abcde ABCDE FghIj KlMno PqrsT UvWXyz    ";
		String StrMod = StrOriginal.toLowerCase();
		String StrMod2 = StrOriginal.toUpperCase();
		String StrMod3 = StrOriginal.replace('b', '3');
		String StrMod4 = StrMod.replaceAll("abc", "3");
		String StrMod5 = StrMod2.replaceFirst("ABC", "1");
		int StrMod6 = StrMod2.indexOf('K');
		String StrMod7 = StrOriginal.trim();
		String StrMod8 = StrOriginal.substring(2);
		String StrMod9 = StrOriginal.substring(2,9);
		int StrMod10 = StrOriginal.indexOf("K", 10);
		int StrMod11 = StrMod2.lastIndexOf('E');
		String StrOrig2 = "Gosia Vivien Dorgival Christina";
		String [] lista = StrOrig2.split(" ");
		String w1 = lista[0];
		String w2 = lista[1];
		String w3 = lista[2];
		String w4 = lista[3];
		
		System.out.println("Original: -" + StrOriginal + '-');
		System.out.println("Modificado: -" + StrMod + '-');
		System.out.println("Modificado 2: -" + StrMod2 + '-');
		System.out.println("Modificado 3: -" + StrMod3 + '-');
		System.out.println("Modificado 4: -" + StrMod4 + '-');
		System.out.println("Modificado 5: -" + StrMod5 + '-');
		System.out.println("Resultado da Busca: " + StrMod6);
		System.out.println("Resultado: -" + StrMod7 + '-');
		System.out.println("Resultado: -" + StrMod8 + '-');
		System.out.println("Resultado do Recorte: -" + StrMod9 + '-');
		System.out.println("Busca: " + StrMod10);
		System.out.println("Busca Índice: " + StrMod11);
		System.out.println("Palavra 1: " + w1);
		System.out.println("Palavra 1: " + w2);
		System.out.println("Palavra 2: " + w3);
		System.out.println("Palavra 3: " + w4);
		
		
	}
}