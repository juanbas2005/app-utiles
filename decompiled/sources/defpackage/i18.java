package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: i18  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i18 {
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static i18 c;
    public final tz2 a;

    public i18(tz2 tz2) {
        this.a = tz2;
    }

    public final boolean a(g10 g10) {
        if (TextUtils.isEmpty(g10.c)) {
            return true;
        }
        this.a.getClass();
        if (g10.f + g10.e < (System.currentTimeMillis() / 1000) + 3600) {
            return true;
        }
        return false;
    }
}
