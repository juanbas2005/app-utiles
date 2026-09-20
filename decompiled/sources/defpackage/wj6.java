package defpackage;

import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;

/* renamed from: wj6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wj6 extends a97 implements gs2 {
    public final /* synthetic */ int A = 1;
    public int B;
    public final /* synthetic */ long C;
    public final /* synthetic */ Object D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wj6(long j, g97 g97, f61 f61) {
        super(2, f61);
        this.C = j;
        this.D = g97;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((wj6) o(f61, o81)).s(vs7);
            default:
                return ((wj6) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.D;
        long j = this.C;
        switch (i) {
            case b85.b:
                return new wj6((uj) obj2, j, f61);
            default:
                return new wj6(j, (g97) obj2, f61);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (defpackage.t49.G(r9 - 8, r13) == r8) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        if (defpackage.t49.G(8, r13) == r8) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return r8;
     */
    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        Object obj2 = this.D;
        p81 p81 = p81.w;
        long j = this.C;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    l35 l35 = new l35(j);
                    x17 x17 = xj6.d;
                    this.B = 1;
                    if (uj.c((uj) obj2, l35, x17, (Float) null, (vr2) null, this, 12) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i2 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            default:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    break;
                } else if (i3 == 1) {
                    o85.q(obj);
                } else if (i3 == 2) {
                    o85.q(obj);
                    kk0 kk0 = ((g97) obj2).y;
                    if (kk0 == null) {
                        return vs7;
                    }
                    kk0.f(new m66(new PointerEventTimeoutCancellationException(j)));
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this.B = 2;
                break;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wj6(uj ujVar, long j, f61 f61) {
        super(2, f61);
        this.D = ujVar;
        this.C = j;
    }
}
