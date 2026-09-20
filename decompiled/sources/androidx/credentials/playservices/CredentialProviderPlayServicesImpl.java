package androidx.credentials.playservices;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 42\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\fH\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010\u001dJ?\u0010!\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u001e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020 0\fH\u0016¢\u0006\u0004\b!\u0010\"J3\u0010%\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020$0\fH\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b'\u0010(J?\u0010)\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u001e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020 0\fH\u0002¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R(\u0010,\u001a\u00020+8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b,\u0010-\u0012\u0004\b2\u00103\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00066"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;", "Lob1;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lnv2;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Llb1;", "Lov2;", "Landroidx/credentials/exceptions/GetCredentialException;", "callback", "Lvs7;", "onGetCredential", "(Landroid/content/Context;Lnv2;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Llb1;)V", "Lab1;", "", "Landroidx/credentials/exceptions/CreateCredentialException;", "onCreateCredential", "(Landroid/content/Context;Lab1;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Llb1;)V", "", "isAvailableOnDevice", "()Z", "", "minApkVersion", "(I)Z", "Lbr0;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "onClearCredential", "(Lbr0;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Llb1;)V", "Lpt6;", "Landroidx/credentials/exceptions/publickeycredential/SignalCredentialStateException;", "onSignalCredentialState", "(Lpt6;Ljava/util/concurrent/Executor;Llb1;)V", "isGooglePlayServicesAvailable", "(Landroid/content/Context;I)I", "runFallbackClearCredFlow", "Landroid/content/Context;", "Llw2;", "googleApiAvailability", "Llw2;", "getGoogleApiAvailability", "()Llw2;", "setGoogleApiAvailability", "(Llw2;)V", "getGoogleApiAvailability$annotations", "()V", "Companion", "ac1", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class CredentialProviderPlayServicesImpl implements ob1 {
    public static final ac1 Companion = new Object();
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    public static final int MIN_GMS_APK_VERSION_SIGNAL_API = 254625000;
    public static final int PRE_U_MIN_GMS_APK_VERSION = 252400000;
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private lw2 googleApiAvailability = lw2.e;

    public CredentialProviderPlayServicesImpl(Context context2) {
        context2.getClass();
        this.context = context2;
    }

    private final int isGooglePlayServicesAvailable(Context context2, int i) {
        return this.googleApiAvailability.b(context2, i);
    }

    private static final vs7 onClearCredential$lambda$0(Executor executor, lb1 lb1) {
        executor.execute(new xb1(lb1, 0));
        return vs7.a;
    }

    /* access modifiers changed from: private */
    public static final void onClearCredential$lambda$0$0(lb1 lb1) {
        ((kb1) lb1).a(new ClearCredentialException("clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added", "androidx.credentials.TYPE_CLEAR_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION"));
    }

    private static final vs7 onClearCredential$lambda$1(CancellationSignal cancellationSignal, Executor executor, lb1 lb1, Boolean bool) {
        Companion.getClass();
        if (!ac1.a(cancellationSignal)) {
            onClearCredential$lambda$1$0(executor, lb1);
        }
        return vs7.a;
    }

    private static final vs7 onClearCredential$lambda$1$0(Executor executor, lb1 lb1) {
        Log.i(TAG, "Cleared restore credential successfully!");
        executor.execute(new xb1(lb1, 2));
        return vs7.a;
    }

    /* access modifiers changed from: private */
    public static final void onClearCredential$lambda$1$0$0(lb1 lb1) {
        ((kb1) lb1).b((Object) null);
    }

    private static final void onClearCredential$lambda$2(vr2 vr2, Object obj) {
        vr2.y(obj);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, h06] */
    private static final void onClearCredential$lambda$3(CancellationSignal cancellationSignal, Executor executor, lb1 lb1, Exception exc) {
        exc.getClass();
        Log.w(TAG, "Clearing restore credential failed", exc);
        ? obj = new Object();
        obj.w = new ClearCredentialUnknownException("Clear restore credential failed for unknown reason.");
        if ((exc instanceof ApiException) && ((ApiException) exc).w.w == 40201) {
            obj.w = new ClearCredentialUnknownException("The restore credential internal service had a failure.");
        }
        Companion.getClass();
        if (!ac1.a(cancellationSignal)) {
            onClearCredential$lambda$3$0(executor, lb1, obj);
        }
    }

    private static final vs7 onClearCredential$lambda$3$0(Executor executor, lb1 lb1, h06 h06) {
        executor.execute(new ga(17, (Object) lb1, (Object) h06));
        return vs7.a;
    }

    /* access modifiers changed from: private */
    public static final void onClearCredential$lambda$3$0$0(lb1 lb1, h06 h06) {
        ((kb1) lb1).a(h06.w);
    }

    private static final vs7 onClearCredential$lambda$4(CancellationSignal cancellationSignal, Executor executor, lb1 lb1, cr0 cr0) {
        Companion.getClass();
        if (!ac1.a(cancellationSignal)) {
            onClearCredential$lambda$4$0(executor, lb1);
        }
        return vs7.a;
    }

    private static final vs7 onClearCredential$lambda$4$0(Executor executor, lb1 lb1) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new xb1(lb1, 6));
        return vs7.a;
    }

    /* access modifiers changed from: private */
    public static final void onClearCredential$lambda$4$0$0(lb1 lb1) {
        ((kb1) lb1).b((Object) null);
    }

    private static final void onClearCredential$lambda$5(vr2 vr2, Object obj) {
        vr2.y(obj);
    }

    private static final void onClearCredential$lambda$6(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, br0 br0, CancellationSignal cancellationSignal, Executor executor, lb1 lb1, Exception exc) {
        exc.getClass();
        Log.e(TAG, "GMS Clear credential flow failed, calling fallback");
        credentialProviderPlayServicesImpl.runFallbackClearCredFlow(br0, cancellationSignal, executor, lb1);
    }

    private static final vs7 onCreateCredential$lambda$0(Executor executor, lb1 lb1) {
        executor.execute(new xb1(lb1, 1));
        return vs7.a;
    }

    /* access modifiers changed from: private */
    public static final void onCreateCredential$lambda$0$0(lb1 lb1) {
        ((kb1) lb1).a(new CreateCredentialException("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", "androidx.credentials.TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION"));
    }

    private static final vs7 onGetCredential$lambda$0(Executor executor, lb1 lb1) {
        executor.execute(new xb1(lb1, 5));
        return vs7.a;
    }

    /* access modifiers changed from: private */
    public static final void onGetCredential$lambda$0$0(lb1 lb1) {
        ((kb1) lb1).a(new GetCredentialProviderConfigurationException("this device requires a Google Play Services update for the given feature to be supported"));
    }

    private static final vs7 onGetCredential$lambda$1(Executor executor, lb1 lb1) {
        executor.execute(new xb1(lb1, 4));
        return vs7.a;
    }

    /* access modifiers changed from: private */
    public static final void onGetCredential$lambda$1$0(lb1 lb1) {
        ((kb1) lb1).a(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    private static final void onSignalCredentialState$lambda$0(lb1 lb1) {
        ((kb1) lb1).a(new Exception("this device requires a Google Play Services update for the given feature to be supported".toString()));
    }

    private final void runFallbackClearCredFlow(br0 br0, CancellationSignal cancellationSignal, Executor executor, lb1 lb1) {
        wh8 v = we.v(this.context);
        v.a.getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = pg8.b;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            pw2.a();
            za0 b = i93.b();
            b.e = new cc2[]{rd3.m};
            b.d = new ay4(18, v);
            b.c = false;
            b.b = 1554;
            yb9 b2 = v.b(1, b.a());
            c9 c9Var = new c9(8, new zb1(cancellationSignal, executor, lb1));
            b2.getClass();
            iy2 iy2 = yb7.a;
            b2.e(iy2, c9Var);
            b2.d(iy2, new yb1(this, cancellationSignal, executor, lb1));
            return;
        }
        ((pg8) it.next()).getClass();
        ku4.p();
    }

    /* access modifiers changed from: private */
    public static final vs7 runFallbackClearCredFlow$lambda$0(CancellationSignal cancellationSignal, Executor executor, lb1 lb1, Void voidR) {
        Companion.getClass();
        if (!ac1.a(cancellationSignal)) {
            runFallbackClearCredFlow$lambda$0$0(executor, lb1);
        }
        return vs7.a;
    }

    private static final vs7 runFallbackClearCredFlow$lambda$0$0(Executor executor, lb1 lb1) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new xb1(lb1, 3));
        return vs7.a;
    }

    /* access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$0$0$0(lb1 lb1) {
        ((kb1) lb1).b((Object) null);
    }

    /* access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$1(vr2 vr2, Object obj) {
        vr2.y(obj);
    }

    /* access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$2(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, lb1 lb1, Exception exc) {
        exc.getClass();
        Companion.getClass();
        if (!ac1.a(cancellationSignal)) {
            runFallbackClearCredFlow$lambda$2$0$0(exc, executor, lb1);
        }
    }

    private static final vs7 runFallbackClearCredFlow$lambda$2$0$0(Exception exc, Executor executor, lb1 lb1) {
        Log.w(TAG, "During clear credential sign out failed with " + exc);
        executor.execute(new ga(18, (Object) lb1, (Object) exc));
        return vs7.a;
    }

    /* access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$2$0$0$0(lb1 lb1, Exception exc) {
        ((kb1) lb1).a(new ClearCredentialUnknownException(exc.getMessage()));
    }

    public final lw2 getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    public final boolean isAvailableOnDevice(int i) {
        boolean z;
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, i);
        if (isGooglePlayServicesAvailable == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m11 m11 = new m11(isGooglePlayServicesAvailable, (PendingIntent) null, (String) null);
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + m11);
        }
        return z;
    }

    public void onClearCredential(br0 br0, CancellationSignal cancellationSignal, Executor executor, lb1 lb1) {
        throw null;
    }

    public void onCreateCredential(Context context2, ab1 ab1, CancellationSignal cancellationSignal, Executor executor, lb1 lb1) {
        context2.getClass();
        throw null;
    }

    public void onGetCredential(Context context2, nv2 nv2, CancellationSignal cancellationSignal, Executor executor, lb1 lb1) {
        Context context3 = context2;
        nv2 nv22 = nv2;
        CancellationSignal cancellationSignal2 = cancellationSignal;
        Executor executor2 = executor;
        lb1 lb12 = lb1;
        context3.getClass();
        nv22.getClass();
        List<pv2> list = nv22.a;
        executor2.getClass();
        lb12.getClass();
        Companion.getClass();
        if (!ac1.a(cancellationSignal2)) {
            for (pv2 pv2 : list) {
            }
            Companion.getClass();
            for (pv2 pv22 : list) {
            }
            if (isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
                mv2 mv2 = new mv2(context3);
                mv2.f = cancellationSignal2;
                mv2.d = lb12;
                mv2.e = executor2;
                Companion.getClass();
                if (!ac1.a(cancellationSignal2)) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
                    bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
                    bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", (Parcelable) null);
                    ArrayList arrayList = new ArrayList(et0.e0(list, 10));
                    for (pv2 pv23 : list) {
                        pv23.getClass();
                        arrayList.add(new nb1("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", pv23.a, pv23.b, "", "", ""));
                    }
                    GetCredentialRequest getCredentialRequest = new GetCredentialRequest(arrayList, bundle, (String) null, new ResultReceiver((Handler) null));
                    Context context4 = mv2.c;
                    context4.getClass();
                    kw2 kw2 = new kw2(context4, yf3.l, ym.a, jw2.c);
                    za0 b = i93.b();
                    b.e = new cc2[]{uq3.h};
                    b.d = new rg4(21, (Object) getCredentialRequest);
                    b.b = 32701;
                    yb9 b2 = kw2.b(0, b.a());
                    b2.getClass();
                    mv2 mv22 = mv2;
                    Executor executor3 = executor2;
                    mv2 mv23 = mv22;
                    c9 c9Var = new c9(9, new qj((Object) cancellationSignal2, (Object) mv23, (Object) executor3, (Object) lb12, 5));
                    iy2 iy2 = yb7.a;
                    b2.e(iy2, c9Var);
                    lb1 lb13 = lb1;
                    b2.d(iy2, new uz0(nv22, mv23, lb13, executor, cancellationSignal));
                    return;
                }
                return;
            }
            Companion.getClass();
            for (pv2 pv24 : list) {
            }
            new rb1(context3).e(nv22, cancellationSignal2, executor2, lb12);
        }
    }

    public void onPrepareCredential(nv2 nv2, CancellationSignal cancellationSignal, Executor executor, lb1 lb1) {
        nv2.getClass();
        executor.getClass();
        lb1.getClass();
    }

    public void onSignalCredentialState(pt6 pt6, Executor executor, lb1 lb1) {
        throw null;
    }

    public final void setGoogleApiAvailability(lw2 lw2) {
        lw2.getClass();
        this.googleApiAvailability = lw2;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    public void onGetCredential(Context context2, wn5 wn5, CancellationSignal cancellationSignal, Executor executor, lb1 lb1) {
        context2.getClass();
        throw null;
    }
}
