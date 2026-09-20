package defpackage;

/* renamed from: sh6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sh6 extends a97 implements gs2 {
    public int A;
    public final /* synthetic */ th6 B;
    public final /* synthetic */ float C;
    public final /* synthetic */ float D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sh6(th6 th6, float f, float f2, f61 f61) {
        super(2, f61);
        this.B = th6;
        this.C = f;
        this.D = f2;
    }

    public final Object H(Object obj, Object obj2) {
        return ((sh6) o((f61) obj2, (o81) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        return new sh6(this.B, this.C, this.D, f61);
    }

    public final Object s(Object obj) {
        int i = this.A;
        if (i == 0) {
            o85.q(obj);
            zh6 zh6 = this.B.j0;
            long floatToRawIntBits = (long) Float.floatToRawIntBits(this.C);
            this.A = 1;
            Object a = mh6.a(zh6, (floatToRawIntBits << 32) | (((long) Float.floatToRawIntBits(this.D)) & 4294967295L), this);
            p81 p81 = p81.w;
            if (a == p81) {
                return p81;
            }
        } else if (i == 1) {
            o85.q(obj);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        return vs7.a;
    }
}
