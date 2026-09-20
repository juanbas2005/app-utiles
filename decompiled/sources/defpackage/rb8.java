package defpackage;

import java.util.ArrayList;

/* renamed from: rb8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class rb8 implements vr2 {
    public final /* synthetic */ int w;

    public /* synthetic */ rb8(int i) {
        this.w = i;
    }

    private final Object a(Object obj) {
        boolean z;
        String R;
        int i;
        Integer num;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        ua6 ua6 = (ua6) obj;
        ua6.getClass();
        ab6 k0 = ua6.k0("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        try {
            k0.f(200, 1);
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
                int i2 = n13;
                int i3 = n14;
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
                int i4 = (int) k0.getLong(n10);
                int i5 = n;
                int i6 = n2;
                d40 s = i95.s((int) k0.getLong(n11));
                long j4 = k0.getLong(n12);
                int i7 = i2;
                long j5 = k0.getLong(i7);
                int i8 = i3;
                long j6 = k0.getLong(i8);
                int i9 = i7;
                int i10 = n15;
                long j7 = k0.getLong(i10);
                n15 = i10;
                int i11 = i8;
                int i12 = n16;
                int i13 = n3;
                if (((int) k0.getLong(i12)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i14 = n17;
                int i15 = n4;
                g85 u = i95.u((int) k0.getLong(i14));
                int i16 = n18;
                int i17 = i14;
                int i18 = i12;
                int i19 = n19;
                int i20 = i16;
                int i21 = n20;
                long j8 = k0.getLong(i21);
                int i22 = (int) k0.getLong(i16);
                int i23 = i19;
                int i24 = (int) k0.getLong(i19);
                int i25 = n21;
                n21 = i25;
                int i26 = (int) k0.getLong(i25);
                int i27 = n22;
                int i28 = (int) k0.getLong(i27);
                int i29 = n23;
                Boolean bool = null;
                if (k0.isNull(i29)) {
                    R = null;
                } else {
                    R = k0.R(i29);
                }
                int i30 = i28;
                int i31 = n24;
                if (k0.isNull(i31)) {
                    i = i29;
                    n22 = i27;
                    num = null;
                } else {
                    i = i29;
                    n22 = i27;
                    num = Integer.valueOf((int) k0.getLong(i31));
                }
                if (num != null) {
                    if (num.intValue() != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    bool = Boolean.valueOf(z6);
                }
                Boolean bool2 = bool;
                int i32 = n25;
                int i33 = i21;
                yy4 t = i95.t((int) k0.getLong(i32));
                int i34 = n26;
                ny4 J = i95.J(k0.getBlob(i34));
                int i35 = i31;
                int i36 = i32;
                int i37 = n27;
                if (((int) k0.getLong(i37)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i38 = i34;
                int i39 = n28;
                if (((int) k0.getLong(i39)) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i40 = i37;
                int i41 = n29;
                if (((int) k0.getLong(i41)) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                int i42 = i39;
                n29 = i41;
                int i43 = n30;
                if (((int) k0.getLong(i43)) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int i44 = n31;
                int i45 = n32;
                n31 = i44;
                int i46 = n33;
                arrayList.add(new be8(R2, v, R3, R4, D, D2, j, j2, j3, new j31(J, t, z2, z3, z4, z5, k0.getLong(i44), k0.getLong(i45), i95.i(k0.getBlob(i46))), i4, s, j4, j5, j6, j7, z, u, i22, i24, j8, i26, i30, R, bool2));
                int i47 = i40;
                n28 = i42;
                n4 = i15;
                n17 = i17;
                n18 = i20;
                n19 = i23;
                n20 = i33;
                n23 = i;
                n24 = i35;
                n25 = i36;
                n26 = i38;
                n27 = i47;
                n33 = i46;
                n32 = i45;
                n30 = i43;
                n = i5;
                n3 = i13;
                n13 = i9;
                n14 = i11;
                n2 = i6;
                n16 = i18;
            }
            k0.close();
            return arrayList;
        } catch (Throwable th) {
            k0.close();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object y(Object obj) {
        boolean z;
        String R;
        Integer num;
        Boolean bool;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        String R2;
        Integer num2;
        Boolean bool2;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        String R3;
        Integer num3;
        Boolean bool3;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        String str = "generation";
        String str2 = "period_count";
        String str3 = "out_of_quota_policy";
        boolean z19 = true;
        String str4 = "run_in_foreground";
        boolean z20 = false;
        switch (this.w) {
            case b85.b:
                tb8 tb8 = (tb8) obj;
                tb8.getClass();
                return tb8;
            case 1:
                j21 j21 = (j21) obj;
                j21.getClass();
                return j21.getClass().getSimpleName();
            case 2:
                ua6 ua6 = (ua6) obj;
                ua6.getClass();
                ab6 k0 = ua6.k0("DELETE FROM WorkProgress");
                try {
                    k0.i0();
                    k0.close();
                    return vs7.a;
                } catch (Throwable th) {
                    k0.close();
                    throw th;
                }
            case 3:
                String str5 = "output";
                ua6 ua62 = (ua6) obj;
                ua62.getClass();
                String str6 = "schedule_requested_at";
                ab6 k02 = ua62.k0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
                    int n = u55.n(k02, "id");
                    int n2 = u55.n(k02, "state");
                    int n3 = u55.n(k02, "worker_class_name");
                    int n4 = u55.n(k02, "input_merger_class_name");
                    int n5 = u55.n(k02, "input");
                    int n6 = u55.n(k02, str5);
                    int n7 = u55.n(k02, "initial_delay");
                    int n8 = u55.n(k02, "interval_duration");
                    int n9 = u55.n(k02, "flex_duration");
                    int n10 = u55.n(k02, "run_attempt_count");
                    int n11 = u55.n(k02, "backoff_policy");
                    int n12 = u55.n(k02, "backoff_delay_duration");
                    int n13 = u55.n(k02, "last_enqueue_time");
                    int n14 = u55.n(k02, "minimum_retention_duration");
                    int n15 = u55.n(k02, str6);
                    int n16 = u55.n(k02, str4);
                    int n17 = u55.n(k02, str3);
                    int n18 = u55.n(k02, str2);
                    int n19 = u55.n(k02, str);
                    int n20 = u55.n(k02, "next_schedule_time_override");
                    int n21 = u55.n(k02, "next_schedule_time_override_generation");
                    int n22 = u55.n(k02, "stop_reason");
                    int n23 = u55.n(k02, "trace_tag");
                    int n24 = u55.n(k02, "backoff_on_system_interruptions");
                    int n25 = u55.n(k02, "required_network_type");
                    int n26 = u55.n(k02, "required_network_request");
                    int n27 = u55.n(k02, "requires_charging");
                    int n28 = u55.n(k02, "requires_device_idle");
                    int n29 = u55.n(k02, "requires_battery_not_low");
                    int n30 = u55.n(k02, "requires_storage_not_low");
                    int n31 = u55.n(k02, "trigger_content_update_delay");
                    int n32 = u55.n(k02, "trigger_max_content_delay");
                    int n33 = u55.n(k02, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (k02.i0()) {
                        String R4 = k02.R(n);
                        int i = n14;
                        int i2 = n13;
                        kd8 v = i95.v((int) k02.getLong(n2));
                        String R5 = k02.R(n3);
                        String R6 = k02.R(n4);
                        byte[] blob = k02.getBlob(n5);
                        ce1 ce1 = ce1.b;
                        ce1 D = r16.D(blob);
                        ce1 D2 = r16.D(k02.getBlob(n6));
                        long j = k02.getLong(n7);
                        long j2 = k02.getLong(n8);
                        long j3 = k02.getLong(n9);
                        int i3 = (int) k02.getLong(n10);
                        int i4 = n5;
                        int i5 = n4;
                        d40 s = i95.s((int) k02.getLong(n11));
                        long j4 = k02.getLong(n12);
                        int i6 = i2;
                        long j5 = k02.getLong(i6);
                        int i7 = i;
                        long j6 = k02.getLong(i7);
                        int i8 = i6;
                        int i9 = n15;
                        long j7 = k02.getLong(i9);
                        n15 = i9;
                        int i10 = i7;
                        int i11 = n16;
                        int i12 = n3;
                        if (((int) k02.getLong(i11)) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        int i13 = n17;
                        int i14 = n2;
                        g85 u = i95.u((int) k02.getLong(i13));
                        int i15 = n18;
                        int i16 = i13;
                        int i17 = i11;
                        int i18 = n19;
                        int i19 = i15;
                        int i20 = n20;
                        long j8 = k02.getLong(i20);
                        int i21 = (int) k02.getLong(i15);
                        int i22 = i18;
                        int i23 = (int) k02.getLong(i18);
                        int i24 = n21;
                        n21 = i24;
                        int i25 = (int) k02.getLong(i24);
                        int i26 = n22;
                        int i27 = (int) k02.getLong(i26);
                        int i28 = n23;
                        if (k02.isNull(i28)) {
                            R = null;
                        } else {
                            R = k02.R(i28);
                        }
                        int i29 = i27;
                        int i30 = n24;
                        if (k02.isNull(i30)) {
                            n23 = i28;
                            n22 = i26;
                            num = null;
                        } else {
                            n23 = i28;
                            n22 = i26;
                            num = Integer.valueOf((int) k02.getLong(i30));
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
                        int i31 = i20;
                        int i32 = n25;
                        yy4 t = i95.t((int) k02.getLong(i32));
                        int i33 = n26;
                        ny4 J = i95.J(k02.getBlob(i33));
                        int i34 = i30;
                        int i35 = i32;
                        int i36 = n27;
                        if (((int) k02.getLong(i36)) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        int i37 = i33;
                        int i38 = n28;
                        if (((int) k02.getLong(i38)) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        int i39 = i36;
                        int i40 = n29;
                        if (((int) k02.getLong(i40)) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        int i41 = i38;
                        n29 = i40;
                        int i42 = n30;
                        if (((int) k02.getLong(i42)) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        int i43 = n31;
                        int i44 = n32;
                        n31 = i43;
                        int i45 = n33;
                        arrayList.add(new be8(R4, v, R5, R6, D, D2, j, j2, j3, new j31(J, t, z2, z3, z4, z5, k02.getLong(i43), k02.getLong(i44), i95.i(k02.getBlob(i45))), i3, s, j4, j5, j6, j7, z, u, i21, i23, j8, i25, i29, R, bool));
                        int i46 = i39;
                        n28 = i41;
                        n2 = i14;
                        n17 = i16;
                        n18 = i19;
                        n19 = i22;
                        n20 = i31;
                        n24 = i34;
                        n25 = i35;
                        n26 = i37;
                        n27 = i46;
                        n33 = i45;
                        n32 = i44;
                        n30 = i42;
                        n4 = i5;
                        n13 = i8;
                        n14 = i10;
                        n5 = i4;
                        n3 = i12;
                        n16 = i17;
                    }
                    k02.close();
                    return arrayList;
                } catch (Throwable th2) {
                    k02.close();
                    throw th2;
                }
            case 4:
                String str7 = "output";
                ua6 ua63 = (ua6) obj;
                ua63.getClass();
                String str8 = "schedule_requested_at";
                ab6 k03 = ua63.k0("SELECT * FROM workspec WHERE state=1");
                try {
                    int n34 = u55.n(k03, "id");
                    int n35 = u55.n(k03, "state");
                    int n36 = u55.n(k03, "worker_class_name");
                    int n37 = u55.n(k03, "input_merger_class_name");
                    int n38 = u55.n(k03, "input");
                    int n39 = u55.n(k03, str7);
                    int n40 = u55.n(k03, "initial_delay");
                    int n41 = u55.n(k03, "interval_duration");
                    int n42 = u55.n(k03, "flex_duration");
                    int n43 = u55.n(k03, "run_attempt_count");
                    int n44 = u55.n(k03, "backoff_policy");
                    int n45 = u55.n(k03, "backoff_delay_duration");
                    int n46 = u55.n(k03, "last_enqueue_time");
                    int n47 = u55.n(k03, "minimum_retention_duration");
                    int n48 = u55.n(k03, str8);
                    int n49 = u55.n(k03, str4);
                    int n50 = u55.n(k03, str3);
                    int n51 = u55.n(k03, str2);
                    int n52 = u55.n(k03, str);
                    int n53 = u55.n(k03, "next_schedule_time_override");
                    int n54 = u55.n(k03, "next_schedule_time_override_generation");
                    int n55 = u55.n(k03, "stop_reason");
                    int n56 = u55.n(k03, "trace_tag");
                    int n57 = u55.n(k03, "backoff_on_system_interruptions");
                    int n58 = u55.n(k03, "required_network_type");
                    int n59 = u55.n(k03, "required_network_request");
                    int n60 = u55.n(k03, "requires_charging");
                    int n61 = u55.n(k03, "requires_device_idle");
                    int n62 = u55.n(k03, "requires_battery_not_low");
                    int n63 = u55.n(k03, "requires_storage_not_low");
                    int n64 = u55.n(k03, "trigger_content_update_delay");
                    int n65 = u55.n(k03, "trigger_max_content_delay");
                    int n66 = u55.n(k03, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (k03.i0()) {
                        String R7 = k03.R(n34);
                        int i47 = n47;
                        int i48 = n46;
                        kd8 v2 = i95.v((int) k03.getLong(n35));
                        String R8 = k03.R(n36);
                        String R9 = k03.R(n37);
                        byte[] blob2 = k03.getBlob(n38);
                        ce1 ce12 = ce1.b;
                        ce1 D3 = r16.D(blob2);
                        ce1 D4 = r16.D(k03.getBlob(n39));
                        long j9 = k03.getLong(n40);
                        long j10 = k03.getLong(n41);
                        long j11 = k03.getLong(n42);
                        int i49 = (int) k03.getLong(n43);
                        int i50 = n38;
                        int i51 = n37;
                        d40 s2 = i95.s((int) k03.getLong(n44));
                        long j12 = k03.getLong(n45);
                        int i52 = i48;
                        long j13 = k03.getLong(i52);
                        int i53 = i47;
                        long j14 = k03.getLong(i53);
                        int i54 = n48;
                        long j15 = k03.getLong(i54);
                        int i55 = i52;
                        int i56 = i53;
                        int i57 = n36;
                        int i58 = n49;
                        if (((int) k03.getLong(i58)) != 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        int i59 = n35;
                        int i60 = n50;
                        g85 u2 = i95.u((int) k03.getLong(i60));
                        n50 = i60;
                        int i61 = n51;
                        n51 = i61;
                        int i62 = n52;
                        int i63 = i58;
                        int i64 = n53;
                        long j16 = k03.getLong(i64);
                        int i65 = (int) k03.getLong(i61);
                        int i66 = i62;
                        int i67 = (int) k03.getLong(i62);
                        int i68 = n54;
                        n54 = i68;
                        int i69 = (int) k03.getLong(i68);
                        int i70 = n55;
                        int i71 = (int) k03.getLong(i70);
                        int i72 = n56;
                        if (k03.isNull(i72)) {
                            R2 = null;
                        } else {
                            R2 = k03.R(i72);
                        }
                        int i73 = i71;
                        int i74 = n57;
                        if (k03.isNull(i74)) {
                            n56 = i72;
                            n55 = i70;
                            num2 = null;
                        } else {
                            n56 = i72;
                            n55 = i70;
                            num2 = Integer.valueOf((int) k03.getLong(i74));
                        }
                        if (num2 != null) {
                            if (num2.intValue() != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            bool2 = Boolean.valueOf(z12);
                        } else {
                            bool2 = null;
                        }
                        int i75 = i64;
                        int i76 = n58;
                        yy4 t2 = i95.t((int) k03.getLong(i76));
                        int i77 = n59;
                        ny4 J2 = i95.J(k03.getBlob(i77));
                        int i78 = i74;
                        int i79 = i76;
                        int i80 = n60;
                        if (((int) k03.getLong(i80)) != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        int i81 = i77;
                        int i82 = n61;
                        if (((int) k03.getLong(i82)) != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        int i83 = i80;
                        int i84 = n62;
                        if (((int) k03.getLong(i84)) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i85 = i82;
                        n62 = i84;
                        int i86 = n63;
                        if (((int) k03.getLong(i86)) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        int i87 = n64;
                        int i88 = n65;
                        n64 = i87;
                        int i89 = n66;
                        arrayList2.add(new be8(R7, v2, R8, R9, D3, D4, j9, j10, j11, new j31(J2, t2, z8, z9, z10, z11, k03.getLong(i87), k03.getLong(i88), i95.i(k03.getBlob(i89))), i49, s2, j12, j13, j14, j15, z7, u2, i65, i67, j16, i69, i73, R2, bool2));
                        int i90 = i85;
                        n35 = i59;
                        n49 = i63;
                        n52 = i66;
                        n53 = i75;
                        n57 = i78;
                        n58 = i79;
                        n59 = i81;
                        n60 = i83;
                        n61 = i90;
                        n66 = i89;
                        n65 = i88;
                        n63 = i86;
                        n47 = i56;
                        n37 = i51;
                        n38 = i50;
                        n36 = i57;
                        n48 = i54;
                        n46 = i55;
                    }
                    k03.close();
                    return arrayList2;
                } catch (Throwable th3) {
                    k03.close();
                    throw th3;
                }
            case 5:
                ua6 ua64 = (ua6) obj;
                ua64.getClass();
                String str9 = "schedule_requested_at";
                ab6 k04 = ua64.k0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
                try {
                    int n67 = u55.n(k04, "id");
                    int n68 = u55.n(k04, "state");
                    int n69 = u55.n(k04, "worker_class_name");
                    int n70 = u55.n(k04, "input_merger_class_name");
                    int n71 = u55.n(k04, "input");
                    int n72 = u55.n(k04, "output");
                    int n73 = u55.n(k04, "initial_delay");
                    int n74 = u55.n(k04, "interval_duration");
                    int n75 = u55.n(k04, "flex_duration");
                    int n76 = u55.n(k04, "run_attempt_count");
                    int n77 = u55.n(k04, "backoff_policy");
                    int n78 = u55.n(k04, "backoff_delay_duration");
                    int n79 = u55.n(k04, "last_enqueue_time");
                    int n80 = u55.n(k04, "minimum_retention_duration");
                    int n81 = u55.n(k04, str9);
                    int n82 = u55.n(k04, str4);
                    int n83 = u55.n(k04, str3);
                    int n84 = u55.n(k04, str2);
                    int n85 = u55.n(k04, str);
                    int n86 = u55.n(k04, "next_schedule_time_override");
                    int n87 = u55.n(k04, "next_schedule_time_override_generation");
                    int n88 = u55.n(k04, "stop_reason");
                    int n89 = u55.n(k04, "trace_tag");
                    int n90 = u55.n(k04, "backoff_on_system_interruptions");
                    int n91 = u55.n(k04, "required_network_type");
                    int n92 = u55.n(k04, "required_network_request");
                    int n93 = u55.n(k04, "requires_charging");
                    int n94 = u55.n(k04, "requires_device_idle");
                    int n95 = u55.n(k04, "requires_battery_not_low");
                    int n96 = u55.n(k04, "requires_storage_not_low");
                    int n97 = u55.n(k04, "trigger_content_update_delay");
                    int n98 = u55.n(k04, "trigger_max_content_delay");
                    int n99 = u55.n(k04, "content_uri_triggers");
                    ArrayList arrayList3 = new ArrayList();
                    while (k04.i0()) {
                        String R10 = k04.R(n67);
                        int i91 = n80;
                        int i92 = n79;
                        kd8 v3 = i95.v((int) k04.getLong(n68));
                        String R11 = k04.R(n69);
                        String R12 = k04.R(n70);
                        byte[] blob3 = k04.getBlob(n71);
                        ce1 ce13 = ce1.b;
                        ce1 D5 = r16.D(blob3);
                        ce1 D6 = r16.D(k04.getBlob(n72));
                        long j17 = k04.getLong(n73);
                        long j18 = k04.getLong(n74);
                        long j19 = k04.getLong(n75);
                        int i93 = (int) k04.getLong(n76);
                        int i94 = n71;
                        int i95 = n70;
                        d40 s3 = i95.s((int) k04.getLong(n77));
                        long j20 = k04.getLong(n78);
                        int i96 = i92;
                        long j22 = k04.getLong(i96);
                        int i97 = i91;
                        long j23 = k04.getLong(i97);
                        int i98 = n81;
                        long j24 = k04.getLong(i98);
                        int i99 = i96;
                        int i100 = i97;
                        int i101 = n69;
                        int i102 = n82;
                        if (((int) k04.getLong(i102)) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        int i103 = n68;
                        int i104 = n83;
                        g85 u3 = i95.u((int) k04.getLong(i104));
                        n83 = i104;
                        int i105 = n84;
                        n84 = i105;
                        int i106 = n85;
                        int i107 = i102;
                        int i108 = n86;
                        long j25 = k04.getLong(i108);
                        int i109 = (int) k04.getLong(i105);
                        int i110 = i106;
                        int i111 = (int) k04.getLong(i106);
                        int i112 = n87;
                        n87 = i112;
                        int i113 = (int) k04.getLong(i112);
                        int i114 = n88;
                        int i115 = (int) k04.getLong(i114);
                        int i116 = n89;
                        if (k04.isNull(i116)) {
                            R3 = null;
                        } else {
                            R3 = k04.R(i116);
                        }
                        int i117 = i115;
                        int i118 = n90;
                        if (k04.isNull(i118)) {
                            n89 = i116;
                            n88 = i114;
                            num3 = null;
                        } else {
                            n89 = i116;
                            n88 = i114;
                            num3 = Integer.valueOf((int) k04.getLong(i118));
                        }
                        if (num3 != null) {
                            if (num3.intValue() != 0) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            bool3 = Boolean.valueOf(z18);
                        } else {
                            bool3 = null;
                        }
                        int i119 = i108;
                        int i120 = n91;
                        yy4 t3 = i95.t((int) k04.getLong(i120));
                        int i121 = n92;
                        ny4 J3 = i95.J(k04.getBlob(i121));
                        int i122 = i118;
                        int i123 = i120;
                        int i124 = n93;
                        if (((int) k04.getLong(i124)) != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        int i125 = i121;
                        int i126 = n94;
                        if (((int) k04.getLong(i126)) != 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        int i127 = i124;
                        int i128 = n95;
                        if (((int) k04.getLong(i128)) != 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        int i129 = i126;
                        n95 = i128;
                        int i130 = n96;
                        if (((int) k04.getLong(i130)) != 0) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        int i131 = n97;
                        int i132 = n98;
                        n97 = i131;
                        int i133 = n99;
                        arrayList3.add(new be8(R10, v3, R11, R12, D5, D6, j17, j18, j19, new j31(J3, t3, z14, z15, z16, z17, k04.getLong(i131), k04.getLong(i132), i95.i(k04.getBlob(i133))), i93, s3, j20, j22, j23, j24, z13, u3, i109, i111, j25, i113, i117, R3, bool3));
                        int i134 = i129;
                        n68 = i103;
                        n82 = i107;
                        n85 = i110;
                        n86 = i119;
                        n90 = i122;
                        n91 = i123;
                        n92 = i125;
                        n93 = i127;
                        n94 = i134;
                        n99 = i133;
                        n98 = i132;
                        n96 = i130;
                        n80 = i100;
                        n70 = i95;
                        n71 = i94;
                        n69 = i101;
                        n81 = i98;
                        n79 = i99;
                    }
                    k04.close();
                    return arrayList3;
                } catch (Throwable th4) {
                    k04.close();
                    throw th4;
                }
            case 6:
                ua6 ua65 = (ua6) obj;
                ua65.getClass();
                ab6 k05 = ua65.k0("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    if (k05.i0()) {
                        z20 = (int) k05.getLong(0);
                    }
                    k05.close();
                    return Integer.valueOf(z20);
                } catch (Throwable th5) {
                    k05.close();
                    throw th5;
                }
            case 7:
                ua6 ua66 = (ua6) obj;
                ua66.getClass();
                ab6 k06 = ua66.k0("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                try {
                    if (k06.i0()) {
                        if (((int) k06.getLong(0)) == 0) {
                            z19 = false;
                        }
                        z20 = z19;
                    }
                    k06.close();
                    return Boolean.valueOf(z20);
                } catch (Throwable th6) {
                    k06.close();
                    throw th6;
                }
            case 8:
                return a(obj);
            default:
                ua6 ua67 = (ua6) obj;
                ua67.getClass();
                ab6 k07 = ua67.k0("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    k07.i0();
                    int k = o55.k(ua67);
                    k07.close();
                    return Integer.valueOf(k);
                } catch (Throwable th7) {
                    k07.close();
                    throw th7;
                }
        }
    }
}
