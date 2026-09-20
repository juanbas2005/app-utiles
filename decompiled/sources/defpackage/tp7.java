package defpackage;

import java.util.List;

/* renamed from: tp7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tp7 extends cs3 {
    public volatile List A;
    public final String y = "PluginConfigT";
    public final ks3 z = ks3.w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tp7(Object obj) {
        super(obj);
        obj.getClass();
    }

    public final String b() {
        return this.y;
    }

    public final ks3 c() {
        return this.z;
    }

    public final List getUpperBounds() {
        List list = this.A;
        if (list != null) {
            return list;
        }
        List D = sg3.D(b26.a());
        this.A = D;
        return D;
    }
}
