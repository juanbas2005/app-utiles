package defpackage;

import java.util.List;

/* renamed from: r13  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class r13 implements gs2 {
    public final /* synthetic */ long w;
    public final /* synthetic */ uk5 x;
    public final /* synthetic */ aq4 y;
    public final /* synthetic */ aq4 z;

    public /* synthetic */ r13(long j, uk5 uk5, aq4 aq4, aq4 aq42) {
        this.w = j;
        this.x = uk5;
        this.y = aq4;
        this.z = aq42;
    }

    public final Object H(Object obj, Object obj2) {
        qk5 qk5 = (qk5) obj;
        l35 l35 = (l35) obj2;
        qk5.getClass();
        qk5.a();
        long j = this.w;
        List list = t13.a;
        aq4 aq4 = this.y;
        h97 h97 = (h97) this.x;
        float f = -(((float) (((int) (j >> 32)) - ((int) (((we3) aq4.getValue()).a >> 32)))) - (h97.b() * 32.0f));
        float f2 = -(((float) (((int) (j & 4294967295L)) - ((int) (((we3) aq4.getValue()).a & 4294967295L)))) - (h97.b() * 32.0f));
        aq4 aq42 = this.z;
        float intBitsToFloat = Float.intBitsToFloat((int) (l35.a >> 32)) + Float.intBitsToFloat((int) (((l35) aq42.getValue()).a >> 32));
        if (f > 0.0f) {
            f = 0.0f;
        }
        float o = z65.o(intBitsToFloat, f, 0.0f);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (l35.a & 4294967295L)) + Float.intBitsToFloat((int) (((l35) aq42.getValue()).a & 4294967295L));
        if (f2 > 0.0f) {
            f2 = 0.0f;
        }
        aq42.setValue(new l35((((long) Float.floatToRawIntBits(o)) << 32) | (((long) Float.floatToRawIntBits(z65.o(intBitsToFloat2, f2, 0.0f))) & 4294967295L)));
        return vs7.a;
    }
}
