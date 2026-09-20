package defpackage;

import android.graphics.Rect;

/* renamed from: gb0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gb0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        new gb0(0, 0, 0, 0);
    }

    public gb0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i > i3) {
            h.j(b81.l(i, i3, "Left must be less than or equal to right, left: ", ", right: "));
            throw null;
        } else if (i2 > i4) {
            h.j(b81.l(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: "));
            throw null;
        }
    }

    public final int a() {
        return this.d - this.b;
    }

    public final int b() {
        return this.c - this.a;
    }

    public final Rect c() {
        return new Rect(this.a, this.b, this.c, this.d);
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
        if (!gb0.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        gb0 gb0 = (gb0) obj;
        if (this.a == gb0.a && this.b == gb0.b && this.c == gb0.c && this.d == gb0.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(gb0.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.a);
        sb.append(',');
        sb.append(this.b);
        sb.append(',');
        sb.append(this.c);
        sb.append(',');
        return hl6.n(sb, this.d, "] }");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public gb0(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
