package defpackage;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;

/* renamed from: yb1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class yb1 implements c55 {
    public final /* synthetic */ CredentialProviderPlayServicesImpl w;
    public final /* synthetic */ CancellationSignal x;
    public final /* synthetic */ Executor y;
    public final /* synthetic */ lb1 z;

    public /* synthetic */ yb1(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, lb1 lb1) {
        this.w = credentialProviderPlayServicesImpl;
        this.x = cancellationSignal;
        this.y = executor;
        this.z = lb1;
    }

    public final void j(Exception exc) {
        CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2(this.w, this.x, this.y, this.z, exc);
    }
}
