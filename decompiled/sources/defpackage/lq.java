package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: lq  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lq {
    public static final RectF l = new RectF();
    public static final ConcurrentHashMap m = new ConcurrentHashMap();
    public int a = 0;
    public boolean b = false;
    public float c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    public int[] f = new int[0];
    public boolean g = false;
    public TextPaint h;
    public final TextView i;
    public final Context j;
    public final iq k;

    public lq(TextView textView) {
        this.i = textView;
        this.j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.k = new jq();
        } else {
            this.k = new iq();
        }
    }

    public static int[] b(int[] iArr) {
        if (r0 != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i2 : iArr) {
                if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            if (r0 != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i3 = 0; i3 < size; i3++) {
                    iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method != null || (method = TextView.class.getDeclaredMethod(str, (Class[]) null)) == null) {
                return method;
            }
            method.setAccessible(true);
            concurrentHashMap.put(str, method);
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        android.util.Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + r4 + "() method", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        return r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    public static Object e(Object obj, Object obj2, String str) {
        return d(str).invoke(obj, (Object[]) null);
    }

    public final void a() {
        int i2;
        if (f()) {
            if (this.b) {
                if (this.i.getMeasuredHeight() > 0 && this.i.getMeasuredWidth() > 0) {
                    if (this.k.b(this.i)) {
                        i2 = 1048576;
                    } else {
                        i2 = (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                    }
                    int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                    if (i2 > 0 && height > 0) {
                        RectF rectF = l;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = (float) i2;
                                rectF.bottom = (float) height;
                                float c2 = (float) c(rectF);
                                if (c2 != this.i.getTextSize()) {
                                    g(0, c2);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence charSequence;
        CharSequence transformation;
        RectF rectF2 = rectF;
        int length = this.f.length;
        if (length != 0) {
            int i2 = length - 1;
            int i3 = 0;
            int i4 = 1;
            while (true) {
                int[] iArr = this.f;
                if (i4 > i2) {
                    return iArr[i3];
                }
                int i5 = (i4 + i2) / 2;
                int i6 = iArr[i5];
                TextView textView = this.i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) {
                    charSequence = text;
                } else {
                    charSequence = transformation;
                }
                int maxLines = textView.getMaxLines();
                TextPaint textPaint = this.h;
                if (textPaint == null) {
                    this.h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.h.set(textView.getPaint());
                this.h.setTextSize((float) i6);
                StaticLayout a2 = hq.a(charSequence, (Layout.Alignment) e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF2.right), maxLines, this.i, this.h, this.k);
                if ((maxLines == -1 || (a2.getLineCount() <= maxLines && a2.getLineEnd(a2.getLineCount() - 1) == charSequence.length())) && ((float) a2.getHeight()) <= rectF2.bottom) {
                    int i7 = i5 + 1;
                    i3 = i4;
                    i4 = i7;
                } else {
                    i3 = i5 - 1;
                    i2 = i3;
                }
            }
        } else {
            h.s("No available text sizes to choose from.");
            return 0;
        }
    }

    public final boolean f() {
        if (!j() || this.a == 0) {
            return false;
        }
        return true;
    }

    public final void g(int i2, float f2) {
        Resources resources;
        Context context = this.j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i2, f2, resources.getDisplayMetrics());
        TextView textView = this.i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.b = false;
                try {
                    Method d2 = d("nullLayouts");
                    if (d2 != null) {
                        d2.invoke(textView, (Object[]) null);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (!isInLayout) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (!j() || this.a != 1) {
            this.b = false;
        } else {
            if (!this.g || this.f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.e - this.d) / this.c))) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = Math.round((((float) i2) * this.c) + this.d);
                }
                this.f = b(iArr);
            }
            this.b = true;
        }
        return this.b;
    }

    public final boolean i() {
        boolean z;
        int[] iArr = this.f;
        int length = iArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        this.g = z;
        if (z) {
            this.a = 1;
            this.d = (float) iArr[0];
            this.e = (float) iArr[length - 1];
            this.c = -1.0f;
        }
        return z;
    }

    public final boolean j() {
        return !(this.i instanceof ap);
    }

    public final void k(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        } else if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        } else if (f4 > 0.0f) {
            this.a = 1;
            this.d = f2;
            this.e = f3;
            this.c = f4;
            this.g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
    }
}
