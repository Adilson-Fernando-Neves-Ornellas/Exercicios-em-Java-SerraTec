import java.util.Scanner;

public class ExercicioJavaSerratec {
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int exercicio;
		
		System.out.print("Informe qual dos quinze exercicios você quer ver em funcionamento: ");
		exercicio = input.nextInt();
		
		switch(exercicio) {
		  case 1:
		    exercicio01();
		    break;
		  case 2:
			  exercicio02();
		    break;
		  case 3:
			  exercicio03();
		    break;
		  case 4:
			  exercicio04();
		    break;
		  case 5:
			  exercicio05();
		    break;
		  case 6:
			  exercicio06();
		    break;
		  case 7:
			  exercicio07();
		    break;
		  case 8:
			  exercicio08();
		    break;
		  case 9:
			  exercicio09();
		    break;
		  case 10:
			  exercicio10();
		    break;
		  case 11:
			  exercicio11();
		    break;
		  case 12:
			  exercicio12();
		    break;
		  case 13:
			  exercicio13();
		    break;
		  case 14:
			  exercicio14();
		    break;
		  case 15:
			  exercicio15();
		    break;
		  default:
				System.out.print("Opção invalida!");
			break;
		};
	};
	
	private static void exercicio01() {
		
		int quantidade= 0, idade;
		double porcen15 = 0.0 , porcen60 = 0.0, ate15 = 0.0 , de16a30 = 0.0 , de31a45 = 0.0 , de46a60 = 0.0, acima61 = 0.0 ;
		
		do{
			System.out.print("Digite a idade das 15 pessoas uma após a outra, pessoa " + (quantidade+1) + ": ");
			idade = input.nextInt();
			quantidade++;
			if (idade > 0) {
				if(idade <= 15){
					ate15++;
				}else if(idade > 15 && idade <= 30){
					
					de16a30++;
				}else if(idade > 30 && idade <= 45){
					de31a45++;
				}else if(idade > 45 && idade <= 60){
					de46a60++;
				}else{
					acima61++;
				};
			}else{
				System.out.println("Idade Invalida, digite novamente ");
				quantidade--;
			};
			porcen15 = (ate15/quantidade)*100;
			porcen60 = (acima61/quantidade)*100;
		}while(quantidade <15);
			System.out.println("\n A quantidade de pessoas na faixa etaria até 15 anos é: " + ate15 );
			System.out.println(" A quantidade de pessoas na faixa etaria de 16 até 30 anos é: " + de16a30 );
			System.out.println(" A quantidade de pessoas na faixa etaria de 31 até 45 anos é: " + de31a45 );
			System.out.println(" A quantidade de pessoas na faixa etaria de 46 até 60 anos é: " + de46a60 );
			System.out.println(" A quantidade de pessoas na faixa etaria acima de 60 anos é: " + acima61 );
			System.out.println(" A porcentagem de pessoas na faixa etaria até 15 anos é: " + porcen15 );
			System.out.println(" A porcentagem de pessoas na faixa etaria acima de 60 anos é: "+ porcen60 );
	};
	private static void exercicio02() {
		int contador = 0 ;
		
		System.out.println("Segue abaixo a verificação dos numeros de 1000 a 2000 que são divisiveis por 11 com resto igual a 2: ");		

		for(int i = 1000; i<=2000; i++){
			if(i%11 == 2){
				System.out.print( i + " ");
				contador++;
				if (contador == 7) {
					System.out.println("");
					contador = 0;
				};
			};
		};
	};
	private static void exercicio03() {
		
		int valor1, valor2, valor3;
		
		System.out.print("Digite os três valores um de cada vez, valor 1: ");
		valor1 = input.nextInt();
		System.out.print("Digite os três valores um de cada vez, valor 2: ");
		valor2 = input.nextInt();
			if(valor2 == valor1){
				do{
					System.out.print("Valor 2 igual valor 1, favor digitar outro valor 2: ");
					valor2 = input.nextInt();
				}while(valor2 == valor1 );
			}
		System.out.print("Digite os três valores um de cada vez, valor 3: ");
		valor3 = input.nextInt();
			if(valor3 == valor2 || valor3==valor1){
				do{
					System.out.print("Valor 3 igual valor 1 ou 2, favor digitar outro valor 3: ");
					valor3 = input.nextInt();
				}while(valor3 == valor2 || valor3 ==valor1);
			};
		
		if(valor1 < valor2 && valor1 < valor3 && valor2<valor3){
			System.out.println("SEGUE OS VALORES EM ORDEM CRESCENTE:");
			System.out.println(valor1+ " é o menor valor");
			System.out.println(valor2+ " é o segundo valor");
			System.out.println(valor3+ " é o maior valor");
			System.out.println("SEGUE OS VALORES EM ORDEM DECRESCENTE:");
			System.out.println(valor3+ " é o maior valor");
			System.out.println(valor2+ " é o segundo valor");
			System.out.println(valor1+ " é o menor valor");
		}else if (valor1 > valor2 && valor1<valor3){
			System.out.print("\n  SEGUE OS VALORES EM ORDEM CRESCENTE:");
			System.out.print("\n" +valor2+ " é o menor valor");
			System.out.print("\n" +valor1+ " é o segundo valor");
			System.out.print("\n" +valor3+ " é o maior valor");
			System.out.print("\n  SEGUE OS VALORES EM ORDEM DECRESCENTE:");
			System.out.print("\n" +valor3+ " é o maior valor");
			System.out.print("\n" +valor1+ " é o segundo valor");
			System.out.print("\n" +valor2+ " é o menor valor");
		}else if (valor1 > valor2 && valor1>valor3 && valor2 > valor3){
			System.out.print("\n  SEGUE OS VALORES EM ORDEM CRESCENTE:");
			System.out.print("\n" +valor3+ " é o menor valor");
			System.out.print("\n" +valor2+ " é o segundo valor");
			System.out.print("\n" +valor1+ " é o maior valor");
			System.out.print("\n  SEGUE OS VALORES EM ORDEM DECRESCENTE:");
			System.out.print("\n" +valor1+ " é o maior valor");
			System.out.print("\n" +valor2+ " é o segundo valor");
			System.out.print("\n" +valor3+ " é o menor valor");
		};
	};
	private static void exercicio04() {
		int qtd = 00;
		double vCompra[] = {0.0,0.0,0.0,0.0,0.0};
		double soma = 0.0, valorFinal = 0.0, parar = 1.0, desconto = 0.0;
		
		do{
			System.out.println("Digite 0 para parar, o maximo de produtos que podem ser somados é 5");
			System.out.print("O valor do produto: ");
			vCompra[qtd] = input.nextInt();
			parar = vCompra[qtd];
			qtd++;
			if(qtd >= 5){
				break;
			}
		}while(parar != 0);
			for(int i = 0 ; i <= 4 ; i++){
				soma = soma + vCompra[i];
			};
			if(soma >= 500){		
				for(int i = 1; i <= soma ; i= i+100){
					desconto = 1.00 + ((i-400)/100);
					 if (desconto > 25){
						desconto = 25.00;
					};
					valorFinal = soma*(1-(desconto/100));
				};
			}else{
				valorFinal = soma;
			};
			System.out.println("\nVALOR DA COMPRA - PORCENTAGEM DE DESCONTO - VALOR FINAL");
			System.out.println( "   R$:" + soma  + "              " + desconto + "%" + "               R$:" + valorFinal );
	};
	private static void exercicio05() {
		int lado;
		do{
			System.out.print("Digite o lado do quadrado entre um e vinte para fazermos a representação: ");
			lado = input.nextInt();
			if(lado <1 || lado >20){
				System.out.println("Lado do quadrado Invalido, tente novamente ");
			};
		}while(lado <=0 || lado >=21);
		
		for(int i = 1; i  <= lado ; i++){
			System.out.println("");
			for( int j =  1 ; j  <= lado ; j++){
				System.out.print("* ");
			};
		};
	};
	private static void exercicio06() {
		int lado;
		do{
			System.out.print("Digite o lado do quadrado entre um e vinte para fazermos a representação: ");
			lado = input.nextInt();
			if(lado <1 || lado >20){
				System.out.println("Lado do quadrado Invalido, tente novamente ");
			};
		}while(lado <=0 || lado >=21);
		for(int i = 1; i  <= lado ; i++){
			System.out.println(" ");
			for( int j =  1 ; j <= lado ; j++){
				if(i==1 || i==lado || j==1 || j==lado){
					System.out.print("*");
				}else{
					System.out.print(" ");
				};
			};
		};
	};
	private static void exercicio07() {
		int lado;
		do{
			System.out.print("Digite o lado do quadrado entre um e vinte para fazermos a representação: ");
			lado = input.nextInt();
			if(lado <1 || lado >20){
				System.out.println("Lado do quadrado Invalido, tente novamente ");
			};
		}while(lado <=0 || lado >=21);
		
		for(int i = 1; i  <= lado ; i++){
			System.out.println("");
			for( int j =  1 ; j  <= i ; j++){
				System.out.print("*");
			}
		}
	};
	private static void exercicio08() {
		int numero,divisores = 0;
		System.out.print("Digite um numero para saber se ele é primo ou não: ");
		numero = input.nextInt();
			
			for( int i = 1; i <= numero; i++){
				if(numero % i == 0){
					divisores++;
				};
			};
			
			if(divisores == 2){
				System.out.println(numero + " Sim, é primo");
			}else if(numero < 0){
				System.out.print("Não existe primo de nennhum numero negativo");
			}else{
				System.out.println(numero + " Não é um número primo");
			};
	};
	private static void exercicio09() {
		
	};
	private static void exercicio10() {
		
	};
	private static void exercicio11() {
		
	};
	private static void exercicio12() {
		
	};
	private static void exercicio13() {
		
	};
	private static void exercicio14() {
		
	};
	private static void exercicio15() {
		
	};
}
