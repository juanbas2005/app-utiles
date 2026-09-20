package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;

/* renamed from: j39  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j39 extends a3 implements Comparable {
    public static final Parcelable.Creator<j39> CREATOR = new g39(2);
    public final String A;
    public final byte[] B;
    public final int C;
    public final int D;
    public final int E;
    public final String w;
    public final long x;
    public final boolean y;
    public final double z;

    public j39(String str, long j, boolean z2, double d, String str2, byte[] bArr, int i, int i2, int i3) {
        this.w = str;
        this.x = j;
        this.y = z2;
        this.z = d;
        this.A = str2;
        this.B = bArr;
        this.C = i;
        this.D = i2;
        this.E = i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a5 A[RETURN] */
    public final int compareTo(Object obj) {
        int i;
        j39 j39 = (j39) obj;
        int compareTo = this.w.compareTo(j39.w);
        if (compareTo != 0) {
            return compareTo;
        }
        int i2 = j39.C;
        int i3 = this.C;
        if (i3 < i2) {
            i = -1;
        } else if (i3 != i2) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            return i;
        }
        if (i3 == 1) {
            int i4 = (this.x > j39.x ? 1 : (this.x == j39.x ? 0 : -1));
            if (i4 >= 0) {
                if (i4 == 0) {
                    return 0;
                }
            }
        } else if (i3 == 2) {
            boolean z2 = j39.y;
            boolean z3 = this.y;
            if (z3 != z2) {
                if (z3) {
                    return 1;
                }
            }
            return 0;
        } else if (i3 == 3) {
            return Double.compare(this.z, j39.z);
        } else {
            if (i3 == 4) {
                String str = j39.A;
                String str2 = this.A;
                if (str2 != str) {
                    if (str2 != null) {
                        if (str != null) {
                            return str2.compareTo(str);
                        }
                        return 1;
                    }
                }
                return 0;
            } else if (i3 == 5) {
                byte[] bArr = j39.B;
                byte[] bArr2 = this.B;
                if (bArr2 != bArr) {
                    if (bArr2 != null) {
                        if (bArr != null) {
                            int i5 = 0;
                            while (true) {
                                int length = bArr.length;
                                int length2 = bArr2.length;
                                if (i5 < Math.min(length2, length)) {
                                    int i6 = bArr2[i5] - bArr[i5];
                                    if (i6 != 0) {
                                        return i6;
                                    }
                                    i5++;
                                } else if (length2 < length) {
                                    return -1;
                                } else {
                                    if (length2 != length) {
                                        return 1;
                                    }
                                    return 0;
                                }
                            }
                        }
                        return 1;
                    }
                }
                return 0;
            } else {
                throw new AssertionError(hl6.p(new StringBuilder(String.valueOf(i3).length() + 20), "Invalid enum value: ", i3));
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = r5.C;
     */
    public final boolean equals(Object obj) {
        int i;
        int i2;
        if (obj instanceof j39) {
            j39 j39 = (j39) obj;
            if (a35.q(this.w, j39.w) && (i2 = this.C) == i && this.D == j39.D && this.E == j39.E) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                return a35.q(this.A, j39.A);
                            }
                            if (i2 == 5) {
                                return Arrays.equals(this.B, j39.B);
                            }
                            throw new AssertionError(hl6.p(new StringBuilder(String.valueOf(i2).length() + 20), "Invalid enum value: ", i2));
                        } else if (this.z != j39.z) {
                            return false;
                        } else {
                            return true;
                        }
                    } else if (this.y != j39.y) {
                        return false;
                    } else {
                        return true;
                    }
                } else if (this.x != j39.x) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(StringBuilder sb) {
        sb.append("Flag(");
        String str = this.w;
        sb.append(str);
        sb.append(", ");
        int i = this.C;
        if (i == 1) {
            sb.append(this.x);
        } else if (i == 2) {
            sb.append(this.y);
        } else if (i == 3) {
            sb.append(this.z);
        } else if (i == 4) {
            sb.append("'");
            String str2 = this.A;
            z65.k(str2);
            sb.append(str2);
            sb.append("'");
        } else if (i == 5) {
            sb.append("'");
            byte[] bArr = this.B;
            z65.k(bArr);
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(i).length());
            sb2.append("Invalid type: ");
            sb2.append(str);
            sb2.append(", ");
            sb2.append(i);
            throw new AssertionError(sb2.toString());
        }
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(this.D);
        sb.append(", ");
        sb.append(this.E);
        sb.append(")");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        f(sb);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean z2;
        String str = this.w;
        if (str == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        int M = h75.M(parcel, 20293);
        if (!z2) {
            h75.F(parcel, 2, str);
        }
        long j = this.x;
        if (j != 0) {
            h75.K(parcel, 3, 8);
            parcel.writeLong(j);
        }
        if (this.y) {
            h75.K(parcel, 4, 4);
            parcel.writeInt(1);
        }
        double d = this.z;
        if (d != 0.0d) {
            h75.K(parcel, 5, 8);
            parcel.writeDouble(d);
        }
        String str2 = this.A;
        if (str2 != null) {
            h75.F(parcel, 6, str2);
        }
        byte[] bArr = this.B;
        if (bArr != null) {
            h75.A(parcel, 7, bArr);
        }
        int i2 = this.C;
        if (i2 != 0) {
            h75.K(parcel, 8, 4);
            parcel.writeInt(i2);
        }
        int i3 = this.D;
        if (i3 != 0) {
            h75.K(parcel, 9, 4);
            parcel.writeInt(i3);
        }
        int i4 = this.E;
        if (i4 != 0) {
            h75.K(parcel, 10, 4);
            parcel.writeInt(i4);
        }
        h75.O(parcel, M);
    }
}
