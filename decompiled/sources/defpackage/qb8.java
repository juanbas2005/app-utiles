package defpackage;

import android.graphics.Rect;

/* renamed from: qb8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qb8 {
    public final gb0 a;
    public final float b;

    public qb8(Rect rect, float f) {
        this.a = new gb0(rect);
        this.b = f;
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
        if (!qb8.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        qb8 qb8 = (qb8) obj;
        if (sg3.e(this.a, qb8.a) && this.b == qb8.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics(_bounds=" + this.a + ", density=" + this.b + ')';
    }

    public qb8(gb0 gb0, float f) {
        this.a = gb0;
        this.b = f;
    }
}
