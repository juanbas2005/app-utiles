package defpackage;

import java.io.Serializable;

/* renamed from: ic3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ic3 {
    public final /* synthetic */ int a = 1;
    public final k23 b;
    public final k23 c;
    public final k23 d;
    public final k23 e;
    public final Serializable f;

    /* JADX WARNING: type inference failed for: r6v0, types: [ic3[], java.io.Serializable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public ic3(ic3[] r6) {
        this.f = r6;
        int length = r6.length;
        k23[] k23Arr = new k23[length];
        for (int i = 0; i < length; i++) {
            k23Arr[i] = ((ic3[]) this.f)[i].b();
        }
        this.b = new k23(1, new n48(k23Arr, 0));
        int length2 = ((ic3[]) this.f).length;
        k23[] k23Arr2 = new k23[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            k23Arr2[i2] = ((ic3[]) this.f)[i2].d();
        }
        this.c = new k23(0, new j23(k23Arr2, 0));
        int length3 = ((ic3[]) this.f).length;
        k23[] k23Arr3 = new k23[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            k23Arr3[i3] = ((ic3[]) this.f)[i3].c();
        }
        this.d = new k23(1, new n48(k23Arr3, 1));
        int length4 = ((ic3[]) this.f).length;
        k23[] k23Arr4 = new k23[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            k23Arr4[i4] = ((ic3[]) this.f)[i4].a();
        }
        this.e = new k23(0, new j23(k23Arr4, 1));
    }

    public final k23 a() {
        int i = this.a;
        return this.e;
    }

    public final k23 b() {
        int i = this.a;
        return this.b;
    }

    public final k23 c() {
        int i = this.a;
        return this.d;
    }

    public final k23 d() {
        int i = this.a;
        return this.c;
    }

    public final String toString() {
        int i = this.a;
        Serializable serializable = this.f;
        switch (i) {
            case b85.b:
                return qs.f1((ic3[]) serializable, (String) null, "innermostOf(", ")", (vr2) null, 57);
            default:
                String str = (String) serializable;
                if (str != null) {
                    return f21.h("RectRulers(", str, ")");
                }
                return super.toString();
        }
    }

    public ic3(String str) {
        this.f = str;
        this.b = new k23(1, (gs2) null);
        this.c = new k23(0, (gs2) null);
        this.d = new k23(1, (gs2) null);
        this.e = new k23(0, (gs2) null);
    }
}
