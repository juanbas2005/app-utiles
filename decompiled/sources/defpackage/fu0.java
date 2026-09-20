package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: fu0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fu0 extends a97 implements gs2 {
    public Object[] A;
    public en0 B;
    public byte[] C;
    public int D;
    public int E;
    public int F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ di2[] I;
    public final /* synthetic */ sr2 J;
    public final /* synthetic */ hs2 K;
    public final /* synthetic */ fi2 L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fu0(f61 f61, fi2 fi2, sr2 sr2, hs2 hs2, di2[] di2Arr) {
        super(2, f61);
        this.I = di2Arr;
        this.J = sr2;
        this.K = hs2;
        this.L = fi2;
    }

    public final Object H(Object obj, Object obj2) {
        return ((fu0) o((f61) obj2, (o81) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        f61 f612 = f61;
        fu0 fu0 = new fu0(f612, this.L, this.J, this.K, this.I);
        fu0.H = obj;
        return fu0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: py2[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: py2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: ka3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: py2[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: py2[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0117, code lost:
        if (r15.u(r14, r11, r0) == r9) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0135, code lost:
        if (r15.u(r14, r7, r0) == r9) goto L_0x0137;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d0 A[LOOP:1: B:25:0x00d0->B:32:0x00f1, LOOP_START, PHI: r2 r14 
      PHI: (r2v3 int) = (r2v2 int), (r2v4 int) binds: [B:22:0x00cb, B:32:0x00f1] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r14v3 ka3) = (r14v2 ka3), (r14v7 ka3) binds: [B:22:0x00cb, B:32:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object s(Object obj) {
        int i;
        en0 en0;
        Object[] objArr;
        int i2;
        int i3;
        byte[] bArr;
        Object obj2;
        int i4;
        int i5;
        ka3 ka3;
        Object[] objArr2;
        o81 o81 = (o81) this.H;
        int i6 = this.G;
        Object obj3 = o15.b;
        int i7 = 2;
        int i8 = 1;
        Object obj4 = p81.w;
        if (i6 == 0) {
            o85.q(obj);
            i3 = this.I.length;
            if (i3 != 0) {
                Object[] objArr3 = new Object[i3];
                qs.S0(0, i3, obj3, objArr3);
                en0 c = rj1.c(i3, 6, (vc0) null);
                AtomicInteger atomicInteger = new AtomicInteger(i3);
                for (int i9 = 0; i9 < i3; i9++) {
                    ar7.H(o81, (e81) null, (r81) null, new eu0((Object) this.I, i9, (Object) atomicInteger, (Object) c, (f61) null, 0), 3);
                }
                bArr = new byte[i3];
                i = 0;
                objArr2 = objArr3;
                en0 = c;
                i2 = i3;
                i = (byte) (i + i8);
                this.H = null;
                this.A = objArr2;
                this.B = en0;
                this.C = bArr;
                this.D = i3;
                this.E = i2;
                this.F = i;
                this.G = i8;
                obj2 = en0.s(this);
                if (obj2 != obj4) {
                }
                return obj4;
            }
            return vs7.a;
        } else if (i6 == 1) {
            int i10 = this.F;
            i5 = this.E;
            i4 = this.D;
            byte[] bArr2 = this.C;
            en0 = this.B;
            Object[] objArr4 = this.A;
            o85.q(obj);
            obj2 = ((rn0) obj).a;
            Object[] objArr5 = objArr4;
            i = i10;
            bArr = bArr2;
            objArr = objArr5;
            ka3 = (ka3) rn0.a(obj2);
            if (ka3 != null) {
            }
            return vs7.a;
        } else if (i6 == 2) {
            int i11 = this.F;
            i5 = this.E;
            i4 = this.D;
            byte[] bArr3 = this.C;
            en0 = this.B;
            Object[] objArr6 = this.A;
            o85.q(obj);
            Object[] objArr7 = objArr6;
            i = i11;
            bArr = bArr3;
            objArr = objArr7;
            int i12 = i4;
            i2 = i5;
            i3 = i12;
            objArr = objArr;
            i8 = 1;
            objArr2 = objArr;
            i = (byte) (i + i8);
            this.H = null;
            this.A = objArr2;
            this.B = en0;
            this.C = bArr;
            this.D = i3;
            this.E = i2;
            this.F = i;
            this.G = i8;
            obj2 = en0.s(this);
            if (obj2 != obj4) {
                int i13 = i2;
                i4 = i3;
                i5 = i13;
                objArr = objArr2;
                ka3 = (ka3) rn0.a(obj2);
                if (ka3 != null) {
                    while (true) {
                        int i14 = ka3.a;
                        Object obj5 = objArr[i14];
                        objArr[i14] = ka3.b;
                        if (obj5 == obj3) {
                            i5--;
                        }
                        if (bArr[i14] == i) {
                            break;
                        }
                        bArr[i14] = (byte) i;
                        ka3 = rn0.a(en0.p());
                        if (ka3 == null) {
                            break;
                        }
                    }
                    if (i5 == 0) {
                        Object[] objArr8 = (Object[]) this.J.b();
                        fi2 fi2 = this.L;
                        hs2 hs2 = this.K;
                        if (objArr8 == null) {
                            this.H = null;
                            this.A = objArr;
                            this.B = en0;
                            this.C = bArr;
                            this.D = i4;
                            this.E = i5;
                            this.F = i;
                            this.G = i7;
                        } else {
                            qs.N0(0, 0, 14, objArr, objArr8);
                            this.H = null;
                            this.A = objArr;
                            this.B = en0;
                            this.C = bArr;
                            this.D = i4;
                            this.E = i5;
                            this.F = i;
                            this.G = 3;
                        }
                    }
                    int i15 = i4;
                    i2 = i5;
                    i3 = i15;
                    i8 = 1;
                    objArr2 = objArr;
                    i = (byte) (i + i8);
                    this.H = null;
                    this.A = objArr2;
                    this.B = en0;
                    this.C = bArr;
                    this.D = i3;
                    this.E = i2;
                    this.F = i;
                    this.G = i8;
                    obj2 = en0.s(this);
                    if (obj2 != obj4) {
                    }
                }
                return vs7.a;
            }
            return obj4;
        } else if (i6 == 3) {
            int i16 = this.F;
            i5 = this.E;
            i4 = this.D;
            byte[] bArr4 = this.C;
            en0 = this.B;
            Object[] objArr9 = this.A;
            o85.q(obj);
            Object[] objArr10 = objArr9;
            i = i16;
            bArr = bArr4;
            objArr = objArr10;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i17 = i4;
        i2 = i5;
        i3 = i17;
        i7 = 2;
        objArr = objArr;
        i8 = 1;
        objArr2 = objArr;
        i = (byte) (i + i8);
        this.H = null;
        this.A = objArr2;
        this.B = en0;
        this.C = bArr;
        this.D = i3;
        this.E = i2;
        this.F = i;
        this.G = i8;
        obj2 = en0.s(this);
        if (obj2 != obj4) {
        }
        return obj4;
    }
}
