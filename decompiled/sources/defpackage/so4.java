package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: so4  reason: default package */
public final class so4 implements vr2 {
    public final /* synthetic */ int w = 0;
    public final up2 x;
    public final gq3 y;

    public so4(up2 up2, gq3 gq3) {
        this.x = up2;
        this.y = gq3;
    }

    public final Object y(Object obj) {
        ks3 ks3;
        gq3 gq3;
        switch (this.w) {
            case b85.b:
                gq3 gq32 = this.y;
                up2 up2 = this.x;
                ro4 ro4 = (ro4) obj;
                ro4.getClass();
                List<cs3> typeParameters = gq32.getTypeParameters();
                ArrayList arrayList = new ArrayList(et0.e0(typeParameters, 10));
                for (cs3 b : typeParameters) {
                    String b2 = b.b();
                    if (sg3.e(up2, m27.J) || sg3.e(up2, m27.I)) {
                        ks3 = ks3.y;
                    } else {
                        ks3 = ks3.w;
                    }
                    ds3 ds3 = new ds3(ro4, b2, ks3);
                    ds3.B = sg3.D(k27.b);
                    arrayList.add(ds3);
                }
                return arrayList;
            default:
                up2 up22 = this.x;
                gq3 gq33 = this.y;
                ro4 ro42 = (ro4) obj;
                ro42.getClass();
                if (sg3.e(up22, m27.K)) {
                    Class<Iterable> cls = Iterable.class;
                    as3 c = b26.c(cls, gs3.c);
                    c26 c26 = b26.a;
                    gq3 = ((c2) c26.d(c)).g();
                    if (gq3 == null) {
                        throw new Error(hl6.m(c26, cls, new StringBuilder("No mutable collection class found: ")));
                    }
                } else {
                    Class<Collection> cls2 = Collection.class;
                    if (sg3.e(up22, m27.L)) {
                        as3 c2 = b26.c(cls2, gs3.c);
                        c26 c262 = b26.a;
                        gq3 = ((c2) c262.d(c2)).g();
                        if (gq3 == null) {
                            throw new Error(hl6.m(c262, cls2, new StringBuilder("No mutable collection class found: ")));
                        }
                    } else if (sg3.e(up22, m27.N)) {
                        as3 c3 = b26.c(cls2, gs3.c);
                        c26 c263 = b26.a;
                        gq3 = ((c2) c263.d(c3)).g();
                        if (gq3 == null) {
                            throw new Error(hl6.m(c263, cls2, new StringBuilder("No mutable collection class found: ")));
                        }
                    } else if (sg3.e(up22, m27.M)) {
                        Class<Iterator> cls3 = Iterator.class;
                        as3 c4 = b26.c(cls3, gs3.c);
                        c26 c264 = b26.a;
                        gq3 = ((c2) c264.d(c4)).g();
                        if (gq3 == null) {
                            throw new Error(hl6.m(c264, cls3, new StringBuilder("No mutable collection class found: ")));
                        }
                    } else {
                        gq3 = null;
                    }
                }
                List<cs3> list = ro42.y;
                ArrayList arrayList2 = new ArrayList(et0.e0(list, 10));
                for (cs3 c0 : list) {
                    gs3 gs3 = gs3.c;
                    arrayList2.add(x91.C(bb0.c0(c0, (List) null, false, 7)));
                }
                ArrayList V0 = qs.V0(new gq3[]{gq33, gq3});
                ArrayList arrayList3 = new ArrayList(et0.e0(V0, 10));
                Iterator it = V0.iterator();
                while (it.hasNext()) {
                    arrayList3.add(bb0.c0((gq3) it.next(), arrayList2, false, 6));
                }
                return arrayList3;
        }
    }

    public so4(gq3 gq3, up2 up2) {
        this.y = gq3;
        this.x = up2;
    }
}
