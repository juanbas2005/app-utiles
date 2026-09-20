package defpackage;

import com.google.firebase.sessions.settings.SessionConfigs;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: km6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class km6 implements tl6 {
    public static final km6 w = new Object();
    public static final SessionConfigs x = new SessionConfigs((Boolean) null, (Double) null, (Integer) null, (Integer) null, (Long) null);

    public final Object M(FileInputStream fileInputStream) {
        try {
            ol3 ol3 = pl3.d;
            String k0 = k57.k0(bb0.v0(fileInputStream));
            ol3.getClass();
            return (SessionConfigs) ol3.b(SessionConfigs.Companion.serializer(), k0);
        } catch (Exception e) {
            throw new IOException("Cannot parse session configs", e);
        }
    }

    public final Object l() {
        return x;
    }

    public final Object m0(Object obj, ls7 ls7, v6 v6Var) {
        ls7.w.write(k57.l0(pl3.d.d(SessionConfigs.Companion.serializer(), (SessionConfigs) obj)));
        return vs7.a;
    }
}
