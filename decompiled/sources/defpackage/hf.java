package defpackage;

import java.util.ArrayList;

/* renamed from: hf  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class hf implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ long x;

    public /* synthetic */ hf(long j, int i) {
        this.w = i;
        this.x = j;
    }

    public final Object y(Object obj) {
        kk0 kk0;
        Object obj2;
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
        vs7 vs7 = vs7.a;
        long j = this.x;
        switch (i3) {
            case b85.b:
                ch0 ch0 = (ch0) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (ch0.w.e() >> 32)) / 2.0f;
                return ch0.a(new jf(intBitsToFloat, r16.w(ch0, intBitsToFloat), new u90(j, 5), 0));
            case 1:
                ic0 ic0 = (ic0) obj;
                vr2 vr2 = ic0.b;
                if (!(vr2 == null || (kk0 = ic0.a) == null)) {
                    try {
                        obj2 = vr2.y(Long.valueOf(j));
                    } catch (Throwable th) {
                        obj2 = new m66(th);
                    }
                    kk0.f(obj2);
                }
                return vs7;
            case 2:
                ((ok6) obj).f(vj6.a, new uj6(cy2.w, this.x, tj6.x, true));
                return vs7;
            case 3:
                ((pp4) obj).c(kz2.b, Long.valueOf(j));
                return null;
            case 4:
                wy3 wy3 = (wy3) obj;
                wy3.getClass();
                wy3.a();
                hz1.k0(wy3, this.x, wy3.e0(4.0f), l35.e(wy3.w.v0(), (((long) Float.floatToRawIntBits(wy3.e0(18.0f))) << 32) | (((long) Float.floatToRawIntBits(-wy3.e0(18.0f))) & 4294967295L)), (iz1) null, 120);
                return vs7;
            case 5:
                hz1 hz1 = (hz1) obj;
                float min = Math.min(hz1.e0(4.0f), Float.intBitsToFloat((int) (hz1.e() & 4294967295L)));
                float e0 = hz1.e0(6.0f);
                float intBitsToFloat2 = (Float.intBitsToFloat((int) (4294967295L & hz1.e())) - min) / 2.0f;
                if (intBitsToFloat2 <= e0) {
                    e0 = intBitsToFloat2;
                }
                if (hz1.getLayoutDirection() == ey3.x) {
                    long v0 = hz1.v0();
                    wr0 j0 = hz1.j0();
                    long L = j0.L();
                    j0.D().h();
                    try {
                        ((ji8) j0.x).E(-1.0f, 1.0f, v0);
                        za5.n(hz1, j, min, e0);
                    } finally {
                        b81.u(j0, L);
                    }
                } else {
                    za5.n(hz1, j, min, e0);
                }
                return vs7;
            default:
                ua6 ua6 = (ua6) obj;
                ua6.getClass();
                ab6 k0 = ua6.k0("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    k0.f(j, 1);
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
                        int i4 = n14;
                        kd8 v = i95.v((int) k0.getLong(n2));
                        String R3 = k0.R(n3);
                        String R4 = k0.R(n4);
                        byte[] blob = k0.getBlob(n5);
                        ce1 ce1 = ce1.b;
                        ce1 D = r16.D(blob);
                        ce1 D2 = r16.D(k0.getBlob(n6));
                        long j2 = k0.getLong(n7);
                        long j3 = k0.getLong(n8);
                        long j4 = k0.getLong(n9);
                        int i5 = (int) k0.getLong(n10);
                        int i6 = n;
                        int i7 = n2;
                        d40 s = i95.s((int) k0.getLong(n11));
                        long j5 = k0.getLong(n12);
                        long j6 = k0.getLong(n13);
                        int i8 = i4;
                        long j7 = k0.getLong(i8);
                        int i9 = n15;
                        long j8 = k0.getLong(i9);
                        int i10 = n13;
                        int i11 = i8;
                        int i12 = n16;
                        int i13 = i9;
                        if (((int) k0.getLong(i12)) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        int i14 = n17;
                        int i15 = n3;
                        g85 u = i95.u((int) k0.getLong(i14));
                        int i16 = n18;
                        int i17 = n4;
                        int i18 = i16;
                        int i19 = n19;
                        int i20 = i14;
                        int i21 = n20;
                        long j9 = k0.getLong(i21);
                        int i22 = i12;
                        int i23 = (int) k0.getLong(i19);
                        int i24 = n21;
                        int i25 = i21;
                        int i26 = (int) k0.getLong(i24);
                        int i27 = (int) k0.getLong(i16);
                        int i28 = n22;
                        int i29 = i19;
                        int i30 = (int) k0.getLong(i28);
                        int i31 = n23;
                        if (k0.isNull(i31)) {
                            R = null;
                        } else {
                            R = k0.R(i31);
                        }
                        int i32 = i24;
                        int i33 = n24;
                        if (k0.isNull(i33)) {
                            i = i26;
                            i2 = i28;
                            num = null;
                        } else {
                            i = i26;
                            i2 = i28;
                            num = Integer.valueOf((int) k0.getLong(i33));
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
                        int i34 = i30;
                        int i35 = n25;
                        yy4 t = i95.t((int) k0.getLong(i35));
                        int i36 = n26;
                        ny4 J = i95.J(k0.getBlob(i36));
                        n25 = i35;
                        n26 = i36;
                        int i37 = n27;
                        if (((int) k0.getLong(i37)) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        n27 = i37;
                        int i38 = n28;
                        if (((int) k0.getLong(i38)) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        int i39 = i31;
                        int i40 = n29;
                        if (((int) k0.getLong(i40)) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        int i41 = i38;
                        n29 = i40;
                        int i42 = n30;
                        if (((int) k0.getLong(i42)) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        int i43 = n31;
                        int i44 = n32;
                        int i45 = i33;
                        int i46 = n33;
                        n33 = i46;
                        ArrayList arrayList3 = arrayList2;
                        arrayList3.add(new be8(R2, v, R3, R4, D, D2, j2, j3, j4, new j31(J, t, z2, z3, z4, z5, k0.getLong(i43), k0.getLong(i44), i95.i(k0.getBlob(i46))), i5, s, j5, j6, j7, j8, z, u, i27, i23, j9, i, i34, R, bool));
                        int i47 = i45;
                        n30 = i42;
                        n3 = i15;
                        n17 = i20;
                        n19 = i29;
                        n22 = i2;
                        n24 = i47;
                        arrayList = arrayList3;
                        n31 = i43;
                        n32 = i44;
                        n = i6;
                        n14 = i11;
                        n2 = i7;
                        n13 = i10;
                        n15 = i13;
                        n16 = i22;
                        n20 = i25;
                        n21 = i32;
                        n23 = i39;
                        n28 = i41;
                        n4 = i17;
                        n18 = i18;
                    }
                    ArrayList arrayList4 = arrayList;
                    k0.close();
                    return arrayList4;
                } catch (Throwable th2) {
                    k0.close();
                    throw th2;
                }
        }
    }
}
