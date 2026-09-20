package defpackage;

/* renamed from: kx0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kx0 extends l66 implements gs2 {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ lx0 D;
    public int y;
    public int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kx0(lx0 lx0, f61 f61) {
        super(2, f61);
        this.D = lx0;
    }

    public final Object H(Object obj, Object obj2) {
        return ((kx0) o((f61) obj2, (bl6) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        kx0 kx0 = new kx0(this.D, f61);
        kx0.C = obj;
        return kx0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: bl6} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object s(Object obj) {
        bl6 bl6;
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        String str2;
        lx0 lx0 = this.D;
        lp4 lp4 = lx0.w;
        xo4 xo4 = lx0.y;
        int i6 = this.B;
        if (i6 == 0) {
            o85.q(obj);
            bl6 = this.C;
            i3 = 0;
            i2 = 0;
            i = 0;
        } else if (i6 == 1) {
            i3 = this.A;
            i2 = this.z;
            i = this.y;
            bl6 = (bl6) this.C;
            o85.q(obj);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (i >= Math.min(lx0.z + 10, xo4.b)) {
            return vs7.a;
        }
        int i7 = i + 1;
        int c = xo4.c(i);
        switch (c) {
            case b85.b:
                str = "up";
                break;
            case 1:
                Object f = lp4.f(i2);
                i2++;
                str = "down " + f;
                break;
            case 2:
                str = b81.l(xo4.c(i7), xo4.c(i + 2), "remove ", " ");
                i7 = i + 3;
                break;
            case 3:
                int c2 = xo4.c(i7);
                int c3 = xo4.c(i + 2);
                int c4 = xo4.c(i + 3);
                StringBuilder p = pb4.p("move ", c2, " ", c3, " ");
                p.append(c4);
                str = p.toString();
                i7 = i + 4;
                break;
            case 4:
                str = "clear";
                break;
            case 5:
                i4 = i + 2;
                int c5 = xo4.c(i7);
                i5 = i2 + 1;
                str2 = "insertBottomUp " + c5 + " " + lp4.f(i2);
                break;
            case 6:
                i4 = i + 2;
                int c6 = xo4.c(i7);
                i5 = i2 + 1;
                str2 = "insertTopDown " + c6 + " " + lp4.f(i2);
                break;
            case 7:
                Object f2 = lp4.f(i2);
                f2.getClass();
                mp7.Q(2, f2);
                i2 += 2;
                str = "apply " + ((gs2) f2);
                break;
            case 8:
                str = "reuse " + lx0.x.f(i3);
                i3++;
                break;
            case 9:
                str = "recompose pending";
                break;
            default:
                str = hl6.k(c, "unknown op: ");
                break;
        }
        int i8 = i4;
        str = str2;
        i7 = i8;
        i2 = i5;
        this.C = bl6;
        this.y = i7;
        this.z = i2;
        this.A = i3;
        this.B = 1;
        bl6.c(this, i + ": " + str);
        return p81.w;
    }
}
