package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: sv6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sv6 implements Iterator {
    public final /* synthetic */ AbstractMap A;
    public final /* synthetic */ int w;
    public int x;
    public boolean y;
    public Iterator z;

    public /* synthetic */ sv6(ym8 ym8) {
        this.w = 3;
        Objects.requireNonNull(ym8);
        this.A = ym8;
        this.x = -1;
    }

    public Iterator a() {
        int i = this.w;
        AbstractMap abstractMap = this.A;
        switch (i) {
            case b85.b:
                if (this.z == null) {
                    this.z = ((lv6) abstractMap).y.entrySet().iterator();
                }
                return this.z;
            case 1:
                if (this.z == null) {
                    this.z = ((mv6) abstractMap).y.entrySet().iterator();
                }
                return this.z;
            default:
                if (this.z == null) {
                    this.z = ((nv6) abstractMap).x.entrySet().iterator();
                }
                return this.z;
        }
    }

    public Iterator b() {
        if (this.z == null) {
            this.z = ((ym8) this.A).y.entrySet().iterator();
        }
        return this.z;
    }

    public final boolean hasNext() {
        int i = this.w;
        AbstractMap abstractMap = this.A;
        switch (i) {
            case b85.b:
                lv6 lv6 = (lv6) abstractMap;
                if (this.x + 1 < lv6.x.size()) {
                    return true;
                }
                if (lv6.y.isEmpty() || !a().hasNext()) {
                    return false;
                }
                return true;
            case 1:
                if (this.x + 1 < ((mv6) abstractMap).x.size() || a().hasNext()) {
                    return true;
                }
                return false;
            case 2:
                nv6 nv6 = (nv6) abstractMap;
                if (this.x + 1 < nv6.w.size()) {
                    return true;
                }
                if (nv6.x.isEmpty() || !a().hasNext()) {
                    return false;
                }
                return true;
            default:
                ym8 ym8 = (ym8) abstractMap;
                if (this.x + 1 < ym8.x) {
                    return true;
                }
                if (ym8.y.isEmpty() || !b().hasNext()) {
                    return false;
                }
                return true;
        }
    }

    public final Object next() {
        int i = this.w;
        AbstractMap abstractMap = this.A;
        switch (i) {
            case b85.b:
                this.y = true;
                int i2 = this.x + 1;
                this.x = i2;
                lv6 lv6 = (lv6) abstractMap;
                if (i2 < lv6.x.size()) {
                    return (Map.Entry) lv6.x.get(this.x);
                }
                return (Map.Entry) a().next();
            case 1:
                this.y = true;
                int i3 = this.x + 1;
                this.x = i3;
                mv6 mv6 = (mv6) abstractMap;
                if (i3 < mv6.x.size()) {
                    return (Map.Entry) mv6.x.get(this.x);
                }
                return (Map.Entry) a().next();
            case 2:
                this.y = true;
                int i4 = this.x + 1;
                this.x = i4;
                nv6 nv6 = (nv6) abstractMap;
                if (i4 < nv6.w.size()) {
                    return (Map.Entry) nv6.w.get(this.x);
                }
                return (Map.Entry) a().next();
            default:
                this.y = true;
                int i5 = this.x + 1;
                this.x = i5;
                ym8 ym8 = (ym8) abstractMap;
                if (i5 < ym8.x) {
                    return (zm8) ym8.w[i5];
                }
                return (Map.Entry) b().next();
        }
    }

    public final void remove() {
        int i = this.w;
        AbstractMap abstractMap = this.A;
        switch (i) {
            case b85.b:
                lv6 lv6 = (lv6) abstractMap;
                if (this.y) {
                    this.y = false;
                    int i2 = lv6.C;
                    lv6.b();
                    if (this.x < lv6.x.size()) {
                        int i3 = this.x;
                        this.x = i3 - 1;
                        lv6.h(i3);
                        return;
                    }
                    a().remove();
                    return;
                }
                h.s("remove() was called before next()");
                return;
            case 1:
                mv6 mv6 = (mv6) abstractMap;
                if (this.y) {
                    this.y = false;
                    int i4 = mv6.B;
                    mv6.b();
                    if (this.x < mv6.x.size()) {
                        int i5 = this.x;
                        this.x = i5 - 1;
                        mv6.g(i5);
                        return;
                    }
                    a().remove();
                    return;
                }
                h.s("remove() was called before next()");
                return;
            case 2:
                nv6 nv6 = (nv6) abstractMap;
                if (this.y) {
                    this.y = false;
                    int i6 = nv6.B;
                    nv6.b();
                    if (this.x < nv6.w.size()) {
                        int i7 = this.x;
                        this.x = i7 - 1;
                        nv6.i(i7);
                        return;
                    }
                    a().remove();
                    return;
                }
                h.s("remove() was called before next()");
                return;
            default:
                if (this.y) {
                    this.y = false;
                    ym8 ym8 = (ym8) abstractMap;
                    ym8.g();
                    int i8 = this.x;
                    if (i8 < ym8.x) {
                        this.x = i8 - 1;
                        ym8.e(i8);
                        return;
                    }
                    b().remove();
                    return;
                }
                h.s("remove() was called before next()");
                return;
        }
    }

    public /* synthetic */ sv6(AbstractMap abstractMap, int i) {
        this.w = i;
        this.A = abstractMap;
        this.x = -1;
    }
}
