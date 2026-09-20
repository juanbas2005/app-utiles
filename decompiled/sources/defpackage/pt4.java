package defpackage;

import android.os.Bundle;

/* renamed from: pt4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pt4 implements Comparable {
    public final boolean A;
    public final qt4 w;
    public final Bundle x;
    public final boolean y;
    public final int z;

    public pt4(qt4 qt4, Bundle bundle, boolean z2, int i, boolean z3) {
        this.w = qt4;
        this.x = bundle;
        this.y = z2;
        this.z = i;
        this.A = z3;
    }

    /* renamed from: a */
    public final int compareTo(pt4 pt4) {
        pt4.getClass();
        boolean z2 = pt4.A;
        boolean z3 = pt4.y;
        Bundle bundle = pt4.x;
        boolean z4 = this.y;
        if (z4 && !z3) {
            return 1;
        }
        if (!z4 && z3) {
            return -1;
        }
        int i = this.z - pt4.z;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle2 = this.x;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            bundle.getClass();
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z5 = this.A;
        if (z5 && !z2) {
            return 1;
        }
        if (z5 || !z2) {
            return 0;
        }
        return -1;
    }
}
