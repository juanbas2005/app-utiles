package defpackage;

import android.os.SystemClock;
import android.widget.AutoCompleteTextView;

/* renamed from: l02  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class l02 implements AutoCompleteTextView.OnDismissListener {
    public final /* synthetic */ n02 a;

    public /* synthetic */ l02(n02 n02) {
        this.a = n02;
    }

    public final void onDismiss() {
        n02 n02 = this.a;
        n02.m = true;
        n02.o = SystemClock.uptimeMillis();
        n02.s(false);
    }
}
