package defpackage;

import org.xml.sax.Attributes;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: sd6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sd6 implements Attributes {
    public XmlPullParser a;

    public final int getIndex(String str, String str2) {
        return -1;
    }

    public final int getLength() {
        return this.a.getAttributeCount();
    }

    public final String getLocalName(int i) {
        return this.a.getAttributeName(i);
    }

    public final String getQName(int i) {
        XmlPullParser xmlPullParser = this.a;
        String attributeName = xmlPullParser.getAttributeName(i);
        if (xmlPullParser.getAttributePrefix(i) == null) {
            return attributeName;
        }
        return xmlPullParser.getAttributePrefix(i) + ':' + attributeName;
    }

    public final String getType(int i) {
        return null;
    }

    public final String getURI(int i) {
        return this.a.getAttributeNamespace(i);
    }

    public final String getValue(int i) {
        return this.a.getAttributeValue(i);
    }

    public final int getIndex(String str) {
        return -1;
    }

    public final String getType(String str, String str2) {
        return null;
    }

    public final String getType(String str) {
        return null;
    }

    public final String getValue(String str, String str2) {
        return null;
    }

    public final String getValue(String str) {
        return null;
    }
}
