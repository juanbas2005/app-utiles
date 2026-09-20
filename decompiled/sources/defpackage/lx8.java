package defpackage;

import java.util.List;

/* renamed from: lx8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class lx8 implements fs8, g61 {
    public static final /* synthetic */ lx8 x = new lx8(0);
    public static final /* synthetic */ lx8 y = new lx8(1);
    public static final /* synthetic */ lx8 z = new lx8(2);
    public final /* synthetic */ int w;

    public /* synthetic */ lx8(int i) {
        this.w = i;
    }

    public Object a() {
        switch (this.w) {
            case b85.b:
                List list = by8.a;
                qn8.x.get();
                return Integer.valueOf((int) ((Long) rn8.a.s(70, 1000, "measurement.upload.max_events_per_bundle").get()).longValue());
            case 1:
                List list2 = by8.a;
                wo8.x.get();
                return (Boolean) xo8.a.n(2, "measurement.rb.attribution.service.trigger_uris_high_priority", true).get();
            default:
                dp8 dp8 = (dp8) cp8.x.w.w;
                return new Boolean(((Boolean) dp8.a.get()).booleanValue());
        }
    }

    public Object c(yb9 yb9) {
        nl8 nl8;
        b39 b39 = (b39) yb9.i();
        t59 z2 = u59.z();
        String str = b39.w;
        z2.b();
        ((u59) z2.x).A(str);
        String str2 = b39.y;
        z2.b();
        ((u59) z2.x).C(str2);
        boolean z3 = b39.B;
        z2.b();
        ((u59) z2.x).F(z3);
        long j = b39.C;
        z2.b();
        ((u59) z2.x).G(j);
        byte[] bArr = b39.x;
        if (bArr != null) {
            uk8 p = vk8.p(bArr, 0, bArr.length);
            z2.b();
            ((u59) z2.x).B(p);
        }
        for (z29 z29 : b39.z) {
            for (j39 j39 : z29.x) {
                int i = j39.C;
                String str3 = j39.w;
                if (i == 1) {
                    w59 z4 = x59.z();
                    z4.g(str3);
                    if (i == 1) {
                        long j2 = j39.x;
                        z4.b();
                        ((x59) z4.x).C(j2);
                        nl8 = z4.d();
                    } else {
                        h.q("Not a long type");
                        return null;
                    }
                } else if (i == 2) {
                    w59 z5 = x59.z();
                    z5.g(str3);
                    if (i == 2) {
                        boolean z6 = j39.y;
                        z5.b();
                        ((x59) z5.x).D(z6);
                        nl8 = z5.d();
                    } else {
                        h.q("Not a boolean type");
                        return null;
                    }
                } else if (i == 3) {
                    w59 z7 = x59.z();
                    z7.g(str3);
                    if (i == 3) {
                        double d = j39.z;
                        z7.b();
                        ((x59) z7.x).E(d);
                        nl8 = z7.d();
                    } else {
                        h.q("Not a double type");
                        return null;
                    }
                } else if (i == 4) {
                    w59 z8 = x59.z();
                    z8.g(str3);
                    if (i == 4) {
                        String str4 = j39.A;
                        z65.k(str4);
                        z8.b();
                        ((x59) z8.x).F(str4);
                        nl8 = z8.d();
                    } else {
                        h.q("Not a String type");
                        return null;
                    }
                } else if (i == 5) {
                    w59 z9 = x59.z();
                    z9.g(str3);
                    if (i == 5) {
                        byte[] bArr2 = j39.B;
                        z65.k(bArr2);
                        uk8 p2 = vk8.p(bArr2, 0, bArr2.length);
                        z9.b();
                        ((x59) z9.x).G(p2);
                        nl8 = z9.d();
                    } else {
                        h.q("Not a bytes type");
                        return null;
                    }
                } else {
                    h.q(hl6.p(new StringBuilder(String.valueOf(i).length() + 24), "Unrecognized flag type: ", i));
                    return null;
                }
                z2.b();
                ((u59) z2.x).D((x59) nl8);
            }
            String[] strArr = z29.y;
            if (strArr != null) {
                for (String E : strArr) {
                    z2.b();
                    ((u59) z2.x).E(E);
                }
            }
        }
        return (u59) z2.d();
    }
}
