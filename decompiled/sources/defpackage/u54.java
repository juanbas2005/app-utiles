package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: u54  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class u54 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ w54 x;
    public final /* synthetic */ t54 y;

    public /* synthetic */ u54(w54 w54, t54 t54, int i) {
        this.w = i;
        this.x = w54;
        this.y = t54;
    }

    public final Object y(Object obj) {
        j54 j54;
        j54 j542;
        int i = this.w;
        vs7 vs7 = vs7.a;
        t54 t54 = this.y;
        w54 w54 = this.x;
        Map.Entry entry = (Map.Entry) obj;
        switch (i) {
            case b85.b:
                entry.getClass();
                s54 s54 = (s54) entry.getKey();
                v54 v54 = (v54) entry.getValue();
                while (true) {
                    k54 k54 = v54.a;
                    k54 k542 = w54.E;
                    ArrayList arrayList = w54.D;
                    if (k54.compareTo(k542) <= 0 || w54.C) {
                        return vs7;
                    }
                    wr0 wr0 = w54.y;
                    wr0.getClass();
                    s54.getClass();
                    if (!((tp4) wr0.x).c(s54)) {
                        return vs7;
                    }
                    h54 h54 = j54.Companion;
                    k54 k543 = v54.a;
                    h54.getClass();
                    k543.getClass();
                    int ordinal = k543.ordinal();
                    if (ordinal == 2) {
                        j54 = j54.ON_DESTROY;
                    } else if (ordinal == 3) {
                        j54 = j54.ON_STOP;
                    } else if (ordinal != 4) {
                        j54 = null;
                    } else {
                        j54 = j54.ON_PAUSE;
                    }
                    if (j54 != null) {
                        arrayList.add(j54.a());
                        v54.a(t54, j54);
                        it0.l0(arrayList);
                    } else {
                        ku4.k("no event down from ", v54.a);
                        return null;
                    }
                }
                break;
            default:
                entry.getClass();
                s54 s542 = (s54) entry.getKey();
                v54 v542 = (v54) entry.getValue();
                while (true) {
                    k54 k544 = v542.a;
                    k54 k545 = w54.E;
                    ArrayList arrayList2 = w54.D;
                    if (k544.compareTo(k545) >= 0 || w54.C) {
                        return vs7;
                    }
                    wr0 wr02 = w54.y;
                    wr02.getClass();
                    s542.getClass();
                    if (!((tp4) wr02.x).c(s542)) {
                        return vs7;
                    }
                    arrayList2.add(v542.a);
                    h54 h542 = j54.Companion;
                    k54 k546 = v542.a;
                    h542.getClass();
                    k546.getClass();
                    int ordinal2 = k546.ordinal();
                    if (ordinal2 == 1) {
                        j542 = j54.ON_CREATE;
                    } else if (ordinal2 == 2) {
                        j542 = j54.ON_START;
                    } else if (ordinal2 != 3) {
                        j542 = null;
                    } else {
                        j542 = j54.ON_RESUME;
                    }
                    if (j542 != null) {
                        v542.a(t54, j542);
                        it0.l0(arrayList2);
                    } else {
                        ku4.k("no event up from ", v542.a);
                        return null;
                    }
                }
                break;
        }
    }
}
