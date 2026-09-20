package defpackage;

import java.io.File;
import java.util.ArrayList;

/* renamed from: ae5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ae5 implements Comparable {
    public static final String x;
    public final dg0 w;

    static {
        String str = File.separator;
        str.getClass();
        x = str;
    }

    public ae5(dg0 dg0) {
        dg0.getClass();
        this.w = dg0;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a = f.a(this);
        dg0 dg0 = this.w;
        if (a == -1) {
            a = 0;
        } else if (a < dg0.d() && dg0.i(a) == 92) {
            a++;
        }
        int d = dg0.d();
        int i = a;
        while (a < d) {
            if (dg0.i(a) == 47 || dg0.i(a) == 92) {
                arrayList.add(dg0.o(i, a));
                i = a + 1;
            }
            a++;
        }
        if (i < dg0.d()) {
            arrayList.add(dg0.o(i, dg0.d()));
        }
        return arrayList;
    }

    public final ae5 b() {
        dg0 dg0 = f.d;
        dg0 dg02 = this.w;
        if (sg3.e(dg02, dg0)) {
            return null;
        }
        dg0 dg03 = f.a;
        if (sg3.e(dg02, dg03)) {
            return null;
        }
        dg0 dg04 = f.b;
        if (sg3.e(dg02, dg04)) {
            return null;
        }
        dg0 dg05 = f.e;
        dg02.getClass();
        dg05.getClass();
        int d = dg02.d();
        byte[] bArr = dg05.w;
        if (dg02.m(d - bArr.length, dg05, bArr.length) && (dg02.d() == 2 || dg02.m(dg02.d() - 3, dg03, 1) || dg02.m(dg02.d() - 3, dg04, 1))) {
            return null;
        }
        int k = dg0.k(dg02, dg03);
        if (k == -1) {
            k = dg0.k(dg02, dg04);
        }
        if (k != 2 || e() == null) {
            if (k == 1) {
                dg04.getClass();
                if (dg02.m(0, dg04, dg04.d())) {
                    return null;
                }
            }
            if (k != -1 || e() == null) {
                if (k == -1) {
                    return new ae5(dg0);
                }
                if (k == 0) {
                    return new ae5(dg0.p(dg02, 0, 1, 1));
                }
                return new ae5(dg0.p(dg02, 0, k, 1));
            } else if (dg02.d() == 2) {
                return null;
            } else {
                return new ae5(dg0.p(dg02, 0, 2, 1));
            }
        } else if (dg02.d() == 3) {
            return null;
        } else {
            return new ae5(dg0.p(dg02, 0, 3, 1));
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [sc0, java.lang.Object] */
    public final ae5 c(ae5 ae5) {
        ae5 ae52;
        ae5 ae53;
        ae5.getClass();
        dg0 dg0 = ae5.w;
        int a = f.a(this);
        dg0 dg02 = this.w;
        if (a == -1) {
            ae52 = null;
        } else {
            ae52 = new ae5(dg02.o(0, a));
        }
        int a2 = f.a(ae5);
        if (a2 == -1) {
            ae53 = null;
        } else {
            ae53 = new ae5(dg0.o(0, a2));
        }
        if (sg3.e(ae52, ae53)) {
            ArrayList a3 = a();
            ArrayList a4 = ae5.a();
            int min = Math.min(a3.size(), a4.size());
            int i = 0;
            while (i < min && sg3.e(a3.get(i), a4.get(i))) {
                i++;
            }
            if (i == min && dg02.d() == dg0.d()) {
                return tz2.k(".");
            }
            if (a4.subList(i, a4.size()).indexOf(f.e) != -1) {
                ku4.y("Impossible relative path to resolve: ", this, " and ", ae5);
                return null;
            } else if (sg3.e(dg0, f.d)) {
                return this;
            } else {
                ? obj = new Object();
                dg0 c = f.c(ae5);
                if (c == null && (c = f.c(this)) == null) {
                    c = f.f(x);
                }
                int size = a4.size();
                for (int i2 = i; i2 < size; i2++) {
                    obj.X(f.e);
                    obj.X(c);
                }
                int size2 = a3.size();
                while (i < size2) {
                    obj.X((dg0) a3.get(i));
                    obj.X(c);
                    i++;
                }
                return f.d(obj, false);
            }
        } else {
            ku4.y("Paths of different roots cannot be relative to each other: ", this, " and ", ae5);
            return null;
        }
    }

    public final int compareTo(Object obj) {
        ae5 ae5 = (ae5) obj;
        ae5.getClass();
        return this.w.compareTo(ae5.w);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [sc0, java.lang.Object] */
    public final ae5 d(String str) {
        str.getClass();
        ? obj = new Object();
        obj.o0(str);
        return f.b(this, f.d(obj, false), false);
    }

    public final Character e() {
        dg0 dg0 = f.a;
        dg0 dg02 = this.w;
        if (dg0.g(dg02, dg0) != -1 || dg02.d() < 2 || dg02.i(1) != 58) {
            return null;
        }
        char i = (char) dg02.i(0);
        if (('a' > i || i >= '{') && ('A' > i || i >= '[')) {
            return null;
        }
        return Character.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ae5) || !sg3.e(((ae5) obj).w, this.w)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final File toFile() {
        return new File(this.w.r());
    }

    public final String toString() {
        return this.w.r();
    }
}
