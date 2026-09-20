package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: na7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class na7 implements jg6 {
    public static final String B = bc4.p("SystemJobScheduler");
    public final f01 A;
    public final Context w;
    public final JobScheduler x;
    public final ma7 y;
    public final WorkDatabase z;

    public na7(Context context, WorkDatabase workDatabase, f01 f01) {
        JobScheduler a = hl3.a(context);
        ma7 ma7 = new ma7(context, f01.d, f01.l);
        this.w = context;
        this.x = a;
        this.y = ma7;
        this.z = workDatabase;
        this.A = f01;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            bc4.k().i(B, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i)}), th);
        }
    }

    public static ArrayList b(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        String str = hl3.a;
        jobScheduler.getClass();
        try {
            list = jobScheduler.getAllPendingJobs();
            list.getClass();
        } catch (Throwable th) {
            bc4.k().i(hl3.a, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static id8 f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new id8(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public final boolean c() {
        return true;
    }

    public final void d(String str) {
        ArrayList<Integer> arrayList;
        Context context = this.w;
        JobScheduler jobScheduler = this.x;
        ArrayList b = b(context, jobScheduler);
        if (b == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            Iterator it = b.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                id8 f = f(jobInfo);
                if (f != null && str.equals(f.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            for (Integer intValue : arrayList) {
                a(jobScheduler, intValue.intValue());
            }
            ja7 t = this.z.t();
            t.getClass();
            str.getClass();
            sg3.O(t.a, false, true, new cb(str, 23));
        }
    }

    public final void e(be8... be8Arr) {
        int i;
        be8[] be8Arr2 = be8Arr;
        f01 f01 = this.A;
        WorkDatabase workDatabase = this.z;
        ji8 ji8 = new ji8(workDatabase);
        int length = be8Arr2.length;
        boolean z2 = false;
        int i2 = 0;
        while (i2 < length) {
            be8 be8 = be8Arr2[i2];
            workDatabase.b();
            try {
                fe8 w2 = workDatabase.w();
                String str = be8.a;
                be8 e = w2.e(str);
                String str2 = B;
                if (e == null) {
                    bc4.k().q(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.p();
                } else if (e.b != kd8.w) {
                    bc4.k().q(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.p();
                } else {
                    id8 h = z85.h(be8);
                    int i3 = h.b;
                    String str3 = h.a;
                    ja7 t = workDatabase.t();
                    t.getClass();
                    str3.getClass();
                    ga7 ga7 = (ga7) sg3.O(t.a, true, z2, new ia7(i3, z2 ? 1 : 0, str3));
                    if (ga7 != null) {
                        i = ga7.c;
                    } else {
                        f01.getClass();
                        int i4 = f01.i;
                        WorkDatabase workDatabase2 = (WorkDatabase) ji8.x;
                        e83 e83 = new e83(ji8, i4);
                        workDatabase2.getClass();
                        Object o = workDatabase2.o(new hx4(12, e83));
                        o.getClass();
                        i = ((Number) o).intValue();
                    }
                    if (ga7 == null) {
                        ga7 ga72 = new ga7(i3, i, str3);
                        ja7 t2 = workDatabase.t();
                        t2.getClass();
                        a96 a96 = t2.a;
                        k77 k77 = new k77(1, (Object) t2, (Object) ga72);
                        z2 = false;
                        sg3.O(a96, false, true, k77);
                    } else {
                        z2 = false;
                    }
                    g(be8, i);
                    workDatabase.p();
                }
                i2++;
            } finally {
                workDatabase.f();
            }
        }
    }

    public final void g(be8 be8, int i) {
        boolean z2;
        boolean z3;
        Context context;
        int i2;
        String str;
        JobScheduler a;
        String str2;
        List<JobInfo> list;
        int i3;
        String str3;
        int i4;
        String str4;
        int i5;
        int i6;
        be8 be82 = be8;
        int i7 = i;
        ma7 ma7 = this.y;
        ma7.getClass();
        j31 j31 = be82.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str5 = be82.a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str5);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", be82.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", be82.c());
        JobInfo.Builder builder = new JobInfo.Builder(i7, ma7.a);
        boolean z4 = j31.c;
        Set<i31> set = j31.i;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z4);
        boolean z5 = j31.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z5).setExtras(persistableBundle);
        NetworkRequest a2 = j31.a();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 28 || a2 == null) {
            yy4 yy4 = j31.a;
            if (i8 < 30 || yy4 != yy4.B) {
                int ordinal = yy4.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        i6 = 2;
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                i6 = 4;
                                if (ordinal != 4 || i8 < 26) {
                                    bc4.k().e(ma7.d, "API version too low. Cannot convert network type value " + yy4);
                                }
                            } else {
                                i6 = 3;
                            }
                        }
                    }
                    i6 = 1;
                } else {
                    i6 = 0;
                }
                extras.setRequiredNetworkType(i6);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            extras.getClass();
            extras.setRequiredNetwork(a2);
        }
        if (!z5) {
            if (be82.l == d40.x) {
                i5 = 0;
            } else {
                i5 = 1;
            }
            extras.setBackoffCriteria(be82.m, i5);
        }
        long a3 = be82.a();
        ma7.b.getClass();
        long max = Math.max(a3 - System.currentTimeMillis(), 0);
        if (i8 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!be82.q && ma7.c) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (i31 i31 : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(i31.a, i31.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(j31.g);
            extras.setTriggerContentMaxDelay(j31.h);
        }
        extras.setPersisted(false);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26) {
            extras.setRequiresBatteryNotLow(j31.e);
            extras.setRequiresStorageNotLow(j31.f);
        }
        if (be82.k > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (max > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i9 >= 31 && be82.q && !z2 && !z3) {
            extras.setExpedited(true);
        }
        if (i9 >= 35 && (str4 = be82.x) != null) {
            extras.setTraceTag(str4);
        }
        JobInfo build = extras.build();
        String str6 = B;
        bc4.k().e(str6, "Scheduling work ID " + str5 + "Job ID " + i7);
        try {
            if (this.x.schedule(build) == 0) {
                bc4.k().q(str6, "Unable to schedule work ID " + str5);
                if (be82.q && be82.r == g85.w) {
                    be82.q = false;
                    bc4.k().e(str6, "Scheduling a non-expedited job (work ID " + str5 + ")");
                    g(be8, i);
                    return;
                }
                return;
            }
            return;
        } catch (IllegalStateException e) {
            IllegalStateException illegalStateException = e;
            String str7 = hl3.a;
            context = this.w;
            context.getClass();
            WorkDatabase workDatabase = this.z;
            workDatabase.getClass();
            f01 f01 = this.A;
            f01.getClass();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                i2 = 150;
            } else {
                i2 = 100;
            }
            int size = ((List) sg3.O(workDatabase.w().a, true, false, new rb8(3))).size();
            str = "<faulty JobScheduler failed to getPendingJobs>";
            if (i10 >= 34) {
                a = hl3.a(context);
                str2 = null;
                list = a.getAllPendingJobs();
                list.getClass();
            } else {
                ArrayList b = b(context, hl3.a(context));
                if (b != null) {
                    str = b.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sb = new StringBuilder("JobScheduler ");
            sb.append(i2);
            sb.append(" job limit exceeded.\nIn JobScheduler there are ");
            sb.append(str);
            sb.append(".\nThere are ");
            sb.append(size);
            sb.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            String j = f21.j(sb, f01.k, '.');
            bc4.k().h(str6, j);
            throw new IllegalStateException(j, illegalStateException);
        } catch (Throwable th) {
            bc4.k().i(hl3.a, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list != null) {
            ArrayList b2 = b(context, a);
            if (b2 != null) {
                i3 = list.size() - b2.size();
            } else {
                i3 = 0;
            }
            if (i3 == 0) {
                str3 = null;
            } else {
                str3 = i3 + " of which are not owned by WorkManager";
            }
            Object systemService = context.getSystemService("jobscheduler");
            systemService.getClass();
            ArrayList b3 = b(context, (JobScheduler) systemService);
            if (b3 != null) {
                i4 = b3.size();
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                str2 = i4 + " from WorkManager in the default namespace";
            }
            str = dt0.E0(qs.V0(new String[]{list.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str3, str2}), ",\n", (String) null, (String) null, (vr2) null, 62);
        }
        StringBuilder sb2 = new StringBuilder("JobScheduler ");
        sb2.append(i2);
        sb2.append(" job limit exceeded.\nIn JobScheduler there are ");
        sb2.append(str);
        sb2.append(".\nThere are ");
        sb2.append(size);
        sb2.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
        String j2 = f21.j(sb2, f01.k, '.');
        bc4.k().h(str6, j2);
        throw new IllegalStateException(j2, illegalStateException);
    }
}
