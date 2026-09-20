package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.security.identity.PresentationSession;
import java.lang.ref.WeakReference;

/* renamed from: bw  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bw extends BiometricPrompt$AuthenticationCallback {
    public final /* synthetic */ ew a;

    public bw(ew ewVar) {
        this.a = ewVar;
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        WeakReference weakReference = ((d90) this.a).a;
        if (weakReference.get() != null && !((f90) weakReference.get()).l && ((f90) weakReference.get()).k) {
            ((f90) weakReference.get()).f(new o80(i, charSequence));
        }
    }

    public void onAuthenticationFailed() {
        WeakReference weakReference = ((d90) this.a).a;
        if (weakReference.get() != null && ((f90) weakReference.get()).k) {
            f90 f90 = (f90) weakReference.get();
            if (f90.s == null) {
                f90.s = new bp4();
            }
            f90.h(f90.s, Boolean.TRUE);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        int i;
        WeakReference weakReference;
        BiometricPrompt.CryptoObject b;
        int i2;
        if (authenticationResult != null && (b = cw.b(authenticationResult)) != null && kc1.d(b) == null && kc1.f(b) == null && kc1.e(b) == null && (((i2 = Build.VERSION.SDK_INT) < 30 || lc1.b(b) == null) && i2 >= 33)) {
            PresentationSession b2 = mc1.b(b);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            if (authenticationResult != null) {
                i = dw.a(authenticationResult);
                Object obj = new Object();
                weakReference = ((d90) this.a).a;
                if (weakReference.get() != null && ((f90) weakReference.get()).k) {
                    if (i == -1) {
                        ((f90) weakReference.get()).e();
                        obj = new Object();
                    }
                    f90 f90 = (f90) weakReference.get();
                    if (f90.p == null) {
                        f90.p = new bp4();
                    }
                    f90.h(f90.p, obj);
                    return;
                }
                return;
            }
        } else if (i3 != 29) {
            i = 2;
            Object obj2 = new Object();
            weakReference = ((d90) this.a).a;
            if (weakReference.get() != null || ((f90) weakReference.get()).k) {
            }
        }
        i = -1;
        Object obj22 = new Object();
        weakReference = ((d90) this.a).a;
        if (weakReference.get() != null || ((f90) weakReference.get()).k) {
        }
    }

    public void onAuthenticationHelp(int i, CharSequence charSequence) {
    }
}
