package file_package;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class File_read_runner {
	public static void main(String[] args) throws IOException {
		Path file_path=Path.of("./resources/some_text.txt");
		List<String> values=Files.readAllLines(file_path);
//		System.out.println(values); //its not a good idea 
//		Files.lines(file_path).forEach(e->System.out.println(e));
		Files.lines(file_path).filter(e -> e.contains("a")).forEach(System.out::println);
	}
}
