package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.WindowManager;
import cu.lestebang.utiletecsa.R;

/* renamed from: di0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class di0 implements Runnable {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ Context w;
    public final /* synthetic */ o x;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    public /* synthetic */ di0(Context context, o oVar, String str, String str2, boolean z2) {
        this.w = context;
        this.x = oVar;
        this.y = str;
        this.z = str2;
        this.A = z2;
    }

    public final void run() {
        int i;
        Context applicationContext = this.w.getApplicationContext();
        if (Settings.canDrawOverlays(applicationContext) && ((Boolean) this.x.b()).booleanValue()) {
            fi0 fi0 = fi0.a;
            fi0.a();
            d37 d37 = fi0.d;
            Boolean bool = Boolean.TRUE;
            d37.getClass();
            d37.l((Object) null, bool);
            Object systemService = applicationContext.getSystemService("window");
            systemService.getClass();
            WindowManager windowManager = (WindowManager) systemService;
            fi0.e = windowManager;
            if (Build.VERSION.SDK_INT >= 26) {
                i = 2038;
            } else {
                i = 2002;
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -2, i, 40, -3);
            layoutParams.gravity = 80;
            layoutParams.y = 220;
            ci0 ci0 = new ci0(0);
            ci0.y.G((Bundle) null);
            j54 j54 = j54.ON_CREATE;
            w54 w54 = ci0.x;
            w54.f1(j54);
            w54.f1(j54.ON_START);
            w54.f1(j54.ON_RESUME);
            fi0.g = ci0;
            vx0 vx0 = new vx0(applicationContext);
            vx0.setTag(R.id.view_tree_lifecycle_owner, ci0);
            vx0.setTag(R.id.view_tree_saved_state_registry_owner, ci0);
            vx0.setContent(new fw0(-1947688835, new ei0(this.y, this.z, this.A, applicationContext, layoutParams, vx0, windowManager), true));
            fi0.f = vx0;
            try {
                windowManager.addView(vx0, layoutParams);
            } catch (Throwable unused) {
            }
            fi0.b.postDelayed(new ka(3), fi0.c, 60000);
        }
    }
}
