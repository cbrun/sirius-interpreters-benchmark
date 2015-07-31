package org.eclipse.sirius.tests.interpreterbench.design;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

public class EcoreBenchService {

	public EObject myeContainer(EObject any) {
		return any.eContainer();
	}

	public EObject myEType(EReference ref) {
		return ref.getEType();
	}

	public String myName(ENamedElement ref) {
		return ref.getName();
	}

	public Collection<EAttribute> myEAttributes(EClass any) {
		return any.getEAttributes();
	}

	public Collection<EOperation> myEOperations(EClass any) {
		return any.getEOperations();
	}
	
	public Collection<EClass> myEAllClasses(EPackage any) {
		List<EClass> result = new ArrayList<EClass>();
		Iterator<EObject> it = any.eAllContents();
		while (it.hasNext()) {
			EObject cur = it.next();
			if (cur instanceof EClass) {
				result.add((EClass) cur);
			}
		}
		return result;
	}

	
	public boolean myIsInterface(EClass any) {
		return any.isInterface();
	}
}
