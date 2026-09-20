package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: b38  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b38 extends h38 implements Iterable, ar3 {
    public final float A;
    public final float B;
    public final float C;
    public final float D;
    public final List E;
    public final List F;
    public final String w;
    public final float x;
    public final float y;
    public final float z;

    public b38(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.w = str;
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.A = f4;
        this.B = f5;
        this.C = f6;
        this.D = f7;
        this.E = list;
        this.F = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof b38)) {
            b38 b38 = (b38) obj;
            if (sg3.e(this.w, b38.w) && this.x == b38.x && this.y == b38.y && this.z == b38.z && this.A == b38.A && this.B == b38.B && this.C == b38.C && this.D == b38.D && sg3.e(this.E, b38.E) && sg3.e(this.F, b38.F)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.F.hashCode() + hl6.j(this.E, f21.d(this.D, f21.d(this.C, f21.d(this.B, f21.d(this.A, f21.d(this.z, f21.d(this.y, f21.d(this.x, this.w.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final Iterator iterator() {
        return new bg5(this);
    }
}
