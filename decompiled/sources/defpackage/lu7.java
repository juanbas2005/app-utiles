package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* renamed from: lu7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class lu7 implements Runnable {
    public final /* synthetic */ z00 w;
    public final /* synthetic */ u10 x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Runnable z;

    public /* synthetic */ lu7(z00 z00, u10 u10, int i, Runnable runnable) {
        this.w = z00;
        this.x = u10;
        this.y = i;
        this.z = runnable;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        ((defpackage.wr0) r7.d).Z(r0, r1 + 1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
        r2.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        r2.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0038, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0046 */
    public final void run() {
        u10 u10 = this.x;
        int i = this.y;
        Runnable runnable = this.z;
        z00 z00 = this.w;
        za6 za6 = (za6) z00.f;
        za6 za62 = (za6) z00.c;
        Objects.requireNonNull(za62);
        za6.v(new mu7(za62, 1));
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) z00.a).getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            za6.v(new nu7(z00, u10, i));
        } else {
            z00.e(u10, i);
        }
        runnable.run();
    }
}
