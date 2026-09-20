package defpackage;

import android.view.ActionMode;
import android.view.View;
import cu.lestebang.utiletecsa.R;

/* renamed from: d9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d9 implements jw1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void b() {
        int i = this.a;
        boolean z = true;
        Object obj = this.b;
        switch (i) {
            case b85.b:
                a9 a9Var = ((w8) obj).a;
                if (a9Var != null) {
                    a9Var.e0();
                    return;
                } else {
                    h.s("Launcher has not been initialized");
                    return;
                }
            case 1:
                yu1 yu1 = (yu1) obj;
                yu1.dismiss();
                yu1.D.e();
                return;
            case 2:
                pl5 pl5 = (pl5) obj;
                pl5.e();
                pl5.setTag(R.id.view_tree_lifecycle_owner, (Object) null);
                pl5.setTag(R.id.view_tree_navigation_event_dispatcher_owner, (Object) null);
                pl5.L.removeViewImmediate(pl5);
                rv4 navigationEventDispatcher = pl5.getNavigationEventDispatcher();
                navigationEventDispatcher.d();
                navigationEventDispatcher.b = true;
                as asVar = new as();
                asVar.addLast(navigationEventDispatcher);
                while (!asVar.isEmpty()) {
                    rv4 rv4 = (rv4) asVar.removeFirst();
                    rv4.b = z;
                    mp4 mp4 = rv4.f;
                    mp4 mp42 = rv4.g;
                    mp4 mp43 = rv4.e;
                    Object[] objArr = mp43.b;
                    long[] jArr = mp43.c;
                    for (int i2 = mp43.e; i2 != Integer.MAX_VALUE; i2 = (int) (2147483647L & (jArr[i2] >> 31))) {
                        asVar.addLast((rv4) objArr[i2]);
                    }
                    mp4 e = ar7.e(mp42);
                    Object[] objArr2 = e.b;
                    long[] jArr2 = e.c;
                    for (int i3 = e.e; i3 != Integer.MAX_VALUE; i3 = (int) ((jArr2[i3] >> 31) & 2147483647L)) {
                        zv4 zv4 = (zv4) objArr2[i3];
                        aw4 aw4 = navigationEventDispatcher.d;
                        aw4.getClass();
                        zv4.getClass();
                        aw4.k.h(zv4);
                        aw4.j.h(zv4);
                        aw4.i.h(zv4);
                        zv4.a = null;
                        zv4.c();
                    }
                    mp42.b();
                    mp4 e2 = ar7.e(mp4);
                    Object[] objArr3 = e2.b;
                    long[] jArr3 = e2.c;
                    for (int i4 = e2.e; i4 != Integer.MAX_VALUE; i4 = (int) ((jArr3[i4] >> 31) & 2147483647L)) {
                        ((tv4) objArr3[i4]).h();
                    }
                    mp4.b();
                    mp43.b();
                    z = true;
                }
                return;
            case 3:
                ui uiVar = (ui) obj;
                cy6 cy6 = uiVar.e;
                c9 c9Var = (c9) cy6.i;
                if (c9Var != null) {
                    c9Var.h();
                }
                cy6.a();
                ActionMode actionMode = uiVar.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                uiVar.h = null;
                return;
            case 4:
                o60 o60 = (o60) ((p60) obj).c.getValue();
                if (o60 != null) {
                    o60.close();
                    return;
                }
                return;
            case 5:
                kk0 kk0 = ((ek7) obj).c;
                if (kk0 != null) {
                    kk0.a((Throwable) null);
                    return;
                }
                return;
            case 6:
                ((nw1) obj).x.b();
                return;
            case 7:
                ((ze7) obj).o();
                return;
            case 8:
                r92 r92 = (r92) obj;
                View view = r92.x;
                if (r92.w) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(r92);
                    r92.w = false;
                }
                view.removeOnAttachStateChangeListener(r92);
                return;
            case 9:
                ((f24) obj).d = null;
                return;
            case 10:
                t24 t24 = (t24) obj;
                l90 l90 = t24.c;
                if (l90 != null) {
                    l90.a = false;
                }
                t24.c = null;
                return;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                o24 o24 = (o24) obj;
                o24.f = true;
                o24.d = 0;
                o24.c();
                return;
            default:
                ((oi6) ((in8) obj)).o1((cy6) null);
                return;
        }
    }
}
