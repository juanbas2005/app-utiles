package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: iw2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class iw2 extends y50 {
    public final Set z;

    /* JADX WARNING: Illegal instructions before constructor call */
    public iw2(Context context, Looper looper, int i, kd6 kd6, nw2 nw2, ow2 ow2, int i2) {
        super(context, looper, r3, r4, i, new ay4(17, nw2), new br4(22, (Object) ow2), (String) kd6.A);
        g99 a = g99.a(context);
        lw2 lw2 = lw2.e;
        z65.k(nw2);
        z65.k(ow2);
        Set<Scope> set = (Set) kd6.y;
        for (Scope contains : set) {
            if (!set.contains(contains)) {
                h.s("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.z = set;
    }

    public final Account e() {
        return null;
    }

    public final Executor g() {
        return null;
    }

    public final Set k() {
        return this.z;
    }
}
