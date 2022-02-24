package de.dfki.cos.basys.aas.server.util;

import com.google.common.base.Charsets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DecodingHttpServletRequestWrapper extends HttpServletRequestWrapper {

    private final String patternString = "(?<prefix>\\/shells\\/)(?<aasId>.*)(?<postfix>\\/.*)";
    private Pattern pattern = Pattern.compile(patternString);

    public DecodingHttpServletRequestWrapper(HttpServletRequest request) {
        super(request);
    }


    @Override
    public String getRequestURI() {
        String request = super.getRequestURI();

        Matcher matcher = pattern.matcher(request);
        boolean matches = matcher.matches();
        if (!matches) {
            return request;
        }

        String prefix = matcher.group("prefix");
        String aasId = matcher.group("aasId");
        String postfix = matcher.group("postfix");
        String decodedId = base64DecodeUrlEncodeId(aasId);
        String result = "/shells" + prefix + decodedId + postfix;

        return result;
    }

    private String base64DecodeUrlEncodeId(String id) {
        return URLEncoder.encode(new String(Base64.getUrlDecoder().decode(id), Charsets.UTF_8),Charsets.UTF_8);
        //return URLDecoder.decode(id, StandardCharsets.UTF_8);
    }
}
