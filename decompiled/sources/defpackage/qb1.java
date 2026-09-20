package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.common.api.ApiException;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: qb1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qb1 extends ResultReceiver {
    public final /* synthetic */ int w;
    public final /* synthetic */ sb1 x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qb1(sb1 sb1, Handler handler, int i) {
        super(handler);
        this.w = i;
        this.x = sb1;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, h06] */
    /* JADX WARNING: type inference failed for: r2v18, types: [java.lang.Object, h06] */
    public final void onReceiveResult(int i, Bundle bundle) {
        boolean z;
        boolean z2;
        ov2 ov2;
        String string;
        Bundle bundle2;
        int i2 = i;
        Bundle bundle3 = bundle;
        int i3 = this.w;
        sb1 sb1 = this.x;
        switch (i3) {
            case b85.b:
                bundle3.getClass();
                rb1 rb1 = (rb1) sb1;
                Set set = sb1.a;
                Executor d = rb1.d();
                lb1 c = rb1.c();
                CancellationSignal cancellationSignal = rb1.f;
                if (!bundle3.getBoolean("FAILURE_RESPONSE")) {
                    z = false;
                } else {
                    GetCredentialException e = xb4.e(bundle3.getString("EXCEPTION_TYPE"), bundle3.getString("EXCEPTION_MESSAGE"));
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!ac1.a(cancellationSignal)) {
                        d.execute(new ga(16, (Object) c, (Object) e));
                    }
                    z = true;
                }
                if (!z) {
                    int i4 = bundle3.getInt("ACTIVITY_REQUEST_CODE");
                    Intent intent = (Intent) bundle3.getParcelable("RESULT_DATA");
                    int i5 = sb1.b;
                    if (i4 != i5) {
                        Log.w("BeginSignIn", "Returned request code " + i5 + " which  does not match what was given " + i4);
                        return;
                    }
                    gg0 gg0 = new gg0(16, (Object) rb1);
                    CancellationSignal cancellationSignal2 = rb1.f;
                    if (i2 != -1) {
                        ? obj = new Object();
                        obj.w = new GetCredentialUnknownException(fd1.G(i2));
                        if (i2 == 0) {
                            obj.w = new GetCredentialCancellationException("activity is cancelled by the user.");
                        }
                        f5 f5Var = new f5(14, gg0, obj);
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!ac1.a(cancellationSignal2)) {
                            f5Var.b();
                            return;
                        }
                        return;
                    }
                    try {
                        we.v(rb1.c);
                        ov2 b = rb1.b(wh8.c(intent));
                        CancellationSignal cancellationSignal3 = rb1.f;
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!ac1.a(cancellationSignal3)) {
                            rb1.d().execute(new ga(13, (Object) rb1, (Object) b));
                            return;
                        }
                        return;
                    } catch (ApiException e2) {
                        ? obj2 = new Object();
                        obj2.w = new GetCredentialUnknownException(e2.getMessage());
                        int i6 = e2.w.w;
                        if (i6 == 16) {
                            obj2.w = new GetCredentialCancellationException(e2.getMessage());
                        } else if (sb1.a.contains(Integer.valueOf(i6))) {
                            obj2.w = new GetCredentialInterruptedException(e2.getMessage());
                        }
                        CancellationSignal cancellationSignal4 = rb1.f;
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!ac1.a(cancellationSignal4)) {
                            rb1.d().execute(new ga(14, (Object) rb1, (Object) obj2));
                            return;
                        }
                        return;
                    } catch (GetCredentialException e3) {
                        CancellationSignal cancellationSignal5 = rb1.f;
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!ac1.a(cancellationSignal5)) {
                            rb1.d().execute(new pb1(rb1, e3, 2));
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        GetCredentialUnknownException getCredentialUnknownException = new GetCredentialUnknownException(th.getMessage());
                        CancellationSignal cancellationSignal6 = rb1.f;
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!ac1.a(cancellationSignal6)) {
                            rb1.d().execute(new ga(15, (Object) rb1, (Object) getCredentialUnknownException));
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            default:
                bundle3.getClass();
                mv2 mv2 = (mv2) sb1;
                Set set2 = sb1.a;
                Executor executor = mv2.e;
                GetCredentialException getCredentialException = null;
                if (executor != null) {
                    lb1 lb1 = mv2.d;
                    if (lb1 != null) {
                        CancellationSignal cancellationSignal7 = mv2.f;
                        if (!bundle3.getBoolean("FAILURE_RESPONSE")) {
                            z2 = false;
                        } else {
                            GetCredentialException e4 = xb4.e(bundle3.getString("EXCEPTION_TYPE"), bundle3.getString("EXCEPTION_MESSAGE"));
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!ac1.a(cancellationSignal7)) {
                                executor.execute(new ga(16, (Object) lb1, (Object) e4));
                            }
                            z2 = true;
                        }
                        if (!z2) {
                            int i7 = bundle3.getInt("ACTIVITY_REQUEST_CODE");
                            Intent intent2 = (Intent) gr8.M(bundle3, "RESULT_DATA", Intent.class);
                            Executor executor2 = mv2.e;
                            if (executor2 != null) {
                                lb1 lb12 = mv2.d;
                                if (lb12 != null) {
                                    CancellationSignal cancellationSignal8 = mv2.f;
                                    int i8 = sb1.b;
                                    if (i7 != i8) {
                                        Log.w("GetCredentialController", "Returned request code " + i8 + " which  does not match what was given " + i7);
                                        return;
                                    } else if (i2 != -1) {
                                        GetCredentialException getCredentialUnknownException2 = new GetCredentialUnknownException(fd1.G(i2));
                                        if (i2 == 0) {
                                            getCredentialUnknownException2 = new GetCredentialCancellationException("activity is cancelled by the user.");
                                        }
                                        CredentialProviderPlayServicesImpl.Companion.getClass();
                                        if (!ac1.a(cancellationSignal8)) {
                                            executor2.execute(new f66(lb12, getCredentialUnknownException2, 0));
                                            return;
                                        }
                                        return;
                                    } else if (intent2 == null) {
                                        CredentialProviderPlayServicesImpl.Companion.getClass();
                                        if (!ac1.a(cancellationSignal8)) {
                                            executor2.execute(new xb1(lb12, 8));
                                            return;
                                        }
                                        return;
                                    } else {
                                        int i9 = Build.VERSION.SDK_INT;
                                        if (i9 >= 34) {
                                            ov2 = l4.b(intent2);
                                        } else {
                                            Bundle bundleExtra = intent2.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
                                            if (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle2 = bundleExtra.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) {
                                                ov2 = null;
                                            } else {
                                                ov2 = new ov2(ed1.l(string, bundle2));
                                            }
                                        }
                                        if (ov2 != null) {
                                            CredentialProviderPlayServicesImpl.Companion.getClass();
                                            if (!ac1.a(cancellationSignal8)) {
                                                executor2.execute(new e66(0, lb12, ov2));
                                                return;
                                            }
                                            return;
                                        }
                                        if (i9 >= 34) {
                                            getCredentialException = l4.a(intent2);
                                        } else {
                                            int i10 = GetCredentialException.w;
                                            Bundle bundleExtra2 = intent2.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
                                            if (bundleExtra2 != null) {
                                                String string2 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                                                if (string2 != null) {
                                                    getCredentialException = mp7.m0(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
                                                } else {
                                                    h.q("Bundle was missing exception type.");
                                                    return;
                                                }
                                            }
                                        }
                                        GetCredentialException getCredentialException2 = getCredentialException;
                                        CredentialProviderPlayServicesImpl.Companion.getClass();
                                        if (!ac1.a(cancellationSignal8)) {
                                            executor2.execute(new f66(lb12, getCredentialException2, 1));
                                            return;
                                        }
                                        return;
                                    }
                                } else {
                                    sg3.a0("callback");
                                    throw null;
                                }
                            } else {
                                sg3.a0("executor");
                                throw null;
                            }
                        } else {
                            return;
                        }
                    } else {
                        sg3.a0("callback");
                        throw null;
                    }
                } else {
                    sg3.a0("executor");
                    throw null;
                }
        }
    }
}
