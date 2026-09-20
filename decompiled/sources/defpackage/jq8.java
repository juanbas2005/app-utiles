package defpackage;

/* renamed from: jq8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jq8 extends lq8 {
    public static final lq8 e;

    static {
        lq8 lq8 = new lq8((lq8) null, new zt6(0));
        if (!lq8.c) {
            lq8.c = true;
            e = lq8;
            zt6 zt6 = new zt6(0);
            lq8 lq82 = new lq8(lq8, zt6);
            boolean z = lq82.c;
            Boolean bool = Boolean.TRUE;
            if (z) {
                h.s("Can't mutate after handing to trace");
            } else if (!lq82.a()) {
                zt6.put(lq8.d, bool);
                if (!lq82.c) {
                    lq82.c = true;
                } else {
                    h.s("Already frozen");
                }
            } else {
                h.s("Key already present");
            }
        } else {
            h.s("Already frozen");
        }
    }
}
