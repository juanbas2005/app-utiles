package defpackage;

import android.content.Intent;
import android.net.Uri;
import cu.lestebang.utiletecsa.feature.settings.service.CallAlertActivity;
import java.lang.ref.WeakReference;

/* renamed from: bi0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class bi0 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ CallAlertActivity x;
    public final /* synthetic */ String y;

    public /* synthetic */ bi0(CallAlertActivity callAlertActivity, String str, int i) {
        this.w = i;
        this.x = callAlertActivity;
        this.y = str;
    }

    public final Object b() {
        int i = this.w;
        vs7 vs7 = vs7.a;
        String str = this.y;
        CallAlertActivity callAlertActivity = this.x;
        switch (i) {
            case b85.b:
                WeakReference weakReference = CallAlertActivity.R;
                try {
                    callAlertActivity.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(str))).addFlags(268435456));
                } catch (Throwable unused) {
                }
                callAlertActivity.finish();
                return vs7;
            default:
                WeakReference weakReference2 = CallAlertActivity.R;
                try {
                    callAlertActivity.startActivity(new Intent("android.intent.action.SENDTO", Uri.parse("smsto:".concat(str))).addFlags(268435456));
                } catch (Throwable unused2) {
                }
                callAlertActivity.finish();
                return vs7;
        }
    }
}
