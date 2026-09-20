package defpackage;

/* renamed from: e48  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e48 {
    public static final e48[] h = {new e48(1, 10, 10, 8, 8, new qa(5, new dv5(1, 3, 10))), new e48(2, 12, 12, 10, 10, new qa(7, new dv5(1, 5, 10))), new e48(3, 14, 14, 12, 12, new qa(10, new dv5(1, 8, 10))), new e48(4, 16, 16, 14, 14, new qa(12, new dv5(1, 12, 10))), new e48(5, 18, 18, 16, 16, new qa(14, new dv5(1, 18, 10))), new e48(6, 20, 20, 18, 18, new qa(18, new dv5(1, 22, 10))), new e48(7, 22, 22, 20, 20, new qa(20, new dv5(1, 30, 10))), new e48(8, 24, 24, 22, 22, new qa(24, new dv5(1, 36, 10))), new e48(9, 26, 26, 24, 24, new qa(28, new dv5(1, 44, 10))), new e48(10, 32, 32, 14, 14, new qa(36, new dv5(1, 62, 10))), new e48(11, 36, 36, 16, 16, new qa(42, new dv5(1, 86, 10))), new e48(12, 40, 40, 18, 18, new qa(48, new dv5(1, 114, 10))), new e48(13, 44, 44, 20, 20, new qa(56, new dv5(1, 144, 10))), new e48(14, 48, 48, 22, 22, new qa(68, new dv5(1, 174, 10))), new e48(15, 52, 52, 24, 24, new qa(42, new dv5(2, 102, 10))), new e48(16, 64, 64, 14, 14, new qa(56, new dv5(2, 140, 10))), new e48(17, 72, 72, 16, 16, new qa(36, new dv5(4, 92, 10))), new e48(18, 80, 80, 18, 18, new qa(48, new dv5(4, 114, 10))), new e48(19, 88, 88, 20, 20, new qa(56, new dv5(4, 144, 10))), new e48(20, 96, 96, 22, 22, new qa(68, new dv5(4, 174, 10))), new e48(21, 104, 104, 24, 24, new qa(56, new dv5(6, 136, 10))), new e48(22, 120, 120, 18, 18, new qa(68, new dv5(6, 175, 10))), new e48(23, 132, 132, 20, 20, new qa(62, new dv5(8, 163, 10))), new e48(24, 144, 144, 22, 22, new qa(new dv5(8, 156, 10), new dv5(2, 155, 10))), new e48(25, 8, 18, 6, 16, new qa(7, new dv5(1, 5, 10))), new e48(26, 8, 32, 6, 14, new qa(11, new dv5(1, 10, 10))), new e48(27, 12, 26, 10, 24, new qa(14, new dv5(1, 16, 10))), new e48(28, 12, 36, 10, 16, new qa(18, new dv5(1, 22, 10))), new e48(29, 16, 36, 14, 16, new qa(24, new dv5(1, 32, 10))), new e48(30, 16, 48, 14, 22, new qa(28, new dv5(1, 49, 10)))};
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final qa f;
    public final int g;

    public e48(int i, int i2, int i3, int i4, int i5, qa qaVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = qaVar;
        int i6 = qaVar.x;
        int i7 = 0;
        for (dv5 dv5 : (dv5[]) qaVar.y) {
            i7 += (dv5.c + i6) * dv5.b;
        }
        this.g = i7;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
