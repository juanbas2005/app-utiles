package defpackage;

import io.ktor.util.date.GMTDate;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: eg1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class eg1 {
    public static final TimeZone a = TimeZone.getTimeZone("GMT");
    public static final int[] b = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
    public static final int[] c = {0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};

    public static final GMTDate a(int i, int i2, int i3, int i4, xl4 xl4, int i5) {
        xl4.getClass();
        Calendar instance = Calendar.getInstance(a, Locale.ROOT);
        instance.getClass();
        instance.set(1, i5);
        instance.set(2, xl4.ordinal());
        instance.set(5, i4);
        instance.set(11, i3);
        instance.set(12, i2);
        instance.set(13, i);
        instance.set(14, 0);
        int i6 = instance.get(15);
        int i7 = instance.get(13);
        int i8 = instance.get(12);
        int i9 = instance.get(11);
        s88.x.getClass();
        w52 w52 = s88.z;
        int i10 = instance.get(5);
        int i11 = instance.get(6);
        int i12 = instance.get(2);
        xl4.x.getClass();
        return new GMTDate(i7, i8, i9, (s88) w52.get((instance.get(7) + 5) % 7), i10, i11, (xl4) xl4.z.get(i12), instance.get(1), instance.getTimeInMillis() + ((long) (instance.get(16) + i6)));
    }

    public static final GMTDate b(Long l) {
        long currentTimeMillis;
        int i;
        int i2;
        int i3;
        int[] iArr;
        if (l != null) {
            currentTimeMillis = l.longValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        long j = currentTimeMillis;
        long floorDiv = Math.floorDiv(j, 1000);
        long floorMod = Math.floorMod(floorDiv, 86400);
        int i4 = (int) (floorMod % 60);
        int i5 = (int) ((floorMod / 60) % 60);
        int i6 = (int) (floorMod / 3600);
        int floorDiv2 = (int) Math.floorDiv(floorDiv, 86400);
        s88.x.getClass();
        s88 s88 = (s88) s88.z.get(((floorDiv2 % 7) + 10) % 7);
        int i7 = 719468 + floorDiv2;
        if (i7 >= 0) {
            i2 = i7 / 146097;
            i = i7 % 146097;
        } else {
            i2 = (floorDiv2 + 573372) / 146097;
            i = i7 - (146097 * i2);
        }
        int i8 = (((i / 36524) + (i - (i / 1460))) - (i / 146096)) / 365;
        int i9 = (i2 * 400) + i8;
        int i10 = i - (((i8 / 4) + (i8 * 365)) - (i8 / 100));
        int i11 = ((i10 * 5) + 2) / 153;
        int i12 = (i10 - (((i11 * 153) + 2) / 5)) + 1;
        if (i11 < 10) {
            i3 = i11 + 2;
        } else {
            i3 = i11 - 10;
        }
        if (i3 <= 1) {
            i9++;
        }
        int i13 = i9;
        if (i13 % 4 != 0 || (i13 % 100 == 0 && i13 % 400 != 0)) {
            iArr = b;
        } else {
            iArr = c;
        }
        int i14 = iArr[i3] + i12;
        xl4.x.getClass();
        int i15 = i12;
        return new GMTDate(i4, i5, i6, s88, i15, i14, (xl4) xl4.z.get(i3), i13, j);
    }
}
