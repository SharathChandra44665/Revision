package file_package;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Get_current_directory {

	public static void main(String[] args) throws IOException {
		Path current_dir=Paths.get(".");
//		Files.list(current_dir).forEach(System.out::println);
		Files.walk(current_dir, 3).forEach(System.out:: println);
	}

}
