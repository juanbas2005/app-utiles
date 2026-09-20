package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: pq4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pq4 implements ik0, g88 {
    public final kk0 w;
    public final /* synthetic */ qq4 x;

    public pq4(qq4 qq4, kk0 kk0) {
        this.x = qq4;
        this.w = kk0;
    }

    public final void J(Object obj, hs2 hs2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qq4.F;
        qq4 qq4 = this.x;
        atomicReferenceFieldUpdater.set(qq4, (Object) null);
        this.w.E(new h43(17, qq4, this), vs7.a);
    }

    public final void N(Object obj) {
        this.w.N(obj);
    }

    public final boolean a(Throwable th) {
        return this.w.a(th);
    }

    public final void b(ri6 ri6, int i) {
        this.w.b(ri6, i);
    }

    public final void f(Object obj) {
        this.w.f(obj);
    }

    public final py2 n(Object obj, hs2 hs2) {
        qq4 qq4 = this.x;
        xa7 xa7 = new xa7(qq4, this);
        py2 I = this.w.I((vs7) obj, xa7);
        if (I != null) {
            qq4.F.set(qq4, (Object) null);
        }
        return I;
    }

    public final e81 r() {
        return this.w.A;
    }
}
