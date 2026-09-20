package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.ArrayList;

/* renamed from: s7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public s7(e68 e68, View view) {
        this.a = 6;
        this.b = e68;
    }

    public void onAnimationCancel(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case b85.b:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.S = null;
                actionBarOverlayLayout.F = false;
                return;
            case 6:
                ((e68) obj).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case b85.b:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.S = null;
                actionBarOverlayLayout.F = false;
                return;
            case 1:
                tk tkVar = (tk) obj;
                ArrayList arrayList = new ArrayList(tkVar.A);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ColorStateList colorStateList = ((lg4) arrayList.get(i2)).b.K;
                    if (colorStateList != null) {
                        tkVar.setTintList(colorStateList);
                    }
                }
                return;
            case 2:
                n02 n02 = (n02) obj;
                n02.p();
                n02.r.start();
                return;
            case 3:
                ((HideBottomViewOnScrollBehavior) obj).k = null;
                return;
            case 4:
                ((HideViewOnScrollBehavior) obj).k = null;
                return;
            case 5:
                ((km7) obj).m();
                animator.removeListener(this);
                return;
            default:
                ((e68) obj).c();
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                tk tkVar = (tk) obj;
                ArrayList arrayList = new ArrayList(tkVar.A);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((lg4) arrayList.get(i2)).a(tkVar);
                }
                return;
            case 6:
                ((e68) obj).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public /* synthetic */ s7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
