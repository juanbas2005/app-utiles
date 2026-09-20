package defpackage;

import java.util.List;

/* renamed from: wv4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wv4 {
    public final yv4 a;
    public final List b;
    public final List c;
    public final int d;
    public n74 e;

    public wv4(yv4 yv4, List list, List list2, int i) {
        this.a = yv4;
        this.b = list;
        this.c = list2;
        this.d = i;
    }

    public final List a() {
        if (this.e == null) {
            n74 m = sg3.m();
            m.addAll(this.b);
            yv4 yv4 = this.a;
            if (yv4 != null) {
                m.add(yv4);
            }
            m.addAll(this.c);
            this.e = sg3.i(m);
        }
        n74 n74 = this.e;
        n74.getClass();
        return n74;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wv4.class != obj.getClass()) {
            return false;
        }
        wv4 wv4 = (wv4) obj;
        if (this.d == wv4.d && a().equals(wv4.a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode() + (this.d * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.d + ", mergedHistory=" + a() + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public wv4() {
        this((yv4) null, r1, r1, -1);
        a42 a42 = a42.w;
    }
}
