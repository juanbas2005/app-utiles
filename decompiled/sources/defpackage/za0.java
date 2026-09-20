package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* renamed from: za0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class za0 {
    public final /* synthetic */ int a = 4;
    public int b;
    public boolean c;
    public Object d;
    public Object e;

    public za0(Context context, de deVar) {
        this.d = deVar;
        this.b = 0;
        this.e = new GestureDetector(context, new cb3(this));
    }

    public xg8 a() {
        boolean z;
        if (((y36) this.d) != null) {
            z = true;
        } else {
            z = false;
        }
        z65.e("execute parameter required", z);
        return new xg8(this, (cc2[]) this.e, this.c, this.b);
    }

    public void b(int i) {
        switch (this.a) {
            case b85.b:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.e;
                WeakReference weakReference = bottomSheetBehavior.W;
                if (weakReference != null && weakReference.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        ((View) bottomSheetBehavior.W.get()).postOnAnimation((ge) this.d);
                        this.c = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.e;
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        ((View) sideSheetBehavior.p.get()).postOnAnimation((y0) this.d);
                        this.c = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public za0(uy5 uy5, boolean z) {
        do0 do0 = do0.N0;
        this.e = uy5;
        this.c = z;
        this.d = do0;
        this.b = Integer.MAX_VALUE;
    }

    public za0(SideSheetBehavior sideSheetBehavior) {
        this.e = sideSheetBehavior;
        this.d = new y0(23, this);
    }

    public za0(BottomSheetBehavior bottomSheetBehavior) {
        this.e = bottomSheetBehavior;
        this.d = new ge(3, (Object) this);
    }

    public /* synthetic */ za0() {
    }
}
