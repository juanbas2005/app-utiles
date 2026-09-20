package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* renamed from: to  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class to extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public final Object b;

    public to(y19 y19) {
        this.a = 3;
        this.b = y19;
    }

    public final void onReceive(Context context, Intent intent) {
        boolean z;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case b85.b:
                ((f1) obj).o();
                return;
            case 1:
                context.getClass();
                intent.getClass();
                q70 q70 = (q70) obj;
                switch (q70.g) {
                    case b85.b:
                        String action = intent.getAction();
                        if (action != null) {
                            bc4.k().e(r70.a, "Received ".concat(action));
                            switch (action.hashCode()) {
                                case -1886648615:
                                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        q70.b(Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                case -54942926:
                                    if (action.equals("android.os.action.DISCHARGING")) {
                                        q70.b(Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                case 948344062:
                                    if (action.equals("android.os.action.CHARGING")) {
                                        q70.b(Boolean.TRUE);
                                        return;
                                    }
                                    return;
                                case 1019184907:
                                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        q70.b(Boolean.TRUE);
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                        } else {
                            return;
                        }
                    case 1:
                        if (intent.getAction() != null) {
                            bc4 k = bc4.k();
                            String str = s70.a;
                            k.e(str, "Received " + intent.getAction());
                            String action2 = intent.getAction();
                            if (action2 != null) {
                                int hashCode = action2.hashCode();
                                if (hashCode != -1980154005) {
                                    if (hashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                        q70.b(Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                } else if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                    q70.b(Boolean.TRUE);
                                    return;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    default:
                        if (intent.getAction() != null) {
                            bc4 k2 = bc4.k();
                            String str2 = j47.a;
                            k2.e(str2, "Received " + intent.getAction());
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int hashCode2 = action3.hashCode();
                                if (hashCode2 != -1181163412) {
                                    if (hashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                        q70.b(Boolean.TRUE);
                                        return;
                                    }
                                    return;
                                } else if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    q70.b(Boolean.FALSE);
                                    return;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                }
            case 2:
                if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                    if (intent.getIntExtra("plugged", -1) <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ((Handler) ((n43) obj).e).post(new vb(2, this, z));
                    return;
                }
                return;
            default:
                y19 y19 = (y19) obj;
                if (intent == null) {
                    pz8 pz8 = y19.B;
                    y19.g(pz8);
                    pz8.E.a("App receiver called with null intent");
                    return;
                }
                String action4 = intent.getAction();
                if (action4 == null) {
                    pz8 pz82 = y19.B;
                    y19.g(pz82);
                    pz82.E.a("App receiver called with null action");
                    return;
                }
                int hashCode3 = action4.hashCode();
                if (hashCode3 != -1928239649) {
                    if (hashCode3 == 1279883384 && action4.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                        pz8 pz83 = y19.B;
                        y19.g(pz83);
                        pz83.J.a("[sgtm] App Receiver notified batches are available");
                        r19 r19 = y19.C;
                        y19.g(r19);
                        r19.l1(new m89(6, (Object) this));
                        return;
                    }
                } else if (action4.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                    wo8.a();
                    if (y19.z.n1((String) null, by8.P0)) {
                        pz8 pz84 = y19.B;
                        y19.g(pz84);
                        pz84.J.a("App receiver notified triggers are available");
                        r19 r192 = y19.C;
                        y19.g(r192);
                        r192.l1(new m89(7, (Object) y19));
                        return;
                    }
                    return;
                }
                pz8 pz85 = y19.B;
                y19.g(pz85);
                pz85.E.a("App receiver called with unknown action");
                return;
        }
    }

    public /* synthetic */ to(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
