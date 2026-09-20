package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* renamed from: uq8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uq8 extends g89 {
    public static final String[] B = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] C = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    public static final String[] D = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] E = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;", "last_diagnostics_signal_upload_timestamp", "ALTER TABLE apps ADD COLUMN last_diagnostics_signal_upload_timestamp INTEGER;"};
    public static final String[] F = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;", "elapsed_time", "ALTER TABLE raw_events ADD COLUMN elapsed_time INTEGER;"};
    public static final String[] G = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] H = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] I = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] J = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] K = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    public static final String[] L = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    public final cp0 A = new cp0(((y19) this.w).G);
    public final tq8 z;

    public uq8(v89 v89) {
        super(v89);
        ((y19) this.w).getClass();
        this.z = new tq8(this, ((y19) this.w).w);
    }

    public static final String H1(List list) {
        if (list.isEmpty()) {
            return "";
        }
        return f21.h(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    public static final void P1(ContentValues contentValues, Object obj) {
        z65.h("value");
        z65.k(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            h.q("Invalid value type");
        }
    }

    public final String A1(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = T1().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                String string = rawQuery.getString(0);
                rawQuery.close();
                return string;
            }
            rawQuery.close();
            return "";
        } catch (SQLiteException e) {
            pz8 pz8 = ((y19) this.w).B;
            y19.g(pz8);
            pz8.B.c(str, e, "Database error");
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void B1(ContentValues contentValues) {
        y19 y19 = (y19) this.w;
        try {
            SQLiteDatabase T1 = T1();
            String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                pz8 pz8 = y19.B;
                y19.g(pz8);
                pz8.D.b("Value of the primary key is not set.", pz8.k1("app_id"));
                return;
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append("app_id = ?");
            if (((long) T1.update("consent_settings", contentValues, sb.toString(), new String[]{asString})) == 0 && T1.insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                pz8 pz82 = y19.B;
                y19.g(pz82);
                pz82.B.c(pz8.k1("consent_settings"), pz8.k1("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e) {
            pz8 pz83 = y19.B;
            y19.g(pz83);
            pz83.B.d("Error storing into table. key", pz8.k1("consent_settings"), pz8.k1("app_id"), e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0129  */
    public final qr8 C1(String str, String str2, String str3) {
        Cursor cursor;
        long j;
        Long l;
        Long l2;
        Long l3;
        Boolean bool;
        y19 y19 = (y19) this.w;
        z65.h(str2);
        z65.h(str3);
        b1();
        d1();
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{"lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"}));
        Cursor cursor2 = null;
        try {
            SQLiteDatabase T1 = T1();
            boolean z2 = false;
            cursor = T1.query(str, (String[]) arrayList.toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, (String) null, (String) null, (String) null);
            try {
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
                long j2 = cursor.getLong(0);
                long j3 = cursor.getLong(1);
                long j4 = cursor.getLong(2);
                long j5 = 0;
                if (cursor.isNull(3)) {
                    j = 0;
                } else {
                    j = cursor.getLong(3);
                }
                if (cursor.isNull(4)) {
                    l = null;
                } else {
                    l = Long.valueOf(cursor.getLong(4));
                }
                if (cursor.isNull(5)) {
                    l2 = null;
                } else {
                    l2 = Long.valueOf(cursor.getLong(5));
                }
                if (cursor.isNull(6)) {
                    l3 = null;
                } else {
                    l3 = Long.valueOf(cursor.getLong(6));
                }
                if (!cursor.isNull(7)) {
                    if (cursor.getLong(7) == 1) {
                        z2 = true;
                    }
                    bool = Boolean.valueOf(z2);
                } else {
                    bool = null;
                }
                if (!cursor.isNull(8)) {
                    j5 = cursor.getLong(8);
                }
                qr8 qr8 = new qr8(str2, str3, j2, j3, j5, j4, j, l, l2, l3, bool);
                if (cursor.moveToNext()) {
                    pz8 pz8 = y19.B;
                    y19.g(pz8);
                    pz8.B.b("Got multiple records for event aggregates, expected one. appId", pz8.k1(str2));
                }
                cursor.close();
                return qr8;
            } catch (SQLiteException e) {
                e = e;
                try {
                    pz8 pz82 = y19.B;
                    y19.g(pz82);
                    pz82.B.d("Error querying events. appId", pz8.k1(str2), y19.F.a(str3), e);
                    if (cursor != null) {
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
            pz8 pz822 = y19.B;
            y19.g(pz822);
            pz822.B.d("Error querying events. appId", pz8.k1(str2), y19.F.a(str3), e);
            if (cursor != null) {
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    public final void D1(String str, qr8 qr8) {
        long j;
        y19 y19 = (y19) this.w;
        z65.k(qr8);
        b1();
        d1();
        ContentValues contentValues = new ContentValues();
        String str2 = qr8.a;
        contentValues.put("app_id", str2);
        contentValues.put("name", qr8.b);
        contentValues.put("lifetime_count", Long.valueOf(qr8.c));
        contentValues.put("current_bundle_count", Long.valueOf(qr8.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(qr8.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(qr8.g));
        contentValues.put("last_bundled_day", qr8.h);
        contentValues.put("last_sampled_complex_event_id", qr8.i);
        contentValues.put("last_sampling_rate", qr8.j);
        contentValues.put("current_session_count", Long.valueOf(qr8.e));
        Boolean bool = qr8.k;
        if (bool == null || !bool.booleanValue()) {
            j = null;
        } else {
            j = 1L;
        }
        contentValues.put("last_exempt_from_sampling", j);
        try {
            if (T1().insertWithOnConflict(str, (String) null, contentValues, 5) == -1) {
                pz8 pz8 = y19.B;
                y19.g(pz8);
                pz8.B.b("Failed to insert/update event aggregates (got -1). appId", pz8.k1(str2));
            }
        } catch (SQLiteException e) {
            pz8 pz82 = y19.B;
            y19.g(pz82);
            pz82.B.c(pz8.k1(str2), e, "Error storing event aggregates. appId");
        }
    }

    public final void E1(String str, String str2) {
        z65.h(str2);
        b1();
        d1();
        try {
            T1().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            pz8 pz8 = ((y19) this.w).B;
            y19.g(pz8);
            pz8.B.c(pz8.k1(str2), e, "Error deleting snapshot. appId");
        }
    }

    public final x89 F1(String str, long j, byte[] bArr, String str2, String str3, int i, int i2, long j2, long j3, long j4) {
        e59 e59;
        String str4 = str3;
        int i3 = i2;
        y19 y19 = (y19) this.w;
        if (TextUtils.isEmpty(str2)) {
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.I.a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            s19 s19 = (s19) y89.N1(w19.A(), bArr);
            e59[] values = e59.values();
            int length = values.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    e59 = e59.C;
                    break;
                }
                e59 = values[i4];
                if (e59.w == i) {
                    break;
                }
                i4++;
            }
            if (!(e59 == e59.y || e59 == e59.B || i3 <= 0)) {
                ArrayList arrayList = new ArrayList();
                for (b29 k : Collections.unmodifiableList(((w19) s19.x).t())) {
                    x19 x19 = (x19) k.k();
                    x19.b();
                    ((b29) x19.x).X0(i3);
                    arrayList.add((b29) x19.d());
                }
                s19.b();
                ((w19) s19.x).F();
                s19.b();
                ((w19) s19.x).E(arrayList);
            }
            HashMap hashMap = new HashMap();
            if (str4 != null) {
                String[] split = str4.split("\r\n");
                int length2 = split.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length2) {
                        break;
                    }
                    String str5 = split[i5];
                    if (str5.isEmpty()) {
                        break;
                    }
                    String[] split2 = str5.split("=", 2);
                    if (split2.length != 2) {
                        pz8 pz82 = y19.B;
                        y19.g(pz82);
                        pz82.B.b("Invalid upload header: ", str5);
                        break;
                    }
                    hashMap.put(split2[0], split2[1]);
                    i5++;
                }
            }
            return new x89(j, (w19) s19.d(), str2, hashMap, e59, j2, j3, j4, i3);
        } catch (IOException e) {
            pz8 pz83 = y19.B;
            y19.g(pz83);
            pz83.B.c(str, e, "Failed to queued MeasurementBatch from upload_queue. appId");
            return null;
        }
    }

    public final String G1() {
        ((y19) this.w).G.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l = (Long) by8.S.a((Object) null);
        l.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + currentTimeMillis + ") > " + l + ")";
        String k = f21.k(hl6.q(currentTimeMillis, "(upload_type != 1 AND ABS(creation_timestamp - ", ") > "), ((Long) by8.R.a((Object) null)).longValue(), ")");
        StringBuilder sb = new StringBuilder(str.length() + 5 + k.length() + 1);
        f21.v(sb, "(", str, " OR ", k);
        sb.append(")");
        return sb.toString();
    }

    public final void I1(String str, h39 h39) {
        z65.k(str);
        z65.k(h39);
        b1();
        d1();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", h39.g());
        contentValues.put("consent_source", Integer.valueOf(h39.b));
        B1(contentValues);
    }

    public final List J1(String str) {
        List list;
        String str2;
        y19 y19 = (y19) this.w;
        b1();
        d1();
        ArrayList arrayList = new ArrayList();
        try {
            SQLiteDatabase T1 = T1();
            T1.beginTransaction();
            Cursor cursor = null;
            try {
                cursor = T1.query("diagnostic_signals", new String[]{"signal_name", "metadata", "count"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", (String) null);
                if (!cursor.moveToFirst()) {
                    T1.setTransactionSuccessful();
                    list = arrayList;
                } else {
                    boolean isEmpty = str.isEmpty();
                    do {
                        String string = cursor.getString(0);
                        if (cursor.isNull(1)) {
                            str2 = "";
                        } else {
                            str2 = cursor.getString(1);
                            z65.k(str2);
                        }
                        if (string == null) {
                            pz8 pz8 = y19.B;
                            y19.g(pz8);
                            pz8.B.b("Read null value from diagnostic signals table, ignoring it. appId", pz8.k1(str));
                        } else {
                            long j = cursor.getLong(2);
                            ex8 t = gx8.t();
                            t.b();
                            ((gx8) t.x).u(string);
                            t.b();
                            ((gx8) t.x).x(j);
                            t.b();
                            ((gx8) t.x).w(str2);
                            if (isEmpty) {
                                t.b();
                                ((gx8) t.x).v();
                            }
                            arrayList.add((gx8) t.d());
                        }
                    } while (cursor.moveToNext());
                    T1.delete("diagnostic_signals", "app_id=?", new String[]{str});
                    T1.setTransactionSuccessful();
                    list = arrayList;
                }
            } catch (SQLiteException e) {
                pz8 pz82 = y19.B;
                y19.g(pz82);
                pz82.B.c(pz8.k1(str), e, "Error querying or deleting diagnostic signals. appId");
                list = Collections.EMPTY_LIST;
            } catch (Throwable th) {
                Throwable th2 = th;
                if (cursor != null) {
                    cursor.close();
                }
                T1.endTransaction();
                throw th2;
            }
            if (cursor != null) {
                cursor.close();
            }
            T1.endTransaction();
            return list;
        } catch (SQLiteException e2) {
            SQLiteException sQLiteException = e2;
            pz8 pz83 = y19.B;
            y19.g(pz83);
            pz83.B.c(pz8.k1(str), sQLiteException, "Error opening database for diagnostic signals. appId");
            return Collections.EMPTY_LIST;
        }
    }

    public final void K1(String str, h39 h39) {
        z65.k(str);
        b1();
        d1();
        I1(str, w1(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", h39.g());
        B1(contentValues);
    }

    public final h39 L1(String str) {
        z65.k(str);
        b1();
        d1();
        return h39.c(100, A1("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final qr8 M1(String str, h19 h19, String str2) {
        String str3 = str;
        qr8 C1 = C1("events", str3, h19.y());
        if (C1 == null) {
            y19 y19 = (y19) this.w;
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.E.c(pz8.k1(str3), y19.F.a(str2), "Event aggregate wasn't created during raw event logging. appId, event");
            return new qr8(str3, h19.y(), 1, 1, 1, h19.A(), 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
        }
        long j = C1.e + 1;
        long j2 = C1.d + 1;
        long j3 = C1.c + 1;
        String str4 = C1.a;
        String str5 = C1.b;
        long j4 = C1.f;
        long j5 = C1.g;
        Long l = C1.h;
        Long l2 = C1.i;
        Long l3 = l2;
        return new qr8(str4, str5, j3, j2, j, j4, j5, l, l3, C1.j, C1.k);
    }

    public final boolean N1() {
        return ((y19) this.w).w.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0159 A[Catch:{ SQLiteException -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x015e A[Catch:{ SQLiteException -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    public final void O1(String str, long j, long j2, rb2 rb2) {
        String str2;
        String str3;
        String str4;
        long j3;
        int i;
        String str5;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        rb2 rb22 = rb2;
        y19 y19 = (y19) this.w;
        b1();
        d1();
        Cursor cursor = null;
        try {
            SQLiteDatabase T1 = T1();
            String str6 = "";
            if (TextUtils.isEmpty(str)) {
                int i2 = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
                if (i2 != 0) {
                    strArr3 = new String[]{String.valueOf(j2), String.valueOf(j)};
                } else {
                    strArr3 = new String[]{String.valueOf(j)};
                }
                if (i2 != 0) {
                    str6 = "rowid <= ? and ";
                }
                StringBuilder sb = new StringBuilder(str6.length() + 148);
                sb.append("select app_id, metadata_fingerprint from raw_events where ");
                sb.append(str6);
                sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                cursor = T1.rawQuery(sb.toString(), strArr3);
                try {
                    if (cursor.moveToFirst()) {
                        str2 = cursor.getString(0);
                        try {
                            str4 = cursor.getString(1);
                            cursor.close();
                        } catch (SQLiteException e) {
                            e = e;
                        }
                    } else if (cursor == null) {
                        cursor.close();
                        return;
                    } else {
                        return;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str2 = str;
                    try {
                        pz8 pz8 = y19.B;
                        y19.g(pz8);
                        pz8.B.c(pz8.k1(str2), e, "Data loss. Error selecting raw event. appId");
                        if (cursor == null) {
                        }
                    } catch (Throwable th) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
            } else {
                int i3 = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
                if (i3 != 0) {
                    str3 = str;
                    try {
                        strArr2 = new String[]{str3, String.valueOf(j2)};
                    } catch (SQLiteException e3) {
                        e = e3;
                        str2 = str3;
                        pz8 pz82 = y19.B;
                        y19.g(pz82);
                        pz82.B.c(pz8.k1(str2), e, "Data loss. Error selecting raw event. appId");
                        if (cursor == null) {
                        }
                    }
                } else {
                    str3 = str;
                    strArr2 = new String[]{str3};
                }
                if (i3 != 0) {
                    str6 = " and rowid <= ?";
                }
                StringBuilder sb2 = new StringBuilder(str6.length() + 84);
                sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                sb2.append(str6);
                sb2.append(" order by rowid limit 1;");
                cursor = T1.rawQuery(sb2.toString(), strArr2);
                if (cursor.moveToFirst()) {
                    str4 = cursor.getString(0);
                    cursor.close();
                    str2 = str3;
                } else if (cursor == null) {
                }
            }
            cursor = T1.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str2, str4}, (String) null, (String) null, "rowid", "2");
            if (!cursor.moveToFirst()) {
                pz8 pz83 = y19.B;
                y19.g(pz83);
                pz83.B.b("Raw event metadata record is missing. appId", pz8.k1(str2));
            } else {
                try {
                    b29 b29 = (b29) ((x19) y89.N1(b29.Y(), cursor.getBlob(0))).d();
                    if (cursor.moveToNext()) {
                        pz8 pz84 = y19.B;
                        y19.g(pz84);
                        pz84.E.b("Get multiple raw event metadata records, expected one. appId", pz8.k1(str2));
                    }
                    cursor.close();
                    rb22.x = b29;
                    long z1 = z1("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{str2, str4}, -1);
                    if (j2 != -1) {
                        j3 = j2;
                        i = (j3 > -1 ? 1 : (j3 == -1 ? 0 : -1));
                        if (i != 0 || z1 != -1) {
                        }
                        str5 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                        strArr = new String[]{str2, str4, String.valueOf(z1)};
                    } else if (z1 != -1) {
                        j3 = -1;
                        i = (j3 > -1 ? 1 : (j3 == -1 ? 0 : -1));
                        if (i != 0 && z1 != -1) {
                            z1 = Math.min(j3, z1);
                        } else if (i != 0) {
                            z1 = j3;
                        }
                        str5 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                        strArr = new String[]{str2, str4, String.valueOf(z1)};
                    } else {
                        str5 = "app_id = ? and metadata_fingerprint = ?";
                        strArr = new String[]{str2, str4};
                    }
                    cursor = T1.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str5, strArr, (String) null, (String) null, "rowid", (String) null);
                    if (cursor.moveToFirst()) {
                        while (true) {
                            long j4 = cursor.getLong(0);
                            byte[] blob = cursor.getBlob(3);
                            long j5 = cursor.getLong(4);
                            try {
                                f19 f19 = (f19) y89.N1(h19.J(), blob);
                                f19.n(cursor.getString(1));
                                long j6 = cursor.getLong(2);
                                f19.b();
                                ((h19) f19.x).Q(j6);
                                f19.b();
                                ((h19) f19.x).t(j5);
                                if (!rb22.c(j4, (h19) f19.d())) {
                                    break;
                                }
                            } catch (IOException e4) {
                                pz8 pz85 = y19.B;
                                y19.g(pz85);
                                pz85.B.c(pz8.k1(str2), e4, "Data loss. Failed to merge raw event. appId");
                            }
                            if (!cursor.moveToNext()) {
                                break;
                            }
                        }
                    } else {
                        pz8 pz86 = y19.B;
                        y19.g(pz86);
                        pz86.E.b("Raw event data disappeared while in transaction. appId", pz8.k1(str2));
                    }
                } catch (IOException e5) {
                    pz8 pz87 = y19.B;
                    y19.g(pz87);
                    pz87.B.c(pz8.k1(str2), e5, "Data loss. Failed to merge raw event metadata. appId");
                }
            }
        } catch (SQLiteException e6) {
            e = e6;
            str3 = str;
            str2 = str3;
            pz8 pz822 = y19.B;
            y19.g(pz822);
            pz822.B.c(pz8.k1(str2), e, "Data loss. Error selecting raw event. appId");
            if (cursor == null) {
            }
        }
        if (cursor == null) {
        }
    }

    public final void Q1() {
        d1();
        T1().beginTransaction();
    }

    public final void R1() {
        d1();
        T1().setTransactionSuccessful();
    }

    public final void S1() {
        d1();
        T1().endTransaction();
    }

    public final SQLiteDatabase T1() {
        b1();
        try {
            return this.z.getWritableDatabase();
        } catch (SQLiteException e) {
            pz8 pz8 = ((y19) this.w).B;
            y19.g(pz8);
            pz8.E.b("Error opening database", e);
            throw e;
        }
    }

    public final void U1(String str) {
        qr8 C1;
        E1("events_snapshot", str);
        Cursor cursor = null;
        try {
            cursor = T1().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (cursor.moveToFirst()) {
                do {
                    String string = cursor.getString(0);
                    if (!(string == null || (C1 = C1("events", str, string)) == null)) {
                        D1("events_snapshot", C1);
                    }
                } while (cursor.moveToNext());
            }
        } catch (SQLiteException e) {
            pz8 pz8 = ((y19) this.w).B;
            y19.g(pz8);
            pz8.B.c(pz8.k1(str), e, "Error creating snapshot. appId");
        } catch (Throwable th) {
            Throwable th2 = th;
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
        if (cursor != null) {
            cursor.close();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c1, code lost:
        if (r8 != null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0059, code lost:
        if (r8 != null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005b, code lost:
        D1("events", r8);
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d0 A[ADDED_TO_REGION] */
    public final void V1(String str) {
        boolean z2;
        boolean z3;
        qr8 C1;
        String str2 = str;
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{"name", "lifetime_count"}));
        qr8 C12 = C1("events", str2, "_f");
        qr8 C13 = C1("events", str2, "_v");
        E1("events", str2);
        Cursor cursor = null;
        boolean z4 = false;
        try {
            cursor = T1().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str2}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                cursor.close();
                if (C12 == null) {
                }
                D1("events", C12);
                E1("events_snapshot", str2);
            }
            z3 = false;
            z2 = false;
            do {
                try {
                    String string = cursor.getString(0);
                    if (cursor.getLong(1) >= 1) {
                        if ("_f".equals(string)) {
                            z3 = true;
                        } else if ("_v".equals(string)) {
                            z2 = true;
                        }
                    }
                    if (!(string == null || (C1 = C1("events_snapshot", str2, string)) == null)) {
                        D1("events", C1);
                    }
                } catch (SQLiteException e) {
                    e = e;
                    z4 = z3;
                    try {
                        pz8 pz8 = ((y19) this.w).B;
                        y19.g(pz8);
                        pz8.B.c(pz8.k1(str2), e, "Error querying snapshot. appId");
                        z3 = z4;
                        if (cursor != null) {
                        }
                        if (!z2) {
                        }
                        E1("events_snapshot", str2);
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                        }
                        if (z4) {
                        }
                        D1("events", C13);
                        E1("events_snapshot", str2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z4 = z3;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (z4 && C12 != null) {
                        D1("events", C12);
                    } else if (!z2 && C13 != null) {
                        D1("events", C13);
                    }
                    E1("events_snapshot", str2);
                    throw th;
                }
            } while (cursor.moveToNext());
            if (cursor != null) {
                cursor.close();
            }
            if (z3 || C12 == null) {
                if (!z2) {
                }
                E1("events_snapshot", str2);
            }
            D1("events", C12);
            E1("events_snapshot", str2);
        } catch (SQLiteException e2) {
            e = e2;
            z2 = false;
            pz8 pz82 = ((y19) this.w).B;
            y19.g(pz82);
            pz82.B.c(pz8.k1(str2), e, "Error querying snapshot. appId");
            z3 = z4;
            if (cursor != null) {
            }
            if (!z2) {
            }
            E1("events_snapshot", str2);
        } catch (Throwable th3) {
            th = th3;
            z2 = false;
            if (cursor != null) {
            }
            if (z4) {
            }
            D1("events", C13);
            E1("events_snapshot", str2);
            throw th;
        }
    }

    public final void W1(String str, String str2) {
        z65.h(str);
        z65.h(str2);
        b1();
        d1();
        try {
            T1().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            y19 y19 = (y19) this.w;
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.B.d("Error deleting user property. appId", pz8.k1(str), y19.F.c(str2), e);
        }
    }

    public final boolean X1(b99 b99) {
        y19 y19 = (y19) this.w;
        String str = b99.b;
        b1();
        d1();
        String str2 = b99.a;
        String str3 = b99.c;
        if (Y1(str2, str3) == null) {
            if (d99.c2(str3)) {
                if (y1("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= ((long) Math.max(Math.min(y19.z.l1(str2, by8.V), 100), 25))) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long y1 = y1("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                y19.getClass();
                if (y1 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(b99.d));
        P1(contentValues, b99.e);
        try {
            if (T1().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) != -1) {
                return true;
            }
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.B.b("Failed to insert/update user property (got -1). appId", pz8.k1(str2));
            return true;
        } catch (SQLiteException e) {
            pz8 pz82 = y19.B;
            y19.g(pz82);
            pz82.B.c(pz8.k1(str2), e, "Error storing user property. appId");
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009d  */
    public final b99 Y1(String str, String str2) {
        Throwable th;
        Cursor cursor;
        SQLiteException sQLiteException;
        String str3;
        String str4;
        y19 y19 = (y19) this.w;
        z65.h(str);
        z65.h(str2);
        b1();
        d1();
        Cursor cursor2 = null;
        try {
            cursor = T1().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, (String) null, (String) null, (String) null);
            try {
                if (cursor.moveToFirst()) {
                    long j = cursor.getLong(0);
                    Object p1 = p1(cursor, 1);
                    if (p1 != null) {
                        str4 = str;
                        str3 = str2;
                        try {
                            b99 b99 = new b99(str4, cursor.getString(2), str3, j, p1);
                            if (cursor.moveToNext()) {
                                pz8 pz8 = y19.B;
                                y19.g(pz8);
                                pz8.B.b("Got multiple records for user property, expected one. appId", pz8.k1(str4));
                            }
                            cursor.close();
                            return b99;
                        } catch (SQLiteException e) {
                            e = e;
                            sQLiteException = e;
                            try {
                                pz8 pz82 = y19.B;
                                y19.g(pz82);
                                pz82.B.d("Error querying user property. appId", pz8.k1(str4), y19.F.c(str3), sQLiteException);
                                if (cursor != null) {
                                }
                                return null;
                            } catch (Throwable th2) {
                                th = th2;
                                cursor2 = cursor;
                                if (cursor2 != null) {
                                }
                                throw th;
                            }
                        }
                    }
                }
            } catch (SQLiteException e2) {
                e = e2;
                str4 = str;
                str3 = str2;
                sQLiteException = e;
                pz8 pz822 = y19.B;
                y19.g(pz822);
                pz822.B.d("Error querying user property. appId", pz8.k1(str4), y19.F.c(str3), sQLiteException);
                if (cursor != null) {
                }
                return null;
            }
        } catch (SQLiteException e3) {
            str4 = str;
            str3 = str2;
            sQLiteException = e3;
            cursor = null;
            pz8 pz8222 = y19.B;
            y19.g(pz8222);
            pz8222.B.d("Error querying user property. appId", pz8.k1(str4), y19.F.c(str3), sQLiteException);
            if (cursor != null) {
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a0  */
    public final List Z1(String str) {
        List list;
        SQLiteException sQLiteException;
        String str2;
        y19 y19 = (y19) this.w;
        z65.h(str);
        b1();
        d1();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            y19.getClass();
            cursor = T1().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", "1000");
            list = arrayList;
            if (cursor.moveToFirst()) {
                while (true) {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str3 = string2;
                    long j = cursor.getLong(2);
                    Object p1 = p1(cursor, 3);
                    if (p1 == null) {
                        try {
                            pz8 pz8 = y19.B;
                            y19.g(pz8);
                            pz8.B.b("Read invalid user property value, ignoring it. appId", pz8.k1(str));
                            str2 = str;
                        } catch (SQLiteException e) {
                            sQLiteException = e;
                            str2 = str;
                            try {
                                pz8 pz82 = y19.B;
                                y19.g(pz82);
                                pz82.B.c(pz8.k1(str2), sQLiteException, "Error querying user properties. appId");
                                list = Collections.EMPTY_LIST;
                                if (cursor != null) {
                                }
                                return list;
                            } catch (Throwable th) {
                                Throwable th2 = th;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th2;
                            }
                        }
                    } else {
                        str2 = str;
                        try {
                            arrayList.add(new b99(str2, str3, string, j, p1));
                        } catch (SQLiteException e2) {
                            e = e2;
                            sQLiteException = e;
                            pz8 pz822 = y19.B;
                            y19.g(pz822);
                            pz822.B.c(pz8.k1(str2), sQLiteException, "Error querying user properties. appId");
                            list = Collections.EMPTY_LIST;
                            if (cursor != null) {
                            }
                            return list;
                        }
                    }
                    if (!cursor.moveToNext()) {
                        list = arrayList;
                        break;
                    }
                    str = str2;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            str2 = str;
            sQLiteException = e;
            pz8 pz8222 = y19.B;
            y19.g(pz8222);
            pz8222.B.c(pz8.k1(str2), sQLiteException, "Error querying user properties. appId");
            list = Collections.EMPTY_LIST;
            if (cursor != null) {
            }
            return list;
        }
        if (cursor != null) {
            cursor.close();
        }
        return list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c1, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0107, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010c, code lost:
        r13 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010e, code lost:
        r13 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0110, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0111, code lost:
        r5 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0135, code lost:
        r13.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c1 A[Catch:{ SQLiteException -> 0x00c3, all -> 0x00c1 }, ExcHandler: all (th java.lang.Throwable), Splitter:B:14:0x009f] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0135  */
    public final List a2(String str, String str2, String str3) {
        Cursor cursor;
        Cursor cursor2;
        List list;
        String str4;
        String string;
        String str5;
        String str6 = str3;
        y19 y19 = (y19) this.w;
        z65.h(str);
        b1();
        d1();
        ArrayList arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            String str7 = str;
            arrayList2.add(str7);
            StringBuilder sb = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                sb.append(" and origin=?");
            } else {
                String str8 = str2;
            }
            if (!TextUtils.isEmpty(str6)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str6).length() + 1);
                sb2.append(str6);
                sb2.append("*");
                arrayList2.add(sb2.toString());
                sb.append(" and name glob ?");
            }
            SQLiteDatabase T1 = T1();
            str4 = "user_attributes";
            String sb3 = sb.toString();
            y19.getClass();
            pz8 pz8 = y19.B;
            String str9 = sb3;
            cursor2 = T1.query(str4, new String[]{"name", "set_timestamp", "value", "origin"}, str9, (String[]) arrayList2.toArray(new String[arrayList2.size()]), (String) null, (String) null, "rowid", "1001");
            try {
                list = arrayList;
                if (cursor2.moveToFirst()) {
                    str4 = str2;
                    while (true) {
                        if (arrayList.size() >= 1000) {
                            y19.g(pz8);
                            pz8.B.b("Read more than the max allowed user properties, ignoring excess", 1000);
                            list = arrayList;
                            break;
                        }
                        String string2 = cursor2.getString(0);
                        long j = cursor2.getLong(1);
                        Object p1 = p1(cursor2, 2);
                        string = cursor2.getString(3);
                        if (p1 == null) {
                            y19.g(pz8);
                            pz8.B.d("(2)Read invalid user property value, ignoring it", pz8.k1(str7), string, str6);
                            str5 = string;
                        } else {
                            str5 = string;
                            arrayList.add(new b99(str, str5, string2, j, p1));
                        }
                        if (!cursor2.moveToNext()) {
                            list = arrayList;
                            break;
                        }
                        str7 = str;
                        str4 = str5;
                    }
                }
            } catch (SQLiteException e) {
                e = e;
                str5 = string;
                cursor = cursor2;
                str4 = str5;
                try {
                    pz8 pz82 = y19.B;
                    y19.g(pz82);
                    pz82.B.d("(2)Error querying user properties", pz8.k1(str), str4, e);
                    cursor2 = cursor;
                    list = Collections.EMPTY_LIST;
                    if (cursor2 != null) {
                    }
                    return list;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
            }
        } catch (SQLiteException e2) {
            e = e2;
            str4 = str2;
            cursor = null;
            pz8 pz822 = y19.B;
            y19.g(pz822);
            pz822.B.d("(2)Error querying user properties", pz8.k1(str), str4, e);
            cursor2 = cursor;
            list = Collections.EMPTY_LIST;
            if (cursor2 != null) {
            }
            return list;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
            }
            throw th;
        }
        if (cursor2 != null) {
            cursor2.close();
        }
        return list;
    }

    public final boolean b2(xn8 xn8) {
        y19 y19 = (y19) this.w;
        b1();
        d1();
        String str = xn8.w;
        z65.k(str);
        if (Y1(str, xn8.y.x) == null) {
            long y1 = y1("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            y19.getClass();
            if (y1 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", xn8.x);
        contentValues.put("name", xn8.y.x);
        Object f = xn8.y.f();
        z65.k(f);
        P1(contentValues, f);
        contentValues.put("active", Boolean.valueOf(xn8.A));
        contentValues.put("trigger_event_name", xn8.B);
        contentValues.put("trigger_timeout", Long.valueOf(xn8.D));
        zr8 zr8 = xn8.C;
        d99 d99 = y19.E;
        pz8 pz8 = y19.B;
        y19.e(d99);
        contentValues.put("timed_out_event", d99.L1(zr8));
        contentValues.put("creation_timestamp", Long.valueOf(xn8.z));
        y19.e(d99);
        contentValues.put("triggered_event", d99.L1(xn8.E));
        contentValues.put("triggered_timestamp", Long.valueOf(xn8.y.y));
        contentValues.put("time_to_live", Long.valueOf(xn8.F));
        contentValues.put("expired_event", d99.L1(xn8.G));
        try {
            if (T1().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) != -1) {
                return true;
            }
            y19.g(pz8);
            pz8.B.b("Failed to insert/update conditional user property (got -1)", pz8.k1(str));
            return true;
        } catch (SQLiteException e) {
            y19.g(pz8);
            pz8.B.c(pz8.k1(str), e, "Error storing conditional user property");
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0116  */
    public final xn8 c2(String str, String str2) {
        Cursor cursor;
        String str3;
        boolean z2;
        y19 y19 = (y19) this.w;
        z65.h(str);
        z65.h(str2);
        b1();
        d1();
        Cursor cursor2 = null;
        try {
            cursor = T1().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, (String) null, (String) null, (String) null);
            try {
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
                String string = cursor.getString(0);
                if (string == null) {
                    string = "";
                }
                String str4 = string;
                Object p1 = p1(cursor, 1);
                if (cursor.getInt(2) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String string2 = cursor.getString(3);
                long j = cursor.getLong(4);
                y89 y89 = this.x.C;
                v89.R(y89);
                byte[] blob = cursor.getBlob(5);
                Parcelable.Creator<zr8> creator = zr8.CREATOR;
                zr8 zr8 = (zr8) y89.F1(blob, creator);
                long j2 = cursor.getLong(6);
                v89.R(y89);
                zr8 zr82 = (zr8) y89.F1(cursor.getBlob(7), creator);
                long j3 = cursor.getLong(8);
                long j4 = cursor.getLong(9);
                v89.R(y89);
                str3 = str2;
                try {
                    xn8 xn8 = new xn8(str, str4, new z89(j3, p1, str3, str4), j2, z2, string2, zr8, j, zr82, j4, (zr8) y89.F1(cursor.getBlob(10), creator));
                    if (cursor.moveToNext()) {
                        pz8 pz8 = y19.B;
                        y19.g(pz8);
                        pz8.B.c(pz8.k1(str), y19.F.c(str3), "Got multiple records for conditional property, expected one");
                    }
                    cursor.close();
                    return xn8;
                } catch (SQLiteException e) {
                    e = e;
                    try {
                        pz8 pz82 = y19.B;
                        y19.g(pz82);
                        pz82.B.d("Error querying conditional property", pz8.k1(str), y19.F.c(str3), e);
                        if (cursor != null) {
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        cursor2 = cursor;
                        if (cursor2 != null) {
                        }
                        throw th;
                    }
                }
            } catch (SQLiteException e2) {
                e = e2;
                str3 = str2;
                pz8 pz822 = y19.B;
                y19.g(pz822);
                pz822.B.d("Error querying conditional property", pz8.k1(str), y19.F.c(str3), e);
                if (cursor != null) {
                }
                return null;
            }
        } catch (SQLiteException e3) {
            e = e3;
            str3 = str2;
            cursor = null;
            pz8 pz8222 = y19.B;
            y19.g(pz8222);
            pz8222.B.d("Error querying conditional property", pz8.k1(str), y19.F.c(str3), e);
            if (cursor != null) {
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    public final void d2(String str, String str2) {
        z65.h(str);
        z65.h(str2);
        b1();
        d1();
        try {
            T1().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            y19 y19 = (y19) this.w;
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.B.d("Error deleting conditional property", pz8.k1(str), y19.F.c(str2), e);
        }
    }

    public final List e2(String str, String str2, String str3) {
        z65.h(str);
        b1();
        d1();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return f2(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final void f1() {
        y19 y19 = (y19) this.w;
        if (y19.z.n1((String) null, by8.e1)) {
            r19 r19 = y19.C;
            y19.g(r19);
            r19.l1(new ge(23, (Object) this));
        }
    }

    public final List f2(String str, String[] strArr) {
        List list;
        boolean z2;
        y19 y19 = (y19) this.w;
        b1();
        d1();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            y19.getClass();
            cursor = T1().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, (String) null, (String) null, "rowid", "1001");
            list = arrayList;
            if (cursor.moveToFirst()) {
                while (true) {
                    if (arrayList.size() < 1000) {
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        String string3 = cursor.getString(2);
                        Object p1 = p1(cursor, 3);
                        if (cursor.getInt(4) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        String string4 = cursor.getString(5);
                        long j = cursor.getLong(6);
                        y89 y89 = this.x.C;
                        v89.R(y89);
                        byte[] blob = cursor.getBlob(7);
                        Parcelable.Creator<zr8> creator = zr8.CREATOR;
                        long j2 = cursor.getLong(8);
                        v89.R(y89);
                        long j3 = cursor.getLong(10);
                        long j4 = cursor.getLong(11);
                        v89.R(y89);
                        String str2 = string2;
                        arrayList.add(new xn8(string, str2, new z89(j3, p1, string3, str2), j2, z2, string4, (zr8) y89.F1(blob, creator), j, (zr8) y89.F1(cursor.getBlob(9), creator), j4, (zr8) y89.F1(cursor.getBlob(12), creator)));
                        if (!cursor.moveToNext()) {
                            list = arrayList;
                            break;
                        }
                    } else {
                        pz8 pz8 = y19.B;
                        y19.g(pz8);
                        pz8.B.b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                        list = arrayList;
                        break;
                    }
                }
            }
        } catch (SQLiteException e) {
            pz8 pz82 = y19.B;
            y19.g(pz82);
            pz82.B.b("Error querying conditional user property value", e);
            list = Collections.EMPTY_LIST;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return list;
    }

    public final long g1(String str, w19 w19, String str2, Map map, e59 e59, Long l) {
        int delete;
        String str3 = str;
        Long l2 = l;
        y19 y19 = (y19) this.w;
        b1();
        d1();
        z65.k(w19);
        z65.h(str3);
        b1();
        d1();
        if (N1()) {
            v89 v89 = this.x;
            long a = v89.E.B.a();
            xb4 xb4 = y19.G;
            pz8 pz8 = y19.B;
            xb4.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - a) > ((Long) by8.M.a((Object) null)).longValue()) {
                v89.E.B.b(elapsedRealtime);
                b1();
                d1();
                if (N1() && (delete = T1().delete("upload_queue", G1(), new String[0])) > 0) {
                    y19.g(pz8);
                    pz8.J.b("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(delete));
                }
                z65.h(str3);
                b1();
                d1();
                try {
                    int l1 = y19.z.l1(str3, by8.A);
                    if (l1 > 0) {
                        T1().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str3, String.valueOf(l1)});
                    }
                } catch (SQLiteException e) {
                    y19.g(pz8);
                    pz8.B.c(pz8.k1(str3), e, "Error deleting over the limit queued batches. appId");
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            String str5 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 1 + String.valueOf(str5).length());
            sb.append(str4);
            sb.append("=");
            sb.append(str5);
            arrayList.add(sb.toString());
        }
        byte[] a2 = w19.a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str3);
        contentValues.put("measurement_batch", a2);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", TextUtils.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(e59.w));
        xb4 xb42 = y19.G;
        pz8 pz82 = y19.B;
        xb42.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", 0);
        if (l2 != null) {
            contentValues.put("associated_row_id", l2);
        }
        try {
            long insert = T1().insert("upload_queue", (String) null, contentValues);
            if (insert != -1) {
                return insert;
            }
            y19.g(pz82);
            pz82.B.b("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str3);
            return -1;
        } catch (SQLiteException e2) {
            y19.g(pz82);
            pz82.B.c(str3, e2, "Error storing MeasurementBatch to upload_queue. appId");
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0407  */
    public final c09 g2(String str) {
        Cursor cursor;
        boolean z2;
        long j;
        boolean z3;
        boolean z4;
        long j2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        Boolean bool;
        String str2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        String str3 = str;
        y19 y19 = (y19) this.w;
        z65.h(str3);
        b1();
        d1();
        Cursor cursor2 = null;
        try {
            cursor = T1().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility", "last_diagnostics_signal_upload_timestamp"}, "app_id=?", new String[]{str3}, (String) null, (String) null, (String) null);
            try {
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
                v89 v89 = this.x;
                c09 c09 = new c09(v89.H, str3);
                y19 y192 = c09.a;
                h39 a = v89.a(str3);
                f39 f39 = f39.ANALYTICS_STORAGE;
                if (a.i(f39)) {
                    c09.G(cursor.getString(0));
                }
                boolean z14 = true;
                c09.I(cursor.getString(1));
                if (v89.a(str3).i(f39.AD_STORAGE)) {
                    c09.J(cursor.getString(2));
                }
                c09.e(cursor.getLong(3));
                c09.M(cursor.getLong(4));
                c09.N(cursor.getLong(5));
                c09.P(cursor.getString(6));
                c09.S(cursor.getString(7));
                c09.T(cursor.getLong(8));
                c09.a(cursor.getLong(9));
                if (cursor.isNull(10) || cursor.getInt(10) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c09.d(z2);
                c09.i(cursor.getLong(11));
                c09.j(cursor.getLong(12));
                c09.k(cursor.getLong(13));
                c09.l(cursor.getLong(14));
                c09.f(cursor.getLong(15));
                c09.g(cursor.getLong(16));
                if (cursor.isNull(17)) {
                    j = -2147483648L;
                } else {
                    j = (long) cursor.getInt(17);
                }
                c09.R(j);
                c09.L(cursor.getString(18));
                c09.n(cursor.getLong(19));
                c09.m(cursor.getLong(20));
                c09.w(cursor.getString(21));
                if (cursor.isNull(23) || cursor.getInt(23) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r19 r19 = y192.C;
                y19.g(r19);
                r19.b1();
                boolean z15 = c09.R;
                if (c09.p != z3) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c09.R = z15 | z4;
                c09.p = z3;
                if (cursor.isNull(25)) {
                    j2 = 0;
                } else {
                    j2 = cursor.getLong(25);
                }
                c09.c(j2);
                if (!cursor.isNull(26)) {
                    c09.y(Arrays.asList(cursor.getString(26).split(",", -1)));
                }
                if (v89.a(str3).i(f39)) {
                    String string = cursor.getString(28);
                    r19 r192 = y192.C;
                    y19.g(r192);
                    r192.b1();
                    c09.R |= !Objects.equals(c09.t, string);
                    c09.t = string;
                }
                if (cursor.isNull(29) || cursor.getInt(29) == 0) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                r19 r193 = y192.C;
                y19.g(r193);
                r193.b1();
                boolean z16 = c09.R;
                if (c09.u != z5) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                c09.R = z16 | z6;
                c09.u = z5;
                c09.r(cursor.getLong(39));
                String string2 = cursor.getString(36);
                r19 r194 = y192.C;
                y19.g(r194);
                r194.b1();
                boolean z17 = c09.R;
                if (c09.C != string2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                c09.R = z17 | z7;
                c09.C = string2;
                c09.A(cursor.getLong(30));
                c09.B(cursor.getLong(31));
                wo8.a();
                if (y19.z.n1(str3, by8.O0)) {
                    int i = cursor.getInt(32);
                    r19 r195 = y192.C;
                    y19.g(r195);
                    r195.b1();
                    boolean z18 = c09.R;
                    if (c09.x != i) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    c09.R = z18 | z13;
                    c09.x = i;
                    c09.C(cursor.getLong(35));
                }
                if (cursor.isNull(33) || cursor.getInt(33) == 0) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                r19 r196 = y192.C;
                y19.g(r196);
                r196.b1();
                boolean z19 = c09.R;
                if (c09.y != z8) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                c09.R = z19 | z9;
                c09.y = z8;
                if (cursor.isNull(34)) {
                    bool = null;
                } else {
                    if (cursor.getInt(34) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    bool = Boolean.valueOf(z12);
                }
                r19 r197 = y192.C;
                y19.g(r197);
                r197.b1();
                c09.R |= !Objects.equals(c09.q, bool);
                c09.q = bool;
                c09.p(cursor.getInt(37));
                c09.q(cursor.getInt(38));
                if (cursor.isNull(40)) {
                    str2 = "";
                } else {
                    str2 = cursor.getString(40);
                    z65.k(str2);
                }
                r19 r198 = y192.C;
                y19.g(r198);
                r198.b1();
                boolean z20 = c09.R;
                if (c09.G != str2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                c09.R = z20 | z10;
                c09.G = str2;
                if (!cursor.isNull(41)) {
                    Long valueOf = Long.valueOf(cursor.getLong(41));
                    r19 r199 = y192.C;
                    y19.g(r199);
                    r199.b1();
                    c09.R |= !Objects.equals(c09.z, valueOf);
                    c09.z = valueOf;
                }
                if (!cursor.isNull(42)) {
                    Long valueOf2 = Long.valueOf(cursor.getLong(42));
                    r19 r1910 = y192.C;
                    y19.g(r1910);
                    r1910.b1();
                    c09.R |= !Objects.equals(c09.A, valueOf2);
                    c09.A = valueOf2;
                }
                byte[] blob = cursor.getBlob(43);
                r19 r1911 = y192.C;
                y19.g(r1911);
                r1911.b1();
                boolean z21 = c09.R;
                if (c09.H != blob) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c09.R = z21 | z11;
                c09.H = blob;
                if (!cursor.isNull(44)) {
                    int i2 = cursor.getInt(44);
                    r19 r1912 = y192.C;
                    y19.g(r1912);
                    r1912.b1();
                    boolean z22 = c09.R;
                    if (c09.I == i2) {
                        z14 = false;
                    }
                    c09.R = z14 | z22;
                    c09.I = i2;
                }
                if (y19.z.n1(str3, by8.j1) && !cursor.isNull(45)) {
                    c09.u(cursor.getLong(45));
                }
                r19 r1913 = y192.C;
                y19.g(r1913);
                r1913.b1();
                c09.R = false;
                if (cursor.moveToNext()) {
                    pz8 pz8 = y19.B;
                    y19.g(pz8);
                    pz8.B.b("Got multiple records for app, expected one. appId", pz8.k1(str3));
                }
                cursor.close();
                return c09;
            } catch (SQLiteException e) {
                e = e;
                try {
                    pz8 pz82 = y19.B;
                    y19.g(pz82);
                    pz82.B.c(pz8.k1(str3), e, "Error querying app. appId");
                    if (cursor != null) {
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
            pz8 pz822 = y19.B;
            y19.g(pz822);
            pz822.B.c(pz8.k1(str3), e, "Error querying app. appId");
            if (cursor != null) {
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final List h1(String str, c89 c89, int i) {
        List list;
        String str2;
        z65.h(str);
        b1();
        d1();
        Cursor cursor = null;
        try {
            SQLiteDatabase T1 = T1();
            String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
            String H1 = H1(c89.w);
            String G1 = G1();
            StringBuilder sb = new StringBuilder(H1.length() + 17 + G1.length());
            sb.append("app_id=?");
            sb.append(H1);
            sb.append(" AND NOT ");
            sb.append(G1);
            String sb2 = sb.toString();
            String[] strArr2 = {str};
            if (i > 0) {
                str2 = String.valueOf(i);
            } else {
                str2 = cursor;
            }
            cursor = T1.query("upload_queue", strArr, sb2, strArr2, (String) null, (String) null, "creation_timestamp ASC", str2);
            ArrayList arrayList = new ArrayList();
            while (cursor.moveToNext()) {
                x89 F1 = F1(str, cursor.getLong(0), cursor.getBlob(2), cursor.getString(3), cursor.getString(4), cursor.getInt(5), cursor.getInt(6), cursor.getLong(7), cursor.getLong(8), cursor.getLong(9));
                if (F1 != null) {
                    arrayList.add(F1);
                }
            }
            list = arrayList;
        } catch (SQLiteException e) {
            pz8 pz8 = ((y19) this.w).B;
            y19.g(pz8);
            pz8.B.c(str, e, "Error to querying MeasurementBatch from upload_queue. appId");
            list = Collections.EMPTY_LIST;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return list;
    }

    public final void h2(c09 c09, boolean z2) {
        y19 y19 = (y19) this.w;
        y19 y192 = c09.a;
        b1();
        d1();
        String E2 = c09.E();
        z65.k(E2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", E2);
        f39 f39 = f39.ANALYTICS_STORAGE;
        v89 v89 = this.x;
        if (z2) {
            contentValues.put("app_instance_id", (String) null);
        } else if (v89.a(E2).i(f39)) {
            contentValues.put("app_instance_id", c09.F());
        }
        contentValues.put("gmp_app_id", c09.H());
        if (v89.a(E2).i(f39.AD_STORAGE)) {
            r19 r19 = y192.C;
            y19.g(r19);
            r19.b1();
            contentValues.put("resettable_device_id_hash", c09.e);
        }
        r19 r192 = y192.C;
        y19.g(r192);
        r192.b1();
        contentValues.put("last_bundle_index", Long.valueOf(c09.g));
        r19 r193 = y192.C;
        y19.g(r193);
        r193.b1();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c09.h));
        r19 r194 = y192.C;
        y19.g(r194);
        r194.b1();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c09.i));
        contentValues.put("app_version", c09.O());
        r19 r195 = y192.C;
        y19.g(r195);
        r195.b1();
        contentValues.put("app_store", c09.l);
        r19 r196 = y192.C;
        y19.g(r196);
        r196.b1();
        contentValues.put("gmp_version", Long.valueOf(c09.m));
        r19 r197 = y192.C;
        y19.g(r197);
        r197.b1();
        contentValues.put("dev_cert_hash", Long.valueOf(c09.n));
        r19 r198 = y192.C;
        y19.g(r198);
        r198.b1();
        contentValues.put("measurement_enabled", Boolean.valueOf(c09.o));
        r19 r199 = y192.C;
        r19 r1910 = y192.C;
        y19.g(r199);
        r199.b1();
        contentValues.put("day", Long.valueOf(c09.K));
        y19.g(r1910);
        r1910.b1();
        contentValues.put("daily_public_events_count", Long.valueOf(c09.L));
        y19.g(r1910);
        r1910.b1();
        contentValues.put("daily_events_count", Long.valueOf(c09.M));
        y19.g(r1910);
        r1910.b1();
        contentValues.put("daily_conversions_count", Long.valueOf(c09.N));
        r19 r1911 = y192.C;
        y19.g(r1911);
        r1911.b1();
        contentValues.put("config_fetched_time", Long.valueOf(c09.S));
        r19 r1912 = y192.C;
        y19.g(r1912);
        r1912.b1();
        contentValues.put("failed_config_fetch_time", Long.valueOf(c09.T));
        contentValues.put("app_version_int", Long.valueOf(c09.Q()));
        contentValues.put("firebase_instance_id", c09.K());
        y19.g(r1910);
        r1910.b1();
        contentValues.put("daily_error_events_count", Long.valueOf(c09.O));
        y19.g(r1910);
        r1910.b1();
        contentValues.put("daily_realtime_events_count", Long.valueOf(c09.P));
        y19.g(r1910);
        r1910.b1();
        contentValues.put("health_monitor_sample", c09.Q);
        contentValues.put("android_id", 0L);
        r19 r1913 = y192.C;
        y19.g(r1913);
        r1913.b1();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c09.p));
        contentValues.put("dynamite_version", Long.valueOf(c09.b()));
        if (v89.a(E2).i(f39)) {
            r19 r1914 = y192.C;
            y19.g(r1914);
            r1914.b1();
            contentValues.put("session_stitching_token", c09.t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(c09.z()));
        r19 r1915 = y192.C;
        y19.g(r1915);
        r1915.b1();
        contentValues.put("target_os_version", Long.valueOf(c09.v));
        r19 r1916 = y192.C;
        y19.g(r1916);
        r1916.b1();
        contentValues.put("session_stitching_token_hash", Long.valueOf(c09.w));
        wo8.a();
        tp8 tp8 = y19.z;
        pz8 pz8 = y19.B;
        if (tp8.n1(E2, by8.O0)) {
            r19 r1917 = y192.C;
            y19.g(r1917);
            r1917.b1();
            contentValues.put("ad_services_version", Integer.valueOf(c09.x));
            r19 r1918 = y192.C;
            y19.g(r1918);
            r1918.b1();
            contentValues.put("attribution_eligibility_status", Long.valueOf(c09.B));
        }
        r19 r1919 = y192.C;
        y19.g(r1919);
        r1919.b1();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(c09.y));
        contentValues.put("npa_metadata_value", c09.x());
        r19 r1920 = y192.C;
        y19.g(r1920);
        r1920.b1();
        contentValues.put("bundle_delivery_index", Long.valueOf(c09.F));
        contentValues.put("sgtm_preview_key", c09.D());
        y19.g(r1910);
        r1910.b1();
        contentValues.put("dma_consent_state", Integer.valueOf(c09.D));
        y19.g(r1910);
        r1910.b1();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(c09.E));
        contentValues.put("serialized_npa_metadata", c09.s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(c09.t()));
        r19 r1921 = y192.C;
        y19.g(r1921);
        r1921.b1();
        ArrayList arrayList = c09.s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                y19.g(pz8);
                pz8.E.b("Safelisted events should not be an empty list. appId", E2);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        ho8 ho8 = (ho8) go8.x.w.w;
        if (tp8.n1((String) null, by8.K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        r19 r1922 = y192.C;
        y19.g(r1922);
        r1922.b1();
        contentValues.put("unmatched_pfo", c09.z);
        r19 r1923 = y192.C;
        y19.g(r1923);
        r1923.b1();
        contentValues.put("unmatched_uwa", c09.A);
        r19 r1924 = y192.C;
        y19.g(r1924);
        r1924.b1();
        contentValues.put("ad_campaign_info", c09.H);
        if (tp8.n1(E2, by8.j1)) {
            r19 r1925 = y192.C;
            y19.g(r1925);
            r1925.b1();
            contentValues.put("last_diagnostics_signal_upload_timestamp", Long.valueOf(c09.J));
        }
        try {
            SQLiteDatabase T1 = T1();
            if (((long) T1.update("apps", contentValues, "app_id = ?", new String[]{E2})) == 0 && T1.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                y19.g(pz8);
                pz8.B.b("Failed to insert/update app (got -1). appId", pz8.k1(E2));
            }
        } catch (SQLiteException e) {
            y19.g(pz8);
            pz8.B.c(pz8.k1(E2), e, "Error storing app. appId");
        }
    }

    public final boolean i1(String str) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(new e59[]{e59.y}[0].w));
        String H1 = H1(arrayList);
        String G1 = G1();
        if (y1(pb4.n(new StringBuilder(H1.length() + 61 + G1.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", H1, " AND NOT ", G1), new String[]{str}) != 0) {
            return true;
        }
        return false;
    }

    public final kq8 i2(long j, String str, boolean z2, boolean z3, boolean z4, boolean z5) {
        return j2(j, str, 1, false, false, z2, false, z3, z4, z5);
    }

    public final void j1(Long l) {
        y19 y19 = (y19) this.w;
        b1();
        d1();
        try {
            if (T1().delete("upload_queue", "rowid=?", new String[]{l.toString()}) != 1) {
                pz8 pz8 = y19.B;
                y19.g(pz8);
                pz8.E.a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e) {
            pz8 pz82 = y19.B;
            y19.g(pz82);
            pz82.B.b("Failed to delete a MeasurementBatch in a upload_queue table", e);
            throw e;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [kq8, java.lang.Object] */
    public final kq8 j2(long j, String str, long j2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        y19 y19 = (y19) this.w;
        z65.h(str);
        b1();
        d1();
        String[] strArr = {str};
        ? obj = new Object();
        Cursor cursor = null;
        try {
            SQLiteDatabase T1 = T1();
            cursor = T1.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                pz8 pz8 = y19.B;
                y19.g(pz8);
                pz8.E.b("Not updating daily counts, app is not known. appId", pz8.k1(str));
            } else {
                if (cursor.getLong(0) == j) {
                    obj.b = cursor.getLong(1);
                    obj.a = cursor.getLong(2);
                    obj.c = cursor.getLong(3);
                    obj.d = cursor.getLong(4);
                    obj.e = cursor.getLong(5);
                    obj.f = cursor.getLong(6);
                    obj.g = cursor.getLong(7);
                }
                if (z2) {
                    obj.b += j2;
                }
                if (z3) {
                    obj.a += j2;
                }
                if (z4) {
                    obj.c += j2;
                }
                if (z5) {
                    obj.d += j2;
                }
                if (z6) {
                    obj.e += j2;
                }
                if (z7) {
                    obj.f += j2;
                }
                if (z8) {
                    obj.g += j2;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j));
                contentValues.put("daily_public_events_count", Long.valueOf(obj.a));
                contentValues.put("daily_events_count", Long.valueOf(obj.b));
                contentValues.put("daily_conversions_count", Long.valueOf(obj.c));
                contentValues.put("daily_error_events_count", Long.valueOf(obj.d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(obj.e));
                contentValues.put("daily_realtime_dcu_count", Long.valueOf(obj.f));
                contentValues.put("daily_registered_triggers_count", Long.valueOf(obj.g));
                T1.update("apps", contentValues, "app_id=?", strArr);
            }
        } catch (SQLiteException e) {
            SQLiteException sQLiteException = e;
            pz8 pz82 = y19.B;
            y19.g(pz82);
            pz82.B.c(pz8.k1(str), sQLiteException, "Error updating daily counts. appId");
        } catch (Throwable th) {
            Throwable th2 = th;
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
        if (cursor != null) {
            cursor.close();
        }
        return obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d  */
    public final String k1() {
        Cursor cursor;
        SQLiteException e;
        Cursor cursor2 = null;
        try {
            cursor = T1().rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", (String[]) null);
            try {
                if (cursor.moveToFirst()) {
                    String string = cursor.getString(0);
                    cursor.close();
                    return string;
                }
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    pz8 pz8 = ((y19) this.w).B;
                    y19.g(pz8);
                    pz8.B.b("Database error getting next bundle app id", e);
                    if (cursor != null) {
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
            pz8 pz82 = ((y19) this.w).B;
            y19.g(pz82);
            pz82.B.b("Database error getting next bundle app id", e);
            if (cursor != null) {
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b  */
    public final fm8 k2(String str) {
        Throwable th;
        Cursor cursor;
        y19 y19 = (y19) this.w;
        z65.h(str);
        b1();
        d1();
        Cursor cursor2 = null;
        try {
            cursor = T1().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            try {
                if (cursor.moveToFirst()) {
                    byte[] blob = cursor.getBlob(0);
                    String string = cursor.getString(1);
                    String string2 = cursor.getString(2);
                    if (cursor.moveToNext()) {
                        pz8 pz8 = y19.B;
                        y19.g(pz8);
                        pz8.B.b("Got multiple records for app config, expected one. appId", pz8.k1(str));
                    }
                    if (blob != null) {
                        fm8 fm8 = new fm8((Object) blob, (Serializable) string, (Object) string2, 1);
                        cursor.close();
                        return fm8;
                    }
                }
            } catch (SQLiteException e) {
                e = e;
                try {
                    pz8 pz82 = y19.B;
                    y19.g(pz82);
                    pz82.B.c(pz8.k1(str), e, "Error querying remote config. appId");
                    if (cursor != null) {
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            SQLiteException sQLiteException = e;
            cursor = null;
            pz8 pz822 = y19.B;
            y19.g(pz822);
            pz822.B.c(pz8.k1(str), e, "Error querying remote config. appId");
            if (cursor != null) {
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    public final void l1(long j) {
        b1();
        d1();
        try {
            if (T1().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) != 1) {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e) {
            pz8 pz8 = ((y19) this.w).B;
            y19.g(pz8);
            pz8.B.b("Failed to delete a bundle in a queue table", e);
            throw e;
        }
    }

    public final void l2(b29 b29, boolean z2) {
        b1();
        d1();
        z65.h(b29.t());
        if (b29.g2()) {
            m1();
            y19 y19 = (y19) this.w;
            xb4 xb4 = y19.G;
            pz8 pz8 = y19.B;
            xb4.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            long h2 = b29.h2();
            ay8 ay8 = by8.R;
            if (h2 < currentTimeMillis - ((Long) ay8.a((Object) null)).longValue() || b29.h2() > ((Long) ay8.a((Object) null)).longValue() + currentTimeMillis) {
                y19.g(pz8);
                pz8.E.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", pz8.k1(b29.t()), Long.valueOf(currentTimeMillis), Long.valueOf(b29.h2()));
            }
            byte[] a = b29.a();
            try {
                y89 y89 = this.x.C;
                v89.R(y89);
                byte[] M1 = y89.M1(a);
                y19.g(pz8);
                pz8.J.b("Saving bundle, size", Integer.valueOf(M1.length));
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", b29.t());
                contentValues.put("bundle_end_timestamp", Long.valueOf(b29.h2()));
                contentValues.put("data", M1);
                contentValues.put("has_realtime", Integer.valueOf(z2 ? 1 : 0));
                if (b29.t0()) {
                    contentValues.put("retry_count", Integer.valueOf(b29.u0()));
                }
                try {
                    if (T1().insert("queue", (String) null, contentValues) == -1) {
                        y19.g(pz8);
                        pz8.B.b("Failed to insert bundle (got -1). appId", pz8.k1(b29.t()));
                    }
                } catch (SQLiteException e) {
                    y19.g(pz8);
                    pz8.B.c(pz8.k1(b29.t()), e, "Error storing bundle. appId");
                }
            } catch (IOException e2) {
                y19.g(pz8);
                pz8.B.c(pz8.k1(b29.t()), e2, "Data loss. Failed to serialize bundle. appId");
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final void m1() {
        b1();
        d1();
        if (N1()) {
            v89 v89 = this.x;
            long a = v89.E.A.a();
            y19 y19 = (y19) this.w;
            y19.G.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - a) > ((Long) by8.M.a((Object) null)).longValue()) {
                v89.E.A.b(elapsedRealtime);
                b1();
                d1();
                if (N1()) {
                    SQLiteDatabase T1 = T1();
                    y19.G.getClass();
                    int delete = T1.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) by8.R.a((Object) null)).longValue())});
                    if (delete > 0) {
                        pz8 pz8 = y19.B;
                        y19.g(pz8);
                        pz8.J.b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    public final void n1(ArrayList arrayList) {
        y19 y19 = (y19) this.w;
        b1();
        d1();
        z65.k(arrayList);
        if (arrayList.size() == 0) {
            h.q("Given Integer is zero");
        } else if (N1()) {
            String join = TextUtils.join(",", arrayList);
            String m = f21.m(new StringBuilder(String.valueOf(join).length() + 2), "(", join, ")");
            if (y1(f21.m(new StringBuilder(m.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", m, " AND retry_count =  2147483647 LIMIT 1"), (String[]) null) > 0) {
                pz8 pz8 = y19.B;
                y19.g(pz8);
                pz8.E.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase T1 = T1();
                StringBuilder sb = new StringBuilder(m.length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(m);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                T1.execSQL(sb.toString());
            } catch (SQLiteException e) {
                pz8 pz82 = y19.B;
                y19.g(pz82);
                pz82.B.b("Error incrementing retry count. error", e);
            }
        }
    }

    public final void o1(Long l) {
        y19 y19 = (y19) this.w;
        b1();
        d1();
        if (N1()) {
            StringBuilder sb = new StringBuilder(l.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            if (y1(sb.toString(), (String[]) null) > 0) {
                pz8 pz8 = y19.B;
                y19.g(pz8);
                pz8.E.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase T1 = T1();
                y19.G.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder(String.valueOf(currentTimeMillis).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(currentTimeMillis);
                String sb3 = sb2.toString();
                StringBuilder sb4 = new StringBuilder(sb3.length() + 34 + l.toString().length() + 29);
                sb4.append("UPDATE upload_queue");
                sb4.append(sb3);
                sb4.append(" WHERE rowid = ");
                sb4.append(l);
                sb4.append(" AND retry_count < 2147483647");
                T1.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                pz8 pz82 = y19.B;
                y19.g(pz82);
                pz82.B.b("Error incrementing retry count. error", e);
            }
        }
    }

    public final Object p1(Cursor cursor, int i) {
        y19 y19 = (y19) this.w;
        int type = cursor.getType(i);
        if (type == 0) {
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.B.a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i));
            }
            if (type == 3) {
                return cursor.getString(i);
            }
            if (type != 4) {
                pz8 pz82 = y19.B;
                y19.g(pz82);
                pz82.B.b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            pz8 pz83 = y19.B;
            y19.g(pz83);
            pz83.B.a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    public final long q1(String str) {
        long j;
        y19 y19 = (y19) this.w;
        z65.h(str);
        z65.h("first_open_count");
        b1();
        d1();
        SQLiteDatabase T1 = T1();
        T1.beginTransaction();
        long j2 = 0;
        try {
            StringBuilder sb = new StringBuilder(48);
            sb.append("select first_open_count from app2 where app_id=?");
            j = -1;
            long z1 = z1(sb.toString(), new String[]{str}, -1);
            if (z1 == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", 0);
                contentValues.put("previous_install_count", 0);
                if (T1.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                    pz8 pz8 = y19.B;
                    y19.g(pz8);
                    pz8.B.c(pz8.k1(str), "first_open_count", "Failed to insert column (got -1). appId");
                    T1.endTransaction();
                    return j;
                }
                z1 = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put("first_open_count", Long.valueOf(1 + z1));
                if (((long) T1.update("app2", contentValues2, "app_id = ?", new String[]{str})) == 0) {
                    pz8 pz82 = y19.B;
                    y19.g(pz82);
                    pz82.B.c(pz8.k1(str), "first_open_count", "Failed to update column (got 0). appId");
                } else {
                    T1.setTransactionSuccessful();
                    j = z1;
                }
            } catch (SQLiteException e) {
                e = e;
                j2 = z1;
                try {
                    pz8 pz83 = y19.B;
                    y19.g(pz83);
                    pz83.B.d("Error inserting column. appId", pz8.k1(str), "first_open_count", e);
                    j = j2;
                    T1.endTransaction();
                    return j;
                } catch (Throwable th) {
                    T1.endTransaction();
                    throw th;
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            pz8 pz832 = y19.B;
            y19.g(pz832);
            pz832.B.d("Error inserting column. appId", pz8.k1(str), "first_open_count", e);
            j = j2;
            T1.endTransaction();
            return j;
        }
        T1.endTransaction();
        return j;
    }

    public final boolean r1(String str, String str2) {
        if (y1("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0) {
            return true;
        }
        return false;
    }

    public final void s1(List list) {
        z65.k(list);
        b1();
        d1();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(((Long) list.get(i)).longValue());
        }
        sb.append(")");
        int delete = T1().delete("raw_events", sb.toString(), (String[]) null);
        if (delete != list.size()) {
            pz8 pz8 = ((y19) this.w).B;
            y19.g(pz8);
            pz8.B.c(Integer.valueOf(delete), Integer.valueOf(list.size()), "Deleted fewer rows from raw events table than expected");
        }
    }

    public final long t1(String str) {
        z65.h(str);
        return z1("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    public final void u1(String str, Long l, long j, h19 h19) {
        b1();
        d1();
        z65.k(h19);
        z65.h(str);
        y19 y19 = (y19) this.w;
        byte[] a = h19.a();
        pz8 pz8 = y19.B;
        pz8 pz82 = y19.B;
        y19.g(pz8);
        pz8.J.c(y19.F.a(str), Integer.valueOf(a.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", a);
        try {
            if (T1().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) == -1) {
                y19.g(pz82);
                pz82.B.b("Failed to insert complex main event (got -1). appId", pz8.k1(str));
            }
        } catch (SQLiteException e) {
            y19.g(pz82);
            pz82.B.c(pz8.k1(str), e, "Error storing complex main event. appId");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: b29} */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v6, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: type inference failed for: r0v39, types: [nl8] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0086, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d5, code lost:
        r6 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x011c, code lost:
        r6.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:16:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02a4 A[Catch:{ SQLiteException -> 0x02c0 }] */
    public final void v1(String str, Long l, String str2, Bundle bundle) {
        md4 md4;
        String string;
        String y;
        Bundle bundle2;
        pz8 pz8;
        long update;
        ? r6;
        b29 b29;
        Cursor query;
        uq8 uq8 = this;
        String str3 = str;
        y19 y19 = (y19) uq8.w;
        z65.k(bundle);
        uq8.b1();
        uq8.d1();
        if (l != null) {
            md4 = new md4(uq8, str3, l.longValue());
        } else {
            md4 = new md4(uq8, str3);
        }
        md4 md42 = md4;
        List<oq8> d = md42.d();
        while (!d.isEmpty()) {
            for (oq8 oq8 : d) {
                if (!TextUtils.isEmpty(str2)) {
                    r6 = 0;
                    try {
                        query = uq8.T1().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, Long.toString(oq8.b)}, (String) null, (String) null, "rowid", "2");
                        try {
                            if (!query.moveToFirst()) {
                                pz8 pz82 = y19.B;
                                y19.g(pz82);
                                pz82.B.b("Raw event metadata record is missing. appId", pz8.k1(str3));
                            } else {
                                try {
                                    b29 = ((x19) y89.N1(b29.Y(), query.getBlob(0))).d();
                                    if (query.moveToNext()) {
                                        pz8 pz83 = y19.B;
                                        y19.g(pz83);
                                        pz83.E.b("Get multiple raw event metadata records, expected one. appId", pz8.k1(str3));
                                    }
                                    query.close();
                                    query.close();
                                    r6 = b29;
                                } catch (IOException e) {
                                    pz8 pz84 = y19.B;
                                    y19.g(pz84);
                                    pz84.B.c(pz8.k1(str3), e, "Data loss. Failed to merge raw event metadata. appId");
                                }
                                if (r6 != 0) {
                                    Iterator it = r6.Z1().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (((m29) it.next()).v().equals(str2)) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            }
                            query.close();
                        } catch (SQLiteException e2) {
                            e = e2;
                            b29 = null;
                        } catch (Throwable th) {
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        b29 = null;
                        try {
                            pz8 pz85 = y19.B;
                            y19.g(pz85);
                            pz85.B.c(pz8.k1(str3), e, "Data loss. Error selecting raw event. appId");
                            if (r6 != 0) {
                                r6.close();
                            }
                            r6 = b29;
                            if (r6 != 0) {
                            }
                            String str4 = str2;
                            v89 v89 = uq8.x;
                            y89 y89 = v89.C;
                            v89.R(y89);
                            h19 h19 = oq8.d;
                            Bundle bundle3 = new Bundle();
                            while (r7.hasNext()) {
                            }
                            string = bundle3.getString("_o");
                            bundle3.remove("_o");
                            y = h19.y();
                            if (string == null) {
                            }
                            d99 d99 = y19.E;
                            pz8 pz86 = y19.B;
                            y19.e(d99);
                            if (!y.equals("_cmp")) {
                            }
                            oq8 oq82 = oq8;
                            d99.p1(bundle3, bundle2);
                            h19 h192 = h19;
                            h19 h193 = h192;
                            oq8 oq83 = oq82;
                            pz8 pz87 = pz86;
                            or8 or8 = new or8((y19) uq8.w, string, str3, h192.y(), h193.A(), h193.I(), h193.C(), bundle3);
                            long j = oq83.a;
                            long j2 = oq83.b;
                            boolean z2 = oq83.c;
                            b1();
                            d1();
                            String str5 = or8.a;
                            z65.h(str5);
                            y89 y892 = v89.C;
                            v89.R(y892);
                            byte[] a = y892.C1(or8).a();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("app_id", str5);
                            contentValues.put("name", or8.b);
                            contentValues.put("timestamp", Long.valueOf(or8.d));
                            contentValues.put("metadata_fingerprint", Long.valueOf(j2));
                            contentValues.put("data", a);
                            contentValues.put("realtime", Integer.valueOf(z2));
                            contentValues.put("elapsed_time", Long.valueOf(or8.e));
                            update = (long) T1().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
                            if (update != 1) {
                            }
                            uq8 = this;
                            str3 = str;
                        } catch (Throwable th2) {
                            th = th2;
                            Cursor cursor = r6;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    }
                    if (r6 != 0) {
                    }
                }
                String str42 = str2;
                v89 v892 = uq8.x;
                y89 y893 = v892.C;
                v89.R(y893);
                h19 h194 = oq8.d;
                Bundle bundle32 = new Bundle();
                for (n19 n19 : h194.v()) {
                    if (n19.B()) {
                        bundle32.putDouble(n19.u(), n19.C());
                    } else if (n19.z()) {
                        bundle32.putFloat(n19.u(), n19.A());
                    } else if (n19.x()) {
                        bundle32.putLong(n19.u(), n19.y());
                    } else if (n19.v()) {
                        bundle32.putString(n19.u(), n19.w());
                    } else if (!n19.D().isEmpty()) {
                        bundle32.putParcelableArray(n19.u(), y89.P1(n19.D()));
                    } else {
                        pz8 pz88 = ((y19) y893.w).B;
                        y19.g(pz88);
                        pz88.B.b("Unexpected parameter type for parameter", n19);
                    }
                }
                string = bundle32.getString("_o");
                bundle32.remove("_o");
                y = h194.y();
                if (string == null) {
                    string = "";
                }
                d99 d992 = y19.E;
                pz8 pz862 = y19.B;
                y19.e(d992);
                if (!y.equals("_cmp")) {
                    bundle2 = bundle;
                    Bundle bundle4 = bundle2;
                } else {
                    Bundle bundle5 = bundle;
                    bundle2 = new Bundle(bundle5);
                    for (String next : bundle5.keySet()) {
                        oq8 oq84 = oq8;
                        if (next.startsWith("gad_")) {
                            bundle2.remove(next);
                        }
                        oq8 = oq84;
                    }
                }
                oq8 oq822 = oq8;
                d992.p1(bundle32, bundle2);
                h19 h1922 = h194;
                h19 h1932 = h1922;
                oq8 oq832 = oq822;
                pz8 pz872 = pz862;
                or8 or82 = new or8((y19) uq8.w, string, str3, h1922.y(), h1932.A(), h1932.I(), h1932.C(), bundle32);
                long j3 = oq832.a;
                long j22 = oq832.b;
                boolean z22 = oq832.c;
                b1();
                d1();
                String str52 = or82.a;
                z65.h(str52);
                y89 y8922 = v892.C;
                v89.R(y8922);
                byte[] a2 = y8922.C1(or82).a();
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str52);
                contentValues2.put("name", or82.b);
                contentValues2.put("timestamp", Long.valueOf(or82.d));
                contentValues2.put("metadata_fingerprint", Long.valueOf(j22));
                contentValues2.put("data", a2);
                contentValues2.put("realtime", Integer.valueOf(z22));
                contentValues2.put("elapsed_time", Long.valueOf(or82.e));
                try {
                    update = (long) T1().update("raw_events", contentValues2, "rowid = ?", new String[]{String.valueOf(j3)});
                    if (update != 1) {
                        y19.g(pz872);
                        pz8 = pz872;
                        try {
                            pz8.B.c(pz8.k1(str52), Long.valueOf(update), "Failed to update raw event. appId, updatedRows");
                        } catch (SQLiteException e4) {
                            e = e4;
                            y19.g(pz8);
                            pz8.B.c(pz8.k1(str52), e, "Error updating raw event. appId");
                            uq8 = this;
                            str3 = str;
                        }
                    }
                } catch (SQLiteException e5) {
                    e = e5;
                    pz8 = pz872;
                    y19.g(pz8);
                    pz8.B.c(pz8.k1(str52), e, "Error updating raw event. appId");
                    uq8 = this;
                    str3 = str;
                }
                uq8 = this;
                str3 = str;
            }
            d = md42.d();
            uq8 = this;
            str3 = str;
        }
        return;
        r6 = query;
        pz8 pz852 = y19.B;
        y19.g(pz852);
        pz852.B.c(pz8.k1(str3), e, "Data loss. Error selecting raw event. appId");
        if (r6 != 0) {
        }
        r6 = b29;
        if (r6 != 0) {
        }
        String str422 = str2;
        v89 v8922 = uq8.x;
        y89 y8932 = v8922.C;
        v89.R(y8932);
        h19 h1942 = oq8.d;
        Bundle bundle322 = new Bundle();
        while (r7.hasNext()) {
        }
        string = bundle322.getString("_o");
        bundle322.remove("_o");
        y = h1942.y();
        if (string == null) {
        }
        d99 d9922 = y19.E;
        pz8 pz8622 = y19.B;
        y19.e(d9922);
        if (!y.equals("_cmp")) {
        }
        oq8 oq8222 = oq8;
        d9922.p1(bundle322, bundle2);
        h19 h19222 = h1942;
        h19 h19322 = h19222;
        oq8 oq8322 = oq8222;
        pz8 pz8722 = pz8622;
        or8 or822 = new or8((y19) uq8.w, string, str3, h19222.y(), h19322.A(), h19322.I(), h19322.C(), bundle322);
        long j32 = oq8322.a;
        long j222 = oq8322.b;
        boolean z222 = oq8322.c;
        b1();
        d1();
        String str522 = or822.a;
        z65.h(str522);
        y89 y89222 = v8922.C;
        v89.R(y89222);
        byte[] a22 = y89222.C1(or822).a();
        ContentValues contentValues22 = new ContentValues();
        contentValues22.put("app_id", str522);
        contentValues22.put("name", or822.b);
        contentValues22.put("timestamp", Long.valueOf(or822.d));
        contentValues22.put("metadata_fingerprint", Long.valueOf(j222));
        contentValues22.put("data", a22);
        contentValues22.put("realtime", Integer.valueOf(z222));
        contentValues22.put("elapsed_time", Long.valueOf(or822.e));
        update = (long) T1().update("raw_events", contentValues22, "rowid = ?", new String[]{String.valueOf(j32)});
        if (update != 1) {
        }
        uq8 = this;
        str3 = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: h39} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        if (r3 != null) goto L_0x002e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    public final h39 w1(String str) {
        SQLiteException e;
        Cursor cursor;
        y19 y19 = (y19) this.w;
        z65.k(str);
        b1();
        d1();
        ? r2 = 0;
        try {
            cursor = T1().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str});
            try {
                if (!cursor.moveToFirst()) {
                    pz8 pz8 = y19.B;
                    y19.g(pz8);
                    pz8.J.a("No data found");
                } else {
                    r2 = h39.c(cursor.getInt(1), cursor.getString(0));
                }
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    pz8 pz82 = y19.B;
                    y19.g(pz82);
                    pz82.B.b("Error querying database.", e);
                } catch (Throwable th) {
                    th = th;
                    r2 = cursor;
                    if (r2 != 0) {
                        r2.close();
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
            pz8 pz822 = y19.B;
            y19.g(pz822);
            pz822.B.b("Error querying database.", e);
        } catch (Throwable th2) {
            th = th2;
            if (r2 != 0) {
            }
            throw th;
        }
        cursor.close();
        r2 = r2;
        if (r2 == 0) {
            return h39.c;
        }
        return r2;
    }

    public final void x1(String str, u79 u79) {
        b1();
        d1();
        z65.h(str);
        y19 y19 = (y19) this.w;
        xb4 xb4 = y19.G;
        pz8 pz8 = y19.B;
        xb4.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        ay8 ay8 = by8.u0;
        long j = u79.x;
        if (j < currentTimeMillis - ((Long) ay8.a((Object) null)).longValue() || j > ((Long) ay8.a((Object) null)).longValue() + currentTimeMillis) {
            y19.g(pz8);
            pz8.E.d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", pz8.k1(str), Long.valueOf(currentTimeMillis), Long.valueOf(j));
        }
        y19.g(pz8);
        pz8.J.a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", u79.w);
        contentValues.put("source", Integer.valueOf(u79.y));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (T1().insert("trigger_uris", (String) null, contentValues) == -1) {
                y19.g(pz8);
                pz8.B.b("Failed to insert trigger URI (got -1). appId", pz8.k1(str));
            }
        } catch (SQLiteException e) {
            y19.g(pz8);
            pz8.B.c(pz8.k1(str), e, "Error storing trigger URI. appId");
        }
    }

    public final long y1(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = T1().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                cursor.close();
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            pz8 pz8 = ((y19) this.w).B;
            y19.g(pz8);
            pz8.B.c(str, e, "Database error");
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long z1(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = T1().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                j = rawQuery.getLong(0);
            }
            rawQuery.close();
            return j;
        } catch (SQLiteException e) {
            pz8 pz8 = ((y19) this.w).B;
            y19.g(pz8);
            pz8.B.c(str, e, "Database error");
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
