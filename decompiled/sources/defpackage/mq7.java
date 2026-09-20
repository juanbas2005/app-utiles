package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: mq7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class mq7 {
    public static final a35 a;
    public static final kd4 b = new kd4(16);
    public static Paint c = null;

    static {
        Trace.beginSection(f55.v("TypefaceCompat static init"));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new a35();
        } else if (i >= 29) {
            a = new a35();
        } else if (i >= 28) {
            a = new pq7();
        } else if (i >= 26) {
            a = new pq7();
        } else {
            Method method = oq7.h;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                a = new a35();
            } else {
                a = new a35();
            }
        }
        Trace.endSection();
    }

    public static Typeface a(Context context, rl2 rl2, Resources resources, int i, String str, int i2, int i3, b85 b85, boolean z) {
        Typeface typeface;
        Typeface typeface2;
        boolean z2;
        int i4;
        Handler handler;
        FontFamily fontFamily;
        Context context2 = context;
        rl2 rl22 = rl2;
        int i5 = i3;
        b85 b852 = b85;
        if (rl22 instanceof ul2) {
            ul2 ul2 = (ul2) rl22;
            String str2 = ul2.d;
            typeface = null;
            if (TextUtils.isEmpty(str2) || (typeface2 = c(str2)) == null) {
                ArrayList arrayList = ul2.a;
                if (arrayList.size() == 1) {
                    typeface2 = c(((kl2) arrayList.get(0)).e);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i6 = 0;
                        while (true) {
                            if (i6 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= arrayList.size()) {
                                        break;
                                    }
                                    kl2 kl2 = (kl2) arrayList.get(i7);
                                    if (i7 == arrayList.size() - 1 && TextUtils.isEmpty(kl2.f)) {
                                        customFallbackBuilder.setSystemFallback(kl2.e);
                                        break;
                                    }
                                    String str3 = kl2.e;
                                    String str4 = kl2.f;
                                    Font d = d(c(str3));
                                    if (d == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + kl2.e + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (!TextUtils.isEmpty(str4)) {
                                        try {
                                            g07.l();
                                            g07.y();
                                            fontFamily = g07.i(v41.h(d).setFontVariationSettings(str4).build()).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    } else {
                                        fontFamily = g07.x(d).build();
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = g07.d(fontFamily);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(fontFamily);
                                    }
                                    i7++;
                                }
                                typeface2 = customFallbackBuilder.build();
                            } else if (c(((kl2) arrayList.get(i6)).e) == null) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                    }
                    typeface2 = null;
                }
            }
            if (typeface2 != null) {
                if (b852 != null) {
                    new Handler(Looper.getMainLooper()).post(new ga(29, (Object) b852, (Object) typeface2));
                }
                b.l(b(resources, i, str, i2, i3), typeface2);
                return typeface2;
            }
            if (!z ? b852 != null : ul2.c != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z) {
                i4 = ul2.b;
            } else {
                i4 = -1;
            }
            Handler handler2 = new Handler(Looper.getMainLooper());
            br4 br4 = new br4(0, 19);
            br4.x = b852;
            ArrayList arrayList2 = ul2.a;
            w80 w80 = new w80(handler2, 3);
            qc3 qc3 = new qc3(23, (Object) br4, (Object) w80);
            if (!z2) {
                String a2 = ql2.a(i5, arrayList2);
                Typeface typeface3 = (Typeface) ql2.a.h(a2);
                if (typeface3 != null) {
                    w80.execute(new nt2(5, (Object) br4, (Object) typeface3));
                    typeface = typeface3;
                } else {
                    ol2 ol2 = new ol2(0, qc3);
                    synchronized (ql2.c) {
                        try {
                            zt6 zt6 = ql2.d;
                            ArrayList arrayList3 = (ArrayList) zt6.get(a2);
                            if (arrayList3 != null) {
                                arrayList3.add(ol2);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(ol2);
                                zt6.put(a2, arrayList4);
                                String str5 = a2;
                                nl2 nl2 = new nl2(str5, context, arrayList2, i5, 1);
                                ThreadPoolExecutor threadPoolExecutor = ql2.b;
                                ol2 ol22 = new ol2(1, str5);
                                if (Looper.myLooper() == null) {
                                    handler = new Handler(Looper.getMainLooper());
                                } else {
                                    handler = new Handler();
                                }
                                z46 z46 = new z46();
                                z46.x = nl2;
                                z46.y = ol22;
                                z46.z = handler;
                                threadPoolExecutor.execute(z46);
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                            }
                        }
                    }
                }
            } else if (arrayList2.size() <= 1) {
                kl2 kl22 = (kl2) arrayList2.get(0);
                kd4 kd4 = ql2.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{kl22}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String a3 = ql2.a(i5, Collections.unmodifiableList(arrayList5));
                Typeface typeface4 = (Typeface) ql2.a.h(a3);
                if (typeface4 != null) {
                    w80.execute(new nt2(5, (Object) br4, (Object) typeface4));
                    typeface = typeface4;
                } else if (i4 == -1) {
                    Object[] objArr = {kl22};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    pl2 b2 = ql2.b(a3, context2, Collections.unmodifiableList(arrayList6), i5);
                    qc3.I(b2);
                    typeface = b2.a;
                } else {
                    try {
                        pl2 pl2 = (pl2) ql2.b.submit(new nl2(a3, context2, kl22, i5, 0)).get((long) i4, TimeUnit.MILLISECONDS);
                        qc3.I(pl2);
                        typeface = pl2.a;
                    } catch (ExecutionException e) {
                        throw new RuntimeException(e);
                    } catch (InterruptedException e2) {
                        throw e2;
                    } catch (TimeoutException unused2) {
                        throw new InterruptedException("timeout");
                    } catch (InterruptedException unused3) {
                        ((w80) qc3.y).execute(new cj0(-3, 0, (Object) (br4) qc3.x));
                    }
                }
            } else {
                h.q("Fallbacks with blocking fetches are not supported for performance reasons");
                return null;
            }
            Resources resources2 = resources;
        } else {
            typeface = a.d(context2, (sl2) rl22, resources, i5);
            if (b852 != null) {
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new ga(29, (Object) b852, (Object) typeface));
                } else {
                    b852.h(-3);
                }
            }
        }
        if (typeface != null) {
            b.l(b(resources, i, str, i2, i3), typeface);
        }
        return typeface;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                return null;
            }
            return create;
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        if (c == null) {
            c = new Paint();
        }
        c.setTextSize(10.0f);
        c.setTypeface(typeface);
        PositionedGlyphs j = TextRunShaper.shapeTextRun(" ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        if (j.glyphCount() == 0) {
            return null;
        }
        return j.getFont(0);
    }
}
