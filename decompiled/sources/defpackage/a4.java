package defpackage;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: a4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a4 {
    public static final String[] g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    public static final SimpleDateFormat h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    public final String a;
    public final String b;
    public final String c;
    public final Date d;
    public final long e;
    public final long f;

    public a4(String str, String str2, String str3, Date date, long j, long j2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = date;
        this.e = j;
        this.f = j2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [zb, java.lang.Object] */
    public final zb a() {
        ? obj = new Object();
        obj.a = "frc";
        obj.m = this.d.getTime();
        obj.b = this.a;
        obj.c = this.b;
        String str = this.c;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        obj.d = str;
        obj.e = this.e;
        obj.j = this.f;
        return obj;
    }
}
