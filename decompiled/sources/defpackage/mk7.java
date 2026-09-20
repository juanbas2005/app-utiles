package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;

/* renamed from: mk7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mk7 {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String a;
    public final String b;
    public final String c;

    public mk7(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        }
        if (str3 == null || !d.matcher(str3).matches()) {
            h.q(f21.h("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
            throw null;
        }
        this.a = str3;
        this.b = str;
        this.c = pb4.l(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mk7)) {
            return false;
        }
        mk7 mk7 = (mk7) obj;
        if (!this.a.equals(mk7.a) || !this.b.equals(mk7.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }
}
