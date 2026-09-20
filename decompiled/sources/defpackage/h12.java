package defpackage;

import java.util.ArrayList;

/* renamed from: h12  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h12 {
    public final ArrayList a;
    public final ArrayList b;

    public h12(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayList();
                this.b = new ArrayList();
                return;
            case 2:
                this.a = new ArrayList(0);
                this.b = new ArrayList(0);
                return;
            default:
                this.a = new ArrayList();
                this.b = new ArrayList();
                return;
        }
    }

    public void a(String str, String str2) {
        str2.getClass();
        this.a.add(ie1.w(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        this.b.add(ie1.w(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    public void b(int[] iArr, String str) {
        this.a.add(iArr);
        this.b.add(str);
    }
}
