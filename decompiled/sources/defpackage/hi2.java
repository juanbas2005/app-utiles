package defpackage;

import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* renamed from: hi2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hi2 extends sg6 {
    public final boolean w(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return i(th);
    }
}
