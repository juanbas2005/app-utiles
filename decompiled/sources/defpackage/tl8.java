package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: tl8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tl8 implements k55, c55, x45 {
    public int A;
    public int B;
    public Exception C;
    public boolean D;
    public final Object w = new Object();
    public final int x;
    public final yb9 y;
    public int z;

    public tl8(int i, yb9 yb9) {
        this.x = i;
        this.y = yb9;
    }

    public final void a() {
        int i = this.z;
        int i2 = this.A;
        int i3 = i + i2 + this.B;
        int i4 = this.x;
        if (i3 == i4) {
            Exception exc = this.C;
            yb9 yb9 = this.y;
            if (exc != null) {
                int length = String.valueOf(i2).length();
                StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + length + 8 + 24);
                sb.append(i2);
                sb.append(" out of ");
                sb.append(i4);
                sb.append(" underlying tasks failed");
                yb9.o(new ExecutionException(sb.toString(), this.C));
            } else if (this.D) {
                yb9.p();
            } else {
                yb9.m((Object) null);
            }
        }
    }

    public final void f() {
        synchronized (this.w) {
            this.B++;
            this.D = true;
            a();
        }
    }

    public final void g(Object obj) {
        synchronized (this.w) {
            this.z++;
            a();
        }
    }

    public final void j(Exception exc) {
        synchronized (this.w) {
            this.A++;
            this.C = exc;
            a();
        }
    }
}
