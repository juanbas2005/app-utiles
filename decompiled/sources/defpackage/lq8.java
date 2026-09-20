package defpackage;

/* renamed from: lq8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class lq8 {
    public static final or2 d = new or2(17);
    public final lq8 a;
    public final zt6 b;
    public boolean c = false;

    public lq8(lq8 lq8, zt6 zt6) {
        if (lq8 == null || lq8.c) {
            this.a = lq8;
            this.b = zt6;
            return;
        }
        ku4.v();
        throw null;
    }

    public final boolean a() {
        if (this.b.containsKey(d)) {
            return true;
        }
        lq8 lq8 = this.a;
        if (lq8 == null || !lq8.a()) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (lq8 lq8 = this; lq8 != null; lq8 = lq8.a) {
            for (int i = 0; i < lq8.b.y; i++) {
                sb.append("[");
                sb.append(this.b.j(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
