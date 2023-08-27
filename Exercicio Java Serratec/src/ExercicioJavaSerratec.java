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
		
	};
	private static void exercicio03() {
		
	};
	private static void exercicio04() {
		
	};
	private static void exercicio05() {
		
	};
	private static void exercicio06() {
		
	};
	private static void exercicio07() {
		
	};
	private static void exercicio08() {
		
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
