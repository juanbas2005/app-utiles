package defpackage;

import android.graphics.Rect;
import java.util.Comparator;

/* renamed from: tk2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tk2 implements Comparator {
    public final Rect w = new Rect();
    public final Rect x = new Rect();
    public final boolean y;
    public final me6 z;

    public tk2(boolean z2, me6 me6) {
        this.y = z2;
        this.z = me6;
    }

    public final int compare(Object obj, Object obj2) {
        this.z.getClass();
        Rect rect = this.w;
        ((c5) obj).f(rect);
        Rect rect2 = this.x;
        ((c5) obj2).f(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z2 = this.y;
        if (i3 < i4) {
            if (z2) {
                return 1;
            }
            return -1;
        } else if (i3 <= i4) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            int i7 = rect.right;
            int i8 = rect2.right;
            if (i7 < i8) {
                if (z2) {
                    return 1;
                }
                return -1;
            } else if (i7 <= i8) {
                return 0;
            } else {
                if (z2) {
                    return -1;
                }
                return 1;
            }
        } else if (z2) {
            return -1;
        } else {
            return 1;
        }
    }
}
