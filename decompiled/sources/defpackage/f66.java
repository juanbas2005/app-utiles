package defpackage;

import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;

/* renamed from: f66  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class f66 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ lb1 x;
    public final /* synthetic */ GetCredentialException y;

    public /* synthetic */ f66(lb1 lb1, GetCredentialException getCredentialException, int i) {
        this.w = i;
        this.x = lb1;
        this.y = getCredentialException;
    }

    public final void run() {
        int i = this.w;
        Object obj = this.y;
        lb1 lb1 = this.x;
        switch (i) {
            case b85.b:
                ((kb1) lb1).a(obj);
                return;
            default:
                if (obj == null) {
                    obj = new GetCredentialUnknownException("No provider data returned");
                }
                ((kb1) lb1).a(obj);
                return;
        }
    }
}
