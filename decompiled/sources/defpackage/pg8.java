package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: pg8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pg8 {
    public static final Set b = Collections.newSetFromMap(new WeakHashMap());
    public final kw2 a;

    public pg8(kw2 kw2) {
        this.a = kw2;
    }

    public final hi8 a(hi8 hi8) {
        boolean z = true;
        if (!hi8.i && !((Boolean) BasePendingResult.j.get()).booleanValue()) {
            z = false;
        }
        hi8.i = z;
        kw2 kw2 = this.a;
        pw2 pw2 = kw2.k;
        pw2.getClass();
        ug8 ug8 = new ug8(new bh8(hi8), pw2.E.get(), kw2);
        ph8 ph8 = pw2.I;
        ph8.sendMessage(ph8.obtainMessage(4, ug8));
        return hi8;
    }
}
