package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: w62  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w62 implements wo7 {
    public final x62 w;
    public final String[] x;
    public final String y;

    public w62(x62 x62, String... strArr) {
        x62.getClass();
        this.w = x62;
        this.x = strArr;
        String str = x62.w;
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        this.y = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{String.format(str, Arrays.copyOf(copyOf, copyOf.length))}, 1));
    }

    public final Collection e() {
        return a42.w;
    }

    public final fv3 g() {
        return (gl1) gl1.f.getValue();
    }

    public final List getParameters() {
        return a42.w;
    }

    public final String toString() {
        return this.y;
    }

    public final vq0 u() {
        z62.a.getClass();
        return z62.c;
    }

    public final boolean y() {
        return false;
    }
}
