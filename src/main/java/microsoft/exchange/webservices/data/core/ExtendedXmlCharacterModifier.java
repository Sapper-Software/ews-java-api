package microsoft.exchange.webservices.data.core;

import com.github.rwitzel.streamflyer.xml.InvalidXmlCharacterModifier;

public class ExtendedXmlCharacterModifier extends InvalidXmlCharacterModifier {
    public ExtendedXmlCharacterModifier(String replacement, String xmlVersion) {
        super(replacement, xmlVersion);
    }

    public ExtendedXmlCharacterModifier(int newNumberOfChars, String replacement, String xmlVersion, boolean dollarZero) {
        super(newNumberOfChars, replacement, xmlVersion, dollarZero);
    }

    @Override
    protected String getInvalidXmlCharacterRegex_Xml10() {
        String ss = super.getInvalidXmlCharacterRegex_Xml10();
        return String.format("%s | ^0x0*[1-8]", ss);
    }

    @Override
    protected String getInvalidXmlCharacterRegex_Xml11() {
        String ss = super.getInvalidXmlCharacterRegex_Xml11();
        return String.format("%s | ^0x0*[1-8]", ss);
    }
}
