/* Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Usar uma classe. */

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Enter your name:");
		employee.name = sc.nextLine();
		
		System.out.println("Enter your gross salary:");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println("Enter your tax:");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " +employee);
		
		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);

		
		System.out.printf("Updated data: " +employee);
		
		sc.close();
	}

}