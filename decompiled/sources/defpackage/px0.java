package defpackage;

import android.os.CancellationSignal;
import java.util.concurrent.CancellationException;

/* renamed from: px0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class px0 implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ px0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onCancel() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case b85.b:
                ((h27) obj).o((CancellationException) null);
                return;
            default:
                ze7 ze7 = (ze7) obj;
                if (ze7 != null) {
                    u44 u44 = ze7.d;
                    if (u44 != null) {
                        u44.e(lg7.b);
                    }
                    u44 u442 = ze7.d;
                    if (u442 != null) {
                        u442.f(lg7.b);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
