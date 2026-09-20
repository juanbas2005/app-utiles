package defpackage;

import java.util.List;

/* renamed from: nx8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class nx8 implements fs8, vl8 {
    public static final /* synthetic */ nx8 x = new nx8(0);
    public static final /* synthetic */ nx8 y = new nx8(1);
    public static final /* synthetic */ nx8 z = new nx8(2);
    public final /* synthetic */ int w;

    public /* synthetic */ nx8(int i) {
        this.w = i;
    }

    public Object a() {
        switch (this.w) {
            case b85.b:
                List list = by8.a;
                jp8 jp8 = (jp8) ip8.x.w.w;
                return (Boolean) jp8.a.get();
            case 1:
                List list2 = by8.a;
                bp8 bp8 = (bp8) ap8.x.w.w;
                return (Boolean) bp8.b.get();
            default:
                hp8 hp8 = (hp8) gp8.x.w.w;
                return new Boolean(((Boolean) hp8.a.get()).booleanValue());
        }
    }
}
