package defpackage;

import java.util.List;
import java.util.concurrent.Semaphore;

/* renamed from: h94  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h94 extends bp4 {
    public final int l;
    public final ai8 m;
    public t54 n;
    public v70 o;

    public h94(int i, ai8 ai8) {
        this.l = i;
        this.m = ai8;
        if (ai8.b == null) {
            ai8.b = this;
            ai8.a = i;
            return;
        }
        h.s("There is already a listener registered");
        throw null;
    }

    public final void e() {
        ai8 ai8 = this.m;
        ai8.d = true;
        ai8.f = false;
        ai8.e = false;
        switch (ai8.k) {
            case b85.b:
                ((Semaphore) ai8.l).drainPermits();
                ai8.d();
                return;
            default:
                List list = (List) ai8.l;
                if (list != null) {
                    ai8.b(list);
                    return;
                } else {
                    ai8.d();
                    return;
                }
        }
    }

    public final void f() {
        ai8 ai8 = this.m;
        ai8.d = false;
        switch (ai8.k) {
            case 1:
                ai8.a();
                return;
            default:
                return;
        }
    }

    public final void h(g35 g35) {
        super.h(g35);
        this.n = null;
        this.o = null;
    }

    public final void j() {
        ai8 ai8 = this.m;
        ai8.a();
        ai8.e = true;
        v70 v70 = this.o;
        if (v70 != null) {
            h(v70);
            if (v70.x) {
                ((g94) v70.y).e();
            }
        }
        h94 h94 = ai8.b;
        if (h94 == null) {
            h.s("No listener register");
        } else if (h94 == this) {
            ai8.b = null;
            if (v70 != null) {
                boolean z = v70.x;
            }
            ai8.f = true;
            ai8.d = false;
            ai8.e = false;
            ai8.g = false;
        } else {
            h.q("Attempting to unregister the wrong listener");
        }
    }

    public final void k() {
        t54 t54 = this.n;
        v70 v70 = this.o;
        if (t54 != null && v70 != null) {
            super.h(v70);
            d(t54, v70);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.l);
        sb.append(" : ");
        Class<?> cls = this.m.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
