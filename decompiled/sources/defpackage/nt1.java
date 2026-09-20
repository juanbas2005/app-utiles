package defpackage;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: nt1  reason: default package */
public final class nt1 implements vr2 {
    public final /* synthetic */ int w;
    public final pt1 x;

    public /* synthetic */ nt1(pt1 pt1, int i) {
        this.w = i;
        this.x = pt1;
    }

    public final Object y(Object obj) {
        rm tmVar;
        int i;
        us1 us1;
        int i2 = this.w;
        Collection<qs5> collection = a42.w;
        pt1 pt1 = this.x;
        switch (i2) {
            case b85.b:
                uq4 uq4 = (uq4) obj;
                uq4.getClass();
                LinkedHashMap linkedHashMap = pt1.a;
                fp3 fp3 = js5.V;
                fp3.getClass();
                qt1 qt1 = pt1.i;
                byte[] bArr = (byte[]) linkedHashMap.get(uq4);
                if (bArr != null) {
                    collection = cl6.V(cl6.R(new o3(fp3, new ByteArrayInputStream(bArr), qt1, 1)));
                }
                ArrayList arrayList = new ArrayList(collection.size());
                for (js5 js5 : collection) {
                    js5.getClass();
                    tt1 f = ((ei4) qt1.b.i).f(js5);
                    if (!qt1.r(f)) {
                        f = null;
                    }
                    if (f != null) {
                        arrayList.add(f);
                    }
                }
                qt1.j(uq4, arrayList);
                return rd3.j(arrayList);
            case 1:
                uq4 uq42 = (uq4) obj;
                uq42.getClass();
                LinkedHashMap linkedHashMap2 = pt1.b;
                fp3 fp32 = qs5.b0;
                fp32.getClass();
                qt1 qt12 = pt1.i;
                byte[] bArr2 = (byte[]) linkedHashMap2.get(uq42);
                if (bArr2 != null) {
                    collection = cl6.V(cl6.R(new o3(fp32, new ByteArrayInputStream(bArr2), qt12, 1)));
                }
                ArrayList arrayList2 = new ArrayList(collection.size());
                for (qs5 qs5 : collection) {
                    qs5.getClass();
                    arrayList2.add(((ei4) qt12.b.i).g(qs5, false));
                }
                qt12.k(uq42, arrayList2);
                return rd3.j(arrayList2);
            default:
                uq4 uq43 = (uq4) obj;
                uq43.getClass();
                z00 z00 = pt1.i.b;
                byte[] bArr3 = (byte[]) pt1.c.get(uq43);
                if (bArr3 == null) {
                    return null;
                }
                dt5 dt5 = (dt5) dt5.M.a(new ByteArrayInputStream(bArr3), ((ws1) z00.a).p);
                if (dt5 == null) {
                    return null;
                }
                ei4 ei4 = (ei4) z00.i;
                z00 z002 = ei4.a;
                vq4 vq4 = (vq4) z002.b;
                wv1 wv1 = (wv1) z002.d;
                List<qr5> list = dt5.G;
                list.getClass();
                ArrayList arrayList3 = new ArrayList(et0.e0(list, 10));
                for (qr5 qr5 : list) {
                    qc3 qc3 = ei4.b;
                    qr5.getClass();
                    arrayList3.add(qc3.v(qr5, vq4));
                }
                if (arrayList3.isEmpty()) {
                    tmVar = me6.x;
                } else {
                    tmVar = new tm(0, arrayList3);
                }
                rm rmVar = tmVar;
                pt5 pt5 = (pt5) wg2.d.e(dt5.z);
                if (pt5 == null) {
                    i = -1;
                } else {
                    i = xt5.b[pt5.ordinal()];
                }
                switch (i) {
                    case 1:
                        us1 = vs1.d;
                        us1.getClass();
                        break;
                    case 2:
                        us1 = vs1.a;
                        us1.getClass();
                        break;
                    case 3:
                        us1 = vs1.b;
                        us1.getClass();
                        break;
                    case 4:
                        us1 = vs1.c;
                        us1.getClass();
                        break;
                    case 5:
                        us1 = vs1.e;
                        us1.getClass();
                        break;
                    case 6:
                        us1 = vs1.f;
                        us1.getClass();
                        break;
                    default:
                        us1 = vs1.a;
                        us1.getClass();
                        break;
                }
                ut1 ut1 = new ut1(((ws1) z002.a).a, (vj1) z002.c, rmVar, t49.P(vq4, dt5.A), us1, dt5, (vq4) z002.b, wv1, (i48) z002.e, (it1) z002.g);
                List list2 = dt5.B;
                list2.getClass();
                bk7 bk7 = (bk7) z002.a(ut1, list2, (vq4) z002.b, (wv1) z002.d, (i48) z002.e, (n80) z002.f).h;
                ut1.i1(bk7.b(), bk7.d(p25.F(dt5, wv1), false), bk7.d(p25.k(dt5, wv1), false));
                return ut1;
        }
    }
}
