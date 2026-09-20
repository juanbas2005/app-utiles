package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: v86  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v86 {
    public final ArrayList a;
    public int b;

    public v86() {
        this.a = new ArrayList();
        this.b = 128;
    }

    public synchronized List a() {
        return Collections.unmodifiableList(new ArrayList(this.a));
    }

    public synchronized boolean b(List list) {
        this.a.clear();
        if (list.size() > this.b) {
            Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.b, (Throwable) null);
            return this.a.addAll(list.subList(0, this.b));
        }
        return this.a.addAll(list);
    }

    public v86(ArrayList arrayList) {
        this.a = arrayList;
    }
}
