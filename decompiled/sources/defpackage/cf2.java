package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: cf2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cf2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public cf2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        boolean z;
        int i = c57.a;
        if (str == null || str.trim().isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        z65.m("ApplicationId must be set.", true ^ z);
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    public static cf2 a(Context context) {
        s47 s47 = new s47(context);
        String a2 = s47.a("google_app_id");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return new cf2(a2, s47.a("google_api_key"), s47.a("firebase_database_url"), s47.a("ga_trackingId"), s47.a("gcm_defaultSenderId"), s47.a("google_storage_bucket"), s47.a("recaptcha_site_key"), s47.a("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cf2)) {
            return false;
        }
        cf2 cf2 = (cf2) obj;
        if (!b35.j(this.b, cf2.b) || !b35.j(this.a, cf2.a) || !b35.j(this.c, cf2.c) || !b35.j(this.d, cf2.d) || !b35.j(this.e, cf2.e) || !b35.j(this.f, cf2.f) || !b35.j(this.g, cf2.g) || !b35.j(this.h, cf2.h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g, this.h});
    }

    public final String toString() {
        hv2 hv2 = new hv2(20, (Object) this);
        hv2.k0("applicationId", this.b);
        hv2.k0("apiKey", this.a);
        hv2.k0("databaseUrl", this.c);
        hv2.k0("gcmSenderId", this.e);
        hv2.k0("storageBucket", this.f);
        hv2.k0("recaptchaSiteKey", this.g);
        hv2.k0("projectId", this.h);
        return hv2.toString();
    }
}
