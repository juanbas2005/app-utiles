package defpackage;

import java.util.ArrayList;

/* renamed from: ah1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ah1 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    public /* synthetic */ ah1(s34 s34, int i) {
        this.w = 1;
        this.x = i;
    }

    public final Object y(Object obj) {
        vr2 vr2;
        ab6 ab6;
        boolean z;
        String R;
        int i;
        int i2;
        Integer num;
        Boolean bool;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3 = this.w;
        int i4 = this.x;
        switch (i3) {
            case b85.b /*0*/:
                ((Integer) obj).intValue();
                return Integer.valueOf(i4);
            case 1:
                r24 r24 = (r24) obj;
                ix6 h = j45.h();
                if (h != null) {
                    vr2 = h.e();
                } else {
                    vr2 = null;
                }
                j45.m(h, j45.j(h), vr2);
                int i5 = r24.a;
                if (i5 == -1) {
                    i5 = 2;
                }
                for (int i6 = 0; i6 < i5; i6++) {
                    r24.a(i4 + i6);
                }
                return vs7.a;
            default:
                ua6 ua6 = (ua6) obj;
                ua6.getClass();
                ab6 k0 = ua6.k0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
                try {
                    k0.f((long) i4, 1);
                    int n = u55.n(k0, "id");
                    int n2 = u55.n(k0, "state");
                    int n3 = u55.n(k0, "worker_class_name");
                    int n4 = u55.n(k0, "input_merger_class_name");
                    int n5 = u55.n(k0, "input");
                    int n6 = u55.n(k0, "output");
                    int n7 = u55.n(k0, "initial_delay");
                    int n8 = u55.n(k0, "interval_duration");
                    int n9 = u55.n(k0, "flex_duration");
                    int n10 = u55.n(k0, "run_attempt_count");
                    int n11 = u55.n(k0, "backoff_policy");
                    int n12 = u55.n(k0, "backoff_delay_duration");
                    int n13 = u55.n(k0, "last_enqueue_time");
                    int n14 = u55.n(k0, "minimum_retention_duration");
                    int n15 = u55.n(k0, "schedule_requested_at");
                    int n16 = u55.n(k0, "run_in_foreground");
                    int n17 = u55.n(k0, "out_of_quota_policy");
                    int n18 = u55.n(k0, "period_count");
                    int n19 = u55.n(k0, "generation");
                    int n20 = u55.n(k0, "next_schedule_time_override");
                    int n21 = u55.n(k0, "next_schedule_time_override_generation");
                    int n22 = u55.n(k0, "stop_reason");
                    int n23 = u55.n(k0, "trace_tag");
                    int n24 = u55.n(k0, "backoff_on_system_interruptions");
                    int n25 = u55.n(k0, "required_network_type");
                    int n26 = u55.n(k0, "required_network_request");
                    int n27 = u55.n(k0, "requires_charging");
                    int n28 = u55.n(k0, "requires_device_idle");
                    int n29 = u55.n(k0, "requires_battery_not_low");
                    int n30 = u55.n(k0, "requires_storage_not_low");
                    int n31 = u55.n(k0, "trigger_content_update_delay");
                    int n32 = u55.n(k0, "trigger_max_content_delay");
                    int n33 = u55.n(k0, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (k0.i0()) {
                        String R2 = k0.R(n);
                        ArrayList arrayList2 = arrayList;
                        int i7 = n;
                        kd8 v = i95.v((int) k0.getLong(n2));
                        String R3 = k0.R(n3);
                        String R4 = k0.R(n4);
                        byte[] blob = k0.getBlob(n5);
                        ce1 ce1 = ce1.b;
                        ce1 D = r16.D(blob);
                        ce1 D2 = r16.D(k0.getBlob(n6));
                        long j = k0.getLong(n7);
                        long j2 = k0.getLong(n8);
                        long j3 = k0.getLong(n9);
                        int i8 = (int) k0.getLong(n10);
                        d40 s = i95.s((int) k0.getLong(n11));
                        long j4 = k0.getLong(n12);
                        long j5 = k0.getLong(n13);
                        long j6 = k0.getLong(n14);
                        int i9 = n15;
                        long j7 = k0.getLong(i9);
                        int i10 = n14;
                        int i11 = n16;
                        int i12 = i9;
                        if (((int) k0.getLong(i11)) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        int i13 = n17;
                        int i14 = i11;
                        g85 u = i95.u((int) k0.getLong(i13));
                        int i15 = n18;
                        int i16 = n2;
                        int i17 = i15;
                        int i18 = n19;
                        int i19 = i13;
                        int i20 = n20;
                        long j8 = k0.getLong(i20);
                        int i21 = n13;
                        int i22 = (int) k0.getLong(i18);
                        int i23 = n21;
                        int i24 = i20;
                        int i25 = (int) k0.getLong(i23);
                        int i26 = (int) k0.getLong(i15);
                        int i27 = n22;
                        int i28 = i18;
                        int i29 = (int) k0.getLong(i27);
                        int i30 = n23;
                        if (k0.isNull(i30)) {
                            R = null;
                        } else {
                            R = k0.R(i30);
                        }
                        int i31 = i23;
                        int i32 = n24;
                        if (k0.isNull(i32)) {
                            i = i25;
                            i2 = i27;
                            num = null;
                        } else {
                            i = i25;
                            i2 = i27;
                            num = Integer.valueOf((int) k0.getLong(i32));
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
                        int i33 = i29;
                        int i34 = n25;
                        yy4 t = i95.t((int) k0.getLong(i34));
                        int i35 = n26;
                        ny4 J = i95.J(k0.getBlob(i35));
                        n25 = i34;
                        n26 = i35;
                        int i36 = n27;
                        if (((int) k0.getLong(i36)) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        n27 = i36;
                        int i37 = n28;
                        if (((int) k0.getLong(i37)) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        int i38 = i30;
                        int i39 = n29;
                        if (((int) k0.getLong(i39)) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        int i40 = i37;
                        n29 = i39;
                        int i41 = n30;
                        if (((int) k0.getLong(i41)) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        int i42 = n31;
                        int i43 = n32;
                        int i44 = i32;
                        int i45 = n33;
                        n33 = i45;
                        be8 be8 = new be8(R2, v, R3, R4, D, D2, j, j2, j3, new j31(J, t, z2, z3, z4, z5, k0.getLong(i42), k0.getLong(i43), i95.i(k0.getBlob(i45))), i8, s, j4, j5, j6, j7, z, u, i26, i22, j8, i, i33, R, bool);
                        ab6 = k0;
                        ArrayList arrayList3 = arrayList2;
                        try {
                            arrayList3.add(be8);
                            n32 = i43;
                            n13 = i21;
                            n20 = i24;
                            n21 = i31;
                            n23 = i38;
                            arrayList = arrayList3;
                            n28 = i40;
                            n2 = i16;
                            k0 = ab6;
                            n18 = i17;
                            n31 = i42;
                            n14 = i10;
                            n15 = i12;
                            n16 = i14;
                            n17 = i19;
                            n19 = i28;
                            n22 = i2;
                            n24 = i44;
                            n30 = i41;
                            n = i7;
                        } catch (Throwable th) {
                            th = th;
                            ab6.close();
                            throw th;
                        }
                    }
                    ab6 ab62 = k0;
                    ArrayList arrayList4 = arrayList;
                    ab62.close();
                    return arrayList4;
                } catch (Throwable th2) {
                    th = th2;
                    ab6 = k0;
                    ab6.close();
                    throw th;
                }
        }
    }

    public /* synthetic */ ah1(int i, int i2) {
        this.w = i2;
        this.x = i;
    }
}
