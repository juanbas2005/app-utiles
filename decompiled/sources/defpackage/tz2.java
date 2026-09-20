package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.io.File;
import java.util.List;
import java.util.Objects;

/* renamed from: tz2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tz2 implements hb1, zc2, r73, sp5, zg6, d81, ec, fs8 {
    public static final /* synthetic */ tz2 A = new tz2(20);
    public static final /* synthetic */ tz2 B = new tz2(21);
    public static final /* synthetic */ tz2 C = new tz2(23);
    public static final /* synthetic */ tz2 D = new tz2(24);
    public static final /* synthetic */ tz2 E = new tz2(25);
    public static final /* synthetic */ tz2 F = new tz2(26);
    public static final /* synthetic */ tz2 G = new tz2(27);
    public static final /* synthetic */ tz2 H = new tz2(28);
    public static final /* synthetic */ tz2 I = new tz2(29);
    public static tz2 x;
    public static final /* synthetic */ tz2 y = new tz2(18);
    public static final /* synthetic */ tz2 z = new tz2(19);
    public final /* synthetic */ int w;

    public /* synthetic */ tz2(int i) {
        this.w = i;
    }

    public static qd3 h(long j) {
        long j2 = j / 1000;
        if ((j ^ 1000) < 0 && j2 * 1000 != j) {
            j2--;
        }
        long j3 = j % 1000;
        int i = (int) ((j3 + (1000 & (((j3 ^ 1000) & ((-j3) | j3)) >> 63))) * 1000000);
        if (j2 < -31557014167219200L) {
            return qd3.y;
        }
        if (j2 > 31556889864403199L) {
            return qd3.z;
        }
        return i(j2, (long) i);
    }

    public static qd3 i(long j, long j2) {
        long j3 = j2 / 1000000000;
        if ((j2 ^ 1000000000) < 0 && j3 * 1000000000 != j2) {
            j3--;
        }
        long j4 = j + j3;
        if ((j ^ j4) >= 0 || (j3 ^ j) < 0) {
            if (j4 < -31557014167219200L) {
                return qd3.y;
            }
            if (j4 > 31556889864403199L) {
                return qd3.z;
            }
            long j5 = j2 % 1000000000;
            return new qd3(j4, (int) (j5 + ((((j5 ^ 1000000000) & ((-j5) | j5)) >> 63) & 1000000000)));
        } else if (j > 0) {
            return qd3.z;
        } else {
            return qd3.y;
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [sc0, java.lang.Object] */
    public static ae5 k(String str) {
        str.getClass();
        dg0 dg0 = f.a;
        ? obj = new Object();
        obj.o0(str);
        return f.d(obj, false);
    }

    public static ae5 l(File file) {
        String str = ae5.x;
        String file2 = file.toString();
        file2.getClass();
        return k(file2);
    }

    public static final zl8 m(long j, Object obj) {
        int i;
        zl8 zl8 = (zl8) jn8.i(j, obj);
        if (((qk8) zl8).w) {
            return zl8;
        }
        int size = zl8.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        zl8 t = zl8.t(i);
        jn8.j(obj, j, t);
        return t;
    }

    public static final CharSequence n(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public Object a() {
        switch (this.w) {
            case 18:
                List list = by8.a;
                qn8.x.get();
                return (String) rn8.a.u(4, "measurement.gbraid_campaign.campaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid").get();
            case 19:
                List list2 = by8.a;
                qn8.x.get();
                return Integer.valueOf((int) ((Long) rn8.a.s(74, 10, "measurement.upload.max_realtime_events_per_day").get()).longValue());
            case 20:
                List list3 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(52, 21600000, "measurement.sgtm.upload.retry_max_wait").get();
            case 21:
                List list4 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(48, 600000, "measurement.sgtm.upload.min_delay_after_background").get();
            case 23:
                List list5 = by8.a;
                qn8.x.get();
                return (String) rn8.a.u(8, "measurement.config.url_scheme", "https").get();
            case 24:
                List list6 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(38, 1000, "measurement.service_client.reconnect_millis").get();
            case 25:
                List list7 = by8.a;
                qn8.x.get();
                return Integer.valueOf((int) ((Long) rn8.a.s(21, 50, "measurement.experiment.max_ids").get()).longValue());
            case 26:
                List list8 = by8.a;
                qn8.x.get();
                return Integer.valueOf((int) ((Long) rn8.a.s(18, 1, "measurement.dma_consent.max_daily_dcu_realtime_events").get()).longValue());
            case 27:
                List list9 = by8.a;
                qn8.x.get();
                return (String) rn8.a.u(59, "measurement.rb.attribution.query_parameters_to_remove", "").get();
            case 28:
                List list10 = by8.a;
                qn8.x.get();
                return (Boolean) rn8.a.n(31, "measurement.config.notify_trigger_uris_on_backgrounded", true).get();
            default:
                List list11 = by8.a;
                po8 po8 = (po8) oo8.x.w.w;
                return (Boolean) po8.a.get();
        }
    }

    public String c() {
        return null;
    }

    public cc4 f(String str) {
        return sq4.w;
    }

    public void j(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", (Throwable) null);
        }
    }

    public String toString() {
        switch (this.w) {
            case 10:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    public void b() {
    }

    public void d() {
    }

    public void e(int i, Object obj) {
    }

    public void g(long j, String str) {
    }

    public void onScrollLimit(int i, int i2, int i3, boolean z2) {
    }

    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
