package defpackage;

import java.util.Iterator;

/* renamed from: uf0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uf0 implements Iterator {
    public final /* synthetic */ int w = 2;
    public int x;
    public final int y;
    public final /* synthetic */ Iterable z;

    public uf0(vk8 vk8) {
        this.z = vk8;
        this.x = 0;
        this.y = vk8.f();
    }

    public byte a() {
        try {
            byte[] bArr = ((b94) this.z).x;
            int i = this.x;
            this.x = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            kj6.i(e.getMessage());
            return 0;
        }
    }

    public final boolean hasNext() {
        switch (this.w) {
            case b85.b:
                if (this.x < this.y) {
                    return true;
                }
                return false;
            case 1:
                if (this.x < this.y) {
                    return true;
                }
                return false;
            case 2:
                if (this.x < this.y) {
                    return true;
                }
                return false;
            case 3:
                if (this.x < this.y) {
                    return true;
                }
                return false;
            default:
                if (this.x < this.y) {
                    return true;
                }
                return false;
        }
    }

    public final Object next() {
        int i = this.w;
        Iterable iterable = this.z;
        int i2 = this.y;
        switch (i) {
            case b85.b:
                int i3 = this.x;
                if (i3 < i2) {
                    this.x = i3 + 1;
                    return Byte.valueOf(((yf0) iterable).k(i3));
                }
                rf2.c();
                return null;
            case 1:
                int i4 = this.x;
                if (i4 < i2) {
                    this.x = i4 + 1;
                    return Byte.valueOf(((zf0) iterable).n(i4));
                }
                rf2.c();
                return null;
            case 2:
                return Byte.valueOf(a());
            case 3:
                int i5 = this.x;
                if (i5 < i2) {
                    this.x = i5 + 1;
                    return Byte.valueOf(((vk8) iterable).d(i5));
                }
                rf2.c();
                return null;
            default:
                int i6 = this.x;
                if (i6 < i2) {
                    this.x = i6 + 1;
                    return Byte.valueOf(((qz8) iterable).f(i6));
                }
                rf2.c();
                return null;
        }
    }

    public final void remove() {
        switch (this.w) {
            case b85.b:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public uf0(qz8 qz8) {
        this.z = qz8;
        this.x = 0;
        this.y = qz8.k();
    }

    public uf0(yf0 yf0) {
        this.z = yf0;
        this.x = 0;
        this.y = yf0.size();
    }

    public uf0(zf0 zf0) {
        this.z = zf0;
        this.x = 0;
        this.y = zf0.size();
    }

    public uf0(b94 b94) {
        this.z = b94;
        this.x = 0;
        this.y = b94.x.length;
    }
}
