/**
 */
package de.dfki.cos.basys.aas.impl;

import de.dfki.cos.basys.aas.IAasPackage;
import de.dfki.cos.basys.aas.IAnnotatedRelationshipElement;
import de.dfki.cos.basys.aas.IDataElement;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotated Relationship Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.cos.basys.aas.impl.AnnotatedRelationshipElement#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotatedRelationshipElement extends MinimalEObjectImpl.Container implements IAnnotatedRelationshipElement {
	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<IDataElement> annotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotatedRelationshipElement() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IAasPackage.Literals.ANNOTATED_RELATIONSHIP_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IDataElement> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectResolvingEList<IDataElement>(IDataElement.class, this, IAasPackage.ANNOTATED_RELATIONSHIP_ELEMENT__ANNOTATION);
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IAasPackage.ANNOTATED_RELATIONSHIP_ELEMENT__ANNOTATION:
				return getAnnotation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IAasPackage.ANNOTATED_RELATIONSHIP_ELEMENT__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends IDataElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IAasPackage.ANNOTATED_RELATIONSHIP_ELEMENT__ANNOTATION:
				getAnnotation().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IAasPackage.ANNOTATED_RELATIONSHIP_ELEMENT__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnnotatedRelationshipElement
