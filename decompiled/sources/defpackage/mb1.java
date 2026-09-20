package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;

/* renamed from: mb1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mb1 {
    public static Object a(Context context, nv2 nv2, f7 f7Var) {
        ob1 e;
        kk0 kk0 = new kk0(1, rc9.a0(f7Var));
        kk0.v();
        CancellationSignal cancellationSignal = new CancellationSignal();
        kk0.x(new b0(13, cancellationSignal));
        kb1 kb1 = new kb1(kk0);
        or orVar = new or(1);
        context.getClass();
        tb1 tb1 = new tb1(context, 0);
        if (nv2 != "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL") {
            for (pv2 pv2 : nv2.a) {
            }
            Context context2 = tb1.a;
            context2.getClass();
            if (context2.getPackageManager().hasSystemFeature("android.software.leanback") || context2.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                e = tb1.e();
            } else {
                int i = Build.VERSION.SDK_INT;
                e = null;
                if (i >= 34) {
                    vb1 vb1 = new vb1(context2);
                    if (vb1.isAvailableOnDevice()) {
                        e = vb1;
                    }
                    if (e == null) {
                        e = tb1.e();
                    }
                } else if (i <= 33) {
                    e = tb1.e();
                }
            }
        } else {
            e = tb1.e();
        }
        ob1 ob1 = e;
        if (ob1 == null) {
            kb1.a(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            ob1.onGetCredential(context, nv2, cancellationSignal, orVar, kb1);
        }
        return kk0.t();
    }
}
