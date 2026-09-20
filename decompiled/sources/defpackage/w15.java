package defpackage;

/* renamed from: w15  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w15 implements zr3 {
    public final zr3 a;
    public final ml6 b;

    public w15(zr3 zr3) {
        zr3.getClass();
        this.a = zr3;
        this.b = new ml6(zr3.getDescriptor());
    }

    public final Object deserialize(ok1 ok1) {
        if (ok1.w()) {
            return ok1.g(this.a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w15.class != obj.getClass() || !sg3.e(this.a, ((w15) obj).a)) {
            return false;
        }
        return true;
    }

    public final ll6 getDescriptor() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void serialize(j42 j42, Object obj) {
        if (obj != null) {
            j42.g(this.a, obj);
        } else {
            j42.e();
        }
    }
}
