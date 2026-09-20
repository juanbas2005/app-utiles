package defpackage;

import android.util.Log;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: l82  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l82 {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public l82(long j, byte[] bArr, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public static l82 a(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[p82.B[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new l82(wrap.array(), 4, 1);
    }

    public static l82 b(n82 n82, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[p82.B[5]]);
        wrap.order(byteOrder);
        n82 n822 = new n82[]{n82}[0];
        wrap.putInt((int) n822.a);
        wrap.putInt((int) n822.b);
        return new l82(wrap.array(), 5, 1);
    }

    public static l82 c(int i, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[p82.B[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i}[0]);
        return new l82(wrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) {
        Serializable g = g(byteOrder);
        if (g == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        } else if (g instanceof String) {
            return Double.parseDouble((String) g);
        } else {
            if (g instanceof long[]) {
                long[] jArr = (long[]) g;
                if (jArr.length == 1) {
                    return (double) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g instanceof int[]) {
                int[] iArr = (int[]) g;
                if (iArr.length == 1) {
                    return (double) iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g instanceof double[]) {
                double[] dArr = (double[]) g;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g instanceof n82[]) {
                n82[] n82Arr = (n82[]) g;
                if (n82Arr.length == 1) {
                    n82 n82 = n82Arr[0];
                    return ((double) n82.a) / ((double) n82.b);
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a double value");
            }
        }
    }

    public final int e(ByteOrder byteOrder) {
        Serializable g = g(byteOrder);
        if (g == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        } else if (g instanceof String) {
            return Integer.parseInt((String) g);
        } else {
            if (g instanceof long[]) {
                long[] jArr = (long[]) g;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g instanceof int[]) {
                int[] iArr = (int[]) g;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }
    }

    public final String f(ByteOrder byteOrder) {
        Serializable g = g(byteOrder);
        if (g == null) {
            return null;
        }
        if (g instanceof String) {
            return (String) g;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (g instanceof long[]) {
            long[] jArr = (long[]) g;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (g instanceof int[]) {
            int[] iArr = (int[]) g;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (g instanceof double[]) {
            double[] dArr = (double[]) g;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (!(g instanceof n82[])) {
            return null;
        } else {
            n82[] n82Arr = (n82[]) g;
            while (i < n82Arr.length) {
                sb.append(n82Arr[i].a);
                sb.append('/');
                sb.append(n82Arr[i].b);
                i++;
                if (i != n82Arr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
    }

    /* JADX WARNING: type inference failed for: r13v14, types: [int[]] */
    /* JADX WARNING: type inference failed for: r13v15, types: [long[]] */
    /* JADX WARNING: type inference failed for: r13v16, types: [n82[]] */
    /* JADX WARNING: type inference failed for: r13v17, types: [int[]] */
    /* JADX WARNING: type inference failed for: r13v18, types: [int[]] */
    /* JADX WARNING: type inference failed for: r13v19, types: [n82[]] */
    /* JADX WARNING: type inference failed for: r13v20, types: [double[]] */
    /* JADX WARNING: type inference failed for: r13v21, types: [java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r13v22, types: [double[]] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0040, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00f1, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f2, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00f3, code lost:
        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00f6, code lost:
        return r12;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0134 A[SYNTHETIC, Splitter:B:104:0x0134] */
    public final Serializable g(ByteOrder byteOrder) {
        k82 k82;
        String str;
        byte b2;
        ? r13;
        byte[] bArr = this.d;
        k82 k822 = null;
        try {
            k82 = new k82(bArr);
            try {
                k82.y = byteOrder;
                int i = this.a;
                int i2 = 0;
                int i3 = this.b;
                switch (i) {
                    case 1:
                    case 6:
                        if (bArr.length != 1 || (b2 = bArr[0]) < 0 || b2 > 1) {
                            str = new String(bArr, p82.K);
                            break;
                        } else {
                            String str2 = new String(new char[]{(char) (b2 + 48)});
                            try {
                                k82.close();
                                return str2;
                            } catch (IOException e) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                return str2;
                            }
                        }
                    case 2:
                    case 7:
                        if (i3 >= p82.C.length) {
                            int i4 = 0;
                            while (true) {
                                byte[] bArr2 = p82.C;
                                if (i4 >= bArr2.length) {
                                    i2 = bArr2.length;
                                } else if (bArr[i4] == bArr2[i4]) {
                                    i4++;
                                }
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            if (i2 < i3) {
                                byte b3 = bArr[i2];
                                if (b3 != 0) {
                                    if (b3 >= 32) {
                                        sb.append((char) b3);
                                    } else {
                                        sb.append('?');
                                    }
                                    i2++;
                                }
                            }
                        }
                        str = sb.toString();
                        break;
                    case 3:
                        r13 = new int[i3];
                        while (i2 < i3) {
                            r13[i2] = k82.readUnsignedShort();
                            i2++;
                        }
                        break;
                    case 4:
                        r13 = new long[i3];
                        while (i2 < i3) {
                            r13[i2] = ((long) k82.readInt()) & 4294967295L;
                            i2++;
                        }
                        break;
                    case 5:
                        r13 = new n82[i3];
                        while (i2 < i3) {
                            r13[i2] = new n82(((long) k82.readInt()) & 4294967295L, ((long) k82.readInt()) & 4294967295L);
                            i2++;
                        }
                        break;
                    case 8:
                        r13 = new int[i3];
                        while (i2 < i3) {
                            r13[i2] = k82.readShort();
                            i2++;
                        }
                        break;
                    case 9:
                        r13 = new int[i3];
                        while (i2 < i3) {
                            r13[i2] = k82.readInt();
                            i2++;
                        }
                        break;
                    case 10:
                        r13 = new n82[i3];
                        while (i2 < i3) {
                            r13[i2] = new n82((long) k82.readInt(), (long) k82.readInt());
                            i2++;
                        }
                        break;
                    case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                        r13 = new double[i3];
                        while (i2 < i3) {
                            r13[i2] = (double) k82.readFloat();
                            i2++;
                        }
                        break;
                    case 12:
                        r13 = new double[i3];
                        while (i2 < i3) {
                            r13[i2] = k82.readDouble();
                            i2++;
                        }
                        break;
                    default:
                        try {
                            k82.close();
                            return null;
                        } catch (IOException e2) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                            return null;
                        }
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (IOException e4) {
            e = e4;
            k82 = null;
            try {
                Log.w("ExifInterface", "IOException occurred during reading a value", e);
                if (k82 != null) {
                    try {
                        k82.close();
                    } catch (IOException e5) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                k822 = k82;
                if (k822 != null) {
                    try {
                        k822.close();
                    } catch (IOException e6) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (k822 != null) {
            }
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(p82.A[this.a]);
        sb.append(", data length:");
        return hl6.n(sb, this.d.length, ")");
    }

    public l82(byte[] bArr, int i, int i2) {
        this(-1, bArr, i, i2);
    }
}
