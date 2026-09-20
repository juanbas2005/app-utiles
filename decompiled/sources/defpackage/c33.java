package defpackage;

/* renamed from: c33  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c33 implements tu6 {
    public final tp2 w;
    public boolean x;
    public final /* synthetic */ h33 y;

    public c33(h33 h33) {
        this.y = h33;
        this.w = new tp2(((yw5) h33.c.z).w.g());
    }

    public final synchronized void close() {
        if (!this.x) {
            this.x = true;
            ((yw5) this.y.c.z).N("0\r\n\r\n");
            tp2 tp2 = this.w;
            ri7 ri7 = tp2.e;
            tp2.e = ri7.d;
            ri7.a();
            ri7.b();
            this.y.d = 3;
        }
    }

    public final synchronized void flush() {
        if (!this.x) {
            ((yw5) this.y.c.z).flush();
        }
    }

    public final ri7 g() {
        return this.w;
    }

    public final void g0(long j, sc0 sc0) {
        if (this.x) {
            h.s("closed");
        } else if (j != 0) {
            yw5 yw5 = (yw5) this.y.c.z;
            if (!yw5.y) {
                yw5.x.h0(j);
                yw5.a();
                yw5.N("\r\n");
                yw5.g0(j, sc0);
                yw5.N("\r\n");
                return;
            }
            h.s("closed");
        }
    }
}
