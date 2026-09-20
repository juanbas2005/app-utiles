package defpackage;

import java.util.Arrays;

/* renamed from: c3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class c3 {
    public d3[] w;
    public int x;
    public int y;
    public x67 z;

    public final d3 d() {
        d3 d3Var;
        x67 x67;
        synchronized (this) {
            try {
                d3[] d3VarArr = this.w;
                if (d3VarArr == null) {
                    d3VarArr = f();
                    this.w = d3VarArr;
                } else if (this.x >= d3VarArr.length) {
                    Object[] copyOf = Arrays.copyOf(d3VarArr, d3VarArr.length * 2);
                    this.w = (d3[]) copyOf;
                    d3VarArr = (d3[]) copyOf;
                }
                int i = this.y;
                do {
                    d3Var = d3VarArr[i];
                    if (d3Var == null) {
                        d3Var = e();
                        d3VarArr[i] = d3Var;
                    }
                    i++;
                    if (i >= d3VarArr.length) {
                        i = 0;
                    }
                } while (!d3Var.a(this));
                this.y = i;
                this.x++;
                x67 = this.z;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (x67 != null) {
            x67.x(1);
        }
        return d3Var;
    }

    public abstract d3 e();

    public abstract d3[] f();

    public final void g(d3 d3Var) {
        x67 x67;
        int i;
        f61[] b;
        synchronized (this) {
            try {
                int i2 = this.x - 1;
                this.x = i2;
                x67 = this.z;
                if (i2 == 0) {
                    this.y = 0;
                }
                d3Var.getClass();
                b = d3Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (f61 f61 : b) {
            if (f61 != null) {
                f61.f(vs7.a);
            }
        }
        if (x67 != null) {
            x67.x(-1);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [pr6, x67] */
    public final x67 h() {
        x67 x67;
        synchronized (this) {
            x67 x672 = this.z;
            x67 = x672;
            if (x672 == null) {
                int i = this.x;
                ? pr6 = new pr6(1, Integer.MAX_VALUE, vc0.x);
                pr6.r(Integer.valueOf(i));
                this.z = pr6;
                x67 = pr6;
            }
        }
        return x67;
    }
}
