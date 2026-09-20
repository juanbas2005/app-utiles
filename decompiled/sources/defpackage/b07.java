package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: b07  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b07 extends a97 implements gs2 {
    public byte[] A;
    public AtomicLong B;
    public el3 C;
    public long D;
    public long E;
    public double F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ d07 I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b07(d07 d07, f61 f61) {
        super(2, f61);
        this.I = d07;
    }

    public final Object H(Object obj, Object obj2) {
        return ((b07) o((f61) obj2, (op5) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        b07 b07 = new b07(this.I, f61);
        b07.H = obj;
        return b07;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.concurrent.atomic.AtomicLong, byte[], java.lang.Object, el3] */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v10, types: [r81, e81] */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00b6, code lost:
        r26 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00f2, code lost:
        if (r1.B.b(r0, new defpackage.e07(defpackage.yz6.x, 0, 0.0d, 0.0f, 30)) == r8) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x015e, code lost:
        throw new java.util.concurrent.CancellationException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01a9, code lost:
        if (r1.B.b(r0, new defpackage.e07(defpackage.yz6.y, r26, 0.0d, 0.0f, 28)) == r8) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01ad, code lost:
        r0.H = r1;
        r0.D = r2;
        r0.G = 3;
        r6 = defpackage.d07.a(r4, r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01b7, code lost:
        if (r6 != r8) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01bb, code lost:
        r2 = ((java.lang.Number) r6).doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01c3, code lost:
        if (r2 >= 0.0d) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01c5, code lost:
        r0.H = null;
        r0.D = r26;
        r0.F = r2;
        r0.G = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01e5, code lost:
        if (r1.B.b(r0, new defpackage.e07(defpackage.yz6.B, r26, 0.0d, 0.0f, 28)) != r8) goto L_0x0339;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01e9, code lost:
        r9 = r26;
        r13 = new byte[5242880];
        r14 = new java.util.concurrent.atomic.AtomicLong(0);
        r24 = r4;
        r15 = r8;
        r25 = null;
        r8 = r2;
        r2 = java.lang.System.currentTimeMillis();
        r6 = r26;
        r26 = 8.0d;
        r4 = new defpackage.e07(r5, r6, r8, 0.0f, 24);
        r0.H = r1;
        r0.A = r13;
        r0.B = r14;
        r0.D = r6;
        r0.F = r8;
        r0.E = r2;
        r0.G = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0227, code lost:
        if (r1.B.b(r0, r4) != r15) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x022c, code lost:
        r28 = r6;
        r37 = r8;
        r8 = r13;
        r9 = r14;
        r13 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0234, code lost:
        r10 = r25;
        r4 = r10;
        r6 = defpackage.ar7.H(r1, r4, r4, new defpackage.gv(r24, r8, r9, r10, 11), 3);
        r10 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x024a, code lost:
        if (r6.l() == false) goto L_0x02d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x024c, code lost:
        r0.H = r1;
        r0.A = r8;
        r0.B = r9;
        r0.C = r6;
        r0.D = r10;
        r0.F = r13;
        r0.E = r2;
        r0.G = 6;
        r40 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0265, code lost:
        if (defpackage.t49.G(200, r0) != r15) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0268, code lost:
        r4 = r8;
        r37 = r13;
        r13 = r6;
        r14 = r9;
        r6 = r10;
        r8 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0270, code lost:
        r10 = r14.get();
        r30 = r6;
        r5 = ((double) (java.lang.System.currentTimeMillis() - r2)) / 1000.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0286, code lost:
        if (r5 <= 0.1d) goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0288, code lost:
        r5 = ((((double) r10) * r26) / r22) / r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0292, code lost:
        r5 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0294, code lost:
        r12 = defpackage.z65.o(((float) r10) / ((float) r4.length), 0.0f, 1.0f);
        r10 = r5;
        r16 = r15;
        r5 = r40;
        r15 = r4;
        r6 = r30;
        r4 = new defpackage.e07(r5, r6, r8, r10, r12);
        r0.H = r1;
        r0.A = r15;
        r0.B = r14;
        r0.C = r13;
        r0.D = r6;
        r0.F = r8;
        r0.E = r2;
        r0.G = 7;
        r12 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02c6, code lost:
        if (r1.B.b(r0, r4) != r12) goto L_0x02ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02ca, code lost:
        r10 = r6;
        r6 = r13;
        r9 = r14;
        r13 = r8;
        r8 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02d2, code lost:
        r15 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02d6, code lost:
        r12 = r15;
        r0.H = r1;
        r4 = 0;
        r0.A = null;
        r0.B = r9;
        r0.C = null;
        r0.D = r10;
        r0.F = r13;
        r0.E = r2;
        r0.G = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02ee, code lost:
        if (r6.j0(r0) != r12) goto L_0x02f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02f1, code lost:
        r6 = r9;
        r30 = r10;
        r32 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02f6, code lost:
        r7 = ((double) (java.lang.System.currentTimeMillis() - r2)) / 1000.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0300, code lost:
        if (r7 <= 0.0d) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0302, code lost:
        r20 = ((((double) r6.get()) * r26) / r22) / r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x030d, code lost:
        r29 = defpackage.yz6.A;
        r0.H = r4;
        r0.A = r4;
        r0.B = r4;
        r0.C = r4;
        r0.D = r30;
        r0.F = r32;
        r0.E = r2;
        r0.G = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0336, code lost:
        if (r1.B.b(r0, new defpackage.e07(r29, r30, r32, r20, 1.0f)) != r12) goto L_0x0339;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0339, code lost:
        return r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        return r12;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[ExcHandler: CancellationException (unused java.util.concurrent.CancellationException), SYNTHETIC, Splitter:B:23:0x011c] */
    public final Object s(Object obj) {
        double d;
        double d2;
        long j;
        p81 p81;
        long j2;
        Object obj2;
        op5 op5 = (op5) this.H;
        int i = this.G;
        Object obj3 = null;
        yz6 yz6 = yz6.z;
        vs7 vs7 = vs7.a;
        d07 d07 = this.I;
        double d3 = 0.0d;
        p81 p812 = p81.w;
        switch (i) {
            case b85.b /*0*/:
                d2 = 1000000.0d;
                o85.q(obj);
                this.H = op5;
                this.G = 1;
                break;
            case 1:
                d2 = 1000000.0d;
                o85.q(obj);
                pe3 pe3 = new pe3(1, 3, 1);
                ArrayList arrayList = new ArrayList(et0.e0(pe3, 10));
                Iterator it = pe3.iterator();
                while (((qe3) it).y) {
                    ((je3) it).nextInt();
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        d45 d45 = d07.b;
                        o9 o9Var = new o9(12);
                        o9Var.N("https://speed.cloudflare.com/__down?bytes=0");
                        o9Var.G("HEAD", (f56) null);
                        kd6 kd6 = new kd6(o9Var);
                        d45.getClass();
                        obj2 = obj3;
                        new dx5(d45, kd6, false).f().close();
                    } catch (CancellationException unused) {
                    } catch (Exception unused2) {
                        obj2 = obj3;
                    }
                    arrayList.add(new Long(System.currentTimeMillis() - currentTimeMillis));
                    obj3 = obj2;
                }
                Object obj4 = obj3;
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    Comparable comparable = (Comparable) it2.next();
                    while (it2.hasNext()) {
                        Comparable comparable2 = (Comparable) it2.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                    long longValue = ((Number) comparable).longValue();
                    j2 = longValue;
                    this.H = op5;
                    this.D = j2;
                    this.G = 2;
                    break;
                } else {
                    rf2.c();
                    return obj4;
                }
            case 2:
                d2 = 1000000.0d;
                j2 = this.D;
                o85.q(obj);
                break;
            case 3:
                d2 = 1000000.0d;
                j2 = this.D;
                o85.q(obj);
                Object a = obj;
                break;
            case 4:
                o85.q(obj);
                return vs7;
            case 5:
                d2 = 1000000.0d;
                j = this.E;
                double d4 = this.F;
                long j3 = this.D;
                AtomicLong atomicLong = this.B;
                byte[] bArr = this.A;
                o85.q(obj);
                d07 d072 = d07;
                f61 f61 = null;
                p81 = p812;
                byte[] bArr2 = bArr;
                long j4 = j3;
                d = 8.0d;
                double d5 = d4;
                AtomicLong atomicLong2 = atomicLong;
                break;
            case 6:
                d2 = 1000000.0d;
                j = this.E;
                double d6 = this.F;
                long j5 = this.D;
                el3 el3 = this.C;
                AtomicLong atomicLong3 = this.B;
                byte[] bArr3 = this.A;
                o85.q(obj);
                byte[] bArr4 = bArr3;
                el3 el32 = el3;
                byte[] bArr5 = bArr4;
                yz6 yz62 = yz6;
                AtomicLong atomicLong4 = atomicLong3;
                p81 = p812;
                double d7 = d6;
                long j6 = j5;
                d = 8.0d;
                break;
            case 7:
                j = this.E;
                double d8 = this.F;
                long j7 = this.D;
                el3 el33 = this.C;
                AtomicLong atomicLong5 = this.B;
                d2 = 1000000.0d;
                byte[] bArr6 = this.A;
                o85.q(obj);
                p81 p813 = p812;
                byte[] bArr7 = bArr6;
                double d9 = d8;
                long j8 = j7;
                AtomicLong atomicLong6 = atomicLong5;
                d = 8.0d;
                el3 el34 = el33;
                break;
            case 8:
                j = this.E;
                double d10 = this.F;
                long j9 = this.D;
                AtomicLong atomicLong7 = this.B;
                o85.q(obj);
                double d11 = d10;
                ? r4 = 0;
                p81 p814 = p812;
                long j10 = j9;
                d2 = 1000000.0d;
                d = 8.0d;
                break;
            case 9:
                o85.q(obj);
                return vs7;
            default:
                h.s("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
