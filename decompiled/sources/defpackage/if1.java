package defpackage;

/* renamed from: if1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class if1 extends a97 implements gs2 {
    public f06 A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ f06 D;
    public final /* synthetic */ jf1 E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ boolean G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public if1(f06 f06, jf1 jf1, Object obj, boolean z, f61 f61) {
        super(2, f61);
        this.D = f06;
        this.E = jf1;
        this.F = obj;
        this.G = z;
    }

    public final Object H(Object obj, Object obj2) {
        return ((if1) o((f61) obj2, (pd2) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        if1 if1 = new if1(this.D, this.E, this.F, this.G, f61);
        if1.C = obj;
        return if1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0069, code lost:
        if (r10 == r8) goto L_0x006b;
     */
    public final Object s(Object obj) {
        int i;
        pd2 pd2;
        f06 f06;
        int i2 = this.B;
        vs7 vs7 = vs7.a;
        Object obj2 = this.F;
        jf1 jf1 = this.E;
        f06 f062 = this.D;
        p81 p81 = p81.w;
        if (i2 == 0) {
            o85.q(obj);
            pd2 pd22 = (pd2) this.C;
            cf3 i3 = jf1.i();
            this.C = pd22;
            this.A = f062;
            this.B = 1;
            Object b = i3.b(this);
            if (b != p81) {
                pd2 = pd22;
                obj = b;
                f06 = f062;
            }
            return p81;
        } else if (i2 == 1) {
            f06 = this.A;
            pd2 = (pd2) this.C;
            o85.q(obj);
        } else if (i2 == 2) {
            o85.q(obj);
            if (this.G) {
                ji8 ji8 = jf1.h;
                if (obj2 != null) {
                    i = obj2.hashCode();
                } else {
                    i = 0;
                }
                ji8.G(new de1(i, f062.w, obj2));
            }
            return vs7;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f06.w = ((Number) obj).intValue();
        this.C = null;
        this.A = null;
        this.B = 2;
        if (!pd2.c.get()) {
            Object d = sg3.d(pd2.a, new v6(pd2, obj2, (f61) null), this);
            if (d != p81) {
                d = vs7;
            }
        } else {
            h.s("This scope has already been closed.");
            return null;
        }
    }
}
