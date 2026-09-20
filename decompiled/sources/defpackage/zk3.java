package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import cu.lestebang.utiletecsa.core.room.data.JetpackDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: zk3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zk3 extends t22 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ a96 e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zk3(WorkDatabase_Impl workDatabase_Impl) {
        super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        this.e = workDatabase_Impl;
    }

    public final void a(ua6 ua6) {
        int i = this.d;
        ua6.getClass();
        switch (i) {
            case b85.b:
                l55.m(ua6, "CREATE TABLE IF NOT EXISTS `jetpacks` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `price` REAL NOT NULL, `userId` TEXT NOT NULL, `lastUpdated` INTEGER NOT NULL, `lastSynced` INTEGER NOT NULL, `needsSync` INTEGER NOT NULL, `deleted` INTEGER NOT NULL, `syncAction` TEXT NOT NULL, PRIMARY KEY(`id`))");
                l55.m(ua6, "CREATE TABLE IF NOT EXISTS `ussd_codes` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `code` TEXT NOT NULL, `category` TEXT NOT NULL, `description` TEXT NOT NULL, PRIMARY KEY(`id`))");
                l55.m(ua6, "CREATE TABLE IF NOT EXISTS `ussd_responses` (`ussd_code` TEXT NOT NULL, `field_name` TEXT NOT NULL, `value` TEXT NOT NULL, `raw_response` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`ussd_code`, `field_name`))");
                l55.m(ua6, "CREATE TABLE IF NOT EXISTS `transfer_recipients` (`number` TEXT NOT NULL, `lastUsed` INTEGER NOT NULL, PRIMARY KEY(`number`))");
                l55.m(ua6, "CREATE TABLE IF NOT EXISTS `nauta_accounts` (`email` TEXT NOT NULL, `encryptedPassword` TEXT NOT NULL, `lastUsed` INTEGER NOT NULL, PRIMARY KEY(`email`))");
                l55.m(ua6, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                l55.m(ua6, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1186a5595e6972d91885b0070dbfcbe6')");
                return;
            default:
                l55.m(ua6, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                l55.m(ua6, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                l55.m(ua6, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                l55.m(ua6, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                l55.m(ua6, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                l55.m(ua6, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                l55.m(ua6, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                l55.m(ua6, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                l55.m(ua6, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                l55.m(ua6, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                l55.m(ua6, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                l55.m(ua6, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                l55.m(ua6, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                l55.m(ua6, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                l55.m(ua6, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
                return;
        }
    }

    public final void c(ua6 ua6) {
        int i = this.d;
        ua6.getClass();
        switch (i) {
            case b85.b:
                l55.m(ua6, "DROP TABLE IF EXISTS `jetpacks`");
                l55.m(ua6, "DROP TABLE IF EXISTS `ussd_codes`");
                l55.m(ua6, "DROP TABLE IF EXISTS `ussd_responses`");
                l55.m(ua6, "DROP TABLE IF EXISTS `transfer_recipients`");
                l55.m(ua6, "DROP TABLE IF EXISTS `nauta_accounts`");
                return;
            default:
                l55.m(ua6, "DROP TABLE IF EXISTS `Dependency`");
                l55.m(ua6, "DROP TABLE IF EXISTS `WorkSpec`");
                l55.m(ua6, "DROP TABLE IF EXISTS `WorkTag`");
                l55.m(ua6, "DROP TABLE IF EXISTS `SystemIdInfo`");
                l55.m(ua6, "DROP TABLE IF EXISTS `WorkName`");
                l55.m(ua6, "DROP TABLE IF EXISTS `WorkProgress`");
                l55.m(ua6, "DROP TABLE IF EXISTS `Preference`");
                return;
        }
    }

    public final void r(ua6 ua6) {
        int i = this.d;
        ua6.getClass();
    }

    public final void s(ua6 ua6) {
        int i = this.d;
        a96 a96 = this.e;
        ua6.getClass();
        switch (i) {
            case b85.b:
                ((JetpackDatabase_Impl) a96).m(ua6);
                return;
            default:
                l55.m(ua6, "PRAGMA foreign_keys = ON");
                ((WorkDatabase_Impl) a96).m(ua6);
                return;
        }
    }

    public final void t(ua6 ua6) {
        int i = this.d;
        ua6.getClass();
    }

    public final void u(ua6 ua6) {
        int i = this.d;
        ua6.getClass();
        switch (i) {
            case b85.b:
                sg3.r(ua6);
                return;
            default:
                sg3.r(ua6);
                return;
        }
    }

    public final ca v(ua6 ua6) {
        ua6 ua62 = ua6;
        int i = this.d;
        ua62.getClass();
        switch (i) {
            case b85.b:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("id", new db7("id", "TEXT", true, 1, (String) null, 1));
                linkedHashMap.put("name", new db7("name", "TEXT", true, 0, (String) null, 1));
                linkedHashMap.put("price", new db7("price", "REAL", true, 0, (String) null, 1));
                linkedHashMap.put("userId", new db7("userId", "TEXT", true, 0, (String) null, 1));
                linkedHashMap.put("lastUpdated", new db7("lastUpdated", "INTEGER", true, 0, (String) null, 1));
                linkedHashMap.put("lastSynced", new db7("lastSynced", "INTEGER", true, 0, (String) null, 1));
                linkedHashMap.put("needsSync", new db7("needsSync", "INTEGER", true, 0, (String) null, 1));
                linkedHashMap.put("deleted", new db7("deleted", "INTEGER", true, 0, (String) null, 1));
                linkedHashMap.put("syncAction", new db7("syncAction", "TEXT", true, 0, (String) null, 1));
                gb7 gb7 = new gb7("jetpacks", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
                gb7 q = wn6.q(ua62, "jetpacks");
                if (!gb7.equals(q)) {
                    return new ca("jetpacks(cu.lestebang.utiletecsa.core.room.model.JetpackEntity).\n Expected:\n" + gb7 + "\n Found:\n" + q, false);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("id", new db7("id", "TEXT", true, 1, (String) null, 1));
                linkedHashMap2.put("name", new db7("name", "TEXT", true, 0, (String) null, 1));
                linkedHashMap2.put("code", new db7("code", "TEXT", true, 0, (String) null, 1));
                linkedHashMap2.put("category", new db7("category", "TEXT", true, 0, (String) null, 1));
                linkedHashMap2.put("description", new db7("description", "TEXT", true, 0, (String) null, 1));
                gb7 gb72 = new gb7("ussd_codes", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
                gb7 q2 = wn6.q(ua62, "ussd_codes");
                if (!gb72.equals(q2)) {
                    return new ca("ussd_codes(cu.lestebang.utiletecsa.core.room.model.UssdCodeEntity).\n Expected:\n" + gb72 + "\n Found:\n" + q2, false);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("ussd_code", new db7("ussd_code", "TEXT", true, 1, (String) null, 1));
                linkedHashMap3.put("field_name", new db7("field_name", "TEXT", true, 2, (String) null, 1));
                linkedHashMap3.put("value", new db7("value", "TEXT", true, 0, (String) null, 1));
                linkedHashMap3.put("raw_response", new db7("raw_response", "TEXT", true, 0, (String) null, 1));
                linkedHashMap3.put("timestamp", new db7("timestamp", "INTEGER", true, 0, (String) null, 1));
                gb7 gb73 = new gb7("ussd_responses", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
                gb7 q3 = wn6.q(ua62, "ussd_responses");
                if (!gb73.equals(q3)) {
                    return new ca("ussd_responses(cu.lestebang.utiletecsa.core.room.model.UssdResponseEntity).\n Expected:\n" + gb73 + "\n Found:\n" + q3, false);
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                linkedHashMap4.put("number", new db7("number", "TEXT", true, 1, (String) null, 1));
                linkedHashMap4.put("lastUsed", new db7("lastUsed", "INTEGER", true, 0, (String) null, 1));
                gb7 gb74 = new gb7("transfer_recipients", linkedHashMap4, new LinkedHashSet(), new LinkedHashSet());
                gb7 q4 = wn6.q(ua62, "transfer_recipients");
                if (!gb74.equals(q4)) {
                    return new ca("transfer_recipients(cu.lestebang.utiletecsa.core.room.model.TransferRecipientEntity).\n Expected:\n" + gb74 + "\n Found:\n" + q4, false);
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                linkedHashMap5.put("email", new db7("email", "TEXT", true, 1, (String) null, 1));
                linkedHashMap5.put("encryptedPassword", new db7("encryptedPassword", "TEXT", true, 0, (String) null, 1));
                linkedHashMap5.put("lastUsed", new db7("lastUsed", "INTEGER", true, 0, (String) null, 1));
                gb7 gb75 = new gb7("nauta_accounts", linkedHashMap5, new LinkedHashSet(), new LinkedHashSet());
                gb7 q5 = wn6.q(ua62, "nauta_accounts");
                if (gb75.equals(q5)) {
                    return new ca((String) null, true);
                }
                return new ca("nauta_accounts(cu.lestebang.utiletecsa.core.room.model.NautaAccountEntity).\n Expected:\n" + gb75 + "\n Found:\n" + q5, false);
            default:
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                linkedHashMap6.put("work_spec_id", new db7("work_spec_id", "TEXT", true, 1, (String) null, 1));
                linkedHashMap6.put("prerequisite_id", new db7("prerequisite_id", "TEXT", true, 2, (String) null, 1));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(new eb7("WorkSpec", "CASCADE", "CASCADE", sg3.D("work_spec_id"), sg3.D("id")));
                linkedHashSet.add(new eb7("WorkSpec", "CASCADE", "CASCADE", sg3.D("prerequisite_id"), sg3.D("id")));
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                linkedHashSet2.add(new fb7("index_Dependency_work_spec_id", false, sg3.D("work_spec_id"), sg3.D("ASC")));
                linkedHashSet2.add(new fb7("index_Dependency_prerequisite_id", false, sg3.D("prerequisite_id"), sg3.D("ASC")));
                gb7 gb76 = new gb7("Dependency", linkedHashMap6, linkedHashSet, linkedHashSet2);
                gb7 q6 = wn6.q(ua62, "Dependency");
                if (!gb76.equals(q6)) {
                    return new ca("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + gb76 + "\n Found:\n" + q6, false);
                }
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                linkedHashMap7.put("id", new db7("id", "TEXT", true, 1, (String) null, 1));
                linkedHashMap7.put("state", new db7("state", "INTEGER", true, 0, (String) null, 1));
                linkedHashMap7.put("worker_class_name", new db7("worker_class_name", "TEXT", true, 0, (String) null, 1));
                linkedHashMap7.put("input_merger_class_name", new db7("input_merger_class_name", "TEXT", true, 0, (String) null, 1));
                linkedHashMap7.put("input", new db7("input", "BLOB", true, 0, (String) null, 1));
                linkedHashMap7.put("output", new db7("output", "BLOB", true, 0, (String) null, 1));
                linkedHashMap7.put("initial_delay", new db7("initial_delay", "INTEGER", true, 0, (String) null, 1));
                linkedHashMap7.put("interval_duration", new db7("interval_duration", "INTEGER", true, 0, (String) null, 1));
                linkedHashMap7.put("flex_duration", new db7("flex_duration", "INTEGER", true, 0, (String) null, 1));
                linkedHashMap7.put("run_attempt_count", new db7("run_attempt_count", "INTEGER", true, 0, (String) null, 1));
                linkedHashMap7.put("backoff_policy", new db7("backoff_policy", "INTEGER", true, 0, (String) null, 1));
                linkedHashMap7.put("backoff_delay_duration", new db7("backoff_delay_duration", "INTEGER", true, 0, (String) null, 1));
                linkedHashMap7.put("last_enqueue_time", new db7("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
                linkedHashMap7.put("minimum_retention_duration", new db7("minimum_retention_duration", "INTEGER", true, 0, (String) null, 1));
                linkedHashMap7.put("schedule_requested_at", new db7("schedule_requested_at", "INTEGER", true, 0, (String) null, 1));
                linkedHashMap7.put("run_in_foreground", new db7("run_in_foreground", "INTEGER", true, 0, (String) null, 1));
                linkedHashMap7.put("out_of_quota_policy", new db7("out_of_quota_policy", "INTEGER", true, 0, (String) null, 1));
                linkedHashMap7.put("period_count", new db7("period_count", "INTEGER", true, 0, "0", 1));
                linkedHashMap7.put("generation", new db7("generation", "INTEGER", true, 0, "0", 1));
                linkedHashMap7.put("next_schedule_time_override", new db7("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
                linkedHashMap7.put("next_schedule_time_override_generation", new db7("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
                linkedHashMap7.put("stop_reason", new db7("stop_reason", "INTEGER", true, 0, "-256", 1));
                linkedHashMap7.put("trace_tag", new db7("trace_tag", "TEXT", false, 0, (String) null, 1));
                linkedHashMap7.put("backoff_on_system_interruptions", new db7("backoff_on_system_interruptions", "INTEGER", false, 0, (String) null, 1));
                linkedHashMap7.put("required_network_type", new db7("required_network_type", "INTEGER", true, 0, (String) null, 1));
                linkedHashMap7.put("required_network_request", new db7("required_network_request", "BLOB", true, 0, "x''", 1));
                linkedHashMap7.put("requires_charging", new db7("requires_charging", "INTEGER", true, 0, (String) null, 1));
                linkedHashMap7.put("requires_device_idle", new db7("requires_device_idle", "INTEGER", true, 0, (String) null, 1));
                linkedHashMap7.put("requires_battery_not_low", new db7("requires_battery_not_low", "INTEGER", true, 0, (String) null, 1));
                linkedHashMap7.put("requires_storage_not_low", new db7("requires_storage_not_low", "INTEGER", true, 0, (String) null, 1));
                linkedHashMap7.put("trigger_content_update_delay", new db7("trigger_content_update_delay", "INTEGER", true, 0, (String) null, 1));
                linkedHashMap7.put("trigger_max_content_delay", new db7("trigger_max_content_delay", "INTEGER", true, 0, (String) null, 1));
                linkedHashMap7.put("content_uri_triggers", new db7("content_uri_triggers", "BLOB", true, 0, (String) null, 1));
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                linkedHashSet4.add(new fb7("index_WorkSpec_schedule_requested_at", false, sg3.D("schedule_requested_at"), sg3.D("ASC")));
                linkedHashSet4.add(new fb7("index_WorkSpec_last_enqueue_time", false, sg3.D("last_enqueue_time"), sg3.D("ASC")));
                gb7 gb77 = new gb7("WorkSpec", linkedHashMap7, linkedHashSet3, linkedHashSet4);
                gb7 q7 = wn6.q(ua62, "WorkSpec");
                if (!gb77.equals(q7)) {
                    return new ca("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + gb77 + "\n Found:\n" + q7, false);
                }
                LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                linkedHashMap8.put("tag", new db7("tag", "TEXT", true, 1, (String) null, 1));
                linkedHashMap8.put("work_spec_id", new db7("work_spec_id", "TEXT", true, 2, (String) null, 1));
                LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                linkedHashSet5.add(new eb7("WorkSpec", "CASCADE", "CASCADE", sg3.D("work_spec_id"), sg3.D("id")));
                LinkedHashSet linkedHashSet6 = new LinkedHashSet();
                linkedHashSet6.add(new fb7("index_WorkTag_work_spec_id", false, sg3.D("work_spec_id"), sg3.D("ASC")));
                gb7 gb78 = new gb7("WorkTag", linkedHashMap8, linkedHashSet5, linkedHashSet6);
                gb7 q8 = wn6.q(ua62, "WorkTag");
                if (!gb78.equals(q8)) {
                    return new ca("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + gb78 + "\n Found:\n" + q8, false);
                }
                LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                linkedHashMap9.put("work_spec_id", new db7("work_spec_id", "TEXT", true, 1, (String) null, 1));
                linkedHashMap9.put("generation", new db7("generation", "INTEGER", true, 2, "0", 1));
                linkedHashMap9.put("system_id", new db7("system_id", "INTEGER", true, 0, (String) null, 1));
                LinkedHashSet linkedHashSet7 = new LinkedHashSet();
                linkedHashSet7.add(new eb7("WorkSpec", "CASCADE", "CASCADE", sg3.D("work_spec_id"), sg3.D("id")));
                gb7 gb79 = new gb7("SystemIdInfo", linkedHashMap9, linkedHashSet7, new LinkedHashSet());
                gb7 q9 = wn6.q(ua62, "SystemIdInfo");
                if (!gb79.equals(q9)) {
                    return new ca("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + gb79 + "\n Found:\n" + q9, false);
                }
                LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                linkedHashMap10.put("name", new db7("name", "TEXT", true, 1, (String) null, 1));
                linkedHashMap10.put("work_spec_id", new db7("work_spec_id", "TEXT", true, 2, (String) null, 1));
                LinkedHashSet linkedHashSet8 = new LinkedHashSet();
                linkedHashSet8.add(new eb7("WorkSpec", "CASCADE", "CASCADE", sg3.D("work_spec_id"), sg3.D("id")));
                LinkedHashSet linkedHashSet9 = new LinkedHashSet();
                linkedHashSet9.add(new fb7("index_WorkName_work_spec_id", false, sg3.D("work_spec_id"), sg3.D("ASC")));
                gb7 gb710 = new gb7("WorkName", linkedHashMap10, linkedHashSet8, linkedHashSet9);
                gb7 q10 = wn6.q(ua62, "WorkName");
                if (!gb710.equals(q10)) {
                    return new ca("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + gb710 + "\n Found:\n" + q10, false);
                }
                LinkedHashMap linkedHashMap11 = new LinkedHashMap();
                linkedHashMap11.put("work_spec_id", new db7("work_spec_id", "TEXT", true, 1, (String) null, 1));
                linkedHashMap11.put("progress", new db7("progress", "BLOB", true, 0, (String) null, 1));
                LinkedHashSet linkedHashSet10 = new LinkedHashSet();
                linkedHashSet10.add(new eb7("WorkSpec", "CASCADE", "CASCADE", sg3.D("work_spec_id"), sg3.D("id")));
                gb7 gb711 = new gb7("WorkProgress", linkedHashMap11, linkedHashSet10, new LinkedHashSet());
                gb7 q11 = wn6.q(ua62, "WorkProgress");
                if (!gb711.equals(q11)) {
                    return new ca("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + gb711 + "\n Found:\n" + q11, false);
                }
                LinkedHashMap linkedHashMap12 = new LinkedHashMap();
                linkedHashMap12.put("key", new db7("key", "TEXT", true, 1, (String) null, 1));
                linkedHashMap12.put("long_value", new db7("long_value", "INTEGER", false, 0, (String) null, 1));
                gb7 gb712 = new gb7("Preference", linkedHashMap12, new LinkedHashSet(), new LinkedHashSet());
                gb7 q12 = wn6.q(ua62, "Preference");
                if (gb712.equals(q12)) {
                    return new ca((String) null, true);
                }
                return new ca("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + gb712 + "\n Found:\n" + q12, false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zk3(JetpackDatabase_Impl jetpackDatabase_Impl) {
        super(5, "1186a5595e6972d91885b0070dbfcbe6", "198fb14d9809afa5e6c8ebafccd8ec76");
        this.e = jetpackDatabase_Impl;
    }
}
