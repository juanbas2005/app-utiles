package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: l14  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l14 {
    public final vw3 a;
    public final List b;
    public final ArrayList c;
    public final List d;

    public l14(vw3 vw3, List list, ArrayList arrayList, List list2) {
        this.a = vw3;
        this.b = list;
        this.c = arrayList;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l14)) {
            return false;
        }
        l14 l14 = (l14) obj;
        if (this.a.equals(l14.a) && this.b.equals(l14.b) && this.c.equals(l14.c) && this.d.equals(l14.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + hl6.i((this.c.hashCode() + hl6.j(this.b, this.a.hashCode() * 961, 31)) * 31, 31, false);
    }

    public final String toString() {
        return "MethodSignatureData(returnType=" + this.a + ", receiverType=null, valueParameters=" + this.b + ", typeParameters=" + this.c + ", hasStableParameterNames=false, errors=" + this.d + ')';
    }
}
