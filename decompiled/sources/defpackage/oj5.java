package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* renamed from: oj5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class oj5 implements mj5 {
    public static final oj5 b = new oj5(0);
    public static final oj5 c = new oj5(1);
    public final /* synthetic */ int a;

    public /* synthetic */ oj5(int i) {
        this.a = i;
    }

    public final boolean a() {
        switch (this.a) {
            case b85.b:
                return false;
            default:
                return true;
        }
    }

    public final lj5 b(View view, tp1 tp1) {
        switch (this.a) {
            case b85.b:
                return new nj5(new Magnifier(view));
            default:
                return new nj5(new Magnifier(view));
        }
    }
}
