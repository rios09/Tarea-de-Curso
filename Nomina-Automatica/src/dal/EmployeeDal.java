package dal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import ol.Nomina;

public class EmployeeDal {

	private String fileName;
	private String filePath;
	private Nomina NominaList;

	public EmployeeDal() {
		super();
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public Nomina getNominaList() {
		return NominaList;
	}

	public void setNominaList(Nomina nominaList) {
		NominaList = nominaList;
	}

	public void saveList() {
		File file = new File(filePath + "\\" + fileName);
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(NominaList);
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Nomina openList() {
		try {
			File file = new File(filePath);
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			Nomina n = (Nomina) ois.readObject();
			ois.close();
			return n;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}
