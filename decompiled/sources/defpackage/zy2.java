package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: zy2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zy2 implements x77 {
    public final ArrayList w;

    public zy2(zk7 zk7) {
        zk7.getClass();
        String str = bd8.a;
        x21 x21 = zk7.b;
        xy4 xy4 = zk7.d;
        ArrayList I = sg3.I(new p70(x21, 0), new p70(zk7.c), new p70(zk7.e, 4));
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = zk7.a;
            context.getClass();
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            I.add(new oy4((ConnectivityManager) systemService));
        } else {
            xy4.getClass();
            I.addAll(sg3.E(new p70(xy4, 2), new p70(xy4, 3), new ky4(xy4), new jy4(xy4)));
        }
        this.w = I;
    }

    public bz2 a() {
        return new bz2((String[]) this.w.toArray(new String[0]));
    }

    public void b(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.w;
            if (i < arrayList.size()) {
                if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                    arrayList.remove(i);
                    arrayList.remove(i);
                    i -= 2;
                }
                i += 2;
            } else {
                return;
            }
        }
    }

    public di2 c(be8 be8) {
        be8.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((j21) next).c(be8)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(et0.e0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((j21) it2.next()).b(be8.j));
        }
        return gr8.F(new ze1(6, (di2[]) dt0.b1(arrayList2).toArray(new di2[0])));
    }

    public /* synthetic */ Object get() {
        Object obj = x49.j;
        return new ka9(this.w);
    }

    public /* synthetic */ zy2(ArrayList arrayList) {
        this.w = arrayList;
    }

    public zy2() {
        this.w = new ArrayList(20);
    }
}
