package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: k68  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k68 implements l45, si6, y45, g61, y36, x77, ja9, ct {
    public static k68 z;
    public final /* synthetic */ int w;
    public Object x;
    public Object y;

    public k68(int i) {
        this.w = i;
        switch (i) {
            case 6:
                this.x = Collections.synchronizedMap(new WeakHashMap());
                this.y = Collections.synchronizedMap(new WeakHashMap());
                return;
            case 8:
                lw2 lw2 = lw2.e;
                this.x = new SparseIntArray();
                this.y = lw2;
                return;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                this.x = new HashMap();
                this.y = new sq8(6);
                sq8 sq8 = new sq8(0);
                as8 as8 = as8.B;
                ArrayList arrayList = sq8.a;
                arrayList.add(as8);
                arrayList.add(as8.C);
                arrayList.add(as8.D);
                arrayList.add(as8.E);
                arrayList.add(as8.F);
                arrayList.add(as8.G);
                arrayList.add(as8.H);
                p(sq8);
                sq8 sq82 = new sq8(1);
                as8 as82 = as8.S;
                ArrayList arrayList2 = sq82.a;
                arrayList2.add(as82);
                arrayList2.add(as8.f0);
                arrayList2.add(as8.g0);
                arrayList2.add(as8.h0);
                arrayList2.add(as8.i0);
                arrayList2.add(as8.k0);
                arrayList2.add(as8.l0);
                arrayList2.add(as8.q0);
                p(sq82);
                sq8 sq83 = new sq8(2);
                as8 as83 = as8.z;
                ArrayList arrayList3 = sq83.a;
                arrayList3.add(as83);
                arrayList3.add(as8.I);
                arrayList3.add(as8.J);
                arrayList3.add(as8.K);
                arrayList3.add(as8.P);
                arrayList3.add(as8.M);
                arrayList3.add(as8.Q);
                arrayList3.add(as8.U);
                arrayList3.add(as8.j0);
                arrayList3.add(as8.v0);
                arrayList3.add(as8.y0);
                arrayList3.add(as8.B0);
                arrayList3.add(as8.C0);
                p(sq83);
                sq8 sq84 = new sq8(3);
                as8 as84 = as8.y;
                ArrayList arrayList4 = sq84.a;
                arrayList4.add(as84);
                arrayList4.add(as8.p0);
                arrayList4.add(as8.s0);
                p(sq84);
                sq8 sq85 = new sq8(4);
                as8 as85 = as8.V;
                ArrayList arrayList5 = sq85.a;
                arrayList5.add(as85);
                arrayList5.add(as8.W);
                arrayList5.add(as8.X);
                arrayList5.add(as8.Y);
                arrayList5.add(as8.Z);
                arrayList5.add(as8.a0);
                arrayList5.add(as8.b0);
                arrayList5.add(as8.G0);
                p(sq85);
                sq8 sq86 = new sq8(5);
                as8 as86 = as8.x;
                ArrayList arrayList6 = sq86.a;
                arrayList6.add(as86);
                arrayList6.add(as8.R);
                arrayList6.add(as8.m0);
                arrayList6.add(as8.n0);
                arrayList6.add(as8.o0);
                arrayList6.add(as8.t0);
                arrayList6.add(as8.u0);
                arrayList6.add(as8.w0);
                arrayList6.add(as8.x0);
                arrayList6.add(as8.A0);
                p(sq86);
                sq8 sq87 = new sq8(7);
                as8 as87 = as8.A;
                ArrayList arrayList7 = sq87.a;
                arrayList7.add(as87);
                arrayList7.add(as8.L);
                arrayList7.add(as8.N);
                arrayList7.add(as8.O);
                arrayList7.add(as8.T);
                arrayList7.add(as8.c0);
                arrayList7.add(as8.d0);
                arrayList7.add(as8.e0);
                arrayList7.add(as8.r0);
                arrayList7.add(as8.z0);
                arrayList7.add(as8.D0);
                arrayList7.add(as8.E0);
                arrayList7.add(as8.F0);
                p(sq87);
                return;
            default:
                this.x = new eq4(new Reference[16]);
                this.y = new ReferenceQueue();
                return;
        }
    }

    public static k68 m(Context context) {
        if (z == null) {
            k68 k68 = new k68(context);
            z = k68;
            k68.x = new kw2((Context) k68.y, yf3.o, (ym) null, jw2.c);
        }
        return z;
    }

    public static s47 q(Context context, String str) {
        try {
            return new s47(context.getPackageManager().getResourcesForApplication(str), str);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 52);
            sb.append("Unable to get resources for ");
            sb.append(str);
            sb.append(", using local resources.");
            Log.w("OssLicenses", sb.toString());
            return new s47(context.getResources(), context.getPackageName());
        }
    }

    public void K(yb9 yb9) {
        ((Map) ((k68) this.y).y).remove((xb7) this.x);
    }

    public int a(int i) {
        CharSequence charSequence = (CharSequence) this.x;
        do {
            i = ((xs0) this.y).H(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    public void accept(Object obj, Object obj2) {
        int i;
        switch (this.w) {
            case 18:
                int i2 = b49.l;
                t39 t39 = new t39((xb7) obj2);
                d49 d49 = (d49) ((f49) obj).l();
                Parcel I = d49.I();
                ds8.c(I, t39);
                I.writeString((String) this.x);
                I.writeInt(0);
                I.writeStringArray((String[]) this.y);
                I.writeByteArray((byte[]) null);
                d49.J(I, 1);
                return;
            default:
                yf3 yf3 = (yf3) this.x;
                dv8 dv8 = (dv8) obj;
                t19 t19 = new t19(yf3, (xb7) obj2);
                Context context = yf3.a;
                try {
                    i = cf8.a(context).c(0, context.getPackageName()).versionCode;
                } catch (PackageManager.NameNotFoundException unused) {
                    i = 0;
                }
                o26 o26 = (o26) this.y;
                o26.B = i;
                ew8 ew8 = (ew8) dv8.l();
                mn mnVar = new mn(new dv0(-1, -1, 0, true), true);
                mnVar.y = false;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
                int i3 = dt8.a;
                obtain.writeStrongBinder(t19);
                obtain.writeInt(1);
                o26.writeToParcel(obtain, 0);
                obtain.writeInt(1);
                mnVar.writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    ew8.d.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
        }
    }

    public int b(int i) {
        do {
            i = ((xs0) this.y).Q(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.x).charAt(i - 1)));
        return i;
    }

    public Object c(yb9 yb9) {
        boolean z2 = yb9.h() instanceof UnsupportedApiCallException;
        r59 r59 = (r59) this.y;
        b49 b49 = (b49) this.x;
        if (z2) {
            return b49.c(r59.t());
        }
        if (yb9.h() instanceof ApiException) {
            ApiException apiException = (ApiException) yb9.h();
            apiException.getClass();
            if (apiException.w.w == 29514) {
                return b49.c(r59.t());
            }
        }
        return yb9;
    }

    public ListenableFuture call() {
        eb9 eb9 = (eb9) this.y;
        String valueOf = String.valueOf(eb9.a);
        hx8 hx8 = eb9.h;
        String concat = "Initialize ".concat(valueOf);
        hx8.getClass();
        cc9 b = hx8.b(concat);
        try {
            synchronized (eb9.g) {
                if (((List) this.x) == null) {
                    this.x = eb9.i;
                    eb9.i = Collections.EMPTY_LIST;
                }
            }
            ArrayList arrayList = new ArrayList(((List) this.x).size());
            ib9 ib9 = new ib9((eb9) this.y);
            for (dt apply : (List) this.x) {
                try {
                    arrayList.add(apply.apply(ib9));
                } catch (Exception e) {
                    arrayList.add(pt2.c(e));
                }
            }
            q93 s = q93.s(arrayList);
            hl4 hl4 = new hl4(3, this);
            lu0 lu0 = new lu0(s, true);
            lu0.J = new ku0(lu0, (Callable) hl4);
            lu0.s();
            b.a(lu0);
            b.close();
            return lu0;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public Object d(ia9 ia9) {
        OutputStream outputStream;
        Uri uri = ia9.d;
        AtomicLong atomicLong = ya9.a;
        int myPid = Process.myPid();
        long id = Thread.currentThread().getId();
        long currentTimeMillis = System.currentTimeMillis();
        long andIncrement = ya9.a.getAndIncrement();
        int length = String.valueOf(myPid).length();
        int length2 = String.valueOf(id).length();
        StringBuilder sb = new StringBuilder(length + 15 + length2 + 1 + String.valueOf(currentTimeMillis).length() + 1 + String.valueOf(andIncrement).length());
        sb.append(".mobstore_tmp-");
        sb.append(myPid);
        sb.append("-");
        sb.append(id);
        sb.append("-");
        sb.append(currentTimeMillis);
        sb.append("-");
        sb.append(andIncrement);
        Uri build = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(sb.toString())).build();
        za9 za9 = ia9.a;
        ArrayList a = ia9.a(za9.d(build));
        k68[] k68Arr = (k68[]) this.y;
        if (k68Arr != null) {
            k68Arr[0].o(a);
        }
        try {
            outputStream = (OutputStream) a.get(0);
            ((pk8) this.x).b(outputStream);
            k68[] k68Arr2 = (k68[]) this.y;
            if (k68Arr2 != null) {
                k68 k68 = k68Arr2[0];
                if (((ta9) k68.y) != null) {
                    ((OutputStream) k68.x).flush();
                    ((ta9) k68.y).w.getFD().sync();
                } else {
                    throw new IOException("Cannot sync underlying stream");
                }
            }
            outputStream.close();
            za9.f(build, uri);
            return null;
        } catch (Exception e) {
            try {
                za9.e(build);
            } catch (FileNotFoundException unused) {
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public int e(int i) {
        do {
            i = ((xs0) this.y).Q(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.x).charAt(i)));
        return i;
    }

    public int f(int i) {
        do {
            i = ((xs0) this.y).H(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.x).charAt(i - 1)));
        return i;
    }

    public void g(Throwable th) {
        v49 v49 = (v49) this.y;
        v49.b1();
        y19 y19 = (y19) v49.w;
        v49.E = false;
        v49.A1().add((u79) this.x);
        if (v49.F > ((Integer) by8.v0.a((Object) null)).intValue()) {
            v49.F = 1;
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.E.c(pz8.k1(y19.l().i1()), pz8.k1(th.toString()), "registerTriggerAsync failed. May try later. App ID, throwable");
            return;
        }
        pz8 pz82 = y19.B;
        y19.g(pz82);
        pz82.E.d("registerTriggerAsync failed. App ID, delay in seconds, throwable", pz8.k1(y19.l().i1()), pz8.k1(String.valueOf(v49.F)), pz8.k1(th.toString()));
        int i = v49.F;
        if (v49.G == null) {
            v49.G = new p39(v49, y19, 1);
        }
        v49.G.b(((long) i) * 1000);
        int i2 = v49.F;
        v49.F = i2 + i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008e, code lost:
        r12 = r12 ^ (((long) (r2.get(13) & 255)) << 40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009a, code lost:
        r12 = r12 ^ (((long) (r2.get(12) & 255)) << 32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a6, code lost:
        r12 = r12 ^ (((long) (r2.get(11) & 255)) << 24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b2, code lost:
        r12 = r12 ^ (((long) (r2.get(10) & 255)) << 16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00bd, code lost:
        r12 = r12 ^ (((long) (r2.get(9) & 255)) << 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c8, code lost:
        r12 = r12 ^ ((long) (r2.get(8) & 255));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d0, code lost:
        r3 = r2.getLong();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e0, code lost:
        r16 = true;
        r4 = (((long) (r2.get(5) & 255)) << 40) ^ r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00f0, code lost:
        r4 = r4 ^ (((long) (r2.get(4) & 255)) << 32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ff, code lost:
        r4 = r4 ^ (((long) (r2.get(3) & 255)) << 24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x010e, code lost:
        r4 = r4 ^ (((long) (r2.get(2) & 255)) << 16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x011c, code lost:
        r4 = r4 ^ (((long) (r2.get(1) & 255)) << (r16 ? 1 : 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0129, code lost:
        r3 = r4 ^ ((long) (r2.get(0) & 255));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0132, code lost:
        r0.d = (java.lang.Long.rotateLeft(r3 * -8663945395140668459L, 31) * 5545529020109919103L) ^ r0.d;
        r0.e ^= java.lang.Long.rotateLeft(r12 * 5545529020109919103L, 33) * -8663945395140668459L;
        r2.position(r2.limit());
     */
    public Object get() {
        boolean z2;
        long j;
        switch (this.w) {
            case 20:
                fm8 fm8 = (fm8) this.x;
                int i = uy2.a;
                int i2 = oo4.Q;
                no4 c = new no4().c(((String) this.y).getBytes());
                ByteBuffer byteBuffer = c.a;
                byteBuffer.put((byte) 0);
                if (byteBuffer.remaining() < 8) {
                    c.a();
                }
                no4 c2 = c.c("".getBytes());
                c2.a();
                ByteBuffer byteBuffer2 = c2.a;
                byteBuffer2.flip();
                if (byteBuffer2.remaining() > 0) {
                    c2.f = byteBuffer2.remaining() + c2.f;
                    long j2 = 0;
                    switch (byteBuffer2.remaining()) {
                        case 1:
                            long j3 = 0;
                            break;
                        case 2:
                            z2 = true;
                            long j4 = 0;
                            break;
                        case 3:
                            z2 = true;
                            long j5 = 0;
                            break;
                        case 4:
                            z2 = true;
                            long j6 = 0;
                            break;
                        case 5:
                            z2 = true;
                            long j7 = 0;
                            break;
                        case 6:
                            j = 0;
                            break;
                        case 7:
                            j = ((long) (byteBuffer2.get(6) & 255)) << 48;
                            break;
                        case 8:
                            break;
                        case 9:
                            break;
                        case 10:
                            break;
                        case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                            break;
                        case 12:
                            break;
                        case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                            break;
                        case 14:
                            break;
                        case h75.g:
                            j2 = ((long) (byteBuffer2.get(14) & 255)) << 48;
                            break;
                        default:
                            throw new AssertionError("Should never get here.");
                    }
                }
                long j8 = c2.d;
                long j9 = (long) c2.f;
                long j10 = j8 ^ j9;
                long j11 = j9 ^ c2.e;
                long j12 = j10 + j11;
                long j13 = j11 + j12;
                long j14 = (j12 ^ (j12 >>> 33)) * -49064778989728563L;
                long j15 = (j14 ^ (j14 >>> 33)) * -4265267296055464877L;
                long j16 = (j13 ^ (j13 >>> 33)) * -49064778989728563L;
                long j17 = (j16 ^ (j16 >>> 33)) * -4265267296055464877L;
                long j18 = j17 ^ (j17 >>> 33);
                long j19 = (j15 ^ (j15 >>> 33)) + j18;
                c2.d = j19;
                c2.e = j18 + j19;
                byte[] array = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(c2.d).putLong(c2.e).array();
                array.getClass();
                return ((t50) fm8.x).a((byte[]) array.clone());
            default:
                return ((t50) ((fm8) this.x).x).a(((vk8) this.y).v());
        }
    }

    public void h(v27 v27, or2 or2) {
        v27.getClass();
        ((qd8) this.y).a.execute(new ti(this, v27, or2, 13));
    }

    public db8 i(View view, db8 db8) {
        boolean z2;
        boolean z3;
        int i;
        int i2;
        View view2 = view;
        db8 db82 = db8;
        v70 v70 = (v70) this.x;
        d12 d12 = (d12) this.y;
        int i3 = d12.a;
        int i4 = d12.b;
        int i5 = d12.c;
        za8 za8 = db82.a;
        ad3 h = za8.h(519);
        ad3 h2 = za8.h(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) v70.y;
        int i6 = h.b;
        int i7 = h.c;
        int i8 = h.a;
        bottomSheetBehavior.w = i6;
        boolean z4 = true;
        if (view2.getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int paddingBottom = view2.getPaddingBottom();
        int paddingLeft = view2.getPaddingLeft();
        int paddingRight = view2.getPaddingRight();
        boolean z5 = bottomSheetBehavior.o;
        if (z5) {
            int a = db82.a();
            bottomSheetBehavior.v = a;
            paddingBottom = a + i5;
        }
        if (bottomSheetBehavior.p) {
            if (z2) {
                i2 = i4;
            } else {
                i2 = i3;
            }
            paddingLeft = i2 + i8;
        }
        if (bottomSheetBehavior.q) {
            if (!z2) {
                i3 = i4;
            }
            paddingRight = i3 + i7;
        }
        int i9 = paddingRight;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
        if (!bottomSheetBehavior.s || marginLayoutParams.leftMargin == i8) {
            z3 = false;
        } else {
            marginLayoutParams.leftMargin = i8;
            z3 = true;
        }
        if (bottomSheetBehavior.t && marginLayoutParams.rightMargin != i7) {
            marginLayoutParams.rightMargin = i7;
            z3 = true;
        }
        if (!bottomSheetBehavior.u || marginLayoutParams.topMargin == (i = h.b)) {
            z4 = z3;
        } else {
            marginLayoutParams.topMargin = i;
        }
        if (z4) {
            view2.setLayoutParams(marginLayoutParams);
        }
        view2.setPadding(paddingLeft, view2.getPaddingTop(), i9, paddingBottom);
        boolean z6 = v70.x;
        if (z6) {
            bottomSheetBehavior.m = h2.d;
        }
        if (!z5 && !z6) {
            return db82;
        }
        bottomSheetBehavior.I();
        return db82;
    }

    public void j(v27 v27, int i) {
        v27.getClass();
        ((qd8) this.y).a.execute(new a47((lp5) this.x, v27, false, i));
    }

    public int k(Context context, iw2 iw2) {
        int i;
        int i2;
        z65.k(context);
        z65.k(iw2);
        int i3 = iw2.i();
        SparseIntArray sparseIntArray = (SparseIntArray) this.x;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(i3, -1);
        }
        if (i != -1) {
            return i;
        }
        SparseIntArray sparseIntArray2 = (SparseIntArray) this.x;
        synchronized (sparseIntArray2) {
            i2 = 0;
            int i4 = 0;
            while (true) {
                try {
                    if (i4 >= sparseIntArray2.size()) {
                        i2 = -1;
                        break;
                    }
                    int keyAt = sparseIntArray2.keyAt(i4);
                    if (keyAt > i3 && sparseIntArray2.get(keyAt) == 0) {
                        break;
                    }
                    i4++;
                } finally {
                }
            }
            if (i2 == -1) {
                i2 = ((lw2) this.y).b(context, i3);
            }
            sparseIntArray2.put(i3, i2);
        }
        return i2;
    }

    public void l(boolean z2, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        Map map = (Map) this.x;
        synchronized (map) {
            hashMap = new HashMap(map);
        }
        Map map2 = (Map) this.y;
        synchronized (map2) {
            hashMap2 = new HashMap(map2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z2 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).c(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z2 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((xb7) entry2.getKey()).c(new ApiException(status));
            }
        }
    }

    public t79 n(int i, String str, boolean z2) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.x;
        t79 t79 = (t79) atomicReferenceArray.get(i);
        if (t79 != null) {
            return t79;
        }
        g79 t = ((rg4) this.y).t(str, z2);
        while (!atomicReferenceArray.compareAndSet(i, (Object) null, t)) {
            if (atomicReferenceArray.get(i) != null) {
                t79 t792 = (t79) atomicReferenceArray.get(i);
                t792.getClass();
                return t792;
            }
        }
        return t;
    }

    public void o(ArrayList arrayList) {
        OutputStream outputStream = (OutputStream) x91.B(arrayList);
        if (outputStream instanceof ta9) {
            this.y = (ta9) outputStream;
            this.x = (OutputStream) arrayList.get(0);
        }
    }

    public void p(sq8 sq8) {
        Iterator it = sq8.a.iterator();
        while (it.hasNext()) {
            ((HashMap) this.x).put(Integer.valueOf(((as8) it.next()).w).toString(), sq8);
        }
    }

    public bq8 r(no7 no7, bq8 bq8) {
        sq8 sq8;
        ya5.H(no7);
        if (!(bq8 instanceof gq8)) {
            return bq8;
        }
        gq8 gq8 = (gq8) bq8;
        ArrayList arrayList = gq8.x;
        String str = gq8.w;
        HashMap hashMap = (HashMap) this.x;
        if (hashMap.containsKey(str)) {
            sq8 = (sq8) hashMap.get(str);
        } else {
            sq8 = (sq8) this.y;
        }
        return sq8.a(str, no7, arrayList);
    }

    public t79 s(int i, long j, String str) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.x;
        t79 t79 = (t79) atomicReferenceArray.get(i);
        if (t79 != null) {
            return t79;
        }
        n79 n79 = new n79(str, (uw2) ((rg4) this.y).x, j);
        while (!atomicReferenceArray.compareAndSet(i, (Object) null, n79)) {
            if (atomicReferenceArray.get(i) != null) {
                t79 t792 = (t79) atomicReferenceArray.get(i);
                t792.getClass();
                return t792;
            }
        }
        return n79;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [y99, java.lang.Object] */
    public String t(String str) {
        try {
            yf3 yf3 = (yf3) this.x;
            yb9 b = yf3.b(0, new xg8(yf3, str));
            ? obj = new Object();
            obj.D = b;
            b.c(vw8.w, new n49(4, obj));
            return (String) obj.get(2, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.w("OssLicenses", "Failed to get package name from OssLicensesClient", e);
            return str;
        }
    }

    public String toString() {
        switch (this.w) {
            case 2:
                return "Bounds{lower=" + ((ad3) this.x) + " upper=" + ((ad3) this.y) + "}";
            default:
                return super.toString();
        }
    }

    public t79 u(int i, String str, String str2) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.x;
        t79 t79 = (t79) atomicReferenceArray.get(i);
        if (t79 != null) {
            return t79;
        }
        q79 q79 = new q79(str, (uw2) ((rg4) this.y).x, str2);
        while (!atomicReferenceArray.compareAndSet(i, (Object) null, q79)) {
            if (atomicReferenceArray.get(i) != null) {
                t79 t792 = (t79) atomicReferenceArray.get(i);
                t792.getClass();
                return t792;
            }
        }
        return q79;
    }

    public /* synthetic */ k68(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    public /* synthetic */ k68(int i, boolean z2) {
        this.w = i;
    }

    public /* synthetic */ k68(Object obj, boolean z2, Object obj2, int i) {
        this.w = i;
        this.x = obj2;
        this.y = obj;
    }

    public k68(pk8 pk8) {
        this.w = 28;
        this.x = pk8;
    }

    public k68(rg4 rg4, int i) {
        this.w = 24;
        this.y = rg4;
        this.x = new AtomicReferenceArray(i);
    }

    public k68(k68 k68, xb7 xb7) {
        this.w = 9;
        this.x = xb7;
        Objects.requireNonNull(k68);
        this.y = k68;
    }

    public k68(Context context) {
        this.w = 12;
        this.y = context.getApplicationContext();
    }

    public k68(IBinder iBinder) {
        this.w = 25;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.x = new Messenger(iBinder);
            this.y = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.y = new gv8(iBinder);
            this.x = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public k68(AppMeasurementSdk appMeasurementSdk, jz0 jz0) {
        this.w = 13;
        this.y = jz0;
        appMeasurementSdk.a(new yu8(0, this));
        this.x = new HashSet();
    }

    public k68(n99 n99, q99 q99) {
        this.w = 26;
        Objects.requireNonNull(n99);
        this.y = n99;
        this.x = q99;
    }

    public /* synthetic */ k68(int i, Object obj) {
        this.w = i;
        this.y = obj;
    }

    public k68(lp5 lp5, qd8 qd8) {
        this.w = 4;
        lp5.getClass();
        qd8.getClass();
        this.x = lp5;
        this.y = qd8;
    }

    public k68(WindowInsetsAnimation.Bounds bounds) {
        this.w = 2;
        this.x = ad3.c(bounds.getLowerBound());
        this.y = ad3.c(bounds.getUpperBound());
    }
}
