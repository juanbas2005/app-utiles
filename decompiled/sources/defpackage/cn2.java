package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* renamed from: cn2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cn2 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ byte[] C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cn2(byte[] bArr, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = bArr;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((cn2) o(f61, o81)).s(vs7);
            default:
                return ((cn2) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                cn2 cn2 = new cn2(this.C, f61, 0);
                cn2.B = obj;
                return cn2;
            default:
                cn2 cn22 = new cn2(this.C, f61, 1);
                cn22.B = obj;
                return cn22;
        }
    }

    public final Object s(Object obj) {
        Object obj2;
        Object obj3;
        int i = this.A;
        byte[] bArr = this.C;
        o81 o81 = (o81) this.B;
        switch (i) {
            case b85.b:
                o85.q(obj);
                try {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    if (decodeByteArray != null) {
                        obj2 = new hg(decodeByteArray);
                    } else {
                        obj2 = null;
                    }
                } catch (Throwable th) {
                    obj2 = new m66(th);
                }
                if (obj2 instanceof m66) {
                    return null;
                }
                return obj2;
            default:
                o85.q(obj);
                try {
                    Bitmap decodeByteArray2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    if (decodeByteArray2 != null) {
                        obj3 = new hg(decodeByteArray2);
                    } else {
                        obj3 = null;
                    }
                } catch (Throwable th2) {
                    obj3 = new m66(th2);
                }
                if (obj3 instanceof m66) {
                    return null;
                }
                return obj3;
        }
    }
}
