package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* renamed from: i21  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i21 {
    public boolean a = false;
    public int b;
    public int c;
    public float d;
    public String e;
    public boolean f;
    public int g;

    public i21(i21 i21, Object obj) {
        i21.getClass();
        this.b = i21.b;
        b(obj);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [i21, java.lang.Object] */
    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        Object valueOf;
        Object string;
        Context context2 = context;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), jv5.d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i = 0;
        boolean z = false;
        Object obj = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            int i3 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i4 = 3;
                if (index == 3) {
                    string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i4 = 4;
                    if (index == 2) {
                        string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context2.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i4 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i = 2;
                            } else {
                                if (index == 6) {
                                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    string = obtainStyledAttributes.getString(index);
                                } else {
                                    i3 = 8;
                                    if (index == 8) {
                                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        valueOf = Integer.valueOf(resourceId);
                                    }
                                }
                                i = i3;
                            }
                        }
                        i = 7;
                    }
                }
                i = i4;
            }
        }
        if (!(str == null || obj == null)) {
            ? obj2 = new Object();
            obj2.b = i;
            obj2.a = z;
            obj2.b(obj);
            hashMap.put(str, obj2);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (b81.B(this.b)) {
            case b85.b:
            case 7:
                this.c = ((Integer) obj).intValue();
                return;
            case 1:
                this.d = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.g = ((Integer) obj).intValue();
                return;
            case 4:
                this.e = (String) obj;
                return;
            case 5:
                this.f = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
