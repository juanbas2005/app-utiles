package defpackage;

import java.util.ArrayList;

/* renamed from: ig6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ig6 {
    public final ArrayList a;
    public final ArrayList b;
    public final eg6 c;
    public final ArrayList d;

    public ig6(ArrayList arrayList, ArrayList arrayList2, eg6 eg6, ArrayList arrayList3) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = eg6;
        this.d = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ig6.class != obj.getClass()) {
            return false;
        }
        ig6 ig6 = (ig6) obj;
        if (!this.a.equals(ig6.a) || !this.b.equals(ig6.b) || !sg3.e(this.c, ig6.c) || !this.d.equals(ig6.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() * 31) + (this.a.hashCode() * 31);
        return (this.d.hashCode() * 31) + (this.c.hashCode() * 31) + hashCode;
    }

    public final String toString() {
        return "SceneState(entries=" + this.a + ", overlayScenes=" + this.b + ", currentScene=" + this.c + ", previousScenes=" + this.d + ')';
    }
}
