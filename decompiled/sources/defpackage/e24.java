package defpackage;

import java.util.Comparator;

/* renamed from: e24  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e24 implements Comparator {
    public final /* synthetic */ int w;
    public final /* synthetic */ ig x;

    public /* synthetic */ e24(ig igVar, int i) {
        this.w = i;
        this.x = igVar;
    }

    public final int compare(Object obj, Object obj2) {
        int i = this.w;
        ig igVar = this.x;
        switch (i) {
            case b85.b:
                return Integer.valueOf(igVar.f(((k24) obj).getKey())).compareTo(Integer.valueOf(igVar.f(((k24) obj2).getKey())));
            case 1:
                return Integer.valueOf(igVar.f(((k24) obj).getKey())).compareTo(Integer.valueOf(igVar.f(((k24) obj2).getKey())));
            case 2:
                return Integer.valueOf(igVar.f(((k24) obj2).getKey())).compareTo(Integer.valueOf(igVar.f(((k24) obj).getKey())));
            default:
                return Integer.valueOf(igVar.f(((k24) obj2).getKey())).compareTo(Integer.valueOf(igVar.f(((k24) obj).getKey())));
        }
    }
}
