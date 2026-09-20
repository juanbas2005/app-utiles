package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* renamed from: fa7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fa7 implements a55, b82 {
    public static final String F = bc4.p("SystemFgDispatcher");
    public final LinkedHashMap A;
    public final HashMap B;
    public final HashMap C;
    public final zy2 D;
    public SystemForegroundService E;
    public final nd8 w;
    public final qd8 x;
    public final Object y = new Object();
    public id8 z;

    public fa7(Context context) {
        nd8 c = nd8.c(context);
        this.w = c;
        this.x = c.d;
        this.z = null;
        this.A = new LinkedHashMap();
        this.C = new HashMap();
        this.B = new HashMap();
        this.D = new zy2(c.j);
        c.f.a(this);
    }

    public static Intent c(Context context, id8 id8, hm2 hm2) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", id8.a);
        intent.putExtra("KEY_GENERATION", id8.b);
        intent.putExtra("KEY_NOTIFICATION_ID", hm2.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hm2.b);
        intent.putExtra("KEY_NOTIFICATION", hm2.c);
        return intent;
    }

    public final void a(be8 be8, r31 r31) {
        if (r31 instanceof q31) {
            String str = be8.a;
            bc4 k = bc4.k();
            k.e(F, "Constraints unmet for WorkSpec " + str);
            id8 h = z85.h(be8);
            int i = ((q31) r31).a;
            nd8 nd8 = this.w;
            qd8 qd8 = nd8.d;
            qd8.a.execute(new a47(nd8.f, new v27(h), true, i));
        }
    }

    public final void b(id8 id8, boolean z2) {
        el3 el3;
        Map.Entry entry;
        synchronized (this.y) {
            try {
                if (((be8) this.B.remove(id8)) != null) {
                    el3 = (el3) this.C.remove(id8);
                } else {
                    el3 = null;
                }
                if (el3 != null) {
                    el3.o((CancellationException) null);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        hm2 hm2 = (hm2) this.A.remove(id8);
        if (id8.equals(this.z)) {
            if (this.A.size() > 0) {
                Iterator it = this.A.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    }
                    next = it.next();
                }
                this.z = (id8) entry.getKey();
                if (this.E != null) {
                    hm2 hm22 = (hm2) entry.getValue();
                    SystemForegroundService systemForegroundService = this.E;
                    int i = hm22.a;
                    int i2 = hm22.b;
                    Notification notification = hm22.c;
                    systemForegroundService.getClass();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        dn.q(systemForegroundService, i, notification, i2);
                    } else if (i3 >= 29) {
                        dn.p(systemForegroundService, i, notification, i2);
                    } else {
                        systemForegroundService.startForeground(i, notification);
                    }
                    this.E.z.cancel(hm22.a);
                }
            } else {
                this.z = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.E;
        if (hm2 != null && systemForegroundService2 != null) {
            bc4.k().e(F, "Removing Notification (id: " + hm2.a + ", workSpecId: " + id8 + ", notificationType: " + hm2.b);
            systemForegroundService2.z.cancel(hm2.a);
        }
    }

    public final void d(Intent intent) {
        if (this.E != null) {
            int i = 0;
            int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
            int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            id8 id8 = new id8(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
            Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
            bc4 k = bc4.k();
            k.e(F, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
            if (notification != null) {
                hm2 hm2 = new hm2(intExtra, notification, intExtra2);
                LinkedHashMap linkedHashMap = this.A;
                linkedHashMap.put(id8, hm2);
                hm2 hm22 = (hm2) linkedHashMap.get(this.z);
                if (hm22 == null) {
                    this.z = id8;
                } else {
                    this.E.z.notify(intExtra, notification);
                    if (Build.VERSION.SDK_INT >= 29) {
                        for (Map.Entry value : linkedHashMap.entrySet()) {
                            i |= ((hm2) value.getValue()).b;
                        }
                        hm2 = new hm2(hm22.a, hm22.c, i);
                    } else {
                        hm2 = hm22;
                    }
                }
                SystemForegroundService systemForegroundService = this.E;
                int i2 = hm2.a;
                int i3 = hm2.b;
                Notification notification2 = hm2.c;
                systemForegroundService.getClass();
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 31) {
                    dn.q(systemForegroundService, i2, notification2, i3);
                } else if (i4 >= 29) {
                    dn.p(systemForegroundService, i2, notification2, i3);
                } else {
                    systemForegroundService.startForeground(i2, notification2);
                }
            } else {
                h.q("Notification passed in the intent was null.");
            }
        } else {
            h.s("handleNotify was called on the destroyed dispatcher");
        }
    }

    public final void e() {
        this.E = null;
        synchronized (this.y) {
            try {
                for (el3 o : this.C.values()) {
                    o.o((CancellationException) null);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        lp5 lp5 = this.w.f;
        synchronized (lp5.k) {
            lp5.j.remove(this);
        }
    }

    public final void f(int i, int i2) {
        bc4 k = bc4.k();
        k.m(F, "Foreground service timed out, FGS type: " + i2);
        for (Map.Entry entry : this.A.entrySet()) {
            if (((hm2) entry.getValue()).b == i2) {
                nd8 nd8 = this.w;
                qd8 qd8 = nd8.d;
                qd8.a.execute(new a47(nd8.f, new v27((id8) entry.getKey()), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.E;
        if (systemForegroundService != null) {
            systemForegroundService.x = true;
            bc4.k().e(SystemForegroundService.A, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf(i);
        }
    }
}
