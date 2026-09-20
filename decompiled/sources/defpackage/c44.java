package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: c44  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c44 extends AbstractList implements RandomAccess, f44 {
    public static final dt7 x = new dt7(new c44());
    public final ArrayList w;

    public c44(f44 f44) {
        this.w = new ArrayList(f44.size());
        addAll(f44);
    }

    public final void add(int i, Object obj) {
        this.w.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        if (collection instanceof f44) {
            collection = ((f44) collection).b();
        }
        boolean addAll = this.w.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final List b() {
        return Collections.unmodifiableList(this.w);
    }

    public final dt7 c() {
        return new dt7(this);
    }

    public final void clear() {
        this.w.clear();
        this.modCount++;
    }

    public final Object get(int i) {
        ArrayList arrayList = this.w;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof bg0) {
            bg0 bg0 = (bg0) obj;
            String z = bg0.z();
            if (bg0.o()) {
                arrayList.set(i, z);
            }
            return z;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = sf3.a;
        try {
            String str = new String(bArr, "UTF-8");
            if (z85.u(bArr, 0, bArr.length) == 0) {
                arrayList.set(i, str);
            }
            return str;
        } catch (UnsupportedEncodingException e) {
            ku4.o("UTF-8 not supported?", e);
            return null;
        }
    }

    public final bg0 q(int i) {
        bg0 bg0;
        ArrayList arrayList = this.w;
        Object obj = arrayList.get(i);
        if (obj instanceof bg0) {
            bg0 = (bg0) obj;
        } else if (obj instanceof String) {
            try {
                bg0 = new b94(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                ku4.o("UTF-8 not supported?", e);
                return null;
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            bg0 = new b94(bArr2);
        }
        if (bg0 != obj) {
            arrayList.set(i, bg0);
        }
        return bg0;
    }

    public final void r(b94 b94) {
        this.w.add(b94);
        this.modCount++;
    }

    public final Object remove(int i) {
        Object remove = this.w.remove(i);
        this.modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof bg0) {
            return ((bg0) remove).z();
        }
        byte[] bArr = (byte[]) remove;
        byte[] bArr2 = sf3.a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            ku4.o("UTF-8 not supported?", e);
            return null;
        }
    }

    public final Object set(int i, Object obj) {
        Object obj2 = this.w.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof bg0) {
            return ((bg0) obj2).z();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = sf3.a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            ku4.o("UTF-8 not supported?", e);
            return null;
        }
    }

    public final int size() {
        return this.w.size();
    }

    public c44() {
        this.w = new ArrayList();
    }

    public final boolean addAll(Collection collection) {
        return addAll(this.w.size(), collection);
    }
}
