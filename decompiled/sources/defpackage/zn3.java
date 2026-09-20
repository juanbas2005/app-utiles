package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: zn3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zn3 implements ba5 {
    public final kb4 a;
    public final tl4 b;
    public ws1 c;
    public final m70 d;

    public zn3(kb4 kb4, rg4 rg4, tl4 tl4) {
        this.a = kb4;
        this.b = tl4;
        this.d = kb4.c(new b0(2, this));
    }

    public final boolean a(up2 up2) {
        Object obj;
        up2.getClass();
        m70 m70 = this.d;
        Object obj2 = ((ConcurrentHashMap) m70.y).get(up2);
        if (obj2 == null || obj2 == jb4.x) {
            obj = c(up2);
        } else {
            obj = (x95) m70.y(up2);
        }
        if (obj == null) {
            return true;
        }
        return false;
    }

    public final void b(up2 up2, ArrayList arrayList) {
        up2.getClass();
        Object y = this.d.y(up2);
        if (y != null) {
            arrayList.add(y);
        }
    }

    public final rd0 c(up2 up2) {
        InputStream inputStream;
        up2.getClass();
        uq4 uq4 = n27.j;
        uq4.getClass();
        if (!up2.a.h(uq4)) {
            inputStream = null;
        } else {
            md0.m.getClass();
            inputStream = td0.D(md0.a(up2));
        }
        if (inputStream != null) {
            return ag8.n(up2, this.a, this.b, inputStream);
        }
        return null;
    }

    public final Collection x(up2 up2, vr2 vr2) {
        up2.getClass();
        return g42.w;
    }
}
