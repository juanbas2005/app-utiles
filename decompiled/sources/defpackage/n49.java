package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: n49  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class n49 implements y45, c99, ct {
    public final /* synthetic */ int w;
    public final Object x;

    public n49() {
        this.w = 3;
        this.x = new AtomicInteger();
    }

    public void K(yb9 yb9) {
        switch (this.w) {
            case b85.b:
                i49 i49 = (i49) this.x;
                if (yb9.d) {
                    i49.cancel(false);
                    return;
                } else if (yb9.k()) {
                    i49.l(yb9.i());
                    return;
                } else {
                    Exception h = yb9.h();
                    if (h != null) {
                        i49.m(h);
                        return;
                    }
                    throw new IllegalStateException();
                }
            default:
                y99 y99 = (y99) this.x;
                if (yb9.d) {
                    y99.cancel(false);
                    return;
                } else if (yb9.k()) {
                    Object i = yb9.i();
                    if (i == null) {
                        i = sw8.z;
                    }
                    if (sw8.C.E(y99, (Object) null, i)) {
                        y99.e(y99);
                        return;
                    }
                    return;
                } else {
                    Exception h2 = yb9.h();
                    if (h2 != null) {
                        if (sw8.C.E(y99, (Object) null, new jw8(h2))) {
                            y99.e(y99);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
        }
    }

    public /* synthetic */ ListenableFuture call() {
        return (x1) this.x;
    }

    public void f(String str, String str2, Bundle bundle) {
        boolean isEmpty = TextUtils.isEmpty(str);
        v89 v89 = (v89) this.x;
        if (isEmpty) {
            y19 y19 = v89.H;
            if (y19 != null) {
                pz8 pz8 = y19.B;
                y19.g(pz8);
                pz8.B.b("AppId not known when logging event", str2);
                return;
            }
            return;
        }
        v89.n0().l1(new yl0(this, str, str2, bundle, 12));
    }

    public /* synthetic */ n49(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }
}
