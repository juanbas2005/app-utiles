package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import cu.lestebang.utiletecsa.R;

/* renamed from: ac8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ac8 {
    public static final tp4 a = new tp4();

    static {
        long[] jArr = bg6.a;
    }

    public static final ky0 a(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof ky0) {
            return (ky0) tag;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: x32} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: gj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: x32} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: x32} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: gj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: gj} */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.Object, h06] */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final gy5 b(View view) {
        e81 e81;
        gj gjVar;
        in8 in8;
        if (!view.isAttachedToWindow()) {
            yb3.b("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        ViewParent k = z85.k(view);
        while (k instanceof View) {
            View view2 = (View) k;
            if (view2.getId() == 16908290) {
                break;
            }
            View view3 = view2;
            k = view2.getParent();
            view = view3;
        }
        ky0 a2 = a(view);
        if (a2 == null) {
            ((wb8) xb8.a.get()).getClass();
            x32 x32 = x32.w;
            z97 z97 = ej.I;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                e81 = (e81) ej.I.getValue();
            } else {
                e81 = (e81) ej.J.get();
                if (e81 == null) {
                    h.s("no AndroidUiDispatcher for this thread");
                    return null;
                }
            }
            e81 X = e81.X(x32);
            gj gjVar2 = (gj) X.a0(d63.F);
            if (gjVar2 != null) {
                gj gjVar3 = new gj(gjVar2);
                l90 l90 = (l90) gjVar3.y;
                synchronized (l90.b) {
                    l90.a = false;
                    gjVar = gjVar3;
                }
            } else {
                gjVar = null;
            }
            ? obj = new Object();
            e81 e812 = (lm4) X.a0(xb4.U);
            if (e812 == null) {
                e812 = new mm4(view.getContext().getApplicationContext());
                obj.w = e812;
            }
            if (gjVar != null) {
                x32 = gjVar;
            }
            e81 X2 = X.X(x32).X(e812);
            gy5 gy5 = new gy5(X2);
            synchronized (gy5.c) {
                gy5.t = true;
            }
            ig0 E = gl0.E(X2);
            t54 o = i95.o(view);
            if (o != null) {
                in8 = o.k();
            } else {
                in8 = null;
            }
            if (in8 != null) {
                view.addOnAttachStateChangeListener(new gq2(view, gy5));
                in8.x0(new zb8(E, gjVar, gy5, obj));
                view.setTag(R.id.androidx_compose_ui_view_composition_context, gy5);
                cw2 cw2 = cw2.w;
                Handler handler = view.getHandler();
                int i = hy2.a;
                view.addOnAttachStateChangeListener(new fg(9, ar7.H(cw2, new gy2(handler, "windowRecomposer cleanup", false).B, (r81) null, new zw7(gy5, view, (f61) null, 9), 2)));
                return gy5;
            }
            yb3.c("ViewTreeLifecycleOwner not found from " + view);
            ta1.e();
            return null;
        } else if (a2 instanceof gy5) {
            return (gy5) a2;
        } else {
            h.s("root viewTreeParentCompositionContext is not a Recomposer");
            return null;
        }
    }
}
