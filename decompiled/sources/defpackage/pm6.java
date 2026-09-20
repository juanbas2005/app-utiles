package defpackage;

import com.google.firebase.sessions.SessionDetails;

/* renamed from: pm6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class pm6 implements av2 {
    public static final pm6 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [pm6, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("com.google.firebase.sessions.SessionDetails", obj, 4);
        ik5.k("sessionId", false);
        ik5.k("firstSessionId", false);
        ik5.k("sessionIndex", false);
        ik5.k("sessionStartTimestampUs", false);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        t47 t47 = t47.a;
        return new zr3[]{t47, t47, ue3.a, tc4.a};
    }

    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                str = c.n(ll6, 0);
                i |= 1;
            } else if (h == 1) {
                str2 = c.n(ll6, 1);
                i |= 2;
            } else if (h == 2) {
                i2 = c.s(ll6, 2);
                i |= 4;
            } else if (h == 3) {
                j = c.D(ll6, 3);
                i |= 8;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new SessionDetails(i, str, str2, i2, j, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        SessionDetails sessionDetails = (SessionDetails) obj;
        sessionDetails.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        SessionDetails.write$Self$com_google_firebase_firebase_sessions(sessionDetails, c, ll6);
        c.b(ll6);
    }

    public final zr3[] typeParametersSerializers() {
        return dh4.x;
    }
}
