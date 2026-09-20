package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* renamed from: wf3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wf3 extends h49 {
    public final /* synthetic */ int C;

    public /* synthetic */ wf3(int i) {
        this.C = i;
    }

    public iw2 r(Context context, Looper looper, kd6 kd6, Object obj, nw2 nw2, ow2 ow2) {
        switch (this.C) {
            case 1:
                Context context2 = context;
                Looper looper2 = looper;
                kd6 kd62 = kd6;
                nw2 nw22 = nw2;
                ow2 ow22 = ow2;
                ht6 ht6 = (ht6) obj;
                kd62.getClass();
                Integer num = (Integer) kd62.C;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", (Parcelable) null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new ft6(context2, looper2, kd62, bundle, nw22, ow22);
            case 2:
                throw b81.j(obj);
            case 5:
                return new di8(context, looper, kd6, (ci8) obj, (ng8) nw2, (ng8) ow2);
            case 7:
                return new ei8(context, looper, kd6, (GoogleSignInOptions) obj, (ng8) nw2, (ng8) ow2);
            case 8:
                xm xmVar = (xm) obj;
                return new iw2(context, looper, ModuleDescriptor.MODULE_VERSION, kd6, nw2, ow2, 0);
            case 10:
                xm xmVar2 = (xm) obj;
                return new iw2(context, looper, 51, kd6, nw2, ow2, 0);
            default:
                return super.r(context, looper, kd6, obj, nw2, ow2);
        }
    }

    public iw2 s(Context context, Looper looper, kd6 kd6, Object obj, ng8 ng8, ng8 ng82) {
        switch (this.C) {
            case b85.b:
                Context context2 = context;
                Looper looper2 = looper;
                context2.getClass();
                looper2.getClass();
                ((xm) obj).getClass();
                return new iw2(context2, looper2, 352, kd6, ng8, ng82, 0);
            case 3:
                xm xmVar = (xm) obj;
                return new iw2(context, looper, 449, kd6, ng8, ng82, 0);
            case 4:
                return new rh8(context, looper, kd6, (ec7) obj, ng8, ng82);
            case 6:
                ng8 ng83 = ng8;
                ng8 ng84 = ng82;
                mi8 mi8 = (mi8) obj;
                return new xh8(context, looper, kd6, ng8, ng82);
            case 9:
                xm xmVar2 = (xm) obj;
                return new iw2(context, looper, 457, kd6, ng8, ng82, 0);
            default:
                return super.s(context, looper, kd6, obj, ng8, ng82);
        }
    }
}
