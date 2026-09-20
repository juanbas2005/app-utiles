package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: u36  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u36 {
    public Set a;
    public ny0 b;
    public final eq4 c;
    public up4 d = new up4();
    public eq4 e;
    public final eq4 f;
    public final eq4 g;
    public up4 h;
    public tp4 i;
    public ArrayList j;
    public up4 k;

    public u36() {
        eq4 eq4 = new eq4(new cu2[16]);
        this.c = eq4;
        up4 up4 = cg6.a;
        this.e = eq4;
        this.f = new eq4(new Object[16]);
        this.g = new eq4(new sr2[16]);
    }

    public static final boolean f(cu2 cu2, eq4 eq4) {
        Object[] objArr = eq4.w;
        int i2 = eq4.y;
        for (int i3 = 0; i3 < i2; i3++) {
            v36 v36 = ((cu2) objArr[i3]).a;
            if (v36 instanceof af5) {
                eq4 eq42 = ((af5) v36).x;
                if (eq42.k(cu2) || f(cu2, eq42)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        this.a = null;
        this.b = null;
        eq4 eq4 = this.c;
        eq4.g();
        this.d.b();
        this.e = eq4;
        this.f.g();
        this.g.g();
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public final void b() {
        Set set = this.a;
        if (set != null && !set.isEmpty()) {
            Trace.beginSection("Compose:abandons");
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    it.remove();
                    ((v36) it.next()).a();
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void c() {
        cu2 cu2;
        Object obj;
        Set set = this.a;
        if (set != null) {
            this.k = null;
            eq4 eq4 = this.f;
            if (eq4.y != 0) {
                Trace.beginSection("Compose:onForgotten");
                try {
                    up4 up4 = this.h;
                    int i2 = eq4.y;
                    while (true) {
                        i2--;
                        if (-1 >= i2) {
                            break;
                        }
                        obj = eq4.w[i2];
                        if (obj instanceof cu2) {
                            v36 v36 = ((cu2) obj).a;
                            set.remove(v36);
                            v36.b();
                        }
                        if (obj instanceof jx0) {
                            if (up4 == null || !up4.c(obj)) {
                                ((jx0) obj).b();
                            } else {
                                ((jx0) obj).a();
                            }
                        }
                    }
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            eq4 eq42 = this.c;
            if (eq42.y != 0) {
                Trace.beginSection("Compose:onRemembered");
                try {
                    Set set2 = this.a;
                    if (set2 != null) {
                        Object[] objArr = eq42.w;
                        int i3 = eq42.y;
                        for (int i4 = 0; i4 < i3; i4++) {
                            cu2 = (cu2) objArr[i4];
                            v36 v362 = cu2.a;
                            set2.remove(v362);
                            v362.c();
                        }
                    }
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
        }
    }

    public final void d() {
        eq4 eq4 = this.g;
        if (eq4.y != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = eq4.w;
                int i2 = eq4.y;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((sr2) objArr[i3]).b();
                }
                eq4.g();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e(cu2 cu2) {
        if (this.d.c(cu2)) {
            this.d.l(cu2);
            if (!this.e.k(cu2)) {
                eq4 eq4 = this.c;
                if (!eq4.k(cu2)) {
                    f(cu2, eq4);
                }
            }
            Set set = this.a;
            if (set != null) {
                set.add(cu2.a);
                return;
            }
            return;
        }
        up4 up4 = this.k;
        if (up4 == null || !up4.c(cu2)) {
            this.f.b(cu2);
        }
    }

    public final void g(Set set, ny0 ny0) {
        a();
        this.a = set;
        this.b = ny0;
    }
}
