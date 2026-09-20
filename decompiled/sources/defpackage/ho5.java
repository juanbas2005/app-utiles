package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: ho5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ho5 implements Comparator {
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public ho5(ro8 ro8, no7 no7) {
        this.x = ro8;
        this.y = no7;
    }

    public final int compare(Object obj, Object obj2) {
        int i = this.w;
        Object obj3 = this.y;
        Object obj4 = this.x;
        switch (i) {
            case b85.b:
                io5 io5 = (io5) obj3;
                vu6 vu6 = (vu6) obj4;
                return Float.compare(io5.a((vu6) obj2, vu6), io5.a((vu6) obj, vu6));
            default:
                bq8 bq8 = (bq8) obj;
                bq8 bq82 = (bq8) obj2;
                if (bq8 instanceof qq8) {
                    if (!(bq82 instanceof qq8)) {
                        return 1;
                    }
                    return 0;
                } else if (bq82 instanceof qq8) {
                    return -1;
                } else {
                    ro8 ro8 = (ro8) obj4;
                    if (ro8 == null) {
                        return bq8.g().compareTo(bq82.g());
                    }
                    return (int) ya5.E(ro8.a((no7) obj3, Arrays.asList(new bq8[]{bq8, bq82})).p().doubleValue());
                }
        }
    }

    public ho5(io5 io5, vu6 vu6) {
        this.y = io5;
        this.x = vu6;
    }
}
