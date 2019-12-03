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
 * @see de.dfki.cos.basys.platform.model.aas.IAasPackage
 * @generated
 */
public class AasSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IAasPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AasSwitch() {
		if (modelPackage == null) {
			modelPackage = IAasPackage.eINSTANCE;
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
			case IAasPackage.REFERABLE: {
				IReferable referable = (IReferable)theEObject;
				T result = caseReferable(referable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.IDENTIFIABLE: {
				IIdentifiable identifiable = (IIdentifiable)theEObject;
				T result = caseIdentifiable(identifiable);
				if (result == null) result = caseReferable(identifiable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.IDENTIFIER: {
				IIdentifier identifier = (IIdentifier)theEObject;
				T result = caseIdentifier(identifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.HAS_KIND: {
				IHasKind hasKind = (IHasKind)theEObject;
				T result = caseHasKind(hasKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.ADMINISTRATIVE_INFORMATION: {
				IAdministrativeInformation administrativeInformation = (IAdministrativeInformation)theEObject;
				T result = caseAdministrativeInformation(administrativeInformation);
				if (result == null) result = caseHasDataSpecification(administrativeInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.HAS_SEMANTICS: {
				IHasSemantics hasSemantics = (IHasSemantics)theEObject;
				T result = caseHasSemantics(hasSemantics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.QUALIFIABLE: {
				IQualifiable qualifiable = (IQualifiable)theEObject;
				T result = caseQualifiable(qualifiable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.CONSTRAINT: {
				IConstraint constraint = (IConstraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.QUALIFIER: {
				IQualifier qualifier = (IQualifier)theEObject;
				T result = caseQualifier(qualifier);
				if (result == null) result = caseConstraint(qualifier);
				if (result == null) result = caseHasSemantics(qualifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.FORMULA: {
				IFormula formula = (IFormula)theEObject;
				T result = caseFormula(formula);
				if (result == null) result = caseConstraint(formula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.HAS_DATA_SPECIFICATION: {
				IHasDataSpecification hasDataSpecification = (IHasDataSpecification)theEObject;
				T result = caseHasDataSpecification(hasDataSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.ASSET_ADMINISTRATION_SHELL: {
				IAssetAdministrationShell assetAdministrationShell = (IAssetAdministrationShell)theEObject;
				T result = caseAssetAdministrationShell(assetAdministrationShell);
				if (result == null) result = caseHasDataSpecification(assetAdministrationShell);
				if (result == null) result = caseIdentifiable(assetAdministrationShell);
				if (result == null) result = caseReferable(assetAdministrationShell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.ASSET: {
				IAsset asset = (IAsset)theEObject;
				T result = caseAsset(asset);
				if (result == null) result = caseHasDataSpecification(asset);
				if (result == null) result = caseIdentifiable(asset);
				if (result == null) result = caseReferable(asset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.SUBMODEL: {
				ISubmodel submodel = (ISubmodel)theEObject;
				T result = caseSubmodel(submodel);
				if (result == null) result = caseHasDataSpecification(submodel);
				if (result == null) result = caseHasSemantics(submodel);
				if (result == null) result = caseIdentifiable(submodel);
				if (result == null) result = caseQualifiable(submodel);
				if (result == null) result = caseHasKind(submodel);
				if (result == null) result = caseReferable(submodel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.SUBMODEL_ELEMENT: {
				ISubmodelElement submodelElement = (ISubmodelElement)theEObject;
				T result = caseSubmodelElement(submodelElement);
				if (result == null) result = caseHasDataSpecification(submodelElement);
				if (result == null) result = caseReferable(submodelElement);
				if (result == null) result = caseQualifiable(submodelElement);
				if (result == null) result = caseHasSemantics(submodelElement);
				if (result == null) result = caseHasKind(submodelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.DATA_ELEMENT: {
				IDataElement dataElement = (IDataElement)theEObject;
				T result = caseDataElement(dataElement);
				if (result == null) result = caseSubmodelElement(dataElement);
				if (result == null) result = caseHasDataSpecification(dataElement);
				if (result == null) result = caseReferable(dataElement);
				if (result == null) result = caseQualifiable(dataElement);
				if (result == null) result = caseHasSemantics(dataElement);
				if (result == null) result = caseHasKind(dataElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.PROPERTY: {
				IProperty property = (IProperty)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseDataElement(property);
				if (result == null) result = caseSubmodelElement(property);
				if (result == null) result = caseHasDataSpecification(property);
				if (result == null) result = caseReferable(property);
				if (result == null) result = caseQualifiable(property);
				if (result == null) result = caseHasSemantics(property);
				if (result == null) result = caseHasKind(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.MULTI_LANGUAGE_PROPERTY: {
				IMultiLanguageProperty multiLanguageProperty = (IMultiLanguageProperty)theEObject;
				T result = caseMultiLanguageProperty(multiLanguageProperty);
				if (result == null) result = caseDataElement(multiLanguageProperty);
				if (result == null) result = caseSubmodelElement(multiLanguageProperty);
				if (result == null) result = caseHasDataSpecification(multiLanguageProperty);
				if (result == null) result = caseReferable(multiLanguageProperty);
				if (result == null) result = caseQualifiable(multiLanguageProperty);
				if (result == null) result = caseHasSemantics(multiLanguageProperty);
				if (result == null) result = caseHasKind(multiLanguageProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.REFERENCE_ELEMENT: {
				IReferenceElement referenceElement = (IReferenceElement)theEObject;
				T result = caseReferenceElement(referenceElement);
				if (result == null) result = caseDataElement(referenceElement);
				if (result == null) result = caseSubmodelElement(referenceElement);
				if (result == null) result = caseHasDataSpecification(referenceElement);
				if (result == null) result = caseReferable(referenceElement);
				if (result == null) result = caseQualifiable(referenceElement);
				if (result == null) result = caseHasSemantics(referenceElement);
				if (result == null) result = caseHasKind(referenceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.RANGE: {
				IRange range = (IRange)theEObject;
				T result = caseRange(range);
				if (result == null) result = caseDataElement(range);
				if (result == null) result = caseSubmodelElement(range);
				if (result == null) result = caseHasDataSpecification(range);
				if (result == null) result = caseReferable(range);
				if (result == null) result = caseQualifiable(range);
				if (result == null) result = caseHasSemantics(range);
				if (result == null) result = caseHasKind(range);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.BLOB: {
				IBlob blob = (IBlob)theEObject;
				T result = caseBlob(blob);
				if (result == null) result = caseDataElement(blob);
				if (result == null) result = caseSubmodelElement(blob);
				if (result == null) result = caseHasDataSpecification(blob);
				if (result == null) result = caseReferable(blob);
				if (result == null) result = caseQualifiable(blob);
				if (result == null) result = caseHasSemantics(blob);
				if (result == null) result = caseHasKind(blob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.FILE: {
				IFile file = (IFile)theEObject;
				T result = caseFile(file);
				if (result == null) result = caseDataElement(file);
				if (result == null) result = caseSubmodelElement(file);
				if (result == null) result = caseHasDataSpecification(file);
				if (result == null) result = caseReferable(file);
				if (result == null) result = caseQualifiable(file);
				if (result == null) result = caseHasSemantics(file);
				if (result == null) result = caseHasKind(file);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.SUBMODEL_ELEMENT_COLLECTION: {
				ISubmodelElementCollection submodelElementCollection = (ISubmodelElementCollection)theEObject;
				T result = caseSubmodelElementCollection(submodelElementCollection);
				if (result == null) result = caseSubmodelElement(submodelElementCollection);
				if (result == null) result = caseHasDataSpecification(submodelElementCollection);
				if (result == null) result = caseReferable(submodelElementCollection);
				if (result == null) result = caseQualifiable(submodelElementCollection);
				if (result == null) result = caseHasSemantics(submodelElementCollection);
				if (result == null) result = caseHasKind(submodelElementCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.RELATIONSHIP_ELEMENT: {
				IRelationshipElement relationshipElement = (IRelationshipElement)theEObject;
				T result = caseRelationshipElement(relationshipElement);
				if (result == null) result = caseSubmodelElement(relationshipElement);
				if (result == null) result = caseHasDataSpecification(relationshipElement);
				if (result == null) result = caseReferable(relationshipElement);
				if (result == null) result = caseQualifiable(relationshipElement);
				if (result == null) result = caseHasSemantics(relationshipElement);
				if (result == null) result = caseHasKind(relationshipElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.ANNOTATED_RELATIONSHIP_ELEMENT: {
				IAnnotatedRelationshipElement annotatedRelationshipElement = (IAnnotatedRelationshipElement)theEObject;
				T result = caseAnnotatedRelationshipElement(annotatedRelationshipElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.OPERATION: {
				IOperation operation = (IOperation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseSubmodelElement(operation);
				if (result == null) result = caseHasDataSpecification(operation);
				if (result == null) result = caseReferable(operation);
				if (result == null) result = caseQualifiable(operation);
				if (result == null) result = caseHasSemantics(operation);
				if (result == null) result = caseHasKind(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.OPERATION_VARIABLE: {
				IOperationVariable operationVariable = (IOperationVariable)theEObject;
				T result = caseOperationVariable(operationVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.CAPABILITY: {
				ICapability capability = (ICapability)theEObject;
				T result = caseCapability(capability);
				if (result == null) result = caseSubmodelElement(capability);
				if (result == null) result = caseHasDataSpecification(capability);
				if (result == null) result = caseReferable(capability);
				if (result == null) result = caseQualifiable(capability);
				if (result == null) result = caseHasSemantics(capability);
				if (result == null) result = caseHasKind(capability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.ENTITY: {
				IEntity entity = (IEntity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseSubmodelElement(entity);
				if (result == null) result = caseHasDataSpecification(entity);
				if (result == null) result = caseReferable(entity);
				if (result == null) result = caseQualifiable(entity);
				if (result == null) result = caseHasSemantics(entity);
				if (result == null) result = caseHasKind(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.EVENT: {
				IEvent event = (IEvent)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseSubmodelElement(event);
				if (result == null) result = caseHasDataSpecification(event);
				if (result == null) result = caseReferable(event);
				if (result == null) result = caseQualifiable(event);
				if (result == null) result = caseHasSemantics(event);
				if (result == null) result = caseHasKind(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.BASIC_EVENT: {
				IBasicEvent basicEvent = (IBasicEvent)theEObject;
				T result = caseBasicEvent(basicEvent);
				if (result == null) result = caseEvent(basicEvent);
				if (result == null) result = caseSubmodelElement(basicEvent);
				if (result == null) result = caseHasDataSpecification(basicEvent);
				if (result == null) result = caseReferable(basicEvent);
				if (result == null) result = caseQualifiable(basicEvent);
				if (result == null) result = caseHasSemantics(basicEvent);
				if (result == null) result = caseHasKind(basicEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.VIEW: {
				IView view = (IView)theEObject;
				T result = caseView(view);
				if (result == null) result = caseHasDataSpecification(view);
				if (result == null) result = caseHasSemantics(view);
				if (result == null) result = caseReferable(view);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.CONCEPT_DICTIONARY: {
				IConceptDictionary conceptDictionary = (IConceptDictionary)theEObject;
				T result = caseConceptDictionary(conceptDictionary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.CONCEPT_DESCRIPTION: {
				IConceptDescription conceptDescription = (IConceptDescription)theEObject;
				T result = caseConceptDescription(conceptDescription);
				if (result == null) result = caseHasDataSpecification(conceptDescription);
				if (result == null) result = caseIdentifiable(conceptDescription);
				if (result == null) result = caseReferable(conceptDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.REFERENCE: {
				IReference reference = (IReference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.KEY: {
				IKey key = (IKey)theEObject;
				T result = caseKey(key);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.SECURITY: {
				ISecurity security = (ISecurity)theEObject;
				T result = caseSecurity(security);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IAasPackage.ASSET_ADMINISTRATION_SHELL_BUNDLE: {
				IAssetAdministrationShellBundle assetAdministrationShellBundle = (IAssetAdministrationShellBundle)theEObject;
				T result = caseAssetAdministrationShellBundle(assetAdministrationShellBundle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	public T caseReferable(IReferable object) {
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
	public T caseIdentifiable(IIdentifiable object) {
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
	public T caseIdentifier(IIdentifier object) {
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
	public T caseHasKind(IHasKind object) {
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
	public T caseAdministrativeInformation(IAdministrativeInformation object) {
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
	public T caseHasSemantics(IHasSemantics object) {
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
	public T caseQualifiable(IQualifiable object) {
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
	public T caseConstraint(IConstraint object) {
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
	public T caseQualifier(IQualifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormula(IFormula object) {
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
	public T caseHasDataSpecification(IHasDataSpecification object) {
		return null;
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
	public T caseAssetAdministrationShell(IAssetAdministrationShell object) {
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
	public T caseAsset(IAsset object) {
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
	public T caseSubmodel(ISubmodel object) {
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
	public T caseSubmodelElement(ISubmodelElement object) {
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
	public T caseDataElement(IDataElement object) {
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
	public T caseProperty(IProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Language Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Language Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiLanguageProperty(IMultiLanguageProperty object) {
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
	public T caseReferenceElement(IReferenceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRange(IRange object) {
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
	public T caseBlob(IBlob object) {
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
	public T caseFile(IFile object) {
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
	public T caseSubmodelElementCollection(ISubmodelElementCollection object) {
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
	public T caseRelationshipElement(IRelationshipElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotated Relationship Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotated Relationship Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotatedRelationshipElement(IAnnotatedRelationshipElement object) {
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
	public T caseOperation(IOperation object) {
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
	public T caseOperationVariable(IOperationVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapability(ICapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(IEntity object) {
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
	public T caseEvent(IEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicEvent(IBasicEvent object) {
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
	public T caseView(IView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Dictionary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Dictionary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptDictionary(IConceptDictionary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptDescription(IConceptDescription object) {
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
	public T caseReference(IReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKey(IKey object) {
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
	public T caseSecurity(ISecurity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset Administration Shell Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Administration Shell Bundle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetAdministrationShellBundle(IAssetAdministrationShellBundle object) {
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
