package de.dfki.cos.basys.aas.component.impl;

import java.util.Properties;

import org.eclipse.basyx.aas.metamodel.api.parts.asset.AssetKind;
import org.eclipse.basyx.aas.metamodel.map.AssetAdministrationShell;
import org.eclipse.basyx.aas.metamodel.map.descriptor.AASDescriptor;
import org.eclipse.basyx.aas.metamodel.map.descriptor.ModelDescriptor;
import org.eclipse.basyx.aas.metamodel.map.descriptor.ModelUrn;
import org.eclipse.basyx.aas.metamodel.map.descriptor.SubmodelDescriptor;
import org.eclipse.basyx.aas.metamodel.map.parts.Asset;
import org.eclipse.basyx.aas.restapi.AASModelProvider;
import org.eclipse.basyx.aas.restapi.VABMultiSubmodelProvider;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IdentifierType;
import org.eclipse.basyx.submodel.metamodel.api.qualifier.haskind.ModelingKind;
import org.eclipse.basyx.submodel.metamodel.api.reference.enums.KeyElements;
import org.eclipse.basyx.submodel.metamodel.map.SubModel;
import org.eclipse.basyx.submodel.metamodel.map.identifier.Identifier;
import org.eclipse.basyx.submodel.metamodel.map.reference.Key;
import org.eclipse.basyx.submodel.metamodel.map.reference.Reference;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElement;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.Blob;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.File;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.property.Property;
import org.eclipse.basyx.submodel.restapi.SubModelProvider;
import org.eclipse.basyx.vab.modelprovider.api.IModelProvider;

import de.dfki.cos.basys.aas.component.AasComponent;
import de.dfki.cos.basys.aas.component.ModelProviderComponent;
import de.dfki.cos.basys.aas.component.SubmodelComponent;
import de.dfki.cos.basys.common.component.ComponentException;
import de.dfki.cos.basys.common.component.impl.BaseComponent;

public class BaseSubmodelComponent extends BaseComponent implements SubmodelComponent {
	
	//protected AASDescriptor descriptor = null;
	protected SubModel sm = null;
	protected IModelProvider provider = null;
	//protected String endpoint = null;
	
	public BaseSubmodelComponent(Properties config) {
		super(config);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doActivate() throws ComponentException {	
		super.doActivate();
		
		sm = createfromProperties(config);	
		provider = new SubModelProvider(sm);
//		endpoint = ((AasComponentContext)context).getServletContainer().addModelProvider(provider, aas.getIdShort());
//		descriptor = new AASDescriptor(getAas(), endpoint);
//		((AasComponentContext)context).getAasRegistry().register(descriptor);
		
	}
	
	@Override
	protected void doDeactivate() throws ComponentException {	
		super.doDeactivate();
//		((AasComponentContext)context).getAasRegistry().delete(descriptor.getIdentifier());
//		((AasComponentContext)context).getServletContainer().removeServletMapping(aas.getIdShort());
		//provider = null;		
		sm = null;
//		descriptor = null;
//		endpoint = null;
	}
	

//	public AssetAdministrationShell getAas() {
//		return aas;
//	}
//	

	@Override
	public Identifier getAssetId() {
		return new Identifier(IdentifierType.IRI,config.getProperty("asset.id", ""));
	}
	
	@Override
	public Identifier getAasId() {
		return new Identifier(IdentifierType.IRI,config.getProperty("aas.id", ""));
	}

	@Override
	public Identifier getSubmodelId() {
		return new Identifier(IdentifierType.IRI,config.getProperty("submodel.id", ""));
	}
	
	@Override
	public SubmodelDescriptor getModelDescriptor(String endpoint) {		
		return new SubmodelDescriptor(sm, endpoint + "/" + sm.getIdShort() + "/submodel");
	}

	@Override
	public IModelProvider getModelProvider() {
		return provider;
	}
	
	@Override
	public SubModel getSubmodel() {
		return sm;
	}
	
	protected SubModel createfromProperties(Properties properties) {
		SubModel sm = new SubModel();		
		sm.setIdShort(properties.getProperty("submodel.idshort"));
		sm.setIdentification(IdentifierType.IRI, config.getProperty("submodel.id", ""));
		sm.setModelingKind(ModelingKind.INSTANCE);
		sm.setSemanticId(new Reference(new Key(KeyElements.CONCEPTDESCRIPTION, false, properties.getProperty("submodel.semanticid"), IdentifierType.CUSTOM)));
		
		String[] elements = properties.getProperty("submodel.properties").split("\\s*,\\s*");
		for (String p : elements) {
			String value = properties.getProperty(p);
			String type = properties.getProperty(p+".type");
			String semanticId = properties.getProperty(p+".semanticid");
			
			SubmodelElement smElement = null;
			
			if (type.equalsIgnoreCase("file")) {
				String mimeType = properties.getProperty(p+".mime");
				smElement = new File(value, mimeType);
			} else if (type.equalsIgnoreCase("blob")) {
				String mimeType = properties.getProperty(p+".mime");
				smElement = new Blob(value.getBytes(), mimeType);
			} else if (type.equalsIgnoreCase("property")) {
				smElement = new Property(value);
			} 
			
			if (semanticId != null) {
				smElement.setSemanticID(new Reference(new Key(KeyElements.CONCEPTDESCRIPTION, false, semanticId, IdentifierType.CUSTOM)));
			}
						
			smElement.setIdShort(p);
			sm.addSubModelElement(smElement);
			
		}				
		
		return sm;
	}



}
