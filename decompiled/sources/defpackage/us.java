package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: us  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class us {
    public final char a;
    public final ArrayList b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: us} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: us} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: us} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: us} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: us} */
    /* JADX WARNING: Multi-variable type inference failed */
    public us(char c, List list, ArrayList arrayList) {
        this.a = c;
        this.b = arrayList;
        us[] usVarArr = new us[256];
        for (int i = 0; i < 256; i++) {
            Iterator it = this.b.iterator();
            us usVar = null;
            boolean z = false;
            us usVar2 = null;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (next.a == i) {
                        if (z) {
                            break;
                        }
                        z = true;
                        usVar2 = next;
                    }
                } else if (z) {
                    usVar = usVar2;
                }
            }
            usVarArr[i] = usVar;
        }
    }
}
