package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: vq1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class vq1 extends q16 {
    public final y16 A;
    public final y16 B;
    public final y16 x = p25.u((ri0) null, new sq1(this, 0));
    public final y16 y = p25.u((ri0) null, new sq1(this, 1));
    public final y16 z = p25.u((ri0) null, new sq1(this, 2));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vq1(fq3 fq3) {
        super(fq3);
        fq3.getClass();
        this.A = p25.u((ri0) null, new tq1(this, fq3, 0));
        this.B = p25.u((ri0) null, new tq1(this, fq3, 1));
    }

    public final boolean M() {
        return sg3.e(R().f(), ni3.a);
    }

    public final ArrayList P(boolean z2) {
        yb5 yb5;
        Collection collection;
        st1 st1;
        ri0 R = R();
        ArrayList arrayList = new ArrayList();
        if (z2) {
            qz3 h = g18.h(this);
            if (h != null) {
                arrayList.add(new ir1(this, arrayList.size(), qr3.w, new uq1(h, 0)));
            }
            if (R instanceof tt1) {
                tt1 tt1 = (tt1) R;
                yb5 = new yb5(tt1.a0, tt1.Z.K);
            } else if (R instanceof st1) {
                st1 st12 = (st1) R;
                yb5 = new yb5(st12.X, st12.W.K);
            } else {
                if (R instanceof ar5) {
                    cr5 f1 = ((ar5) R).f1();
                    if (f1 instanceof st1) {
                        st1 = (st1) f1;
                    } else {
                        st1 = null;
                    }
                    if (st1 != null) {
                        yb5 = new yb5(st1.X, st1.W.K);
                    }
                }
                yb5 = null;
            }
            if (yb5 == null) {
                collection = a42.w;
            } else {
                vq4 vq4 = (vq4) yb5.w;
                List list = (List) yb5.x;
                List h0 = R.h0();
                h0.getClass();
                ArrayList arrayList2 = new ArrayList(et0.e0(h0, 10));
                int i = 0;
                for (Object next : h0) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        qz3 qz3 = (qz3) next;
                        ArrayList arrayList3 = arrayList2;
                        ArrayList arrayList4 = arrayList3;
                        arrayList4.add(new h28(R, (h28) null, i, qz3.getAnnotations(), uq4.d(vq4.getString(((jt5) list.get(i)).A)), qz3.b(), false, false, false, (vw3) null, sy6.j));
                        arrayList2 = arrayList4;
                        i = i2;
                        vq4 = vq4;
                        list = list;
                    } else {
                        sg3.Z();
                        throw null;
                    }
                }
                collection = arrayList2;
            }
            int size = collection.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(new ir1(this, arrayList.size(), qr3.x, new m61(i3, 1, collection)));
            }
            qz3 b0 = R.b0();
            if (b0 != null) {
                arrayList.add(new ir1(this, arrayList.size(), qr3.y, new uq1(b0, 1)));
            }
        }
        int size2 = R.S().size();
        for (int i4 = 0; i4 < size2; i4++) {
            arrayList.add(new ir1(this, arrayList.size(), qr3.z, new m61(i4, 2, R)));
        }
        if (r16.Y(this) && (R instanceof ei3) && arrayList.size() > 1) {
            ht0.g0(arrayList, new a91(13));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public abstract ds1 Q();

    public abstract ri0 R();

    public final List a() {
        Object b = this.y.b();
        b.getClass();
        return (List) b;
    }

    public final ls3 f() {
        us1 f = R().f();
        f.getClass();
        up2 up2 = g18.a;
        if (f.equals(vs1.e)) {
            return ls3.w;
        }
        if (f.equals(vs1.c)) {
            return ls3.x;
        }
        if (f.equals(vs1.d)) {
            return ls3.y;
        }
        if (f.equals(vs1.a) || f.equals(vs1.b)) {
            return ls3.z;
        }
        return null;
    }

    public final List getAnnotations() {
        Object b = this.x.b();
        b.getClass();
        return (List) b;
    }

    public final List getParameters() {
        Object b = this.z.b();
        b.getClass();
        return (List) b;
    }

    public final List getTypeParameters() {
        Object b = this.B.b();
        b.getClass();
        return (List) b;
    }

    public final as3 k() {
        Object b = this.A.b();
        b.getClass();
        return (as3) b;
    }

    public final el4 o() {
        el4 el4 = this.w.b;
        if (el4 != null) {
            return el4;
        }
        fl4 o = R().o();
        o.getClass();
        int ordinal = o.ordinal();
        if (ordinal == 0) {
            return el4.x;
        }
        if (ordinal == 1) {
            return el4.A;
        }
        if (ordinal == 2) {
            return el4.y;
        }
        if (ordinal == 3) {
            return el4.z;
        }
        h.c();
        return null;
    }
}
