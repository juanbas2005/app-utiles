package defpackage;

/* renamed from: d52  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d52 extends wx3 implements vr2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ n52 y;
    public final /* synthetic */ x82 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d52(n52 n52, x82 x82, int i) {
        super(1);
        this.x = i;
        this.y = n52;
        this.z = x82;
    }

    public final Object y(Object obj) {
        je2 je2;
        je2 je22;
        je2 je23;
        je2 je24;
        int i = this.x;
        x82 x82 = this.z;
        a52 a52 = a52.y;
        n52 n52 = this.y;
        a52 a522 = a52.x;
        a52 a523 = a52.w;
        switch (i) {
            case b85.b:
                gm7 gm7 = (gm7) obj;
                if (gm7.c(a523, a522)) {
                    gb2 gb2 = n52.a.a;
                    if (gb2 == null || (je22 = gb2.b) == null) {
                        return i52.b;
                    }
                    return je22;
                } else if (!gm7.c(a522, a52)) {
                    return i52.b;
                } else {
                    gb2 gb22 = x82.a.a;
                    if (gb22 == null || (je2 = gb22.b) == null) {
                        return i52.b;
                    }
                    return je2;
                }
            default:
                gm7 gm72 = (gm7) obj;
                if (gm72.c(a523, a522)) {
                    xf6 xf6 = n52.a.d;
                    if (xf6 == null || (je24 = xf6.c) == null) {
                        return i52.b;
                    }
                    return je24;
                } else if (!gm72.c(a522, a52)) {
                    return i52.b;
                } else {
                    xf6 xf62 = x82.a.d;
                    if (xf62 == null || (je23 = xf62.c) == null) {
                        return i52.b;
                    }
                    return je23;
                }
        }
    }
}
