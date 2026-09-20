package defpackage;

import android.os.Build;
import android.os.Trace;
import androidx.work.impl.WorkerStoppedException;

/* renamed from: ci  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ci implements vr2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ ci(Object obj, boolean z2, Object obj2, Object obj3, int i) {
        this.w = i;
        this.y = obj;
        this.x = z2;
        this.z = obj2;
        this.A = obj3;
    }

    public final Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        Object obj2 = this.A;
        Object obj3 = this.z;
        boolean z2 = this.x;
        Object obj4 = this.y;
        switch (i) {
            case b85.b:
                hg hgVar = (hg) obj3;
                u90 u90 = (u90) obj2;
                wy3 wy3 = (wy3) obj;
                wy3.a();
                tk0 tk0 = wy3.w;
                if (((Boolean) ((sr2) obj4).b()).booleanValue()) {
                    if (z2) {
                        long v0 = tk0.v0();
                        wr0 wr0 = tk0.x;
                        long L = wr0.L();
                        wr0.D().h();
                        try {
                            ((ji8) wr0.x).E(-1.0f, 1.0f, v0);
                            hz1.F(wy3, hgVar, 0, 0.0f, u90, 46);
                            b81.u(wr0, L);
                        } catch (Throwable th) {
                            Throwable th2 = th;
                            b81.u(wr0, L);
                            throw th2;
                        }
                    } else {
                        hz1.F(wy3, hgVar, 0, 0.0f, u90, 46);
                    }
                }
                return vs7;
            default:
                t84 t84 = (t84) obj4;
                String str = (String) obj3;
                re8 re8 = (re8) obj2;
                Throwable th3 = (Throwable) obj;
                if (th3 instanceof WorkerStoppedException) {
                    t84.c.compareAndSet(-256, ((WorkerStoppedException) th3).w);
                }
                if (z2 && str != null) {
                    td0 td0 = re8.e.m;
                    int hashCode = re8.a.hashCode();
                    td0.getClass();
                    if (Build.VERSION.SDK_INT >= 29) {
                        tk7.b(hashCode, f55.v(str));
                    } else {
                        String v = f55.v(str);
                        try {
                            if (f55.g == null) {
                                f55.g = Trace.class.getMethod("asyncTraceEnd", new Class[]{Long.TYPE, String.class, Integer.TYPE});
                            }
                            f55.g.invoke((Object) null, new Object[]{Long.valueOf(f55.d), v, Integer.valueOf(hashCode)});
                        } catch (Exception e) {
                            f55.o("asyncTraceEnd", e);
                        }
                    }
                }
                return vs7;
        }
    }
}
