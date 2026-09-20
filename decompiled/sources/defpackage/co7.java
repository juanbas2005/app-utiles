package defpackage;

/* renamed from: co7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class co7 extends a97 implements gs2 {
    public d35[] A;
    public do7 B;
    public kl7 C;
    public int D;
    public int E;
    public int F;
    public int G;
    public final /* synthetic */ d35[] H;
    public final /* synthetic */ do7 I;
    public final /* synthetic */ kl7 J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public co7(d35[] d35Arr, do7 do7, kl7 kl7, f61 f61) {
        super(2, f61);
        this.H = d35Arr;
        this.I = do7;
        this.J = kl7;
    }

    public final Object H(Object obj, Object obj2) {
        return ((co7) o((f61) obj2, (rd5) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        return new co7(this.H, this.I, this.J, f61);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (defpackage.do7.d(r7, r6, r12, r11) == r10) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        if (defpackage.do7.c(r7, r6, r12, r11) == r10) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0071, code lost:
        return r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0031  */
    public final Object s(Object obj) {
        int i;
        d35[] d35Arr;
        do7 do7;
        kl7 kl7;
        int i2;
        int i3;
        int i4;
        int i5 = this.G;
        if (i5 == 0) {
            o85.q(obj);
            d35[] d35Arr2 = this.H;
            i3 = d35Arr2.length;
            i2 = 0;
            do7 do72 = this.I;
            kl7 = this.J;
            d35Arr = d35Arr2;
            i = 0;
            do7 = do72;
        } else if (i5 == 1 || i5 == 2) {
            i3 = this.F;
            i2 = this.E;
            i4 = this.D;
            kl7 = this.C;
            do7 = this.B;
            d35Arr = this.A;
            o85.q(obj);
            i = i4;
            i2++;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (i2 < i3) {
            int i6 = i + 1;
            int ordinal = d35Arr[i2].ordinal();
            if (ordinal != 0) {
                p81 p81 = p81.w;
                if (ordinal == 1) {
                    this.A = d35Arr;
                    this.B = do7;
                    this.C = kl7;
                    this.D = i6;
                    this.E = i2;
                    this.F = i3;
                    this.G = 1;
                } else {
                    if (ordinal == 2) {
                        this.A = d35Arr;
                        this.B = do7;
                        this.C = kl7;
                        this.D = i6;
                        this.E = i2;
                        this.F = i3;
                        this.G = 2;
                    }
                    h.c();
                    return null;
                }
                i4 = i6;
                i = i4;
                i2++;
                if (i2 < i3) {
                }
            }
            i = i6;
            i2++;
            if (i2 < i3) {
            }
        }
        return vs7.a;
    }
}
