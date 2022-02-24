package de.dfki.cos.basys.aas.server.util;

import com.google.common.base.Charsets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.net.URLDecoder;

public class DecodingHttpServletRequestWrapper extends HttpServletRequestWrapper {

    public DecodingHttpServletRequestWrapper(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String getRequestURI() {
        return "/shells/" + URLDecoder.decode(super.getRequestURI(), Charsets.UTF_8);
    }
}
