package defpackage;

import java.io.Serializable;

/* renamed from: hu8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hu8 extends lu8 implements Serializable {
    public static final hu8 x = new hu8(0);
    public static final hu8 y = new hu8(1);
    public final /* synthetic */ int w;

    public /* synthetic */ hu8(int i) {
        this.w = i;
    }

    public final lu8 a() {
        switch (this.w) {
            case b85.b:
                return y;
            default:
                return x;
        }
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.w) {
            case b85.b:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.w) {
            case b85.b:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
