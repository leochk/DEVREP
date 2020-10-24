import java.io.File;

import turtle.Stage;

public class Main {
	public static void main(String[] args) {
		File f = new File("~S3/DEVREP/Turtle/model/Stage.xmi");
		Stage e = (Stage) ModelIO.loadModel(f.toPath());
		System.out.println(e.display());		
	}
	
}
