package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.SAXException;

/* renamed from: kb6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class kb6 extends jc6 implements hc6 {
    public List h = new ArrayList();
    public Boolean i;
    public Matrix j;
    public int k;
    public String l;

    public final List a() {
        return this.h;
    }

    public final void f(lc6 lc6) {
        if (lc6 instanceof cc6) {
            this.h.add(lc6);
            return;
        }
        throw new SAXException("Gradient elements cannot contain " + lc6 + " elements.");
    }
}
