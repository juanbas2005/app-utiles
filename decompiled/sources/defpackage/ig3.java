package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lig3;", "Lpl4;", "Ljg3;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ig3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class ig3 extends pl4 {
    public final boolean equals(Object obj) {
        ig3 ig3;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ig3) {
            ig3 = (ig3) obj;
        } else {
            ig3 = null;
        }
        if (ig3 == null) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [ll4, jg3, ng3] */
    public final ll4 g() {
        ? ng3 = new ng3(0);
        ng3.L = mg3.w;
        ng3.M = true;
        return ng3;
    }

    public final void h(ll4 ll4) {
        jg3 jg3 = (jg3) ll4;
        jg3.L = mg3.w;
        jg3.M = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (mg3.w.hashCode() * 31);
    }
}
