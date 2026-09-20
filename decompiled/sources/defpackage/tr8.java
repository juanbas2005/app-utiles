package defpackage;

import java.util.UUID;

/* renamed from: tr8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tr8 implements fh7 {
    public static final z53 y = new z53(17);
    public final uy5 w;
    public final ts2 x;

    public tr8(ts2 ts2, boolean z) {
        cq8 cq8;
        this.x = ts2;
        uy5 uy5 = new uy5(15);
        if (z) {
            vq8 vq8 = (vq8) sp8.e.get();
            cq8 = vq8.b;
            if (cq8 != null) {
                int i = eq8.a;
            } else {
                int i2 = cq8.x;
                wp8 wp8 = wp8.c;
                UUID uuid = wp8.a;
                String concat = "tk-trace-id: ".concat(String.valueOf(Long.toString(new UUID((wp8.a() & -61441) ^ uuid.getMostSignificantBits(), (wp8.a() >>> 2) ^ uuid.getLeastSignificantBits()).getLeastSignificantBits() >>> 1, 36)));
                os8 os8 = (os8) sp8.b.get();
                if (!os8.isEmpty()) {
                    os8.forEach(new zp8(0));
                }
                cq8 = new cq8(concat, vq8);
            }
        } else {
            cq8 = null;
        }
        uy5.x = cq8;
        this.w = uy5;
    }

    public final Object G(gs2 gs2, Object obj) {
        return gs2.H(obj, this);
    }

    public final e81 L(d81 d81) {
        return rc9.A0(this, d81);
    }

    public final e81 X(e81 e81) {
        return rc9.D0(this, e81);
    }

    public final c81 a0(d81 d81) {
        return rc9.J(this, d81);
    }

    public final void b0(e81 e81, Object obj) {
        nr8 nr8 = (nr8) obj;
        e81.getClass();
        nr8.getClass();
        vq8 vq8 = (vq8) sp8.e.get();
        sp8.a(vq8, nr8.a, 3);
        vq8.d = nr8.b;
        vq8.c = nr8.c;
    }

    public final d81 getKey() {
        return y;
    }

    public final Object h0(e81 e81) {
        cq8 cq8;
        e81.getClass();
        vq8 vq8 = (vq8) sp8.e.get();
        uy5 uy5 = vq8.d;
        cq8 cq82 = vq8.b;
        cq8 cq83 = vq8.c;
        uy5 uy52 = this.w;
        if (cq83 == null) {
            if (cq82 != null) {
                cq8 = cq82;
            } else {
                cq8 = (cq8) uy52.x;
            }
            vq8.c = cq8;
        }
        vq8.d = uy52;
        sp8.a(vq8, (cq8) uy52.x, 1);
        return new nr8(cq82, uy5, cq83);
    }
}
