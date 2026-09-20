package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: bf2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class bf2 implements e77 {
    public final /* synthetic */ FirebaseMessaging w;
    public final /* synthetic */ String x;
    public final /* synthetic */ md4 y;

    public /* synthetic */ bf2(FirebaseMessaging firebaseMessaging, String str, md4 md4) {
        this.w = firebaseMessaging;
        this.x = str;
        this.y = md4;
    }

    public yb9 a() {
        yb9 yb9;
        yb9 yb92;
        int i;
        FirebaseMessaging firebaseMessaging = this.w;
        String str = this.x;
        md4 md4 = this.y;
        o9 o9Var = firebaseMessaging.d;
        boolean E = o9Var.E();
        if (!E || ((gk4) o9Var.B).d() < 261200000) {
            kd6 kd6 = (kd6) o9Var.A;
            String c = gk4.c((oe2) kd6.x);
            Bundle bundle = new Bundle();
            try {
                kd6.D0(c, bundle, E);
                ha6 ha6 = (ha6) kd6.z;
                gv1 gv1 = gv1.y;
                o21 o21 = ha6.c;
                if (o21.s() >= 12000000) {
                    kb9 s = kb9.s(ha6.b);
                    synchronized (s) {
                        i = s.x;
                        s.x = i + 1;
                    }
                    yb92 = s.t(new ba9(i, 1, bundle, 1)).f(gv1, jv2.x);
                } else if (o21.q() != 0) {
                    yb92 = ha6.b(bundle).g(gv1, new kc9(2, ha6, bundle));
                } else {
                    yb92 = b35.k(new IOException("MISSING_INSTANCEID_SERVICE"));
                }
            } catch (InterruptedException | ExecutionException e) {
                yb92 = b35.k(e);
            }
            yb9 = yb92.f(new or(1), new c9(11, kd6));
        } else {
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ar4("Firebase-Messaging-Network-Io"));
            yb9 = ((ve2) ((we2) o9Var.z)).c().g(newSingleThreadExecutor, new yv0(7, (Object) o9Var, (Object) newSingleThreadExecutor));
        }
        return yb9.l(firebaseMessaging.h, new bf2(firebaseMessaging, str, md4));
    }

    public yb9 q(Object obj) {
        String str;
        FirebaseMessaging firebaseMessaging = this.w;
        String str2 = this.x;
        md4 md4 = this.y;
        String str3 = (String) obj;
        uy5 c = FirebaseMessaging.c(firebaseMessaging.b);
        oe2 oe2 = firebaseMessaging.a;
        oe2.a();
        if ("[DEFAULT]".equals(oe2.b)) {
            str = "";
        } else {
            str = oe2.d();
        }
        String b = firebaseMessaging.i.b();
        synchronized (c) {
            String b2 = md4.b(System.currentTimeMillis(), str3, b);
            if (b2 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c.x).edit();
                edit.putString(str + "|T|" + str2 + "|*", b2);
                edit.commit();
            }
        }
        if (firebaseMessaging.d.E() || md4 == null || !str3.equals((String) md4.b)) {
            oe2 oe22 = firebaseMessaging.a;
            oe22.a();
            String str4 = oe22.b;
            if ("[DEFAULT]".equals(str4)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    oe22.a();
                    sb.append(str4);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                boolean E = firebaseMessaging.d.E();
                Intent intent = new Intent();
                intent.putExtra("token", str3);
                if (E) {
                    intent.setAction("com.google.firebase.messaging.FCM_REGISTERED");
                } else {
                    intent.setAction("com.google.firebase.messaging.NEW_TOKEN");
                }
                new qc3(firebaseMessaging.b, 2).J(intent);
            }
        }
        return b35.l(str3);
    }
}
