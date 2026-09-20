package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: i39  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i39 extends a3 {
    public static final Parcelable.Creator<i39> CREATOR = new g39(1);
    public final byte[][] A;
    public final byte[][] B;
    public final int[] C;
    public final byte[][] D;
    public final int[] E;
    public final byte[][] F;
    public final String w;
    public final byte[] x;
    public final byte[][] y;
    public final byte[][] z;

    public i39(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.w = str;
        this.x = bArr;
        this.y = bArr2;
        this.z = bArr3;
        this.A = bArr4;
        this.B = bArr5;
        this.C = iArr;
        this.D = bArr6;
        this.E = iArr2;
        this.F = bArr7;
    }

    public static void f(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        boolean z2 = true;
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            if (!z2) {
                sb.append(", ");
            }
            sb.append("'");
            z65.k(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z2 = false;
        }
        sb.append(")");
    }

    public static Set k(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet x2 = za5.x(length);
        for (byte[] bArr2 : bArr) {
            z65.k(bArr2);
            x2.add(Base64.encodeToString(bArr2, 3));
        }
        return x2;
    }

    public static List l(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new q39(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final boolean equals(Object obj) {
        HashSet hashSet;
        HashSet hashSet2;
        int length;
        int length2;
        if (obj instanceof i39) {
            i39 i39 = (i39) obj;
            if (a35.q(this.w, i39.w) && a35.q(g(), i39.g()) && a35.q(k(this.y), k(i39.y)) && a35.q(k(this.z), k(i39.z)) && a35.q(k(this.A), k(i39.A)) && a35.q(k(this.B), k(i39.B))) {
                int[] iArr = this.C;
                if (iArr == null || (length2 = iArr.length) == 0) {
                    hashSet = Collections.EMPTY_SET;
                } else {
                    HashSet x2 = za5.x(length2);
                    for (int valueOf : iArr) {
                        x2.add(Integer.valueOf(valueOf));
                    }
                    hashSet = x2;
                }
                int[] iArr2 = i39.C;
                if (iArr2 == null || (length = iArr2.length) == 0) {
                    hashSet2 = Collections.EMPTY_SET;
                } else {
                    HashSet x3 = za5.x(length);
                    for (int valueOf2 : iArr2) {
                        x3.add(Integer.valueOf(valueOf2));
                    }
                    hashSet2 = x3;
                }
                if (!a35.q(hashSet, hashSet2) || !a35.q(l(this.E), l(i39.E)) || !a35.q(k(this.F), k(i39.F))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final Set g() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.D;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.x;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return k((byte[][]) arrayList.toArray(new byte[0][]));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str2 = this.w;
        if (str2 == null) {
            str = "null";
        } else {
            str = f21.m(new StringBuilder(str2.length() + 2), "'", str2, "'");
        }
        sb.append(str);
        sb.append(", direct==");
        byte[] bArr = this.x;
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        f(sb, "GAIA=", this.y);
        sb.append(", ");
        f(sb, "PSEUDO=", this.z);
        sb.append(", ");
        f(sb, "ALWAYS=", this.A);
        sb.append(", ");
        f(sb, "OTHER=", this.B);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.C));
        sb.append(", ");
        f(sb, "directs=", this.D);
        sb.append(", genDims=");
        sb.append(Arrays.toString(l(this.E).toArray()));
        sb.append(", ");
        f(sb, "external=", this.F);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.F(parcel, 2, this.w);
        h75.A(parcel, 3, this.x);
        h75.B(parcel, 4, this.y);
        h75.B(parcel, 5, this.z);
        h75.B(parcel, 6, this.A);
        h75.B(parcel, 7, this.B);
        h75.D(parcel, 8, this.C);
        h75.B(parcel, 9, this.D);
        h75.D(parcel, 10, this.E);
        h75.B(parcel, 11, this.F);
        h75.O(parcel, M);
    }
}
