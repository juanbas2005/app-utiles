package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: fw1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fw1 implements av6 {
    public final Context w;

    public fw1(Context context) {
        this.w = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fw1)) {
            return false;
        }
        if (sg3.e(this.w, ((fw1) obj).w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final Object z(ix5 ix5) {
        DisplayMetrics displayMetrics = this.w.getResources().getDisplayMetrics();
        bv1 bv1 = new bv1(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new uu6(bv1, bv1);
    }
}
