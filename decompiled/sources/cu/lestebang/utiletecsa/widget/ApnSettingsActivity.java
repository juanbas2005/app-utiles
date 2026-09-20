package cu.lestebang.utiletecsa.widget;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SubscriptionManager;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu/lestebang/utiletecsa/widget/ApnSettingsActivity;", "Lrv0;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ApnSettingsActivity extends rv0 {
    public final void onCreate(Bundle bundle) {
        int i;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        super.onCreate(bundle);
        try {
            i = SubscriptionManager.getDefaultDataSubscriptionId();
        } catch (Exception unused) {
            i = -1;
        }
        vs7 vs7 = vs7.a;
        if (i != -1) {
            Intent intent = new Intent("android.settings.APN_SETTINGS");
            intent.putExtra("sub_id", i);
            intent.putExtra("android.provider.extra.SUB_ID", i);
            try {
                startActivity(intent);
                obj4 = vs7;
            } catch (Throwable th) {
                obj4 = new m66(th);
            }
            if (!(obj4 instanceof m66)) {
                finish();
                return;
            }
        }
        try {
            startActivity(new Intent("android.settings.APN_SETTINGS"));
            obj = vs7;
        } catch (Throwable th2) {
            obj = new m66(th2);
        }
        if (!(obj instanceof m66)) {
            finish();
            return;
        }
        for (ComponentName component : sg3.E(new ComponentName("com.android.settings", "com.android.settings.Settings$ApnSettingsActivity"), new ComponentName("com.samsung.android.settings", "com.samsung.android.settings.network.ApnSettings"), new ComponentName("com.android.settings", "com.android.settings.Settings$ApnSettingsActivityOld"), new ComponentName("com.android.phone", "com.android.phone.Settings"), new ComponentName("com.android.phone", "com.android.phone.MobileNetworkSettings"))) {
            Intent component2 = new Intent("android.settings.APN_SETTINGS").setComponent(component);
            component2.getClass();
            if (i != -1) {
                component2.putExtra("sub_id", i);
                component2.putExtra("android.provider.extra.SUB_ID", i);
            }
            try {
                startActivity(component2);
                obj2 = vs7;
            } catch (Throwable th3) {
                obj2 = new m66(th3);
            }
            if (!(obj2 instanceof m66)) {
                finish();
                return;
            }
            component2.setAction("android.intent.action.MAIN");
            try {
                startActivity(component2);
                obj3 = vs7;
            } catch (Throwable th4) {
                obj3 = new m66(th4);
            }
            if (!(obj3 instanceof m66)) {
                finish();
                return;
            }
        }
        try {
            startActivity(new Intent("android.settings.WIRELESS_SETTINGS"));
        } catch (Throwable unused2) {
        }
        finish();
    }
}
