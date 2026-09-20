package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.Map;

/* renamed from: f46  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f46 implements qo6 {
    public static final int g = ((int) u02.j(gl0.e0(24, y02.HOURS), y02.SECONDS));
    public static final k26 h = new k26("com/google/firebase/sessions//");
    public final mi7 a;
    public final we2 b;
    public final hr c;
    public final g46 d;
    public final eo6 e;
    public final qq4 f = new qq4();

    static {
        xb4 xb4 = u02.x;
    }

    public f46(mi7 mi7, we2 we2, hr hrVar, g46 g46, eo6 eo6) {
        mi7.getClass();
        we2.getClass();
        hrVar.getClass();
        g46.getClass();
        eo6.getClass();
        this.a = mi7;
        this.b = we2;
        this.c = hrVar;
        this.d = g46;
        this.e = eo6;
    }

    public final Boolean a() {
        return this.e.a().getSessionsEnabled();
    }

    /* JADX WARNING: type inference failed for: r4v10, types: [oq4] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0073, code lost:
        if (r1.a(r3) == r12) goto L_0x0140;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007d A[Catch:{ all -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008a A[SYNTHETIC, Splitter:B:38:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a9 A[Catch:{ all -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final Object b(f61 f61) {
        e46 e46;
        int i;
        eo6 eo6;
        oq4 oq4;
        oq4 oq42;
        String str;
        qq4 qq4;
        f61 f612 = f61;
        if (f612 instanceof e46) {
            e46 = (e46) f612;
            int i2 = e46.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e46.C = i2 - Integer.MIN_VALUE;
                Object obj = e46.A;
                i = e46.C;
                eo6 = this.e;
                Object obj2 = vs7.a;
                Object obj3 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    qq4 = this.f;
                    if (!qq4.f() && !eo6.b()) {
                        return obj2;
                    }
                    e46.z = qq4;
                    e46.C = 1;
                } else if (i == 1) {
                    ? r4 = e46.z;
                    o85.q(obj);
                    qq4 = r4;
                } else if (i == 2) {
                    oq42 = e46.z;
                    try {
                        o85.q(obj);
                        str = ((nd3) obj).a;
                        if (!str.equals("")) {
                            Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                            oq42.k((Object) null);
                            return obj2;
                        }
                        yb5 yb5 = new yb5("X-Crashlytics-Installation-ID", str);
                        k26 k26 = h;
                        yb5 yb52 = new yb5("X-Crashlytics-Device-Model", k26.g(Build.MANUFACTURER + Build.MODEL, ""));
                        String str2 = Build.VERSION.INCREMENTAL;
                        str2.getClass();
                        yb5 yb53 = new yb5("X-Crashlytics-OS-Build-Version", k26.g(str2, ""));
                        String str3 = Build.VERSION.RELEASE;
                        str3.getClass();
                        yb5 yb54 = new yb5("X-Crashlytics-OS-Display-Version", k26.g(str3, ""));
                        this.c.getClass();
                        Map V = sf4.V(yb5, yb52, yb53, yb54, new yb5("X-Crashlytics-API-Client-Version", "3.0.6"));
                        Log.d("FirebaseSessions", "Fetching settings from server.");
                        g46 g46 = this.d;
                        k05 k05 = new k05((Object) this, (f61) null, 8);
                        da0 da0 = new da0(2, (f61) null, 4);
                        e46.z = oq42;
                        e46.C = 3;
                        Object e0 = ar7.e0(g46.b, new ng(g46, V, k05, da0, (f61) null, 14), e46);
                        if (e0 != obj3) {
                            e0 = obj2;
                        }
                        if (e0 != obj3) {
                            oq4 = oq42;
                            oq4.k((Object) null);
                            return obj2;
                        }
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        oq4 = oq42;
                    }
                } else if (i == 3) {
                    oq4 = e46.z;
                    try {
                        o85.q(obj);
                        oq4.k((Object) null);
                        return obj2;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (eo6.b()) {
                    Log.d("FirebaseSessions", "Remote settings cache not expired. Using cached values.");
                    qq4.k((Object) null);
                    return obj2;
                }
                jv2 jv2 = nd3.c;
                we2 we2 = this.b;
                e46.z = qq4;
                e46.C = 2;
                Object g2 = jv2.g(we2, e46);
                if (g2 != obj3) {
                    Object obj4 = g2;
                    oq42 = qq4;
                    obj = obj4;
                    str = ((nd3) obj).a;
                    if (!str.equals("")) {
                    }
                }
                return obj3;
            }
        }
        e46 = new e46(this, (h61) f612);
        Object obj5 = e46.A;
        i = e46.C;
        eo6 = this.e;
        Object obj22 = vs7.a;
        Object obj32 = p81.w;
        if (i != 0) {
        }
        try {
            if (eo6.b()) {
            }
        } catch (Throwable th3) {
            th = th3;
            oq4 = qq4;
            oq4.k((Object) null);
            throw th;
        }
    }

    public final u02 c() {
        Integer sessionTimeoutSeconds = this.e.a().getSessionTimeoutSeconds();
        if (sessionTimeoutSeconds == null) {
            return null;
        }
        xb4 xb4 = u02.x;
        return new u02(gl0.e0(sessionTimeoutSeconds.intValue(), y02.SECONDS));
    }

    public final Double d() {
        return this.e.a().getSessionSamplingRate();
    }
}
