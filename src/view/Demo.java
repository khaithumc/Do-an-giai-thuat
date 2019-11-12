package view;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import entities.TuVung;

public class Demo {
	public static void main(String[] args) {
		
	}
	
	private static Map<String, TuVung> mock() {
		Map<String, TuVung> maps = new HashMap<>();
		
		String path = "F:\\java\\Do-an-giai-thuat\\Tu-Dien.txt";
		
		try {
			Files.lines(Paths.get(path)).forEach(System.out::println);
			
			maps = Files.lines(Paths.get(path))
					.map(s -> {
						String[] arr = s.split(",");
						if (arr.length == 3) {
							return new TuVung(arr[0], arr[1], arr[2], arr[3]);
						}
						return null;
					}).filter(s -> s != null)
					.collect(Collectors.toMap(keyMapper, valueMapper));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return maps;
	}

}
