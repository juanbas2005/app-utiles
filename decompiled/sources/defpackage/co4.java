package defpackage;

/* renamed from: co4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class co4 {
    public final tp4 a;

    public /* synthetic */ co4(tp4 tp4) {
        this.a = tp4;
    }

    public static final void a(tp4 tp4, Object obj, Object obj2) {
        boolean z;
        Object obj3;
        int f = tp4.f(obj);
        if (f < 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            obj3 = null;
        } else {
            obj3 = tp4.c[f];
        }
        if (obj3 != null) {
            if (obj3 instanceof lp4) {
                lp4 lp4 = (lp4) obj3;
                lp4.a(obj2);
                obj2 = lp4;
            } else {
                Object[] objArr = w25.a;
                lp4 lp42 = new lp4(2);
                lp42.a(obj3);
                lp42.a(obj2);
                obj2 = lp42;
            }
        }
        if (z) {
            int i = ~f;
            tp4.b[i] = obj;
            tp4.c[i] = obj2;
            return;
        }
        tp4.c[f] = obj2;
    }

    public static final Object b(tp4 tp4, fn4 fn4) {
        Object g = tp4.g(fn4);
        if (g == null) {
            return null;
        }
        if (g instanceof lp4) {
            lp4 lp4 = (lp4) g;
            if (!lp4.h()) {
                int i = lp4.b - 1;
                Object f = lp4.f(i);
                lp4.k(i);
                f.getClass();
                if (lp4.h()) {
                    tp4.k(fn4);
                }
                if (lp4.b == 1) {
                    tp4.m(fn4, lp4.e());
                }
                return f;
            }
            kj6.i("List is empty.");
            return null;
        }
        tp4.k(fn4);
        return g;
    }

    public static final void c(tp4 tp4, fn4 fn4, vr2 vr2) {
        Object g = tp4.g(fn4);
        if (g == null) {
            return;
        }
        if (g instanceof lp4) {
            lp4 lp4 = (lp4) g;
            int i = lp4.b;
            Object[] objArr = lp4.a;
            int i2 = 0;
            re3 V = z65.V(0, i);
            int i3 = V.w;
            int i4 = V.x;
            if (i3 <= i4) {
                while (true) {
                    objArr[i3 - i2] = objArr[i3];
                    if (((Boolean) vr2.y(objArr[i3])).booleanValue()) {
                        i2++;
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3++;
                }
            }
            qs.S0(i - i2, i, (Object) null, objArr);
            lp4.b -= i2;
            if (lp4.h()) {
                tp4.k(fn4);
            }
            if (lp4.b == 1) {
                tp4.m(fn4, lp4.e());
            }
        } else if (((Boolean) vr2.y(g)).booleanValue()) {
            tp4.k(fn4);
        }
    }

    public static final lp4 d(tp4 tp4) {
        if (tp4.i()) {
            lp4 lp4 = w25.b;
            lp4.getClass();
            return lp4;
        }
        lp4 lp42 = new lp4();
        Object[] objArr = tp4.c;
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
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof lp4) {
                                lp42.b((lp4) obj);
                            } else {
                                obj.getClass();
                                lp42.a(obj);
                            }
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
        return lp42;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof co4)) {
            return false;
        }
        if (!this.a.equals(((co4) obj).a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ")";
    }
}
