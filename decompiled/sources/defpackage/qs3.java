package defpackage;

import android.view.KeyEvent;

/* renamed from: qs3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qs3 {
    public final KeyEvent a;

    public /* synthetic */ qs3(KeyEvent keyEvent) {
        this.a = keyEvent;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qs3)) {
            return false;
        }
        if (!sg3.e(this.a, ((qs3) obj).a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.a + ")";
    }
}
