package defpackage;

import java.io.IOException;
import java.util.List;

/* renamed from: us0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class us0 {
    public int w;
    public Object x;

    public us0(td9 td9, int i) {
        if (td9 == null) {
            h.q("format options cannot be null");
            throw null;
        } else if (i >= 0) {
            this.w = i;
            this.x = td9;
        } else {
            h.q(hl6.p(new StringBuilder(String.valueOf(i).length() + 15), "invalid index: ", i));
            throw null;
        }
    }

    public abstract int A();

    public abstract long B();

    public abstract boolean C(int i);

    public void D() {
        int z;
        do {
            z = z();
            if (z != 0) {
                int i = this.w;
                if (i < 100) {
                    this.w = i + 1;
                    this.w--;
                } else {
                    throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
            } else {
                return;
            }
        } while (C(z));
    }

    public abstract void E(j32 j32, Object obj);

    public abstract void a(int i);

    public abstract int b();

    public abstract boolean c();

    public abstract db8 f(db8 db8, List list);

    public abstract k68 g(ha8 ha8, k68 k68);

    public abstract void h(int i);

    public abstract int j(int i);

    public abstract boolean k();

    public abstract zf0 l();

    public abstract double m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract float q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract String x();

    public abstract String y();

    public abstract int z();

    public void d(ha8 ha8) {
    }

    public void e(ha8 ha8) {
    }

    public us0(int i) {
        this.w = i;
    }
}
