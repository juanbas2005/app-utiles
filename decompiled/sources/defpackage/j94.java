package defpackage;

import java.util.List;

/* renamed from: j94  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class j94 {
    public static final float a;
    public static final float b;
    public static final List c;
    public static final float d;

    static {
        boolean z;
        long j;
        float f;
        float f2 = h03.y0;
        a = f2;
        float f3 = h03.w0;
        b = f3;
        float f4 = h03.t0;
        n63 n63 = wg4.a;
        s96 k = n63.k();
        s96 s96 = wg4.l;
        if (s96 == null) {
            s96 = f55.s(9, wg4.c).c(new rg4(7, (Object) wg4.e)).b();
            wg4.l = s96;
        }
        s96 s962 = wg4.i;
        if (s962 == null) {
            f = 0.5f;
            j = 4294967295L;
            z = true;
            s962 = n63.i(n63, sg3.E(new vg4((((long) Float.floatToRawIntBits(-0.009f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.5f)) << 32), new y71(2, 0.172f)), new vg4((((long) Float.floatToRawIntBits(1.03f)) << 32) | (((long) Float.floatToRawIntBits(0.365f)) & 4294967295L), new y71(2, 0.164f)), new vg4((((long) Float.floatToRawIntBits(0.97f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.828f)) << 32), new y71(2, 0.169f))), 1, 4).b();
            wg4.i = s962;
        } else {
            f = 0.5f;
            z = true;
            j = 4294967295L;
        }
        s96 s963 = wg4.h;
        if (s963 == null) {
            s963 = n63.i(n63, sg3.E(new vg4((((long) Float.floatToRawIntBits(0.961f)) << z) | (((long) Float.floatToRawIntBits(0.039f)) & j), new y71(2, 0.426f)), new vg4((((long) Float.floatToRawIntBits(1.001f)) << z) | (((long) Float.floatToRawIntBits(0.428f)) & j), y71.b), new vg4((((long) Float.floatToRawIntBits(0.609f)) & j) | (((long) Float.floatToRawIntBits(1.0f)) << z), new y71(2, 1.0f))), 2, 4).b();
            wg4.h = s963;
        }
        s96 s964 = s963;
        s96 s965 = wg4.j;
        if (s965 == null) {
            s965 = f55.s(8, wg4.b).b();
            wg4.j = s965;
        }
        s96 s966 = wg4.k;
        if (s966 == null) {
            s966 = n63.i(n63, sg3.E(new vg4((((long) Float.floatToRawIntBits(1.237f)) << (z ? 1 : 0)) | (((long) Float.floatToRawIntBits(1.236f)) & j), new y71(2, 0.258f)), new vg4((((long) Float.floatToRawIntBits(0.918f)) & j) | (((long) Float.floatToRawIntBits(f)) << z), new y71(2, 0.233f))), 4, 12).b();
            wg4.k = s966;
        }
        s96 s967 = s966;
        s96 s968 = wg4.g;
        if (s968 == null) {
            float[] a2 = eh4.a();
            eh4.f(a2, 1.0f, 0.64f);
            s968 = f55.f(15).c(new rg4(7, (Object) a2)).c(new rg4(7, (Object) wg4.d)).b();
            wg4.g = s968;
        }
        c = sg3.E(k, s96, s962, s964, s965, s967, s968);
        s96 s969 = wg4.f;
        if (s969 == null) {
            s969 = f55.f(14).b();
            wg4.f = s969;
        }
        float[] a3 = eh4.a();
        eh4.e(a3, 18.0f);
        sg3.E(s969.c(new rg4(7, (Object) a3)), n63.k());
        d = f4 / Math.min(f2, f3);
    }
}
