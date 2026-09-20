package defpackage;

import android.content.Intent;
import android.util.Log;

/* renamed from: yk0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class yk0 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ bl0 x;

    public /* synthetic */ yk0(bl0 bl0, int i) {
        this.w = i;
        this.x = bl0;
    }

    public final void run() {
        int i = this.w;
        bl0 bl0 = this.x;
        switch (i) {
            case b85.b:
                Log.d("bl0", "Finishing due to inactivity");
                bl0.a.finish();
                return;
            default:
                Intent intent = new Intent("com.google.zxing.client.android.SCAN");
                intent.putExtra("TIMEOUT", true);
                bl0.a.setResult(0, intent);
                bl0.a();
                return;
        }
    }
}
