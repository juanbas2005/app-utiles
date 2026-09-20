package defpackage;

import java.io.IOException;

/* renamed from: b33  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class b33 implements oy6 {
    public final g73 w;
    public final tp2 x;
    public boolean y;
    public final /* synthetic */ h33 z;

    public b33(h33 h33, g73 g73) {
        g73.getClass();
        this.z = h33;
        this.w = g73;
        this.x = new tp2(((zw5) h33.c.y).w.g());
    }

    public long Y(long j, sc0 sc0) {
        h33 h33 = this.z;
        sc0.getClass();
        try {
            return ((zw5) h33.c.y).Y(j, sc0);
        } catch (IOException e) {
            h33.b.e();
            a(h33.f);
            throw e;
        }
    }

    public final void a(bz2 bz2) {
        d45 d45;
        s61 s61;
        bz2.getClass();
        h33 h33 = this.z;
        int i = h33.d;
        if (i != 6) {
            if (i == 5) {
                tp2 tp2 = this.x;
                ri7 ri7 = tp2.e;
                tp2.e = ri7.d;
                ri7.a();
                ri7.b();
                h33.d = 6;
                if (bz2.size() > 0 && (d45 = h33.a) != null && (s61 = d45.j) != null) {
                    a53.b(s61, this.w, bz2);
                    return;
                }
                return;
            }
            int i2 = h33.d;
            throw new IllegalStateException("state: " + i2);
        }
    }

    public final ri7 g() {
        return this.x;
    }
}
