package defpackage;

import java.util.ArrayList;

/* renamed from: rd7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rd7 {
    public static final rd7 b = new rd7(0);
    public static final rd7 c = new rd7(1);
    public static final rd7 d = new rd7(2);
    public final int a;

    public rd7(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof rd7) && this.a == ((rd7) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return f21.h("TextDecoration[", i84.a(arrayList, ", ", (tm3) null, 62), "]");
        }
        Object obj = arrayList.get(0);
        return "TextDecoration." + obj;
    }
}
