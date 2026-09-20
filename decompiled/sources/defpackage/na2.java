package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: na2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class na2 {
    public static qy2 a(qb8 qb8, FoldingFeature foldingFeature) {
        py2 py2;
        bl2 bl2;
        qb8.getClass();
        foldingFeature.getClass();
        int type = foldingFeature.getType();
        if (type == 1) {
            py2 = py2.y;
        } else if (type != 2) {
            return null;
        } else {
            py2 = py2.z;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bl2 = bl2.c;
        } else if (state != 2) {
            return null;
        } else {
            bl2 = bl2.d;
        }
        Rect bounds = foldingFeature.getBounds();
        bounds.getClass();
        gb0 gb0 = new gb0(bounds);
        Rect c = qb8.a.c();
        if (gb0.a() == 0 && gb0.b() == 0) {
            return null;
        }
        if (gb0.b() != c.width() && gb0.a() != c.height()) {
            return null;
        }
        if (gb0.b() < c.width() && gb0.a() < c.height()) {
            return null;
        }
        if (gb0.b() == c.width() && gb0.a() == c.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        bounds2.getClass();
        return new qy2(new gb0(bounds2), py2, bl2);
    }

    public static pb8 b(qb8 qb8, WindowLayoutInfo windowLayoutInfo) {
        qy2 qy2;
        qb8.getClass();
        windowLayoutInfo.getClass();
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        displayFeatures.getClass();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                qy2 = a(qb8, foldingFeature);
            } else {
                qy2 = null;
            }
            if (qy2 != null) {
                arrayList.add(qy2);
            }
        }
        return new pb8(arrayList);
    }

    public static pb8 c(Context context, WindowLayoutInfo windowLayoutInfo) {
        up1 up1;
        Context context2 = context;
        WindowLayoutInfo windowLayoutInfo2 = windowLayoutInfo;
        vb8 vb8 = pe2.Q;
        vb8 vb82 = jb0.x;
        vb8 vb83 = vp1.x;
        windowLayoutInfo2.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            up1 = vp1.w;
        } else {
            up1 = g22.z;
        }
        sg3.f(1, 2, 4, 8, 16, 32, 64, 128);
        if (i >= 30) {
            if (i >= 34) {
                vb8 = vb83;
            } else if (i >= 30) {
                vb8 = vb82;
            }
            return b(vb8.h(context2, up1), windowLayoutInfo2);
        } else if (i < 29 || !(context2 instanceof Activity)) {
            kj6.n("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            return null;
        } else {
            Activity activity = (Activity) context2;
            if (i >= 34) {
                vb8 = vb83;
            } else if (i >= 30) {
                vb8 = vb82;
            }
            return b(vb8.b(activity, up1), windowLayoutInfo2);
        }
    }
}
