package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* renamed from: fc3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fc3 extends ki4 {
    public final ji4 b;

    public fc3(ji4 ji4) {
        ji4.getClass();
        this.b = ji4;
    }

    public final Collection a(is1 is1, vr2 vr2) {
        is1 is12;
        is1.getClass();
        int i = is1.l & is1.b;
        if (i == 0) {
            is12 = null;
        } else {
            is12 = new is1(i, is1.a);
        }
        if (is12 == null) {
            return a42.w;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : this.b.a(is12, vr2)) {
            if (next instanceof wq0) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final Set c() {
        return this.b.c();
    }

    public final Set d() {
        return this.b.d();
    }

    public final vq0 e(uq4 uq4, oz4 oz4) {
        ql4 ql4;
        uq4.getClass();
        oz4.getClass();
        vq0 e = this.b.e(uq4, oz4);
        if (e != null) {
            if (e instanceof ql4) {
                ql4 = (ql4) e;
            } else {
                ql4 = null;
            }
            if (ql4 != null) {
                return ql4;
            }
            if (e instanceof ut1) {
                return (ut1) e;
            }
        }
        return null;
    }

    public final Set g() {
        return this.b.g();
    }

    public final String toString() {
        return "Classes from " + this.b;
    }
}
