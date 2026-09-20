package defpackage;

import android.view.animation.Interpolator;

/* renamed from: ga8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ga8 {
    public final int a;
    public float b;
    public final Interpolator c;
    public final long d;

    public ga8(int i, Interpolator interpolator, long j) {
        this.a = i;
        this.c = interpolator;
        this.d = j;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        float f = this.b;
        Interpolator interpolator = this.c;
        if (interpolator != null) {
            return interpolator.getInterpolation(f);
        }
        return f;
    }

    public int c() {
        return this.a;
    }

    public void d(float f) {
        this.b = f;
    }
}
