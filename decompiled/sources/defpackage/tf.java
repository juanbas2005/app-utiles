package defpackage;

import android.view.DragEvent;
import android.view.View;

/* renamed from: tf  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tf implements View.OnDragListener, sx1 {
    public final ux1 a;
    public final os b = new os(0);
    public final sf c = new sf(this);

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, ux1] */
    public tf() {
        ? ll4 = new ll4();
        ll4.M = 0;
        this.a = ll4;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Object, d06] */
    public final boolean onDrag(View view, DragEvent dragEvent) {
        f96 f96 = new f96(19, (Object) dragEvent);
        int action = dragEvent.getAction();
        Object obj = kn7.w;
        os osVar = this.b;
        ux1 ux1 = this.a;
        switch (action) {
            case 1:
                ? obj2 = new Object();
                tx1 tx1 = new tx1(f96, ux1, obj2);
                if (tx1.y(ux1) == obj) {
                    h75.w(ux1, tx1);
                }
                boolean z = obj2.w;
                osVar.getClass();
                es esVar = new es(osVar);
                while (esVar.hasNext()) {
                    ((ux1) esVar.next()).Z0();
                }
                return z;
            case 2:
                ux1.Y0(f96);
                return false;
            case 3:
                return ux1.V0();
            case 4:
                pb pbVar = new pb(10, f96);
                if (pbVar.y(ux1) == obj) {
                    h75.w(ux1, pbVar);
                }
                osVar.clear();
                return false;
            case 5:
                ux1.W0();
                return false;
            case 6:
                ux1.X0();
                return false;
            default:
                return false;
        }
    }
}
