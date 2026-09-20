package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.List;

/* renamed from: k94  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class k94 implements vr2 {
    public final /* synthetic */ eh A;
    public final /* synthetic */ float B;
    public final /* synthetic */ float[] C;
    public final /* synthetic */ long D;
    public final /* synthetic */ bd5 E;
    public final /* synthetic */ uj w;
    public final /* synthetic */ uj x;
    public final /* synthetic */ ad5 y;
    public final /* synthetic */ List z;

    public /* synthetic */ k94(uj ujVar, uj ujVar2, ad5 ad5, List list, eh ehVar, float f, float[] fArr, long j, bd5 bd5) {
        this.w = ujVar;
        this.x = ujVar2;
        this.y = ad5;
        this.z = list;
        this.A = ehVar;
        this.B = f;
        this.C = fArr;
        this.D = j;
        this.E = bd5;
    }

    /* JADX INFO: finally extract failed */
    public final Object y(Object obj) {
        List list = this.z;
        eh ehVar = this.A;
        float f = this.B;
        float[] fArr = this.C;
        long j = this.D;
        bd5 bd5 = this.E;
        wy3 wy3 = (wy3) obj;
        float floatValue = ((Number) this.w.d()).floatValue();
        float d = this.y.d();
        float floatValue2 = ((Number) this.x.d()).floatValue() + d + (90.0f * floatValue);
        long v0 = wy3.w.v0();
        tk0 tk0 = wy3.w;
        wr0 wr0 = tk0.x;
        long L = wr0.L();
        wr0.D().h();
        float f2 = f;
        try {
            ((ji8) wr0.x).D(floatValue2, v0);
            j45.v((km4) list.get(bd5.d()), floatValue, ehVar);
            long e = tk0.e();
            eh4.d(fArr);
            eh4.f(fArr, Float.intBitsToFloat((int) (e >> 32)) * f2, Float.intBitsToFloat((int) (4294967295L & e)) * f2);
            if (ehVar.d == null) {
                ehVar.d = new Matrix();
            }
            Matrix matrix = ehVar.d;
            matrix.getClass();
            sg3.T(matrix, fArr);
            Path path = ehVar.a;
            Matrix matrix2 = ehVar.d;
            matrix2.getClass();
            path.transform(matrix2);
            ehVar.i(l35.d(fb5.k(e), ehVar.d().b()));
            wy3.w0(ehVar, j, rd2.a);
            b81.u(wr0, L);
            return vs7.a;
        } catch (Throwable th) {
            b81.u(wr0, L);
            throw th;
        }
    }
}
