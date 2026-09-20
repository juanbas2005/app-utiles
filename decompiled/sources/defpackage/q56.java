package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: q56  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q56 extends nd2 {
    public static final ae5 A = tz2.k("/");
    public final ClassLoader x;
    public final nd2 y;
    public final z97 z = new z97(new hx4(11, this));

    static {
        String str = ae5.x;
    }

    public q56(ClassLoader classLoader) {
        sp3 sp3 = nd2.w;
        sp3.getClass();
        this.x = classLoader;
        this.y = sp3;
    }

    public final List B(ae5 ae5) {
        ae5 ae52 = A;
        ae52.getClass();
        String r = f.b(ae52, ae5, true).c(ae52).w.r();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z2 = false;
        for (yb5 yb5 : (List) this.z.getValue()) {
            nd2 nd2 = (nd2) yb5.w;
            ae5 ae53 = (ae5) yb5.x;
            try {
                List B = nd2.B(ae53.d(r));
                ArrayList arrayList = new ArrayList();
                for (Object next : B) {
                    if (jv2.e((ae5) next)) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(et0.e0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ae5 ae54 = (ae5) it.next();
                    ae54.getClass();
                    String replace = d57.R0(ae54.w.r(), ae53.w.r()).replace('\\', '/');
                    replace.getClass();
                    arrayList2.add(ae52.d(replace));
                }
                it0.h0(linkedHashSet, arrayList2);
                z2 = true;
            } catch (IOException unused) {
            }
        }
        if (z2) {
            return dt0.b1(linkedHashSet);
        }
        ta1.m("file not found: ", ae5);
        return null;
    }

    public final dq1 E(ae5 ae5) {
        ae5.getClass();
        if (!jv2.e(ae5)) {
            return null;
        }
        ae5 ae52 = A;
        ae52.getClass();
        String r = f.b(ae52, ae5, true).c(ae52).w.r();
        for (yb5 yb5 : (List) this.z.getValue()) {
            dq1 E = ((nd2) yb5.w).E(((ae5) yb5.x).d(r));
            if (E != null) {
                return E;
            }
        }
        return null;
    }

    public final go3 G(ae5 ae5) {
        if (jv2.e(ae5)) {
            ae5 ae52 = A;
            ae52.getClass();
            String r = f.b(ae52, ae5, true).c(ae52).w.r();
            for (yb5 yb5 : (List) this.z.getValue()) {
                try {
                    return ((nd2) yb5.w).G(((ae5) yb5.x).d(r));
                } catch (FileNotFoundException unused) {
                }
            }
            ta1.m("file not found: ", ae5);
            return null;
        }
        ta1.m("file not found: ", ae5);
        return null;
    }

    public final tu6 I(ae5 ae5) {
        ae5.getClass();
        throw new IOException(this + " is read-only");
    }

    public final oy6 L(ae5 ae5) {
        ae5.getClass();
        if (jv2.e(ae5)) {
            ae5 ae52 = A;
            ae52.getClass();
            URL resource = this.x.getResource(f.b(ae52, ae5, false).c(ae52).w.r());
            if (resource != null) {
                URLConnection openConnection = resource.openConnection();
                if (openConnection instanceof JarURLConnection) {
                    ((JarURLConnection) openConnection).setUseCaches(false);
                }
                InputStream inputStream = openConnection.getInputStream();
                inputStream.getClass();
                return j45.q(inputStream);
            }
            ta1.m("file not found: ", ae5);
            return null;
        }
        ta1.m("file not found: ", ae5);
        return null;
    }

    public final tu6 a(ae5 ae5) {
        ae5.getClass();
        throw new IOException(this + " is read-only");
    }

    public final void k(ae5 ae5, ae5 ae52) {
        ae5.getClass();
        ae52.getClass();
        throw new IOException(this + " is read-only");
    }

    public final void l(ae5 ae5) {
        ae5.getClass();
        throw new IOException(this + " is read-only");
    }

    public final void o(ae5 ae5) {
        ae5.getClass();
        throw new IOException(this + " is read-only");
    }
}
