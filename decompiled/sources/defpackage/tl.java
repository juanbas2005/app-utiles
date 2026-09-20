package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: tl  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tl implements Appendable {
    public final StringBuilder w;
    public final ArrayList x;
    public final ArrayList y;

    public tl() {
        this.w = new StringBuilder(16);
        this.x = new ArrayList();
        this.y = new ArrayList();
        new ArrayList();
    }

    public final void a(vl vlVar) {
        StringBuilder sb = this.w;
        int length = sb.length();
        sb.append(vlVar.x);
        List list = vlVar.w;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ul ulVar = (ul) list.get(i);
                this.y.add(new sl(ulVar.b + length, ulVar.c + length, ulVar.a, ulVar.d));
            }
        }
    }

    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof vl;
        StringBuilder sb = this.w;
        if (z) {
            vl vlVar = (vl) charSequence;
            int length = sb.length();
            sb.append(vlVar.x, i, i2);
            List a = wl.a(vlVar, i, i2, (j5) null);
            if (a != null) {
                int size = a.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ul ulVar = (ul) a.get(i3);
                    this.y.add(new sl(ulVar.b + length, ulVar.c + length, ulVar.a, ulVar.d));
                }
            }
            return this;
        }
        sb.append(charSequence, i, i2);
        return this;
    }

    public final void b(String str) {
        this.w.append(str);
    }

    public final void c(int i) {
        ArrayList arrayList = this.x;
        if (i >= arrayList.size()) {
            int size = arrayList.size();
            zb3.b(i + " should be less than " + size);
        }
        while (arrayList.size() - 1 >= i) {
            if (arrayList.isEmpty()) {
                zb3.b("Nothing to pop.");
            }
            ((sl) arrayList.remove(arrayList.size() - 1)).c = this.w.length();
        }
    }

    public final int d(yy6 yy6) {
        sl slVar = new sl((rl) yy6, this.w.length(), 0, 12);
        ArrayList arrayList = this.x;
        arrayList.add(slVar);
        this.y.add(slVar);
        return arrayList.size() - 1;
    }

    public final vl e() {
        StringBuilder sb = this.w;
        String sb2 = sb.toString();
        ArrayList arrayList = this.y;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((sl) arrayList.get(i)).a(sb.length()));
        }
        return new vl(sb2, (List) arrayList2);
    }

    public tl(vl vlVar) {
        this();
        a(vlVar);
    }

    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof vl) {
            a((vl) charSequence);
            return this;
        }
        this.w.append(charSequence);
        return this;
    }

    public final Appendable append(char c) {
        this.w.append(c);
        return this;
    }
}
