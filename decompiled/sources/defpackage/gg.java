package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import cu.lestebang.utiletecsa.R;

/* renamed from: gg  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gg implements bx2 {
    public static boolean g = true;
    public final je a;
    public final Object b = new Object();
    public q58 c;
    public boolean d;
    public qc3 e;
    public final eg f;

    public gg(je jeVar) {
        this.a = jeVar;
        eg egVar = new eg(this);
        this.f = egVar;
        if (jeVar.isAttachedToWindow()) {
            Context context = jeVar.getContext();
            if (!this.d) {
                context.getApplicationContext().registerComponentCallbacks(egVar);
                this.d = true;
            }
        }
        jeVar.addOnAttachStateChangeListener(new fg(0, this));
    }

    public static final void d(gg ggVar) {
        qc3 qc3 = ggVar.e;
        if (qc3 != null) {
            synchronized (qc3) {
                try {
                    tp4 tp4 = (tp4) qc3.x;
                    if (tp4 != null) {
                        tp4.a();
                    }
                    qc3.y = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ggVar.e = null;
    }

    public final void a(cx2 cx2) {
        synchronized (this.b) {
            if (!cx2.s) {
                cx2.s = true;
                cx2.b();
            }
        }
    }

    public final qc3 b() {
        qc3 qc3 = this.e;
        if (qc3 != null) {
            return qc3;
        }
        qc3 qc32 = new qc3(7, false);
        this.e = qc32;
        return qc32;
    }

    public final cx2 c() {
        ex2 ex2;
        cx2 cx2;
        ex2 ex22;
        synchronized (this.b) {
            try {
                je jeVar = this.a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    long unused = jeVar.getUniqueDrawingId();
                }
                if (i >= 29) {
                    ex2 = new jx2();
                } else {
                    if (g) {
                        ex22 = new hx2(this.a, new uk0(), new tk0());
                    } else {
                        ex22 = new lx2(e(this.a));
                    }
                    ex2 = ex22;
                }
            } catch (Throwable th) {
                throw th;
            }
            cx2 = new cx2(ex2);
        }
        return cx2;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [q58, android.view.View, ez1, android.view.ViewGroup] */
    public final ez1 e(je jeVar) {
        q58 q58 = this.c;
        if (q58 != null) {
            return q58;
        }
        ? viewGroup = new ViewGroup(jeVar.getContext());
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        viewGroup.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        jeVar.addView((View) viewGroup, -1);
        this.c = viewGroup;
        return viewGroup;
    }
}
