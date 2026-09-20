package com.google.protobuf;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e implements og6 {
    public final a a;
    public final g b;
    public final aa2 c;

    public e(g gVar, aa2 aa2, a aVar) {
        this.b = gVar;
        aa2.getClass();
        this.c = aa2;
        this.a = aVar;
    }

    public final void a(Object obj, Object obj2) {
        f.j(this.b, obj, obj2);
    }

    public final void b(Object obj) {
        ((ys7) this.b).getClass();
        h hVar = ((b) obj).unknownFields;
        if (hVar.e) {
            hVar.e = false;
        }
        this.c.getClass();
        f21.u(obj);
        throw null;
    }

    public final boolean c(Object obj) {
        this.c.getClass();
        f21.u(obj);
        throw null;
    }

    public final b d() {
        a aVar = this.a;
        if (aVar instanceof b) {
            return (b) ((b) aVar).k(4);
        }
        qu2 qu2 = (qu2) ((b) aVar).k(5);
        boolean n = qu2.x.n();
        b bVar = qu2.x;
        if (!n) {
            return bVar;
        }
        bVar.getClass();
        au5 au5 = au5.c;
        au5.getClass();
        au5.a(bVar.getClass()).b(bVar);
        bVar.o();
        return qu2.x;
    }

    public final int e(b bVar) {
        ((ys7) this.b).getClass();
        return bVar.unknownFields.hashCode();
    }

    public final int f(b bVar) {
        ((ys7) this.b).getClass();
        h hVar = bVar.unknownFields;
        int i = hVar.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < hVar.a; i3++) {
            int d = vs0.d(hVar.b[i3] >>> 3) + vs0.c(2) + (vs0.c(1) * 2);
            int c2 = vs0.c(3);
            int size = ((yf0) hVar.c[i3]).size();
            i2 += vs0.d(size) + size + c2 + d;
        }
        hVar.d = i2;
        return i2;
    }

    public final boolean g(b bVar, b bVar2) {
        ys7 ys7 = (ys7) this.b;
        ys7.getClass();
        h hVar = bVar.unknownFields;
        ys7.getClass();
        if (!hVar.equals(bVar2.unknownFields)) {
            return false;
        }
        return true;
    }

    public final void h(Object obj, wv2 wv2) {
        this.c.getClass();
        f21.u(obj);
        throw null;
    }
}
