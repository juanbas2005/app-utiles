package defpackage;

/* renamed from: av5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class av5 {
    public final Class a;
    public final Class b;

    public av5(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static av5 a(Class cls) {
        return new av5(zu5.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || av5.class != obj.getClass()) {
            return false;
        }
        av5 av5 = (av5) obj;
        if (!this.b.equals(av5.b)) {
            return false;
        }
        return this.a.equals(av5.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class<zu5> cls = zu5.class;
        Class cls2 = this.b;
        Class<zu5> cls3 = this.a;
        if (cls3 == cls) {
            return cls2.getName();
        }
        return "@" + cls3.getName() + " " + cls2.getName();
    }
}
