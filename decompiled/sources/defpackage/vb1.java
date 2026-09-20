package defpackage;

import android.content.Context;
import android.credentials.CredentialManager;
import android.credentials.GetCredentialRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcelable;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import java.util.concurrent.Executor;

/* renamed from: vb1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vb1 implements ob1 {
    public final CredentialManager a;

    public vb1(Context context) {
        context.getClass();
        this.a = jg.c(context.getSystemService("credential"));
    }

    public final boolean isAvailableOnDevice() {
        if (Build.VERSION.SDK_INT < 34 || this.a == null) {
            return false;
        }
        return true;
    }

    public final void onGetCredential(Context context, nv2 nv2, CancellationSignal cancellationSignal, Executor executor, lb1 lb1) {
        context.getClass();
        kb1 kb1 = (kb1) lb1;
        CredentialManager credentialManager = this.a;
        if (credentialManager == null) {
            kb1.a(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
            return;
        }
        ub1 ub1 = new ub1(kb1, this);
        jg.C();
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", (Parcelable) null);
        GetCredentialRequest.Builder i = jg.i(bundle);
        for (pv2 pv2 : nv2.a) {
            jg.D();
            pv2.getClass();
            i.addCredentialOption(jg.f(pv2.a, pv2.b).setIsSystemProviderRequired(true).setAllowedProviders(pv2.c).build());
        }
        GetCredentialRequest j = i.build();
        j.getClass();
        credentialManager.getCredential(context, j, cancellationSignal, (or) executor, ub1);
    }
}
