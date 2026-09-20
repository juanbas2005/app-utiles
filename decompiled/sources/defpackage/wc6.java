package defpackage;

import org.xml.sax.SAXException;

/* renamed from: wc6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class wc6 extends gc6 {
    public final void f(lc6 lc6) {
        if (lc6 instanceof vc6) {
            this.i.add(lc6);
            return;
        }
        throw new SAXException("Text content elements cannot contain " + lc6 + " elements.");
    }
}
