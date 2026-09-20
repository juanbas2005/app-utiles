package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* renamed from: hf6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hf6 {
    public final if6 a;
    public final hx4 b;
    public final ts2 c = new ts2(11);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean e;
    public Bundle f;
    public boolean g;
    public boolean h = true;

    public hf6(if6 if6, hx4 hx4) {
        this.a = if6;
        this.b = hx4;
    }

    public final void a() {
        if6 if6 = this.a;
        if (if6.k().G0() != k54.x) {
            h.s("Restarter must be created only during owner's initialization stage");
        } else if (!this.e) {
            this.b.b();
            if6.k().x0(new h5(3, this));
            this.e = true;
        } else {
            h.s("SavedStateRegistry was already attached.");
        }
    }
}
