package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.logging.Level;

/* renamed from: a29  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a29 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public a29(v89 v89, z99 z99) {
        this.a = 2;
        this.c = z99;
        Objects.requireNonNull(v89);
        this.b = v89;
    }

    public final Object call() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case b85.b /*0*/:
                w29 w29 = (w29) obj;
                w29.d.T();
                uq8 uq8 = w29.d.y;
                v89.R(uq8);
                return uq8.Z1((String) obj2);
            case 1:
                w29 w292 = (w29) obj;
                w292.d.T();
                return new dq8(w292.d.p0(((z99) obj2).w));
            case 2:
                z99 z99 = (z99) obj2;
                String str = z99.w;
                z65.k(str);
                v89 v89 = (v89) obj;
                h39 a2 = v89.a(str);
                f39 f39 = f39.ANALYTICS_STORAGE;
                if (a2.i(f39) && h39.c(100, z99.O).i(f39)) {
                    return v89.a0(z99).F();
                }
                v89.G().J.a("Analytics storage consent denied. Returning null app instance id");
                return null;
            default:
                fm8 fm8 = (fm8) obj2;
                t99 t99 = (t99) obj;
                x49 x49 = (x49) fm8.x;
                k68 k68 = new k68(27, false);
                try {
                    k68 k682 = new k68((pk8) t99);
                    k682.y = new k68[]{k68};
                    Void voidR = (Void) ((ka9) x49.f.get()).a((Uri) fm8.y, k682);
                } catch (IOException | RuntimeException e) {
                    c35.q(Level.WARNING, x49.a(), e, "Failed to update snapshot for %s flags may be stale.", (String) fm8.z);
                }
                return null;
        }
    }

    public /* synthetic */ a29(w29 w29, Object obj, int i) {
        this.a = i;
        this.c = obj;
        this.b = w29;
    }

    public /* synthetic */ a29(fm8 fm8, t99 t99) {
        this.a = 3;
        this.c = fm8;
        this.b = t99;
    }
}
