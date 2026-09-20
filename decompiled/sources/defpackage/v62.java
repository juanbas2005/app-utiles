package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: v62  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v62 extends fu6 {
    public final List A;
    public final boolean B;
    public final String[] C;
    public final String D;
    public final wo7 x;
    public final t62 y;
    public final x62 z;

    public v62(wo7 wo7, t62 t62, x62 x62, List list, boolean z2, String... strArr) {
        x62.getClass();
        list.getClass();
        this.x = wo7;
        this.y = t62;
        this.z = x62;
        this.A = list;
        this.B = z2;
        this.C = strArr;
        String str = x62.w;
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        this.D = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public final List G() {
        return this.A;
    }

    public final ro7 J() {
        ro7.x.getClass();
        return ro7.y;
    }

    public final wo7 L() {
        return this.x;
    }

    public final boolean Q() {
        return this.B;
    }

    public final ji4 R() {
        return this.y;
    }

    public final vw3 Y(ax3 ax3) {
        ax3.getClass();
        return this;
    }

    public final du7 p0(ax3 ax3) {
        ax3.getClass();
        return this;
    }

    public final du7 v0(ro7 ro7) {
        ro7.getClass();
        return this;
    }

    public final fu6 w0(boolean z2) {
        String[] strArr = this.C;
        return new v62(this.x, this.y, this.z, this.A, z2, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final fu6 x0(ro7 ro7) {
        ro7.getClass();
        return this;
    }
}
