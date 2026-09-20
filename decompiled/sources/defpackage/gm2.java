package defpackage;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: gm2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gm2 implements Runnable {
    public static final String A = bc4.p("ForceStopRunnable");
    public static final long B = 315360000000L;
    public final Context w;
    public final nd8 x;
    public final br4 y;
    public int z = 0;

    public gm2(Context context, nd8 nd8) {
        this.w = context.getApplicationContext();
        this.x = nd8;
        this.y = nd8.g;
    }

    public static void c(Context context) {
        int i;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (Build.VERSION.SDK_INT >= 31) {
            i = 167772160;
        } else {
            i = 134217728;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + B;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:99:0x020b  */
    public final void a() {
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        long j;
        br4 br4 = this.y;
        nd8 nd8 = this.x;
        WorkDatabase workDatabase = nd8.c;
        f01 f01 = nd8.b;
        br4 br42 = nd8.g;
        WorkDatabase workDatabase2 = nd8.c;
        String str = na7.B;
        Context context = this.w;
        JobScheduler a = hl3.a(context);
        ArrayList b = na7.b(context, a);
        List<String> list = (List) sg3.O(workDatabase.t().a, true, false, new ha7(0));
        if (b != null) {
            i = b.size();
        } else {
            i = 0;
        }
        HashSet hashSet = new HashSet(i);
        if (b != null && !b.isEmpty()) {
            Iterator it = b.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                id8 f = na7.f(jobInfo);
                if (f != null) {
                    hashSet.add(f.a);
                } else {
                    na7.a(a, jobInfo.getId());
                }
            }
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (!hashSet.contains((String) it2.next())) {
                    bc4.k().e(na7.B, "Reconciling jobs");
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z2) {
            workDatabase.b();
            try {
                fe8 w2 = workDatabase.w();
                for (String g : list) {
                    w2.g(-1, g);
                }
                workDatabase.p();
                workDatabase.f();
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        fe8 w3 = workDatabase2.w();
        ud8 v = workDatabase2.v();
        workDatabase2.b();
        try {
            List<be8> list2 = (List) sg3.O(w3.a, true, false, new rb8(4));
            if (list2 == null || list2.isEmpty()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                for (be8 be8 : list2) {
                    kd8 kd8 = kd8.w;
                    String str2 = be8.a;
                    w3.j(kd8, str2);
                    w3.k(-512, str2);
                    w3.g(-1, str2);
                }
            }
            sg3.O(v.a, false, true, new rb8(2));
            workDatabase2.p();
            workDatabase2.f();
            if (z3 || z2) {
                z4 = true;
            } else {
                z4 = false;
            }
            Long a2 = ((WorkDatabase) br42.x).s().a("reschedule_needed");
            String str3 = A;
            if (a2 == null || a2.longValue() != 1) {
                try {
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        i2 = 570425344;
                    } else {
                        i2 = 536870912;
                    }
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName(context, ForceStopRunnable$BroadcastReceiver.class));
                    intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                    PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i2);
                    if (i3 >= 30) {
                        if (broadcast != null) {
                            broadcast.cancel();
                        }
                        List n = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons((String) null, 0, 0);
                        if (n != null && !n.isEmpty()) {
                            Long a3 = ((WorkDatabase) br4.x).s().a("last_force_stop_ms");
                            if (a3 != null) {
                                j = a3.longValue();
                            } else {
                                j = 0;
                            }
                            int i4 = 0;
                            while (i4 < n.size()) {
                                ApplicationExitInfo f2 = t4.f(n.get(i4));
                                if (f2.getReason() != 10 || f2.getTimestamp() < j) {
                                    i4++;
                                } else {
                                    bc4.k().e(str3, "Application was force-stopped, rescheduling.");
                                    nd8.f();
                                    f01.d.getClass();
                                    long currentTimeMillis = System.currentTimeMillis();
                                    br4.getClass();
                                    dn5 dn5 = new dn5("last_force_stop_ms", Long.valueOf(currentTimeMillis));
                                    en5 s = ((WorkDatabase) br4.x).s();
                                    sg3.O(s.a, false, true, new w34(18, s, dn5));
                                }
                            }
                        }
                    } else if (broadcast == null) {
                        c(context);
                        bc4.k().e(str3, "Application was force-stopped, rescheduling.");
                        nd8.f();
                        f01.d.getClass();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        br4.getClass();
                        dn5 dn52 = new dn5("last_force_stop_ms", Long.valueOf(currentTimeMillis2));
                        en5 s2 = ((WorkDatabase) br4.x).s();
                        sg3.O(s2.a, false, true, new w34(18, s2, dn52));
                    }
                    if (z4) {
                        bc4.k().e(str3, "Found unfinished work, scheduling it.");
                        mg6.b(f01, workDatabase2, nd8.e);
                    }
                } catch (SecurityException e) {
                    e = e;
                    if (bc4.k().x <= 5) {
                        Log.w(str3, "Ignoring exception", e);
                    }
                    bc4.k().e(str3, "Application was force-stopped, rescheduling.");
                    nd8.f();
                    f01.d.getClass();
                    long currentTimeMillis22 = System.currentTimeMillis();
                    br4.getClass();
                    dn5 dn522 = new dn5("last_force_stop_ms", Long.valueOf(currentTimeMillis22));
                    en5 s22 = ((WorkDatabase) br4.x).s();
                    sg3.O(s22.a, false, true, new w34(18, s22, dn522));
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    if (bc4.k().x <= 5) {
                    }
                    bc4.k().e(str3, "Application was force-stopped, rescheduling.");
                    nd8.f();
                    f01.d.getClass();
                    long currentTimeMillis222 = System.currentTimeMillis();
                    br4.getClass();
                    dn5 dn5222 = new dn5("last_force_stop_ms", Long.valueOf(currentTimeMillis222));
                    en5 s222 = ((WorkDatabase) br4.x).s();
                    sg3.O(s222.a, false, true, new w34(18, s222, dn5222));
                }
            } else {
                bc4.k().e(str3, "Rescheduling Workers.");
                nd8.f();
                br42.getClass();
                dn5 dn53 = new dn5("reschedule_needed", 0L);
                en5 s3 = ((WorkDatabase) br42.x).s();
                sg3.O(s3.a, false, true, new w34(18, s3, dn53));
            }
        } catch (Throwable th2) {
            workDatabase2.f();
            throw th2;
        }
    }

    public final boolean b() {
        f01 f01 = this.x.b;
        f01.getClass();
        boolean isEmpty = TextUtils.isEmpty((CharSequence) null);
        String str = A;
        if (isEmpty) {
            bc4.k().e(str, "The default process name was not specified.");
            return true;
        }
        boolean a = kp5.a(this.w, f01);
        bc4 k = bc4.k();
        k.e(str, "Is default app process = " + a);
        return a;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:6|7|8|9|10|11|37|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0010 */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0010 A[LOOP:0: B:6:0x0010->B:36:0x0010, LOOP_START, SYNTHETIC, Splitter:B:6:0x0010] */
    public final void run() {
        String str;
        Context context = this.w;
        String str2 = A;
        nd8 nd8 = this.x;
        try {
            if (!b()) {
                nd8.e();
                return;
            }
            while (true) {
                n85.l(context);
                bc4.k().e(str2, "Performing cleanup operations.");
                a();
                nd8.e();
                return;
            }
        } catch (SQLiteException e) {
            bc4.k().h(str2, "Unexpected SQLite exception during migrations");
            IllegalStateException illegalStateException = new IllegalStateException("Unexpected SQLite exception during migrations", e);
            nd8.b.getClass();
            throw illegalStateException;
        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e2) {
            int i = this.z + 1;
            this.z = i;
            if (i >= 3) {
                if (i75.h(context)) {
                    str = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.";
                } else {
                    str = "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                }
                bc4.k().i(str2, str, e2);
                IllegalStateException illegalStateException2 = new IllegalStateException(str, e2);
                nd8.b.getClass();
                throw illegalStateException2;
            }
            bc4 k = bc4.k();
            k.g(str2, "Retrying after " + (((long) i) * 300), e2);
            Thread.sleep(((long) this.z) * 300);
        } catch (Throwable th) {
            nd8.e();
            throw th;
        }
    }
}
