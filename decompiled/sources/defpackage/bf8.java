package defpackage;

import android.view.View;
import android.view.ViewGroup;
import cu.lestebang.utiletecsa.R;

/* renamed from: bf8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class bf8 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: ve8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0091  */
    public static final ve8 a(a1 a1Var, yx0 yx0, fw0 fw0) {
        je jeVar;
        Object tag;
        ve8 ve8 = null;
        if (fw2.a.compareAndSet(false, true)) {
            ad0 c = rj1.c(1, 6, (vc0) null);
            ar7.H(gl0.E((e81) ej.I.getValue()), (e81) null, (r81) null, new p0((Object) c, (f61) null, 25), 3);
            pb pbVar = new pb(11, c);
            synchronized (nx6.c) {
                nx6.i = dt0.N0(nx6.i, pbVar);
            }
            nx6.a();
        }
        if (a1Var.getChildCount() > 0) {
            View childAt = a1Var.getChildAt(0);
            if (childAt instanceof je) {
                jeVar = (je) childAt;
                if (jeVar == null) {
                    jeVar = new je(a1Var.getContext(), yx0);
                    a1Var.addView(jeVar.getView(), a);
                }
                if (jeVar.getComposeViewContext() != yx0) {
                    a1Var.m(yx0);
                }
                if (a1Var.getComposeViewContext$ui() != null) {
                    yx0.d();
                    jeVar.setComposeViewContextIncrementedDuringInit$ui(true);
                }
                tag = jeVar.getTag(R.id.wrapped_composition_tag);
                if (tag instanceof ve8) {
                    ve8 = tag;
                }
                if (ve8 == null) {
                    gs7 gs7 = new gs7(jeVar.getRoot());
                    yx0.f();
                    ky0 ky0 = yx0.c;
                    ky0.getClass();
                    ve8 = new ve8(jeVar, new py0(ky0, gs7));
                    jeVar.setTag(R.id.wrapped_composition_tag, ve8);
                }
                ve8.c(fw0);
                yx0.f();
                ky0 ky02 = yx0.c;
                ky02.getClass();
                jeVar.setFrameEndScheduler$ui(new af8(ky02));
                return ve8;
            }
        } else {
            a1Var.removeAllViews();
        }
        jeVar = null;
        if (jeVar == null) {
        }
        if (jeVar.getComposeViewContext() != yx0) {
        }
        if (a1Var.getComposeViewContext$ui() != null) {
        }
        tag = jeVar.getTag(R.id.wrapped_composition_tag);
        if (tag instanceof ve8) {
        }
        if (ve8 == null) {
        }
        ve8.c(fw0);
        yx0.f();
        ky0 ky022 = yx0.c;
        ky022.getClass();
        jeVar.setFrameEndScheduler$ui(new af8(ky022));
        return ve8;
    }
}
