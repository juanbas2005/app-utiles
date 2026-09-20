package defpackage;

import android.net.Uri;

/* renamed from: i31  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i31 {
    public final Uri a;
    public final boolean b;

    public i31(boolean z, Uri uri) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!i31.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        i31 i31 = (i31) obj;
        if (this.a.equals(i31.a) && this.b == i31.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
