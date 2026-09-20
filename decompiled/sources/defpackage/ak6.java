package defpackage;

import java.util.Iterator;

/* renamed from: ak6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ak6 implements ok6, Iterable, ar3 {
    public final tp4 w = new tp4();
    public pf4 x;
    public boolean y;
    public boolean z;

    public ak6() {
        long[] jArr = bg6.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak6)) {
            return false;
        }
        ak6 ak6 = (ak6) obj;
        if (sg3.e(this.w, ak6.w) && this.y == ak6.y && this.z == ak6.z) {
            return true;
        }
        return false;
    }

    public final void f(nk6 nk6, Object obj) {
        boolean z2 = obj instanceof h4;
        tp4 tp4 = this.w;
        if (!z2 || !tp4.c(nk6)) {
            tp4.m(nk6, obj);
        } else {
            Object g = tp4.g(nk6);
            g.getClass();
            h4 h4Var = (h4) g;
            h4 h4Var2 = (h4) obj;
            String str = h4Var2.a;
            if (str == null) {
                str = h4Var.a;
            }
            ds2 ds2 = h4Var2.b;
            if (ds2 == null) {
                ds2 = h4Var.b;
            }
            tp4.m(nk6, new h4(str, ds2));
        }
        nk6.getClass();
    }

    public final ak6 g() {
        ak6 ak6 = new ak6();
        ak6.y = this.y;
        ak6.z = this.z;
        tp4 tp4 = ak6.w;
        tp4.getClass();
        tp4 tp42 = this.w;
        tp42.getClass();
        Object[] objArr = tp42.b;
        Object[] objArr2 = tp42.c;
        long[] jArr = tp42.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            tp4.m(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return ak6;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.z) + hl6.i(this.w.hashCode() * 31, 31, this.y);
    }

    public final Iterator iterator() {
        pf4 pf4 = this.x;
        if (pf4 == null) {
            tp4 tp4 = this.w;
            tp4.getClass();
            pf4 pf42 = new pf4(tp4);
            this.x = pf42;
            pf4 = pf42;
        }
        return ((p52) pf4.entrySet()).iterator();
    }

    public final Object k(nk6 nk6) {
        Object g = this.w.g(nk6);
        if (g != null) {
            return g;
        }
        rf2.h(nk6, " - consider getOrElse or getOrNull", "Key not present: ");
        return null;
    }

    public final void l(ak6 ak6) {
        tp4 tp4 = ak6.w;
        Object[] objArr = tp4.b;
        Object[] objArr2 = tp4.c;
        long[] jArr = tp4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            nk6 nk6 = (nk6) obj;
                            tp4 tp42 = this.w;
                            Object g = tp42.g(nk6);
                            nk6.getClass();
                            Object H = nk6.b.H(g, obj2);
                            if (H != null) {
                                tp42.m(nk6, H);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.y) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.z) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        tp4 tp4 = this.w;
        Object[] objArr = tp4.b;
        Object[] objArr2 = tp4.c;
        long[] jArr = tp4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((nk6) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return hj8.F(this) + "{ " + sb + " }";
    }
}
