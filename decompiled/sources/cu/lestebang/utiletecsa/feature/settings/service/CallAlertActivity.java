package cu.lestebang.utiletecsa.feature.settings.service;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcu/lestebang/utiletecsa/feature/settings/service/CallAlertActivity;", "Lrv0;", "<init>", "()V", "", "isRinging", "settings"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
/* loaded from: classes.dex */
public final class CallAlertActivity extends rv0 {
    public static WeakReference R;

    @Override // defpackage.rv0, defpackage.qv0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        R = new WeakReference(this);
        if (Build.VERSION.SDK_INT >= 27) {
            setShowWhenLocked(true);
            setTurnScreenOn(true);
        } else {
            getWindow().addFlags(2621440);
        }
        getWindow().setLayout(-1, -2);
        getWindow().setGravity(80);
        getWindow().addFlags(32);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.y = 220;
        window.setAttributes(attributes);
        new l15(this).a.cancel(null, 202612);
        String stringExtra = getIntent().getStringExtra("caller_number");
        if (stringExtra == null) {
            stringExtra = "";
        }
        sv0.a(this, new fw0(-897113320, new ai0(stringExtra, getIntent().getStringExtra("contact_name"), getIntent().getBooleanExtra("is_revertida", false), this, 0), true));
        getWindow().getDecorView().postDelayed(new y0(6, this), 60000L);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        CallAlertActivity callAlertActivity;
        WeakReference weakReference = R;
        if (weakReference != null) {
            callAlertActivity = (CallAlertActivity) weakReference.get();
        } else {
            callAlertActivity = null;
        }
        if (callAlertActivity == this) {
            R = null;
        }
        super.onDestroy();
    }
}
