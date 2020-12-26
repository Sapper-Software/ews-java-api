package microsoft.exchange.webservices.data.core;

import java.util.Properties;

public class EWSProperties extends Properties {
    private static final String PROP_DEF_REPLACE_CHAR = "ews.xml.replace.char";
    private static final String PROP_DEF_REPLACE_REGEX = "ews.xml.replace.regex";
    private static final String DEFAULT_XML_REPLACE_CHAR = "&#63;";
    private static final String DEFAULT_XML_REPLACE_REGEX = "&#x0*[1-8];|[^\\u0001-\\uD7FF\\uE000-\\uFFFD\\u10000-\\u10FFFF]";

    public EWSProperties() {
        setDefaultXmlReplaceChar(DEFAULT_XML_REPLACE_CHAR);
        setXmlReplaceRegex(DEFAULT_XML_REPLACE_REGEX);
    }

    public EWSProperties setDefaultXmlReplaceChar(String value) {
        setProperty(PROP_DEF_REPLACE_CHAR, value);
        return this;
    }

    public String getDefaultXmlReplaceChar() {
        String ss = getProperty(PROP_DEF_REPLACE_CHAR);
        if (ss == null || ss.isEmpty()) {
            return DEFAULT_XML_REPLACE_CHAR;
        }
        return ss;
    }

    public EWSProperties setXmlReplaceRegex(String value) {
        if (value == null || value.isEmpty()) {
            value = DEFAULT_XML_REPLACE_REGEX;
        }
        setProperty(PROP_DEF_REPLACE_REGEX, value);
        return this;
    }

    public String getXmlReplaceRegex() {
        String ss = getProperty(PROP_DEF_REPLACE_REGEX);
        if (ss == null || ss.isEmpty()) {
            return DEFAULT_XML_REPLACE_REGEX;
        }
        return ss;
    }

    public static final EWSProperties properties = new EWSProperties();
}
