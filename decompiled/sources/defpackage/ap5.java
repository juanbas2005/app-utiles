package defpackage;

import com.google.firebase.sessions.ProcessData;

/* renamed from: ap5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ap5 implements av2 {
    public static final ap5 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [ap5, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("com.google.firebase.sessions.ProcessData", obj, 2);
        ik5.k("pid", false);
        ik5.k("uuid", false);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        return new zr3[]{ue3.a, t47.a};
    }

    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        String str = null;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                i2 = c.s(ll6, 0);
                i |= 1;
            } else if (h == 1) {
                str = c.n(ll6, 1);
                i |= 2;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new ProcessData(i, i2, str, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        ProcessData processData = (ProcessData) obj;
        processData.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        ProcessData.write$Self$com_google_firebase_firebase_sessions(processData, c, ll6);
        c.b(ll6);
    }

    public final zr3[] typeParametersSerializers() {
        return dh4.x;
    }
}
