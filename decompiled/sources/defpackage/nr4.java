package defpackage;

import android.os.Bundle;
import android.view.WindowManager;
import cu.lestebang.utiletecsa.R;
import cu.lestebang.utiletecsa.feature.nauta.service.NautaOverlayService;
import java.util.List;

/* renamed from: nr4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nr4 implements fi2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ NautaOverlayService x;

    public /* synthetic */ nr4(NautaOverlayService nautaOverlayService, int i) {
        this.w = i;
        this.x = nautaOverlayService;
    }

    public final Object k(Object obj, f61 f61) {
        WindowManager windowManager;
        long j;
        Long w0;
        int i = this.w;
        vs7 vs7 = vs7.a;
        NautaOverlayService nautaOverlayService = this.x;
        switch (i) {
            case b85.b:
                if (!((Boolean) obj).booleanValue()) {
                    d37 d37 = NautaOverlayService.K;
                    vx0 vx0 = nautaOverlayService.E;
                    if (vx0 != null) {
                        try {
                            WindowManager windowManager2 = nautaOverlayService.B;
                            if (windowManager2 != null) {
                                windowManager2.removeView(vx0);
                            }
                        } catch (Throwable unused) {
                        }
                        nautaOverlayService.E = null;
                        ci0 ci0 = nautaOverlayService.F;
                        if (ci0 != null) {
                            w54 w54 = ci0.x;
                            w54.f1(j54.ON_PAUSE);
                            w54.f1(j54.ON_STOP);
                            w54.f1(j54.ON_DESTROY);
                        }
                        nautaOverlayService.F = null;
                    }
                } else if (nautaOverlayService.E == null && (windowManager = nautaOverlayService.B) != null) {
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, nautaOverlayService.G, 56, -3);
                    layoutParams.gravity = 81;
                    layoutParams.y = (int) (32.0f * nautaOverlayService.getResources().getDisplayMetrics().density);
                    ci0 ci02 = new ci0(2);
                    ci02.y.G((Bundle) null);
                    j54 j54 = j54.ON_CREATE;
                    w54 w542 = ci02.x;
                    w542.f1(j54);
                    w542.f1(j54.ON_START);
                    w542.f1(j54.ON_RESUME);
                    nautaOverlayService.F = ci02;
                    vx0 vx02 = new vx0(nautaOverlayService);
                    vx02.setTag(R.id.view_tree_lifecycle_owner, ci02);
                    vx02.setTag(R.id.view_tree_saved_state_registry_owner, ci02);
                    vx02.setContent(uq3.a);
                    windowManager.addView(vx02, layoutParams);
                    nautaOverlayService.E = vx02;
                }
                return vs7;
            case 1:
                d37 d372 = nautaOverlayService.H;
                List W0 = d57.W0(d57.k1((String) obj).toString(), new String[]{":"}, 6);
                if (W0.size() == 3 && (w0 = k57.w0((String) W0.get(0))) != null) {
                    long longValue = w0.longValue();
                    Long w02 = k57.w0((String) W0.get(1));
                    if (w02 != null) {
                        long longValue2 = w02.longValue();
                        Long w03 = k57.w0((String) W0.get(2));
                        if (w03 != null) {
                            j = (longValue2 * 60) + (longValue * 3600) + w03.longValue();
                            Long l = new Long(j);
                            d372.getClass();
                            d372.l((Object) null, l);
                            return vs7;
                        }
                    }
                }
                j = 0;
                Long l2 = new Long(j);
                d372.getClass();
                d372.l((Object) null, l2);
                return vs7;
            default:
                if (!((Boolean) obj).booleanValue()) {
                    nautaOverlayService.stopSelf();
                }
                return vs7;
        }
    }
}
