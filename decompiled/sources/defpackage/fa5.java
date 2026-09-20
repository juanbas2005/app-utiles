package defpackage;

import android.content.pm.PackageManager;

/* renamed from: fa5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class fa5 {
    public static boolean a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.biometrics.face");
    }

    public static boolean b(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.biometrics.iris");
    }
}
