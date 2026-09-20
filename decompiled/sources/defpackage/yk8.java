package defpackage;

import com.google.android.gms.internal.measurement.zzaeh;
import java.io.InputStream;

/* renamed from: yk8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class yk8 {
    public int a;
    public int b;
    public tt2 c;

    public static yk8 h(InputStream inputStream, int i) {
        if (i <= 0) {
            h.q("bufferSize must be > 0");
            return null;
        } else if (inputStream != null) {
            return new xk8(inputStream, i);
        } else {
            wk8 wk8 = new wk8(xl8.a);
            try {
                wk8.a(0);
                return wk8;
            } catch (zzaeh e) {
                throw new IllegalArgumentException(e);
            }
        }
    }

    public static int j(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long k(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public abstract int A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract int E();

    public abstract long F();

    public abstract int G();

    public abstract long H();

    public abstract int a(int i);

    public abstract void b(int i);

    public abstract int c();

    public abstract boolean d();

    public abstract int e();

    public abstract int f(byte[] bArr, int i, int i2);

    public abstract void g(int i);

    public final void i() {
        int l;
        do {
            l = l();
            if (l != 0) {
                int i = this.a;
                int i2 = this.b;
                if (i + i2 < 100) {
                    this.b = i2 + 1;
                    this.b--;
                } else {
                    zz8.b("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    return;
                }
            } else {
                return;
            }
        } while (n(l));
    }

    public abstract int l();

    public abstract void m(int i);

    public abstract boolean n(int i);

    public abstract double o();

    public abstract float p();

    public abstract long q();

    public abstract long r();

    public abstract int s();

    public abstract long t();

    public abstract int u();

    public abstract boolean v();

    public abstract String w();

    public abstract String x();

    public abstract uk8 y();

    public abstract byte[] z();
}
