package defpackage;

import androidx.credentials.exceptions.GetCredentialException;

/* renamed from: kb1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kb1 implements lb1, y45 {
    public final /* synthetic */ kk0 w;

    public /* synthetic */ kb1(kk0 kk0) {
        this.w = kk0;
    }

    public void K(yb9 yb9) {
        Exception h = yb9.h();
        if (h == null) {
            boolean z = yb9.d;
            kk0 kk0 = this.w;
            if (z) {
                kk0.a((Throwable) null);
            } else {
                kk0.f(yb9.i());
            }
        } else {
            this.w.f(new m66(h));
        }
    }

    public void a(Object obj) {
        GetCredentialException getCredentialException = (GetCredentialException) obj;
        getCredentialException.getClass();
        kk0 kk0 = this.w;
        if (kk0.u() instanceof o05) {
            kk0.f(new m66(getCredentialException));
        }
    }

    public void b(Object obj) {
        ov2 ov2 = (ov2) obj;
        ov2.getClass();
        kk0 kk0 = this.w;
        if (kk0.u() instanceof o05) {
            kk0.f(ov2);
        }
    }
}
