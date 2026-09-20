package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: q27  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q27 extends yo7 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q27(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    public boolean a() {
        switch (this.c) {
            case 1:
                return false;
            default:
                return super.a();
        }
    }

    public boolean e() {
        switch (this.c) {
            case 1:
                return ((Map) this.d).isEmpty();
            default:
                return super.e();
        }
    }

    public final xp7 g(wo7 wo7) {
        int i = this.c;
        Object obj = this.d;
        wo7.getClass();
        switch (i) {
            case b85.b:
                if (!((ArrayList) obj).contains(wo7)) {
                    return null;
                }
                vq0 u = wo7.u();
                u.getClass();
                return iq7.j((qp7) u);
            default:
                return (xp7) ((Map) obj).get(wo7);
        }
    }
}
