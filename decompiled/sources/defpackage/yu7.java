package defpackage;

import cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences;
import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import kotlinx.serialization.SerializationException;

/* renamed from: yu7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yu7 implements tl6 {
    public static final yu7 w = new Object();
    public static final km3 x = pd8.b(new ha7(19));
    public static final UserDataPreferences y = new UserDataPreferences((String) null, (String) null, (String) null, (DarkThemeConfigPreferences) null, false, false, 0, false, (List) null, (String) null, false, false, false, false, false, false, false, false, false, false, false, false, (List) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, (String) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, false, false, false, false, false, false, false, false, 0, (String) null, (String) null, (String) null, (String) null, (String) null, -1, -1, (hl1) null);

    public final Object M(FileInputStream fileInputStream) {
        try {
            return x.b(UserDataPreferences.Companion.serializer(), k57.k0(bb0.v0(fileInputStream)));
        } catch (SerializationException e) {
            throw new IOException("Unable to read UserPrefs", e);
        }
    }

    public final Object l() {
        return y;
    }

    public final Object m0(Object obj, ls7 ls7, v6 v6Var) {
        dn1 dn1 = aw1.a;
        Object e0 = ar7.e0(cm1.y, new xu7(ls7, (UserDataPreferences) obj, (f61) null), v6Var);
        if (e0 == p81.w) {
            return e0;
        }
        return vs7.a;
    }
}
