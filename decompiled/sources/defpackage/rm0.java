package defpackage;

import android.graphics.Rect;
import android.util.Log;

/* renamed from: rm0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rm0 extends io5 {
    public final /* synthetic */ int a;

    public /* synthetic */ rm0(int i) {
        this.a = i;
    }

    public final float a(vu6 vu6, vu6 vu62) {
        switch (this.a) {
            case b85.b:
                if (vu6.w <= 0 || vu6.x <= 0) {
                    return 0.0f;
                }
                vu6 a2 = vu6.a(vu62);
                float f = ((float) a2.w) * 1.0f;
                float f2 = f / ((float) vu6.w);
                if (f2 > 1.0f) {
                    f2 = (float) Math.pow((double) (1.0f / f2), 1.1d);
                }
                float f3 = ((((float) a2.x) * 1.0f) / ((float) vu62.x)) + (f / ((float) vu62.w));
                return ((1.0f / f3) / f3) * f2;
            case 1:
                if (vu6.w <= 0 || vu6.x <= 0) {
                    return 0.0f;
                }
                vu6 b = vu6.b(vu62);
                float f4 = (float) b.w;
                float f5 = (f4 * 1.0f) / ((float) vu6.w);
                if (f5 > 1.0f) {
                    f5 = (float) Math.pow((double) (1.0f / f5), 1.1d);
                }
                float f6 = ((((float) vu62.x) * 1.0f) / ((float) b.x)) * ((((float) vu62.w) * 1.0f) / f4);
                return (((1.0f / f6) / f6) / f6) * f5;
            default:
                int i = vu6.w;
                int i2 = vu6.x;
                if (i <= 0 || i2 <= 0) {
                    return 0.0f;
                }
                int i3 = vu62.w;
                int i4 = vu62.x;
                float f7 = (((float) i) * 1.0f) / ((float) i3);
                if (f7 < 1.0f) {
                    f7 = 1.0f / f7;
                }
                float f8 = (float) i2;
                float f9 = (float) i4;
                float f10 = (f8 * 1.0f) / f9;
                if (f10 < 1.0f) {
                    f10 = 1.0f / f10;
                }
                float f11 = (1.0f / f7) / f10;
                float f12 = ((((float) i) * 1.0f) / f8) / ((((float) i3) * 1.0f) / f9);
                if (f12 < 1.0f) {
                    f12 = 1.0f / f12;
                }
                return (((1.0f / f12) / f12) / f12) * f11;
        }
    }

    public final Rect b(vu6 vu6, vu6 vu62) {
        switch (this.a) {
            case b85.b:
                vu6 a2 = vu6.a(vu62);
                Log.i("rm0", "Preview: " + vu6 + "; Scaled: " + a2 + "; Want: " + vu62);
                int i = a2.w;
                int i2 = (i - vu62.w) / 2;
                int i3 = a2.x;
                int i4 = (i3 - vu62.x) / 2;
                return new Rect(-i2, -i4, i - i2, i3 - i4);
            case 1:
                vu6 b = vu6.b(vu62);
                Log.i("rm0", "Preview: " + vu6 + "; Scaled: " + b + "; Want: " + vu62);
                int i5 = b.w;
                int i6 = (i5 - vu62.w) / 2;
                int i7 = b.x;
                int i8 = (i7 - vu62.x) / 2;
                return new Rect(-i6, -i8, i5 - i6, i7 - i8);
            default:
                return new Rect(0, 0, vu62.w, vu62.x);
        }
    }
}
