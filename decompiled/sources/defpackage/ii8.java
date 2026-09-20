package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ii8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ii8 {
    public static final ig a = new ig("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        ji8.I(context).J();
        Set set = pg8.b;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            pw2.a();
            return;
        }
        ((pg8) it.next()).getClass();
        ku4.p();
    }
}
