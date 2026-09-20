package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* renamed from: an2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class an2 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ Context C;
    public final /* synthetic */ Uri D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ an2(Context context, Uri uri, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = context;
        this.D = uri;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b /*0*/:
                return ((an2) o(f61, o81)).s(vs7);
            default:
                return ((an2) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b /*0*/:
                an2 an2 = new an2(this.C, this.D, f61, 0);
                an2.B = obj;
                return an2;
            default:
                an2 an22 = new an2(this.C, this.D, f61, 1);
                an22.B = obj;
                return an22;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: m66} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: m66} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: m66} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: m66} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: m66} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: m66} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: m66} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: m66} */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        if (r7 > 400000) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        defpackage.ed1.i(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0083, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f4, code lost:
        if (r7 > 300000) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        defpackage.ed1.i(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0101, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object s(Object obj) {
        m66 m66;
        m66 m662;
        int i = this.A;
        Uri uri = this.D;
        Context context = this.C;
        o81 o81 = (o81) this.B;
        switch (i) {
            case b85.b /*0*/:
                o85.q(obj);
                try {
                    InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                    if (openInputStream != null) {
                        byte[] v0 = bb0.v0(openInputStream);
                        openInputStream.close();
                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(v0, 0, v0.length);
                        if (decodeByteArray != null) {
                            int max = Math.max(decodeByteArray.getWidth(), decodeByteArray.getHeight());
                            if (max > 720) {
                                float f = 720.0f / ((float) max);
                                decodeByteArray = Bitmap.createScaledBitmap(decodeByteArray, (int) (((float) decodeByteArray.getWidth()) * f), (int) (((float) decodeByteArray.getHeight()) * f), true);
                                decodeByteArray.getClass();
                            }
                            int i2 = 80;
                            do {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                decodeByteArray.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                byteArray.getClass();
                                i2 -= 10;
                                if (byteArray.length > 300000) {
                                }
                                int length = byteArray.length;
                                m66 = byteArray;
                                break;
                            } while (i2 >= 30);
                            int length2 = byteArray.length;
                            m66 = byteArray;
                        }
                    }
                    m66 = null;
                } catch (Throwable th) {
                    m66 = new m66(th);
                }
                if (m66 instanceof m66) {
                    return null;
                }
                return m66;
            default:
                o85.q(obj);
                try {
                    InputStream openInputStream2 = context.getContentResolver().openInputStream(uri);
                    if (openInputStream2 != null) {
                        byte[] v02 = bb0.v0(openInputStream2);
                        openInputStream2.close();
                        Bitmap decodeByteArray2 = BitmapFactory.decodeByteArray(v02, 0, v02.length);
                        if (decodeByteArray2 != null) {
                            int max2 = Math.max(decodeByteArray2.getWidth(), decodeByteArray2.getHeight());
                            if (max2 > 1280) {
                                float f2 = 1280.0f / ((float) max2);
                                decodeByteArray2 = Bitmap.createScaledBitmap(decodeByteArray2, (int) (((float) decodeByteArray2.getWidth()) * f2), (int) (((float) decodeByteArray2.getHeight()) * f2), true);
                                decodeByteArray2.getClass();
                            }
                            int i3 = 85;
                            do {
                                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                decodeByteArray2.compress(Bitmap.CompressFormat.JPEG, i3, byteArrayOutputStream2);
                                byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                byteArray2.getClass();
                                i3 -= 10;
                                if (byteArray2.length > 400000) {
                                }
                                int length3 = byteArray2.length;
                                m662 = byteArray2;
                                break;
                            } while (i3 >= 30);
                            int length32 = byteArray2.length;
                            m662 = byteArray2;
                        }
                    }
                    m662 = null;
                } catch (Throwable th2) {
                    m662 = new m66(th2);
                }
                if (m662 instanceof m66) {
                    return null;
                }
                return m662;
        }
    }
}
