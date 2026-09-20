package defpackage;

import java.util.Comparator;

/* renamed from: dr4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dr4 implements Comparator {
    public static final dr4 x = new dr4(0);
    public static final dr4 y = new dr4(1);
    public final /* synthetic */ int w;

    public /* synthetic */ dr4(int i) {
        this.w = i;
    }

    public final int compare(Object obj, Object obj2) {
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
                comparable4.getClass();
                return comparable4.compareTo(comparable3);
        }
    }

    public final Comparator reversed() {
        switch (this.w) {
            case b85.b:
                return y;
            default:
                return x;
        }
    }
}
