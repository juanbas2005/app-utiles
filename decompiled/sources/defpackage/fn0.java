package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: fn0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fn0 extends gn0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(fn0.class, "consumed$volatile");
    public final boolean A;
    private volatile /* synthetic */ int consumed$volatile;
    public final en0 z;

    /* JADX WARNING: Illegal instructions before constructor call */
    public /* synthetic */ fn0(en0 en0, boolean z2) {
        this(r1, r2, x32.w, -3, vc0.w);
        en0 en02 = en0;
        boolean z3 = z2;
    }

    public final Object a(fi2 fi2, f61 f61) {
        int i = this.x;
        p81 p81 = p81.w;
        if (i == -3) {
            boolean z2 = this.A;
            if (!z2 || B.getAndSet(this, 1) != 1) {
                Object o = tf4.o(fi2, this.z, z2, f61);
                if (o == p81) {
                    return o;
                }
            } else {
                h.s("ReceiveChannel.consumeAsFlow can be collected just once");
                return null;
            }
        } else {
            Object a = super.a(fi2, f61);
            if (a == p81) {
                return a;
            }
        }
        return vs7.a;
    }

    public final String d() {
        return "channel=" + this.z;
    }

    public final Object e(op5 op5, f61 f61) {
        Object o = tf4.o(new zk6(op5), this.z, this.A, f61);
        if (o == p81.w) {
            return o;
        }
        return vs7.a;
    }

    public final gn0 f(e81 e81, int i, vc0 vc0) {
        return new fn0(this.z, this.A, e81, i, vc0);
    }

    public final di2 g() {
        return new fn0(this.z, this.A);
    }

    public final en0 h(o81 o81) {
        if (this.A && B.getAndSet(this, 1) == 1) {
            h.s("ReceiveChannel.consumeAsFlow can be collected just once");
            return null;
        } else if (this.x == -3) {
            return this.z;
        } else {
            return super.h(o81);
        }
    }

    public fn0(en0 en0, boolean z2, e81 e81, int i, vc0 vc0) {
        super(e81, i, vc0);
        this.z = en0;
        this.A = z2;
    }
}
