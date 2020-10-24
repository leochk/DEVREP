package generator.website;

import java.io.File;

import model.ModelIO;
import turtle.Stage;

public class HTMLGen {
	public static void main(String[] args) {
		SimpleToHTML s = new SimpleToHTML();
		File f = new File("/users/nfs/Etu7/17007647/Documents/DEVREP/Semaine 2/Turtle/model/Stage.xmi");
		Stage e = (Stage) ModelIO.loadModel(f.toPath());
		System.out.println(s.generate(e));
	}
}
