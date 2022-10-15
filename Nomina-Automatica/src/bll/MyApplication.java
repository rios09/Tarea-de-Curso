package bll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import dal.EmployeeDal;
import gui.EmployeeForm;
import ol.Nomina;

public class MyApplication {
	private Scanner scan;
	private List<Nomina> NominaList;
	private String fileName;
	private String filePath;

	public MyApplication() {
		scan = new Scanner(System.in);
		fileName = "";
		NominaList = new ArrayList<Nomina>();
	}

	public MyApplication(Scanner scanner) {
		scan = scanner;
		fileName = "";
		NominaList = new ArrayList<Nomina>();
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public void app() {
		System.out.println("Bienvenido al Sistema de Nomina\n" + "Favor ingresar la opcion a ejecutar:");
		System.out.println("1. Agregar empleado");
		System.out.println("2. Guardar empleado");
		System.out.println("3. Mostrar empleados");
		System.out.println("4. Salir");
	}

	public void myApp() {
		short op = 0;
		do {
			System.out.println();
			app();
			System.out.println();
			op = scan.nextShort();

			switch (op) {
			case 1:
				addElement();
				break;
			case 2:
				saveElements();
				break;
			case 3:
				openList();
				break;
			case 4:
				System.out.println("\nGracias por usar la aplicacion!");
				System.exit(0);
				break;
			case 5:
				break;
			default:
				System.out.println("Ingrese una opcion valida!");

			}
		} while (op != 4);
	}

	private void addElement() {
		EmployeeForm e = new EmployeeForm(scan);
		NominaList.add(e.catchEmployee());
	}

	public void saveElements() {
		EmployeeForm ef = new EmployeeForm(scan);
		EmployeeDal dal = new EmployeeDal();
		dal.setNominaList(ef.catchEmployee());
		System.out.println("Introduce la Ruta a guardar el archivo");
		String filePath = scan.next();
		dal.setFilePath(filePath);
		System.out.println("Introduce el nombre del archivo");
		String fileName = scan.next();
		dal.setFileName(fileName);
		dal.saveList();

	}

	public void openList() {
		System.out.println("Introduce la ruta del archivo que quieres abrir");
		String savedFile = scan.next();
		EmployeeDal emp = new EmployeeDal();
		emp.setFilePath(savedFile);
		EmployeeForm emf = new EmployeeForm(emp.openList());
		emf.showEmployees();

	}
}
