package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: q70  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q70 extends x21 {
    public final to f = new to(1, this);
    public final /* synthetic */ int g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q70(Context context, qd8 qd8, int i) {
        super(context, qd8);
        this.g = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (r9.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L_0x0046;
     */
    public final Object a() {
        int i = this.g;
        Context context = this.b;
        boolean z = true;
        switch (i) {
            case b85.b:
                Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver == null) {
                    bc4.k().h(r70.a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra = registerReceiver.getIntExtra("status", -1);
                if (!(intExtra == 2 || intExtra == 5)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                Intent registerReceiver2 = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver2 == null) {
                    bc4.k().h(s70.a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra2 = registerReceiver2.getIntExtra("status", -1);
                float intExtra3 = ((float) registerReceiver2.getIntExtra("level", -1)) / ((float) registerReceiver2.getIntExtra("scale", -1));
                if (intExtra2 != 1 && intExtra3 <= 0.15f) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                Intent registerReceiver3 = context.registerReceiver((BroadcastReceiver) null, e());
                if (!(registerReceiver3 == null || registerReceiver3.getAction() == null)) {
                    String action = registerReceiver3.getAction();
                    if (action != null) {
                        int hashCode = action.hashCode();
                        if (hashCode != -1181163412) {
                            if (hashCode == -730838620) {
                                break;
                            }
                        } else {
                            boolean equals = action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    public final void c() {
        bc4.k().e(jc0.a, getClass().getSimpleName().concat(": registering receiver"));
        this.b.registerReceiver(this.f, e());
    }

    public final void d() {
        bc4.k().e(jc0.a, getClass().getSimpleName().concat(": unregistering receiver"));
        this.b.unregisterReceiver(this.f);
    }

    public final IntentFilter e() {
        switch (this.g) {
            case b85.b:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }
}
