package exec09;

import java.util.Scanner; 

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o nome do funcion�rio:");
		f.setNome(leitor.nextLine());
		System.out.println("Digite o cpf do trabalhador:");
		f.setCpf(leitor.nextLine());
		System.out.println("Digite o n�mero de horas trabalhadas:");
		f.setHorastrabalhadas(leitor.nextDouble());
		System.out.println("Digite o valor da hora:");
		f.setValorhora(leitor.nextDouble());
		leitor.close();
		
		System.out.printf("Sal�rio do %s � de :%.2f",f.getNome(), f.calcularsalario());
	}

}
