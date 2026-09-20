package defpackage;

import kotlinx.coroutines.TimeoutCancellationException;

/* renamed from: si7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class si7 extends sg6 implements Runnable {
    public final long C;

    public si7(long j, h61 h61) {
        super(h61, h61.r());
        this.C = j;
    }

    public final String e0() {
        return super.e0() + "(timeMillis=" + this.C + ')';
    }

    public final void run() {
        String str;
        e81 e81 = this.A;
        t49.M(e81);
        k81 k81 = (k81) e81.a0(k81.y);
        if (k81 != null) {
            str = k81.x;
        } else {
            str = null;
        }
        String g = f21.g(this.C, "Timed out waiting for ", " ms");
        if (str != null) {
            StringBuilder q = b81.q("Coroutine \"", str, "\" ");
            if (g.length() > 0) {
                g = Character.toLowerCase(g.charAt(0)) + g.substring(1);
            }
            q.append(g);
            g = q.toString();
        }
        i(new TimeoutCancellationException(g, this));
    }
}
