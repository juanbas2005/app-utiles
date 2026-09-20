package defpackage;

import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;

/* renamed from: xb1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class xb1 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ lb1 x;

    public /* synthetic */ xb1(lb1 lb1, int i) {
        this.w = i;
        this.x = lb1;
    }

    public final void run() {
        int i = this.w;
        lb1 lb1 = this.x;
        switch (i) {
            case b85.b:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$0$0(lb1);
                return;
            case 1:
                CredentialProviderPlayServicesImpl.onCreateCredential$lambda$0$0(lb1);
                return;
            case 2:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$1$0$0(lb1);
                return;
            case 3:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$0$0$0(lb1);
                return;
            case 4:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$1$0(lb1);
                return;
            case 5:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$0$0(lb1);
                return;
            case 6:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$4$0$0(lb1);
                return;
            case 7:
                ((kb1) lb1).a(new GetCredentialUnknownException("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                return;
            default:
                ((kb1) lb1).a(new GetCredentialUnknownException("No provider data returned."));
                return;
        }
    }
}
