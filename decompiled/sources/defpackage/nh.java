package defpackage;

/* renamed from: nh  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nh implements ok5 {
    public final int b;

    public nh(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!nh.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        if (this.b != ((nh) obj).b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return pb4.i(this.b, "AndroidPointerIcon(type=", ")");
    }
}
