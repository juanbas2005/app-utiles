package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkerStoppedException;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: lp5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lp5 {
    public static final String l = bc4.p("Processor");
    public PowerManager.WakeLock a = null;
    public final Context b;
    public final f01 c;
    public final qd8 d;
    public final WorkDatabase e;
    public final HashMap f = new HashMap();
    public final HashMap g = new HashMap();
    public final HashMap h = new HashMap();
    public final HashSet i = new HashSet();
    public final ArrayList j = new ArrayList();
    public final Object k = new Object();

    public lp5(Context context, f01 f01, qd8 qd8, WorkDatabase workDatabase) {
        this.b = context;
        this.c = f01;
        this.d = qd8;
        this.e = workDatabase;
    }

    public static boolean d(String str, re8 re8, int i2) {
        String str2 = l;
        if (re8 != null) {
            re8.m.i(new WorkerStoppedException(i2));
            bc4 k2 = bc4.k();
            k2.e(str2, "WorkerWrapper interrupted for " + str);
            return true;
        }
        bc4 k3 = bc4.k();
        k3.e(str2, "WorkerWrapper could not be found for " + str);
        return false;
    }

    public final void a(b82 b82) {
        synchronized (this.k) {
            this.j.add(b82);
        }
    }

    public final re8 b(String str) {
        boolean z;
        re8 re8 = (re8) this.f.remove(str);
        if (re8 != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            re8 = (re8) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.k) {
                try {
                    if (this.f.isEmpty()) {
                        Context context = this.b;
                        String str2 = fa7.F;
                        Intent intent = new Intent(context, SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        this.b.startService(intent);
                        PowerManager.WakeLock wakeLock = this.a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.a = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return re8;
    }

    public final re8 c(String str) {
        re8 re8 = (re8) this.f.get(str);
        if (re8 == null) {
            return (re8) this.g.get(str);
        }
        return re8;
    }
}
