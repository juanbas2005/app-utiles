package defpackage;

import java.util.Set;

/* renamed from: ia  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ia extends t49 {
    public final int F(lu0 lu0) {
        int i;
        synchronized (lu0) {
            i = lu0.E - 1;
            lu0.E = i;
        }
        return i;
    }

    public final void y(lu0 lu0, Set set) {
        synchronized (lu0) {
            try {
                if (lu0.D == null) {
                    lu0.D = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
