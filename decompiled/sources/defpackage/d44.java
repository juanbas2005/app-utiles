package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: d44  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d44 extends r2 implements e44, RandomAccess {
    public final List x;

    static {
        new d44();
    }

    public d44() {
        super(false);
        this.x = Collections.EMPTY_LIST;
    }

    public final void add(int i, Object obj) {
        d();
        this.x.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        d();
        if (collection instanceof e44) {
            collection = ((e44) collection).b();
        }
        boolean addAll = this.x.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final List b() {
        return Collections.unmodifiableList(this.x);
    }

    public final e44 c() {
        if (this.w) {
            return new et7(this);
        }
        return this;
    }

    public final void clear() {
        d();
        this.x.clear();
        this.modCount++;
    }

    public final void e(yf0 yf0) {
        d();
        this.x.add(yf0);
        this.modCount++;
    }

    public final Object get(int i) {
        String str;
        List list = this.x;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof yf0) {
            yf0 yf0 = (yf0) obj;
            Charset charset = rf3.a;
            if (yf0.size() == 0) {
                str = "";
            } else {
                str = new String(yf0.x, yf0.g(), yf0.size(), charset);
            }
            int g = yf0.g();
            if (s08.a.m(yf0.x, g, yf0.size() + g) == 0) {
                list.set(i, str);
            }
            return str;
        }
        byte[] bArr = (byte[]) obj;
        String str2 = new String(bArr, rf3.a);
        if (s08.a.m(bArr, 0, bArr.length) == 0) {
            list.set(i, str2);
        }
        return str2;
    }

    public final pf3 j(int i) {
        List list = this.x;
        if (i >= list.size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(list);
            return new d44(arrayList);
        }
        ku4.v();
        return null;
    }

    public final Object remove(int i) {
        d();
        Object remove = this.x.remove(i);
        this.modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof yf0)) {
            return new String((byte[]) remove, rf3.a);
        }
        yf0 yf0 = (yf0) remove;
        Charset charset = rf3.a;
        if (yf0.size() == 0) {
            return "";
        }
        return new String(yf0.x, yf0.g(), yf0.size(), charset);
    }

    public final Object set(int i, Object obj) {
        d();
        Object obj2 = this.x.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof yf0)) {
            return new String((byte[]) obj2, rf3.a);
        }
        yf0 yf0 = (yf0) obj2;
        Charset charset = rf3.a;
        if (yf0.size() == 0) {
            return "";
        }
        return new String(yf0.x, yf0.g(), yf0.size(), charset);
    }

    public final int size() {
        return this.x.size();
    }

    public final Object u(int i) {
        return this.x.get(i);
    }

    public d44(ArrayList arrayList) {
        super(true);
        this.x = arrayList;
    }

    public d44(int i) {
        this(new ArrayList(i));
    }

    public final boolean addAll(Collection collection) {
        return addAll(this.x.size(), collection);
    }
}
