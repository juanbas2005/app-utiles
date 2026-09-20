package defpackage;

import android.net.Uri;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: ia9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ia9 {
    public za9 a;
    public q93 b;
    public ArrayList c;
    public Uri d;

    public ArrayList a(OutputStream outputStream) {
        ha9 ha9;
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        ArrayList arrayList2 = this.c;
        if (!arrayList2.isEmpty()) {
            int i = ha9.x;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            if (!it.hasNext()) {
                if (!arrayList3.isEmpty()) {
                    ha9 = new ha9(outputStream, arrayList3);
                } else {
                    ha9 = null;
                }
                if (ha9 != null) {
                    arrayList.add(ha9);
                }
            } else {
                throw pb4.g(it);
            }
        }
        Iterator it2 = this.b.iterator();
        if (!it2.hasNext()) {
            Collections.reverse(arrayList);
            return arrayList;
        } else if (it2.next() != null) {
            ku4.a();
            return null;
        } else {
            OutputStream outputStream2 = (OutputStream) x91.B(arrayList);
            throw null;
        }
    }
}
