package defpackage;

/* renamed from: wy7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wy7 extends ar7 {
    public final /* synthetic */ int F0;

    public /* synthetic */ wy7(int i) {
        this.F0 = i;
    }

    public final void k(ab6 ab6, Object obj) {
        int i;
        Integer num;
        int i2 = 1;
        switch (this.F0) {
            case b85.b:
                yy7 yy7 = (yy7) obj;
                ab6.getClass();
                yy7.getClass();
                String str = yy7.a;
                ab6.F(1, str);
                ab6.F(2, yy7.b);
                ab6.F(3, yy7.c);
                ab6.F(4, yy7.d);
                ab6.F(5, yy7.e);
                ab6.F(6, str);
                return;
            case 1:
                pz7 pz7 = (pz7) obj;
                ab6.getClass();
                pz7.getClass();
                String str2 = pz7.a;
                ab6.F(1, str2);
                String str3 = pz7.b;
                ab6.F(2, str3);
                ab6.F(3, pz7.c);
                ab6.F(4, pz7.d);
                ab6.f(pz7.e, 5);
                ab6.F(6, str2);
                ab6.F(7, str3);
                return;
            default:
                be8 be8 = (be8) obj;
                ab6.getClass();
                be8.getClass();
                String str4 = be8.a;
                ab6.F(1, str4);
                ab6.f((long) i95.I(be8.b), 2);
                ab6.F(3, be8.c);
                ab6.F(4, be8.d);
                ce1 ce1 = ce1.b;
                ab6.h(5, r16.g0(be8.e));
                ab6.h(6, r16.g0(be8.f));
                ab6.f(be8.g, 7);
                ab6.f(be8.h, 8);
                ab6.f(be8.i, 9);
                ab6.f((long) be8.k, 10);
                d40 d40 = be8.l;
                d40.getClass();
                int ordinal = d40.ordinal();
                if (ordinal == 0) {
                    i = 0;
                } else if (ordinal == 1) {
                    i = 1;
                } else {
                    h.c();
                    return;
                }
                ab6.f((long) i, 11);
                ab6.f(be8.m, 12);
                ab6.f(be8.n, 13);
                ab6.f(be8.o, 14);
                ab6.f(be8.p, 15);
                ab6.f(be8.q ? 1 : 0, 16);
                g85 g85 = be8.r;
                g85.getClass();
                int ordinal2 = g85.ordinal();
                if (ordinal2 == 0) {
                    i2 = 0;
                } else if (ordinal2 != 1) {
                    h.c();
                    return;
                }
                ab6.f((long) i2, 17);
                ab6.f((long) be8.s, 18);
                ab6.f((long) be8.t, 19);
                ab6.f(be8.u, 20);
                ab6.f((long) be8.v, 21);
                ab6.f((long) be8.w, 22);
                String str5 = be8.x;
                if (str5 == null) {
                    ab6.m(23);
                } else {
                    ab6.F(23, str5);
                }
                Boolean bool = be8.y;
                if (bool != null) {
                    num = Integer.valueOf(bool.booleanValue() ? 1 : 0);
                } else {
                    num = null;
                }
                if (num == null) {
                    ab6.m(24);
                } else {
                    ab6.f((long) num.intValue(), 24);
                }
                j31 j31 = be8.j;
                ab6.f((long) i95.y(j31.a), 25);
                ab6.h(26, i95.n(j31.b));
                ab6.f(j31.c ? 1 : 0, 27);
                ab6.f(j31.d ? 1 : 0, 28);
                ab6.f(j31.e ? 1 : 0, 29);
                ab6.f(j31.f ? 1 : 0, 30);
                ab6.f(j31.g, 31);
                ab6.f(j31.h, 32);
                ab6.h(33, i95.H(j31.i));
                ab6.F(34, str4);
                return;
        }
    }

    public final String s() {
        switch (this.F0) {
            case b85.b:
                return "UPDATE `ussd_codes` SET `id` = ?,`name` = ?,`code` = ?,`category` = ?,`description` = ? WHERE `id` = ?";
            case 1:
                return "UPDATE `ussd_responses` SET `ussd_code` = ?,`field_name` = ?,`value` = ?,`raw_response` = ?,`timestamp` = ? WHERE `ussd_code` = ? AND `field_name` = ?";
            default:
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }
    }
}
