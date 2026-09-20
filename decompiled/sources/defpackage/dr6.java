package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* renamed from: dr6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dr6 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public dr6() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f2) {
        float f3 = this.d;
        if (f3 != f2) {
            float f4 = ((f2 - f3) + 360.0f) % 360.0f;
            if (f4 <= 180.0f) {
                float f5 = this.b;
                float f6 = this.c;
                zq6 zq6 = new zq6(f5, f6, f5, f6);
                zq6.f = this.d;
                zq6.g = f4;
                this.g.add(new xq6(zq6));
                this.d = f2;
            }
        }
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((br6) arrayList.get(i)).a(matrix, path);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ar6, br6, java.lang.Object] */
    public final void c(float f2, float f3) {
        ? br6 = new br6();
        br6.b = f2;
        br6.c = f3;
        this.f.add(br6);
        yq6 yq6 = new yq6(br6, this.b, this.c);
        a(yq6.b() + 270.0f);
        this.g.add(yq6);
        this.d = yq6.b() + 270.0f;
        this.b = f2;
        this.c = f3;
    }

    public final void d(float f2, float f3, float f4) {
        this.a = f2;
        this.b = 0.0f;
        this.c = f2;
        this.d = f3;
        this.e = (f3 + f4) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
