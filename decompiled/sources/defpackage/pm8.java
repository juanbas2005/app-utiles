package defpackage;

/* renamed from: pm8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pm8 implements wm8 {
    public final pk8 a;
    public final xb4 b;

    public pm8(xb4 xb4, pk8 pk8) {
        or2 or2 = hl8.a;
        this.b = xb4;
        this.a = pk8;
    }

    public final nl8 a() {
        pk8 pk8 = this.a;
        if (pk8 instanceof nl8) {
            return ((nl8) pk8).i();
        }
        ll8 ll8 = (ll8) ((nl8) pk8).s(5);
        boolean g = ll8.x.g();
        nl8 nl8 = ll8.x;
        if (!g) {
            return nl8;
        }
        nl8.getClass();
        tm8.c.a(nl8.getClass()).f(nl8);
        nl8.h();
        return ll8.x;
    }

    public final void b(Object obj, Object obj2) {
        xm8.b(obj, obj2);
    }

    public final void c(Object obj, tt2 tt2, gl8 gl8) {
        this.b.getClass();
        xb4.i(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    public final int d(pk8 pk8) {
        en8 en8 = ((nl8) pk8).zzc;
        int i = en8.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < en8.a; i3++) {
            int a2 = fl8.a(8);
            int a3 = fl8.a(en8.b[i3] >>> 3) + fl8.a(16);
            int a4 = fl8.a(24);
            int f = ((vk8) en8.c[i3]).f();
            i2 += a2 + a2 + a3 + hl6.f(f, f, a4);
        }
        en8.d = i2;
        return i2;
    }

    public final boolean e(Object obj) {
        throw b81.j(obj);
    }

    public final void f(Object obj) {
        this.b.getClass();
        en8 en8 = ((nl8) obj).zzc;
        if (en8.e) {
            en8.e = false;
        }
        or2 or2 = hl8.a;
        throw b81.j(obj);
    }

    public final int g(nl8 nl8) {
        return nl8.zzc.hashCode();
    }

    public final void h(Object obj, br4 br4) {
        throw b81.j(obj);
    }

    public final void i(Object obj, byte[] bArr, int i, int i2, mj2 mj2) {
        nl8 nl8 = (nl8) obj;
        if (nl8.zzc == en8.f) {
            nl8.zzc = en8.a();
        }
        throw b81.j(obj);
    }

    public final boolean j(nl8 nl8, nl8 nl82) {
        if (!nl8.zzc.equals(nl82.zzc)) {
            return false;
        }
        return true;
    }
}
