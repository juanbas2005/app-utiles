package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;

/* renamed from: vo0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class vo0 implements vr2 {
    public final /* synthetic */ a37 A;
    public final /* synthetic */ a37 B;
    public final /* synthetic */ l57 C;
    public final /* synthetic */ oo0 D;
    public final /* synthetic */ a37 w;
    public final /* synthetic */ a37 x;
    public final /* synthetic */ l57 y;
    public final /* synthetic */ a37 z;

    public /* synthetic */ vo0(a37 a37, a37 a372, l57 l57, a37 a373, im7 im7, im7 im72, l57 l572, oo0 oo0) {
        this.w = a37;
        this.x = a372;
        this.y = l57;
        this.z = a373;
        this.A = im7;
        this.B = im72;
        this.C = l572;
        this.D = oo0;
    }

    public final Object y(Object obj) {
        float f;
        Path path;
        hz1 hz1 = (hz1) obj;
        long j = ((jt0) this.w.getValue()).a;
        long j2 = ((jt0) this.x.getValue()).a;
        float e0 = hz1.e0(2.0f);
        l57 l57 = this.y;
        float f2 = l57.a;
        float f3 = f2 / 2.0f;
        float intBitsToFloat = Float.intBitsToFloat((int) (hz1.e() >> 32));
        boolean c = jt0.c(j, j2);
        rd2 rd2 = rd2.a;
        if (c) {
            f = 0.0f;
            hz1.y0(hz1, j, 0, (((long) Float.floatToRawIntBits(intBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(intBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(e0)) << 32) | (((long) Float.floatToRawIntBits(e0)) & 4294967295L), rd2, 226);
        } else {
            float f4 = f2;
            long floatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32);
            float f5 = intBitsToFloat - (f4 * 2.0f);
            long floatToRawIntBits2 = (((long) Float.floatToRawIntBits(f5)) & 4294967295L) | (((long) Float.floatToRawIntBits(f5)) << 32);
            float max = Math.max(0.0f, e0 - f4);
            long j3 = j;
            hz1 = hz1;
            long j4 = j3;
            long j5 = j2;
            f = 0.0f;
            hz1.y0(hz1, j4, floatToRawIntBits, floatToRawIntBits2, (((long) Float.floatToRawIntBits(max)) & 4294967295L) | (((long) Float.floatToRawIntBits(max)) << 32), rd2, 224);
            float f6 = intBitsToFloat - f4;
            float f7 = e0 - f3;
            hz1.y0(hz1, j5, (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32), (((long) Float.floatToRawIntBits(f6)) & 4294967295L) | (((long) Float.floatToRawIntBits(f6)) << 32), (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (((long) Float.floatToRawIntBits(f7)) << 32), l57, 224);
        }
        long j6 = ((jt0) this.z.getValue()).a;
        float floatValue = ((Number) this.A.getValue()).floatValue();
        float floatValue2 = ((Number) this.B.getValue()).floatValue();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (hz1.e() >> 32));
        float E = we.E(0.4f, 0.5f, floatValue2);
        float E2 = we.E(0.7f, 0.5f, floatValue2);
        float E3 = we.E(0.5f, 0.5f, floatValue2);
        float E4 = we.E(0.3f, 0.5f, floatValue2);
        oo0 oo0 = this.D;
        eh ehVar = oo0.a;
        eh ehVar2 = oo0.c;
        ehVar.h();
        eh ehVar3 = oo0.a;
        ehVar3.a.moveTo(0.2f * intBitsToFloat2, E3 * intBitsToFloat2);
        ehVar3.e(E * intBitsToFloat2, E2 * intBitsToFloat2);
        ehVar3.e(0.8f * intBitsToFloat2, intBitsToFloat2 * E4);
        fh fhVar = oo0.b;
        PathMeasure pathMeasure = fhVar.a;
        if (ehVar3 != null) {
            path = ehVar3.a;
        } else {
            path = null;
        }
        pathMeasure.setPath(path, false);
        ehVar2.h();
        fhVar.a(f, fhVar.a.getLength() * floatValue, ehVar2);
        hz1.w0(ehVar2, j6, this.C);
        return vs7.a;
    }
}
