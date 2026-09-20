package defpackage;

import java.util.Map;

/* renamed from: vu2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class vu2 extends ru2 implements yj4 {
    public pc2 x = pc2.c;
    public boolean y;

    public final void f(wu2 wu2) {
        mv6 mv6;
        if (!this.y) {
            this.x = this.x.clone();
            this.y = true;
        }
        pc2 pc2 = this.x;
        pc2 pc22 = wu2.w;
        pc2.getClass();
        int i = 0;
        while (true) {
            int size = pc22.a.x.size();
            mv6 = pc22.a;
            if (i >= size) {
                break;
            }
            pc2.g((Map.Entry) mv6.x.get(i));
            i++;
        }
        for (Map.Entry g : mv6.c()) {
            pc2.g(g);
        }
    }
}
