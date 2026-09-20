package defpackage;

/* renamed from: fc9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class fc9 {
    public static final dc9 d = new Object();
    public final fc9 a;
    public final zt6 b;
    public boolean c = false;

    public /* synthetic */ fc9(fc9 fc9, zt6 zt6) {
        if (fc9 != null) {
            g75.h(fc9.c);
        }
        this.a = fc9;
        this.b = zt6;
    }

    public static fc9 a(fc9 fc9, fc9 fc92) {
        boolean z;
        fc9.getClass();
        fc9 fc93 = ec9.e;
        if (fc9 == fc93) {
            return fc92;
        }
        fc92.getClass();
        if (fc92 == fc93) {
            return fc9;
        }
        s93<fc9> s = s93.s(2, fc9, fc92);
        if (s.isEmpty()) {
            return fc93;
        }
        if (s.size() == 1) {
            return (fc9) s.iterator().next();
        }
        int i = 0;
        for (fc9 fc94 : s) {
            do {
                i += fc94.b.y;
                fc94 = fc94.a;
            } while (fc94 != null);
        }
        if (i == 0) {
            return ec9.e;
        }
        zt6 zt6 = new zt6(i);
        for (fc9 fc95 : s) {
            do {
                int i2 = 0;
                while (true) {
                    zt6 zt62 = fc95.b;
                    if (i2 >= zt62.y) {
                        break;
                    }
                    if (zt6.put((dc9) zt62.g(i2), zt62.j(i2)) == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    g75.i(z, "Duplicate bindings: %s", zt62.g(i2));
                    i2++;
                }
                fc95 = fc95.a;
            } while (fc95 != null);
        }
        return new fc9((fc9) null, zt6).b();
    }

    public final fc9 b() {
        if (!this.c) {
            this.c = true;
            fc9 fc9 = this.a;
            if (fc9 == null || !this.b.isEmpty()) {
                return this;
            }
            return fc9;
        }
        h.s("Already frozen");
        return null;
    }

    public final boolean c() {
        if (this.b.containsKey(d)) {
            return true;
        }
        fc9 fc9 = this.a;
        if (fc9 == null || !fc9.c()) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (fc9 fc9 = this; fc9 != null; fc9 = fc9.a) {
            for (int i = 0; i < fc9.b.y; i++) {
                sb.append("[");
                sb.append(this.b.j(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
