package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: a18  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class a18 {
    public static final p64 a;

    static {
        yb5[] yb5Arr = (yb5[]) Arrays.copyOf(new yb5[]{new yb5(Float.valueOf(0.0f), new jt0(uq3.d(4279391610L))), new yb5(Float.valueOf(1.0f), new jt0(uq3.d(4279658664L)))}, 2);
        long floatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        long floatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        ArrayList arrayList = new ArrayList(r0);
        for (yb5 yb5 : yb5Arr) {
            arrayList.add(new jt0(((jt0) yb5.x).a));
        }
        ArrayList arrayList2 = new ArrayList(r0);
        for (yb5 yb52 : yb5Arr) {
            arrayList2.add(Float.valueOf(((Number) yb52.w).floatValue()));
        }
        a = new p64(arrayList, arrayList2, floatToRawIntBits, floatToRawIntBits2);
    }
}
