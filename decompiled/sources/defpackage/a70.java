package defpackage;

import android.content.res.Resources;
import android.os.Trace;
import android.view.View;
import android.view.Window;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: a70  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class a70 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ a70(td0 td0, String str, sr2 sr2, bp4 bp4, yi0 yi0) {
        this.w = 3;
        this.x = td0;
        this.z = str;
        this.y = sr2;
        this.A = bp4;
        this.B = yi0;
    }

    public final void run() {
        yp4 yp4;
        yp4 C;
        ix6 j;
        int i = this.w;
        Object obj = this.B;
        Object obj2 = this.A;
        Object obj3 = this.y;
        Object obj4 = this.z;
        Object obj5 = this.x;
        switch (i) {
            case b85.b /*0*/:
                tg7 tg7 = (tg7) obj5;
                ey3 ey3 = (ey3) obj3;
                String str = (String) obj4;
                tp1 tp1 = (tp1) obj2;
                dl2 dl2 = (dl2) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    ix6 j2 = nx6.j();
                    if (j2 instanceof yp4) {
                        yp4 = (yp4) j2;
                    } else {
                        yp4 = null;
                    }
                    if (yp4 == null || (C = yp4.C((vr2) null, (vr2) null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        j = C.j();
                        tg7 k = aa5.k(tg7, ey3);
                        a42 a42 = a42.w;
                        dh dhVar = new dh(str, k, a42, a42, dl2, tp1);
                        dhVar.e();
                        dhVar.d();
                        ix6.q(j);
                        C.w().e();
                        C.c();
                        Trace.endSection();
                        return;
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        C.c();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    Trace.endSection();
                    throw th4;
                }
            case 1:
                ca7 ca7 = (ca7) obj3;
                ca7 ca72 = (ca7) obj4;
                View view = (View) obj;
                Window window = ((rv0) obj2).getWindow();
                window.getClass();
                vr2 vr2 = ca7.c;
                Resources resources = view.getResources();
                resources.getClass();
                boolean booleanValue = ((Boolean) vr2.y(resources)).booleanValue();
                vr2 vr22 = ca72.c;
                Resources resources2 = view.getResources();
                resources2.getClass();
                ((f22) obj5).b(ca7, ca72, window, view, booleanValue, ((Boolean) vr22.y(resources2)).booleanValue());
                return;
            case 2:
                ho7 ho7 = (ho7) obj5;
                xn6 xn6 = (xn6) obj3;
                ListenableFuture listenableFuture = (ListenableFuture) obj4;
                ListenableFuture listenableFuture2 = (ListenableFuture) obj2;
                e82 e82 = (e82) obj;
                if (ho7.isDone()) {
                    xn6.n(listenableFuture);
                    return;
                } else if (listenableFuture2.isCancelled()) {
                    int i2 = e82.A;
                    if (e82.compareAndSet(d82.w, d82.x)) {
                        ho7.cancel(false);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            default:
                String str2 = (String) obj4;
                sr2 sr2 = (sr2) obj3;
                bp4 bp4 = (bp4) obj2;
                yi0 yi0 = (yi0) obj;
                ((td0) obj5).getClass();
                boolean p = f55.p();
                if (p) {
                    try {
                        Trace.beginSection(f55.v(str2));
                    } catch (Throwable th5) {
                        if (p) {
                            Trace.endSection();
                        }
                        throw th5;
                    }
                }
                sr2.b();
                y65 y65 = g22.F;
                bp4.g(y65);
                yi0.a(y65);
                if (p) {
                    Trace.endSection();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ a70(tg7 tg7, ey3 ey3, String str, tp1 tp1, dl2 dl2, boolean z2) {
        this.w = 0;
        this.x = tg7;
        this.y = ey3;
        this.z = str;
        this.A = tp1;
        this.B = dl2;
    }

    public /* synthetic */ a70(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
        this.A = obj4;
        this.B = obj5;
    }
}
