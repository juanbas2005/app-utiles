package defpackage;

import org.xml.sax.Attributes;
import org.xml.sax.ext.DefaultHandler2;

/* renamed from: pd6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pd6 extends DefaultHandler2 {
    public final /* synthetic */ td6 a;

    public pd6(td6 td6) {
        this.a = td6;
    }

    public final void characters(char[] cArr, int i, int i2) {
        this.a.F(new String(cArr, i, i2));
    }

    public final void endElement(String str, String str2, String str3) {
        this.a.c(str, str2, str3);
    }

    public final void processingInstruction(String str, String str2) {
        td6.y(new xs0(str2));
        str.equals("xml-stylesheet");
    }

    public final void startDocument() {
        this.a.D();
    }

    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        this.a.E(str, str2, str3, attributes);
    }

    public final void endDocument() {
    }
}
