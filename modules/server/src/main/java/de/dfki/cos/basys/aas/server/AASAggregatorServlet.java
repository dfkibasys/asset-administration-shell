package de.dfki.cos.basys.aas.server;

import org.eclipse.basyx.aas.aggregator.AASAggregator;
import org.eclipse.basyx.aas.aggregator.api.IAASAggregator;
import org.eclipse.basyx.aas.aggregator.restapi.AASAggregatorProvider;
import org.eclipse.basyx.vab.exception.provider.MalformedRequestException;
import org.eclipse.basyx.vab.modelprovider.VABPathTools;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class AASAggregatorServlet extends org.eclipse.basyx.components.aas.servlet.AASAggregatorServlet {

    public AASAggregatorServlet() {
        super();
    }

    public AASAggregatorServlet(IAASAggregator aggregator) {
        super(aggregator);
    }

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.service(new DecodingHttpServletRequestWrapper(request), response);
    }

}
