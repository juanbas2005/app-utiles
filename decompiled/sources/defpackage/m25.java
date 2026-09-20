package defpackage;

import android.os.Build;

/* renamed from: m25  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m25 {
    public static final z97 a = new z97(new jk4(21));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m25)) {
            return false;
        }
        String str = Build.VERSION.RELEASE;
        if (!sg3.e(str, str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        String str = Build.VERSION.RELEASE;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return -868680815 + i;
    }

    public final String toString() {
        return hl6.o(new StringBuilder("OSInformation(name=Android, version="), Build.VERSION.RELEASE, ')');
    }
}
