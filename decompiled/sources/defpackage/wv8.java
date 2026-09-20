package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* renamed from: wv8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wv8 {
    public final Set a;

    public wv8(Level level, Set set, or2 or2) {
        this.a = set;
    }

    public final f76 a(String str) {
        f76 f76 = new f76(str);
        if (str.length() > 23) {
            int i = -1;
            int length = str.length() - 1;
            while (true) {
                if (length < 0) {
                    break;
                }
                char charAt = str.charAt(length);
                if (charAt == '.' || charAt == '$') {
                    i = length;
                } else {
                    length--;
                }
            }
            i = length;
            str = str.substring(i + 1);
        }
        String concat = "".concat(str);
        concat.substring(0, Math.min(concat.length(), 23));
        return f76;
    }
}
