package defpackage;

import com.google.firebase.sessions.SessionData;
import com.google.firebase.sessions.SessionDetails;
import com.google.firebase.sessions.Time;
import java.util.Map;

/* renamed from: lm6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class lm6 implements av2 {
    public static final lm6 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [lm6, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("com.google.firebase.sessions.SessionData", obj, 3);
        ik5.k("sessionDetails", false);
        ik5.k("backgroundTime", true);
        ik5.k("processDataMap", true);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        nz3[] access$get$childSerializers$cp = SessionData.$childSerializers;
        return new zr3[]{pm6.a, hj8.x(zh7.a), hj8.x((zr3) access$get$childSerializers$cp[2].getValue())};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: com.google.firebase.sessions.SessionDetails} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: com.google.firebase.sessions.Time} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.util.Map} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        nz3[] access$get$childSerializers$cp = SessionData.$childSerializers;
        boolean z = true;
        int i = 0;
        SessionDetails sessionDetails = null;
        Time time = null;
        Map map = null;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                sessionDetails = c.r(ll6, 0, pm6.a, sessionDetails);
                i |= 1;
            } else if (h == 1) {
                time = c.x(ll6, 1, zh7.a, time);
                i |= 2;
            } else if (h == 2) {
                map = c.x(ll6, 2, (zr3) access$get$childSerializers$cp[2].getValue(), map);
                i |= 4;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new SessionData(i, sessionDetails, time, map, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        SessionData sessionData = (SessionData) obj;
        sessionData.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        SessionData.write$Self$com_google_firebase_firebase_sessions(sessionData, c, ll6);
        c.b(ll6);
    }

    public final zr3[] typeParametersSerializers() {
        return dh4.x;
    }
}
