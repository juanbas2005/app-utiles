package defpackage;

import java.util.LinkedHashMap;

/* renamed from: fy2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class fy2 implements mw1 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ fy2(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    public final void b() {
        switch (this.w) {
            case b85.b:
                ((gy2) this.x).y.removeCallbacks((si7) this.y);
                return;
            default:
                String str = (String) this.x;
                w34 w34 = (w34) this.y;
                synchronized (fo4.b) {
                    LinkedHashMap linkedHashMap = fo4.c;
                    fo4 fo4 = (fo4) linkedHashMap.get(str);
                    if (fo4 != null) {
                        fo4.a.remove(w34);
                        if (fo4.a.isEmpty()) {
                            linkedHashMap.remove(str);
                            fo4.stopWatching();
                        }
                    }
                }
                return;
        }
    }
}
