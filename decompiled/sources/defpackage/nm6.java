package defpackage;

import com.google.firebase.sessions.SessionData;
import com.google.firebase.sessions.SessionDetails;
import com.google.firebase.sessions.Time;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

/* renamed from: nm6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nm6 implements tl6 {
    public final wm6 w;

    public nm6(wm6 wm6) {
        wm6.getClass();
        this.w = wm6;
    }

    public final Object M(FileInputStream fileInputStream) {
        try {
            ol3 ol3 = pl3.d;
            String k0 = k57.k0(bb0.v0(fileInputStream));
            ol3.getClass();
            return (SessionData) ol3.b(SessionData.Companion.serializer(), k0);
        } catch (Exception e) {
            throw new IOException("Cannot parse session data", e);
        }
    }

    public final Object l() {
        return new SessionData(this.w.a((SessionDetails) null), (Time) null, (Map) null, 6, (hl1) null);
    }

    public final Object m0(Object obj, ls7 ls7, v6 v6Var) {
        ls7.w.write(k57.l0(pl3.d.d(SessionData.Companion.serializer(), (SessionData) obj)));
        return vs7.a;
    }
}
