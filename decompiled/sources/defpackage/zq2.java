package defpackage;

import android.util.Log;
import androidx.fragment.app.strictmode.Violation;

/* renamed from: zq2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class zq2 {
    public static final yq2 a = yq2.a;

    public static yq2 a(bq2 bq2) {
        while (bq2 != null) {
            if (bq2.t()) {
                bq2.p();
            }
            bq2 = bq2.S;
        }
        return a;
    }

    public static void b(Violation violation) {
        if (rq2.L(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(violation.w.getClass().getName()), violation);
        }
    }

    public static final void c(bq2 bq2, String str) {
        str.getClass();
        b(new Violation(bq2, "Attempting to reuse fragment " + bq2 + " with previous ID " + str));
        a(bq2).getClass();
    }
}
