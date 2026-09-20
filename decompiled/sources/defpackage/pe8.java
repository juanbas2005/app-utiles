package defpackage;

import androidx.work.impl.WorkerStoppedException;
import java.util.concurrent.CancellationException;

/* renamed from: pe8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pe8 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ re8 C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pe8(re8 re8, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = re8;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((pe8) o(f61, o81)).s(vs7);
            default:
                return ((pe8) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        re8 re8 = this.C;
        switch (i) {
            case b85.b:
                return new pe8(re8, f61, 0);
            default:
                return new pe8(re8, f61, 1);
        }
    }

    public final Object s(Object obj) {
        Object obj2;
        int i = this.A;
        p81 p81 = p81.w;
        re8 re8 = this.C;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    Object a = re8.a(re8, this);
                    if (a == p81) {
                        return p81;
                    }
                    return a;
                } else if (i2 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            default:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    fl3 fl3 = re8.m;
                    pe8 pe8 = new pe8(re8, (f61) null, 0);
                    this.B = 1;
                    obj = ar7.e0(fl3, pe8, this);
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i3 == 1) {
                    try {
                        o85.q(obj);
                    } catch (WorkerStoppedException e) {
                        obj2 = new ne8(e.w);
                    } catch (CancellationException unused) {
                        obj2 = new le8();
                    } catch (Throwable th) {
                        bc4.k().i(se8.a, "Unexpected error in WorkerWrapper", th);
                        obj2 = new le8();
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = (oe8) obj;
                Object o = re8.h.o(new hx4(12, new pz0(2, obj2, re8)));
                o.getClass();
                return o;
        }
    }
}
