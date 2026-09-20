package defpackage;

import java.io.FileOutputStream;

/* renamed from: d95  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d95 implements tu6 {
    public final FileOutputStream w;
    public final ri7 x;

    public d95(FileOutputStream fileOutputStream, ri7 ri7) {
        this.w = fileOutputStream;
        this.x = ri7;
    }

    public final void close() {
        this.w.close();
    }

    public final void flush() {
        this.w.flush();
    }

    public final ri7 g() {
        return this.x;
    }

    public final void g0(long j, sc0 sc0) {
        t49.x(sc0.x, 0, j);
        while (j > 0) {
            this.x.f();
            qi6 qi6 = sc0.w;
            qi6.getClass();
            int min = (int) Math.min(j, (long) (qi6.c - qi6.b));
            this.w.write(qi6.a, qi6.b, min);
            int i = qi6.b + min;
            qi6.b = i;
            long j2 = (long) min;
            j -= j2;
            sc0.x -= j2;
            if (i == qi6.c) {
                sc0.w = qi6.a();
                ti6.a(qi6);
            }
        }
    }

    public final String toString() {
        return "sink(" + this.w + ')';
    }
}
