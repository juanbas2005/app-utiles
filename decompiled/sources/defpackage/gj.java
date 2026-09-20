package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* renamed from: gj  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gj implements c81 {
    public final /* synthetic */ int w = 0;
    public final Object x;
    public final Object y;

    public gj(gj gjVar) {
        this.x = gjVar;
        this.y = new l90();
    }

    public final Object G(gs2 gs2, Object obj) {
        switch (this.w) {
            case b85.b:
                return gs2.H(obj, this);
            case 1:
                return gs2.H(obj, this);
            default:
                return gs2.H(obj, this);
        }
    }

    public final e81 L(d81 d81) {
        switch (this.w) {
            case b85.b:
                return rc9.A0(this, d81);
            case 1:
                return rc9.A0(this, d81);
            default:
                return rc9.A0(this, d81);
        }
    }

    public final e81 X(e81 e81) {
        switch (this.w) {
            case b85.b:
                return rc9.D0(this, e81);
            case 1:
                return rc9.D0(this, e81);
            default:
                return rc9.D0(this, e81);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [ic0, h20, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007d, code lost:
        if (r9 == r2) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    public final Object a(vr2 vr2, f61 f61) {
        ye5 ye5;
        Object obj;
        int i;
        Object a;
        boolean z;
        Object obj2;
        switch (this.w) {
            case b85.b:
                ej ejVar = (ej) this.y;
                kk0 kk0 = new kk0(1, rc9.a0(f61));
                kk0.v();
                fj fjVar = new fj(kk0, this, vr2);
                if (sg3.e(ejVar.y, (Choreographer) this.x)) {
                    synchronized (ejVar.A) {
                        ejVar.C.add(fjVar);
                        if (!ejVar.F) {
                            ejVar.F = true;
                            ejVar.y.postFrameCallback(ejVar.G);
                        }
                    }
                    kk0.x(new lh(3, ejVar, fjVar));
                } else {
                    ((Choreographer) this.x).postFrameCallback(fjVar);
                    kk0.x(new lh(4, this, fjVar));
                }
                return kk0.t();
            case 1:
                kk0 kk02 = new kk0(1, rc9.a0(f61));
                kk02.v();
                ? obj3 = new Object();
                obj3.a = kk02;
                obj3.b = vr2;
                kk02.x(new b0(8, ((o9) this.y).h(obj3, (by5) this.x)));
                return kk02.t();
            default:
                if (f61 instanceof ye5) {
                    ye5 = (ye5) f61;
                    int i2 = ye5.C;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        ye5.C = i2 - Integer.MIN_VALUE;
                        Object obj4 = ye5.A;
                        obj = p81.w;
                        i = ye5.C;
                        if (i != 0) {
                            o85.q(obj4);
                            l90 l90 = (l90) this.y;
                            ye5.z = vr2;
                            ye5.C = 1;
                            synchronized (l90.b) {
                                z = l90.a;
                            }
                            if (!z) {
                                kk0 kk03 = new kk0(1, rc9.a0(ye5));
                                kk03.v();
                                synchronized (l90.b) {
                                    ((ArrayList) l90.c).add(kk03);
                                }
                                kk03.x(new e3(14, (Object) l90, (Object) kk03));
                                obj2 = kk03.t();
                                if (obj2 != obj) {
                                    obj2 = vs7.a;
                                    break;
                                }
                            } else {
                                obj2 = vs7.a;
                                break;
                            }
                        } else if (i == 1) {
                            vr2 = ye5.z;
                            o85.q(obj4);
                        } else if (i == 2) {
                            o85.q(obj4);
                            return obj4;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ye5.z = null;
                        ye5.C = 2;
                        a = ((gj) this.x).a(vr2, ye5);
                        if (a != obj) {
                            return a;
                        }
                        return obj;
                    }
                }
                ye5 = new ye5(this, f61);
                Object obj42 = ye5.A;
                obj = p81.w;
                i = ye5.C;
                if (i != 0) {
                }
                ye5.z = null;
                ye5.C = 2;
                a = ((gj) this.x).a(vr2, ye5);
                if (a != obj) {
                }
                return obj;
        }
    }

    public final c81 a0(d81 d81) {
        switch (this.w) {
            case b85.b:
                return rc9.J(this, d81);
            case 1:
                return rc9.J(this, d81);
            default:
                return rc9.J(this, d81);
        }
    }

    public d81 getKey() {
        return d63.F;
    }

    public gj(Choreographer choreographer, ej ejVar) {
        this.x = choreographer;
        this.y = ejVar;
    }

    public gj(by5 by5) {
        this.x = by5;
        this.y = new o9(1);
    }
}
