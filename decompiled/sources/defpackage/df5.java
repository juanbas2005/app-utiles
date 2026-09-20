package defpackage;

/* renamed from: df5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class df5 implements oy6 {
    public boolean A;
    public long B;
    public final ed0 w;
    public final sc0 x;
    public qi6 y;
    public int z;

    public df5(ed0 ed0) {
        int i;
        this.w = ed0;
        sc0 c = ed0.c();
        this.x = c;
        qi6 qi6 = c.w;
        this.y = qi6;
        if (qi6 != null) {
            i = qi6.b;
        } else {
            i = -1;
        }
        this.z = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r3 == r5.b) goto L_0x0027;
     */
    public final long Y(long j, sc0 sc0) {
        qi6 qi6;
        sc0.getClass();
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            h.j(f21.f(j, "byteCount < 0: "));
            return 0;
        } else if (!this.A) {
            qi6 qi62 = this.y;
            sc0 sc02 = this.x;
            if (qi62 != null) {
                qi6 qi63 = sc02.w;
                if (qi62 == qi63) {
                    int i2 = this.z;
                    qi63.getClass();
                }
                h.s("Peek source is invalid because upstream source was used");
                return 0;
            }
            if (i == 0) {
                return 0;
            }
            if (!this.w.j(this.B + 1)) {
                return -1;
            }
            if (this.y == null && (qi6 = sc02.w) != null) {
                this.y = qi6;
                this.z = qi6.b;
            }
            long min = Math.min(j, sc02.x - this.B);
            this.x.o(sc0, this.B, min);
            this.B += min;
            return min;
        } else {
            h.s("closed");
            return 0;
        }
    }

    public final void close() {
        this.A = true;
    }

    public final ri7 g() {
        return this.w.g();
    }
}
