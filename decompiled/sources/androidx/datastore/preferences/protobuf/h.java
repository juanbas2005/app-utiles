package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h implements pg6 {
    public final a a;
    public final j b;
    public final ba2 c;

    public h(j jVar, ba2 ba2, a aVar) {
        this.b = jVar;
        ba2.getClass();
        this.c = ba2;
        this.a = aVar;
    }

    public final void a(Object obj, Object obj2) {
        i.k(this.b, obj, obj2);
    }

    public final void b(Object obj) {
        ((l) this.b).getClass();
        k kVar = ((e) obj).unknownFields;
        if (kVar.e) {
            kVar.e = false;
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

    public final e d() {
        a aVar = this.a;
        if (aVar instanceof e) {
            return ((e) aVar).i();
        }
        return ((su2) ((e) aVar).c(5)).b();
    }

    public final void e(Object obj, d dVar, z92 z92) {
        this.b.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    public final int f(e eVar) {
        ((l) this.b).getClass();
        k kVar = eVar.unknownFields;
        int i = kVar.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < kVar.a; i3++) {
            i2 += ws0.f(3, (zf0) kVar.c[i3]) + ws0.i(kVar.b[i3] >>> 3) + ws0.h(2) + (ws0.h(1) * 2);
        }
        kVar.d = i2;
        return i2;
    }

    public final void g(Object obj, ji8 ji8) {
        this.c.getClass();
        f21.u(obj);
        throw null;
    }

    public final int h(e eVar) {
        ((l) this.b).getClass();
        return eVar.unknownFields.hashCode();
    }

    public final boolean i(e eVar, e eVar2) {
        l lVar = (l) this.b;
        lVar.getClass();
        k kVar = eVar.unknownFields;
        lVar.getClass();
        if (!kVar.equals(eVar2.unknownFields)) {
            return false;
        }
        return true;
    }
}
