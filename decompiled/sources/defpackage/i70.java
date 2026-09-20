package defpackage;

import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;

/* renamed from: i70  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i70 extends l66 implements gs2 {
    public long A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ o81 D;
    public final /* synthetic */ ek7 E;
    public d37 y;
    public lk5 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i70(o81 o81, ek7 ek7, f61 f61) {
        super(2, f61);
        this.D = o81;
        this.E = ek7;
    }

    public final Object H(Object obj, Object obj2) {
        return ((i70) o((f61) obj2, (g97) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        i70 i70 = new i70(this.D, this.E, f61);
        i70.C = obj;
        return i70;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009e, code lost:
        r14 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009f, code lost:
        r13 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        defpackage.ar7.H(r13.D, (defpackage.e81) null, defpackage.r81.z, new defpackage.p0((java.lang.Object) r0, (java.lang.Object) r13.E, (defpackage.f61) null, 10), 1);
        r13.C = r0;
        r13.y = null;
        r13.z = null;
        r13.B = 3;
        r14 = defpackage.sb7.i(r6, r8, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bd, code lost:
        if (r14 != r5) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c0, code lost:
        r13 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a1 */
    public final Object s(Object obj) {
        d37 d37;
        lk5 lk5;
        g97 g97;
        d37 d372;
        d37 d373;
        long j;
        int i = this.B;
        p81 p81 = p81.w;
        if (i == 0) {
            o85.q(obj);
            g97 g972 = (g97) this.C;
            d372 = e37.a(Boolean.FALSE);
            long b = g972.g().b();
            this.C = g972;
            this.y = d372;
            lk5 = lk5.w;
            this.z = lk5;
            this.A = b;
            this.B = 1;
            Object b2 = sb7.b(g972, this, 1);
            if (b2 != p81) {
                j = b;
                g97 = g972;
                obj = b2;
            }
            return p81;
        } else if (i == 1) {
            long j2 = this.A;
            lk5 lk52 = this.z;
            d37 d374 = this.y;
            o85.q(obj);
            d37 d375 = d374;
            lk5 = lk52;
            d372 = d375;
            j = j2;
            g97 = (g97) this.C;
        } else if (i == 2) {
            lk5 lk53 = this.z;
            d373 = this.y;
            g97 = (g97) this.C;
            try {
                o85.q(obj);
                Boolean bool = Boolean.FALSE;
                d373.getClass();
                d373.l((Object) null, bool);
            } catch (PointerEventTimeoutCancellationException unused) {
                lk5 = lk53;
                d372 = d373;
            } catch (Throwable th) {
                th = th;
                d37 = d373;
                Boolean bool2 = Boolean.FALSE;
                d37.getClass();
                d37.l((Object) null, bool2);
                throw th;
            }
            return vs7.a;
        } else if (i == 3) {
            d37 = (d37) this.C;
            try {
                o85.q(obj);
                qk5 qk5 = (qk5) obj;
                if (qk5 != null) {
                    qk5.a();
                }
                Boolean bool3 = Boolean.FALSE;
                d37.getClass();
                d37.l((Object) null, bool3);
                return vs7.a;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j3 = j;
        int i2 = ((qk5) obj).i;
        if (i2 == 1 || i2 == 3) {
            vf vfVar = new vf(lk5, (f61) null, 1);
            this.C = g97;
            this.y = d372;
            this.z = lk5;
            this.B = 2;
            if (g97.h(j3, vfVar, this) != p81) {
                d373 = d372;
                Boolean bool4 = Boolean.FALSE;
                d373.getClass();
                d373.l((Object) null, bool4);
            }
            return p81;
        }
        return vs7.a;
    }
}
