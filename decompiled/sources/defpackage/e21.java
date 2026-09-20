package defpackage;

/* renamed from: e21  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class e21 {
    public final Object a;

    public e21(Object obj) {
        this.a = obj;
    }

    public abstract vw3 a(sl4 sl4);

    public Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        e21 e21;
        if (this == obj) {
            return true;
        }
        Object b = b();
        Object obj2 = null;
        if (obj instanceof e21) {
            e21 = (e21) obj;
        } else {
            e21 = null;
        }
        if (e21 != null) {
            obj2 = e21.b();
        }
        if (sg3.e(b, obj2)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object b = b();
        if (b != null) {
            return b.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
