package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: xm7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xm7 {
    public final HashMap a = new HashMap();
    public final View b;
    public final ArrayList c = new ArrayList();

    public xm7(View view) {
        this.b = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = (defpackage.xm7) r3;
     */
    public final boolean equals(Object obj) {
        xm7 xm7;
        if (!(obj instanceof xm7) || this.b != xm7.b || !this.a.equals(xm7.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        String concat = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n").concat("    values:");
        HashMap hashMap = this.a;
        for (String str : hashMap.keySet()) {
            concat = concat + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return concat;
    }
}
