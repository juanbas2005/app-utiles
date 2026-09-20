package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: at2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class at2 extends au6 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public at2(vj1 vj1, at2 at2, int i, boolean z) {
        super(vj1, at2, me6.x, m75.g, i, sy6.j);
        this.I = true;
        this.Q = z;
        this.R = false;
    }

    public final boolean M() {
        return false;
    }

    public final zs2 h1(int i, rm rmVar, vj1 vj1, xs2 xs2, uq4 uq4, sy6 sy6) {
        vj1.getClass();
        if (i != 0) {
            rmVar.getClass();
            return new at2(vj1, (at2) xs2, i, this.Q);
        }
        throw null;
    }

    public final zs2 i1(ys2 ys2) {
        uq4 uq4;
        at2 at2 = (at2) super.i1(ys2);
        if (at2 == null) {
            return null;
        }
        List<h28> S = at2.S();
        S.getClass();
        if (S.isEmpty()) {
            return at2;
        }
        for (h28 b : S) {
            vw3 b2 = b.b();
            b2.getClass();
            if (ag8.p(b2) != null) {
                List<h28> S2 = at2.S();
                S2.getClass();
                ArrayList arrayList = new ArrayList(et0.e0(S2, 10));
                for (h28 b3 : S2) {
                    vw3 b4 = b3.b();
                    b4.getClass();
                    arrayList.add(ag8.p(b4));
                }
                int size = at2.S().size() - arrayList.size();
                boolean z = true;
                if (size == 0) {
                    List S3 = at2.S();
                    S3.getClass();
                    ArrayList i1 = dt0.i1(arrayList, S3);
                    if (i1.isEmpty()) {
                        return at2;
                    }
                    Iterator it = i1.iterator();
                    while (it.hasNext()) {
                        yb5 yb5 = (yb5) it.next();
                        if (!sg3.e((uq4) yb5.w, ((h28) yb5.x).getName())) {
                        }
                    }
                    return at2;
                }
                List<h28> S4 = at2.S();
                S4.getClass();
                ArrayList arrayList2 = new ArrayList(et0.e0(S4, 10));
                for (h28 h28 : S4) {
                    uq4 name = h28.getName();
                    name.getClass();
                    int i = h28.B;
                    int i2 = i - size;
                    if (i2 >= 0 && (uq4 = (uq4) arrayList.get(i2)) != null) {
                        name = uq4;
                    }
                    arrayList2.add(h28.f1(at2, name, i));
                }
                ys2 l1 = at2.l1(dq7.b);
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((uq4) it2.next()) == null) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    l1.R = Boolean.valueOf(z);
                    l1.C = arrayList2;
                    l1.A = at2.e1();
                    zs2 i12 = super.i1(l1);
                    i12.getClass();
                    return i12;
                }
                z = false;
                l1.R = Boolean.valueOf(z);
                l1.C = arrayList2;
                l1.A = at2.e1();
                zs2 i122 = super.i1(l1);
                i122.getClass();
                return i122;
            }
        }
        return at2;
    }

    public final boolean j() {
        return false;
    }

    public final boolean m() {
        return false;
    }
}
