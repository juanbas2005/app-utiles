package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: xf2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xf2 {
    public final CountDownLatch a;
    public h91 b = null;

    public xf2(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf2)) {
            return false;
        }
        xf2 xf2 = (xf2) obj;
        if (this.a.equals(xf2.a) && sg3.e(this.b, xf2.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        h91 h91 = this.b;
        if (h91 == null) {
            i = 0;
        } else {
            i = h91.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Dependency(latch=" + this.a + ", subscriber=" + this.b + ')';
    }
}
