package defpackage;

import com.google.zxing.NotFoundException;

/* renamed from: fb0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fb0 {
    public final k90 a;
    public final r66 b;
    public final r66 c;
    public final r66 d;
    public final r66 e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public fb0(k90 k90, r66 r66, r66 r662, r66 r663, r66 r664) {
        boolean z;
        boolean z2 = false;
        if (r66 == null || r662 == null) {
            z = true;
        } else {
            z = false;
        }
        z2 = (r663 == null || r664 == null) ? true : z2;
        if (!z || !z2) {
            if (z) {
                r66 = new r66(0.0f, r663.b);
                r662 = new r66(0.0f, r664.b);
            } else if (z2) {
                int i2 = k90.w;
                r663 = new r66((float) (i2 - 1), r66.b);
                r664 = new r66((float) (i2 - 1), r662.b);
            }
            this.a = k90;
            this.b = r66;
            this.c = r662;
            this.d = r663;
            this.e = r664;
            this.f = (int) Math.min(r66.a, r662.a);
            this.g = (int) Math.max(r663.a, r664.a);
            this.h = (int) Math.min(r66.b, r663.b);
            this.i = (int) Math.max(r662.b, r664.b);
            return;
        }
        throw NotFoundException.y;
    }

    public fb0(fb0 fb0) {
        this.a = fb0.a;
        this.b = fb0.b;
        this.c = fb0.c;
        this.d = fb0.d;
        this.e = fb0.e;
        this.f = fb0.f;
        this.g = fb0.g;
        this.h = fb0.h;
        this.i = fb0.i;
    }
}
