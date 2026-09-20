package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: eh8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class eh8 extends sg8 {
    public final xb7 b;
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public eh8(x84 x84, xb7 xb7) {
        this(4, xb7);
        this.c = 1;
        this.d = x84;
    }

    public final void a(Status status) {
        this.b.c(new ApiException(status));
    }

    public final void b(Exception exc) {
        this.b.c(exc);
    }

    public final /* bridge */ /* synthetic */ void c(k68 k68, boolean z) {
        int i = this.c;
    }

    public final void d(ng8 ng8) {
        try {
            k(ng8);
        } catch (DeadObjectException e) {
            a(jh8.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(jh8.e(e2));
        } catch (RuntimeException e3) {
            this.b.c(e3);
        }
    }

    public final cc2[] f(ng8 ng8) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case b85.b:
                return (cc2[]) ((vg8) obj).a.c;
            default:
                vg8 vg8 = (vg8) ng8.i.get((x84) obj);
                if (vg8 == null) {
                    return null;
                }
                return (cc2[]) vg8.a.c;
        }
    }

    public final boolean g(ng8 ng8) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case b85.b:
                return ((vg8) obj).a.a;
            default:
                vg8 vg8 = (vg8) ng8.i.get((x84) obj);
                if (vg8 == null || !vg8.a.a) {
                    return false;
                }
                return true;
        }
    }

    public final int h(ng8 ng8) {
        switch (this.c) {
            case b85.b:
                return 0;
            default:
                if (((vg8) ng8.i.get((x84) this.d)) != null) {
                    return 0;
                }
                return -1;
        }
    }

    public final void k(ng8 ng8) {
        switch (this.c) {
            case b85.b:
                vg8 vg8 = (vg8) this.d;
                l90 l90 = vg8.a;
                ((fm8) ((ge2) l90.d).b).accept(ng8.e, this.b);
                x84 x84 = (x84) ((uw2) l90.b).b;
                if (x84 != null) {
                    ng8.i.put(x84, vg8);
                    return;
                }
                return;
            default:
                vg8 vg82 = (vg8) ng8.i.remove((x84) this.d);
                if (vg82 != null) {
                    ((fx8) ((ge2) vg82.b.x).c).accept(ng8.e, this.b);
                    ((uw2) vg82.a.b).b = null;
                    return;
                }
                this.b.d(Boolean.FALSE);
                return;
        }
    }

    public eh8(int i, xb7 xb7) {
        super(i);
        this.b = xb7;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public eh8(vg8 vg8, xb7 xb7) {
        this(3, xb7);
        this.c = 0;
        this.d = vg8;
    }

    private final /* bridge */ /* synthetic */ void i(k68 k68, boolean z) {
    }

    private final /* bridge */ /* synthetic */ void j(k68 k68, boolean z) {
    }
}
