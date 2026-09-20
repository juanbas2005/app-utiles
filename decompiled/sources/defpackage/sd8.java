package defpackage;

import java.util.ArrayList;

/* renamed from: sd8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class sd8 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ String x;

    public /* synthetic */ sd8(String str, int i) {
        this.w = i;
        this.x = str;
    }

    /* JADX WARNING: type inference failed for: r6v12, types: [java.lang.Object, zd8] */
    public final Object y(Object obj) {
        be8 be8;
        boolean z;
        String R;
        Integer num;
        Boolean bool;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        kd8 kd8;
        Integer num2;
        int k;
        int i = this.w;
        vs7 vs7 = vs7.a;
        String str = this.x;
        switch (i) {
            case b85.b:
                ua6 ua6 = (ua6) obj;
                ua6.getClass();
                ab6 k0 = ua6.k0("SELECT name FROM workname WHERE work_spec_id=?");
                try {
                    k0.F(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (k0.i0()) {
                        arrayList.add(k0.R(0));
                    }
                    return arrayList;
                } finally {
                    k0.close();
                }
            case 1:
                ua6 ua62 = (ua6) obj;
                ua62.getClass();
                ab6 k02 = ua62.k0("DELETE from WorkProgress where work_spec_id=?");
                try {
                    k02.F(1, str);
                    k02.i0();
                    return vs7;
                } finally {
                    k02.close();
                }
            case 2:
                ua6 ua63 = (ua6) obj;
                ua63.getClass();
                ab6 k03 = ua63.k0("SELECT * FROM workspec WHERE id=?");
                try {
                    k03.F(1, str);
                    int n = u55.n(k03, "id");
                    int n2 = u55.n(k03, "state");
                    int n3 = u55.n(k03, "worker_class_name");
                    int n4 = u55.n(k03, "input_merger_class_name");
                    int n5 = u55.n(k03, "input");
                    int n6 = u55.n(k03, "output");
                    int n7 = u55.n(k03, "initial_delay");
                    int n8 = u55.n(k03, "interval_duration");
                    int n9 = u55.n(k03, "flex_duration");
                    int n10 = u55.n(k03, "run_attempt_count");
                    int n11 = u55.n(k03, "backoff_policy");
                    int n12 = u55.n(k03, "backoff_delay_duration");
                    int n13 = u55.n(k03, "last_enqueue_time");
                    int n14 = u55.n(k03, "minimum_retention_duration");
                    int n15 = u55.n(k03, "schedule_requested_at");
                    int n16 = u55.n(k03, "run_in_foreground");
                    int n17 = u55.n(k03, "out_of_quota_policy");
                    int n18 = u55.n(k03, "period_count");
                    int n19 = u55.n(k03, "generation");
                    int n20 = u55.n(k03, "next_schedule_time_override");
                    int n21 = u55.n(k03, "next_schedule_time_override_generation");
                    int n22 = u55.n(k03, "stop_reason");
                    int n23 = u55.n(k03, "trace_tag");
                    int n24 = u55.n(k03, "backoff_on_system_interruptions");
                    int n25 = u55.n(k03, "required_network_type");
                    int n26 = u55.n(k03, "required_network_request");
                    int n27 = u55.n(k03, "requires_charging");
                    int n28 = u55.n(k03, "requires_device_idle");
                    int n29 = u55.n(k03, "requires_battery_not_low");
                    int n30 = u55.n(k03, "requires_storage_not_low");
                    int n31 = u55.n(k03, "trigger_content_update_delay");
                    int n32 = u55.n(k03, "trigger_max_content_delay");
                    int n33 = u55.n(k03, "content_uri_triggers");
                    if (k03.i0()) {
                        String R2 = k03.R(n);
                        int i2 = n14;
                        kd8 v = i95.v((int) k03.getLong(n2));
                        String R3 = k03.R(n3);
                        String R4 = k03.R(n4);
                        byte[] blob = k03.getBlob(n5);
                        ce1 ce1 = ce1.b;
                        ce1 D = r16.D(blob);
                        ce1 D2 = r16.D(k03.getBlob(n6));
                        long j = k03.getLong(n7);
                        long j2 = k03.getLong(n8);
                        long j3 = k03.getLong(n9);
                        int i3 = (int) k03.getLong(n10);
                        d40 s = i95.s((int) k03.getLong(n11));
                        long j4 = k03.getLong(n12);
                        long j5 = k03.getLong(n13);
                        long j6 = k03.getLong(i2);
                        long j7 = k03.getLong(n15);
                        if (((int) k03.getLong(n16)) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        g85 u = i95.u((int) k03.getLong(n17));
                        int i4 = (int) k03.getLong(n18);
                        int i5 = (int) k03.getLong(n19);
                        long j8 = k03.getLong(n20);
                        int i6 = (int) k03.getLong(n21);
                        int i7 = (int) k03.getLong(n22);
                        int i8 = n23;
                        if (k03.isNull(i8)) {
                            R = null;
                        } else {
                            R = k03.R(i8);
                        }
                        int i9 = n24;
                        if (k03.isNull(i9)) {
                            num = null;
                        } else {
                            num = Integer.valueOf((int) k03.getLong(i9));
                        }
                        if (num != null) {
                            if (num.intValue() != 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            bool = Boolean.valueOf(z6);
                        } else {
                            bool = null;
                        }
                        yy4 t = i95.t((int) k03.getLong(n25));
                        ny4 J = i95.J(k03.getBlob(n26));
                        if (((int) k03.getLong(n27)) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (((int) k03.getLong(n28)) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (((int) k03.getLong(n29)) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (((int) k03.getLong(n30)) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        be8 = new be8(R2, v, R3, R4, D, D2, j, j2, j3, new j31(J, t, z2, z3, z4, z5, k03.getLong(n31), k03.getLong(n32), i95.i(k03.getBlob(n33))), i3, s, j4, j5, j6, j7, z, u, i4, i5, j8, i6, i7, R, bool);
                    } else {
                        be8 = null;
                    }
                    k03.close();
                    return be8;
                } catch (Throwable th) {
                    k03.close();
                    throw th;
                }
            case 3:
                ua6 ua64 = (ua6) obj;
                ua64.getClass();
                ab6 k04 = ua64.k0("SELECT state FROM workspec WHERE id=?");
                try {
                    k04.F(1, str);
                    if (k04.i0()) {
                        if (k04.isNull(0)) {
                            num2 = null;
                        } else {
                            num2 = Integer.valueOf((int) k04.getLong(0));
                        }
                        if (num2 != null) {
                            kd8 = i95.v(num2.intValue());
                            return kd8;
                        }
                    }
                    kd8 = null;
                    return kd8;
                } finally {
                    k04.close();
                }
            case 4:
                ua6 ua65 = (ua6) obj;
                ua65.getClass();
                ab6 k05 = ua65.k0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    k05.F(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (k05.i0()) {
                        arrayList2.add(k05.R(0));
                    }
                    return arrayList2;
                } finally {
                    k05.close();
                }
            case 5:
                ua6 ua66 = (ua6) obj;
                ua66.getClass();
                ab6 k06 = ua66.k0("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?");
                try {
                    k06.F(1, str);
                    k06.i0();
                    k = o55.k(ua66);
                    break;
                } finally {
                    k06.close();
                }
            case 6:
                ua6 ua67 = (ua6) obj;
                ua67.getClass();
                ab6 k07 = ua67.k0("UPDATE workspec SET run_attempt_count=0 WHERE id=?");
                try {
                    k07.F(1, str);
                    k07.i0();
                    k = o55.k(ua67);
                    break;
                } finally {
                    k07.close();
                }
            case 7:
                ua6 ua68 = (ua6) obj;
                ua68.getClass();
                ab6 k08 = ua68.k0("UPDATE workspec SET period_count=period_count+1 WHERE id=?");
                try {
                    k08.F(1, str);
                    k08.i0();
                    return vs7;
                } finally {
                    k08.close();
                }
            case 8:
                ua6 ua69 = (ua6) obj;
                ua69.getClass();
                ab6 k09 = ua69.k0("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                try {
                    k09.F(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (k09.i0()) {
                        byte[] blob2 = k09.getBlob(0);
                        ce1 ce12 = ce1.b;
                        arrayList3.add(r16.D(blob2));
                    }
                    return arrayList3;
                } finally {
                    k09.close();
                }
            case 9:
                ua6 ua610 = (ua6) obj;
                ua610.getClass();
                ab6 k010 = ua610.k0("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?");
                try {
                    k010.F(1, str);
                    k010.i0();
                    k = o55.k(ua610);
                    break;
                } finally {
                    k010.close();
                }
            case 10:
                ua6 ua611 = (ua6) obj;
                ua611.getClass();
                ab6 k011 = ua611.k0("DELETE FROM workspec WHERE id=?");
                try {
                    k011.F(1, str);
                    k011.i0();
                    return vs7;
                } finally {
                    k011.close();
                }
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                ua6 ua612 = (ua6) obj;
                ua612.getClass();
                ab6 k012 = ua612.k0("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    k012.F(1, str);
                    ArrayList arrayList4 = new ArrayList();
                    while (k012.i0()) {
                        String R5 = k012.R(0);
                        kd8 v2 = i95.v((int) k012.getLong(1));
                        R5.getClass();
                        ? obj2 = new Object();
                        obj2.a = R5;
                        obj2.b = v2;
                        arrayList4.add(obj2);
                    }
                    return arrayList4;
                } finally {
                    k012.close();
                }
            case 12:
                ua6 ua613 = (ua6) obj;
                ua613.getClass();
                ab6 k013 = ua613.k0("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                try {
                    k013.F(1, str);
                    ArrayList arrayList5 = new ArrayList();
                    while (k013.i0()) {
                        arrayList5.add(k013.R(0));
                    }
                    return arrayList5;
                } finally {
                    k013.close();
                }
            default:
                ua6 ua614 = (ua6) obj;
                ua614.getClass();
                ab6 k014 = ua614.k0("DELETE FROM worktag WHERE work_spec_id=?");
                try {
                    k014.F(1, str);
                    k014.i0();
                    return vs7;
                } finally {
                    k014.close();
                }
        }
        return Integer.valueOf(k);
    }
}
