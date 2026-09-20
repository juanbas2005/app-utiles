package defpackage;

import android.view.WindowManager;
import cu.lestebang.utiletecsa.feature.settings.service.SpeedOverlayService;

/* renamed from: sz6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class sz6 implements gs2 {
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ WindowManager.LayoutParams x;
    public final /* synthetic */ SpeedOverlayService y;
    public final /* synthetic */ WindowManager z;

    public /* synthetic */ sz6(WindowManager.LayoutParams layoutParams, SpeedOverlayService speedOverlayService, WindowManager windowManager) {
        this.x = layoutParams;
        this.y = speedOverlayService;
        this.z = windowManager;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        int i = this.w;
        vs7 vs7 = vs7.a;
        WindowManager windowManager = this.z;
        SpeedOverlayService speedOverlayService = this.y;
        WindowManager.LayoutParams layoutParams = this.x;
        switch (i) {
            case b85.b:
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                d37 d37 = SpeedOverlayService.K;
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    aq4 f = u55.f(speedOverlayService.G, yt2);
                    aq4 f2 = u55.f(speedOverlayService.H, yt2);
                    aq4 f3 = u55.f(speedOverlayService.I, yt2);
                    long longValue = ((Number) f.getValue()).longValue();
                    long longValue2 = ((Number) f2.getValue()).longValue();
                    long longValue3 = ((Number) f3.getValue()).longValue();
                    boolean i2 = yt2.i(speedOverlayService);
                    Object Q = yt2.Q();
                    Object obj3 = ay0.a;
                    if (i2 || Q == obj3) {
                        Q = new hx4(26, speedOverlayService);
                        yt2.o0(Q);
                    }
                    sr2 sr2 = (sr2) Q;
                    boolean i3 = yt2.i(layoutParams) | yt2.i(speedOverlayService) | yt2.i(windowManager);
                    Object Q2 = yt2.Q();
                    if (i3 || Q2 == obj3) {
                        Q2 = new sz6(layoutParams, speedOverlayService, windowManager);
                        yt2.o0(Q2);
                    }
                    gs2 gs2 = (gs2) Q2;
                    boolean i4 = yt2.i(speedOverlayService) | yt2.i(layoutParams);
                    Object Q3 = yt2.Q();
                    if (i4 || Q3 == obj3) {
                        Q3 = new qm3(27, (Object) speedOverlayService, (Object) layoutParams);
                        yt2.o0(Q3);
                    }
                    long j = longValue;
                    long j2 = longValue2;
                    w95.b(j, j2, longValue3, sr2, gs2, (sr2) Q3, yt2, 0);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                float floatValue = ((Float) obj).floatValue();
                float floatValue2 = ((Float) obj2).floatValue();
                d37 d372 = SpeedOverlayService.K;
                layoutParams.x = dh4.C(floatValue) + layoutParams.x;
                layoutParams.y = dh4.C(floatValue2) + layoutParams.y;
                vx0 vx0 = speedOverlayService.B;
                if (vx0 != null) {
                    windowManager.updateViewLayout(vx0, layoutParams);
                }
                return vs7;
        }
    }

    public /* synthetic */ sz6(SpeedOverlayService speedOverlayService, WindowManager.LayoutParams layoutParams, WindowManager windowManager) {
        this.y = speedOverlayService;
        this.x = layoutParams;
        this.z = windowManager;
    }
}
