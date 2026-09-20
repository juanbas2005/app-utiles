package defpackage;

import java.util.ArrayList;

/* renamed from: xq0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xq0 {
    public static final xq0 b = new xq0(0);
    public static final xq0 c = new xq0(1);
    public static final xq0 d = new xq0(2);
    public final /* synthetic */ int a;

    public /* synthetic */ xq0(int i) {
        this.a = i;
    }

    public static String a(vq0 vq0) {
        String str;
        uq4 name = vq0.getName();
        name.getClass();
        String L = h49.L(name);
        if (!(vq0 instanceof qp7)) {
            vj1 r = vq0.r();
            r.getClass();
            if (r instanceof ql4) {
                str = a((vq0) r);
            } else if (r instanceof x95) {
                str = h49.K(((y95) ((x95) r)).A.a);
            } else {
                str = null;
            }
            if (str != null && !str.equals("")) {
                return str + '.' + L;
            }
        }
        return L;
    }

    public final String b(vq0 vq0, ms1 ms1) {
        boolean z;
        switch (this.a) {
            case b85.b:
                if (vq0 instanceof qp7) {
                    uq4 name = ((qp7) vq0).getName();
                    name.getClass();
                    return ms1.G(name, false);
                }
                vp2 f = rs1.f(vq0);
                f.getClass();
                return ms1.m(z65.N(vp2.f(f)));
            case 1:
                if (vq0 instanceof qp7) {
                    uq4 name2 = ((qp7) vq0).getName();
                    name2.getClass();
                    return ms1.G(name2, false);
                }
                ArrayList arrayList = new ArrayList();
                vj1 vj1 = vq0;
                do {
                    arrayList.add(vj1.getName());
                    vj1 r = vj1.r();
                    z = r instanceof ql4;
                    vj1 = r;
                } while (z);
                return z65.N(new o76(arrayList));
            default:
                return a(vq0);
        }
    }
}
