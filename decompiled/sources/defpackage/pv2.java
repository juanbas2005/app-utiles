package defpackage;

import android.os.Bundle;
import java.util.Set;

/* renamed from: pv2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pv2 {
    public final Bundle a;
    public final Bundle b;
    public final Set c = g42.w;
    public final String d;
    public final String e;

    public pv2(String str) {
        Bundle T = tf4.T(str);
        Bundle T2 = tf4.T(str);
        this.a = T;
        this.b = T2;
        T.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        T2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        T.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 500);
        T2.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 500);
        this.d = "107402597829-jcid33bdpvf5rvatm8m5tga0cbulpu3p.apps.googleusercontent.com";
        this.e = str;
    }
}
