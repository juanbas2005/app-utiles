package defpackage;

/* renamed from: bq1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bq1 extends pd8 {
    public final /* synthetic */ int E;

    public /* synthetic */ bq1(int i) {
        this.E = i;
    }

    public final void h(ab6 ab6, Object obj) {
        int i;
        Integer num;
        int i2 = 1;
        switch (this.E) {
            case b85.b:
                yp1 yp1 = (yp1) obj;
                ab6.getClass();
                yp1.getClass();
                ab6.F(1, yp1.a);
                ab6.F(2, yp1.b);
                return;
            case 1:
                gr4 gr4 = (gr4) obj;
                ab6.getClass();
                gr4.getClass();
                ab6.F(1, gr4.a);
                ab6.F(2, gr4.b);
                ab6.f(gr4.c, 3);
                return;
            case 2:
                dn5 dn5 = (dn5) obj;
                ab6.getClass();
                dn5.getClass();
                ab6.F(1, dn5.a);
                ab6.f(dn5.b.longValue(), 2);
                return;
            case 3:
                ga7 ga7 = (ga7) obj;
                ab6.getClass();
                ga7.getClass();
                ab6.F(1, ga7.a);
                ab6.f((long) ga7.b, 2);
                ab6.f((long) ga7.c, 3);
                return;
            case 4:
                nl7 nl7 = (nl7) obj;
                ab6.getClass();
                nl7.getClass();
                ab6.F(1, nl7.a);
                ab6.f(nl7.b, 2);
                return;
            case 5:
                yy7 yy7 = (yy7) obj;
                ab6.getClass();
                yy7.getClass();
                ab6.F(1, yy7.a);
                ab6.F(2, yy7.b);
                ab6.F(3, yy7.c);
                ab6.F(4, yy7.d);
                ab6.F(5, yy7.e);
                return;
            case 6:
                pz7 pz7 = (pz7) obj;
                ab6.getClass();
                pz7.getClass();
                ab6.F(1, pz7.a);
                ab6.F(2, pz7.b);
                ab6.F(3, pz7.c);
                ab6.F(4, pz7.d);
                ab6.f(pz7.e, 5);
                return;
            case 7:
                rd8 rd8 = (rd8) obj;
                ab6.getClass();
                rd8.getClass();
                ab6.F(1, rd8.a);
                ab6.F(2, rd8.b);
                return;
            case 8:
                be8 be8 = (be8) obj;
                ab6.getClass();
                be8.getClass();
                ab6.F(1, be8.a);
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
                String str = be8.x;
                if (str == null) {
                    ab6.m(23);
                } else {
                    ab6.F(23, str);
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
                return;
            default:
                ge8 ge8 = (ge8) obj;
                ab6.getClass();
                ge8.getClass();
                ab6.F(1, ge8.a);
                ab6.F(2, ge8.b);
                return;
        }
    }

    public final String n() {
        switch (this.E) {
            case b85.b:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `nauta_accounts` (`email`,`encryptedPassword`,`lastUsed`) VALUES (?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `transfer_recipients` (`number`,`lastUsed`) VALUES (?,?)";
            case 5:
                return "INSERT INTO `ussd_codes` (`id`,`name`,`code`,`category`,`description`) VALUES (?,?,?,?,?)";
            case 6:
                return "INSERT INTO `ussd_responses` (`ussd_code`,`field_name`,`value`,`raw_response`,`timestamp`) VALUES (?,?,?,?,?)";
            case 7:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 8:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }
}
