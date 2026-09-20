package defpackage;

/* renamed from: ia7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ia7 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ String x;
    public final /* synthetic */ int y;

    public /* synthetic */ ia7(int i, String str) {
        this.w = 2;
        this.y = i;
        this.x = str;
    }

    public final Object y(Object obj) {
        ga7 ga7;
        int i = this.w;
        vs7 vs7 = vs7.a;
        String str = this.x;
        int i2 = this.y;
        ua6 ua6 = (ua6) obj;
        switch (i) {
            case b85.b:
                ua6.getClass();
                ab6 k0 = ua6.k0("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    k0.F(1, str);
                    k0.f((long) i2, 2);
                    int n = u55.n(k0, "work_spec_id");
                    int n2 = u55.n(k0, "generation");
                    int n3 = u55.n(k0, "system_id");
                    if (k0.i0()) {
                        ga7 = new ga7((int) k0.getLong(n2), (int) k0.getLong(n3), k0.R(n));
                    } else {
                        ga7 = null;
                    }
                    return ga7;
                } finally {
                    k0.close();
                }
            case 1:
                ua6.getClass();
                ab6 k02 = ua6.k0("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    k02.F(1, str);
                    k02.f((long) i2, 2);
                    k02.i0();
                    return vs7;
                } finally {
                    k02.close();
                }
            default:
                ua6.getClass();
                ab6 k03 = ua6.k0("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    k03.f((long) i2, 1);
                    k03.F(2, str);
                    k03.i0();
                    return vs7;
                } finally {
                    k03.close();
                }
        }
    }

    public /* synthetic */ ia7(int i, int i2, String str) {
        this.w = i2;
        this.x = str;
        this.y = i;
    }
}
