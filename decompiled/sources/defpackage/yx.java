package defpackage;

import android.content.ComponentName;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: yx  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yx implements Handler.Callback {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ yx(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: sh5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: sh5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: sh5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: android.content.ComponentName} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: android.content.ComponentName} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: android.content.ComponentName} */
    /* JADX WARNING: type inference failed for: r4v10, types: [f50, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v12, types: [com.google.android.gms.cloudmessaging.zzt, java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r1v14, types: [com.google.android.gms.cloudmessaging.zzt, java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r5v29 */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x026c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0281, code lost:
        r6.reset();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0284, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:124:0x0263, B:135:0x0279] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x026c A[Catch:{ Exception -> 0x0276, all -> 0x026c }, ExcHandler: all (r0v13 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ Exception -> 0x0276, all -> 0x026c }]), Splitter:B:124:0x0263] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02d6  */
    public final boolean handleMessage(Message message) {
        boolean z;
        n66 n66;
        n66 n662;
        Message message2 = message;
        ComponentName componentName = 0;
        switch (this.w) {
            case b85.b:
                int i = message2.what;
                ay ayVar = (ay) this.x;
                if (i != 1) {
                    return false;
                }
                ayVar.b();
                return true;
            case 1:
                nz0 nz0 = (nz0) this.x;
                wv2 wv2 = (wv2) nz0.j;
                xj0 xj0 = (xj0) nz0.b;
                int i2 = message2.what;
                if (i2 == R.id.zxing_decode) {
                    ry6 ry6 = (ry6) message2.obj;
                    Handler handler = (Handler) nz0.f;
                    long currentTimeMillis = System.currentTimeMillis();
                    Rect rect = (Rect) nz0.g;
                    ry6.d = rect;
                    m90 m90 = ry6.a;
                    int i3 = m90.b;
                    if (rect == null) {
                        z = true;
                    } else {
                        int i4 = ry6.c;
                        byte[] bArr = m90.a;
                        int i5 = m90.c;
                        if (i4 == 90) {
                            z = true;
                            byte[] bArr2 = new byte[(i3 * i5)];
                            int i6 = 0;
                            for (int i7 = 0; i7 < i3; i7++) {
                                for (int i8 = i5 - 1; i8 >= 0; i8--) {
                                    bArr2[i6] = bArr[(i8 * i3) + i7];
                                    i6++;
                                }
                            }
                            m90 = new m90(bArr2, i5, i3);
                        } else if (i4 == 180) {
                            z = true;
                            int i9 = i3 * i5;
                            byte[] bArr3 = new byte[i9];
                            int i10 = i9 - 1;
                            for (int i11 = 0; i11 < i9; i11++) {
                                bArr3[i10] = bArr[i11];
                                i10--;
                            }
                            m90 = new m90(bArr3, i3, i5);
                        } else if (i4 != 270) {
                            z = true;
                        } else {
                            int i12 = i3 * i5;
                            byte[] bArr4 = new byte[i12];
                            int i13 = i12 - 1;
                            z = true;
                            for (int i14 = 0; i14 < i3; i14++) {
                                for (int i15 = i5 - 1; i15 >= 0; i15--) {
                                    bArr4[i13] = bArr[(i15 * i3) + i14];
                                    i13--;
                                }
                            }
                            m90 = new m90(bArr4, i5, i3);
                        }
                        Rect rect2 = ry6.d;
                        byte[] bArr5 = m90.a;
                        int width = rect2.width();
                        int height = rect2.height();
                        int i16 = rect2.top;
                        byte[] bArr6 = new byte[(width * height)];
                        int i17 = m90.b;
                        int i18 = (i16 * i17) + rect2.left;
                        for (int i19 = 0; i19 < height; i19++) {
                            System.arraycopy(bArr5, i18, bArr6, i19 * width, width);
                            i18 += i17;
                        }
                        componentName = new sh5(bArr6, width, height, width, height);
                    }
                    if (componentName != null) {
                        nk1 nk1 = (nk1) nz0.e;
                        qc3 b = nk1.b(componentName);
                        mn4 mn4 = nk1.a;
                        nk1.b.clear();
                        if (mn4 != null) {
                            try {
                                if (mn4.b == null) {
                                    mn4.c((Map) null);
                                }
                                n66 = mn4.b(b);
                            } catch (Exception unused) {
                                n662 = null;
                                mn4.reset();
                                n66 = n662;
                                if (n66 != null) {
                                }
                                if (handler != null) {
                                }
                                xj0.h.post(new vj0(xj0, wv2, 0));
                                return z;
                            } catch (Throwable th) {
                            }
                        } else {
                            n662 = null;
                            mn4.c((Map) null);
                            n66 = mn4.b(b);
                        }
                        mn4.reset();
                    } else {
                        n662 = null;
                        n66 = n662;
                    }
                    if (n66 != null) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        Log.d("nz0", "Found barcode in " + (currentTimeMillis2 - currentTimeMillis) + " ms");
                        if (handler != null) {
                            ? obj = new Object();
                            obj.a = n66;
                            obj.b = ry6;
                            Message obtain = Message.obtain(handler, R.id.zxing_decode_succeeded, obj);
                            obtain.setData(new Bundle());
                            obtain.sendToTarget();
                        }
                    } else if (handler != null) {
                        Message.obtain(handler, R.id.zxing_decode_failed).sendToTarget();
                    }
                    if (handler != null) {
                        nk1 nk12 = (nk1) nz0.e;
                        nk12.getClass();
                        ArrayList arrayList = new ArrayList(nk12.b);
                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            r66 r66 = (r66) it.next();
                            Rect rect3 = ry6.d;
                            float f = (r66.a * 1.0f) + ((float) rect3.left);
                            float f2 = (r66.b * 1.0f) + ((float) rect3.top);
                            if (ry6.e) {
                                f = ((float) i3) - f;
                            }
                            arrayList2.add(new r66(f, f2));
                        }
                        Message.obtain(handler, R.id.zxing_possible_result_points, arrayList2).sendToTarget();
                    }
                    xj0.h.post(new vj0(xj0, wv2, 0));
                } else {
                    z = true;
                    if (i2 == R.id.zxing_preview_failed) {
                        xj0.h.post(new vj0(xj0, wv2, 0));
                    }
                }
                return z;
            case 2:
                if (message2.what == 0) {
                    b5 b5Var = (b5) this.x;
                    if (message2.obj != null) {
                        ku4.a();
                    } else {
                        synchronized (b5Var.a) {
                            throw null;
                        }
                    }
                }
                return false;
            case 3:
                int i20 = message2.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i20).length() + 30);
                    sb.append("Received response to request: ");
                    sb.append(i20);
                    Log.d("MessengerIpcClient", sb.toString());
                }
                r89 r89 = (r89) this.x;
                synchronized (r89) {
                    try {
                        SparseArray sparseArray = r89.A;
                        ba9 ba9 = (ba9) sparseArray.get(i20);
                        if (ba9 != null) {
                            sparseArray.remove(i20);
                            r89.d();
                            Bundle data = message2.getData();
                            if (!data.getBoolean("unsupported", false)) {
                                switch (ba9.e) {
                                    case b85.b:
                                        if (!data.getBoolean("ack", false)) {
                                            ba9.c(new Exception("Invalid response to one way request", (Throwable) null));
                                            break;
                                        } else {
                                            ba9.b((Bundle) null);
                                            break;
                                        }
                                    default:
                                        Bundle bundle = data.getBundle("data");
                                        if (bundle == null) {
                                            bundle = Bundle.EMPTY;
                                        }
                                        ba9.b(bundle);
                                        break;
                                }
                            } else {
                                ba9.c(new Exception("Not supported by GmsCore", (Throwable) null));
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i20).length() + 39);
                            sb2.append("Received response for unknown request: ");
                            sb2.append(i20);
                            Log.w("MessengerIpcClient", sb2.toString());
                        }
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                            break;
                        }
                    }
                }
                return true;
            default:
                int i21 = message2.what;
                if (i21 == 0) {
                    g99 g99 = (g99) this.x;
                    synchronized (g99.a) {
                        try {
                            h69 h69 = (h69) message2.obj;
                            k79 k79 = (k79) g99.a.get(h69);
                            if (k79 != null && k79.w.isEmpty()) {
                                if (k79.y) {
                                    h69 h692 = k79.A;
                                    g99 g992 = k79.C;
                                    g992.c.removeMessages(1, h692);
                                    g992.d.c(g992.b, k79);
                                    k79.y = false;
                                    k79.x = 2;
                                }
                                g99.a.remove(h69);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return true;
                } else if (i21 != 1) {
                    return false;
                } else {
                    g99 g993 = (g99) this.x;
                    synchronized (g993.a) {
                        try {
                            h69 h693 = (h69) message2.obj;
                            k79 k792 = (k79) g993.a.get(h693);
                            if (k792 != null && k792.x == 3) {
                                String valueOf = String.valueOf(h693);
                                StringBuilder sb3 = new StringBuilder(valueOf.length() + 47);
                                sb3.append("Timeout waiting for ServiceConnection callback ");
                                sb3.append(valueOf);
                                Log.e("GmsClientSupervisor", sb3.toString(), new Exception());
                                ComponentName componentName2 = k792.B;
                                if (componentName2 == null) {
                                    h693.getClass();
                                } else {
                                    componentName = componentName2;
                                }
                                if (componentName == 0) {
                                    String str = h693.b;
                                    z65.k(str);
                                    componentName = new ComponentName(str, "unknown");
                                }
                                k792.onServiceDisconnected(componentName);
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    return true;
                }
        }
    }
}
