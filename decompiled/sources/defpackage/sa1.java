package defpackage;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: sa1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sa1 {
    public static final HashMap f;
    public static final String g = "Crashlytics Android SDK/20.0.6";
    public final Context a;
    public final f83 b;
    public final wz0 c;
    public final hv2 d;
    public final z00 e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        pb4.r(5, hashMap, "armeabi", 6, "armeabi-v7a");
        pb4.r(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
    }

    public sa1(Context context, f83 f83, wz0 wz0, hv2 hv2, z00 z00) {
        this.a = context;
        this.b = f83;
        this.c = wz0;
        this.d = hv2;
        this.e = z00;
    }

    public static vz c(am6 am6, int i) {
        vz vzVar;
        String str = (String) am6.y;
        String str2 = (String) am6.x;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) am6.z;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        am6 am62 = (am6) am6.A;
        if (i >= 8) {
            am6 am63 = am62;
            while (am63 != null) {
                am63 = (am6) am63.A;
                i2++;
            }
        }
        int i3 = i2;
        List d2 = d(stackTraceElementArr, 4);
        if (d2 != null) {
            byte b2 = (byte) (0 | 1);
            if (am62 == null || i3 != 0) {
                vzVar = null;
            } else {
                vzVar = c(am62, i + 1);
            }
            if (b2 == 1) {
                return new vz(str, str2, d2, vzVar, i3);
            }
            StringBuilder sb = new StringBuilder();
            if ((b2 & 1) == 0) {
                sb.append(" overflowCount");
            }
            h.s(f21.i("Missing required properties:", sb));
            return null;
        }
        ku4.j("Null frames");
        return null;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [yz, java.lang.Object] */
    public static List d(StackTraceElement[] stackTraceElementArr, int i) {
        long j;
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            ? obj = new Object();
            obj.e = i;
            obj.f = (byte) (obj.f | 4);
            long j2 = 0;
            if (stackTraceElement.isNativeMethod()) {
                j = Math.max((long) stackTraceElement.getLineNumber(), 0);
            } else {
                j = 0;
            }
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j2 = (long) stackTraceElement.getLineNumber();
            }
            obj.a = j;
            obj.b = str;
            obj.c = fileName;
            obj.d = j2;
            obj.f = (byte) (((byte) (obj.f | 1)) | 2);
            arrayList.add(obj.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static wz e() {
        return new wz(0, "0", "0");
    }

    public final List a() {
        byte b2 = (byte) (((byte) (0 | 1)) | 2);
        wz0 wz0 = this.c;
        String str = (String) wz0.e;
        if (str != null) {
            String str2 = (String) wz0.b;
            if (b2 == 3) {
                return Collections.singletonList(new uz(0, 0, str, str2));
            }
            StringBuilder sb = new StringBuilder();
            if ((b2 & 1) == 0) {
                sb.append(" baseAddress");
            }
            if ((b2 & 2) == 0) {
                sb.append(" size");
            }
            h.s(f21.i("Missing required properties:", sb));
            return null;
        }
        ku4.j("Null name");
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [c00, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a7  */
    public final d00 b(int i) {
        boolean z;
        Float f2;
        int i2;
        long j;
        Context context = this.a;
        boolean z2 = false;
        Double d2 = null;
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra("status", -1);
                if (intExtra != -1 && (intExtra == 2 || intExtra == 5)) {
                    z = true;
                } else {
                    z = false;
                }
                try {
                    int intExtra2 = registerReceiver.getIntExtra("level", -1);
                    int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                    if (intExtra2 != -1) {
                        if (intExtra3 != -1) {
                            f2 = Float.valueOf(((float) intExtra2) / ((float) intExtra3));
                            if (f2 != null) {
                                d2 = Double.valueOf(f2.doubleValue());
                            }
                            if (z || f2 == null) {
                                i2 = 1;
                            } else if (((double) f2.floatValue()) < 0.99d) {
                                i2 = 2;
                            } else {
                                i2 = 3;
                            }
                            if (!su0.E() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
                                z2 = true;
                            }
                            long f3 = su0.f(context);
                            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                            j = f3 - memoryInfo.availMem;
                            if (j <= 0) {
                                j = 0;
                            }
                            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                            long blockSize = (long) statFs.getBlockSize();
                            ? obj = new Object();
                            obj.a = d2;
                            obj.b = i2;
                            obj.c = z2;
                            obj.d = i;
                            obj.e = j;
                            obj.f = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
                            obj.g = (byte) (((byte) (((byte) (((byte) (((byte) (obj.g | 1)) | 2)) | 4)) | 8)) | 16);
                            return obj.a();
                        }
                    }
                } catch (IllegalStateException e2) {
                    e = e2;
                    Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                    f2 = null;
                    if (f2 != null) {
                    }
                    if (z) {
                    }
                    i2 = 1;
                    z2 = true;
                    long f32 = su0.f(context);
                    ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
                    j = f32 - memoryInfo2.availMem;
                    if (j <= 0) {
                    }
                    StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                    long blockSize2 = (long) statFs2.getBlockSize();
                    ? obj2 = new Object();
                    obj2.a = d2;
                    obj2.b = i2;
                    obj2.c = z2;
                    obj2.d = i;
                    obj2.e = j;
                    obj2.f = (((long) statFs2.getBlockCount()) * blockSize2) - (blockSize2 * ((long) statFs2.getAvailableBlocks()));
                    obj2.g = (byte) (((byte) (((byte) (((byte) (((byte) (obj2.g | 1)) | 2)) | 4)) | 8)) | 16);
                    return obj2.a();
                }
            } else {
                z = false;
            }
        } catch (IllegalStateException e3) {
            e = e3;
            z = false;
            Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
            f2 = null;
            if (f2 != null) {
            }
            if (z) {
            }
            i2 = 1;
            z2 = true;
            long f322 = su0.f(context);
            ActivityManager.MemoryInfo memoryInfo22 = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo22);
            j = f322 - memoryInfo22.availMem;
            if (j <= 0) {
            }
            StatFs statFs22 = new StatFs(Environment.getDataDirectory().getPath());
            long blockSize22 = (long) statFs22.getBlockSize();
            ? obj22 = new Object();
            obj22.a = d2;
            obj22.b = i2;
            obj22.c = z2;
            obj22.d = i;
            obj22.e = j;
            obj22.f = (((long) statFs22.getBlockCount()) * blockSize22) - (blockSize22 * ((long) statFs22.getAvailableBlocks()));
            obj22.g = (byte) (((byte) (((byte) (((byte) (((byte) (obj22.g | 1)) | 2)) | 4)) | 8)) | 16);
            return obj22.a();
        }
        f2 = null;
        if (f2 != null) {
        }
        if (z) {
        }
        i2 = 1;
        z2 = true;
        long f3222 = su0.f(context);
        ActivityManager.MemoryInfo memoryInfo222 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo222);
        j = f3222 - memoryInfo222.availMem;
        if (j <= 0) {
        }
        StatFs statFs222 = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize222 = (long) statFs222.getBlockSize();
        ? obj222 = new Object();
        obj222.a = d2;
        obj222.b = i2;
        obj222.c = z2;
        obj222.d = i;
        obj222.e = j;
        obj222.f = (((long) statFs222.getBlockCount()) * blockSize222) - (blockSize222 * ((long) statFs222.getAvailableBlocks()));
        obj222.g = (byte) (((byte) (((byte) (((byte) (((byte) (obj222.g | 1)) | 2)) | 4)) | 8)) | 16);
        return obj222.a();
    }
}
