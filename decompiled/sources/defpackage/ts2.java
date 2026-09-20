package defpackage;

import android.graphics.Typeface;
import android.os.Looper;
import cu.lestebang.utiletecsa.R;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: ts2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ts2 implements i68, ww3, fk5, a27, hb1, fs8 {
    public static final /* synthetic */ ts2 A = new ts2(21);
    public static final /* synthetic */ ts2 B = new ts2(22);
    public static final /* synthetic */ ts2 C = new ts2(23);
    public static final /* synthetic */ ts2 D = new ts2(24);
    public static final /* synthetic */ ts2 E = new ts2(25);
    public static final /* synthetic */ ts2 F = new ts2(26);
    public static final /* synthetic */ ts2 G = new ts2(27);
    public static final /* synthetic */ ts2 H = new ts2(28);
    public static final /* synthetic */ ts2 I = new ts2(29);
    public static final /* synthetic */ ts2 x = new ts2(18);
    public static final /* synthetic */ ts2 y = new ts2(19);
    public static final /* synthetic */ ts2 z = new ts2(20);
    public final /* synthetic */ int w;

    public /* synthetic */ ts2(int i) {
        this.w = i;
    }

    public static /* synthetic */ void f(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "a";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        objArr[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e A[SYNTHETIC, Splitter:B:15:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public static final Object g(FileOutputStream fileOutputStream, h61 h61) {
        tn4 tn4;
        int i;
        tn4 tn42;
        long j;
        FileLock lock;
        if (h61 instanceof tn4) {
            tn4 tn43 = (tn4) h61;
            int i2 = tn43.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tn43.C = i2 - Integer.MIN_VALUE;
                tn4 = tn43;
                Object obj = tn4.B;
                i = tn4.C;
                if (i != 0) {
                    o85.q(obj);
                    j = 10;
                    tn42 = tn4;
                } else if (i == 1) {
                    j = tn4.A;
                    fileOutputStream = tn4.z;
                    o85.q(obj);
                    tn42 = tn4;
                    j *= 2;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (j > 60000) {
                    try {
                        lock = fileOutputStream.getChannel().lock(0, Long.MAX_VALUE, false);
                        lock.getClass();
                    } catch (IOException e) {
                        String message = e.getMessage();
                        if (message == null || !d57.x0(message, "Resource deadlock would occur", false)) {
                            throw e;
                        }
                        tn42.z = fileOutputStream;
                        tn42.A = j;
                        tn42.C = 1;
                        Object G2 = t49.G(j, tn42);
                        p81 p81 = p81.w;
                        if (G2 == p81) {
                            return p81;
                        }
                    }
                    return lock;
                }
                FileLock lock2 = fileOutputStream.getChannel().lock(0, Long.MAX_VALUE, false);
                lock2.getClass();
                return lock2;
            }
        }
        tn4 = new h61(h61);
        Object obj2 = tn4.B;
        i = tn4.C;
        if (i != 0) {
        }
        if (j > 60000) {
        }
    }

    public static final iz6 h(String str, uq4 uq4, String str2) {
        ArrayList arrayList = mz6.a;
        return new iz6(str, uq4, "", str2);
    }

    public static final iz6 i(String str, String str2, String str3, String str4) {
        ArrayList arrayList = mz6.a;
        return new iz6(str, uq4.e(str2), str3, str4);
    }

    public static final int j(long j, int i) {
        int i2 = sk7.b;
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static xp7 k(qp7 qp7, wj3 wj3, kg5 kg5, vw3 vw3) {
        wj3.getClass();
        kg5.getClass();
        if (!wj3.c) {
            wj3 = wj3.a(wj3, xj3.w, false, (Set) null, (fu6) null, 61);
        }
        int ordinal = wj3.b.ordinal();
        k28 k28 = k28.y;
        if (ordinal == 0 || ordinal == 1) {
            if (!qp7.I().x) {
                return new p27(ts1.e(qp7).o(), k28);
            }
            List parameters = vw3.L().getParameters();
            parameters.getClass();
            if (!parameters.isEmpty()) {
                return new p27(vw3, k28.A);
            }
            return iq7.k(qp7, wj3);
        } else if (ordinal == 2) {
            return new p27(vw3, k28);
        } else {
            h.c();
            return null;
        }
    }

    public static Typeface l(String str, am2 am2, int i) {
        if (i == 0 && sg3.e(am2, am2.y) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int s = rd3.s(am2, i);
        if (str == null || str.length() == 0) {
            return Typeface.defaultFromStyle(s);
        }
        return Typeface.create(str, s);
    }

    public static long m(int i, int i2, int i3, int i4) {
        return (((long) (i2 & 32767)) << 15) | ((long) (i & 32767)) | (((long) (i3 & 32767)) << 30) | (((long) (i4 & 32767)) << 45) | Long.MIN_VALUE;
    }

    public static final boolean o() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    public Object a() {
        switch (this.w) {
            case 18:
                lo8 lo8 = (lo8) ko8.x.w.w;
                return new Boolean(((Boolean) lo8.a.get()).booleanValue());
            case 19:
                List list = by8.a;
                qn8.x.get();
                return Integer.valueOf((int) ((Long) rn8.a.s(72, 50000, "measurement.upload.max_public_events_per_day").get()).longValue());
            case 20:
                List list2 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(51, 600000, "measurement.sgtm.upload.retry_interval").get();
            case 21:
                List list3 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(50, 5000, "measurement.sgtm.upload.min_delay_after_startup").get();
            case 22:
                List list4 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(33, 10000, "measurement.upload.realtime_upload_interval").get();
            case 23:
                List list5 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(34, 604800000, "measurement.upload.refresh_blacklisted_config_interval").get();
            case 24:
                List list6 = by8.a;
                qn8.x.get();
                return Integer.valueOf((int) ((Long) rn8.a.s(22, 200, "measurement.audience.filter_result_max_count").get()).longValue());
            case 25:
                List list7 = by8.a;
                uo8.x.get();
                return Integer.valueOf((int) ((Long) vo8.a.s(3, -2, "measurement.test.int_flag").get()).longValue());
            case 26:
                List list8 = by8.a;
                qn8.x.get();
                return Integer.valueOf((int) ((Long) rn8.a.s(67, 100, "measurement.upload.max_bundles").get()).longValue());
            case 27:
                List list9 = by8.a;
                qn8.x.get();
                return (String) rn8.a.u(80, "measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot").get();
            case 28:
                List list10 = by8.a;
                qn8.x.get();
                return Integer.valueOf((int) ((Long) rn8.a.s(24, 1000, "measurement.rb.max_trigger_registrations_per_day").get()).longValue());
            default:
                List list11 = by8.a;
                jo8 jo8 = (jo8) io8.x.w.w;
                return (Boolean) jo8.a.get();
        }
    }

    public Typeface b(am2 am2, int i) {
        return l((String) null, am2, i);
    }

    public boolean c(wo7 wo7, wo7 wo72) {
        if (wo7 == null) {
            f(0);
            throw null;
        } else if (wo72 != null) {
            return wo7.equals(wo72);
        } else {
            f(1);
            throw null;
        }
    }

    public Typeface d(fv2 fv2, am2 am2, int i) {
        String str = fv2.d;
        int i2 = am2.w / 100;
        if (i2 >= 0 && i2 < 2) {
            str = str.concat("-thin");
        } else if (2 <= i2 && i2 < 4) {
            str = str.concat("-light");
        } else if (i2 != 4) {
            if (i2 == 5) {
                str = str.concat("-medium");
            } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                str = str.concat("-black");
            }
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface l = l(str, am2, i);
            if (!sg3.e(l, Typeface.create(Typeface.DEFAULT, rd3.s(am2, i))) && !sg3.e(l, l((String) null, am2, i))) {
                typeface = l;
            }
        }
        if (typeface == null) {
            return l(fv2.d, am2, i);
        }
        return typeface;
    }

    public int e() {
        return R.id.view_tree_view_model_store_owner;
    }

    public StackTraceElement[] n(StackTraceElement[] stackTraceElementArr) {
        int i;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i5 = i2 - intValue;
                if (i2 + i5 <= stackTraceElementArr.length) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            int intValue2 = i2 - num.intValue();
                            if (i4 < 10) {
                                System.arraycopy(stackTraceElementArr, i2, stackTraceElementArr2, i3, intValue2);
                                i3 += intValue2;
                                i4++;
                            }
                            i = (intValue2 - 1) + i2;
                        } else if (!stackTraceElementArr[intValue + i6].equals(stackTraceElementArr[i2 + i6])) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    hashMap.put(stackTraceElement, Integer.valueOf(i2));
                    i2 = i + 1;
                }
            }
            stackTraceElementArr2[i3] = stackTraceElementArr[i2];
            i3++;
            i4 = 1;
            i = i2;
            hashMap.put(stackTraceElement, Integer.valueOf(i2));
            i2 = i + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i3];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i3);
        if (i3 < stackTraceElementArr.length) {
            return stackTraceElementArr3;
        }
        return stackTraceElementArr;
    }

    public String toString() {
        switch (this.w) {
            case 14:
                int hashCode = hashCode();
                rd3.i(16);
                String num = Integer.toString(hashCode, 16);
                num.getClass();
                return pb4.m("CreationExtras.Key@", num, "<", b26.a.b(String.class).A(), ">");
            case h75.g:
                return "NULL_VALUE";
            default:
                return super.toString();
        }
    }
}
