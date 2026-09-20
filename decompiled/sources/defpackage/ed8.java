package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;

/* renamed from: ed8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ed8 extends vk4 {
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ed8(int i) {
        super(14, 15);
        this.c = i;
        switch (i) {
            case 1:
                super(19, 20);
                this.d = new pe2(21);
                return;
            default:
                this.d = new g22(21);
                return;
        }
    }

    public final void b(ua6 ua6) {
        long j;
        String str;
        int i = this.c;
        ua6.getClass();
        switch (i) {
            case b85.b:
                l55.m(ua6, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                l55.m(ua6, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                l55.m(ua6, "DROP TABLE `WorkSpec`");
                l55.m(ua6, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                l55.m(ua6, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                l55.m(ua6, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                if (ua6 instanceof h87) {
                    ir2 ir2 = ((h87) ua6).w;
                    ir2.getClass();
                    ir2.u("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
                    int i2 = 0;
                    Object[] objArr = new Object[0];
                    if (contentValues.size() != 0) {
                        int size = contentValues.size();
                        int length = objArr.length + size;
                        Object[] objArr2 = new Object[length];
                        StringBuilder sb = new StringBuilder("UPDATE ");
                        sb.append(ir2.x[3]);
                        sb.append("WorkSpec SET ");
                        int i3 = 0;
                        for (String next : contentValues.keySet()) {
                            if (i3 > 0) {
                                str = ",";
                            } else {
                                str = "";
                            }
                            sb.append(str);
                            sb.append(next);
                            objArr2[i3] = contentValues.get(next);
                            sb.append("=?");
                            i3++;
                        }
                        for (int i4 = size; i4 < length; i4++) {
                            objArr2[i4] = objArr[i4 - size];
                        }
                        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                            sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
                        }
                        qr2 l = ir2.l(sb.toString());
                        while (i2 < length) {
                            Object obj = objArr2[i2];
                            i2++;
                            if (obj == null) {
                                l.m(i2);
                            } else if (obj instanceof byte[]) {
                                l.w.bindBlob(i2, (byte[]) obj);
                            } else if (obj instanceof Float) {
                                l.W((double) ((Number) obj).floatValue(), i2);
                            } else if (obj instanceof Double) {
                                l.W(((Number) obj).doubleValue(), i2);
                            } else if (obj instanceof Long) {
                                l.f(((Number) obj).longValue(), i2);
                            } else if (obj instanceof Integer) {
                                l.f((long) ((Number) obj).intValue(), i2);
                            } else if (obj instanceof Short) {
                                l.f((long) ((Number) obj).shortValue(), i2);
                            } else if (obj instanceof Byte) {
                                l.f((long) ((Number) obj).byteValue(), i2);
                            } else if (obj instanceof String) {
                                l.w.bindString(i2, (String) obj);
                            } else if (obj instanceof Boolean) {
                                if (((Boolean) obj).booleanValue()) {
                                    j = 1;
                                } else {
                                    j = 0;
                                }
                                l.f(j, i2);
                            } else {
                                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i2 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                            }
                        }
                        l.x.executeUpdateDelete();
                        return;
                    }
                    h.q("Empty values");
                    return;
                }
                return;
            default:
                l55.m(ua6, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                l55.m(ua6, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                l55.m(ua6, "DROP TABLE `WorkSpec`");
                l55.m(ua6, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                l55.m(ua6, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                l55.m(ua6, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                if (ua6 instanceof h87) {
                    ir2 ir22 = ((h87) ua6).w;
                    ir22.getClass();
                    ir22.u("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
                    return;
                }
                return;
        }
    }
}
