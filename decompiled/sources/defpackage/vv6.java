package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.RandomAccess;

/* renamed from: vv6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vv6 extends AbstractList implements RandomAccess {
    public int w;
    public Object x;

    public static /* synthetic */ void d(int i) {
        String str;
        int i2;
        Throwable th;
        if (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) {
            th = new IllegalStateException(format);
        } else {
            th = new IllegalArgumentException(format);
        }
        throw th;
    }

    public final void add(int i, Object obj) {
        int i2;
        if (i < 0 || i > (i2 = this.w)) {
            ku4.d(this.w, pb4.o(i, "Index: ", ", Size: "));
            return;
        }
        if (i2 == 0) {
            this.x = obj;
        } else if (i2 == 1 && i == 0) {
            this.x = new Object[]{obj, this.x};
        } else {
            Object[] objArr = new Object[(i2 + 1)];
            Object obj2 = this.x;
            if (i2 == 1) {
                objArr[0] = obj2;
            } else {
                Object[] objArr2 = (Object[]) obj2;
                System.arraycopy(objArr2, 0, objArr, 0, i);
                System.arraycopy(objArr2, i, objArr, i + 1, this.w - i);
            }
            objArr[i] = obj;
            this.x = objArr;
        }
        this.w++;
        this.modCount++;
    }

    public final void clear() {
        this.x = null;
        this.w = 0;
        this.modCount++;
    }

    public final Object get(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.w)) {
            ku4.d(this.w, pb4.o(i, "Index: ", ", Size: "));
            return null;
        }
        Object obj = this.x;
        if (i2 == 1) {
            return obj;
        }
        return ((Object[]) obj)[i];
    }

    public final Iterator iterator() {
        int i = this.w;
        if (i == 0) {
            return tv6.x;
        }
        if (i == 1) {
            return new uv6(this);
        }
        Iterator it = super.iterator();
        if (it != null) {
            return it;
        }
        d(3);
        throw null;
    }

    public final Object remove(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.w)) {
            ku4.d(this.w, pb4.o(i, "Index: ", ", Size: "));
            return null;
        }
        Object obj = this.x;
        if (i2 == 1) {
            this.x = null;
        } else {
            Object[] objArr = (Object[]) obj;
            Object obj2 = objArr[i];
            if (i2 == 2) {
                this.x = objArr[1 - i];
            } else {
                int i3 = (i2 - i) - 1;
                if (i3 > 0) {
                    System.arraycopy(objArr, i + 1, objArr, i, i3);
                }
                objArr[this.w - 1] = null;
            }
            obj = obj2;
        }
        this.w--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i, Object obj) {
        int i2;
        if (i < 0 || i >= (i2 = this.w)) {
            ku4.d(this.w, pb4.o(i, "Index: ", ", Size: "));
            return null;
        }
        Object obj2 = this.x;
        if (i2 == 1) {
            this.x = obj;
            return obj2;
        }
        Object[] objArr = (Object[]) obj2;
        Object obj3 = objArr[i];
        objArr[i] = obj;
        return obj3;
    }

    public final int size() {
        return this.w;
    }

    public final void sort(Comparator comparator) {
        int i = this.w;
        if (i >= 2) {
            Arrays.sort((Object[]) this.x, 0, i, comparator);
        }
    }

    public final Object[] toArray(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = this.w;
            if (i == 1) {
                if (length != 0) {
                    objArr[0] = this.x;
                } else {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                    objArr2[0] = this.x;
                    return objArr2;
                }
            } else if (length < i) {
                Object[] copyOf = Arrays.copyOf((Object[]) this.x, i, objArr.getClass());
                if (copyOf != null) {
                    return copyOf;
                }
                d(6);
                throw null;
            } else if (i != 0) {
                System.arraycopy(this.x, 0, objArr, 0, i);
            }
            int i2 = this.w;
            if (length > i2) {
                objArr[i2] = null;
            }
            return objArr;
        }
        d(4);
        throw null;
    }

    public final boolean add(Object obj) {
        int i = this.w;
        if (i == 0) {
            this.x = obj;
        } else {
            Object obj2 = this.x;
            if (i == 1) {
                this.x = new Object[]{obj2, obj};
            } else {
                Object[] objArr = (Object[]) obj2;
                int length = objArr.length;
                if (i >= length) {
                    int i2 = ((length * 3) / 2) + 1;
                    int i3 = i + 1;
                    if (i2 < i3) {
                        i2 = i3;
                    }
                    Object[] objArr2 = new Object[i2];
                    this.x = objArr2;
                    System.arraycopy(objArr, 0, objArr2, 0, length);
                    objArr = objArr2;
                }
                objArr[this.w] = obj;
            }
        }
        this.w++;
        this.modCount++;
        return true;
    }
}
