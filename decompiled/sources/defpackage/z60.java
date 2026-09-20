package defpackage;

import android.os.Trace;
import java.util.List;

/* renamed from: z60  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class z60 implements Runnable {
    public final /* synthetic */ tp1 A;
    public final /* synthetic */ dl2 B;
    public final /* synthetic */ tg7 w;
    public final /* synthetic */ ey3 x;
    public final /* synthetic */ List y;
    public final /* synthetic */ vl z;

    public /* synthetic */ z60(tg7 tg7, ey3 ey3, List list, vl vlVar, tp1 tp1, dl2 dl2, boolean z2) {
        this.w = tg7;
        this.x = ey3;
        this.y = list;
        this.z = vlVar;
        this.A = tp1;
        this.B = dl2;
    }

    public final void run() {
        yp4 yp4;
        yp4 C;
        ix6 j;
        tg7 tg7 = this.w;
        ey3 ey3 = this.x;
        vl vlVar = this.z;
        tp1 tp1 = this.A;
        dl2 dl2 = this.B;
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
                List list = this.y;
                if (list == null) {
                    list = a42.w;
                }
                o9 o9Var = new o9(vlVar, k, list, tp1, dl2);
                o9Var.e();
                o9Var.d();
                ix6.q(j);
                C.w().e();
                C.c();
                Trace.endSection();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    C.c();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Throwable th5 = th4;
            Trace.endSection();
            throw th5;
        }
    }
}
