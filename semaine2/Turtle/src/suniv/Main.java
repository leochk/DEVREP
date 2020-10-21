package suniv;

import java.nio.file.FileSystems;
import java.nio.file.Path;

import org.eclipse.emf.ecore.EObject;

import turtle.Stage;

public class Main {

	private final static String stageFile = "Stage.xmi";
	private final static String pathStageFile = "model";

	public static void main(String[] args) {
		EObject object = ModelIO.loadModel(FileSystems.getDefault().getPath(pathStageFile, stageFile));
		Stage s = (Stage) object;
		s.display();
	}
}
