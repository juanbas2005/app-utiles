package defpackage;

import android.os.Build;

/* renamed from: s10  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s10 {
    public final boolean a;

    public s10(boolean z) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str == null) {
            ku4.j("Null osRelease");
            throw null;
        } else if (str2 != null) {
            this.a = z;
        } else {
            ku4.j("Null osCodeName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s10)) {
            return false;
        }
        s10 s10 = (s10) obj;
        String str = Build.VERSION.RELEASE;
        if (!str.equals(str)) {
            return false;
        }
        String str2 = Build.VERSION.CODENAME;
        if (!str2.equals(str2) || this.a != s10.a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((Build.VERSION.RELEASE.hashCode() ^ 1000003) * 1000003) ^ Build.VERSION.CODENAME.hashCode()) * 1000003;
        if (this.a) {
            i = 1231;
        } else {
            i = 1237;
        }
        return i ^ hashCode;
    }

    public final String toString() {
        return "OsData{osRelease=" + Build.VERSION.RELEASE + ", osCodeName=" + Build.VERSION.CODENAME + ", isRooted=" + this.a + "}";
    }
}
