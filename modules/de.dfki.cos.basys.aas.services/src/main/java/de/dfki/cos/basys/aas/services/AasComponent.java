package de.dfki.cos.basys.aas.services;

import java.util.Properties;

import org.eclipse.basyx.aas.metamodel.api.parts.asset.AssetKind;
import org.eclipse.basyx.aas.metamodel.map.AssetAdministrationShell;
import org.eclipse.basyx.aas.metamodel.map.descriptor.AASDescriptor;
import org.eclipse.basyx.aas.metamodel.map.descriptor.ModelDescriptor;
import org.eclipse.basyx.aas.metamodel.map.descriptor.ModelUrn;
import org.eclipse.basyx.aas.metamodel.map.parts.Asset;
import org.eclipse.basyx.aas.restapi.AASModelProvider;
import org.eclipse.basyx.aas.restapi.VABMultiSubmodelProvider;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IdentifierType;
import org.eclipse.basyx.vab.modelprovider.api.IModelProvider;

import de.dfki.cos.basys.common.component.ComponentException;
import de.dfki.cos.basys.common.component.impl.BaseComponent;

public class AasComponent extends BaseComponent implements ModelProviderComponent {
	
	//protected AASDescriptor descriptor = null;
	protected AssetAdministrationShell aas = null;
	protected VABMultiSubmodelProvider provider = null;
	//protected String endpoint = null;
	
	public AasComponent(Properties config) {
		super(config);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doActivate() throws ComponentException {	
		super.doActivate();
		
		aas = createfromProperties(config);	
		provider = new VABMultiSubmodelProvider(new AASModelProvider(aas));
//		endpoint = ((AasComponentContext)context).getServletContainer().addModelProvider(provider, aas.getIdShort());
//		descriptor = new AASDescriptor(getAas(), endpoint);
//		((AasComponentContext)context).getAasRegistry().register(descriptor);
		
	}
	
	@Override
	protected void doDeactivate() throws ComponentException {	
		super.doDeactivate();
//		((AasComponentContext)context).getAasRegistry().delete(descriptor.getIdentifier());
//		((AasComponentContext)context).getServletContainer().removeServletMapping(aas.getIdShort());
		provider = null;		
		aas = null;
//		descriptor = null;
//		endpoint = null;
	}
	

//	public AssetAdministrationShell getAas() {
//		return aas;
//	}
//	

	@Override
	public ModelDescriptor getModelDescriptor(String endpoint) {		
		return new AASDescriptor(aas, endpoint + "/" + aas.getIdShort());
	}

	@Override
	public IModelProvider getModelProvider() {
		return provider;
	}
	
	protected AssetAdministrationShell createfromProperties(Properties properties) {
		Asset asset = new Asset();
		asset.setIdentification(IdentifierType.IRI, properties.getProperty("asset.id"));
		asset.setIdShort(properties.getProperty("asset.idshort"));
		asset.setAssetKind(AssetKind.INSTANCE);
				
		AssetAdministrationShell aas = new AssetAdministrationShell();
		ModelUrn aasURN = new ModelUrn(properties.getProperty("aas.id"));
		aas.setIdentification(aasURN);
		aas.setIdShort(properties.getProperty("aas.idshort"));
		aas.setAsset(asset);
		
		return aas;
	}
}
