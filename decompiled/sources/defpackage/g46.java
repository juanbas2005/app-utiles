package defpackage;

import android.net.Uri;
import java.net.URL;

/* renamed from: g46  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g46 {
    public final hr a;
    public final e81 b;

    public g46(hr hrVar, e81 e81) {
        hrVar.getClass();
        e81.getClass();
        this.a = hrVar;
        this.b = e81;
    }

    public static final URL a(g46 g46) {
        g46.getClass();
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        hr hrVar = g46.a;
        Uri.Builder appendPath2 = appendPath.appendPath(hrVar.a).appendPath("settings");
        jd jdVar = hrVar.b;
        return new URL(appendPath2.appendQueryParameter("build_version", jdVar.c).appendQueryParameter("display_version", jdVar.b).build().toString());
    }
}
