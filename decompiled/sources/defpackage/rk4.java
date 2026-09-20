package defpackage;

import java.util.Arrays;

/* renamed from: rk4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rk4 extends n80 {
    public static final rk4 g;
    public static final rk4 h;
    public final boolean f;

    static {
        rk4 rk4;
        rk4 rk42 = new rk4(new int[]{2, 4, 0}, false);
        g = rk42;
        int i = rk42.c;
        int i2 = rk42.b;
        if (i2 == 1 && i == 9) {
            rk4 = new rk4(new int[]{2, 0, 0}, false);
        } else {
            rk4 = new rk4(new int[]{i2, i + 1, 0}, false);
        }
        h = rk4;
        new rk4(new int[0], false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rk4(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        iArr.getClass();
        this.f = z;
    }
}
