package defpackage;

import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;

/* renamed from: ub1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ub1 implements OutcomeReceiver {
    public final /* synthetic */ kb1 w;

    public ub1(kb1 kb1, vb1 vb1) {
        this.w = kb1;
    }

    public final void onError(Throwable th) {
        GetCredentialException h = jg.h(th);
        h.getClass();
        Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
        String s = h.getType();
        s.getClass();
        this.w.a(mp7.m0(h.getMessage(), s));
    }

    public final void onResult(Object obj) {
        GetCredentialResponse k = jg.k(obj);
        k.getClass();
        Log.i("CredManProvService", "GetCredentialResponse returned from framework");
        Credential b = k.getCredential();
        b.getClass();
        String r = b.getType();
        r.getClass();
        Bundle m = b.getData();
        m.getClass();
        this.w.b(new ov2(ed1.l(r, m)));
    }
}
