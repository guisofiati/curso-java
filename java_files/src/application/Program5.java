package application;

import java.io.File;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//Ve todos as foldes do caminho
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		//Ve todos os arquivos do caminho
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created " + success);
		
		sc.close();
	}
}
