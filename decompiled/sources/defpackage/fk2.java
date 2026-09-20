package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: fk2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class fk2 {
    public static final int[] a = new int[2];
    public static final Rect b = new Rect();

    public static final ly5 a(View view, je jeVar) {
        int[] iArr = a;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        jeVar.getLocationInWindow(iArr);
        int i3 = iArr[0];
        float f = (float) (i2 - iArr[1]);
        Rect rect = b;
        view.getFocusedRect(rect);
        float f2 = ((float) (i - i3)) + ((float) rect.left);
        return new ly5(f2, ((float) rect.top) + f, ((float) rect.width()) + f2, f + ((float) rect.top) + ((float) rect.height()));
    }

    public static final Integer b(int i) {
        if (i == 5) {
            return 33;
        }
        if (i == 6) {
            return 130;
        }
        if (i == 3) {
            return 17;
        }
        if (i == 4) {
            return 66;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 1;
        }
        return null;
    }

    public static final bk2 c(int i) {
        if (i == 1) {
            return new bk2(2);
        }
        if (i == 2) {
            return new bk2(1);
        }
        if (i == 17) {
            return new bk2(3);
        }
        if (i == 33) {
            return new bk2(5);
        }
        if (i == 66) {
            return new bk2(4);
        }
        if (i != 130) {
            return null;
        }
        return new bk2(6);
    }
}
