package defpackage;

import android.util.Log;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

/* renamed from: bj8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class bj8 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ xb7 x;

    public /* synthetic */ bj8(int i, xb7 xb7) {
        this.w = i;
        this.x = xb7;
    }

    public final /* synthetic */ void run() {
        int i = this.w;
        xb7 xb7 = this.x;
        switch (i) {
            case b85.b:
                if (xb7.c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            default:
                xb7.c(new TimeoutException());
                return;
        }
    }
}
