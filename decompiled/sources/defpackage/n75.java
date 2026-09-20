package defpackage;

/* renamed from: n75  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n75 {
    public final Object a;

    public n75(Object obj) {
        if (obj != null) {
            this.a = obj;
        } else {
            ku4.j("value for optional is empty.");
            throw null;
        }
    }

    public final Object a() {
        Object obj = this.a;
        if (obj != null) {
            return obj;
        }
        kj6.i("No value present");
        return null;
    }

    public final boolean b() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public n75() {
        this.a = null;
    }
}
