package defpackage;

/* renamed from: pk  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pk {
    public final gq3 a;
    public final Object b;

    public pk(eg6 eg6) {
        gq3 b2 = b26.a.b(eg6.getClass());
        Object key = eg6.getKey();
        this.a = b2;
        this.b = key;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk)) {
            return false;
        }
        pk pkVar = (pk) obj;
        if (sg3.e(this.a, pkVar.a) && sg3.e(this.b, pkVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimatedSceneKey(clazz=" + this.a + ", key=" + this.b + ')';
    }
}
