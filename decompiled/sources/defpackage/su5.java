package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: su5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class su5 {
    public static final dg0 b = new dg0(Arrays.copyOf(new byte[]{42}, 1));
    public static final List c = sg3.D("*");
    public static final su5 d = new su5(new kd6(2));
    public final kd6 a;

    public su5(kd6 kd6) {
        this.a = kd6;
    }

    public static List b(String str) {
        List X0 = d57.X0(str, new char[]{'.'});
        if (sg3.e(dt0.G0(X0), "")) {
            return dt0.t0(1, X0);
        }
        return X0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 != false) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0128 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0129  */
    public final String a(String str) {
        String str2;
        String str3;
        String str4;
        List list;
        int size;
        int size2;
        List list2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List b2 = b(unicode);
        kd6 kd6 = this.a;
        AtomicBoolean atomicBoolean = (AtomicBoolean) kd6.x;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                ((CountDownLatch) kd6.y).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    kd6.u0();
                    break;
                } catch (InterruptedIOException unused2) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    kd6.B = e;
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
        }
        if (((dg0) kd6.z) != null) {
            int size3 = b2.size();
            dg0[] dg0Arr = new dg0[size3];
            for (int i = 0; i < size3; i++) {
                dg0 dg0 = dg0.z;
                dg0Arr[i] = td0.u((String) b2.get(i));
            }
            int i2 = 0;
            while (true) {
                if (i2 >= size3) {
                    str2 = null;
                    break;
                }
                dg0 dg02 = (dg0) kd6.z;
                if (dg02 != null) {
                    str2 = or2.c(dg02, dg0Arr, i2);
                    if (str2 != null) {
                        break;
                    }
                    i2++;
                } else {
                    sg3.a0("bytes");
                    throw null;
                }
            }
            if (size3 > 1) {
                dg0[] dg0Arr2 = (dg0[]) dg0Arr.clone();
                int length = dg0Arr2.length - 1;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    dg0Arr2[i3] = b;
                    dg0 dg03 = (dg0) kd6.z;
                    if (dg03 != null) {
                        str3 = or2.c(dg03, dg0Arr2, i3);
                        if (str3 != null) {
                            break;
                        }
                        i3++;
                    } else {
                        sg3.a0("bytes");
                        throw null;
                    }
                }
                if (str3 != null) {
                    int i4 = size3 - 1;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i4) {
                            break;
                        }
                        dg0 dg04 = (dg0) kd6.A;
                        if (dg04 != null) {
                            str4 = or2.c(dg04, dg0Arr, i5);
                            if (str4 != null) {
                                break;
                            }
                            i5++;
                        } else {
                            sg3.a0("exceptionBytes");
                            throw null;
                        }
                    }
                }
                str4 = null;
                if (str4 == null) {
                    list = d57.X0("!".concat(str4), new char[]{'.'});
                } else if (str2 == null && str3 == null) {
                    list = c;
                } else {
                    List list3 = a42.w;
                    if (str2 != null) {
                        list2 = d57.X0(str2, new char[]{'.'});
                    } else {
                        list2 = list3;
                    }
                    if (str3 != null) {
                        list3 = d57.X0(str3, new char[]{'.'});
                    }
                    if (list2.size() > list3.size()) {
                        list = list2;
                    } else {
                        list = list3;
                    }
                }
                if (b2.size() == list.size() && ((String) list.get(0)).charAt(0) != '!') {
                    return null;
                }
                if (((String) list.get(0)).charAt(0) == '!') {
                    size = b2.size();
                    size2 = list.size();
                } else {
                    size = b2.size();
                    size2 = list.size() + 1;
                }
                return cl6.T(cl6.P(new ts(1, b(str)), size - size2), ".");
            }
            str3 = null;
            if (str3 != null) {
            }
            str4 = null;
            if (str4 == null) {
            }
            if (b2.size() == list.size() || ((String) list.get(0)).charAt(0) != '!') {
            }
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Unable to load " + ((String) kd6.C) + " resource.");
            illegalStateException.initCause((IOException) kd6.B);
            throw illegalStateException;
        }
    }
}
