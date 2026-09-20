package defpackage;

/* renamed from: tk3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class tk3 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ long x;
    public final /* synthetic */ String y;

    public /* synthetic */ tk3(int i, long j, String str) {
        this.w = i;
        this.x = j;
        this.y = str;
    }

    /* JADX INFO: finally extract failed */
    public final Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        String str = this.y;
        long j = this.x;
        ua6 ua6 = (ua6) obj;
        switch (i) {
            case b85.b:
                ua6.getClass();
                ab6 k0 = ua6.k0("UPDATE jetpacks SET needsSync = 0, syncAction = 'NONE', lastSynced = ? WHERE id = ?");
                try {
                    k0.f(j, 1);
                    k0.F(2, str);
                    k0.i0();
                    return vs7;
                } finally {
                    k0.close();
                }
            case 1:
                ua6.getClass();
                ab6 k02 = ua6.k0("UPDATE nauta_accounts SET lastUsed = ? WHERE email = ?");
                try {
                    k02.f(j, 1);
                    k02.F(2, str);
                    k02.i0();
                    return vs7;
                } finally {
                    k02.close();
                }
            case 2:
                ua6.getClass();
                ab6 k03 = ua6.k0("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    k03.f(j, 1);
                    k03.F(2, str);
                    k03.i0();
                    int k = o55.k(ua6);
                    k03.close();
                    return Integer.valueOf(k);
                } catch (Throwable th) {
                    k03.close();
                    throw th;
                }
            default:
                ua6.getClass();
                ab6 k04 = ua6.k0("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    k04.f(j, 1);
                    k04.F(2, str);
                    k04.i0();
                    return vs7;
                } finally {
                    k04.close();
                }
        }
    }
}
