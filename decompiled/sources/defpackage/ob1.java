package defpackage;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* renamed from: ob1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public interface ob1 {
    boolean isAvailableOnDevice();

    void onGetCredential(Context context, nv2 nv2, CancellationSignal cancellationSignal, Executor executor, lb1 lb1);
}
