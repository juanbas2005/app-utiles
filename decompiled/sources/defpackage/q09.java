package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;

/* renamed from: q09  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q09 extends y29 {
    public static final Pair V = new Pair("", 0L);
    public rb2 A;
    public final l09 B = new l09(this, "first_open_time", 0);
    public final l90 C;
    public String D;
    public boolean E;
    public long F;
    public final l09 G = new l09(this, "session_timeout", 1800000);
    public final h09 H = new h09(this, "start_new_session", true);
    public final l90 I = new l90(this, "non_personalized_ads");
    public final no7 J = new no7(this, "last_received_uri_timestamps_by_source");
    public final h09 K = new h09(this, "allow_remote_dynamite", false);
    public final l09 L = new l09(this, "last_pause_time", 0);
    public final l09 M = new l09(this, "session_id", 0);
    public boolean N;
    public final h09 O;
    public final h09 P;
    public final l09 Q;
    public final l90 R;
    public final l90 S;
    public final l09 T;
    public final no7 U;
    public SharedPreferences y;
    public SharedPreferences z;

    public q09(y19 y19) {
        super(y19);
        z65.h("app_install_time");
        this.C = new l90(this, "app_instance_id");
        this.O = new h09(this, "app_backgrounded", false);
        this.P = new h09(this, "deep_link_retrieval_complete", false);
        this.Q = new l09(this, "deep_link_retrieval_attempts", 0);
        this.R = new l90(this, "firebase_feature_rollouts");
        this.S = new l90(this, "deferred_attribution_cache");
        this.T = new l09(this, "deferred_attribution_cache_timestamp", 0);
        this.U = new no7(this, "default_event_parameters");
    }

    public final boolean d1() {
        return true;
    }

    public final SharedPreferences g1() {
        b1();
        e1();
        z65.k(this.y);
        return this.y;
    }

    public final SharedPreferences h1() {
        b1();
        e1();
        if (this.z == null) {
            y19 y19 = (y19) this.w;
            String valueOf = String.valueOf(y19.w.getPackageName());
            pz8 pz8 = y19.B;
            y19.g(pz8);
            mz8 mz8 = pz8.J;
            String concat = valueOf.concat("_preferences");
            mz8.b("Default prefs file", concat);
            this.z = y19.w.getSharedPreferences(concat, 0);
        }
        return this.z;
    }

    public final SparseArray i1() {
        Bundle e = this.J.e();
        int[] intArray = e.getIntArray("uriSources");
        long[] longArray = e.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            pz8 pz8 = ((y19) this.w).B;
            y19.g(pz8);
            pz8.B.a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    public final h39 j1() {
        b1();
        return h39.c(g1().getInt("consent_source", 100), g1().getString("consent_settings", "G1"));
    }

    public final void k1(boolean z2) {
        b1();
        pz8 pz8 = ((y19) this.w).B;
        y19.g(pz8);
        pz8.J.b("App measurement setting deferred collection", Boolean.valueOf(z2));
        SharedPreferences.Editor edit = g1().edit();
        edit.putBoolean("deferred_analytics_collection", z2);
        edit.apply();
    }

    public final boolean l1(long j) {
        if (j - this.G.a() > this.L.a()) {
            return true;
        }
        return false;
    }
}
