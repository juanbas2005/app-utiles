package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: eu4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class eu4 extends qt4 implements Iterable, ar3 {
    public static final /* synthetic */ int C = 0;
    public final r14 B = new r14(this);

    public eu4(hu4 hu4) {
        super(hu4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof eu4) || !super.equals(obj)) {
            return false;
        }
        r14 r14 = this.B;
        int f = ((cz6) r14.y).f();
        r14 r142 = ((eu4) obj).B;
        if (f != ((cz6) r142.y).f() || r14.w != r142.w) {
            return false;
        }
        cz6 cz6 = (cz6) r14.y;
        cz6.getClass();
        Iterator it = ((g21) cl6.O(new e2(3, cz6))).iterator();
        while (it.hasNext()) {
            qt4 qt4 = (qt4) it.next();
            if (!qt4.equals(((cz6) r142.y).c(qt4.x.a))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        r14 r14 = this.B;
        int i = r14.w;
        cz6 cz6 = (cz6) r14.y;
        int f = cz6.f();
        for (int i2 = 0; i2 < f; i2++) {
            i = (((i * 31) + cz6.d(i2)) * 31) + ((qt4) cz6.g(i2)).hashCode();
        }
        return i;
    }

    public final Iterator iterator() {
        r14 r14 = this.B;
        r14.getClass();
        return new gu4(r14);
    }

    public final pt4 k(cf4 cf4) {
        pt4 k = super.k(cf4);
        r14 r14 = this.B;
        r14.getClass();
        return r14.e(k, cf4, false, (eu4) r14.x);
    }

    public final pt4 l(cf4 cf4, qt4 qt4) {
        return this.B.e(super.k(cf4), cf4, true, qt4);
    }

    public final pt4 n(String str, boolean z, qt4 qt4) {
        pt4 pt4;
        r14 r14 = this.B;
        r14.getClass();
        eu4 eu4 = (eu4) r14.x;
        pt4 e = eu4.x.e(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = eu4.iterator();
        while (true) {
            gu4 gu4 = (gu4) it;
            pt4 = null;
            if (!gu4.hasNext()) {
                break;
            }
            qt4 qt42 = (qt4) gu4.next();
            if (!sg3.e(qt42, qt4)) {
                if (qt42 instanceof eu4) {
                    pt4 = ((eu4) qt42).n(str, false, eu4);
                } else {
                    qt42.getClass();
                    pt4 = qt42.x.e(str);
                }
            }
            if (pt4 != null) {
                arrayList.add(pt4);
            }
        }
        pt4 pt42 = (pt4) dt0.I0(arrayList);
        eu4 eu42 = eu4.y;
        if (eu42 != null && z && !eu42.equals(qt4)) {
            pt4 = eu42.n(str, true, eu4);
        }
        return (pt4) dt0.I0(qs.V0(new pt4[]{e, pt42, pt4}));
    }

    public final String toString() {
        qt4 qt4;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        r14 r14 = this.B;
        String str = (String) r14.A;
        r14.getClass();
        if (str == null || d57.I0(str)) {
            qt4 = null;
        } else {
            qt4 = r14.b(str, true);
        }
        if (qt4 == null) {
            qt4 = r14.a(r14.w);
        }
        sb.append(" startDestination=");
        if (qt4 == null) {
            String str2 = (String) r14.A;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = (String) r14.z;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(r14.w));
                }
            }
        } else {
            sb.append("{");
            sb.append(qt4.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
