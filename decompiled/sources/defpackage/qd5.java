package defpackage;

import java.util.List;

/* renamed from: qd5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qd5 {
    public final List a;
    public final List b;

    public qd5(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(dt0.E0(this.a, ", ", (String) null, (String) null, (vr2) null, 62));
        sb.append('(');
        return hl6.o(sb, dt0.E0(this.b, ";", (String) null, (String) null, (vr2) null, 62), ')');
    }
}
