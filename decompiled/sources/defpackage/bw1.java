package defpackage;

import android.os.Build;
import android.view.DisplayCutout;

/* renamed from: bw1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bw1 {
    public final DisplayCutout a;

    public bw1(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final ad3 a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return ad3.c(x4.e(this.a));
        }
        return ad3.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bw1.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((bw1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
