package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import cu.lestebang.utiletecsa.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* renamed from: y80  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class y80 extends bq2 {
    public f90 t0;
    public final Handler u0 = new Handler(Looper.getMainLooper());

    public final void G() {
        this.a0 = true;
        if (Build.VERSION.SDK_INT == 29 && uq3.A(this.t0.e())) {
            f90 f90 = this.t0;
            f90.n = true;
            this.u0.postDelayed(new x80(f90, 2), 250);
        }
    }

    public final void H() {
        this.a0 = true;
        if (Build.VERSION.SDK_INT < 29 && !this.t0.l) {
            eq2 l = l();
            if (l == null || !l.isChangingConfigurations()) {
                P(0);
            }
        }
    }

    public final void P(int i) {
        if (i == 3 || !this.t0.n) {
            if (T()) {
                this.t0.i = i;
                if (i == 1) {
                    W(10, gw8.w(n(), 10));
                }
            }
            f90 f90 = this.t0;
            if (f90.f == null) {
                f90.f = new f96(9, false);
            }
            f96 f96 = f90.f;
            CancellationSignal cancellationSignal = (CancellationSignal) f96.x;
            if (cancellationSignal != null) {
                try {
                    nk0.a(cancellationSignal);
                } catch (NullPointerException e) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                f96.x = null;
            }
        }
    }

    public final void Q() {
        R();
        f90 f90 = this.t0;
        f90.j = false;
        if (!f90.l && t()) {
            q30 q30 = new q30(p());
            q30.h(this);
            q30.e(true, true);
        }
        Context n = n();
        if (n != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String equals : n.getResources().getStringArray(R.array.delay_showing_prompt_models)) {
                    if (str.equals(equals)) {
                        f90 f902 = this.t0;
                        f902.m = true;
                        this.u0.postDelayed(new x80(f902, 1), 600);
                        return;
                    }
                }
            }
        }
    }

    public final void R() {
        this.t0.j = false;
        if (t()) {
            he2 he2 = (he2) p().E("androidx.biometric.FingerprintDialogFragment");
        }
    }

    public final boolean S() {
        if (Build.VERSION.SDK_INT > 28 || !uq3.A(this.t0.e())) {
            return false;
        }
        return true;
    }

    public final boolean T() {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            if (n() != null) {
                this.t0.getClass();
            }
            if (i == 28) {
                Bundle bundle = this.B;
                Context n = n();
                if (n == null || n.getPackageManager() == null || !ea5.a(n.getPackageManager())) {
                    z = false;
                } else {
                    z = true;
                }
                if (!bundle.getBoolean("has_fingerprint", z)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Object, nq2] */
    public final void U() {
        KeyguardManager keyguardManager;
        CharSequence charSequence;
        CharSequence charSequence2;
        Context n = n();
        CharSequence charSequence3 = null;
        if (n != null) {
            keyguardManager = ht3.a(n);
        } else {
            keyguardManager = null;
        }
        if (keyguardManager == null) {
            V(12, q(R.string.generic_error_no_keyguard));
            return;
        }
        f90 f90 = this.t0;
        qc3 qc3 = f90.d;
        if (qc3 != null) {
            charSequence = (CharSequence) qc3.x;
        } else {
            charSequence = null;
        }
        if (qc3 != null) {
            charSequence2 = (CharSequence) qc3.y;
        } else {
            charSequence2 = null;
        }
        f90.getClass();
        if (charSequence2 != null) {
            charSequence3 = charSequence2;
        }
        Intent a = s80.a(keyguardManager, charSequence, charSequence3);
        if (a == null) {
            V(14, q(R.string.generic_error_no_device_credential));
            return;
        }
        this.t0.l = true;
        if (T()) {
            R();
        }
        a.setFlags(134742016);
        if (this.Q != null) {
            rq2 p = p();
            if (p.C != null) {
                String str = this.A;
                ? obj = new Object();
                obj.w = str;
                obj.x = 1;
                p.F.addLast(obj);
                p.C.d0(a);
                return;
            }
            p.w.getClass();
            a.getClass();
            h.s("Starting activity with a requestCode requires a FragmentActivity host");
            return;
        }
        rf2.h(this, " not attached to Activity", "Fragment ");
    }

    public final void V(int i, CharSequence charSequence) {
        W(i, charSequence);
        Q();
    }

    public final void W(int i, CharSequence charSequence) {
        f90 f90 = this.t0;
        if (f90.l) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (!f90.k) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            f90.k = false;
            Executor executor = f90.b;
            if (executor == null) {
                executor = new w80(1);
            }
            executor.execute(new q80(this, i, charSequence));
        }
    }

    public final void X(b90 b90) {
        f90 f90 = this.t0;
        if (!f90.k) {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        } else {
            f90.k = false;
            Executor executor = f90.b;
            if (executor == null) {
                executor = new w80(1);
            }
            executor.execute(new ga(5, (Object) this, (Object) b90));
        }
        Q();
    }

    public final void Y(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = q(R.string.default_error_msg);
        }
        f90 f90 = this.t0;
        if (f90.w == null) {
            f90.w = new bp4();
        }
        f90.h(f90.w, 2);
        f90 f902 = this.t0;
        if (f902.x == null) {
            f902.x = new bp4();
        }
        f90.h(f902.x, charSequence);
    }

    public final void Z() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z;
        boolean z2;
        if (this.t0.j) {
            return;
        }
        if (n() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        f90 f90 = this.t0;
        f90.j = true;
        f90.k = true;
        Context n = n();
        if (n != null) {
            String str = Build.MANUFACTURER;
            if (Build.VERSION.SDK_INT != 29) {
                z = false;
            } else {
                if (str != null) {
                    String[] stringArray = n.getResources().getStringArray(R.array.keyguard_biometric_and_credential_exclude_vendors);
                    int length = stringArray.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        } else if (str.equalsIgnoreCase(stringArray[i])) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                z2 = false;
                z = !z2;
            }
            if (z) {
                int e = this.t0.e();
                if ((e & 255) == 255 && uq3.A(e)) {
                    this.t0.o = true;
                    U();
                    return;
                }
            }
        }
        if (T()) {
            V(12, gw8.w(L().getApplicationContext(), 12));
            return;
        }
        BiometricPrompt.Builder d = t80.d(L().getApplicationContext());
        qc3 qc3 = this.t0.d;
        if (qc3 != null) {
            charSequence = (CharSequence) qc3.x;
        } else {
            charSequence = null;
        }
        if (qc3 != null) {
            charSequence2 = (CharSequence) qc3.y;
        } else {
            charSequence2 = null;
        }
        if (charSequence != null) {
            t80.g(d, charSequence);
        }
        if (charSequence2 != null) {
            t80.f(d, charSequence2);
        }
        f90 f902 = this.t0;
        String str2 = f902.h;
        String str3 = "";
        if (str2 == null) {
            if (f902.d != null) {
                str2 = str3;
            } else {
                str2 = null;
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            Executor executor = this.t0.b;
            if (executor == null) {
                executor = new w80(1);
            }
            f90 f903 = this.t0;
            if (f903.g == null) {
                f903.g = new e90(f903);
            }
            t80.e(d, str2, executor, f903.g);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            qc3 qc32 = this.t0.d;
            u80.a(d, true);
        }
        int e2 = this.t0.e();
        if (i2 >= 30) {
            v80.a(d, e2);
        } else if (i2 >= 29) {
            u80.b(d, uq3.A(e2));
        }
        BiometricPrompt c = t80.c(d);
        Context n2 = n();
        this.t0.getClass();
        BiometricPrompt.CryptoObject N = rj1.N((ed1) null);
        f90 f904 = this.t0;
        if (f904.f == null) {
            f904.f = new f96(9, false);
        }
        f96 f96 = f904.f;
        if (((CancellationSignal) f96.x) == null) {
            f96.x = nk0.b();
        }
        CancellationSignal cancellationSignal = (CancellationSignal) f96.x;
        w80 w80 = new w80(0);
        f90 f905 = this.t0;
        if (f905.e == null) {
            f905.e = new qc3(16, (Object) new d90(f905), false);
        }
        qc3 qc33 = f905.e;
        if (((BiometricPrompt$AuthenticationCallback) qc33.x) == null) {
            qc33.x = cw.a((d90) qc33.y);
        }
        BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback = (BiometricPrompt$AuthenticationCallback) qc33.x;
        if (N == null) {
            try {
                t80.b(c, cancellationSignal, w80, biometricPrompt$AuthenticationCallback);
            } catch (NullPointerException e3) {
                Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e3);
                if (n2 != null) {
                    str3 = n2.getString(R.string.default_error_msg);
                }
                V(1, str3);
            }
        } else {
            t80.a(c, N, cancellationSignal, w80, biometricPrompt$AuthenticationCallback);
        }
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [b90, java.lang.Object] */
    public final void x(int i, int i2, Intent intent) {
        super.x(i, i2, intent);
        if (i == 1) {
            f90 f90 = this.t0;
            f90.l = false;
            if (i2 == -1) {
                if (f90.o) {
                    f90.o = false;
                }
                X(new Object());
                return;
            }
            V(10, q(R.string.generic_error_user_canceled));
        }
    }

    public final void z(Bundle bundle) {
        super.z(bundle);
        if (this.t0 == null) {
            this.t0 = fd1.N(this, this.B.getBoolean("host_activity", true));
        }
        f90 f90 = this.t0;
        eq2 l = l();
        f90.getClass();
        new WeakReference(l);
        f90 f902 = this.t0;
        if (f902.p == null) {
            f902.p = new bp4();
        }
        f902.p.d(this, new p80(this, 0));
        f90 f903 = this.t0;
        if (f903.q == null) {
            f903.q = new bp4();
        }
        f903.q.d(this, new p80(this, 1));
        f90 f904 = this.t0;
        if (f904.r == null) {
            f904.r = new bp4();
        }
        f904.r.d(this, new p80(this, 2));
        f90 f905 = this.t0;
        if (f905.s == null) {
            f905.s = new bp4();
        }
        f905.s.d(this, new p80(this, 3));
        f90 f906 = this.t0;
        if (f906.t == null) {
            f906.t = new bp4();
        }
        f906.t.d(this, new p80(this, 4));
        f90 f907 = this.t0;
        if (f907.v == null) {
            f907.v = new bp4();
        }
        f907.v.d(this, new p80(this, 5));
    }
}
