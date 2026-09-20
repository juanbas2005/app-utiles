package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: j56  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j56 extends vk4 {
    public final /* synthetic */ int c = 1;
    public final Context d;

    public j56(Context context) {
        super(9, 10);
        this.d = context;
    }

    public final void a(ir2 ir2) {
        int i = this.c;
        Context context = this.d;
        ir2.getClass();
        switch (i) {
            case b85.b:
                if (this.b >= 10) {
                    ir2.v(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                ir2.u("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = 0;
                    long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0);
                    if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                        j = 1;
                    }
                    ir2.a();
                    try {
                        ir2.v(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                        ir2.v(new Object[]{"reschedule_needed", Long.valueOf(j)});
                        sharedPreferences.edit().clear().apply();
                        ir2.B();
                    } finally {
                        ir2.o();
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i2 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i3 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    ir2.a();
                    try {
                        ir2.v(new Object[]{"next_job_scheduler_id", Integer.valueOf(i2)});
                        ir2.v(new Object[]{"next_alarm_manager_id", Integer.valueOf(i3)});
                        sharedPreferences2.edit().clear().apply();
                        ir2.B();
                        return;
                    } finally {
                        ir2.o();
                    }
                } else {
                    return;
                }
        }
    }

    public j56(Context context, int i, int i2) {
        super(i, i2);
        this.d = context;
    }
}
