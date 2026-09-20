package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import android.view.View;
import java.util.concurrent.CancellationException;

/* renamed from: lh  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lh extends wx3 implements vr2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lh(int i, Object obj, Object obj2) {
        super(1);
        this.x = i;
        this.z = obj;
        this.y = obj2;
    }

    public final Object y(Object obj) {
        jy5 jy5;
        switch (this.x) {
            case b85.b:
                o81 o81 = (o81) obj;
                return new rc3((v44) this.z, new kh(0, (mh) this.y));
            case 1:
                Throwable th = (Throwable) obj;
                rc3 rc3 = (rc3) this.z;
                synchronized (rc3.c) {
                    try {
                        rc3.e = true;
                        eq4 eq4 = rc3.d;
                        Object[] objArr = eq4.w;
                        int i = eq4.y;
                        for (int i2 = 0; i2 < i; i2++) {
                            t15 t15 = (t15) ((n88) objArr[i2]).get();
                            if (!(t15 == null || (jy5 = t15.b) == null)) {
                                jy5.closeConnection();
                                t15.b = null;
                            }
                        }
                        rc3.d.g();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                rf7 rf7 = ((mh) this.y).x;
                rf7.b.set((Object) null);
                rf7.a.c();
                return vs7.a;
            case 2:
                kw1 kw1 = (kw1) obj;
                pl5 pl5 = (pl5) this.z;
                pl5.setPositionProvider((sl5) this.y);
                pl5.s();
                return new qh(0);
            case 3:
                Throwable th3 = (Throwable) obj;
                ej ejVar = (ej) this.z;
                fj fjVar = (fj) this.y;
                synchronized (ejVar.A) {
                    try {
                        ejVar.C.remove(fjVar);
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return vs7.a;
            case 4:
                Throwable th5 = (Throwable) obj;
                ((Choreographer) ((gj) this.z).x).removeFrameCallback((fj) this.y);
                return vs7.a;
            case 5:
                ((dh5) obj).g((eh5) this.z, 0, 0, ((k51) this.y).c.d());
                return vs7.a;
            case 6:
                dh5.n((dh5) obj, (eh5) this.z, 0, 0, ((w90) this.y).K, 4);
                return vs7.a;
            case 7:
                Throwable th6 = (Throwable) obj;
                yi0 yi0 = (yi0) this.z;
                if (th6 == null) {
                    yi0.a(((mo1) this.y).C());
                } else if (th6 instanceof CancellationException) {
                    yi0.d = true;
                    bj0 bj0 = yi0.b;
                    if (bj0 != null && bj0.x.cancel(true)) {
                        yi0.a = null;
                        yi0.b = null;
                        yi0.c = null;
                    }
                } else {
                    yi0.b(th6);
                }
                return vs7.a;
            case 8:
                hz1 hz1 = (hz1) obj;
                hz1 hz12 = (hz1) this.z;
                tp1 H = hz1.j0().H();
                ey3 J = hz1.j0().J();
                qk0 D = hz1.j0().D();
                long L = hz1.j0().L();
                vr2 vr2 = (vr2) this.y;
                tp1 H2 = hz12.j0().H();
                ey3 J2 = hz12.j0().J();
                qk0 D2 = hz12.j0().D();
                long L2 = hz12.j0().L();
                cx2 cx2 = (cx2) hz12.j0().y;
                wr0 j0 = hz12.j0();
                j0.c0(H);
                j0.d0(J);
                j0.b0(D);
                j0.e0(L);
                j0.y = (cx2) hz1.j0().y;
                D.h();
                try {
                    vr2.y(hz12);
                    D.p();
                    wr0 j02 = hz12.j0();
                    j02.c0(H2);
                    j02.d0(J2);
                    j02.b0(D2);
                    j02.e0(L2);
                    j02.y = cx2;
                    return vs7.a;
                } catch (Throwable th7) {
                    Throwable th8 = th7;
                    D.p();
                    wr0 j03 = hz12.j0();
                    j03.c0(H2);
                    j03.d0(J2);
                    j03.b0(D2);
                    j03.e0(L2);
                    j03.y = cx2;
                    throw th8;
                }
            case 9:
                dh5.n((dh5) obj, (eh5) this.z, 0, 0, ((bu6) this.y).X, 4);
                return vs7.a;
            default:
                yx0 yx0 = (yx0) obj;
                gs2 gs2 = (gs2) this.y;
                ve8 ve8 = (ve8) this.z;
                if (!ve8.y) {
                    t54 c = yx0.c();
                    View view = yx0.a;
                    in8 k = c.k();
                    ve8.A = gs2;
                    if (ve8.z == null) {
                        if (!sg3.e(Looper.myLooper(), view.getHandler().getLooper())) {
                            view.post(new e66(5, ve8, k));
                        } else {
                            ve8.z = k;
                            k.x0(ve8);
                        }
                    } else if (k.G0().compareTo(k54.y) >= 0) {
                        ve8.x.C(new fw0(-1723985096, new wy0(yx0, ve8, gs2), true));
                    }
                }
                return vs7.a;
        }
    }
}
