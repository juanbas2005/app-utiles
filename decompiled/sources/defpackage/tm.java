package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: tm  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tm implements rm {
    public final /* synthetic */ int w;
    public final Object x;

    public tm(rm[] rmVarArr) {
        this.w = 1;
        this.x = qs.p1(rmVarArr);
    }

    public final boolean i(up2 up2) {
        switch (this.w) {
            case b85.b:
                return gw8.y(this, up2);
            case 1:
                up2.getClass();
                for (rm i : (Iterable) dt0.o0((List) this.x).b) {
                    if (i.i(up2)) {
                        return true;
                    }
                }
                return false;
            default:
                return gw8.y(this, up2);
        }
    }

    public final boolean isEmpty() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                return ((List) obj).isEmpty();
            case 1:
                List<rm> list = (List) obj;
                if (list == null || !list.isEmpty()) {
                    for (rm isEmpty : list) {
                        if (!isEmpty.isEmpty()) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                return false;
        }
    }

    public final Iterator iterator() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                return ((List) obj).iterator();
            case 1:
                return new zd2(new xg2(dt0.o0((List) obj), e7.N, gl6.D));
            default:
                return z32.w;
        }
    }

    public final fm m(up2 up2) {
        int i = this.w;
        Object obj = null;
        Object obj2 = this.x;
        switch (i) {
            case b85.b:
                return gw8.u(this, up2);
            case 1:
                up2.getClass();
                zd2 zd2 = (zd2) new ae2(new wl7(dt0.o0((List) obj2), new fy0(up2, 0)), false, new nf6(18)).iterator();
                if (zd2.hasNext()) {
                    obj = zd2.next();
                }
                return (fm) obj;
            default:
                up2.getClass();
                if (up2.equals((up2) obj2)) {
                    return y42.a;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.w) {
            case b85.b:
                return ((List) this.x).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ tm(int i, List list) {
        this.w = i;
        this.x = list;
    }

    public tm(up2 up2) {
        this.w = 2;
        up2.getClass();
        this.x = up2;
    }
}
