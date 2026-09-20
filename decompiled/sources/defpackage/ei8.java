package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ei8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ei8 extends iw2 {
    public final GoogleSignInOptions A;

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, sw2] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object, sw2] */
    /* JADX WARNING: Illegal instructions before constructor call */
    public ei8(Context context, Looper looper, kd6 kd6, GoogleSignInOptions googleSignInOptions, ng8 ng8, ng8 ng82) {
        super(context, looper, 91, r5, ng8, ng82, 0);
        sw2 sw2;
        GoogleSignInOptions googleSignInOptions2 = googleSignInOptions;
        kd6 kd62 = kd6;
        Set<Scope> set = (Set) kd62.y;
        if (googleSignInOptions2 != null) {
            ? obj = new Object();
            obj.a = new HashSet();
            obj.h = new HashMap();
            obj.a = new HashSet(googleSignInOptions2.x);
            obj.b = googleSignInOptions2.A;
            obj.c = googleSignInOptions2.B;
            obj.d = googleSignInOptions2.z;
            obj.e = googleSignInOptions2.C;
            obj.f = googleSignInOptions2.y;
            obj.g = googleSignInOptions2.D;
            obj.h = GoogleSignInOptions.g(googleSignInOptions2.E);
            obj.i = googleSignInOptions2.F;
            sw2 = obj;
        } else {
            ? obj2 = new Object();
            obj2.a = new HashSet();
            obj2.h = new HashMap();
            sw2 = obj2;
        }
        sw2.i = yh8.a();
        if (!set.isEmpty()) {
            for (Scope add : set) {
                HashSet hashSet = sw2.a;
                hashSet.add(add);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = sw2.a;
        if (hashSet2.contains(GoogleSignInOptions.J)) {
            Scope scope = GoogleSignInOptions.I;
            if (hashSet2.contains(scope)) {
                hashSet2.remove(scope);
            }
        }
        if (sw2.d && (sw2.f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.H);
        }
        this.A = new GoogleSignInOptions(3, new ArrayList(hashSet2), sw2.f, sw2.d, sw2.b, sw2.c, sw2.e, sw2.g, sw2.h, sw2.i);
    }

    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof li8) {
            return (li8) queryLocalInterface;
        }
        return new gg8(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 1);
    }

    public final int i() {
        return 12451000;
    }

    public final String m() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final String n() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
