package defpackage;

import java.util.Arrays;

/* renamed from: st  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class st {
    public final Object a;
    public final pe2 b;
    public final jx5 c;

    public st(Object obj, pe2 pe2, jx5 jx5) {
        this.a = obj;
        this.b = pe2;
        this.c = jx5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b5 A[RETURN] */
    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (obj instanceof st) {
                st stVar = (st) obj;
                Object obj2 = stVar.a;
                this.b.getClass();
                Object obj3 = this.a;
                if (obj3 != obj2) {
                    if (!(obj3 instanceof s83) || !(obj2 instanceof s83)) {
                        z = sg3.e(obj3, obj2);
                        if (!z || !this.c.equals(stVar.c)) {
                            return false;
                        }
                    } else {
                        s83 s83 = (s83) obj3;
                        s83 s832 = (s83) obj2;
                        if (!(sg3.e(s83.a, s832.a) && s83.b.equals(s832.b) && s83.d == s832.d && sg3.e(s83.g, s832.g) && sg3.e(s83.i, s832.i) && s83.k == s832.k && s83.l == s832.l && s83.m == s832.m && s83.n == s832.n && s83.o == s832.o && s83.p == s832.p && s83.q == s832.q && s83.w.equals(s832.w) && s83.x == s832.x && s83.e == s832.e && s83.y.equals(s832.y))) {
                            z = false;
                            if (!z || !this.c.equals(stVar.c)) {
                            }
                        }
                    }
                }
                z = true;
                if (!z || !this.c.equals(stVar.c)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        this.b.getClass();
        Object obj = this.a;
        if (obj instanceof s83) {
            s83 s83 = (s83) obj;
            int hashCode = s83.b.hashCode();
            int hashCode2 = s83.d.hashCode();
            int i2 = hl6.i(hl6.i(hl6.i(hl6.i((hl6.j(s83.g, (hashCode2 + ((hashCode + (s83.a.hashCode() * 31)) * 923521)) * 961, 31) + Arrays.hashCode(s83.i.w)) * 31, 31, s83.k), 31, s83.l), 31, s83.m), 31, s83.n);
            int hashCode3 = s83.p.hashCode();
            int hashCode4 = s83.q.hashCode();
            int hashCode5 = s83.w.hashCode();
            int hashCode6 = s83.x.hashCode();
            int hashCode7 = s83.e.hashCode();
            i = s83.y.w.hashCode() + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((s83.o.hashCode() + i2) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        } else if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return this.c.hashCode() + (i * 31);
    }
}
