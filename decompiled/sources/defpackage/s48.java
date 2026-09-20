package defpackage;

import android.text.TextUtils;
import android.view.View;

/* renamed from: s48  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s48 extends ye4 {
    public final /* synthetic */ int A;

    public s48(int i, Class cls, int i2, int i3, int i4) {
        this.A = i4;
        this.w = i;
        this.z = cls;
        this.y = i2;
        this.x = i3;
    }

    public final Object c(View view) {
        switch (this.A) {
            case b85.b:
                return Boolean.valueOf(z48.c(view));
            case 1:
                return z48.a(view);
            default:
                return Boolean.valueOf(z48.b(view));
        }
    }

    public final void e(View view, Object obj) {
        switch (this.A) {
            case b85.b:
                z48.f(view, ((Boolean) obj).booleanValue());
                return;
            case 1:
                z48.e(view, (CharSequence) obj);
                return;
            default:
                z48.d(view, ((Boolean) obj).booleanValue());
                return;
        }
    }

    public final boolean h(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        switch (this.A) {
            case b85.b:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                if (bool == null || !bool.booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                if (bool2 == null || !bool2.booleanValue()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z == z2) {
                    z5 = true;
                }
                return !z5;
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                if (bool3 == null || !bool3.booleanValue()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (bool4 == null || !bool4.booleanValue()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z3 == z4) {
                    z5 = true;
                }
                return !z5;
        }
    }
}
