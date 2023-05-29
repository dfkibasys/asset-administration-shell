package de.dfki.cos.basys.aas.server.util;

//import de.dfki.cos.basys.aas.server.basyx.VABHTTPInterface;

import org.eclipse.basyx.aas.aggregator.AASAggregator;
import org.eclipse.basyx.aas.aggregator.api.IAASAggregator;
import org.eclipse.basyx.aas.aggregator.restapi.AASAggregatorProvider;
import org.eclipse.basyx.vab.protocol.http.server.VABHTTPInterface;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AASAggregatorServlet extends VABHTTPInterface<AASAggregatorProvider> {

    private static final long serialVersionUID = 1244938902937878401L;

    public AASAggregatorServlet() {
        super(new AASAggregatorProvider(new AASAggregator()));
    }

    public AASAggregatorServlet(IAASAggregator aggregator) {
        super(new AASAggregatorProvider(aggregator));
    }

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.service(new DecodingHttpServletRequestWrapper(request), response);
    }

}
