package cu.lestebang.utiletecsa.widget;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SubscriptionManager;
import kotlin.Metadata;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu/lestebang/utiletecsa/widget/ApnSettingsActivity;", "Lrv0;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
/* loaded from: classes.dex */
public final class ApnSettingsActivity extends rv0 {
    @Override // defpackage.rv0, defpackage.qv0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        Object m66Var;
        Object m66Var2;
        Object m66Var3;
        Object m66Var4;
        super.onCreate(bundle);
        try {
            i = SubscriptionManager.getDefaultDataSubscriptionId();
        } catch (Exception unused) {
            i = -1;
        }
        Object obj = vs7.a;
        if (i != -1) {
            Intent intent = new Intent("android.settings.APN_SETTINGS");
            intent.putExtra("sub_id", i);
            intent.putExtra("android.provider.extra.SUB_ID", i);
            try {
                startActivity(intent);
                m66Var4 = obj;
            } catch (Throwable th) {
                m66Var4 = new m66(th);
            }
            if (!(m66Var4 instanceof m66)) {
                finish();
                return;
            }
        }
        try {
            startActivity(new Intent("android.settings.APN_SETTINGS"));
            m66Var = obj;
        } catch (Throwable th2) {
            m66Var = new m66(th2);
        }
        if (!(m66Var instanceof m66)) {
            finish();
            return;
        }
        for (ComponentName componentName : sg3.E(new ComponentName("com.android.settings", "com.android.settings.Settings$ApnSettingsActivity"), new ComponentName("com.samsung.android.settings", "com.samsung.android.settings.network.ApnSettings"), new ComponentName("com.android.settings", "com.android.settings.Settings$ApnSettingsActivityOld"), new ComponentName("com.android.phone", "com.android.phone.Settings"), new ComponentName("com.android.phone", "com.android.phone.MobileNetworkSettings"))) {
            Intent component = new Intent("android.settings.APN_SETTINGS").setComponent(componentName);
            component.getClass();
            if (i != -1) {
                component.putExtra("sub_id", i);
                component.putExtra("android.provider.extra.SUB_ID", i);
            }
            try {
                startActivity(component);
                m66Var2 = obj;
            } catch (Throwable th3) {
                m66Var2 = new m66(th3);
            }
            if (!(m66Var2 instanceof m66)) {
                finish();
                return;
            }
            component.setAction("android.intent.action.MAIN");
            try {
                startActivity(component);
                m66Var3 = obj;
            } catch (Throwable th4) {
                m66Var3 = new m66(th4);
            }
            if (!(m66Var3 instanceof m66)) {
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
