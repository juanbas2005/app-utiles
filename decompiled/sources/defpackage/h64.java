package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: h64  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h64 {
    public static final List b = sg3.E(new h64(1), new h64(2), new h64(4));
    public final int a;

    public /* synthetic */ h64(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof h64) && this.a == ((h64) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 1) {
            return "CR";
        }
        if (i == 2) {
            return "LF";
        }
        if (i == 4) {
            return "CRLF";
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : b) {
            if ((((h64) next).a | i) == i) {
                arrayList.add(next);
            }
        }
        return arrayList.toString();
    }
}
