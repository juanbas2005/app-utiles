package defpackage;

/* renamed from: f33  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f33 implements tu6 {
    public final tp2 w;
    public boolean x;
    public final /* synthetic */ h33 y;

    public f33(h33 h33) {
        this.y = h33;
        this.w = new tp2(((yw5) h33.c.z).w.g());
    }

    public final void close() {
        if (!this.x) {
            this.x = true;
            tp2 tp2 = this.w;
            ri7 ri7 = tp2.e;
            tp2.e = ri7.d;
            ri7.a();
            ri7.b();
            this.y.d = 3;
        }
    }

    public final void flush() {
        if (!this.x) {
            ((yw5) this.y.c.z).flush();
        }
    }

    public final ri7 g() {
        return this.w;
    }

    public final void g0(long j, sc0 sc0) {
        if (!this.x) {
            long j2 = j;
            dg8.a(sc0.x, 0, j2);
            ((yw5) this.y.c.z).g0(j2, sc0);
            return;
        }
        h.s("closed");
    }
}
