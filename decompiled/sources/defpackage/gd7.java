package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: gd7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gd7 implements hs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Drawable x;

    public /* synthetic */ gd7(Drawable drawable, int i) {
        this.w = i;
        this.x = drawable;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        Drawable drawable = this.x;
        boolean z = false;
        switch (i) {
            case b85.b:
                long j = ((jt0) obj).a;
                yt2 yt2 = (yt2) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 17) != 16) {
                    z = true;
                }
                if (yt2.V(intValue & 1, z)) {
                    xb4.b0.a(drawable, yt2, 48);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                long j2 = ((jt0) obj).a;
                yt2 yt22 = (yt2) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 17) != 16) {
                    z = true;
                }
                if (yt22.V(intValue2 & 1, z)) {
                    xb4.b0.a(drawable, yt22, 48);
                } else {
                    yt22.Y();
                }
                return vs7;
        }
    }
}
