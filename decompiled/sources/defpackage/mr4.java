package defpackage;

import android.view.WindowManager;
import cu.lestebang.utiletecsa.feature.nauta.service.NautaOverlayService;

/* renamed from: mr4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class mr4 implements gs2 {
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ WindowManager.LayoutParams x;
    public final /* synthetic */ NautaOverlayService y;
    public final /* synthetic */ WindowManager z;

    public /* synthetic */ mr4(WindowManager.LayoutParams layoutParams, NautaOverlayService nautaOverlayService, WindowManager windowManager) {
        this.x = layoutParams;
        this.y = nautaOverlayService;
        this.z = windowManager;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        int i = this.w;
        vs7 vs7 = vs7.a;
        WindowManager windowManager = this.z;
        WindowManager.LayoutParams layoutParams = this.x;
        switch (i) {
            case b85.b:
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                d37 d37 = NautaOverlayService.K;
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    NautaOverlayService nautaOverlayService = this.y;
                    aq4 f = u55.f(nautaOverlayService.H, yt2);
                    aq4 f2 = u55.f(nautaOverlayService.I, yt2);
                    long longValue = ((Number) f.getValue()).longValue();
                    long longValue2 = ((Number) f2.getValue()).longValue();
                    boolean i2 = yt2.i(nautaOverlayService);
                    Object Q = yt2.Q();
                    d63 d63 = ay0.a;
                    if (i2 || Q == d63) {
                        Q = new zh(27, (Object) nautaOverlayService);
                        yt2.o0(Q);
                    }
                    sr2 sr2 = (sr2) Q;
                    boolean i3 = yt2.i(layoutParams) | yt2.i(nautaOverlayService) | yt2.i(windowManager);
                    Object Q2 = yt2.Q();
                    if (i3 || Q2 == d63) {
                        Q2 = new mr4(layoutParams, nautaOverlayService, windowManager);
                        yt2.o0(Q2);
                    }
                    gs2 gs2 = (gs2) Q2;
                    boolean i4 = yt2.i(nautaOverlayService) | yt2.i(layoutParams);
                    Object Q3 = yt2.Q();
                    if (i4 || Q3 == d63) {
                        Q3 = new qm3(4, (Object) nautaOverlayService, (Object) layoutParams);
                        yt2.o0(Q3);
                    }
                    sr2 sr22 = (sr2) Q3;
                    boolean i5 = yt2.i(nautaOverlayService);
                    Object Q4 = yt2.Q();
                    if (i5 || Q4 == d63) {
                        yd ydVar = new yd(0, nautaOverlayService, NautaOverlayService.class, "openAppInNauta", "openAppInNauta()V", 0, 0, 21);
                        yt2.o0(ydVar);
                        Q4 = ydVar;
                    }
                    rc9.d(longValue, longValue2, sr2, gs2, sr22, (sr2) ((zq3) Q4), yt2, 0);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                float floatValue = ((Float) obj).floatValue();
                float floatValue2 = ((Float) obj2).floatValue();
                d37 d372 = NautaOverlayService.K;
                layoutParams.x = dh4.C(floatValue) + layoutParams.x;
                layoutParams.y = dh4.C(floatValue2) + layoutParams.y;
                vx0 vx0 = this.y.C;
                if (vx0 != null) {
                    windowManager.updateViewLayout(vx0, layoutParams);
                }
                return vs7;
        }
    }

    public /* synthetic */ mr4(NautaOverlayService nautaOverlayService, WindowManager.LayoutParams layoutParams, WindowManager windowManager) {
        this.y = nautaOverlayService;
        this.x = layoutParams;
        this.z = windowManager;
    }
}
