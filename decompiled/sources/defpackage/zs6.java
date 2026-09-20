package defpackage;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: zs6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zs6 {
    public static final /* synthetic */ int b = 0;
    public final d48 a = d48.x;

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (sg3.e(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return sg3.e(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() == list2.size()) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                if (a((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean e(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        if (sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2) {
            return true;
        }
        return false;
    }

    public static final boolean f(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        if (sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) {
            return false;
        }
        return true;
    }

    public static final boolean g(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        if (sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean h(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        if (sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0) {
            return true;
        }
        return false;
    }

    public final pb8 c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new pb8(a42.w);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        ys6.d(sidecarDeviceState2, ys6.b(sidecarDeviceState));
        return new pb8(d(ys6.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList d(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qy2 i = i((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (i != null) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [vr2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [vr2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3, types: [vr2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v4, types: [vr2, java.lang.Object] */
    public final qy2 i(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        py2 py2;
        bl2 bl2 = bl2.c;
        sidecarDisplayFeature.getClass();
        kw5 kw5 = kw5.x;
        d48 d48 = this.a;
        d48.getClass();
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new v18(sidecarDisplayFeature, d48, kw5).v("Type must be either TYPE_FOLD or TYPE_HINGE", new Object()).v("Feature bounds must not be 0", new Object()).v("TYPE_FOLD must have 0 area", new Object()).v("Feature be pinned to either left or top", new Object()).f();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            py2 = py2.y;
        } else if (type != 2) {
            return null;
        } else {
            py2 = py2.z;
        }
        int b2 = ys6.b(sidecarDeviceState);
        if (b2 == 0 || b2 == 1) {
            return null;
        }
        if (b2 == 2) {
            bl2 = bl2.d;
        } else if (b2 != 3 && b2 == 4) {
            return null;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        rect.getClass();
        return new qy2(new gb0(rect), py2, bl2);
    }
}
