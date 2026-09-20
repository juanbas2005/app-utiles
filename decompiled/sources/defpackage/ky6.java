package defpackage;

import android.graphics.Shader;

/* renamed from: ky6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ky6 extends kc0 implements dg3 {
    public final long a;

    public ky6(long j) {
        this.a = j;
    }

    public final void a(float f, long j, kb9 kb9) {
        kb9.i(1.0f);
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        long j2 = this.a;
        if (i != 0) {
            j2 = jt0.b(jt0.d(j2) * f, j2);
        }
        kb9.k(j2);
        if (((Shader) kb9.z) != null) {
            kb9.n((Shader) null);
        }
    }

    public final Object b(Object obj, float f) {
        if (obj == null) {
            obj = new ky6(jt0.f);
        }
        if (!(obj instanceof ky6)) {
            return null;
        }
        return new ky6(uq3.F(this.a, ((ky6) obj).a, f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky6)) {
            return false;
        }
        if (!jt0.c(this.a, ((ky6) obj).a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = jt0.h;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return f21.h("SolidColor(value=", jt0.i(this.a), ")");
    }
}
