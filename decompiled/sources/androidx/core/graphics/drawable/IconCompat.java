package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
    public int a;
    public Object b;
    public byte[] c = null;
    public Parcelable d = null;
    public int e = 0;
    public int f = 0;
    public ColorStateList g = null;
    public PorterDuff.Mode h = k;
    public String i = null;
    public String j;

    public IconCompat(int i2) {
        this.a = i2;
    }

    public static Bitmap a(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f2 = (float) min;
        float f3 = 0.5f * f2;
        float f4 = 0.9166667f * f3;
        if (z) {
            float f5 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate(((float) (-(bitmap.getWidth() - min))) / 2.0f, ((float) (-(bitmap.getHeight() - min))) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public static IconCompat b(int i2) {
        if (i2 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.e = i2;
            iconCompat.b = "";
            iconCompat.j = "";
            return iconCompat;
        }
        h.q("Drawable resource ID must not be 0");
        return null;
    }

    public final int c() {
        int i2 = this.a;
        if (i2 == -1) {
            Object obj = this.b;
            if (Build.VERSION.SDK_INT >= 28) {
                return bn.i(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", (Class[]) null).invoke(obj, (Object[]) null)).intValue();
            } catch (IllegalAccessException e2) {
                Log.e("IconCompat", "Unable to get icon resource", e2);
                return 0;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return 0;
            } catch (NoSuchMethodException e4) {
                Log.e("IconCompat", "Unable to get icon resource", e4);
                return 0;
            }
        } else if (i2 == 2) {
            return this.e;
        } else {
            ku4.t("called getResId() on ", this);
            return 0;
        }
    }

    public final int d() {
        int i2 = this.a;
        if (i2 != -1) {
            return i2;
        }
        Object obj = this.b;
        if (Build.VERSION.SDK_INT >= 28) {
            return bn.q(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", (Class[]) null).invoke(obj, (Object[]) null)).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e2);
            return -1;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e3);
            return -1;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e4);
            return -1;
        }
    }

    public final Uri e() {
        int i2 = this.a;
        if (i2 == -1) {
            Object obj = this.b;
            if (Build.VERSION.SDK_INT >= 28) {
                return bn.r(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", (Class[]) null).invoke(obj, (Object[]) null);
            } catch (IllegalAccessException e2) {
                Log.e("IconCompat", "Unable to get icon uri", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon uri", e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.e("IconCompat", "Unable to get icon uri", e4);
                return null;
            }
        } else if (i2 == 4 || i2 == 6) {
            return Uri.parse((String) this.b);
        } else {
            ku4.t("called getUri() on ", this);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0098  */
    public final Icon f(Context context) {
        Icon icon;
        InputStream inputStream;
        int i2 = this.a;
        String str = null;
        switch (i2) {
            case -1:
                return (Icon) this.b;
            case 1:
                icon = Icon.createWithBitmap((Bitmap) this.b);
                break;
            case 2:
                if (i2 == -1) {
                    Object obj = this.b;
                    if (Build.VERSION.SDK_INT >= 28) {
                        str = bn.j(obj);
                    } else {
                        try {
                            str = (String) obj.getClass().getMethod("getResPackage", (Class[]) null).invoke(obj, (Object[]) null);
                        } catch (IllegalAccessException e2) {
                            Log.e("IconCompat", "Unable to get icon package", e2);
                        } catch (InvocationTargetException e3) {
                            Log.e("IconCompat", "Unable to get icon package", e3);
                        } catch (NoSuchMethodException e4) {
                            Log.e("IconCompat", "Unable to get icon package", e4);
                        }
                    }
                } else if (i2 == 2) {
                    String str2 = this.j;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) this.b).split(":", -1)[0] : this.j;
                } else {
                    ku4.t("called getResPackage() on ", this);
                    return null;
                }
                icon = Icon.createWithResource(str, this.e);
                break;
            case 3:
                icon = Icon.createWithData((byte[]) this.b, this.e, this.f);
                break;
            case 4:
                icon = Icon.createWithContentUri((String) this.b);
                break;
            case 5:
                int i3 = Build.VERSION.SDK_INT;
                Object obj2 = this.b;
                if (i3 < 26) {
                    icon = Icon.createWithBitmap(a((Bitmap) obj2, false));
                    break;
                } else {
                    icon = an.c((Bitmap) obj2);
                    break;
                }
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    icon = x4.a(e());
                    break;
                } else if (context != null) {
                    Uri e5 = e();
                    String scheme = e5.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStream = context.getContentResolver().openInputStream(e5);
                        } catch (Exception e6) {
                            Log.w("IconCompat", "Unable to load image from URI: " + e5, e6);
                            inputStream = null;
                            if (inputStream == null) {
                            }
                        }
                    } else {
                        try {
                            inputStream = new FileInputStream(new File((String) this.b));
                        } catch (FileNotFoundException e7) {
                            Log.w("IconCompat", "Unable to load image from path: " + e5, e7);
                        }
                    }
                    if (inputStream == null) {
                        if (Build.VERSION.SDK_INT < 26) {
                            icon = Icon.createWithBitmap(a(BitmapFactory.decodeStream(inputStream), false));
                            break;
                        } else {
                            icon = an.c(BitmapFactory.decodeStream(inputStream));
                            break;
                        }
                    } else {
                        rf2.y("Cannot load adaptive icon from uri: ", e());
                        return null;
                    }
                } else {
                    ta1.h("Context is required to resolve the file uri of the icon: ", e());
                    return null;
                }
            default:
                h.q("Unknown type");
                return null;
        }
        ColorStateList colorStateList = this.g;
        if (colorStateList != null) {
            icon.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.h;
        if (mode != k) {
            icon.setTintMode(mode);
        }
        return icon;
    }

    public final String toString() {
        String str;
        if (this.a == -1) {
            return String.valueOf(this.b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(c())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.e);
                if (this.f != 0) {
                    sb.append(" off=");
                    sb.append(this.f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.b);
                break;
        }
        if (this.g != null) {
            sb.append(" tint=");
            sb.append(this.g);
        }
        if (this.h != k) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }
}
