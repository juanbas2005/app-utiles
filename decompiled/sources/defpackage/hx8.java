package defpackage;

import com.google.android.gms.internal.measurement.zzvr;
import java.util.List;
import java.util.UUID;

/* renamed from: hx8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class hx8 implements fs8 {
    public static final /* synthetic */ hx8 x = new hx8(0);
    public static final /* synthetic */ hx8 y = new hx8(1);
    public static final /* synthetic */ hx8 z = new hx8(2);
    public final /* synthetic */ int w;

    public /* synthetic */ hx8(int i) {
        this.w = i;
    }

    public static cc9 b(String str) {
        boolean z2;
        jc9 jc9;
        fc9 fc9 = ec9.e;
        ic9 c = vb9.c();
        jc9 jc92 = c.b;
        if (jc92 == bc9.C) {
            jc92 = null;
            vb9.b(c, (jc9) null);
            z2 = true;
        } else {
            z2 = false;
        }
        if (jc92 == null) {
            UUID b = wb9.c.b();
            String a = qb9.a(b);
            zzvr zzvr = zb9.C;
            s93 s93 = (s93) vb9.a.get();
            if (!s93.isEmpty()) {
                s93.forEach(new zp8(2));
            }
            jc9 = new ac9(b, a, str, fc9, zzvr, c);
        } else {
            String str2 = str;
            if (jc92 instanceof sb9) {
                jc9 = ((sb9) jc92).U(str2, fc9, false, c);
            } else {
                jc9 = jc92.S(str2, fc9, c);
            }
        }
        vb9.b(c, jc9);
        return new cc9(jc9, z2);
    }

    public Object a() {
        switch (this.w) {
            case b85.b:
                List list = by8.a;
                ho8 ho8 = (ho8) go8.x.w.w;
                return (Boolean) ho8.b.get();
            case 1:
                List list2 = by8.a;
                wo8.x.get();
                return (Boolean) xo8.a.n(4, "measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true).get();
            default:
                no8 no8 = (no8) mo8.x.w.w;
                return new Boolean(((Boolean) no8.b.get()).booleanValue());
        }
    }
}
