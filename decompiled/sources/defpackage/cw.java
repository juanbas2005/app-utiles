package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;

/* renamed from: cw  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class cw {
    public static BiometricPrompt$AuthenticationCallback a(ew ewVar) {
        return new bw(ewVar);
    }

    public static BiometricPrompt.CryptoObject b(BiometricPrompt.AuthenticationResult authenticationResult) {
        return authenticationResult.getCryptoObject();
    }
}
