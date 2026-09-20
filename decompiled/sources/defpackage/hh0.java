package defpackage;

import android.graphics.Bitmap;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: hh0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hh0 {
    public final kd6 a;
    public final gh0 b;
    public final Date c;
    public final String d;
    public final Date e;
    public final String f;
    public final Date g;
    public final long h;
    public final long i;
    public final String j;
    public final int k = -1;

    public hh0(kd6 kd6, gh0 gh0) {
        int i2;
        int i3;
        Date date;
        Date date2;
        Date date3;
        DateFormat dateFormat;
        gh0 gh02 = gh0;
        this.a = kd6;
        this.b = gh02;
        if (gh02 != null) {
            this.h = gh02.c;
            this.i = gh02.d;
            bz2 bz2 = gh02.f;
            int size = bz2.size();
            int i4 = 0;
            int i5 = 0;
            while (i5 < size) {
                String g2 = bz2.g(i5);
                if (g2.equalsIgnoreCase("Date")) {
                    String f2 = bz2.f("Date");
                    if (f2 != null) {
                        cj cjVar = uf1.a;
                        if (f2.length() != 0) {
                            ParsePosition parsePosition = new ParsePosition(i4);
                            Date parse = ((DateFormat) uf1.a.get()).parse(f2, parsePosition);
                            if (parsePosition.getIndex() == f2.length()) {
                                date3 = parse;
                            } else {
                                String[] strArr = uf1.b;
                                synchronized (strArr) {
                                    try {
                                        int length = strArr.length;
                                        int i6 = i4;
                                        while (i6 < length) {
                                            DateFormat[] dateFormatArr = uf1.c;
                                            DateFormat dateFormat2 = dateFormatArr[i6];
                                            if (dateFormat2 == null) {
                                                dateFormat = new SimpleDateFormat(uf1.b[i6], Locale.US);
                                                dateFormat.setTimeZone(fg8.a);
                                                dateFormatArr[i6] = dateFormat;
                                                i4 = 0;
                                            } else {
                                                dateFormat = dateFormat2;
                                            }
                                            parsePosition.setIndex(i4);
                                            Date parse2 = dateFormat.parse(f2, parsePosition);
                                            if (parsePosition.getIndex() != 0) {
                                                date3 = parse2;
                                                break;
                                            } else {
                                                i6++;
                                                i4 = 0;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                            this.c = date3;
                            this.d = bz2.l(i5);
                        }
                    }
                    date3 = null;
                    this.c = date3;
                    this.d = bz2.l(i5);
                } else if (g2.equalsIgnoreCase("Expires")) {
                    String f3 = bz2.f("Expires");
                    if (f3 != null) {
                        cj cjVar2 = uf1.a;
                        if (f3.length() != 0) {
                            ParsePosition parsePosition2 = new ParsePosition(0);
                            Date parse3 = ((DateFormat) uf1.a.get()).parse(f3, parsePosition2);
                            if (parsePosition2.getIndex() == f3.length()) {
                                date2 = parse3;
                            } else {
                                String[] strArr2 = uf1.b;
                                synchronized (strArr2) {
                                    try {
                                        int length2 = strArr2.length;
                                        for (int i7 = 0; i7 < length2; i7++) {
                                            DateFormat[] dateFormatArr2 = uf1.c;
                                            DateFormat dateFormat3 = dateFormatArr2[i7];
                                            if (dateFormat3 == null) {
                                                dateFormat3 = new SimpleDateFormat(uf1.b[i7], Locale.US);
                                                dateFormat3.setTimeZone(fg8.a);
                                                dateFormatArr2[i7] = dateFormat3;
                                            }
                                            parsePosition2.setIndex(0);
                                            Date parse4 = dateFormat3.parse(f3, parsePosition2);
                                            if (parsePosition2.getIndex() != 0) {
                                                date2 = parse4;
                                                break;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            }
                            this.g = date2;
                        }
                    }
                    date2 = null;
                    this.g = date2;
                } else {
                    if (g2.equalsIgnoreCase("Last-Modified")) {
                        String f4 = bz2.f("Last-Modified");
                        if (f4 != null) {
                            cj cjVar3 = uf1.a;
                            if (f4.length() == 0) {
                                date = null;
                            } else {
                                ParsePosition parsePosition3 = new ParsePosition(0);
                                Date parse5 = ((DateFormat) uf1.a.get()).parse(f4, parsePosition3);
                                if (parsePosition3.getIndex() == f4.length()) {
                                    date = parse5;
                                } else {
                                    String[] strArr3 = uf1.b;
                                    synchronized (strArr3) {
                                        try {
                                            int length3 = strArr3.length;
                                            for (int i8 = 0; i8 < length3; i8++) {
                                                DateFormat[] dateFormatArr3 = uf1.c;
                                                DateFormat dateFormat4 = dateFormatArr3[i8];
                                                if (dateFormat4 == null) {
                                                    dateFormat4 = new SimpleDateFormat(uf1.b[i8], Locale.US);
                                                    dateFormat4.setTimeZone(fg8.a);
                                                    dateFormatArr3[i8] = dateFormat4;
                                                }
                                                i2 = 0;
                                                parsePosition3.setIndex(0);
                                                Date parse6 = dateFormat4.parse(f4, parsePosition3);
                                                if (parsePosition3.getIndex() != 0) {
                                                    date = parse6;
                                                    break;
                                                }
                                            }
                                            i2 = 0;
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                    this.e = date;
                                    this.f = bz2.l(i5);
                                }
                            }
                            i2 = 0;
                            this.e = date;
                            this.f = bz2.l(i5);
                        } else {
                            i2 = 0;
                        }
                        date = null;
                        this.e = date;
                        this.f = bz2.l(i5);
                    } else {
                        i2 = 0;
                        if (g2.equalsIgnoreCase("ETag")) {
                            this.j = bz2.l(i5);
                        } else if (g2.equalsIgnoreCase("Age")) {
                            String l = bz2.l(i5);
                            Bitmap.Config[] configArr = i.a;
                            Long w0 = k57.w0(l);
                            if (w0 != null) {
                                long longValue = w0.longValue();
                                if (longValue > 2147483647L) {
                                    i3 = Integer.MAX_VALUE;
                                } else if (longValue < 0) {
                                    i3 = 0;
                                } else {
                                    i3 = (int) longValue;
                                }
                            } else {
                                i3 = -1;
                            }
                            this.k = i3;
                        }
                    }
                    i5++;
                    i4 = i2;
                }
                i2 = 0;
                i5++;
                i4 = i2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d5, code lost:
        if (r4 > 0) goto L_0x0104;
     */
    public final ih0 a() {
        gh0 gh0;
        long j2;
        long j3;
        long j4;
        Date date;
        long j5;
        int i2;
        String str;
        kd6 kd6 = this.a;
        g73 g73 = (g73) kd6.x;
        gh0 gh02 = this.b;
        if (gh02 == null) {
            return new ih0(kd6, (gh0) null);
        }
        nz3 nz3 = gh02.a;
        if (sg3.e(g73.a, "https") && !gh02.e) {
            return new ih0(kd6, (gh0) null);
        }
        ah0 ah0 = (ah0) nz3.getValue();
        if (kd6.x().b || ((ah0) nz3.getValue()).b || sg3.e(gh02.f.f("Vary"), "*")) {
            return new ih0(kd6, (gh0) null);
        }
        ah0 x = kd6.x();
        if (!x.a) {
            bz2 bz2 = (bz2) kd6.z;
            String str2 = "If-Modified-Since";
            if (bz2.f(str2) == null && bz2.f("If-None-Match") == null) {
                long j6 = this.i;
                Date date2 = this.c;
                if (date2 != null) {
                    gh0 = gh02;
                    j2 = Math.max(0, j6 - date2.getTime());
                } else {
                    gh0 = gh02;
                    j2 = 0;
                }
                TimeUnit timeUnit = TimeUnit.SECONDS;
                int i3 = this.k;
                if (i3 != -1) {
                    j2 = Math.max(j2, timeUnit.toMillis((long) i3));
                }
                long j7 = this.h;
                int i4 = ((ah0) nz3.getValue()).c;
                long longValue = j2 + (j6 - j7) + (((Number) ci7.a.b()).longValue() - j6);
                Date date3 = this.e;
                if (i4 != -1) {
                    j3 = timeUnit.toMillis((long) i4);
                } else {
                    Date date4 = this.g;
                    if (date4 != null) {
                        if (date2 != null) {
                            j6 = date2.getTime();
                        }
                        j3 = date4.getTime() - j6;
                    } else if (date3 != null) {
                        List list = g73.f;
                        if (list == null) {
                            str = null;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            hr2.k(sb, list);
                            str = sb.toString();
                        }
                        if (str == null) {
                            if (date2 != null) {
                                j7 = date2.getTime();
                            }
                            long time = j7 - date3.getTime();
                            if (time > 0) {
                                j3 = time / 10;
                            }
                        }
                    }
                    j3 = 0;
                }
                int i5 = x.c;
                if (i5 != -1) {
                    j3 = Math.min(j3, timeUnit.toMillis((long) i5));
                }
                int i6 = x.i;
                if (i6 != -1) {
                    j4 = timeUnit.toMillis((long) i6);
                } else {
                    j4 = 0;
                }
                if (ah0.g || (i2 = x.h) == -1) {
                    date = date3;
                    j5 = 0;
                } else {
                    date = date3;
                    j5 = timeUnit.toMillis((long) i2);
                }
                if (!ah0.a && longValue + j4 < j3 + j5) {
                    return new ih0((kd6) null, gh0);
                }
                gh0 gh03 = gh0;
                String str3 = this.j;
                if (str3 != null) {
                    str2 = "If-None-Match";
                } else if (date != null) {
                    str3 = this.f;
                    str3.getClass();
                } else if (date2 == null) {
                    return new ih0(kd6, (gh0) null);
                } else {
                    str3 = this.d;
                    str3.getClass();
                }
                o9 q0 = kd6.q0();
                zy2 zy2 = (zy2) q0.z;
                zy2.getClass();
                za5.u(str2);
                za5.v(str3, str2);
                za5.m(zy2, str2, str3);
                return new ih0(new kd6(q0), gh03);
            }
        }
        return new ih0(kd6, (gh0) null);
    }
}
