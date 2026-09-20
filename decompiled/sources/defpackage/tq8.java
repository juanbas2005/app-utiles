package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;

/* renamed from: tq8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tq8 extends SQLiteOpenHelper {
    public final /* synthetic */ int w;
    public final /* synthetic */ in8 x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tq8(Context context, String str) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public final SQLiteDatabase getWritableDatabase() {
        int i = this.w;
        in8 in8 = this.x;
        switch (i) {
            case b85.b:
                uq8 uq8 = (uq8) in8;
                y19 y19 = (y19) uq8.w;
                ((y19) uq8.w).getClass();
                cp0 cp0 = uq8.A;
                if (cp0.x != 0) {
                    ((xb4) cp0.y).getClass();
                    if (SystemClock.elapsedRealtime() - cp0.x < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    ((xb4) cp0.y).getClass();
                    cp0.x = SystemClock.elapsedRealtime();
                    pz8 pz8 = y19.B;
                    y19.g(pz8);
                    pz8.B.a("Opening the database failed, dropping and recreating it");
                    if (!y19.w.getDatabasePath("google_app_measurement.db").delete()) {
                        pz8 pz82 = y19.B;
                        y19.g(pz82);
                        pz82.B.b("Failed to delete corrupted db file", "google_app_measurement.db");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        cp0.x = 0;
                        return writableDatabase;
                    } catch (SQLiteException e) {
                        pz8 pz83 = y19.B;
                        y19.g(pz83);
                        pz83.B.b("Failed to open freshly created database", e);
                        throw e;
                    }
                }
            default:
                cz8 cz8 = (cz8) in8;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e2) {
                    throw e2;
                } catch (SQLiteException unused2) {
                    y19 y192 = (y19) cz8.w;
                    pz8 pz84 = y192.B;
                    y19.g(pz84);
                    pz84.B.a("Opening the local database failed, dropping and recreating it");
                    if (!y192.w.getDatabasePath("google_app_measurement_local.db").delete()) {
                        pz8 pz85 = y192.B;
                        y19.g(pz85);
                        pz85.B.b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e3) {
                        pz8 pz86 = ((y19) cz8.w).B;
                        y19.g(pz86);
                        pz86.B.b("Failed to open local database. Events will bypass local storage", e3);
                        return null;
                    }
                }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.w;
        in8 in8 = this.x;
        switch (i) {
            case b85.b:
                pz8 pz8 = ((y19) ((uq8) in8).w).B;
                y19.g(pz8);
                t35.F(pz8, sQLiteDatabase);
                return;
            default:
                pz8 pz82 = ((y19) ((cz8) in8).w).B;
                y19.g(pz82);
                t35.F(pz82, sQLiteDatabase);
                return;
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.w;
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        int i = this.w;
        in8 in8 = this.x;
        switch (i) {
            case b85.b:
                SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                y19 y19 = (y19) ((uq8) in8).w;
                pz8 pz8 = y19.B;
                y19.g(pz8);
                t35.D(pz8, sQLiteDatabase2, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", uq8.B);
                pz8 pz82 = y19.B;
                y19.g(pz82);
                t35.D(pz82, sQLiteDatabase2, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", (String[]) null);
                y19.g(pz82);
                t35.D(pz82, sQLiteDatabase2, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", (String[]) null);
                y19.g(pz82);
                t35.D(pz82, sQLiteDatabase2, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", uq8.D);
                y19.g(pz82);
                t35.D(pz82, sQLiteDatabase2, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", uq8.E);
                y19.g(pz82);
                t35.D(pz82, sQLiteDatabase2, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", uq8.G);
                y19.g(pz82);
                t35.D(pz82, sQLiteDatabase2, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", (String[]) null);
                y19.g(pz82);
                t35.D(pz82, sQLiteDatabase2, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", uq8.F);
                y19.g(pz82);
                t35.D(pz82, sQLiteDatabase2, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", uq8.H);
                y19.g(pz82);
                t35.D(pz82, sQLiteDatabase2, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", uq8.I);
                y19.g(pz82);
                t35.D(pz82, sQLiteDatabase2, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", (String[]) null);
                y19.g(pz82);
                t35.D(pz82, sQLiteDatabase2, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", uq8.J);
                y19.g(pz82);
                t35.D(pz82, sQLiteDatabase2, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", (String[]) null);
                y19.g(pz82);
                t35.D(pz82, sQLiteDatabase2, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", (String[]) null);
                y19.g(pz82);
                t35.D(pz82, sQLiteDatabase2, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", uq8.K);
                wo8.a();
                y19.g(pz82);
                t35.D(pz82, sQLiteDatabase2, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", uq8.L);
                y19.g(pz82);
                t35.D(pz82, sQLiteDatabase2, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", uq8.C);
                y19.g(pz82);
                t35.D(pz82, sQLiteDatabase2, "diagnostic_signals", "CREATE TABLE IF NOT EXISTS diagnostic_signals ( app_id TEXT NOT NULL, signal_name TEXT NOT NULL, metadata TEXT NOT NULL, count INTEGER NOT NULL, last_increment_timestamp INTEGER NOT NULL);", "app_id,signal_name,metadata,count,last_increment_timestamp", (String[]) null);
                fo8 fo8 = (fo8) eo8.x.w.w;
                y19.g(pz82);
                t35.D(pz82, sQLiteDatabase2, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", (String[]) null);
                return;
            default:
                pz8 pz83 = ((y19) ((cz8) in8).w).B;
                y19.g(pz83);
                t35.D(pz83, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", cz8.A);
                return;
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.w;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public tq8(cz8 cz8, Context context) {
        this(context, "google_app_measurement_local.db");
        this.w = 1;
        this.x = cz8;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public tq8(uq8 uq8, Context context) {
        this(context, "google_app_measurement.db");
        this.w = 0;
        this.x = uq8;
    }

    private final void a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void k(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void l(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void o(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
