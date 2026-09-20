package defpackage;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import com.google.firebase.sessions.SessionData;
import cu.lestebang.utiletecsa.MainActivity;
import cu.lestebang.utiletecsa.R;
import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import cu.lestebang.utiletecsa.feature.nauta.service.NautaTileService;
import cu.lestebang.utiletecsa.feature.settings.service.BalanceNotificationService;
import cu.lestebang.utiletecsa.feature.settings.service.SpeedOverlayService;
import cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService;
import cu.lestebang.utiletecsa.sync.worker.SyncWorker;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* renamed from: lg  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lg implements fi2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ lg(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public final Object k(Object obj, f61 f61) {
        Object value;
        Object g;
        WindowManager windowManager;
        Object value2;
        f61 f612 = f61;
        int i = this.w;
        p81 p81 = p81.w;
        vs7 vs7 = vs7.a;
        Object obj2 = this.x;
        switch (i) {
            case b85.b:
                vs7 vs72 = (vs7) obj;
                qc3 qc3 = (qc3) obj2;
                if (Build.VERSION.SDK_INT >= 34) {
                    qc3.A().startStylusHandwriting((View) qc3.x);
                }
                return vs7;
            case 1:
                List list = (List) obj;
                d37 d37 = ((c30) obj2).c;
                do {
                    value = d37.getValue();
                } while (!d37.i(value, new is7(6, k20.a((k20) ((is7) value).a, list, (hv2) null, 2))));
                return vs7;
            case 2:
                sg3.W((BalanceNotificationService) obj2, 202609, (Notification) obj);
                return vs7;
            case 3:
                ((e41) obj2).j = ((zn6) obj).f;
                return vs7;
            case 4:
                vs7 vs73 = (vs7) obj;
                jf1 jf1 = (jf1) obj2;
                if ((jf1.h.w() instanceof be2) || (g = jf1.g(jf1, true, f612)) != p81) {
                    return vs7;
                }
                return g;
            case 5:
                ((ku1) obj2).h = ((zn6) obj).f;
                return vs7;
            case 6:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                y12.a((MainActivity) obj2, new ca7(0, 0, new vd4(booleanValue, 0)), new ca7(ee4.a, ee4.b, new vd4(booleanValue, 1)));
                return vs7;
            case 7:
                String str = (String) obj;
                yh7.a.getClass();
                hr2.m(new Object[0]);
                return ne4.e((ne4) obj2, f612);
            case 8:
                ((mm4) obj2).y.e(((Number) obj).floatValue());
                return vs7;
            case 9:
                yb5 yb5 = (yb5) obj;
                NautaTileService.b((NautaTileService) obj2, ((Boolean) yb5.w).booleanValue(), (String) yb5.x);
                return vs7;
            case 10:
                int intValue = ((Number) obj).intValue();
                String[] strArr = d36.a;
                ((vr2) ((aq4) obj2).getValue()).y(new Integer(intValue));
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                df3 df3 = (df3) obj;
                bd5 bd5 = (bd5) obj2;
                if ((df3 instanceof eo5) || (df3 instanceof dk2)) {
                    bd5.e(bd5.d() + 1);
                } else if ((df3 instanceof fo5) || (df3 instanceof ek2) || (df3 instanceof do5)) {
                    bd5.e(bd5.d() - 1);
                }
                return vs7;
            case 12:
                SessionData sessionData = (SessionData) obj;
                es6 es6 = (es6) obj2;
                sessionData.getClass();
                es6.h = sessionData;
                if (es6.j) {
                    es6.j = false;
                    es6.c();
                }
                Object a = es6.a(es6, sessionData.getSessionDetails().getSessionId(), bs6.w, f612);
                if (a == p81) {
                    return a;
                }
                return vs7;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                SpeedOverlayService speedOverlayService = (SpeedOverlayService) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    d37 d372 = SpeedOverlayService.K;
                    vx0 vx0 = speedOverlayService.D;
                    if (vx0 != null) {
                        try {
                            WindowManager windowManager2 = speedOverlayService.A;
                            if (windowManager2 != null) {
                                windowManager2.removeView(vx0);
                            }
                        } catch (Throwable unused) {
                        }
                        speedOverlayService.D = null;
                        ci0 ci0 = speedOverlayService.E;
                        if (ci0 != null) {
                            w54 w54 = ci0.x;
                            w54.f1(j54.ON_PAUSE);
                            w54.f1(j54.ON_STOP);
                            w54.f1(j54.ON_DESTROY);
                        }
                        speedOverlayService.E = null;
                    }
                } else if (speedOverlayService.D == null && (windowManager = speedOverlayService.A) != null) {
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, speedOverlayService.F, 56, -3);
                    layoutParams.gravity = 81;
                    layoutParams.y = (int) (32.0f * speedOverlayService.getResources().getDisplayMetrics().density);
                    ci0 ci02 = new ci0(1);
                    ci02.y.G((Bundle) null);
                    j54 j54 = j54.ON_CREATE;
                    w54 w542 = ci02.x;
                    w542.f1(j54);
                    w542.f1(j54.ON_START);
                    w542.f1(j54.ON_RESUME);
                    speedOverlayService.E = ci02;
                    vx0 vx02 = new vx0(speedOverlayService);
                    vx02.setTag(R.id.view_tree_lifecycle_owner, ci02);
                    vx02.setTag(R.id.view_tree_saved_state_registry_owner, ci02);
                    vx02.setContent(t49.c);
                    windowManager.addView(vx02, layoutParams);
                    speedOverlayService.D = vx02;
                }
                return vs7;
            case 14:
                String str2 = (String) obj;
                d37 d373 = ((t17) obj2).c;
                do {
                    value2 = d373.getValue();
                } while (!d373.i(value2, new is7(6, e17.a((e17) ((is7) value2).a, (List) null, (r11) null, (String) null, str2, false, (hv2) null, 55))));
                return vs7;
            case h75.g:
                u97 u97 = (u97) obj;
                hr2 hr2 = yh7.a;
                Objects.toString(u97);
                hr2.getClass();
                hr2.m(new Object[0]);
                SyncWorker syncWorker = (SyncWorker) obj2;
                return syncWorker.e(syncWorker.f(u97.a, u97.b), f612);
            default:
                UserDataPreferences userDataPreferences = (UserDataPreferences) obj;
                UssdAutoUpdaterService ussdAutoUpdaterService = (UssdAutoUpdaterService) obj2;
                if (!userDataPreferences.getUssdAutoEnabled()) {
                    yh7.a.getClass();
                    hr2.m(new Object[0]);
                    ussdAutoUpdaterService.stopSelf();
                } else {
                    boolean ussdAutoPeriodicEnabled = userDataPreferences.getUssdAutoPeriodicEnabled();
                    int ussdAutoIntervalMinutes = userDataPreferences.getUssdAutoIntervalMinutes();
                    h27 h27 = ussdAutoUpdaterService.E;
                    if (h27 != null) {
                        h27.o((CancellationException) null);
                    }
                    if (ussdAutoPeriodicEnabled) {
                        if (ussdAutoIntervalMinutes < 30) {
                            ussdAutoIntervalMinutes = 30;
                        }
                        long j = ((long) ussdAutoIntervalMinutes) * 60000;
                        ig0 ig0 = ussdAutoUpdaterService.C;
                        if (ig0 != null) {
                            ussdAutoUpdaterService.E = ar7.H(ig0, (e81) null, (r81) null, new o94(j, (f61) null, ussdAutoUpdaterService), 3);
                        } else {
                            sg3.a0("scope");
                            throw null;
                        }
                    }
                    ussdAutoUpdaterService.j(userDataPreferences, (String) null);
                }
                return vs7;
        }
    }
}
