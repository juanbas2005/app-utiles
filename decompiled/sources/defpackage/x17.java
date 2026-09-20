package defpackage;

/* renamed from: x17  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x17 implements je2 {
    public final float a;
    public final float b;
    public final Object c;

    public x17(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    public final m38 a(lo7 lo7) {
        ol olVar;
        Object obj = this.c;
        if (obj == null) {
            olVar = null;
        } else {
            olVar = (ol) lo7.a.y(obj);
        }
        return new br4(this.a, this.b, olVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x17) {
            x17 x17 = (x17) obj;
            if (x17.a == this.a && x17.b == this.b && sg3.e(x17.c, this.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Object obj = this.c;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return Float.hashCode(this.b) + f21.d(this.a, i * 31, 31);
    }

    public /* synthetic */ x17(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
