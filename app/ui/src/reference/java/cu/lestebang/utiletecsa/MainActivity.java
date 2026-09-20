package cu.lestebang.utiletecsa;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u0002²\u0006\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\nX\u0002"}, d2 = {"Lcu/lestebang/utiletecsa/MainActivity;", "Lyn;", "<init>", "()V", "Ldh7;", "themeSettings", "Lis7;", "Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;", "uiState", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class MainActivity extends yn implements nu2 {
    public static final /* synthetic */ int g0 = 0;
    public volatile k8 X;
    public final Object Y = new Object();
    public boolean Z = false;
    public final ArrayList a0;
    public az4 b0;
    public f91 c0;
    public final o9 d0;
    public final a9 e0;
    public final ed5 f0;

    public MainActivity() {
        m(new xn(this, 2));
        this.a0 = new ArrayList();
        this.d0 = new o9(b26.a.b(ne4.class), new be4(this, 1), new be4(this, 0), new be4(this, 2));
        this.e0 = o(new td4(this), new s8(false, 2));
        this.f0 = u55.p((Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0205, code lost:
        if (r4 != 0) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0207, code lost:
        r0.t0.k = true;
        r0.U();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x020e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x015d, code lost:
        if (r6.getBoolean("has_iris", r7) == false) goto L_0x0207;
     */
    public static final void t(MainActivity mainActivity) {
        BiometricManager biometricManager;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String string = mainActivity.getString(R.string.app_lock_prompt_title);
        String string2 = mainActivity.getString(R.string.app_lock_prompt_subtitle);
        if (TextUtils.isEmpty(string)) {
            h.q("Title must be set and non-empty.");
        } else if (uq3.D(33023)) {
            boolean A = uq3.A(33023);
            g22 g22 = null;
            if (TextUtils.isEmpty((CharSequence) null) && !A) {
                h.q("Negative text must be set and non-empty.");
            } else if (TextUtils.isEmpty((CharSequence) null) || !A) {
                qc3 qc3 = new qc3(19, (Object) string, (Object) string2);
                c90 c90 = new c90(1);
                Executor v = ag8.v(mainActivity);
                if (v != null) {
                    rq2 p = mainActivity.p();
                    z58 g = mainActivity.g();
                    w58 l = o85.l(mainActivity);
                    ib1 k = o85.k(mainActivity);
                    l.getClass();
                    k.getClass();
                    no7 no7 = new no7(g, l, k);
                    gq3 b = b26.a.b(f90.class);
                    String l2 = b.l();
                    if (l2 != null) {
                        f90 f90 = (f90) no7.b(b, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(l2));
                        f90.b = v;
                        f90.c = c90;
                        if (p == null) {
                            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
                        } else if (p.Q()) {
                            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
                        } else {
                            y80 y80 = (y80) p.E("androidx.biometric.BiometricFragment");
                            int i2 = 0;
                            if (y80 == null) {
                                y80 = new y80();
                                Bundle bundle = new Bundle();
                                bundle.putBoolean("host_activity", true);
                                y80.O(bundle);
                                q30 q30 = new q30(p);
                                q30.f(0, y80, "androidx.biometric.BiometricFragment", 1);
                                q30.e(true, true);
                                p.A(true);
                                p.F();
                            }
                            y80.t0.d = qc3;
                            int i3 = Build.VERSION.SDK_INT;
                            boolean S = y80.S();
                            f90 f902 = y80.t0;
                            if (S) {
                                f902.h = y80.q(R.string.confirm_device_credential_password);
                            } else {
                                f902.h = null;
                            }
                            Context n = y80.n();
                            if (i3 == 29) {
                                Bundle bundle2 = y80.B;
                                Context n2 = y80.n();
                                if (n2 == null || n2.getPackageManager() == null || !ea5.a(n2.getPackageManager())) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (!bundle2.getBoolean("has_fingerprint", z2)) {
                                    Bundle bundle3 = y80.B;
                                    Context n3 = y80.n();
                                    if (i3 < 29 || n3 == null || n3.getPackageManager() == null || !fa5.a(n3.getPackageManager())) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    if (!bundle3.getBoolean("has_face", z3)) {
                                        Bundle bundle4 = y80.B;
                                        Context n4 = y80.n();
                                        if (i3 < 29 || n4 == null || n4.getPackageManager() == null || !fa5.b(n4.getPackageManager())) {
                                            z4 = false;
                                        } else {
                                            z4 = true;
                                        }
                                    }
                                }
                            }
                            if (y80.S()) {
                                Context applicationContext = n.getApplicationContext();
                                int i4 = Build.VERSION.SDK_INT;
                                if (i4 >= 29) {
                                    biometricManager = z80.b(applicationContext);
                                } else {
                                    biometricManager = null;
                                }
                                if (i4 <= 29) {
                                    g22 = new g22(29);
                                }
                                if (i3 >= 30) {
                                    if (biometricManager == null) {
                                        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                                    } else {
                                        i2 = a90.a(biometricManager, 255);
                                    }
                                } else if (!uq3.D(255)) {
                                    i2 = -2;
                                } else {
                                    int i5 = 12;
                                    if (ht3.a(applicationContext) != null) {
                                        if (uq3.A(255)) {
                                            KeyguardManager a = ht3.a(applicationContext);
                                            if (a == null) {
                                                z = false;
                                            } else {
                                                z = ht3.b(a);
                                            }
                                            if (!z) {
                                                i2 = 11;
                                            }
                                        } else {
                                            if (i3 == 29) {
                                                if (biometricManager == null) {
                                                    Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                                                } else {
                                                    i = z80.a(biometricManager);
                                                }
                                            } else if (i3 == 28) {
                                                if (!(applicationContext == null || applicationContext.getPackageManager() == null || !ea5.a(applicationContext.getPackageManager()))) {
                                                    KeyguardManager a2 = ht3.a(applicationContext);
                                                    if (a2 != null) {
                                                        i2 = ht3.b(a2);
                                                    }
                                                    if (i2 != 0) {
                                                        if (g22 == null) {
                                                            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
                                                        }
                                                        i = -1;
                                                    } else if (g22 == null) {
                                                        Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
                                                        i5 = 1;
                                                    }
                                                }
                                            } else if (g22 == null) {
                                                Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
                                            }
                                            i2 = i;
                                        }
                                    }
                                    i2 = i5;
                                }
                                i2 = 1;
                            }
                            if (y80.t0.m) {
                                y80.u0.postDelayed(new x80(y80), 600);
                            } else {
                                y80.Z();
                            }
                        }
                    } else {
                        h.q("Local and anonymous classes can not be ViewModels");
                    }
                } else {
                    h.q("Executor must not be null.");
                }
            } else {
                h.q("Negative text must not be set if device credential authentication is allowed.");
            }
        } else {
            h.q(hl6.n(new StringBuilder("Authenticator combination is unsupported on API "), Build.VERSION.SDK_INT, ": BIOMETRIC_WEAK | DEVICE_CREDENTIAL"));
        }
    }

    public final Object a() {
        return u().a();
    }

    public final w58 c() {
        return h49.x(this, super.c());
    }

    public final void onCreate(Bundle bundle) {
        kg5 kg5;
        lk7 lk7;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            kg5 = new h07(this);
        } else {
            kg5 = new kg5(this);
        }
        kg5.z();
        w(bundle);
        Intent intent = getIntent();
        if (intent == null || !intent.getBooleanExtra("cu.lestebang.utiletecsa.extra.OPEN_NAUTA", false)) {
            lk7 = null;
        } else {
            lk7 = lk7.D;
        }
        this.f0.setValue(lk7);
        ed5 p = u55.p(new dh7(false, false));
        ar7.H(t49.O(this), (e81) null, (r81) null, new yd4(this, p, (f61) null, 1), 3);
        kg5.P(new td4(this));
        sv0.a(this, new fw0(1404224948, new p13(25, (Object) this, (Object) p), true));
        List E = sg3.E("android.permission.CALL_PHONE", "android.permission.READ_PHONE_STATE", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.READ_CONTACTS", "android.permission.SEND_SMS", "android.permission.READ_CALL_LOG", "android.permission.READ_SMS");
        ArrayList arrayList = this.a0;
        arrayList.addAll(E);
        if (i >= 33) {
            arrayList.add("android.permission.POST_NOTIFICATIONS");
        }
        ar7.H(t49.O(this), (e81) null, (r81) null, new ot(this, (f61) null, 16), 3);
    }

    public final void onDestroy() {
        super.onDestroy();
        v70 v70 = u().A;
        if (v70 != null) {
            v70.y = null;
        }
    }

    public final void onNewIntent(Intent intent) {
        lk7 lk7;
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
        if (intent.getBooleanExtra("cu.lestebang.utiletecsa.extra.OPEN_NAUTA", false)) {
            lk7 = lk7.D;
        } else {
            lk7 = null;
        }
        if (lk7 != null) {
            this.f0.setValue(lk7);
        }
    }

    public final k8 u() {
        if (this.X == null) {
            synchronized (this.Y) {
                try {
                    if (this.X == null) {
                        this.X = new k8(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.X;
    }

    public final ne4 v() {
        return (ne4) this.d0.getValue();
    }

    public final void w(Bundle bundle) {
        super.onCreate(bundle);
        u().c();
    }
}
