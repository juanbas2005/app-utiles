package defpackage;

/* renamed from: np4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class np4 extends l66 implements gs2 {
    public long[] A;
    public int B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ op4 E;
    public final /* synthetic */ bv2 F;
    public bv2 y;
    public op4 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public np4(op4 op4, bv2 bv2, f61 f61) {
        super(2, f61);
        this.E = op4;
        this.F = bv2;
    }

    public final Object H(Object obj, Object obj2) {
        return ((np4) o((f61) obj2, (bl6) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        np4 np4 = new np4(this.E, this.F, f61);
        np4.D = obj;
        return np4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: bl6} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object s(Object obj) {
        bl6 bl6;
        bv2 bv2;
        op4 op4;
        long[] jArr;
        int i;
        int i2 = this.C;
        if (i2 == 0) {
            o85.q(obj);
            bl6 = this.D;
            op4 = this.E;
            mp4 mp4 = op4.x;
            jArr = mp4.c;
            i = mp4.e;
            bv2 = this.F;
        } else if (i2 == 1) {
            i = this.B;
            jArr = this.A;
            op4 = this.z;
            bv2 = this.y;
            bl6 = (bl6) this.D;
            o85.q(obj);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (i == Integer.MAX_VALUE) {
            return vs7.a;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        bv2.x = i;
        Object obj2 = op4.x.b[i];
        this.D = bl6;
        this.y = bv2;
        this.z = op4;
        this.A = jArr;
        this.B = i3;
        this.C = 1;
        bl6.c(this, obj2);
        return p81.w;
    }
}
