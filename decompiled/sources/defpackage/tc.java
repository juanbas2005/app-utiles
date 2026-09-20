package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: tc  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tc implements eh6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tc(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final float a(float f) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case b85.b:
                vc vcVar = (vc) obj2;
                float d = vcVar.f0.d(f);
                float d2 = d - vcVar.f0.j.d();
                ((ad) obj).a(d, 0.0f);
                return d2;
            default:
                zh6 zh6 = (zh6) obj2;
                if (Math.abs(f) == 0.0f || ((Boolean) zh6.h.b()).booleanValue()) {
                    return zh6.e(zh6.h(((xh6) obj).a(zh6.f(zh6.i(f)), 2)));
                }
                throw new CancellationException("The fling animation was cancelled");
        }
    }
}
