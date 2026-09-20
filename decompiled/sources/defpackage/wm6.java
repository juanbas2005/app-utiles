package defpackage;

import com.google.firebase.sessions.SessionDetails;
import java.util.Locale;
import java.util.UUID;

/* renamed from: wm6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wm6 {
    public final mi7 a;
    public final q18 b;

    public wm6(mi7 mi7, q18 q18) {
        mi7.getClass();
        q18.getClass();
        this.a = mi7;
        this.b = q18;
    }

    public final SessionDetails a(SessionDetails sessionDetails) {
        String str;
        int i;
        String firstSessionId;
        this.b.getClass();
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        String uuid = randomUUID.toString();
        uuid.getClass();
        String lowerCase = k57.s0(uuid, "-", "").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (sessionDetails == null || (firstSessionId = sessionDetails.getFirstSessionId()) == null) {
            str = lowerCase;
        } else {
            str = firstSessionId;
        }
        if (sessionDetails != null) {
            i = sessionDetails.getSessionIndex() + 1;
        } else {
            i = 0;
        }
        int i2 = i;
        this.a.getClass();
        return new SessionDetails(lowerCase, str, i2, mi7.a().getUs());
    }
}
