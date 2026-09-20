package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: px8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class px8 implements fs8, e12 {
    public static final /* synthetic */ px8 x = new px8(0);
    public static final /* synthetic */ px8 y = new px8(1);
    public final /* synthetic */ int w;

    public /* synthetic */ px8(int i) {
        this.w = i;
    }

    public Object a() {
        switch (this.w) {
            case b85.b:
                List list = by8.a;
                wo8.x.get();
                return (Boolean) xo8.a.n(6, "measurement.rb.attribution.service", true).get();
            default:
                List list2 = by8.a;
                bp8 bp8 = (bp8) ap8.x.w.w;
                return (Boolean) bp8.a.get();
        }
    }

    public d12 b(Context context, String str, c12 c12) {
        d12 d12 = new d12();
        int f = c12.f(context, str);
        d12.a = f;
        if (f != 0) {
            d12.c = -1;
            return d12;
        }
        int b = c12.b(context, str, true);
        d12.b = b;
        if (b != 0) {
            d12.c = 1;
        }
        return d12;
    }
}
