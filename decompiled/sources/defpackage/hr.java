package defpackage;

import android.os.Build;

/* renamed from: hr  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hr {
    public final String a;
    public final jd b;

    public hr(String str, jd jdVar) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = jdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr)) {
            return false;
        }
        hr hrVar = (hr) obj;
        if (!sg3.e(this.a, hrVar.a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!sg3.e(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        if (sg3.e(str2, str2) && this.b.equals(hrVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int h = hl6.h((((Build.MODEL.hashCode() + (this.a.hashCode() * 31)) * 31) + 48517565) * 31, 31, Build.VERSION.RELEASE);
        return this.b.hashCode() + ((qb4.x.hashCode() + h) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.6, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + qb4.x + ", androidAppInfo=" + this.b + ')';
    }
}
