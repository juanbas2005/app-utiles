package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* renamed from: gy2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gy2 extends h81 implements so1 {
    public final boolean A;
    public final gy2 B;
    public final Handler y;
    public final String z;

    public gy2(Handler handler, String str, boolean z2) {
        gy2 gy2;
        this.y = handler;
        this.z = str;
        this.A = z2;
        if (z2) {
            gy2 = this;
        } else {
            gy2 = new gy2(handler, str, true);
        }
        this.B = gy2;
    }

    public final void D(e81 e81, Runnable runnable) {
        if (!this.y.post(runnable)) {
            o0(e81, runnable);
        }
    }

    public final mw1 a(long j, si7 si7, e81 e81) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.y.postDelayed(si7, j)) {
            return new fy2(0, this, si7);
        }
        o0(e81, si7);
        return f05.w;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gy2)) {
            return false;
        }
        gy2 gy2 = (gy2) obj;
        if (gy2.y == this.y && gy2.A == this.A) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int identityHashCode = System.identityHashCode(this.y);
        if (this.A) {
            i = 1231;
        } else {
            i = 1237;
        }
        return i ^ identityHashCode;
    }

    public final void k(long j, kk0 kk0) {
        ga gaVar = new ga(24, (Object) kk0, (Object) this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.y.postDelayed(gaVar, j)) {
            kk0.x(new m0(23, this, gaVar));
        } else {
            o0(kk0.A, gaVar);
        }
    }

    public final boolean m0(e81 e81) {
        if (!this.A || !sg3.e(Looper.myLooper(), this.y.getLooper())) {
            return true;
        }
        return false;
    }

    public final h81 n0(int i) {
        su0.g(1);
        return this;
    }

    public final void o0(e81 e81, Runnable runnable) {
        r16.u(e81, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        dn1 dn1 = aw1.a;
        cm1.y.D(e81, runnable);
    }

    public final String toString() {
        String str;
        gy2 gy2;
        dn1 dn1 = aw1.a;
        gy2 gy22 = pe4.a;
        if (this == gy22) {
            str = "Dispatchers.Main";
        } else {
            try {
                gy2 = gy22.B;
            } catch (UnsupportedOperationException unused) {
                gy2 = null;
            }
            if (this == gy2) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str != null) {
            return str;
        }
        String str2 = this.z;
        if (str2 == null) {
            str2 = this.y.toString();
        }
        if (this.A) {
            return b81.n(str2, ".immediate");
        }
        return str2;
    }

    public gy2(Handler handler) {
        this(handler, (String) null, false);
    }
}
