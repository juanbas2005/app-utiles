package defpackage;

import android.view.WindowInsetsController;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: iy6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class iy6 implements WindowInsetsController.OnControllableInsetsChangedListener {
    public final /* synthetic */ AtomicBoolean a;

    public /* synthetic */ iy6(AtomicBoolean atomicBoolean) {
        this.a = atomicBoolean;
    }

    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i) {
        boolean z;
        AtomicBoolean atomicBoolean = this.a;
        if ((i & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        atomicBoolean.set(z);
    }
}
