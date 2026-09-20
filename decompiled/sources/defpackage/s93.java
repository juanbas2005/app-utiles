package defpackage;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* renamed from: s93  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class s93 extends j93 implements Set {
    public static final /* synthetic */ int y = 0;
    public transient q93 x;

    public static int p(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        if (z) {
            return 1073741824;
        }
        h.q("collection too large");
        return 0;
    }

    public static s93 s(int i, Object... objArr) {
        if (i == 0) {
            return o36.F;
        }
        if (i != 1) {
            int p = p(i);
            Object[] objArr2 = new Object[p];
            int i2 = p - 1;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < i) {
                Object obj = objArr[i3];
                if (obj != null) {
                    int hashCode = obj.hashCode();
                    int J = rj1.J(hashCode);
                    while (true) {
                        int i6 = J & i2;
                        Object obj2 = objArr2[i6];
                        if (obj2 == null) {
                            objArr[i5] = obj;
                            objArr2[i6] = obj;
                            i4 += hashCode;
                            i5++;
                            break;
                        } else if (obj2.equals(obj)) {
                            break;
                        } else {
                            J++;
                        }
                    }
                    i3++;
                } else {
                    StringBuilder sb = new StringBuilder(20);
                    sb.append("at index ");
                    sb.append(i3);
                    throw new NullPointerException(sb.toString());
                }
            }
            Arrays.fill(objArr, i5, i, (Object) null);
            if (i5 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                return new su6(obj3);
            } else if (p(i5) < p / 2) {
                return s(i5, objArr);
            } else {
                int length = objArr.length;
                if (i5 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i5);
                }
                return new o36(i4, i2, i5, objArr, objArr2);
            }
        } else {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new su6(obj4);
        }
    }

    public q93 d() {
        q93 q93 = this.x;
        if (q93 != null) {
            return q93;
        }
        q93 v = v();
        this.x = v;
        return v;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof s93) && (this instanceof o36) && (((s93) obj) instanceof o36) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() != set.size() || !containsAll(set)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return za5.t(this);
    }

    public q93 v() {
        Object[] array = toArray(j93.w);
        m93 m93 = q93.x;
        return q93.p(array.length, array);
    }
}
