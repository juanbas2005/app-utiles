package defpackage;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* renamed from: os8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class os8 extends nk8 implements Set {
    public transient hs8 A;

    public static int w(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (((double) highestOneBit) * 0.7d < ((double) max));
            return highestOneBit;
        } else if (max < 1073741824) {
            return 1073741824;
        } else {
            h.q("collection too large");
            return 0;
        }
    }

    public static os8 z(int i, Object... objArr) {
        if (i == 0) {
            return lt8.H;
        }
        if (i != 1) {
            int w = w(i);
            Object[] objArr2 = new Object[w];
            int i2 = w - 1;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < i) {
                Object obj = objArr[i3];
                if (obj != null) {
                    int hashCode = obj.hashCode();
                    int X = z65.X(hashCode);
                    while (true) {
                        int i6 = X & i2;
                        Object obj2 = objArr2[i6];
                        if (obj2 != null) {
                            if (obj2.equals(obj)) {
                                break;
                            }
                            X++;
                        } else {
                            objArr[i5] = obj;
                            objArr2[i6] = obj;
                            i4 += hashCode;
                            i5++;
                            break;
                        }
                    }
                    i3++;
                } else {
                    ku4.j(hl6.p(new StringBuilder(String.valueOf(i3).length() + 9), "at index ", i3));
                    return null;
                }
            }
            Arrays.fill(objArr, i5, i, (Object) null);
            if (i5 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                return new ot8(obj3);
            }
            if (w(i5) < w / 2) {
                return z(i5, objArr);
            }
            int length = objArr.length;
            if (i5 < (length >> 1) + (length >> 2)) {
                objArr = Arrays.copyOf(objArr, i5);
            }
            return new lt8(i4, i2, i5, objArr, objArr2);
        }
        Object obj4 = objArr[0];
        Objects.requireNonNull(obj4);
        return new ot8(obj4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof os8) && (this instanceof lt8) && (((os8) obj) instanceof lt8) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() != set.size() || !containsAll(set)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        for (Object next : this) {
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }

    public abstract at7 v();

    public final hs8 x() {
        hs8 hs8 = this.A;
        if (hs8 != null) {
            return hs8;
        }
        hs8 y = y();
        this.A = y;
        return y;
    }

    public hs8 y() {
        Object[] array = toArray(nk8.y);
        es8 es8 = hs8.A;
        int length = array.length;
        if (length == 0) {
            return qs8.D;
        }
        return new qs8(length, array);
    }
}
