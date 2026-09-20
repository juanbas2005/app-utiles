package defpackage;

import android.util.Log;
import com.google.firebase.sessions.ProcessData;
import com.google.firebase.sessions.SessionData;
import com.google.firebase.sessions.Time;
import java.util.Map;
import java.util.Objects;

/* renamed from: es6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class es6 {
    public final rn6 a;
    public final wm6 b;
    public final vm6 c;
    public final mi7 d;
    public final qe1 e;
    public final dp5 f;
    public final e81 g;
    public SessionData h;
    public boolean i;
    public boolean j;
    public String k = "";

    public es6(rn6 rn6, wm6 wm6, vm6 vm6, mi7 mi7, qe1 qe1, dp5 dp5, e81 e81) {
        rn6.getClass();
        wm6.getClass();
        vm6.getClass();
        mi7.getClass();
        qe1.getClass();
        dp5.getClass();
        e81.getClass();
        this.a = rn6;
        this.b = wm6;
        this.c = vm6;
        this.d = mi7;
        this.e = qe1;
        this.f = dp5;
        this.g = e81;
        ar7.H(gl0.E(e81), (e81) null, (r81) null, new as6(this, (f61) null, 0), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    public static final Object a(es6 es6, String str, bs6 bs6, f61 f61) {
        ds6 ds6;
        int i2;
        String str2;
        if (f61 instanceof ds6) {
            ds6 = (ds6) f61;
            int i3 = ds6.D;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ds6.D = i3 - Integer.MIN_VALUE;
                Object obj = ds6.B;
                p81 p81 = p81.w;
                i2 = ds6.D;
                if (i2 != 0) {
                    o85.q(obj);
                    if (sg3.e(es6.k, str)) {
                        return vs7.a;
                    }
                    es6.k = str;
                    zf2 zf2 = zf2.a;
                    ds6.z = str;
                    ds6.A = bs6;
                    ds6.D = 1;
                    obj = zf2.b(ds6);
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    bs6 = ds6.A;
                    str = ds6.z;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                for (h91 h91 : ((Map) obj).values()) {
                    on6 on6 = new on6(str);
                    h91.getClass();
                    String str3 = "App Quality Sessions session changed: " + on6;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str3, (Throwable) null);
                    }
                    wr0 wr0 = h91.b;
                    synchronized (wr0) {
                        if (!Objects.equals((String) wr0.z, str)) {
                            wr0.V((md2) wr0.x, (String) wr0.y, str);
                            wr0.z = str;
                        }
                    }
                    int ordinal = bs6.ordinal();
                    if (ordinal == 0) {
                        str2 = "Notified " + nn6.w + " of new session " + str;
                    } else if (ordinal == 1) {
                        str2 = "Notified " + nn6.w + " of new fallback session " + str;
                    } else {
                        h.c();
                        return null;
                    }
                    Log.d("FirebaseSessions", str2);
                }
                return vs7.a;
            }
        }
        ds6 = new ds6(es6, f61);
        Object obj2 = ds6.B;
        p81 p812 = p81.w;
        i2 = ds6.D;
        if (i2 != 0) {
        }
        while (r5.hasNext()) {
        }
        return vs7.a;
    }

    public final void b() {
        this.i = false;
        if (this.h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f.a());
        ar7.H(gl0.E(this.g), (e81) null, (r81) null, new as6(this, (f61) null, 1), 3);
    }

    public final void c() {
        this.i = true;
        SessionData sessionData = this.h;
        if (sessionData == null) {
            this.j = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
        } else if (sessionData != null) {
            Log.d("FirebaseSessions", "App foregrounded on " + this.f.a());
            if (e(sessionData) || d(sessionData)) {
                ar7.H(gl0.E(this.g), (e81) null, (r81) null, new k05(this, sessionData, (f61) null, 17), 3);
            }
        } else {
            sg3.a0("localSessionData");
            throw null;
        }
    }

    public final boolean d(SessionData sessionData) {
        Map<String, ProcessData> processDataMap = sessionData.getProcessDataMap();
        boolean z = true;
        dp5 dp5 = this.f;
        if (processDataMap != null) {
            dp5.getClass();
            ProcessData processData = processDataMap.get(dp5.a());
            if (processData != null && processData.getPid() == dp5.c && sg3.e(processData.getUuid(), (String) dp5.d.getValue())) {
                z = false;
            }
            if (z) {
                Log.d("FirebaseSessions", "Process " + dp5.a() + " is stale");
            }
            return z;
        }
        Log.d("FirebaseSessions", "No process data for " + dp5.a());
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (defpackage.u02.g(r8) == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        if (defpackage.u02.g(r8) == false) goto L_0x0054;
     */
    public final boolean e(SessionData sessionData) {
        long j2;
        Time backgroundTime = sessionData.getBackgroundTime();
        boolean z = false;
        if (backgroundTime != null) {
            this.d.getClass();
            long r4 = mi7.a().m17minus5sfh64U(backgroundTime);
            rn6 rn6 = this.a;
            u02 c2 = rn6.a.c();
            if (c2 != null) {
                j2 = c2.w;
                xb4 xb4 = u02.x;
                if (j2 > 0) {
                }
            }
            u02 c3 = rn6.b.c();
            if (c3 != null) {
                j2 = c3.w;
                xb4 xb42 = u02.x;
                if (j2 > 0) {
                }
            }
            xb4 xb43 = u02.x;
            j2 = gl0.e0(30, y02.MINUTES);
            if (u02.c(r4, j2) > 0) {
                z = true;
            }
            if (z) {
                Log.d("FirebaseSessions", "Session " + sessionData.getSessionDetails().getSessionId() + " is expired");
            }
            return z;
        }
        Log.d("FirebaseSessions", "Session " + sessionData.getSessionDetails().getSessionId() + " has not backgrounded yet");
        return false;
    }
}
