package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: cd8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cd8 {
    public static final String i = bc4.p("WorkContinuationImpl");
    public final nd8 a;
    public final String b;
    public final w82 c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f = new ArrayList();
    public boolean g;
    public g22 h;

    public cd8(nd8 nd8, String str, w82 w82, List list, int i2) {
        this.a = nd8;
        this.b = str;
        this.c = w82;
        this.d = list;
        this.e = new ArrayList(list.size());
        int i3 = 0;
        while (i3 < list.size()) {
            if (w82 != w82.w || ((xd8) list.get(i3)).b.u == Long.MAX_VALUE) {
                String uuid = ((xd8) list.get(i3)).a.toString();
                uuid.getClass();
                this.e.add(uuid);
                this.f.add(uuid);
                i3++;
            } else {
                h.q("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
        }
    }

    public static HashSet b(cd8 cd8) {
        HashSet hashSet = new HashSet();
        cd8.getClass();
        return hashSet;
    }

    public final g22 a() {
        if (!this.g) {
            nd8 nd8 = this.a;
            td0 td0 = nd8.b.m;
            this.h = g75.E(td0, "EnqueueRunnable_" + this.c.name(), nd8.d.a, new fd7(10, (Object) this));
        } else {
            bc4 k = bc4.k();
            k.q(i, "Already enqueued work ids (" + TextUtils.join(", ", this.e) + ")");
        }
        return this.h;
    }
}
