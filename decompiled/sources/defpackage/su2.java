package defpackage;

import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.e;

/* renamed from: su2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class su2 implements Cloneable {
    public final e w;
    public e x;

    public su2(e eVar) {
        this.w = eVar;
        if (!eVar.g()) {
            this.x = eVar.i();
        } else {
            h.q("Default instance must be immutable.");
            throw null;
        }
    }

    public final e a() {
        e b = b();
        b.getClass();
        if (e.f(b, true)) {
            return b;
        }
        throw new UninitializedMessageException();
    }

    public final e b() {
        boolean g = this.x.g();
        e eVar = this.x;
        if (!g) {
            return eVar;
        }
        eVar.getClass();
        bu5 bu5 = bu5.c;
        bu5.getClass();
        bu5.a(eVar.getClass()).b(eVar);
        eVar.h();
        return this.x;
    }

    public final void c() {
        if (!this.x.g()) {
            e i = this.w.i();
            e eVar = this.x;
            bu5 bu5 = bu5.c;
            bu5.getClass();
            bu5.a(i.getClass()).a(i, eVar);
            this.x = i;
        }
    }

    public final Object clone() {
        su2 su2 = (su2) this.w.c(5);
        su2.x = b();
        return su2;
    }
}
