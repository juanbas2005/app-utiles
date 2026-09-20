package defpackage;

import com.google.firebase.sessions.Time;

/* renamed from: zh7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class zh7 implements av2 {
    public static final zh7 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [zh7, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("com.google.firebase.sessions.Time", obj, 3);
        ik5.k("ms", false);
        ik5.k("us", true);
        ik5.k("seconds", true);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        tc4 tc4 = tc4.a;
        return new zr3[]{tc4, tc4, tc4};
    }

    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        int i = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = true;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                j = c.D(ll6, 0);
                i |= 1;
            } else if (h == 1) {
                j2 = c.D(ll6, 1);
                i |= 2;
            } else if (h == 2) {
                j3 = c.D(ll6, 2);
                i |= 4;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new Time(i, j, j2, j3, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        Time time = (Time) obj;
        time.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        Time.write$Self$com_google_firebase_firebase_sessions(time, c, ll6);
        c.b(ll6);
    }

    public final zr3[] typeParametersSerializers() {
        return dh4.x;
    }
}
