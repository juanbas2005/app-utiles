package defpackage;

import android.view.View;

/* renamed from: ln1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ln1 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ un1 x;
    public final /* synthetic */ gz6 y;

    public /* synthetic */ ln1(un1 un1, gz6 gz6, int i) {
        this.w = i;
        this.x = un1;
        this.y = gz6;
    }

    public final void run() {
        int i = this.w;
        gz6 gz6 = this.y;
        un1 un1 = this.x;
        switch (i) {
            case b85.b:
                un1.a(gz6);
                return;
            case 1:
                if (un1.b.contains(gz6)) {
                    int i2 = gz6.a;
                    View view = gz6.c.c0;
                    view.getClass();
                    hl6.a(i2, view, un1.a);
                    return;
                }
                return;
            default:
                un1.b.remove(gz6);
                un1.c.remove(gz6);
                return;
        }
    }
}
