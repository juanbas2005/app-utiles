package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: dx8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class dx8 implements fs8, e12 {
    public static final /* synthetic */ dx8 x = new dx8(0);
    public static final /* synthetic */ dx8 y = new dx8(1);
    public static final /* synthetic */ dx8 z = new dx8(2);
    public final /* synthetic */ int w;

    public /* synthetic */ dx8(int i) {
        this.w = i;
    }

    public Object a() {
        switch (this.w) {
            case b85.b:
                List list = by8.a;
                tn8 tn8 = (tn8) sn8.x.w.w;
                return Integer.valueOf((int) ((Long) tn8.a.get()).longValue());
            case 1:
                List list2 = by8.a;
                wo8.x.get();
                return (Boolean) xo8.a.n(8, "measurement.rb.attribution.uuid_generation", true).get();
            default:
                List list3 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(0, 10000, "measurement.ad_id_cache_time").get();
        }
    }

    public d12 b(Context context, String str, c12 c12) {
        int i;
        d12 d12 = new d12();
        int f = c12.f(context, str);
        d12.a = f;
        int i2 = 1;
        int i3 = 0;
        if (f != 0) {
            i = c12.b(context, str, false);
            d12.b = i;
        } else {
            i = c12.b(context, str, true);
            d12.b = i;
        }
        int i4 = d12.a;
        if (i4 != 0) {
            i3 = i4;
        } else if (i == 0) {
            i2 = 0;
            d12.c = i2;
            return d12;
        }
        if (i3 >= i) {
            i2 = -1;
        }
        d12.c = i2;
        return d12;
    }
}
