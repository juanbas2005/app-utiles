package defpackage;

import android.view.KeyEvent;

/* renamed from: di1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class di1 implements vr2 {
    public final /* synthetic */ o81 A;
    public final /* synthetic */ sr2 w;
    public final /* synthetic */ s34 x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ ik2 z;

    public di1(sr2 sr2, s34 s34, boolean z2, ik2 ik2, o81 o81) {
        this.w = sr2;
        this.x = s34;
        this.y = z2;
        this.z = ik2;
        this.A = o81;
    }

    public final Object y(Object obj) {
        boolean z2;
        boolean z3;
        KeyEvent keyEvent = ((qs3) obj).a;
        if (dh4.v(keyEvent)) {
            this.w.b();
            return Boolean.TRUE;
        }
        s34 s34 = this.x;
        if (s34.j.a()) {
            return Boolean.TRUE;
        }
        boolean z4 = this.y;
        if (z4) {
            z2 = gi1.q(keyEvent);
        } else {
            z2 = gi1.p(keyEvent);
        }
        ik2 ik2 = this.z;
        if (z2) {
            ar7.H(this.A, (e81) null, (r81) null, new fi1(s34, -1, ik2, 2, (f61) null), 3);
            return Boolean.TRUE;
        }
        if (z4) {
            z3 = gi1.p(keyEvent);
        } else {
            z3 = gi1.q(keyEvent);
        }
        if (!z3) {
            return Boolean.FALSE;
        }
        ((lk2) ik2).h(1, true);
        return Boolean.TRUE;
    }
}
