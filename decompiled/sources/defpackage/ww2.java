package defpackage;

import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.SweepGradient;

/* renamed from: ww2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ww2 {
    public static final ww2 a = new Object();

    public final LinearGradient a(long j, long j2, long[] jArr, float[] fArr, int i) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return vw2.b(intBitsToFloat, intBitsToFloat2, Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), jArr, fArr, pd8.G(i));
    }

    public final RadialGradient b(long j, float f, long[] jArr, float[] fArr, int i) {
        return vw2.c(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, jArr, fArr, pd8.G(i));
    }

    public final SweepGradient c(long j, long[] jArr, float[] fArr) {
        return wk0.f(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), jArr, fArr);
    }
}
