package suniv;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import turtle.TurtlePackage;
import turtle.impl.TurtlePackageImpl;

/**
 * Utility class to save and load model instances of Turtle from XMI files.
 * 
 * @author lmh
 */
public final class ModelIO {
	/**
	 * Loads a model stored in a XMI file.
	 * 
	 * @param file the path to the incoming XMI file
	 * @return the root object of the loaded model
	 */
	private ModelIO() {
	}

	public static final EObject loadModel(Path file) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("*", new XMIResourceFactoryImpl());
// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		TurtlePackage tp = TurtlePackageImpl.init();
		EPackage.Registry ereg = resSet.getPackageRegistry();
		ereg.put(tp.getNsURI(), tp);
		Resource resource = resSet.getResource(URI.createURI(file.toString()), true);
		return resource.getContents().get(0);
	}

	/**
	 * Saves a model in a XMI file.
	 * 
	 * @param mo   the model to save
	 * @param file the path to the destination file.
	 */
	public static final void saveModel(EObject mo, Path file) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("*", new XMIResourceFactoryImpl());
// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createURI(file.toString()));

// Get the first model element and cast it to the right type, in my node
// example everything is hierarchical included in this first
		resource.getContents().add(mo);
// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (

		IOException e) {
			e.printStackTrace();
		}
	}
}
