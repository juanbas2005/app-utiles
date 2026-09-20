package defpackage;

import androidx.credentials.exceptions.GetCredentialException;

/* renamed from: pb1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class pb1 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ rb1 x;
    public final /* synthetic */ GetCredentialException y;

    public /* synthetic */ pb1(rb1 rb1, GetCredentialException getCredentialException, int i) {
        this.w = i;
        this.x = rb1;
        this.y = getCredentialException;
    }

    public final void run() {
        int i = this.w;
        GetCredentialException getCredentialException = this.y;
        rb1 rb1 = this.x;
        switch (i) {
            case b85.b:
                ((kb1) rb1.c()).a(getCredentialException);
                return;
            case 1:
                ((kb1) rb1.c()).a(getCredentialException);
                return;
            default:
                ((kb1) rb1.c()).a(getCredentialException);
                return;
        }
    }
}
