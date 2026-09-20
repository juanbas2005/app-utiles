package defpackage;

import java.util.UUID;

/* renamed from: tb9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class tb9 extends qb9 {
    public final fc9 B;

    public tb9(String str, qb9 qb9, fc9 fc9, ic9 ic9) {
        super(str, qb9, ic9);
        g75.h(fc9.c);
        this.B = fc9;
    }

    public final fc9 e() {
        return fc9.a(this.B, i());
    }

    public tb9(String str, UUID uuid, String str2, fc9 fc9, ic9 ic9) {
        super(str, uuid, str2, ic9);
        g75.h(fc9.c);
        this.B = fc9;
    }
}
