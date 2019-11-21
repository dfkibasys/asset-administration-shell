/**
 */
package de.dfki.cos.basys.platform.model.aas.util;

import de.dfki.cos.basys.platform.model.aas.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dfki.cos.basys.platform.model.aas.AasPackage
 * @generated
 */
public class AasSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AasPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AasSwitch() {
		if (modelPackage == null) {
			modelPackage = AasPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AasPackage.ASSET_ADMINISTRATION_SHELL: {
				AssetAdministrationShell assetAdministrationShell = (AssetAdministrationShell)theEObject;
				T result = caseAssetAdministrationShell(assetAdministrationShell);
				if (result == null) result = caseHasDataSpecification(assetAdministrationShell);
				if (result == null) result = caseIdentifiable(assetAdministrationShell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AasPackage.HAS_DATA_SPECIFICATION: {
				HasDataSpecification hasDataSpecification = (HasDataSpecification)theEObject;
				T result = caseHasDataSpecification(hasDataSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AasPackage.IDENTIFIABLE: {
				Identifiable identifiable = (Identifiable)theEObject;
				T result = caseIdentifiable(identifiable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AasPackage.ASSET: {
				Asset asset = (Asset)theEObject;
				T result = caseAsset(asset);
				if (result == null) result = caseHasDataSpecification(asset);
				if (result == null) result = caseIdentifiable(asset);
				if (result == null) result = caseHasKind(asset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AasPackage.VIEW: {
				View view = (View)theEObject;
				T result = caseView(view);
				if (result == null) result = caseHasDataSpecification(view);
				if (result == null) result = caseHasSemantics(view);
				if (result == null) result = caseReferable(view);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AasPackage.HAS_KIND: {
				HasKind hasKind = (HasKind)theEObject;
				T result = caseHasKind(hasKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AasPackage.HAS_SEMANTICS: {
				HasSemantics hasSemantics = (HasSemantics)theEObject;
				T result = caseHasSemantics(hasSemantics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AasPackage.REFERABLE: {
				Referable referable = (Referable)theEObject;
				T result = caseReferable(referable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AasPackage.SUBMODEL: {
				Submodel submodel = (Submodel)theEObject;
				T result = caseSubmodel(submodel);
				if (result == null) result = caseHasDataSpecification(submodel);
				if (result == null) result = caseHasKind(submodel);
				if (result == null) result = caseHasSemantics(submodel);
				if (result == null) result = caseIdentifiable(submodel);
				if (result == null) result = caseQualifiable(submodel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AasPackage.QUALIFIABLE: {
				Qualifiable qualifiable = (Qualifiable)theEObject;
				T result = caseQualifiable(qualifiable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AasPackage.QUALIFIER: {
				Qualifier qualifier = (Qualifier)theEObject;
				T result = caseQualifier(qualifier);
				if (result == null) result = caseConstraint(qualifier);
				if (result == null) result = caseHasSemantics(qualifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AasPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AasPackage.SUBMODEL_ELEMENT: {
				SubmodelElement submodelElement = (SubmodelElement)theEObject;
				T result = caseSubmodelElement(submodelElement);
				if (result == null) result = caseHasDataSpecification(submodelElement);
				if (result == null) result = caseHasKind(submodelElement);
				if (result == null) result = caseHasSemantics(submodelElement);
				if (result == null) result = caseQualifiable(submodelElement);
				if (result == null) result = caseReferable(submodelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AasPackage.DATA_ELEMENT: {
				DataElement dataElement = (DataElement)theEObject;
				T result = caseDataElement(dataElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AasPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseDataElement(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AasPackage.FILE: {
				File file = (File)theEObject;
				T result = caseFile(file);
				if (result == null) result = caseDataElement(file);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AasPackage.BLOB: {
				Blob blob = (Blob)theEObject;
				T result = caseBlob(blob);
				if (result == null) result = caseDataElement(blob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AasPackage.REFERENCE_ELEMENT: {
				ReferenceElement referenceElement = (ReferenceElement)theEObject;
				T result = caseReferenceElement(referenceElement);
				if (result == null) result = caseDataElement(referenceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AasPackage.SUBMODEL_ELEMENT_COLLECTION: {
				SubmodelElementCollection submodelElementCollection = (SubmodelElementCollection)theEObject;
				T result = caseSubmodelElementCollection(submodelElementCollection);
				if (result == null) result = caseSubmodelElement(submodelElementCollection);
				if (result == null) result = caseHasDataSpecification(submodelElementCollection);
				if (result == null) result = caseHasKind(submodelElementCollection);
				if (result == null) result = caseHasSemantics(submodelElementCollection);
				if (result == null) result = caseQualifiable(submodelElementCollection);
				if (result == null) result = caseReferable(submodelElementCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AasPackage.RELATIONSHIP_ELEMENT: {
				RelationshipElement relationshipElement = (RelationshipElement)theEObject;
				T result = caseRelationshipElement(relationshipElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AasPackage.OPERATION_VARIABLE: {
				OperationVariable operationVariable = (OperationVariable)theEObject;
				T result = caseOperationVariable(operationVariable);
				if (result == null) result = caseSubmodelElement(operationVariable);
				if (result == null) result = caseHasDataSpecification(operationVariable);
				if (result == null) result = caseHasKind(operationVariable);
				if (result == null) result = caseHasSemantics(operationVariable);
				if (result == null) result = caseQualifiable(operationVariable);
				if (result == null) result = caseReferable(operationVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AasPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseSubmodelElement(operation);
				if (result == null) result = caseHasDataSpecification(operation);
				if (result == null) result = caseHasKind(operation);
				if (result == null) result = caseHasSemantics(operation);
				if (result == null) result = caseQualifiable(operation);
				if (result == null) result = caseReferable(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AasPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseSubmodelElement(event);
				if (result == null) result = caseHasDataSpecification(event);
				if (result == null) result = caseHasKind(event);
				if (result == null) result = caseHasSemantics(event);
				if (result == null) result = caseQualifiable(event);
				if (result == null) result = caseReferable(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AasPackage.SECURITY: {
				Security security = (Security)theEObject;
				T result = caseSecurity(security);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AasPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AasPackage.IDENTIFIER: {
				Identifier identifier = (Identifier)theEObject;
				T result = caseIdentifier(identifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AasPackage.ADMINISTRATIVE_INFORMATION: {
				AdministrativeInformation administrativeInformation = (AdministrativeInformation)theEObject;
				T result = caseAdministrativeInformation(administrativeInformation);
				if (result == null) result = caseHasDataSpecification(administrativeInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset Administration Shell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Administration Shell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetAdministrationShell(AssetAdministrationShell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Data Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Data Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasDataSpecification(HasDataSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiable(Identifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsset(Asset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseView(View object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasKind(HasKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Semantics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Semantics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasSemantics(HasSemantics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferable(Referable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Submodel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Submodel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubmodel(Submodel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifiable(Qualifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifier(Qualifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Submodel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Submodel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubmodelElement(SubmodelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataElement(DataElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blob</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blob</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlob(Blob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceElement(ReferenceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Submodel Element Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Submodel Element Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubmodelElementCollection(SubmodelElementCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipElement(RelationshipElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationVariable(OperationVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurity(Security object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Administrative Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Administrative Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdministrativeInformation(AdministrativeInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AasSwitch
