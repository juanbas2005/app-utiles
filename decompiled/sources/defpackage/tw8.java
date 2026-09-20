package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* renamed from: tw8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class tw8 implements Runnable {
    public final long w = System.currentTimeMillis();
    public final long x = SystemClock.elapsedRealtime();
    public final boolean y;
    public final /* synthetic */ yw8 z;

    public tw8(yw8 yw8, boolean z2) {
        Objects.requireNonNull(yw8);
        this.z = yw8;
        this.y = z2;
    }

    public abstract void a();

    public final void run() {
        yw8 yw8 = this.z;
        if (yw8.e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            yw8.d(e, false, this.y);
            b();
        }
    }

    public void b() {
    }
}
