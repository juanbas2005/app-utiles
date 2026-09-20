package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* renamed from: o45  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class o45 extends zv4 {
    public final OnBackInvokedDispatcher c;
    public final int d;
    public final OnBackInvokedCallback e;
    public boolean f;

    public o45(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        OnBackInvokedCallback onBackInvokedCallback;
        this.c = onBackInvokedDispatcher;
        this.d = i;
        if (Build.VERSION.SDK_INT == 33) {
            onBackInvokedCallback = new po(1, this);
        } else {
            onBackInvokedCallback = new n45(this);
        }
        this.e = onBackInvokedCallback;
    }

    public final void b(boolean z) {
        d(z);
    }

    public final void c() {
        d(false);
    }

    public final void d(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback = this.e;
        if (z && !this.f) {
            this.c.registerOnBackInvokedCallback(this.d, onBackInvokedCallback);
            this.f = true;
        } else if (!z && this.f) {
            this.c.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.f = false;
        }
    }
}
