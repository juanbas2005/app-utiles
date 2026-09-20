package defpackage;

/* renamed from: xp7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class xp7 implements qo7 {
    public abstract k28 a();

    public abstract vw3 b();

    public abstract boolean c();

    public abstract xp7 d(ax3 ax3);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp7)) {
            return false;
        }
        xp7 xp7 = (xp7) obj;
        if (c() == xp7.c() && a() == xp7.a() && b().equals(xp7.b())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = a().hashCode();
        if (iq7.l(b())) {
            return (hashCode * 31) + 19;
        }
        int i2 = hashCode * 31;
        if (c()) {
            i = 17;
        } else {
            i = b().hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        if (c()) {
            return "*";
        }
        if (a() == k28.y) {
            return b().toString();
        }
        return a() + " " + b();
    }
}
