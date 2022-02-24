package de.dfki.cos.basys.aas.server.util;

import org.eclipse.basyx.aas.aggregator.api.IAASAggregator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
