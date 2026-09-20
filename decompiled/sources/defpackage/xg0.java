package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: xg0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xg0 {
    public ArrayList a = null;
    public int b = 0;

    public final void a() {
        this.b += 1000;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            sb.append((yg0) it.next());
            sb.append(' ');
        }
        sb.append('[');
        return f21.j(sb, this.b, ']');
    }
}
