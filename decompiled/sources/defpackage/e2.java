package defpackage;

import java.util.Iterator;

/* renamed from: e2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class e2 implements Iterator, ar3 {
    public final /* synthetic */ int w;
    public int x;
    public final Object y;

    public e2(t52 t52) {
        this.w = 2;
        this.y = t52;
        this.x = t52.c;
    }

    public final boolean hasNext() {
        int i = this.w;
        Object obj = this.y;
        switch (i) {
            case b85.b:
                if (this.x < ((h2) obj).f()) {
                    return true;
                }
                return false;
            case 1:
                if (this.x < ((Object[]) obj).length) {
                    return true;
                }
                return false;
            case 2:
                if (this.x > 0) {
                    return true;
                }
                return false;
            case 3:
                if (this.x < ((cz6) obj).f()) {
                    return true;
                }
                return false;
            case 4:
                if (this.x < ((byte[]) obj).length) {
                    return true;
                }
                return false;
            case 5:
                if (this.x < ((int[]) obj).length) {
                    return true;
                }
                return false;
            case 6:
                if (this.x < ((long[]) obj).length) {
                    return true;
                }
                return false;
            default:
                if (this.x < ((short[]) obj).length) {
                    return true;
                }
                return false;
        }
    }

    public final Object next() {
        int i = this.w;
        Object obj = this.y;
        switch (i) {
            case b85.b:
                if (hasNext()) {
                    int i2 = this.x;
                    this.x = i2 + 1;
                    return ((h2) obj).get(i2);
                }
                rf2.c();
                return null;
            case 1:
                try {
                    int i3 = this.x;
                    this.x = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.x--;
                    kj6.i(e.getMessage());
                    return null;
                }
            case 2:
                t52 t52 = (t52) obj;
                int i4 = t52.c;
                int i5 = this.x;
                this.x = i5 - 1;
                return t52.e[i4 - i5];
            case 3:
                int i6 = this.x;
                this.x = i6 + 1;
                return ((cz6) obj).g(i6);
            case 4:
                int i7 = this.x;
                byte[] bArr = (byte[]) obj;
                if (i7 < bArr.length) {
                    this.x = i7 + 1;
                    return new fr7(bArr[i7]);
                }
                kj6.i(String.valueOf(i7));
                return null;
            case 5:
                int i8 = this.x;
                int[] iArr = (int[]) obj;
                if (i8 < iArr.length) {
                    this.x = i8 + 1;
                    return new lr7(iArr[i8]);
                }
                kj6.i(String.valueOf(i8));
                return null;
            case 6:
                int i9 = this.x;
                long[] jArr = (long[]) obj;
                if (i9 < jArr.length) {
                    this.x = i9 + 1;
                    return new qr7(jArr[i9]);
                }
                kj6.i(String.valueOf(i9));
                return null;
            default:
                int i10 = this.x;
                short[] sArr = (short[]) obj;
                if (i10 < sArr.length) {
                    this.x = i10 + 1;
                    return new bs7(sArr[i10]);
                }
                kj6.i(String.valueOf(i10));
                return null;
        }
    }

    public final void remove() {
        switch (this.w) {
            case b85.b:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e2(Object[] objArr) {
        this.w = 1;
        objArr.getClass();
        this.y = objArr;
    }

    public /* synthetic */ e2(int i, Object obj) {
        this.w = i;
        this.y = obj;
    }
}
