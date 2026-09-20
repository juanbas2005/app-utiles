package defpackage;

/* renamed from: lx6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lx6 extends l66 implements gs2 {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ mx6 D;
    public long[] y;
    public int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lx6(mx6 mx6, f61 f61) {
        super(2, f61);
        this.D = mx6;
    }

    public final Object H(Object obj, Object obj2) {
        return ((lx6) o((f61) obj2, (bl6) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        lx6 lx6 = new lx6(this.D, f61);
        lx6.C = obj;
        return lx6;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: bl6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009e  */
    public final Object s(Object obj) {
        bl6 bl6;
        int i;
        bl6 bl62;
        bl6 bl63;
        int i2;
        long[] jArr;
        int i3;
        int i4;
        mx6 mx6 = this.D;
        long j = mx6.w;
        long j2 = mx6.y;
        long j3 = mx6.x;
        int i5 = this.B;
        p81 p81 = p81.w;
        if (i5 == 0) {
            o85.q(obj);
            bl62 = this.C;
            jArr = mx6.z;
            if (jArr != null) {
                i4 = jArr.length;
                i3 = 0;
            }
            if (j3 != 0) {
                bl63 = bl62;
                i2 = 0;
                if (i2 >= 64) {
                }
                bl62 = bl63;
            }
            if (j != 0) {
            }
            return vs7.a;
        } else if (i5 == 1) {
            i4 = this.A;
            int i6 = this.z;
            jArr = this.y;
            bl62 = (bl6) this.C;
            o85.q(obj);
            i3 = i6 + 1;
        } else if (i5 == 2) {
            i2 = this.z;
            bl63 = (bl6) this.C;
            o85.q(obj);
            i2++;
            if (i2 >= 64) {
                bl62 = bl63;
            } else {
                if ((j3 & (1 << i2)) != 0) {
                    Long l = new Long(j2 + ((long) i2));
                    this.C = bl63;
                    this.y = null;
                    this.z = i2;
                    this.B = 2;
                    bl63.c(this, l);
                    return p81;
                }
                i2++;
                if (i2 >= 64) {
                }
            }
            bl62 = bl63;
            if (j != 0) {
                bl6 = bl62;
                i = 0;
                if (i < 64) {
                }
            }
            return vs7.a;
        } else if (i5 == 3) {
            int i7 = this.z;
            bl6 = (bl6) this.C;
            o85.q(obj);
            i = i7 + 1;
            if (i < 64) {
                if (((1 << i) & j) != 0) {
                    Long l2 = new Long(j2 + ((long) i) + 64);
                    this.C = bl6;
                    this.y = null;
                    this.z = i;
                    this.B = 3;
                    bl6.c(this, l2);
                } else {
                    i7 = i;
                    i = i7 + 1;
                    if (i < 64) {
                    }
                }
                Long l22 = new Long(j2 + ((long) i) + 64);
                this.C = bl6;
                this.y = null;
                this.z = i;
                this.B = 3;
                bl6.c(this, l22);
                return p81;
            }
            return vs7.a;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (i3 < i4) {
            Long l3 = new Long(jArr[i3]);
            this.C = bl62;
            this.y = jArr;
            this.z = i3;
            this.A = i4;
            this.B = 1;
            bl62.c(this, l3);
            return p81;
        }
        if (j3 != 0) {
        }
        if (j != 0) {
        }
        return vs7.a;
    }
}
