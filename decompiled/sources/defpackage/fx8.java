package defpackage;

import java.util.List;

/* renamed from: fx8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class fx8 implements fs8, y36 {
    public static final /* synthetic */ fx8 A = new fx8(3);
    public static final /* synthetic */ fx8 x = new fx8(0);
    public static final /* synthetic */ fx8 y = new fx8(1);
    public static final /* synthetic */ fx8 z = new fx8(2);
    public final /* synthetic */ int w;

    public /* synthetic */ fx8(int i) {
        this.w = i;
    }

    public Object a() {
        switch (this.w) {
            case b85.b:
                List list = by8.a;
                ho8 ho8 = (ho8) go8.x.w.w;
                return (Boolean) ho8.a.get();
            case 1:
                List list2 = by8.a;
                wo8.x.get();
                return (Boolean) xo8.a.n(7, "measurement.rb.attribution.enable_trigger_redaction", true).get();
            default:
                no8 no8 = (no8) mo8.x.w.w;
                return new Boolean(((Boolean) no8.a.get()).booleanValue());
        }
    }

    public /* synthetic */ void accept(Object obj, Object obj2) {
        xb7 xb7 = (xb7) obj2;
        f49 f49 = (f49) obj;
        int i = b49.l;
    }
}
