package defpackage;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;

/* renamed from: zb1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class zb1 implements vr2 {
    public final /* synthetic */ CancellationSignal w;
    public final /* synthetic */ Executor x;
    public final /* synthetic */ lb1 y;

    public /* synthetic */ zb1(CancellationSignal cancellationSignal, Executor executor, lb1 lb1) {
        this.w = cancellationSignal;
        this.x = executor;
        this.y = lb1;
    }

    public final Object y(Object obj) {
        return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$0(this.w, this.x, this.y, (Void) obj);
    }
}
