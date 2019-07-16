package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		String path = "C:\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			//ler a linha dentro do arquivo e armazenar dentro de uma variavel
			String employeeCsv = br.readLine();
			
			while (employeeCsv != null) {
				//para separar a string do tipo CSV para adicionar na minha lista, precisa fazer um vetor de string e separar (split) com base na virgula
				String[] fields = employeeCsv.split(",");
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employeeCsv = br.readLine();
			}
			//Collections para ordenar a lista
			Collections.sort(list);
			//percorrer lista
			for (Employee emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
