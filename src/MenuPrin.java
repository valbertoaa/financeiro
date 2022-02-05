import java.util.Locale;
import java.util.Scanner;


public class MenuPrin {
	
	public void casting (int a, int b) {
		
		double resultado = a / b;
		double resultadoC = (double) a / b;
		
		System.out.printf("divisão de inteiros resultado inteiro %.2f\n", resultado);
		System.out.printf("divisão de inteiros usando casting resultado configurado %.2f\n", resultadoC);
	}
	
    public void apresentacao (String nome, int idade, double renda) {
    	
    	System.out.printf("%s com %d anos de idade ganha %.2f\n", nome, idade, renda);
    	
    }
    
	public void valorFormatado(double valor, int tamanho) {
		
		System.out.printf("%."+tamanho+"f\n",valor);
		
	}
	
	public void valorFormatado(double valorA, double valorB, int tamanho) {
		
		System.out.printf("Primeiro valor: %."+tamanho+"f, segundo valor: %."+tamanho+"f\n",valorA, valorB);
		
	}
	
	
	public void tipoDeDado(){
		
		System.out.println("Tipos de dados em Java: \n" +
	            "\nMenor Byte: " + Byte.MIN_VALUE +
	            "\nMaior Byte: " + Byte.MAX_VALUE +
	            "\nMenor Short Int: " + Short.MIN_VALUE +
	            "\nMaior Short Int: " + Short.MAX_VALUE +
	            "\nMenor Int: " + Integer.MIN_VALUE +
	            "\nMaior Int: " + Integer.MAX_VALUE +
	            "\nMenor Long: " + Long.MIN_VALUE +
	            "\nMaior Long:" + Long.MAX_VALUE +
	            "\nMenor Float: " + Float.MIN_VALUE +
	            "\nMaior Float: " + Float.MAX_VALUE +
	            "\nMenor Double: " + Double.MIN_VALUE +
	            "\nMaior Double: " + Double.MAX_VALUE);
		
	}
	
    public void declaracaoDeVariavel() {
    	
		byte tipoByte = 127;
	    short tipoShort = 32767;
	    char tipoChar = 'C';
	    float tipoFloat = 2.6f;
	    double tipoDouble = 3.59;
	    int tipoInt = 2147483647;
	    long tipoLong = 9223372036854775807L;
	    boolean tipoBooleano = true;
	    
	    System.out.println("Valor do tipoByte = " + tipoByte);
	    System.out.println("Valor do tipoShort = " + tipoShort);
	    System.out.println("Valor do tipoChar = " + tipoChar);
	    System.out.println("Valor do tipoFloat = " + tipoFloat);
	    System.out.println("Valor do tipoDouble = " + tipoDouble);
	    System.out.println("Valor do tipoInt = " + tipoInt);
	    System.out.println("Valor do tipoLong = " + tipoLong);
	    System.out.println("Valor do tipoBooleano = " + tipoBooleano);		
    	
    	
    }

	public static void main(String[] args) {

		String nome;
		int    idade;
		double salario;
		
		MenuPrin principal = new MenuPrin();		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		//System.out.print("Digite seu nome: ");
		//nome = teclado.nextLine();
		//System.out.print("Digite sua idade: ");
		//idade = teclado.nextInt();
		//System.out.print("Digite sua renda: ");
		//salario = teclado.nextDouble();

		//principal.apresentacao(nome, idade, salario);
		
		principal.tipoDeDado();
		//principal.declaracaoDeVariavel();
		//principal.valorFormatado(50000.06546546545644, 2);
		//principal.valorFormatado(50000.06546546545644, 150000.06546546545644, 2);		
		
		//principal.casting(5, 2);
		
		teclado.close();
		
	}

}

