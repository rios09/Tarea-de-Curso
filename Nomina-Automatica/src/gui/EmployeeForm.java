package gui;

import java.util.List;
import java.util.Scanner;
import ol.Nomina;

public class EmployeeForm {

	private Scanner scan;
	private Nomina nomina;
	private List<Nomina> NominaList;

	public EmployeeForm(Scanner scan) {
		super();
		this.scan = scan;
	}

	public EmployeeForm(Nomina nomina) {
		super();
		this.nomina = nomina;
	}

	public EmployeeForm(List<Nomina> nominaList) {
		super();
		NominaList = nominaList;
	}

	public Nomina catchEmployee() {
		Nomina n = new Nomina();
		System.out.println("Primer Nombre:");
		n.setFirstName(scan.next());
		System.out.println("Segundo Nombre:");
		n.setMiddleName(scan.next());
		System.out.println("Primer Apellido:");
		n.setSurName(scan.next());
		System.out.println("Segundo Apellido");
		n.setLastName(scan.next());
		System.out.println("Genero");
		n.setGender(scan.next());
		System.out.println("Pais de Nacimiento:");
		n.setCountry(scan.next());
		System.out.println("Ciudad donde reside");
		n.setCity(scan.next());
		System.out.println("Municipio donde reside");
		n.setTown(scan.next());
		System.out.println("Salario Basico");
		n.setSalary(scan.nextDouble());
		return n;
	}

	public void calcNomina() {
		Nomina no = new Nomina();
		double salary = no.getSalary();
		double insslaboral = (salary % 7);
		System.out.println("Su deduccion mensual de INSS sera de: " + insslaboral + "C$");
		double ir = 0;
		salary = no.getSalary();
		if (salary * 12 <= 100000) {
			System.out.println("No hay deduccion de IR");
		} else if (salary * 12 > 100001 && salary * 12 <= 200000) {
			ir = salary % 15;
			System.out.println("Su porcentaje de deduccion Anual sera de 15%, teniendo un total de deduccion anual de: "
					+ ir + "C$");
		} else if (salary * 12 > 200001 && salary * 12 <= 350000) {
			ir = salary % 20;
			System.out.println("Su porcentaje de deuccion Anual sera de 20%, teniendo un total de deduccion anual de: "
					+ ir + "C$");
		} else if (salary * 12 > 350001 && salary * 12 <= 500000) {
			ir = salary % 25;
			System.out.println("Su porcentaje de deuccion Anual sera de 25%, teniendo un total de deduccion anual de: "
					+ ir + "C$");
		} else if (salary * 12 > 500000) {
			ir = salary % 30;
			System.out.println("Su porcentaje de deuccion Anual sera de 30%, teniendo un total de deduccion anual de: "
					+ ir + "C$");
		}
		salary = no.getSalary();
		double anualsalary = salary * 12;
		System.out.println("La expectativa salarial anual bruta es de: " + anualsalary + "C$");

		salary = no.getSalary();
		double otDay = salary / 30;
		double otHour = salary / 8;
		double otFinal = salary * 2;
		System.out.println("El ingreso por cada hora extra que se registre sera de: " + otFinal + "C$");

		salary = no.getSalary();
		System.out.println("Ingreso por antiguedad, por los primeros 3 años laborados: " + salary * 3);
	}

	public void showEmployees() {

		for (int i = 0; i < NominaList.size(); i++) {
			System.out.format("%d | &d | %d | %d | %d | %d | %d | %d | %s\n", i + 1, NominaList.get(i).getFirstName(),
					NominaList.get(i).getMiddleName(), NominaList.get(i).getSurName(), NominaList.get(i).getLastName(),
					NominaList.get(i).getGender(), NominaList.get(i).getCountry(), NominaList.get(i).getCity(),
					NominaList.get(i).getTown(), NominaList.get(i).getSalary());
		}
		calcNomina();
	}

}
