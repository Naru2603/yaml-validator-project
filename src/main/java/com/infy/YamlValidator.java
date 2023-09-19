package com.infy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.error.YAMLException;

public class YamlValidator {
	 public static void main(String[] args) {

	        // Replace "your_file.txt" with the path to your text file
	        String filePath = "C:\\Users\\Narendra Korade\\STS-workspace\\my-yaml-validator\\src\\main\\resources\\my_application.yml";
	        String fileContent = "";
	        try {
	            fileContent = new String(Files.readAllBytes(Paths.get(filePath)));
	            System.out.println("File content:\n" + fileContent);
	        } catch (IOException e) {
	            // Handle any potential I/O exceptions (e.g., file not found)
	            e.printStackTrace();
	        }

	        try {
//	            InputStream inputStream = new FileInputStream(yamlFilePath);
	            Yaml yaml = new Yaml();
	            Object data = yaml.load(fileContent);

	            // If the YAML file is successfully parsed, it's considered valid.
	            System.out.println("YAML validation successful.");
	        } catch (YAMLException e) {
	            // If there's an exception during parsing, it's considered invalid.
	            System.err.println("YAML validation failed: " + e.getMessage());
	            System.exit(1);
	        }
	    }public YamlValidator() {
			// TODO Auto-generated constructor stub
		}
}
