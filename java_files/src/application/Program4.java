package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program4 {

	public static void main(String[] args) {
		
		List<String> lines = new ArrayList<>();
		lines.add("João");
		lines.add("Maria");
		lines.add("Pedro");
		
		String path = "C:\\Users\\gui_s\\Documents\\utils\\JavaDocs\\arquivo2.txt";
		
		// Com true, ele não cria o arquivo do 0, so vai adicionando.
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			} 
		} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}