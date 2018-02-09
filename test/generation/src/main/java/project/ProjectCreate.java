package project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class ProjectCreate {


	public static String create(String name) throws IOException {

		File files = new File("/root/"+name);
		if (!files.exists()) {
			if (files.mkdirs()) {
				System.out.println("Multiple directories are created!");
			} else {
				System.out.println("Failed to create multiple directories!");
			}
		}
		File param = new File("lib/.project");
		File pom = new File("pom.xml");
		File path = new File(".classpath");
		FileUtils.copyFileToDirectory(param, files);
		FileUtils.copyFileToDirectory(pom, files);
		FileUtils.copyFileToDirectory(path, files);
		File lib = new File(files.getAbsolutePath()+"//lib");
		lib.mkdir();
		FileUtils.copyDirectory(new File("lib"), lib);
		File main = new File(files.getAbsolutePath()+"//src//main//java");
		File test = new File(files.getAbsolutePath()+"src//test//java");
		main.mkdirs();
		test.mkdirs();
		File junit = new File("src/main/java/launcher/SecurityTest.java");
		FileUtils.copyFileToDirectory(junit, main);
		
		File testfe = new File(files.getAbsolutePath()+"//src//test//java//features");
		testfe.mkdirs();
		File testst = new File(files.getAbsolutePath()+"//src//test//java//steps");
		testst.mkdirs();

		String root = files.getAbsolutePath();
		System.out.println("A new project is created in:  "+root);
		return root;
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		try {
			create("test");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}


