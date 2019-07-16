package entities;

public class Employee  implements Comparable<Employee>{

	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	//ordem crescente return salary.compareTo(outro.getSalary());
	//ordem decrescente return -salary.... (sinal de -)
	@Override
	public int compareTo(Employee outro) {
		return -salary.compareTo(outro.getSalary());
	}
	
	 
}
