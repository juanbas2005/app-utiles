package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: u19  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u19 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ ju8 x;
    public final /* synthetic */ AppMeasurementDynamiteService y;

    public /* synthetic */ u19(AppMeasurementDynamiteService appMeasurementDynamiteService, ju8 ju8, int i) {
        this.w = i;
        this.x = ju8;
        this.y = appMeasurementDynamiteService;
    }

    public final void run() {
        boolean z = false;
        switch (this.w) {
            case b85.b:
                r69 j = this.y.d.j();
                ju8 ju8 = this.x;
                j.b1();
                j.d1();
                j.q1(new z46(j, j.s1(false), ju8, 10));
                return;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.y;
                d99 d99 = appMeasurementDynamiteService.d.E;
                y19.e(d99);
                y19 y19 = appMeasurementDynamiteService.d;
                if (y19.U != null && y19.U.booleanValue()) {
                    z = true;
                }
                d99.T1(this.x, z);
                return;
        }
    }
}
