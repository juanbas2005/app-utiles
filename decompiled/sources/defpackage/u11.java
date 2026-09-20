package defpackage;

/* renamed from: u11  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u11 implements ua6, oq4 {
    public final t11 A = new t11(this);
    public final ua6 w;
    public final oq4 x;
    public e81 y;
    public Throwable z;

    public u11(ua6 ua6) {
        qq4 qq4 = new qq4();
        ua6.getClass();
        this.w = ua6;
        this.x = qq4;
    }

    public final boolean Z() {
        return this.w.Z();
    }

    public final Object a(f61 f61) {
        return this.x.a(f61);
    }

    public final void close() {
        t11 t11 = this.A;
        if (t11 != null) {
            t11.p(-1);
        }
        this.w.close();
    }

    public final void k(Object obj) {
        this.x.k((Object) null);
    }

    public final ab6 k0(String str) {
        str.getClass();
        t11 t11 = this.A;
        if (t11 == null) {
            return this.w.k0(str);
        }
        Object h = t11.h(str);
        h.getClass();
        return new s11((ab6) h);
    }

    public final void l(StringBuilder sb) {
        int i;
        t11 t11 = this.A;
        if (this.y == null && this.z == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append(10);
        } else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append(10);
            e81 e81 = this.y;
            if (e81 != null) {
                sb.append("\t\tCoroutine: " + e81);
                sb.append(10);
            }
            Throwable th = this.z;
            if (th != null) {
                sb.append("\t\tAcquired:");
                sb.append(10);
                for (String str : dt0.s0(1, d57.N0(su0.O(th)))) {
                    sb.append("\t\t" + str);
                    sb.append(10);
                }
            }
        }
        if (t11 != null) {
            StringBuilder sb2 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            synchronized (((jv2) t11.g)) {
                i = t11.c;
            }
            sb2.append(i);
            sb.append(sb2.toString());
            sb.append(10);
        }
    }

    public final String toString() {
        return this.w.toString();
    }
}
