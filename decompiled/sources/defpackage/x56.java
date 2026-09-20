package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: x56  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class x56 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cd A[ADDED_TO_REGION] */
    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, b85 b85, boolean z, boolean z2) {
        b85 b852 = b85;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            Typeface typeface = null;
            if (charSequence2.startsWith("res/")) {
                int i3 = typedValue.assetCookie;
                kd4 kd4 = mq7.b;
                Typeface typeface2 = (Typeface) kd4.h(mq7.b(resources, i, charSequence2, i3, i2));
                if (typeface2 != null) {
                    if (b852 != null) {
                        new Handler(Looper.getMainLooper()).post(new ga(29, (Object) b852, (Object) typeface2));
                    }
                    typeface = typeface2;
                } else if (!z2) {
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            rl2 y = ed1.y(resources.getXml(i), resources);
                            if (y == null) {
                                Log.e("ResourcesCompat", "Failed to find font-family tag");
                                if (b852 != null) {
                                    b852.h(-3);
                                }
                            } else {
                                typeface = mq7.a(context, y, resources, i, charSequence2, typedValue.assetCookie, i2, b852, z);
                            }
                        } else {
                            int i4 = typedValue.assetCookie;
                            Typeface g = mq7.a.g(context, resources, i, charSequence2, i2);
                            if (g != null) {
                                kd4.l(mq7.b(resources, i, charSequence2, i4, i2), g);
                            }
                            if (b852 != null) {
                                if (g != null) {
                                    new Handler(Looper.getMainLooper()).post(new ga(29, (Object) b852, (Object) g));
                                } else {
                                    b852.h(-3);
                                }
                            }
                            typeface = g;
                        }
                    } catch (XmlPullParserException e) {
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e);
                        if (b852 != null) {
                            b852.h(-3);
                        }
                        if (typeface == null) {
                        }
                        return typeface;
                    } catch (IOException e2) {
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e2);
                        if (b852 != null) {
                        }
                        if (typeface == null) {
                        }
                        return typeface;
                    }
                }
            } else if (b852 != null) {
                b852.h(-3);
            }
            if (typeface == null || b852 != null || z2) {
                return typeface;
            }
            String hexString = Integer.toHexString(i);
            throw new Resources.NotFoundException("Font resource ID #0x" + hexString + " could not be retrieved.");
        }
        String resourceName = resources.getResourceName(i);
        String hexString2 = Integer.toHexString(i);
        throw new Resources.NotFoundException("Resource \"" + resourceName + "\" (" + hexString2 + ") is not a Font: " + typedValue);
    }
}
