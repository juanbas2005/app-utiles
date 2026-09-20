package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import cu.lestebang.utiletecsa.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* renamed from: r16  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class r16 {
    public static final float A = 0.38f;
    public static final rt0 B;
    public static final rt0 C;
    public static final vq6 D;
    public static final float E = 28.0f;
    public static final rt0 F = rt0.A;
    public static final float G = 24.0f;
    public static final rt0 H = rt0.B;
    public static final rt0 I = rt0.H;
    public static final float J = 40.0f;
    public static final float K = 32.0f;
    public static final float L = 2.0f;
    public static final vq6 M;
    public static final float N = 52.0f;
    public static final rt0 O;
    public static final rt0 P;
    public static final float Q = 16.0f;
    public static final rt0 R;
    public static final rt0 S;
    public static final String[] T = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};
    public static final String[] U = {"ad_impression"};
    public static final String[] V = {"ad_impression", "in_app_purchase"};
    public static final String[] W = {"ad_impression"};
    public static final String[] X = {"ad_impression", "in_app_purchase"};
    public static final String[] Y = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};
    public static final String[] Z = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};
    public static final fw0 a = new fw0(-492711772, new tw0(14), false);
    public static x83 a0;
    public static final fw0 b = new fw0(895267259, new tw0(16), false);
    public static x83 b0;
    public static final jt1 c = new Object();
    public static final /* synthetic */ int c0 = 0;
    public static final rt0 d = rt0.N;
    public static x83 d0;
    public static final float e = 64.0f;
    public static final rt0 f = rt0.C;
    public static final rt0 g = rt0.L;
    public static final float h = 4.0f;
    public static final vq6 i;
    public static final rt0 j = rt0.K;
    public static final rt0 k;
    public static final rt0 l;
    public static final float m = 80.0f;
    public static final cr7 n = cr7.C;
    public static final nh o = new nh(1000);
    public static final nh p = new nh(1008);
    public static final nh q = new nh(1002);
    public static final rt0 r = rt0.M;
    public static final float s = 1.0f;
    public static final rt0 t;
    public static final float u = 0.38f;
    public static final rt0 v;
    public static final float w = 0.12f;
    public static final rt0 x;
    public static final float y = 0.38f;
    public static final rt0 z;

    /* JADX WARNING: type inference failed for: r0v4, types: [jt1, java.lang.Object] */
    static {
        new fw0(568924554, new tw0(13), false);
        new fw0(-1548300991, new tw0(15), false);
        vq6 vq6 = vq6.y;
        i = vq6;
        rt0 rt0 = rt0.E;
        k = rt0;
        l = rt0;
        new nh(1007);
        rt0 rt02 = rt0.D;
        t = rt02;
        v = rt02;
        x = rt02;
        rt0 rt03 = rt0.P;
        z = rt03;
        B = rt03;
        C = rt02;
        D = vq6;
        M = vq6;
        rt0 rt04 = rt0.F;
        O = rt04;
        P = rt04;
        R = rt03;
        S = rt03;
    }

    public static final int A(h24 h24, Object obj, int i2) {
        int e2;
        if (obj == null || h24.a() == 0 || ((i2 < h24.a() && obj.equals(h24.b(i2))) || (e2 = h24.e(obj)) == -1)) {
            return i2;
        }
        return e2;
    }

    public static final ql4 B(sl4 sl4, gq0 gq0, am6 am6) {
        sl4.getClass();
        gq0.getClass();
        am6.getClass();
        ql4 y2 = y(sl4, gq0);
        if (y2 != null) {
            return y2;
        }
        return am6.E(gq0, cl6.V(new wl7(cl6.S(ce2.D, gq0), v61.T)));
    }

    public static final long C(long j2, long j3) {
        if (d18.a()) {
            return za5.k(j3);
        }
        if (d18.b()) {
            return j3;
        }
        return j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005a, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        defpackage.ed1.i(r7, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005e, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a5, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        defpackage.ed1.i(r7, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a9, code lost:
        throw r3;
     */
    public static ce1 D(byte[] bArr) {
        boolean z2;
        bArr.getClass();
        if (bArr.length > 10240) {
            h.s("Data cannot occupy more than 10240 bytes when serialized");
            return null;
        } else if (bArr.length == 0) {
            return ce1.b;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                byte[] bArr2 = new byte[2];
                byteArrayInputStream.read(bArr2);
                int i2 = 0;
                if (bArr2[0] == -84 && bArr2[1] == -19) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                byteArrayInputStream.reset();
                if (z2) {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    int readInt = objectInputStream.readInt();
                    while (i2 < readInt) {
                        linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        i2++;
                    }
                    objectInputStream.close();
                    return new ce1(linkedHashMap);
                }
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                short readShort = dataInputStream.readShort();
                if (readShort == -21521) {
                    short readShort2 = dataInputStream.readShort();
                    if (readShort2 != 1) {
                        ku4.g(hl6.k(readShort2, "Unsupported version number: "));
                    }
                } else {
                    ku4.g(hl6.k(readShort, "Magic number doesn't match: "));
                }
                int readInt2 = dataInputStream.readInt();
                while (i2 < readInt2) {
                    linkedHashMap.put(dataInputStream.readUTF(), E(dataInputStream, dataInputStream.readByte()));
                    i2++;
                }
                dataInputStream.close();
                return new ce1(linkedHashMap);
            } catch (IOException e2) {
                bc4.k().i(lf1.a, "Error in Data#fromByteArray: ", e2);
            } catch (ClassNotFoundException e3) {
                bc4.k().i(lf1.a, "Error in Data#fromByteArray: ", e3);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v14, types: [java.lang.String[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Double[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Float[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Long[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Integer[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Byte[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Boolean[], java.io.Serializable] */
    public static final Serializable E(DataInputStream dataInputStream, byte b2) {
        if (b2 == 0) {
            return null;
        }
        if (b2 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b2 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b2 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b2 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b2 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b2 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b2 == 7) {
            return dataInputStream.readUTF();
        }
        int i2 = 0;
        if (b2 == 8) {
            int readInt = dataInputStream.readInt();
            ? r0 = new Boolean[readInt];
            while (i2 < readInt) {
                r0[i2] = Boolean.valueOf(dataInputStream.readBoolean());
                i2++;
            }
            return r0;
        } else if (b2 == 9) {
            int readInt2 = dataInputStream.readInt();
            ? r02 = new Byte[readInt2];
            while (i2 < readInt2) {
                r02[i2] = Byte.valueOf(dataInputStream.readByte());
                i2++;
            }
            return r02;
        } else if (b2 == 10) {
            int readInt3 = dataInputStream.readInt();
            ? r03 = new Integer[readInt3];
            while (i2 < readInt3) {
                r03[i2] = Integer.valueOf(dataInputStream.readInt());
                i2++;
            }
            return r03;
        } else if (b2 == 11) {
            int readInt4 = dataInputStream.readInt();
            ? r04 = new Long[readInt4];
            while (i2 < readInt4) {
                r04[i2] = Long.valueOf(dataInputStream.readLong());
                i2++;
            }
            return r04;
        } else if (b2 == 12) {
            int readInt5 = dataInputStream.readInt();
            ? r05 = new Float[readInt5];
            while (i2 < readInt5) {
                r05[i2] = Float.valueOf(dataInputStream.readFloat());
                i2++;
            }
            return r05;
        } else if (b2 == 13) {
            int readInt6 = dataInputStream.readInt();
            ? r06 = new Double[readInt6];
            while (i2 < readInt6) {
                r06[i2] = Double.valueOf(dataInputStream.readDouble());
                i2++;
            }
            return r06;
        } else if (b2 == 14) {
            int readInt7 = dataInputStream.readInt();
            ? r1 = new String[readInt7];
            while (i2 < readInt7) {
                String readUTF = dataInputStream.readUTF();
                if (sg3.e(readUTF, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                    readUTF = null;
                }
                r1[i2] = readUTF;
                i2++;
            }
            return r1;
        } else {
            h.s(hl6.k(b2, "Unsupported type "));
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: t16} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: t16} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: t16} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: t16} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: t16} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: t16} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: t16} */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r3 == false) goto L_0x0037;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final Object F(p16 p16) {
        as3 as3;
        Class x2;
        p16.getClass();
        Object G2 = p16.G();
        if (!(p16 instanceof u16) || !l55.r((u16) p16)) {
            Iterator it = p16.a().iterator();
            boolean z2 = false;
            t16 t16 = null;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (next.u() != qr3.z) {
                        if (z2) {
                            break;
                        }
                        z2 = true;
                        t16 = next;
                    }
                }
            }
            t16 = null;
            t16 t162 = t16;
            if (t162 != null) {
                as3 = t162.y();
            } else {
                as3 = null;
            }
            if (!(as3 == null || (x2 = l55.x(as3)) == null)) {
                return l55.n(x2, p16).invoke(G2, (Object[]) null);
            }
        }
        return G2;
    }

    public static final x83 G() {
        x83 x83 = a0;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.Call", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 f2 = pb4.f(19.23f, 15.26f, -2.54f, -0.29f);
        f2.e(-0.61f, -0.07f, -1.21f, 0.14f, -1.64f, 0.57f);
        f2.i(-1.84f, 1.84f);
        f2.e(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        f2.i(1.85f, -1.85f);
        f2.e(0.43f, -0.43f, 0.64f, -1.03f, 0.57f, -1.64f);
        f2.i(-0.29f, -2.52f);
        f2.e(-0.12f, -1.01f, -0.97f, -1.77f, -1.99f, -1.77f);
        f2.f(5.03f);
        f2.e(-1.13f, 0.0f, -2.07f, 0.94f, -2.0f, 2.07f);
        f2.e(0.53f, 8.54f, 7.36f, 15.36f, 15.89f, 15.89f);
        f2.e(1.13f, 0.07f, 2.07f, -0.87f, 2.07f, -2.0f);
        f2.n(-1.73f);
        f2.e(0.01f, -1.01f, -0.75f, -1.86f, -1.76f, -1.98f);
        f2.c();
        w83.a(w83, f2.a, ky6, 14336);
        x83 b2 = w83.b();
        a0 = b2;
        return b2;
    }

    public static final Class H(ll6 ll6) {
        String s0 = k57.s0(ll6.a(), "?", "");
        try {
            return Class.forName(s0);
        } catch (ClassNotFoundException unused) {
            while (d57.x0(s0, ".", false)) {
                Pattern compile = Pattern.compile("(\\.+)(?!.*\\.)");
                compile.getClass();
                s0 = compile.matcher(s0).replaceAll("\\$");
                s0.getClass();
                return Class.forName(s0);
            }
            String str = "Cannot find class with name \"" + ll6.a() + "\". Ensure that the serialName for this argument is the default fully qualified name";
            if (ll6.u() instanceof ql6) {
                str = str.concat(".\nIf the build is minified, try annotating the Enum class with \"androidx.annotation.Keep\" to ensure the Enum is not removed.");
            }
            h.q(str);
            return null;
        }
    }

    public static long I(Context context, int i2) {
        return uq3.c(context.getResources().getColor(i2, context.getTheme()));
    }

    public static final long J() {
        return C(uq3.d(4291176488L), uq3.d(4293227379L));
    }

    public static final long K() {
        return C(uq3.d(4279658664L), uq3.d(4284131291L));
    }

    public static final long L() {
        return C(uq3.d(4284708234L), uq3.d(4288656326L));
    }

    public static final long M() {
        int i2 = jt0.h;
        return C(jt0.c, uq3.d(4279575600L));
    }

    public static final long N() {
        return C(uq3.d(4294178553L), uq3.d(4280036924L));
    }

    public static final long O() {
        return C(uq3.d(4292666861L), uq3.d(4281090902L));
    }

    public static final long P() {
        return C(uq3.d(4279381056L), uq3.d(4293127927L));
    }

    public static final el3 Q(e81 e81) {
        el3 el3 = (el3) e81.a0(me6.E);
        if (el3 != null) {
            return el3;
        }
        ta1.l("Current context doesn't contain Job in it: ", e81);
        return null;
    }

    public static final x83 R() {
        x83 x83 = d0;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.Mic", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 e2 = pb4.e(12.0f, 14.0f);
        e2.e(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        e2.h(15.0f, 5.0f);
        e2.e(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        e2.k(9.0f, 3.34f, 9.0f, 5.0f);
        e2.n(6.0f);
        e2.e(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        e2.c();
        e2.j(17.91f, 11.0f);
        e2.e(-0.49f, 0.0f, -0.9f, 0.36f, -0.98f, 0.85f);
        e2.d(16.52f, 14.2f, 14.47f, 16.0f, 12.0f, 16.0f);
        e2.l(-4.52f, -1.8f, -4.93f, -4.15f);
        e2.e(-0.08f, -0.49f, -0.49f, -0.85f, -0.98f, -0.85f);
        e2.e(-0.61f, 0.0f, -1.09f, 0.54f, -1.0f, 1.14f);
        e2.e(0.49f, 3.0f, 2.89f, 5.35f, 5.91f, 5.78f);
        e2.h(11.0f, 20.0f);
        e2.e(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e2.l(1.0f, -0.45f, 1.0f, -1.0f);
        e2.n(-2.08f);
        e2.e(3.02f, -0.43f, 5.42f, -2.78f, 5.91f, -5.78f);
        e2.e(0.1f, -0.6f, -0.39f, -1.14f, -1.0f, -1.14f);
        e2.c();
        w83.a(w83, e2.a, ky6, 14336);
        x83 b2 = w83.b();
        d0 = b2;
        return b2;
    }

    public static final long V(long j2) {
        if (j2 < 0) {
            xb4 xb4 = u02.x;
            return u02.z;
        }
        xb4 xb42 = u02.x;
        return u02.y;
    }

    public static final mw1 W(el3 el3, boolean z2, gl3 gl3) {
        if (el3 instanceof ll3) {
            return ((ll3) el3).Y(z2, gl3);
        }
        return el3.T(gl3.r(), z2, new o0(1, gl3, gl3.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 23));
    }

    public static final boolean X(e81 e81) {
        el3 el3 = (el3) e81.a0(me6.E);
        if (el3 != null) {
            return el3.l();
        }
        return true;
    }

    public static final boolean Y(p16 p16) {
        p16.getClass();
        if (!a0(p16) || !p16.B().b().isAnnotation()) {
            return false;
        }
        return true;
    }

    public static final boolean Z(p16 p16) {
        p16.getClass();
        if (p16.G() != si0.w) {
            return true;
        }
        return false;
    }

    public static final void a(ml4 ml4, fw0 fw0, yt2 yt2, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        ml4 ml42 = ml4;
        fw0 fw02 = fw0;
        yt2 yt22 = yt2;
        int i6 = i2;
        yt22.g0(1267115836);
        if ((i6 & 6) == 0) {
            if (yt22.g(ml42)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i6;
        } else {
            i3 = i6;
        }
        if ((i6 & 48) == 0) {
            if (yt22.i(fw02)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i3 & 1, z2)) {
            t37 t37 = a40.a;
            long j2 = ((c40) yt22.k(t37)).a;
            float f2 = ((c40) yt22.k(t37)).b;
            if (jt0.c(j2, jt0.g)) {
                j2 = jt0.f;
            }
            if (lx1.b(f2, Float.NaN)) {
                f2 = 0.0f;
            }
            s87.a(ml42.d(yu6.c), (pq6) null, j2, 0, f2, 0.0f, su0.J(603195863, new x30(fw02, 0), yt22), yt22, 12582912, 106);
        } else {
            yt2.Y();
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new vi(ml42, fw02, i6, 2);
        }
    }

    public static final boolean a0(p16 p16) {
        p16.getClass();
        return sg3.e(p16.getName(), "<init>");
    }

    public static final void b(ml4 ml4, xw2 xw2, fw0 fw0, yt2 yt2, int i2) {
        int i3;
        boolean z2;
        ml4 ml42;
        ml4 ml43;
        xw2 xw22 = xw2;
        yt2 yt22 = yt2;
        yt22.g0(-1910175076);
        int i4 = i2 | 6;
        if (yt22.g(xw22)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i5 & 1, z2)) {
            yt22.a0();
            if ((i2 & 1) == 0 || yt22.C()) {
                ml43 = jl4.w;
            } else {
                yt22.Y();
                ml43 = ml4;
            }
            yt22.s();
            long j2 = xw22.a;
            long j3 = xw22.c;
            aq4 v2 = u55.v(new jt0(j2), yt22);
            aq4 v3 = u55.v(new jt0(xw22.b), yt22);
            if (jt0.c(j3, jt0.g)) {
                j3 = jt0.f;
            }
            s87.a(ml43.d(yu6.c), (pq6) null, j3, 0, 0.0f, 0.0f, su0.J(-1195710047, new y30((Object) v2, (Object) v3, (Object) fw0, 0), yt22), yt22, 12582912, 122);
            ml42 = ml43;
        } else {
            yt2.Y();
            ml42 = ml4;
        }
        yx5 v4 = yt2.v();
        if (v4 != null) {
            v4.d = new y30(i2, 8, ml42, xw22, fw0);
        }
    }

    public static byte[] b0(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
            } else {
                h.s(hl6.k(i2, "Not enough bytes to read: "));
                return null;
            }
        }
        return bArr;
    }

    public static final void c(String str, List list, vr2 vr2, yt2 yt2, int i2) {
        int i3;
        boolean z2;
        yt2 yt22;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i4;
        boolean z7;
        int i5;
        int i6;
        String str2 = str;
        List<qm2> list2 = list;
        vr2 vr22 = vr2;
        yt2 yt23 = yt2;
        int i7 = i2;
        yt23.g0(124727910);
        if ((i7 & 6) == 0) {
            if (yt23.g(str2)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i7;
        } else {
            i3 = i7;
        }
        if ((i7 & 48) == 0) {
            if ((i7 & 64) == 0) {
                z7 = yt23.g(list2);
            } else {
                z7 = yt23.i(list2);
            }
            if (z7) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i7 & 384) == 0) {
            if (yt23.i(vr22)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt23.V(i3 & 1, z2)) {
            ur urVar = new ur(6.0f, true, new h(2));
            ml4 Z2 = t49.Z(x91.L(yu6.a, 16.0f, 8.0f), t49.Y(yt23), false);
            ea6 a2 = ca6.a(urVar, xb4.H, yt23, 6);
            int hashCode = Long.hashCode(yt23.T);
            vf5 m2 = yt23.m();
            ml4 E2 = gw8.E(yt23, Z2);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt23.i0();
            if (yt23.S) {
                yt23.l(vy0);
            } else {
                yt23.r0();
            }
            g75.Q(tx0.f, yt23, a2);
            g75.Q(tx0.e, yt23, m2);
            g75.Q(tx0.g, yt23, Integer.valueOf(hashCode));
            g75.O(yt23, tx0.h);
            g75.Q(tx0.d, yt23, E2);
            if (str2 == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i8 = i3 & 896;
            if (i8 == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object Q2 = yt23.Q();
            d63 d63 = ay0.a;
            if (z4 || Q2 == d63) {
                Q2 = new zg1(3, vr22);
                yt23.o0(Q2);
            }
            yt2 yt24 = yt23;
            int i9 = i3;
            d63 d632 = d63;
            int i10 = i8;
            sp0.b(z3, (sr2) Q2, ie1.j, (ml4) null, false, (gs2) null, (pq6) null, (cj6) null, (dj6) null, (ua0) null, (tr) null, (la5) null, yt24, 384, 16376);
            yt22 = yt24;
            yt22.e0(2004279326);
            for (qm2 qm2 : list2) {
                boolean e2 = sg3.e(str2, qm2.a);
                if (i10 == 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((i9 & 14) == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean i11 = z6 | z5 | yt22.i(qm2);
                Object Q3 = yt22.Q();
                if (i11 || Q3 == d632) {
                    Q3 = new g20(vr22, str2, qm2, 5);
                    yt22.o0(Q3);
                }
                yt2 yt25 = yt2;
                sp0.b(e2, (sr2) Q3, su0.J(-1412495579, new oo2(qm2, 0), yt22), (ml4) null, false, (gs2) null, (pq6) null, (cj6) null, (dj6) null, (ua0) null, (tr) null, (la5) null, yt25, 384, 16376);
                yt22 = yt25;
            }
            yt22.r(false);
            yt22.r(true);
        } else {
            yt22 = yt23;
            yt22.Y();
        }
        yx5 v2 = yt22.v();
        if (v2 != null) {
            v2.d = new bi(i2, 10, (Object) str2, (Object) list2, (Object) vr22);
        }
    }

    public static byte[] c0(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int i5 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int read = fileInputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    i5 += inflater.inflate(bArr, i5, i3 - i5);
                    i4 += read;
                } else {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
            }
            if (i4 != i2) {
                throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
            } else if (inflater.finished()) {
                inflater.end();
                return bArr;
            } else {
                throw new IllegalStateException("Inflater did not finish");
            }
        } catch (DataFormatException e2) {
            throw new IllegalStateException(e2.getMessage());
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static final void d(tm2 tm2, vr2 vr2, sr2 sr2, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        vr2 vr22;
        float f2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        tm2 tm22 = tm2;
        vr2 vr23 = vr2;
        sr2 sr22 = sr2;
        yt2 yt22 = yt2;
        yt22.g0(-1407733752);
        if (yt22.i(tm22)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (yt22.i(vr23)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (yt22.i(sr22)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        if ((i8 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i8 & 1, z2)) {
            ml4 K2 = x91.K(b96.h(we.f(yu6.a, q96.a(10.0f)), N(), gr8.h), 10.0f);
            au0 a2 = zt0.a(wr.c, xb4.K, yt22, 0);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E2 = gw8.E(yt22, K2);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt22, a2);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt22, m2);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt22, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt22, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt22, E2);
            h80 h80 = xb4.I;
            rr rrVar = wr.a;
            ea6 a3 = ca6.a(rrVar, h80, yt22, 48);
            int hashCode2 = Long.hashCode(yt22.T);
            vf5 m3 = yt22.m();
            jl4 jl4 = jl4.w;
            int i9 = i8;
            ml4 E3 = gw8.E(yt22, jl4);
            yt22.i0();
            rr rrVar2 = rrVar;
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, a3);
            g75.Q(ckVar2, yt22, m3);
            f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
            g75.Q(ckVar4, yt22, E3);
            ck ckVar5 = ckVar2;
            String str = tm22.d;
            int i10 = tm22.h;
            long P2 = P();
            long k2 = ya5.k(12);
            ck ckVar6 = ckVar;
            am2 am2 = am2.B;
            String str2 = str;
            ce ceVar2 = ceVar;
            if (((double) 1.0f) <= 0.0d) {
                wb3.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = 1.0f;
            }
            ck ckVar7 = ckVar6;
            ck ckVar8 = ckVar5;
            ck ckVar9 = ckVar3;
            rr rrVar3 = rrVar2;
            vy0 vy02 = vy0;
            ce ceVar3 = ceVar2;
            ck ckVar10 = ckVar4;
            float f3 = 1.0f;
            int i11 = i10;
            yt2 yt23 = yt2;
            yf7.b(str2, new lz3(f2, false), P2, k2, am2, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 1, 0, (tg7) null, yt23, 1597440, 24576, 245672);
            yt2 yt24 = yt23;
            if (((double) 1.0f) <= 0.0d) {
                wb3.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f3 = Float.MAX_VALUE;
            }
            k75.a(yt24, new lz3(f3, true));
            yt2 yt25 = yt2;
            yf7.b(tm22.e, (ml4) null, L(), ya5.k(11), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt25, 24576, 0, 262122);
            yt2 yt26 = yt25;
            if (tm22.i) {
                yt26.e0(-1249042047);
                k75.a(yt26, yu6.p(jl4, 8.0f));
                yt2 yt27 = yt2;
                d83.a(bb0.m0(), l55.u(R.string.forum_delete_comment_title, yt26), h49.u(yu6.l(jl4, 16.0f), false, (String) null, sr22, 15), J(), yt27, 0, 0);
                yt26 = yt27;
                yt26.r(false);
            } else {
                yt26.e0(-1248643232);
                yt26.r(false);
            }
            yt26.r(true);
            k75.a(yt26, yu6.d(jl4, 4.0f));
            yt2 yt28 = yt2;
            yf7.b(tm22.c, (ml4) null, L(), ya5.k(13), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, ya5.k(17), 0, false, 0, 0, (tg7) null, yt28, 24576, 48, 260074);
            yt22 = yt28;
            k75.a(yt22, yu6.d(jl4, 4.0f));
            ea6 a4 = ca6.a(rrVar3, xb4.H, yt22, 0);
            int hashCode3 = Long.hashCode(yt22.T);
            vf5 m4 = yt22.m();
            ml4 E4 = gw8.E(yt22, jl4);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy02);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar7, yt22, a4);
            g75.Q(ckVar8, yt22, m4);
            f21.s(hashCode3, yt22, ckVar9, yt22, ceVar3);
            g75.Q(ckVar10, yt22, E4);
            x83 p2 = p25.p();
            long j2 = tm22.f;
            int i12 = i11;
            if (i12 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            jl4 jl42 = jl4;
            long C2 = C(uq3.d(4281236786L), uq3.d(4286695300L));
            int i13 = i9 & 112;
            if (i13 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object Q2 = yt22.Q();
            Object obj = ay0.a;
            if (z4 || Q2 == obj) {
                vr22 = vr2;
                Q2 = new zg1(6, vr22);
                yt22.o0(Q2);
            } else {
                vr22 = vr2;
            }
            Object obj2 = obj;
            s(p2, j2, z3, C2, (sr2) Q2, yt22, 0);
            k75.a(yt22, yu6.p(jl42, 12.0f));
            x83 l2 = ub5.l();
            long j3 = tm22.g;
            if (i12 == -1) {
                z5 = true;
            } else {
                z5 = false;
            }
            long J2 = J();
            if (i13 == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            Object Q3 = yt22.Q();
            if (z6 || Q3 == obj2) {
                Q3 = new zg1(7, vr22);
                yt22.o0(Q3);
            }
            s(l2, j3, z5, J2, (sr2) Q3, yt22, 0);
            yt22.r(true);
            yt22.r(true);
        } else {
            vr22 = vr23;
            yt22.Y();
        }
        yx5 v2 = yt22.v();
        if (v2 != null) {
            v2.d = new y30(i2, 16, tm22, vr22, sr22);
        }
    }

    public static long d0(InputStream inputStream, int i2) {
        byte[] b02 = b0(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += ((long) (b02[i3] & 255)) << (i3 * 8);
        }
        return j2;
    }

    public static final void e(String str, List list, boolean z2, boolean z3, vr2 vr2, gs2 gs2, vr2 vr22, sr2 sr2, yt2 yt2, int i2) {
        int i3;
        boolean z4;
        vr2 vr23;
        boolean z5;
        yt2 yt22;
        aq4 aq4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z6;
        int i10;
        int i11;
        String str2 = str;
        List list2 = list;
        vr2 vr24 = vr22;
        sr2 sr22 = sr2;
        yt2 yt23 = yt2;
        int i12 = i2;
        yt23.g0(264775641);
        if ((i12 & 6) == 0) {
            if (yt23.g(str2)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i3 = i11 | i12;
        } else {
            i3 = i12;
        }
        if ((i12 & 48) == 0) {
            if ((i12 & 64) == 0) {
                z6 = yt23.g(list2);
            } else {
                z6 = yt23.i(list2);
            }
            if (z6) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i3 |= i10;
        }
        if ((i12 & 384) == 0) {
            if (yt23.h(z2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i3 |= i9;
        } else {
            boolean z7 = z2;
        }
        if ((i12 & 3072) == 0) {
            z4 = z3;
            if (yt23.h(z4)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        } else {
            z4 = z3;
        }
        if ((i12 & 24576) == 0) {
            vr23 = vr2;
            if (yt23.i(vr23)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        } else {
            vr23 = vr2;
        }
        if ((196608 & i12) == 0) {
            if (yt23.i(gs2)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        } else {
            gs2 gs22 = gs2;
        }
        if ((1572864 & i12) == 0) {
            if (yt23.i(vr24)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i3 |= i5;
        }
        if ((12582912 & i12) == 0) {
            if (yt23.i(sr22)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i3 |= i4;
        }
        int i13 = i3;
        if ((i13 & 4793491) != 4793490) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (yt23.V(i13 & 1, z5)) {
            Object Q2 = yt23.Q();
            d63 d63 = ay0.a;
            if (Q2 == d63) {
                Q2 = u55.p("");
                yt23.o0(Q2);
            }
            aq4 aq42 = (aq4) Q2;
            Object Q3 = yt23.Q();
            if (Q3 == d63) {
                Q3 = u55.p((Object) null);
                yt23.o0(Q3);
            }
            aq4 aq43 = (aq4) Q3;
            tm2 tm2 = (tm2) aq43.getValue();
            if (tm2 == null) {
                yt23.e0(-1923342052);
                yt23.r(false);
                yt22 = yt23;
                aq4 = aq43;
            } else {
                yt23.e0(-1923342051);
                long M2 = M();
                Object Q4 = yt23.Q();
                if (Q4 == d63) {
                    Q4 = new wi(aq43, 26);
                    yt23.o0(Q4);
                }
                yt2 yt24 = yt23;
                aq4 = aq43;
                su0.a((sr2) Q4, su0.J(-1670657406, new y30((Object) vr24, (Object) tm2, aq43, 15), yt23), (ml4) null, su0.J(233006272, new ns4(aq43, 2), yt23), (gs2) null, ie1.v, ie1.w, (pq6) null, M2, 0, 0, 0, (wu1) null, yt24, 1772598, 16020);
                yt22 = yt24;
                yt22.r(false);
            }
            long M3 = M();
            fw0 J2 = su0.J(788731937, new ce4(8, sr22), yt22);
            fw0 fw0 = J2;
            fw0 J3 = su0.J(827814181, new q20(str2, 5), yt22);
            sr2 sr23 = sr2;
            su0.a(sr23, fw0, (ml4) null, (gs2) null, (gs2) null, J3, su0.J(837584742, new ro2(z4, z2, list, gs2, aq4, vr23, aq42), yt22), (pq6) null, M3, 0, 0, 0, (wu1) null, yt2, ((i13 >> 21) & 14) | 1769520, 16028);
        } else {
            yt2.Y();
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new so2(str2, list, z2, z3, vr2, gs2, vr22, sr2, i2);
        }
    }

    public static final long e0(long j2, long j3) {
        long j4 = j2 - j3;
        int i2 = (((j4 ^ j2) & (~(j4 ^ j3))) > 0 ? 1 : (((j4 ^ j2) & (~(j4 ^ j3))) == 0 ? 0 : -1));
        y02 y02 = y02.NANOSECONDS;
        if (i2 >= 0) {
            return gl0.f0(j4, y02);
        }
        y02 y022 = y02.MILLISECONDS;
        if (y02.compareTo(y022) >= 0) {
            return u02.l(V(j4));
        }
        long j5 = (j2 % 1000000) - (j3 % 1000000);
        xb4 xb4 = u02.x;
        return u02.h(gl0.f0((j2 / 1000000) - (j3 / 1000000), y022), gl0.f0(j5, y02));
    }

    public static final void f(ze7 ze7, fw0 fw0, yt2 yt2, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        yt2.g0(2080741862);
        if ((i2 & 6) == 0) {
            if (yt2.i(ze7)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (yt2.i(fw0)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(i3 & 1, z2)) {
            ar7.a(ze7, fw0, yt2, i3 & 126);
        } else {
            yt2.Y();
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new pu0(ze7, fw0, i2, 1);
        }
    }

    public static final up2 f0(up2 up2, up2 up22) {
        up2.getClass();
        vp2 vp2 = up2.a;
        up22.getClass();
        vp2 vp22 = up22.a;
        if (!up2.equals(up22) && !vp22.c()) {
            String str = vp2.a;
            String str2 = vp22.a;
            if (!k57.u0(str, str2, false) || str.charAt(str2.length()) != '.') {
                return up2;
            }
        }
        if (vp22.c()) {
            return up2;
        }
        if (up2.equals(up22)) {
            return up2.c;
        }
        return new up2(vp2.a.substring(vp22.a.length() + 1));
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:579)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:485)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004e, code lost:
        if (r7 == r8) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0050, code lost:
        r7 = new defpackage.yx6();
        r5 = new java.util.ArrayList();
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
        if (r1.hasNext() == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0064, code lost:
        r9 = r1.next();
        r10 = (defpackage.zs4) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006b, code lost:
        if (r4 == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007a, code lost:
        if (r10.D.j.E.compareTo(defpackage.k54.z) < 0) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007c, code lost:
        r5.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0080, code lost:
        r7.addAll(r5);
        r14.o0(r7);
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0086, code lost:
        r7 = (defpackage.yx6) r7;
        m(r7, (java.util.List) r0.getValue(), r14, 0);
        r10 = defpackage.u55.f(r13.b().f, r14);
        r0 = r14.Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a0, code lost:
        if (r0 != r8) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a2, code lost:
        r0 = new defpackage.yx6();
        r14.o0(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00aa, code lost:
        r4 = (defpackage.yx6) r0;
        r14.e0(-367418626);
        r7 = r7.listIterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b7, code lost:
        r0 = (defpackage.d03) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00be, code lost:
        if (r0.hasNext() == false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c0, code lost:
        r1 = (defpackage.zs4) r0.next();
        r0 = r1.x;
        r0.getClass();
        r5 = (defpackage.uu1) r0;
        r0 = r14.i(r13) | r14.i(r1);
        r11 = r14.Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00dc, code lost:
        if (r0 != false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00de, code lost:
        if (r11 != r8) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e0, code lost:
        r11 = new defpackage.f5(17, r13, r1);
        r14.o0(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ea, code lost:
        defpackage.h03.c((defpackage.sr2) r11, r5.B, defpackage.su0.J(1129586364, new defpackage.ru1(r1, r13, r3, r4, r5), r14), r14, 384);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0101, code lost:
        r14.r(false);
        r7 = (java.util.Set) r10.getValue();
        r0 = r14.g(r10) | r14.i(r13);
        r1 = r14.Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0118, code lost:
        if (r0 != false) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x011a, code lost:
        if (r1 != r8) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x011d, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x011f, code lost:
        r3 = r4;
        r0 = new defpackage.gv(r10, r13, r3, (defpackage.f61) null, 1);
        r14.o0(r0);
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x012d, code lost:
        defpackage.t49.j(r7, r3, (defpackage.gs2) r1, r14);
     */
    public static final void g(defpackage.vu1 r13, defpackage.yt2 r14, int r15) {
        /*
            r6 = r15
            r0 = 294589392(0x118f13d0, float:2.2573632E-28)
            r14.g0(r0)
            boolean r0 = r14.i(r13)
            r1 = 2
            if (r0 == 0) goto L_0x0010
            r0 = 4
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            r0 = r0 | r6
            r0 = r0 & 3
            if (r0 != r1) goto L_0x0022
            boolean r0 = r14.F()
            if (r0 != 0) goto L_0x001d
            goto L_0x0022
        L_0x001d:
            r14.Y()
            goto L_0x0132
        L_0x0022:
            pe6 r3 = defpackage.b85.q(r14)
            ft4 r0 = r13.b()
            xw5 r0 = r0.e
            aq4 r0 = defpackage.u55.f(r0, r14)
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            t37 r4 = defpackage.kd3.a
            java.lang.Object r4 = r14.k(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            boolean r5 = r14.g(r1)
            java.lang.Object r7 = r14.Q()
            d63 r8 = defpackage.ay0.a
            if (r5 != 0) goto L_0x0050
            if (r7 != r8) goto L_0x0086
        L_0x0050:
            yx6 r7 = new yx6
            r7.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x005e:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x0080
            java.lang.Object r9 = r1.next()
            r10 = r9
            zs4 r10 = (defpackage.zs4) r10
            if (r4 == 0) goto L_0x006e
            goto L_0x007c
        L_0x006e:
            bt4 r10 = r10.D
            w54 r10 = r10.j
            k54 r10 = r10.E
            k54 r11 = defpackage.k54.z
            int r10 = r10.compareTo(r11)
            if (r10 < 0) goto L_0x005e
        L_0x007c:
            r5.add(r9)
            goto L_0x005e
        L_0x0080:
            r7.addAll(r5)
            r14.o0(r7)
        L_0x0086:
            yx6 r7 = (defpackage.yx6) r7
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            r9 = 0
            m(r7, r0, r14, r9)
            ft4 r0 = r13.b()
            xw5 r0 = r0.f
            aq4 r10 = defpackage.u55.f(r0, r14)
            java.lang.Object r0 = r14.Q()
            if (r0 != r8) goto L_0x00aa
            yx6 r0 = new yx6
            r0.<init>()
            r14.o0(r0)
        L_0x00aa:
            r4 = r0
            yx6 r4 = (defpackage.yx6) r4
            r0 = -367418626(0xffffffffea19a2fe, float:-4.643384E25)
            r14.e0(r0)
            java.util.ListIterator r7 = r7.listIterator()
        L_0x00b7:
            r0 = r7
            d03 r0 = (defpackage.d03) r0
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0101
            java.lang.Object r0 = r0.next()
            r1 = r0
            zs4 r1 = (defpackage.zs4) r1
            qt4 r0 = r1.x
            r0.getClass()
            r5 = r0
            uu1 r5 = (defpackage.uu1) r5
            boolean r0 = r14.i(r13)
            boolean r11 = r14.i(r1)
            r0 = r0 | r11
            java.lang.Object r11 = r14.Q()
            if (r0 != 0) goto L_0x00e0
            if (r11 != r8) goto L_0x00ea
        L_0x00e0:
            f5 r11 = new f5
            r0 = 17
            r11.<init>(r0, r13, r1)
            r14.o0(r11)
        L_0x00ea:
            sr2 r11 = (defpackage.sr2) r11
            wu1 r12 = r5.B
            ru1 r0 = new ru1
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = 1129586364(0x43541ebc, float:212.12006)
            fw0 r0 = defpackage.su0.J(r1, r0, r14)
            r1 = 384(0x180, float:5.38E-43)
            defpackage.h03.c(r11, r12, r0, r14, r1)
            goto L_0x00b7
        L_0x0101:
            r14.r(r9)
            java.lang.Object r0 = r10.getValue()
            r7 = r0
            java.util.Set r7 = (java.util.Set) r7
            boolean r0 = r14.g(r10)
            boolean r1 = r14.i(r13)
            r0 = r0 | r1
            java.lang.Object r1 = r14.Q()
            if (r0 != 0) goto L_0x011f
            if (r1 != r8) goto L_0x011d
            goto L_0x011f
        L_0x011d:
            r3 = r4
            goto L_0x012d
        L_0x011f:
            gv r0 = new gv
            r5 = 1
            r3 = r4
            r4 = 0
            r2 = r13
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r14.o0(r0)
            r1 = r0
        L_0x012d:
            gs2 r1 = (defpackage.gs2) r1
            defpackage.t49.j(r7, r3, r1, r14)
        L_0x0132:
            yx5 r0 = r14.v()
            if (r0 == 0) goto L_0x0141
            yg r1 = new yg
            r3 = 9
            r1.<init>(r15, r3, r13)
            r0.d = r1
        L_0x0141:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r16.g(vu1, yt2, int):void");
    }

    public static byte[] g0(ce1 ce1) {
        ce1.getClass();
        HashMap hashMap = ce1.a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(hashMap.size());
                for (Map.Entry entry : hashMap.entrySet()) {
                    h0(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() <= 10240) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    dataOutputStream.close();
                    byteArray.getClass();
                    return byteArray;
                }
                throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
            } catch (Throwable th) {
                ed1.i(dataOutputStream, th);
                throw th;
            }
        } catch (IOException e2) {
            bc4.k().i(lf1.a, "Error in Data#toByteArray: ", e2);
            return new byte[0];
        }
    }

    public static final void h(mo2 mo2, vr2 vr2, vr2 vr22, sr2 sr2, vr2 vr23, vr2 vr24, gs2 gs2, vr2 vr25, gs2 gs22, vr2 vr26, sr2 sr22, gs2 gs23, vr2 vr27, gs2 gs24, sr2 sr23, is2 is2, yt2 yt2, int i2) {
        int i3;
        gs2 gs25;
        mo2 mo22;
        is2 is22;
        sr2 sr24;
        List list;
        boolean z2;
        Object obj;
        int i4;
        int i5;
        ur urVar;
        String str;
        o81 o81;
        yt2 yt22;
        aq4 aq4;
        sr2 sr25;
        String str2;
        int i6;
        vr2 vr28;
        o81 o812;
        boolean z3;
        yt2 yt23;
        o81 o813;
        boolean z4;
        boolean z5;
        Object obj2;
        boolean z6;
        boolean z7;
        List list2;
        o81 o814;
        aq4 aq42;
        aq4 aq43;
        en2 en2;
        mo2 mo23 = mo2;
        vr2 vr29 = vr22;
        sr2 sr26 = sr2;
        vr2 vr210 = vr23;
        vr2 vr211 = vr24;
        gs2 gs26 = gs2;
        vr2 vr212 = vr25;
        gs2 gs27 = gs23;
        sr2 sr27 = sr23;
        is2 is23 = is2;
        yt2 yt24 = yt2;
        int i7 = i2;
        yt24.g0(-984446959);
        if ((i7 & 6) == 0) {
            i3 = (yt24.g(mo23) ? 4 : 2) | i7;
        } else {
            i3 = i7;
        }
        int i8 = 16;
        if ((i7 & 48) == 0) {
            i3 |= yt24.i(vr2) ? 32 : 16;
        } else {
            vr2 vr213 = vr2;
        }
        int i9 = 128;
        if ((i7 & 384) == 0) {
            i3 |= yt24.i(vr29) ? 256 : 128;
        }
        int i10 = 1024;
        if ((i7 & 3072) == 0) {
            i3 |= yt24.i(sr26) ? 2048 : 1024;
        }
        int i11 = 8192;
        if ((i7 & 24576) == 0) {
            i3 |= yt24.i(vr210) ? 16384 : 8192;
        }
        int i12 = 65536;
        if ((i2 & 196608) == 0) {
            i3 |= yt24.i(vr211) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= yt24.i(gs26) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= yt24.i(vr212) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= yt24.i(gs22) ? 67108864 : 33554432;
        } else {
            gs2 gs28 = gs22;
        }
        vr2 vr214 = vr26;
        if ((i2 & 805306368) == 0) {
            i3 |= yt24.i(vr214) ? 536870912 : 268435456;
        }
        int i13 = yt24.i(sr22) ? 4 : 2;
        if (yt24.i(gs27)) {
            i8 = 32;
        }
        int i14 = i13 | i8;
        if (yt24.i(vr27)) {
            i9 = 256;
        }
        int i15 = i14 | i9;
        if (yt24.i(gs24)) {
            i10 = 2048;
        }
        int i16 = i15 | i10;
        if (yt24.i(sr27)) {
            i11 = 16384;
        }
        int i17 = i16 | i11;
        if (yt24.g(is23)) {
            i12 = 131072;
        }
        int i18 = i17 | i12;
        if (yt24.V(i3 & 1, ((i3 & 306783379) == 306783378 && (i18 & 74899) == 74898) ? false : true)) {
            Object Q2 = yt24.Q();
            Object obj3 = ay0.a;
            if (Q2 == obj3) {
                Q2 = t49.D(yt24);
                yt24.o0(Q2);
            }
            o81 o815 = (o81) Q2;
            String u2 = l55.u(R.string.forum_auth_required, yt24);
            aq4 v2 = u55.v(sr26, yt24);
            aq4 v3 = u55.v(vr210, yt24);
            s34 a2 = t34.a(0, 3, yt24);
            Object Q3 = yt24.Q();
            if (Q3 == obj3) {
                Q3 = u55.p(Boolean.FALSE);
                yt24.o0(Q3);
            }
            aq4 aq44 = (aq4) Q3;
            Object Q4 = yt24.Q();
            if (Q4 == obj3) {
                Q4 = u55.p((Object) null);
                yt24.o0(Q4);
            }
            aq4 aq45 = (aq4) Q4;
            Object Q5 = yt24.Q();
            if (Q5 == obj3) {
                Q5 = u55.p((Object) null);
                yt24.o0(Q5);
            }
            aq4 aq46 = (aq4) Q5;
            aq4 aq47 = aq45;
            n34 n34 = (n34) dt0.H0(a2.j().k);
            int i19 = n34 != null ? n34.a : -1;
            List list3 = mo23.a;
            aq4 aq48 = aq46;
            List list4 = mo23.a;
            if (list3.isEmpty() || mo23.n || mo23.m || i19 < list4.size() - 3) {
                list = list4;
                z2 = false;
                yt24.e0(-1621097071);
                yt24.r(false);
            } else {
                yt24.e0(-1621165302);
                Integer valueOf = Integer.valueOf(list4.size());
                boolean g2 = yt24.g(v2);
                Object Q6 = yt24.Q();
                if (g2 || Q6 == obj3) {
                    list = list4;
                    Q6 = new f70(v2, (f61) null, 5);
                    yt24.o0(Q6);
                } else {
                    list = list4;
                }
                t49.h((gs2) Q6, yt24, valueOf);
                z2 = false;
                yt24.r(false);
            }
            sd2 sd2 = yu6.c;
            lh4 d2 = mb0.d(xb4.y, z2);
            int hashCode = Long.hashCode(yt24.T);
            vf5 m2 = yt24.m();
            ml4 E2 = gw8.E(yt24, sd2);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt24.i0();
            int i20 = hashCode;
            if (yt24.S) {
                yt24.l(vy0);
            } else {
                yt24.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt24, d2);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt24, m2);
            Integer valueOf2 = Integer.valueOf(i20);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt24, valueOf2);
            ce ceVar = tx0.h;
            g75.O(yt24, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt24, E2);
            Object obj4 = obj3;
            String str3 = u2;
            au0 a3 = zt0.a(wr.c, xb4.K, yt24, 0);
            int hashCode2 = Long.hashCode(yt24.T);
            vf5 m3 = yt24.m();
            ml4 E3 = gw8.E(yt24, sd2);
            yt24.i0();
            sd2 sd22 = sd2;
            if (yt24.S) {
                yt24.l(vy0);
            } else {
                yt24.r0();
            }
            g75.Q(ckVar, yt24, a3);
            g75.Q(ckVar2, yt24, m3);
            f21.s(hashCode2, yt24, ckVar3, yt24, ceVar);
            g75.Q(ckVar4, yt24, E3);
            String str4 = mo23.d;
            o96 a4 = q96.a(13.0f);
            yd7 t2 = pe2.t(0, 0, N(), N(), 0, K(), O(), 0, 0, yt24, 2147477455);
            sd2 sd23 = yu6.a;
            yt2 yt25 = yt2;
            z85.b(str4, vr2, yu6.d(x91.L(sd23, 16.0f, 8.0f), 56.0f), false, false, (tg7) null, (gs2) null, ie1.a, ie1.b, (gs2) null, (gs2) null, false, (m78) null, (bt3) null, (zs3) null, true, 0, 0, a4, t2, yt25, (i3 & 112) | 113246592, 12582912, 0, 1965688);
            yt2 yt26 = yt25;
            c(mo23.c, mo23.b, vr22, yt26, i3 & 896);
            if (list.isEmpty()) {
                yt26.e0(2039084094);
                yt2 yt27 = yt26;
                yf7.b(l55.u(R.string.forum_empty, yt26), x91.K(sd23, 24.0f), L(), ya5.k(14), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt27, 24624, 0, 262120);
                yt2 yt28 = yt27;
                yt28.r(false);
                o81 = o815;
                i4 = i3;
                yt22 = yt28;
                i5 = 57344;
                obj = obj4;
                str = str3;
                gs25 = gs23;
            } else {
                yt2 yt29 = yt26;
                yt29.e0(2039458605);
                pa5 g3 = x91.g(16.0f, 0.0f, 16.0f, 88.0f, 2);
                ur urVar2 = new ur(10.0f, true, new h(2));
                String str5 = str3;
                boolean g4 = ((i3 & 14) == 4) | yt29.g(v3) | yt29.i(o815) | ((i18 & 458752) == 131072) | yt29.g(str5) | ((234881024 & i3) == 67108864) | ((1879048192 & i3) == 536870912) | ((i3 & 57344) == 16384);
                Object Q7 = yt29.Q();
                if (!g4) {
                    Object obj5 = obj4;
                    if (Q7 == obj5) {
                        obj4 = obj5;
                    } else {
                        urVar = urVar2;
                        obj = obj5;
                        str = str5;
                        i4 = i3;
                        i5 = 57344;
                        gs25 = gs23;
                        o81 = o815;
                        yt2 yt210 = yt29;
                        x91.a(sd22, a2, g3, urVar, (ib) null, (eh2) null, false, (xf) null, (vr2) Q7, yt210, 24966, 488);
                        yt22 = yt210;
                        yt22.r(false);
                    }
                }
                o81 = o815;
                urVar = urVar2;
                str = str5;
                i4 = i3;
                i5 = 57344;
                obj = obj4;
                gs25 = gs23;
                to2 to2 = new to2(mo23, v3, o81, is2, str, gs22, vr26, vr23, aq47, aq48);
                yt29.o0(to2);
                Q7 = to2;
                yt2 yt2102 = yt29;
                x91.a(sd22, a2, g3, urVar, (ib) null, (eh2) null, false, (xf) null, (vr2) Q7, yt2102, 24966, 488);
                yt22 = yt2102;
                yt22.r(false);
            }
            yt22.r(true);
            long K2 = K();
            int i21 = jt0.h;
            long j2 = jt0.c;
            ml4 O2 = x91.O(qb0.a.a(jl4.w, xb4.G), 0.0f, 0.0f, 16.0f, 76.0f, 3);
            int i22 = i4 & 14;
            int i23 = i18 & 458752;
            boolean i24 = (i22 == 4) | yt22.i(o81) | (i23 == 131072) | yt22.g(str);
            Object Q8 = yt22.Q();
            Object obj6 = obj;
            if (i24 || Q8 == obj6) {
                mo2 mo24 = mo2;
                aq4 = aq44;
                sr25 = new yf1(aq4, mo24, o81, is2, str);
                mo22 = mo24;
                yt22.o0(sr25);
            } else {
                mo22 = mo2;
                sr25 = Q8;
                aq4 = aq44;
            }
            ag8.c(sr25, O2, (pq6) null, K2, j2, (sh2) null, ie1.d, yt22, 12607488, 100);
            if (((Boolean) aq4.getValue()).booleanValue()) {
                yt22.e0(-329460175);
                List list5 = mo22.b;
                Object Q9 = yt22.Q();
                if (Q9 == obj6) {
                    Q9 = new o(20);
                    yt22.o0(Q9);
                }
                sr2 sr28 = (sr2) Q9;
                boolean z8 = (i4 & 458752) == 131072;
                Object Q10 = yt22.Q();
                if (z8 || Q10 == obj6) {
                    Q10 = new no2(vr24, aq4, 0);
                    yt22.o0(Q10);
                } else {
                    vr2 vr215 = vr24;
                }
                vr2 vr216 = (vr2) Q10;
                Object Q11 = yt22.Q();
                if (Q11 == obj6) {
                    Q11 = new wi(aq4, 23);
                    yt22.o0(Q11);
                }
                o812 = o81;
                str2 = str;
                sr2 sr29 = (sr2) Q11;
                i6 = 14;
                vr28 = vr23;
                o((en2) null, list5, (am5) null, sr28, vr216, sr29, yt22, 200070);
                z3 = false;
                yt22.r(false);
            } else {
                vr28 = vr23;
                o812 = o81;
                str2 = str;
                i6 = 14;
                z3 = false;
                yt22.e0(-329066165);
                yt22.r(false);
            }
            en2 en22 = (en2) aq47.getValue();
            if (en22 == null) {
                yt22.e0(-329029679);
                yt22.r(z3);
            } else {
                yt22.e0(-329029678);
                List list6 = mo22.b;
                am5 am5 = (am5) mo22.l.get(en22.a);
                boolean i25 = ((i4 & i5) == 16384) | yt22.i(en22);
                Object Q12 = yt22.Q();
                if (i25 || Q12 == obj6) {
                    Q12 = new f5(21, vr28, en22);
                    yt22.o0(Q12);
                }
                sr2 sr210 = (sr2) Q12;
                boolean i26 = ((i4 & 3670016) == 1048576) | yt22.i(en22);
                Object Q13 = yt22.Q();
                if (i26 || Q13 == obj6) {
                    aq43 = aq47;
                    Q13 = new g5((Object) gs2, (Object) en22, (Object) aq43, i6);
                    yt22.o0(Q13);
                } else {
                    gs2 gs29 = gs2;
                    aq43 = aq47;
                }
                vr2 vr217 = (vr2) Q13;
                Object Q14 = yt22.Q();
                if (Q14 == obj6) {
                    en2 = en22;
                    Q14 = new wi(aq43, 24);
                    yt22.o0(Q14);
                } else {
                    en2 = en22;
                }
                o(en2, list6, am5, sr210, vr217, (sr2) Q14, yt22, 196608);
                z3 = false;
                yt22.r(false);
            }
            en2 en23 = (en2) aq48.getValue();
            if (en23 == null) {
                yt22.e0(-328511173);
                yt22.r(z3);
                vr2 vr218 = vr25;
                yt23 = yt22;
            } else {
                yt22.e0(-328511172);
                long M2 = M();
                Object Q15 = yt22.Q();
                if (Q15 == obj6) {
                    aq42 = aq48;
                    Q15 = new wi(aq42, 25);
                    yt22.o0(Q15);
                } else {
                    aq42 = aq48;
                }
                yt2 yt211 = yt22;
                su0.a((sr2) Q15, su0.J(-719687550, new y30((Object) vr25, (Object) en23, aq42, 14), yt22), (ml4) null, su0.J(773496768, new ns4(aq42, 3), yt22), (gs2) null, ie1.g, su0.J(865789597, new po2(en23, 1), yt22), (pq6) null, M2, 0, 0, 0, (wu1) null, yt211, 1772598, 16020);
                yt23 = yt211;
                z3 = false;
                yt23.r(false);
            }
            String str6 = mo22.h;
            if (str6 == null) {
                yt23.e0(-327217202);
                yt23.r(z3);
                is22 = is2;
                yt24 = yt23;
                o813 = o812;
            } else {
                yt23.e0(-327217201);
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (sg3.e(((en2) obj2).a, str6)) {
                        break;
                    }
                }
                en2 en24 = (en2) obj2;
                String str7 = en24 != null ? en24.c : null;
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = str7;
                List list7 = mo22.i;
                boolean z9 = mo22.j;
                boolean z10 = mo22.e;
                boolean g5 = ((i18 & 112) == 32) | yt23.g(str6);
                Object Q16 = yt23.Q();
                if (g5 || Q16 == obj6) {
                    Q16 = new m0(20, gs25, str6);
                    yt23.o0(Q16);
                }
                vr2 vr219 = (vr2) Q16;
                String str9 = str2;
                boolean i27 = (i22 == 4) | yt23.i(o812) | (i23 == 131072) | yt23.g(str9);
                int i28 = i18;
                boolean z11 = i27 | ((i28 & 7168) == 2048);
                Object Q17 = yt23.Q();
                if (z11 || Q17 == obj6) {
                    mo2 mo25 = mo22;
                    z7 = z9;
                    z6 = z10;
                    o814 = o812;
                    list2 = list7;
                    tg1 tg1 = new tg1((Object) gs24, (Object) mo25, (Object) o814, (Object) is2, (Object) str9, 3);
                    yt23.o0(tg1);
                    Q17 = tg1;
                } else {
                    z7 = z9;
                    z6 = z10;
                    o814 = o812;
                    list2 = list7;
                }
                is22 = is2;
                o813 = o814;
                i18 = i28;
                mo22 = mo2;
                int i29 = ((i28 << 12) & 3670016) | ((i28 << 21) & 29360128);
                yt2 yt212 = yt23;
                e(str8, list2, z7, z6, vr219, (gs2) Q17, vr27, sr22, yt212, i29);
                yt24 = yt212;
                yt24.r(false);
            }
            if (sg3.e(mo22.k, Boolean.FALSE)) {
                yt24.e0(-326580740);
                String u3 = l55.u(R.string.forum_terms_must_accept, yt24);
                boolean i30 = yt24.i(o813) | (i23 == 131072) | yt24.g(u3);
                Object Q18 = yt24.Q();
                if (i30 || Q18 == obj6) {
                    z5 = false;
                    Q18 = new bp2(o813, is22, u3, 0);
                    yt24.o0(Q18);
                } else {
                    z5 = false;
                }
                z4 = true;
                sr24 = sr23;
                j(sr24, (sr2) Q18, new kb0(xb4.C, true), yt24, (i18 >> 12) & 14);
                yt24.r(z5);
            } else {
                sr24 = sr23;
                z4 = true;
                yt24.e0(-326166549);
                yt24.r(false);
            }
            yt24.r(z4);
        } else {
            gs25 = gs23;
            mo22 = mo23;
            is22 = is23;
            sr24 = sr23;
            yt24.Y();
        }
        yx5 v4 = yt24.v();
        if (v4 != null) {
            v4.d = new cp2(mo22, vr2, vr22, sr2, vr23, vr24, gs2, vr25, gs22, vr26, sr22, gs25, vr27, gs24, sr24, is22, i2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v21, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v24, resolved type: java.lang.Byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v27, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v30, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r14v0 */
    /* JADX WARNING: type inference failed for: r14v31 */
    /* JADX WARNING: type inference failed for: r14v32 */
    /* JADX WARNING: type inference failed for: r14v33 */
    /* JADX WARNING: type inference failed for: r14v34 */
    /* JADX WARNING: type inference failed for: r14v35 */
    /* JADX WARNING: type inference failed for: r14v36 */
    /* JADX WARNING: type inference failed for: r14v37 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final void h0(DataOutputStream dataOutputStream, String str, Object obj) {
        int i2;
        double d2;
        float f2;
        long j2;
        int i3;
        byte b2;
        boolean z2;
        DataOutputStream dataOutputStream2 = dataOutputStream;
        Object obj2 = obj;
        if (obj2 == null) {
            dataOutputStream2.writeByte(0);
        } else if (obj2 instanceof Boolean) {
            dataOutputStream2.writeByte(1);
            dataOutputStream2.writeBoolean(((Boolean) obj2).booleanValue());
        } else if (obj2 instanceof Byte) {
            dataOutputStream2.writeByte(2);
            dataOutputStream2.writeByte(((Number) obj2).byteValue());
        } else if (obj2 instanceof Integer) {
            dataOutputStream2.writeByte(3);
            dataOutputStream2.writeInt(((Number) obj2).intValue());
        } else if (obj2 instanceof Long) {
            dataOutputStream2.writeByte(4);
            dataOutputStream2.writeLong(((Number) obj2).longValue());
        } else if (obj2 instanceof Float) {
            dataOutputStream2.writeByte(5);
            dataOutputStream2.writeFloat(((Number) obj2).floatValue());
        } else if (obj2 instanceof Double) {
            dataOutputStream2.writeByte(6);
            dataOutputStream2.writeDouble(((Number) obj2).doubleValue());
        } else if (obj2 instanceof String) {
            dataOutputStream2.writeByte(7);
            dataOutputStream2.writeUTF((String) obj2);
        } else if (obj2 instanceof Object[]) {
            Object[] objArr = (Object[]) obj2;
            Class<?> cls = objArr.getClass();
            c26 c26 = b26.a;
            gq3 b3 = c26.b(cls);
            if (b3.equals(c26.b(Boolean[].class))) {
                i2 = 8;
            } else if (b3.equals(c26.b(Byte[].class))) {
                i2 = 9;
            } else if (b3.equals(c26.b(Integer[].class))) {
                i2 = 10;
            } else if (b3.equals(c26.b(Long[].class))) {
                i2 = 11;
            } else if (b3.equals(c26.b(Float[].class))) {
                i2 = 12;
            } else if (b3.equals(c26.b(Double[].class))) {
                i2 = 13;
            } else if (b3.equals(c26.b(String[].class))) {
                i2 = 14;
            } else {
                ta1.h("Unsupported value type ", c26.b(objArr.getClass()).l());
                return;
            }
            dataOutputStream2.writeByte(i2);
            dataOutputStream2.writeInt(objArr.length);
            for (Object obj3 : objArr) {
                String str2 = 0;
                if (i2 == 8) {
                    if (obj3 instanceof Boolean) {
                        str2 = (Boolean) obj3;
                    }
                    if (str2 != 0) {
                        z2 = str2.booleanValue();
                    } else {
                        z2 = false;
                    }
                    dataOutputStream2.writeBoolean(z2);
                } else if (i2 == 9) {
                    if (obj3 instanceof Byte) {
                        str2 = (Byte) obj3;
                    }
                    if (str2 != 0) {
                        b2 = str2.byteValue();
                    } else {
                        b2 = 0;
                    }
                    dataOutputStream2.writeByte(b2);
                } else if (i2 == 10) {
                    if (obj3 instanceof Integer) {
                        str2 = (Integer) obj3;
                    }
                    if (str2 != 0) {
                        i3 = str2.intValue();
                    } else {
                        i3 = 0;
                    }
                    dataOutputStream2.writeInt(i3);
                } else if (i2 == 11) {
                    if (obj3 instanceof Long) {
                        str2 = (Long) obj3;
                    }
                    if (str2 != 0) {
                        j2 = str2.longValue();
                    } else {
                        j2 = 0;
                    }
                    dataOutputStream2.writeLong(j2);
                } else if (i2 == 12) {
                    if (obj3 instanceof Float) {
                        str2 = (Float) obj3;
                    }
                    if (str2 != 0) {
                        f2 = str2.floatValue();
                    } else {
                        f2 = 0.0f;
                    }
                    dataOutputStream2.writeFloat(f2);
                } else if (i2 == 13) {
                    if (obj3 instanceof Double) {
                        str2 = (Double) obj3;
                    }
                    if (str2 != 0) {
                        d2 = str2.doubleValue();
                    } else {
                        d2 = 0.0d;
                    }
                    dataOutputStream2.writeDouble(d2);
                } else if (i2 == 14) {
                    if (obj3 instanceof String) {
                        str2 = (String) obj3;
                    }
                    if (str2 == 0) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream2.writeUTF(str2);
                }
            }
        } else {
            ta1.h("Unsupported value type ", b26.a.b(obj2.getClass()).A());
            return;
        }
        dataOutputStream.writeUTF(str);
    }

    public static final void i(is2 is2, np2 np2, yt2 yt2, int i2) {
        int i3;
        boolean z2;
        is2.getClass();
        yt2.g0(548696249);
        if (yt2.g(is2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2 | 16;
        if ((i4 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(i4 & 1, z2)) {
            yt2.a0();
            if ((i2 & 1) == 0 || yt2.C()) {
                a68 a2 = va4.a(yt2);
                if (a2 != null) {
                    np2 = (np2) n85.p(b26.a.b(np2.class), a2, b96.O(o85.l(a2), yt2), o85.k(a2), yt2);
                } else {
                    h.s("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            } else {
                yt2.Y();
            }
            int i5 = i4 & -113;
            yt2.s();
            sg3.c((is7) hj8.n(np2.f, yt2).getValue(), is2, su0.J(-116778400, new gc5(9, (Object) is2, (Object) np2), yt2), yt2, ((i5 << 3) & 112) | 392);
        } else {
            yt2.Y();
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new p13(is2, np2, i2, 15);
        }
    }

    public static final CharSequence i0(CharSequence charSequence) {
        if (charSequence.length() <= 5000) {
            return charSequence;
        }
        if (!Character.isHighSurrogate(charSequence.charAt(4999)) || !Character.isLowSurrogate(charSequence.charAt(5000))) {
            return d57.h1(5000, charSequence);
        }
        return d57.h1(4999, charSequence);
    }

    public static final void j(sr2 sr2, sr2 sr22, ml4 ml4, yt2 yt2, int i2) {
        int i3;
        sr2 sr23;
        boolean z2;
        float f2;
        int i4;
        int i5;
        int i6;
        ml4 ml42 = ml4;
        yt2 yt22 = yt2;
        int i7 = i2;
        yt22.g0(1378159322);
        sr2 sr24 = sr2;
        if ((i7 & 6) == 0) {
            if (yt22.i(sr24)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i7;
        } else {
            i3 = i7;
        }
        if ((i7 & 48) == 0) {
            sr23 = sr22;
            if (yt22.i(sr23)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        } else {
            sr23 = sr22;
        }
        if ((i7 & 384) == 0) {
            if (yt22.g(ml42)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i3 & 1, z2)) {
            yb5 yb5 = new yb5(Integer.valueOf(R.string.forum_terms_s1_title), Integer.valueOf(R.string.forum_terms_s1_body));
            yb5 yb52 = new yb5(Integer.valueOf(R.string.forum_terms_s2_title), Integer.valueOf(R.string.forum_terms_s2_body));
            yb5 yb53 = new yb5(Integer.valueOf(R.string.forum_terms_s3_title), Integer.valueOf(R.string.forum_terms_s3_body));
            yb5 yb54 = new yb5(Integer.valueOf(R.string.forum_terms_s4_title), Integer.valueOf(R.string.forum_terms_s4_body));
            List<yb5> E2 = sg3.E(yb5, yb52, yb53, yb54, new yb5(Integer.valueOf(R.string.forum_terms_s5_title), Integer.valueOf(R.string.forum_terms_s5_body)), new yb5(Integer.valueOf(R.string.forum_terms_s6_title), Integer.valueOf(R.string.forum_terms_s6_body)), new yb5(Integer.valueOf(R.string.forum_terms_s7_title), Integer.valueOf(R.string.forum_terms_s7_body)));
            ml4 N2 = x91.N(b96.h(ml42, M(), gr8.h), 20.0f, 12.0f, 20.0f, 88.0f);
            lh4 d2 = mb0.d(xb4.y, false);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E3 = gw8.E(yt22, N2);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt22, d2);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt22, m2);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt22, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt22, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt22, E3);
            ml4 Z2 = t49.Z(yu6.c, t49.Y(yt22), true);
            int i8 = i3;
            au0 a2 = zt0.a(wr.c, xb4.K, yt22, 0);
            int hashCode2 = Long.hashCode(yt22.T);
            vf5 m3 = yt22.m();
            ml4 E4 = gw8.E(yt22, Z2);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, a2);
            g75.Q(ckVar2, yt22, m3);
            f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
            g75.Q(ckVar4, yt22, E4);
            yt2 yt23 = yt2;
            yf7.b(l55.u(R.string.forum_terms_title, yt22), (ml4) null, P(), ya5.k(18), am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, 1597440, 0, 262058);
            yt2 yt24 = yt23;
            jl4 jl4 = jl4.w;
            jl4 jl42 = jl4;
            yt2 yt25 = yt2;
            yf7.b(pb4.j(jl4, 6.0f, yt24, R.string.forum_terms_subtitle, yt24), (ml4) null, L(), ya5.k(13), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt25, 24576, 0, 262122);
            yt2 yt26 = yt25;
            k75.a(yt26, yu6.d(jl42, 14.0f));
            yt26.e0(-1569275065);
            for (yb5 yb55 : E2) {
                int intValue = ((Number) yb55.w).intValue();
                yt2 yt27 = yt2;
                yf7.b(l55.u(intValue, yt26), (ml4) null, P(), ya5.k(14), am2.A, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt27, 1597440, 0, 262058);
                yt2 yt28 = yt27;
                yf7.b(pb4.j(jl42, 3.0f, yt28, ((Number) yb55.x).intValue(), yt28), (ml4) null, L(), ya5.k(13), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, ya5.k(18), 0, false, 0, 0, (tg7) null, yt27, 24576, 48, 260074);
                yt26 = yt27;
                k75.a(yt26, yu6.d(jl42, 12.0f));
            }
            yt26.r(false);
            ur urVar = new ur(10.0f, true, new h(2));
            ml4 M2 = x91.M(yu6.a, 0.0f, 8.0f, 1);
            ea6 a3 = ca6.a(urVar, xb4.H, yt26, 6);
            int hashCode3 = Long.hashCode(yt26.T);
            vf5 m4 = yt26.m();
            ml4 E5 = gw8.E(yt26, M2);
            ux0.d.getClass();
            vy0 vy02 = tx0.b;
            yt26.i0();
            if (yt26.S) {
                yt26.l(vy02);
            } else {
                yt26.r0();
            }
            g75.Q(tx0.f, yt26, a3);
            g75.Q(tx0.e, yt26, m4);
            g75.Q(tx0.g, yt26, Integer.valueOf(hashCode3));
            g75.O(yt26, tx0.h);
            g75.Q(tx0.d, yt26, E5);
            float f3 = 1.0f;
            if (((double) 1.0f) <= 0.0d) {
                wb3.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = 1.0f;
            }
            gw8.e(sr23, new lz3(f2, true), false, (pq6) null, (xd0) null, (la5) null, ie1.h, yt26, ((i8 >> 3) & 14) | 805306368, 508);
            pa5 pa5 = yd0.a;
            xd0 a4 = yd0.a(K(), jt0.c, 0, 0, yt2, 12);
            if (((double) 1.0f) <= 0.0d) {
                wb3.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f3 = Float.MAX_VALUE;
            }
            yt2 yt29 = yt2;
            gw8.a(sr24, new lz3(f3, true), false, (pq6) null, a4, (ce0) null, (ua0) null, (la5) null, ie1.i, yt29, (i8 & 14) | 805306368, 492);
            yt22 = yt29;
            yt22.r(true);
            yt22.r(true);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v2 = yt22.v();
        if (v2 != null) {
            v2.d = new bi(i2, 9, (Object) sr2, (Object) sr22, (Object) ml42);
        }
    }

    public static final p16 j0(p16 p16) {
        if (!Z(p16)) {
            return p16;
        }
        return p16.x(p16.B(), ((q16) p16).w);
    }

    public static final void k(x35 x35, jb jbVar, fw0 fw0, yt2 yt2, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        boolean z4;
        int i6;
        int i7 = i2;
        yt2.g0(-1090171650);
        if ((i7 & 6) == 0) {
            if ((i7 & 8) == 0) {
                z4 = yt2.g(x35);
            } else {
                z4 = yt2.i(x35);
            }
            if (z4) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i7;
        } else {
            i3 = i7;
        }
        if ((i7 & 48) == 0) {
            if (yt2.g(jbVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i7 & 384) == 0) {
            if (yt2.i(fw0)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        boolean z5 = true;
        if ((i3 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(i3 & 1, z2)) {
            if ((i3 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !yt2.g(x35))) {
                z5 = false;
            }
            boolean z6 = z3 | z5;
            Object Q2 = yt2.Q();
            if (z6 || Q2 == ay0.a) {
                Q2 = new dy2(jbVar, x35);
                yt2.o0(Q2);
            }
            vh.a((dy2) Q2, (sr2) null, new tl5(false, fi6.w, false), fw0, yt2, ((i3 << 3) & 7168) | 384, 2);
        } else {
            yt2.Y();
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new bi(i7, 0, (Object) x35, (Object) jbVar, (Object) fw0);
        }
    }

    public static void k0(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((int) ((j2 >> (i3 * 8)) & 255));
        }
        byteArrayOutputStream.write(bArr);
    }

    public static fl3 l() {
        return new fl3((el3) null);
    }

    public static void l0(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        k0(byteArrayOutputStream, (long) i2, 2);
    }

    public static final void m(List list, Collection collection, yt2 yt2, int i2) {
        int i3;
        int i4;
        yt2.g0(1537894851);
        if (yt2.i(list)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (yt2.i(collection)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        if (((i5 | i4) & 19) != 18 || !yt2.F()) {
            boolean booleanValue = ((Boolean) yt2.k(kd3.a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zs4 zs4 = (zs4) it.next();
                w54 w54 = zs4.D.j;
                boolean h2 = yt2.h(booleanValue) | yt2.i(list) | yt2.i(zs4);
                Object Q2 = yt2.Q();
                if (h2 || Q2 == ay0.a) {
                    Q2 = new pu1((Object) zs4, booleanValue, (Object) list, 0);
                    yt2.o0(Q2);
                }
                t49.e(w54, (vr2) Q2, yt2);
            }
        } else {
            yt2.Y();
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new p13(list, collection, i2, 14);
        }
    }

    public static final void n(en2 en2, am5 am5, boolean z2, vr2 vr2, sr2 sr2, sr2 sr22, sr2 sr23, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        yt2 yt22 = yt2;
        yt22.g0(50962506);
        if (yt22.i(en2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i2 | i3;
        if (yt22.g(am5)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i10 | i4;
        boolean z4 = z2;
        if (yt22.h(z4)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i12 = i11 | i5;
        vr2 vr22 = vr2;
        if (yt22.i(vr22)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i13 = i12 | i6;
        sr2 sr24 = sr2;
        if (yt22.i(sr24)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i14 = i13 | i7;
        sr2 sr25 = sr22;
        if (yt22.i(sr25)) {
            i8 = 131072;
        } else {
            i8 = 65536;
        }
        int i15 = i14 | i8;
        sr2 sr26 = sr23;
        if (yt22.i(sr26)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i16 = i15 | i9;
        if ((599187 & i16) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (yt22.V(i16 & 1, z3)) {
            we.b(yu6.a, q96.a(14.0f), rc9.w(M(), yt22, 24576), rc9.x(62, 1.0f), su0.J(-96055492, new xo2(en2, am5, sr25, z4, sr26, sr24, vr22), yt22), yt22, 196614, 16);
        } else {
            yt2.Y();
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new ei0(en2, am5, z2, vr2, sr2, sr22, sr23, i2);
        }
    }

    public static final void o(en2 en2, List list, am5 am5, sr2 sr2, vr2 vr2, sr2 sr22, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        String str;
        String str2;
        String str3;
        boolean z3;
        String str4;
        boolean z4;
        aq4 aq4;
        aq4 aq42;
        aq4 aq43;
        String str5;
        String str6;
        String str7;
        int i6;
        int i7;
        int i8;
        en2 en22 = en2;
        am5 am52 = am5;
        yt2 yt22 = yt2;
        int i9 = i2;
        yt22.g0(1317022155);
        if ((i9 & 6) == 0) {
            if (yt22.i(en22)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i9;
        } else {
            i3 = i9;
        }
        List list2 = list;
        if (yt22.g(list2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i10 = i3 | i4;
        if ((i9 & 384) == 0) {
            if (yt22.g(am52)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i10 |= i7;
        }
        sr2 sr23 = sr2;
        if ((i9 & 3072) == 0) {
            if (yt22.i(sr23)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i10 |= i6;
        }
        if (yt22.i(vr2)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i11 = i10 | i5;
        if ((74899 & i11) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i11 & 1, z2)) {
            Context context = (Context) yt22.k(ye.b);
            Object Q2 = yt22.Q();
            Object obj = ay0.a;
            if (Q2 == obj) {
                Q2 = t49.D(yt22);
                yt22.o0(Q2);
            }
            o81 o81 = (o81) Q2;
            String u2 = l55.u(R.string.forum_image_too_large, yt22);
            Object Q3 = yt22.Q();
            String str8 = "";
            if (Q3 == obj) {
                if (en22 != null) {
                    str7 = en22.c;
                } else {
                    str7 = null;
                }
                if (str7 == null) {
                    str7 = str8;
                }
                Q3 = u55.p(str7);
                yt22.o0(Q3);
            }
            aq4 aq44 = (aq4) Q3;
            Object Q4 = yt22.Q();
            if (Q4 == obj) {
                if (en22 != null) {
                    str6 = en22.d;
                } else {
                    str6 = null;
                }
                if (str6 != null) {
                    str8 = str6;
                }
                Q4 = u55.p(str8);
                yt22.o0(Q4);
            }
            aq4 aq45 = (aq4) Q4;
            Object Q5 = yt22.Q();
            if (Q5 == obj) {
                if (en22 != null) {
                    str5 = en22.b.a;
                } else {
                    str5 = null;
                }
                Q5 = u55.p(str5);
                yt22.o0(Q5);
            }
            aq4 aq46 = (aq4) Q5;
            Object Q6 = yt22.Q();
            if (Q6 == obj) {
                Q6 = u55.p(Boolean.FALSE);
                yt22.o0(Q6);
            }
            aq4 aq47 = (aq4) Q6;
            if (en22 != null) {
                str = en22.a;
            } else {
                str = null;
            }
            boolean g2 = yt22.g(str);
            Object Q7 = yt22.Q();
            if (g2 || Q7 == obj) {
                Q7 = u55.p((Object) null);
                yt22.o0(Q7);
            }
            aq4 aq48 = (aq4) Q7;
            if (en22 != null) {
                str2 = en22.a;
            } else {
                str2 = null;
            }
            boolean g3 = yt22.g(str2);
            Object Q8 = yt22.Q();
            if (g3 || Q8 == obj) {
                Q8 = u55.p(Boolean.FALSE);
                yt22.o0(Q8);
            }
            aq4 aq49 = (aq4) Q8;
            Object Q9 = yt22.Q();
            if (Q9 == obj) {
                Q9 = u55.p(Boolean.FALSE);
                yt22.o0(Q9);
            }
            aq4 aq410 = (aq4) Q9;
            Object Q10 = yt22.Q();
            if (Q10 == obj) {
                Q10 = u55.p(Boolean.FALSE);
                yt22.o0(Q10);
            }
            aq4 aq411 = (aq4) Q10;
            if (en22 != null) {
                str3 = en22.e;
            } else {
                str3 = null;
            }
            if (str3 != null || en22 == null || !en22.g || (am52 != null && !(am52 instanceof zl5))) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (en22 != null) {
                str4 = en22.e;
            } else {
                str4 = null;
            }
            if (str4 != null || en22 == null || !en22.g || !(am52 instanceof xl5)) {
                z4 = false;
            } else {
                z4 = true;
            }
            String str9 = (String) aq46.getValue();
            if (str9 == null) {
                qm2 qm2 = (qm2) dt0.y0(list2);
                if (qm2 != null) {
                    str9 = qm2.a;
                } else {
                    str9 = null;
                }
            }
            String str10 = str9;
            s8 s8Var = new s8(1);
            boolean i12 = yt22.i(o81) | yt22.i(context) | yt22.g(aq48) | yt22.g(aq49);
            Context context2 = context;
            Object Q11 = yt22.Q();
            if (i12 || Q11 == obj) {
                aq4 = aq49;
                aq4 aq412 = aq48;
                na0 na0 = new na0(o81, aq410, context2, aq412, aq4, aq411, 2);
                aq43 = aq412;
                aq42 = aq411;
                yt22.o0(na0);
                Q11 = na0;
            } else {
                aq43 = aq48;
                aq4 = aq49;
                aq42 = aq411;
            }
            se4 N2 = tf4.N(s8Var, (vr2) Q11, yt22, 0);
            long M2 = M();
            fw0 J2 = su0.J(1873211411, new xf1(vr2, str10, aq43, aq4, aq44, aq45, aq410, en22), yt22);
            fw0 J3 = su0.J(1963271701, new ce4(7, sr22), yt22);
            fw0 J4 = su0.J(2053331991, new po2(en22, 0), yt22);
            boolean z5 = z3;
            boolean z6 = z4;
            aq4 aq413 = aq45;
            String str11 = u2;
            sr2 sr24 = sr22;
            fw0 fw0 = J2;
            fw0 fw02 = J3;
            fw0 fw03 = J4;
            su0.a(sr24, fw0, (ml4) null, fw02, (gs2) null, fw03, su0.J(-49121512, new qo2(z5, z6, en22, am52, N2, str11, aq44, aq413, aq47, list2, str10, aq46, sr23, aq410, aq4, aq43, aq42), yt2), (pq6) null, M2, 0, 0, 0, (wu1) null, yt2, 1772598, 16020);
        } else {
            yt2.Y();
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new dw0((Object) en2, (Object) list, (Object) am5, (ds2) sr2, (Object) vr2, (ds2) sr22, i2, 1);
        }
    }

    public static final void p(sr2 sr2, yt2 yt2, int i2) {
        int i3;
        boolean z2;
        yt2 yt22;
        sr2 sr22;
        yt2.g0(-116249123);
        if (yt2.i(sr2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(i4 & 1, z2)) {
            sr22 = sr2;
            yt22 = yt2;
            gw8.e(sr22, (ml4) null, false, (pq6) null, (xd0) null, (la5) null, ie1.m, yt22, (i4 & 14) | 805306368, 510);
        } else {
            sr22 = sr2;
            yt22 = yt2;
            yt22.Y();
        }
        yx5 v2 = yt22.v();
        if (v2 != null) {
            v2.d = new ce4(i2, 9, sr22);
        }
    }

    public static final void q(x35 x35, boolean z2, p56 p56, boolean z3, long j2, float f2, ml4 ml4, yt2 yt2, int i2) {
        int i3;
        boolean z4;
        long j3;
        long j4;
        int i4;
        boolean z5;
        f80 f80;
        boolean z6;
        boolean z7;
        boolean z8;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z9;
        int i9;
        x35 x352 = x35;
        boolean z10 = z2;
        p56 p562 = p56;
        boolean z11 = z3;
        ml4 ml42 = ml4;
        yt2 yt22 = yt2;
        int i10 = i2;
        yt22.g0(-466280168);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                z9 = yt22.g(x352);
            } else {
                z9 = yt22.i(x352);
            }
            if (z9) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i10;
        } else {
            i3 = i10;
        }
        if ((i10 & 48) == 0) {
            if (yt22.h(z10)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i10 & 384) == 0) {
            if (yt22.e(p562.ordinal())) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i10 & 3072) == 0) {
            if (yt22.h(z11)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i10 & 24576) == 0) {
            i3 |= 8192;
        }
        if ((1572864 & i10) == 0) {
            if (yt22.g(ml42)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i3 |= i5;
        }
        if ((533651 & i3) != 533650) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (yt22.V(i3 & 1, z4)) {
            yt22.a0();
            if ((i10 & 1) == 0 || yt22.C()) {
                i4 = i3 & -57345;
                j4 = 9205357640488583168L;
            } else {
                yt22.Y();
                i4 = i3 & -57345;
                j4 = j2;
            }
            yt22.s();
            p56 p563 = p56.x;
            p56 p564 = p56.w;
            if (z10) {
                nk6 nk6 = vj6.a;
                if ((p562 != p564 || z11) && (p562 != p563 || !z11)) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                z5 = z8;
            } else {
                nk6 nk62 = vj6.a;
                if ((p562 != p564 || z11) && (p562 != p563 || !z11)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
            }
            if (z5) {
                f80 = we.b;
            } else {
                f80 = we.a;
            }
            int i11 = i4 & 14;
            if (i11 == 4 || ((i4 & 8) != 0 && yt22.i(x352))) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((i4 & 112) == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean h2 = z6 | z7 | yt22.h(z5);
            Object Q2 = yt22.Q();
            if (h2 || Q2 == ay0.a) {
                Q2 = new di(x352, z10, z5);
                yt22.o0(Q2);
            }
            long j5 = j4;
            f80 f802 = f80;
            j3 = j5;
            k(x352, f802, su0.J(1365123137, new ei((g58) yt22.k(xy0.u), j3, z5, ck6.a(ml42, false, (vr2) Q2), x352), yt22), yt22, i11 | 384);
        } else {
            yt22.Y();
            j3 = j2;
        }
        yx5 v2 = yt22.v();
        if (v2 != null) {
            v2.d = new fi(x352, z10, p562, z11, j3, f2, ml42, i10);
        }
    }

    public static final void r(ml4 ml4, sr2 sr2, boolean z2, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z3;
        int i6;
        yt2.g0(2111672474);
        if ((i2 & 6) == 0) {
            if (yt2.g(ml4)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if (yt2.i(sr2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i3 | i4;
        if (yt2.h(z2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        if ((i8 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (yt2.V(i8 & 1, z3)) {
            nk6 nk6 = vj6.a;
            k75.a(yt2, gw8.p(yu6.m(ml4, 25.0f, 25.0f), new ji(0, sr2, z2)));
        } else {
            yt2.Y();
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new ii(ml4, sr2, z2, i2);
        }
    }

    public static final void s(x83 x83, long j2, boolean z2, long j3, sr2 sr2, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        long j4;
        boolean z4 = z2;
        sr2 sr22 = sr2;
        yt2 yt22 = yt2;
        yt22.g0(-1404968551);
        x83 x832 = x83;
        if (yt22.g(x832)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (yt22.f(j2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (yt22.h(z4)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i10 = i9 | i5;
        long j5 = j3;
        if (yt22.f(j5)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i11 = i10 | i6;
        if (yt22.i(sr22)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i12 = i11 | i7;
        if ((i12 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (yt22.V(i12 & 1, z3)) {
            if (z4) {
                j4 = j5;
            } else {
                j4 = L();
            }
            h80 h80 = xb4.I;
            o96 a2 = q96.a(8.0f);
            jl4 jl4 = jl4.w;
            int i13 = i12;
            ml4 L2 = x91.L(h49.u(we.f(jl4, a2), false, (String) null, sr22, 15), 4.0f, 2.0f);
            ea6 a3 = ca6.a(wr.a, h80, yt22, 48);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E2 = gw8.E(yt22, L2);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, a3);
            g75.Q(tx0.e, yt22, m2);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E2);
            long j6 = j4;
            d83.a(x832, (String) null, yu6.l(jl4, 16.0f), j6, yt22, (i13 & 14) | 432, 0);
            k75.a(yt22, yu6.p(jl4, 4.0f));
            yt2 yt23 = yt22;
            yf7.b(String.valueOf(j2), (ml4) null, j6, ya5.k(12), am2.A, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, 1597440, 0, 262058);
            yt22 = yt23;
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v2 = yt22.v();
        if (v2 != null) {
            v2.d = new ap2(x83, j2, z4, j5, sr22, i2);
        }
    }

    public static final Object t(vo1 vo1, sr2 sr2, h61 h61) {
        vb0 vb0;
        xz4 N0;
        Object H2;
        o00 o00;
        if (((ll4) vo1).w.J) {
            ll4 ll4 = (ll4) vo1;
            if (!ll4.w.J) {
                yb3.b("visitAncestors called on an unattached node");
            }
            ll4 ll42 = ll4.w.A;
            uy3 O0 = rc9.O0(vo1);
            loop0:
            while (true) {
                vb0 = null;
                if (O0 == null) {
                    break;
                }
                if ((((ll4) O0.a0.g).z & 524288) != 0) {
                    while (ll42 != null) {
                        if ((ll42.y & 524288) != 0) {
                            ll4 ll43 = ll42;
                            eq4 eq4 = null;
                            while (ll43 != null) {
                                if (ll43 instanceof vb0) {
                                    vb0 = ll43;
                                    break loop0;
                                }
                                if ((ll43.y & 524288) != 0 && (ll43 instanceof wo1)) {
                                    int i2 = 0;
                                    for (ll4 ll44 = ((wo1) ll43).L; ll44 != null; ll44 = ll44.B) {
                                        if ((ll44.y & 524288) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                ll43 = ll44;
                                            } else {
                                                if (eq4 == null) {
                                                    eq4 = new eq4(new ll4[16]);
                                                }
                                                if (ll43 != null) {
                                                    eq4.b(ll43);
                                                    ll43 = null;
                                                }
                                                eq4.b(ll44);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                ll43 = rc9.j(eq4);
                            }
                            continue;
                        }
                        ll42 = ll42.A;
                    }
                }
                O0 = O0.v();
                if (O0 == null || (o00 = O0.a0) == null) {
                    ll42 = null;
                } else {
                    ll42 = (ib7) o00.f;
                }
            }
            vb0 vb02 = vb0;
            if (vb02 != null && (H2 = vb02.H((N0 = rc9.N0(vo1)), new ae(2, sr2, N0), h61)) == p81.w) {
                return H2;
            }
        }
        return vs7.a;
    }

    public static final void u(e81 e81, CancellationException cancellationException) {
        el3 el3 = (el3) e81.a0(me6.E);
        if (el3 != null) {
            el3.o(cancellationException);
        }
    }

    public static byte[] v(byte[] bArr) {
        DeflaterOutputStream deflaterOutputStream;
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r1 <= r6.getHeight()) goto L_0x0026;
     */
    public static final hg w(ch0 ch0, float f2) {
        ch0 ch02 = ch0;
        float f3 = f2;
        int ceil = ((int) ((float) Math.ceil((double) f3))) * 2;
        hg hgVar = gl0.A;
        od odVar = gl0.B;
        tk0 tk0 = gl0.C;
        if (!(hgVar == null || odVar == null)) {
            Bitmap bitmap = hgVar.a;
            if (ceil <= bitmap.getWidth()) {
            }
        }
        hgVar = gl0.G(ceil, ceil, 1);
        gl0.A = hgVar;
        odVar = gr8.d(hgVar);
        gl0.B = odVar;
        hg hgVar2 = hgVar;
        od odVar2 = odVar;
        if (tk0 == null) {
            tk0 = new tk0();
            gl0.C = tk0;
        }
        tk0 tk02 = tk0;
        sk0 sk0 = tk02.w;
        ey3 layoutDirection = ch02.w.getLayoutDirection();
        Bitmap bitmap2 = hgVar2.a;
        long floatToRawIntBits = (((long) Float.floatToRawIntBits((float) bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits((float) bitmap2.getHeight())) & 4294967295L);
        tp1 tp1 = sk0.a;
        ey3 ey3 = sk0.b;
        qk0 qk0 = sk0.c;
        long j2 = sk0.d;
        sk0.a = ch02;
        sk0.b = layoutDirection;
        sk0.c = odVar2;
        sk0.d = floatToRawIntBits;
        odVar2.h();
        ey3 ey32 = ey3;
        hz1.f0(tk02, jt0.b, 0, tk02.e(), 0.0f, 58);
        hz1.f0(tk02, uq3.d(4278190080L), 0, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), 0.0f, 120);
        long d2 = uq3.d(4278190080L);
        long floatToRawIntBits2 = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
        ey3 ey33 = ey32;
        tk0 tk03 = tk02;
        sk0 sk02 = sk0;
        hz1.k0(tk03, d2, f3, floatToRawIntBits2, (iz1) null, 120);
        odVar2.p();
        sk02.a = tp1;
        sk02.b = ey33;
        sk02.c = qk0;
        sk02.d = j2;
        return hgVar2;
    }

    public static final void x(e81 e81) {
        el3 el3 = (el3) e81.a0(me6.E);
        if (el3 != null && !el3.l()) {
            throw el3.E();
        }
    }

    public static final ql4 y(sl4 sl4, gq0 gq0) {
        sl4.getClass();
        gq0.getClass();
        vq0 z2 = z(sl4, gq0);
        if (z2 instanceof ql4) {
            return (ql4) z2;
        }
        return null;
    }

    public static final vq0 z(sl4 sl4, gq0 gq0) {
        sl4.getClass();
        gq0.getClass();
        if (sl4.Z(l56.a) == null) {
            v34 k0 = sl4.k0(gq0.a);
            vp2 vp2 = gq0.b.a;
            vp2.getClass();
            List f2 = vp2.f(vp2);
            oz4 oz4 = oz4.C;
            vq0 e2 = k0.C.e((uq4) dt0.w0(f2), oz4);
            if (e2 != null) {
                for (uq4 uq4 : f2.subList(1, f2.size())) {
                    if (e2 instanceof ql4) {
                        vq0 e3 = ((ql4) e2).Y().e(uq4, oz4);
                        if (e3 instanceof ql4) {
                            e2 = (ql4) e3;
                            continue;
                        } else {
                            e2 = null;
                            continue;
                        }
                        if (e2 == null) {
                        }
                    }
                }
                return e2;
            }
            return null;
        }
        ku4.a();
        return null;
    }

    public abstract int S(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int T();

    public abstract ViewPropertyAnimator U(View view, int i2);
}
