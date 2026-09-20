package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* renamed from: jd  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jd {
    public final String a;
    public final String b;
    public final String c;
    public final ep5 d;
    public final ArrayList e;

    public jd(String str, String str2, String str3, ep5 ep5, ArrayList arrayList) {
        String str4 = Build.MANUFACTURER;
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ep5;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd)) {
            return false;
        }
        jd jdVar = (jd) obj;
        if (!this.a.equals(jdVar.a) || !sg3.e(this.b, jdVar.b) || !sg3.e(this.c, jdVar.c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        if (sg3.e(str, str) && this.d.equals(jdVar.d) && this.e.equals(jdVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int h = hl6.h(hl6.h(hl6.h(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, Build.MANUFACTURER);
        return this.e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
