package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: w9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w9 implements z71 {
    public final z71 a;
    public final float b;

    public w9(float f, z71 z71) {
        while (z71 instanceof w9) {
            z71 = ((w9) z71).a;
            f += ((w9) z71).b;
        }
        this.a = z71;
        this.b = f;
    }

    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9)) {
            return false;
        }
        w9 w9Var = (w9) obj;
        if (!this.a.equals(w9Var.a) || this.b != w9Var.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
