package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.database.SQLException;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.widget.EditText;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.perf.metrics.Trace;
import com.google.zxing.NotFoundException;
import com.wireguard.config.ParseException;
import com.wireguard.crypto.KeyFormatException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: jz0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class jz0 implements e77, zj1, h32, ct {
    public final /* synthetic */ int w;
    public Object x;
    public Object y;

    public jz0(int i) {
        this.w = i;
        switch (i) {
            case 17:
                this.x = new z38(true);
                this.y = new z38(true);
                return;
            case 23:
                this.x = new AtomicReference(f93.x);
                this.y = new wr0(21, false);
                return;
            case 24:
                this.x = new ArrayList();
                this.y = new LinkedHashMap();
                return;
            default:
                this.x = new ArrayList();
                return;
        }
    }

    public static r66 O(r66 r66, float f, float f2) {
        float f3;
        float f4;
        float f5 = r66.a;
        float f6 = r66.b;
        if (f5 < f) {
            f3 = f5 - 1.0f;
        } else {
            f3 = f5 + 1.0f;
        }
        if (f6 < f2) {
            f4 = f6 - 1.0f;
        } else {
            f4 = f6 + 1.0f;
        }
        return new r66(f3, f4);
    }

    public static r66 V(r66 r66, r66 r662, int i) {
        float f = r662.a;
        float f2 = r66.a;
        float f3 = (float) (i + 1);
        float f4 = r662.b;
        float f5 = r66.b;
        return new r66(f2 + ((f - f2) / f3), f5 + ((f4 - f5) / f3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041 A[SYNTHETIC, Splitter:B:15:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046 A[SYNTHETIC, Splitter:B:19:0x0046] */
    public static jz0 c(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException e) {
                e = e;
                fileLock = null;
                Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                if (fileLock != null) {
                }
                if (fileChannel != null) {
                }
                return null;
            }
            try {
                return new jz0(8, fileChannel, fileLock);
            } catch (IOException | Error | OverlappingFileLockException e2) {
                e = e2;
                Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                if (fileLock != null) {
                }
                if (fileChannel != null) {
                }
                return null;
            }
        } catch (IOException | Error | OverlappingFileLockException e3) {
            e = e3;
            fileChannel = null;
            fileLock = null;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException unused) {
                }
            }
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused2) {
                }
            }
            return null;
        }
    }

    public static void j(SQLException sQLException) {
        String message = sQLException.getMessage();
        if (message == null) {
            throw sQLException;
        } else if (!d57.x0(message, "unique", true) && !d57.x0(message, "2067", false) && !d57.x0(message, "1555", false)) {
            throw sQLException;
        }
    }

    public void A(bq2 bq2, boolean z) {
        bq2.getClass();
        bq2 bq22 = ((rq2) this.x).y;
        if (bq22 != null) {
            bq22.p().o.A(bq2, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.y).iterator();
        while (it.hasNext()) {
            iq2 iq2 = (iq2) it.next();
            if (z) {
                iq2.getClass();
            }
            xq2 xq2 = iq2.a;
        }
    }

    public void B(bq2 bq2, boolean z) {
        bq2.getClass();
        bq2 bq22 = ((rq2) this.x).y;
        if (bq22 != null) {
            bq22.p().o.B(bq2, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.y).iterator();
        while (it.hasNext()) {
            iq2 iq2 = (iq2) it.next();
            if (z) {
                iq2.getClass();
            }
            xq2 xq2 = iq2.a;
        }
    }

    public void C(bq2 bq2, View view, boolean z) {
        bq2.getClass();
        view.getClass();
        bq2 bq22 = ((rq2) this.x).y;
        if (bq22 != null) {
            bq22.p().o.C(bq2, view, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.y).iterator();
        while (it.hasNext()) {
            iq2 iq2 = (iq2) it.next();
            if (z) {
                iq2.getClass();
            }
            xq2 xq2 = iq2.a;
        }
    }

    public void D(bq2 bq2, boolean z) {
        bq2.getClass();
        bq2 bq22 = ((rq2) this.x).y;
        if (bq22 != null) {
            bq22.p().o.D(bq2, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.y).iterator();
        while (it.hasNext()) {
            iq2 iq2 = (iq2) it.next();
            if (z) {
                iq2.getClass();
            }
            xq2 xq2 = iq2.a;
        }
    }

    public Object E(er5 er5, Object obj) {
        int i;
        int i2;
        vs7 vs7 = (vs7) obj;
        yq3 yq3 = (yq3) this.y;
        er5.getClass();
        List h0 = er5.h0();
        h0.getClass();
        if (!h0.isEmpty()) {
            i = -1;
        } else {
            int i3 = 0;
            if (er5.P != null) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (er5.Q != null) {
                i3 = 1;
            }
            i = i2 + i3;
        }
        if (er5.B) {
            if (i == -1) {
                return new fr1(yq3, er5, fq3.j);
            }
            if (i == 0) {
                return new zq1(yq3, er5, fq3.j);
            }
            if (i == 1) {
                return new br1(yq3, er5, fq3.j);
            }
            if (i == 2) {
                return new dr1(yq3, er5, fq3.j);
            }
        } else if (i == -1) {
            return new as1(yq3, er5, fq3.j);
        } else {
            if (i == 0) {
                return new rr1(yq3, er5, fq3.j);
            }
            if (i == 1) {
                return new ur1(yq3, er5, fq3.j);
            }
            if (i == 2) {
                return new xr1(yq3, (cr5) er5, fq3.j);
            }
        }
        rf2.x("Unsupported property: ", er5);
        return null;
    }

    public Object F(xs2 xs2, Object obj) {
        vs7 vs7 = (vs7) obj;
        return new xq1((yq3) this.x, xs2);
    }

    public rb G(float f, int i, int i2, float f2) {
        int i3;
        rb b;
        rb b2;
        int i4 = (int) (f2 * f);
        int max = Math.max(0, i - i4);
        k90 k90 = (k90) this.x;
        int min = Math.min(k90.w - 1, i + i4) - max;
        float f3 = 3.0f * f;
        if (((float) min) >= f3) {
            int max2 = Math.max(0, i2 - i4);
            int min2 = Math.min(k90.x - 1, i2 + i4) - max2;
            if (((float) min2) >= f3) {
                k90 k902 = (k90) this.x;
                sb sbVar = new sb(k902, max, max2, min, min2, f, (s66) this.y);
                int i5 = sbVar.e;
                int i6 = sbVar.c;
                int i7 = i5 + i6;
                int i8 = sbVar.f;
                int i9 = (i8 / 2) + sbVar.d;
                int[] iArr = new int[3];
                for (int i10 = 0; i10 < i8; i10++) {
                    if ((i10 & 1) == 0) {
                        i3 = (i10 + 1) / 2;
                    } else {
                        i3 = -((i10 + 1) / 2);
                    }
                    int i11 = i3 + i9;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    int i12 = i6;
                    while (i12 < i7 && !k902.b(i12, i11)) {
                        i12++;
                    }
                    int i13 = 0;
                    while (i12 < i7) {
                        if (!k902.b(i12, i11)) {
                            if (i13 == 1) {
                                i13++;
                            }
                            iArr[i13] = iArr[i13] + 1;
                        } else if (i13 == 1) {
                            iArr[1] = iArr[1] + 1;
                        } else if (i13 != 2) {
                            i13++;
                            iArr[i13] = iArr[i13] + 1;
                        } else if (sbVar.a(iArr) && (b2 = sbVar.b(i11, i12, iArr)) != null) {
                            return b2;
                        } else {
                            iArr[0] = iArr[2];
                            iArr[1] = 1;
                            iArr[2] = 0;
                            i13 = 1;
                        }
                        i12++;
                    }
                    if (sbVar.a(iArr) && (b = sbVar.b(i11, i7, iArr)) != null) {
                        return b;
                    }
                }
                ArrayList arrayList = sbVar.b;
                if (!arrayList.isEmpty()) {
                    return (rb) arrayList.get(0);
                }
                throw NotFoundException.y;
            }
            throw NotFoundException.y;
        }
        throw NotFoundException.y;
    }

    public e50 H(int i) {
        e50 e50;
        e50 e502;
        e50[] e50Arr = (e50[]) this.y;
        e50 e503 = e50Arr[J(i)];
        if (e503 != null) {
            return e503;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int J = J(i) - i2;
            if (J >= 0 && (e502 = e50Arr[J]) != null) {
                return e502;
            }
            int J2 = J(i) + i2;
            if (J2 < e50Arr.length && (e50 = e50Arr[J2]) != null) {
                return e50;
            }
        }
        return null;
    }

    public Object I(ql4 ql4, Object obj) {
        return null;
    }

    public int J(int i) {
        return i - ((fb0) this.x).h;
    }

    public boolean K(r66 r66) {
        float f = r66.a;
        if (f < 0.0f) {
            return false;
        }
        k90 k90 = (k90) this.x;
        if (f >= ((float) k90.w)) {
            return false;
        }
        float f2 = r66.b;
        if (f2 <= 0.0f || f2 >= ((float) k90.x)) {
            return false;
        }
        return true;
    }

    public Object L(y95 y95, Object obj) {
        return null;
    }

    public Object M(wp0 wp0, Object obj) {
        return F(wp0, obj);
    }

    public void N() {
        String str = (String) this.x;
        if (((FileChannel) this.y) == null) {
            try {
                File file = new File(str);
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                this.y = channel;
                if (channel != null) {
                    channel.lock();
                }
            } catch (Throwable th) {
                FileChannel fileChannel = (FileChannel) this.y;
                if (fileChannel != null) {
                    fileChannel.close();
                }
                this.y = null;
                throw new IllegalStateException(f21.h("Unable to lock file: '", str, "'."), th);
            }
        }
    }

    public AutofillId P(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession m = wk0.m(this.x);
        a20 e = i75.e((View) this.y);
        Objects.requireNonNull(e);
        return dn.d(m, z10.c(e.w), j);
    }

    public void Q(int i, Bundle bundle) {
        fc fcVar;
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, (Throwable) null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            if ("clx".equals(bundle2.getString("_o"))) {
                fcVar = (wr0) this.x;
            } else {
                fcVar = (ns8) this.y;
            }
            if (fcVar != null) {
                fcVar.onEvent(string, bundle2);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0205, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ad, code lost:
        r0.c.put(java.lang.Integer.valueOf(r6.a), r6);
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0103, code lost:
        if (r6 == null) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0105, code lost:
        defpackage.i21.a(r10, r11, r6.f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0124, code lost:
        throw new java.lang.RuntimeException("XML parser error must be within a Constraint " + r11.getLineNumber());
     */
    public void R(Context context, XmlResourceParser xmlResourceParser) {
        int i;
        w21 w21 = new w21();
        int attributeCount = xmlResourceParser.getAttributeCount();
        int i2 = 0;
        while (i2 < attributeCount) {
            String attributeName = xmlResourceParser.getAttributeName(i2);
            String attributeValue = xmlResourceParser.getAttributeValue(i2);
            if (attributeName == null || attributeValue == null || !"id".equals(attributeName)) {
                i2++;
            } else {
                if (attributeValue.contains("/")) {
                    i = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i = -1;
                }
                if (i == -1) {
                    if (attributeValue.length() > 1) {
                        i = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    int eventType = xmlResourceParser.getEventType();
                    r21 r21 = null;
                    while (true) {
                        if (eventType != 1) {
                            if (eventType != 0) {
                                if (eventType == 2) {
                                    String name = xmlResourceParser.getName();
                                    switch (name.hashCode()) {
                                        case -2025855158:
                                            if (!name.equals("Layout")) {
                                                continue;
                                            } else if (r21 != null) {
                                                r21.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                                break;
                                            } else {
                                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                            }
                                        case -1984451626:
                                            if (!name.equals("Motion")) {
                                                continue;
                                            } else if (r21 != null) {
                                                r21.c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                                break;
                                            } else {
                                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                            }
                                        case -1962203927:
                                            if (!name.equals("ConstraintOverride")) {
                                                break;
                                            } else {
                                                r21 = w21.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                                break;
                                            }
                                        case -1269513683:
                                            if (!name.equals("PropertySet")) {
                                                continue;
                                            } else if (r21 != null) {
                                                r21.b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                                break;
                                            } else {
                                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                            }
                                        case -1238332596:
                                            if (!name.equals("Transform")) {
                                                continue;
                                            } else if (r21 != null) {
                                                r21.e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                                break;
                                            } else {
                                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                            }
                                        case -71750448:
                                            if (!name.equals("Guideline")) {
                                                break;
                                            } else {
                                                r21 = w21.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                                r21.d.a = true;
                                                break;
                                            }
                                        case 366511058:
                                            if (!name.equals("CustomMethod")) {
                                                continue;
                                            }
                                        case 1331510167:
                                            if (!name.equals("Barrier")) {
                                                break;
                                            } else {
                                                r21 = w21.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                                r21.d.g0 = 1;
                                                break;
                                            }
                                        case 1791837707:
                                            if (!name.equals("CustomAttribute")) {
                                                continue;
                                            }
                                        case 1803088381:
                                            if (!name.equals("Constraint")) {
                                                break;
                                            } else {
                                                r21 = w21.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                                break;
                                            }
                                    }
                                } else if (eventType == 3) {
                                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                                    switch (lowerCase.hashCode()) {
                                        case -2075718416:
                                            if (!lowerCase.equals("guideline")) {
                                                continue;
                                            }
                                        case -190376483:
                                            if (!lowerCase.equals("constraint")) {
                                                continue;
                                            }
                                        case 426575017:
                                            if (!lowerCase.equals("constraintoverride")) {
                                                continue;
                                            }
                                        case 2146106725:
                                            if (lowerCase.equals("constraintset")) {
                                                break;
                                            } else {
                                                continue;
                                            }
                                        default:
                                            continue;
                                    }
                                }
                            } else {
                                xmlResourceParser.getName();
                            }
                            eventType = xmlResourceParser.next();
                        }
                    }
                } catch (XmlPullParserException e) {
                    e.printStackTrace();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                ((SparseArray) this.y).put(i, w21);
                return;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0067, code lost:
        if (r3.equals("allowedips") == false) goto L_0x003e;
     */
    public void S(ArrayList arrayList) {
        Optional optional;
        o9 o9Var = new o9(11);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            char c = 1;
            zt ztVar = (zt) zt.a((CharSequence) it.next()).orElseThrow(new jf3(1));
            String str = ztVar.a;
            String str2 = ztVar.b;
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            lowerCase.getClass();
            switch (lowerCase.hashCode()) {
                case -1371213673:
                    if (lowerCase.equals("presharedkey")) {
                        c = 0;
                        break;
                    }
                case -1336650364:
                    break;
                case 1446930262:
                    if (lowerCase.equals("publickey")) {
                        c = 2;
                        break;
                    }
                case 1741102485:
                    if (lowerCase.equals("endpoint")) {
                        c = 3;
                        break;
                    }
                case 2043986865:
                    if (lowerCase.equals("persistentkeepalive")) {
                        c = 4;
                        break;
                    }
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case b85.b:
                    try {
                        o9Var.A = Optional.of(ns3.c(str2));
                        break;
                    } catch (KeyFormatException e) {
                        throw new Exception(e);
                    }
                case 1:
                    try {
                        for (String a : zt.d.split(str2)) {
                            ((LinkedHashSet) o9Var.x).add(hb3.a(a));
                        }
                        break;
                    } catch (ParseException e2) {
                        throw new Exception(e2);
                    }
                case 2:
                    try {
                        o9Var.B = ns3.c(str2);
                        break;
                    } catch (KeyFormatException e3) {
                        throw new Exception(e3);
                    }
                case 3:
                    try {
                        o9Var.y = Optional.of(gb3.b(str2));
                        break;
                    } catch (ParseException e4) {
                        throw new Exception(e4);
                    }
                case 4:
                    try {
                        int parseInt = Integer.parseInt(str2);
                        if (parseInt >= 0 && parseInt <= 65535) {
                            if (parseInt == 0) {
                                optional = Optional.empty();
                            } else {
                                optional = Optional.of(Integer.valueOf(parseInt));
                            }
                            o9Var.z = optional;
                            break;
                        } else {
                            String.valueOf(parseInt);
                            throw new Exception((Throwable) null);
                        }
                    } catch (NumberFormatException e5) {
                        throw new Exception(e5);
                    }
                    break;
                default:
                    throw new Exception((Throwable) null);
            }
        }
        if (((ns3) o9Var.B) != null) {
            ((ArrayList) this.x).add(new gf5(o9Var));
            return;
        }
        throw new Exception((Throwable) null);
    }

    public void T() {
        try {
            ((FileLock) this.y).release();
            ((FileChannel) this.x).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public void U(yr3 yr3, Object obj) {
        yr3.getClass();
        if (!((ps1) this.y).a) {
            this.x = obj;
        } else {
            h.s("Cannot modify readonly DescriptorRendererOptions");
        }
    }

    public float W(int i, int i2, int i3, int i4) {
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        jz0 jz0;
        boolean z2;
        boolean z3 = true;
        if (Math.abs(i4 - i2) > Math.abs(i3 - i)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i7 = i;
            i8 = i2;
            i5 = i3;
            i6 = i4;
        } else {
            i8 = i;
            i7 = i2;
            i6 = i3;
            i5 = i4;
        }
        int abs = Math.abs(i6 - i8);
        int abs2 = Math.abs(i5 - i7);
        int i14 = 2;
        int i15 = (-abs) / 2;
        int i16 = -1;
        if (i8 < i6) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        if (i7 < i5) {
            i16 = 1;
        }
        int i17 = i6 + i9;
        int i18 = i8;
        int i19 = i7;
        int i20 = 0;
        while (true) {
            if (i18 == i17) {
                i10 = i14;
                break;
            }
            if (z) {
                i11 = i19;
            } else {
                i11 = i18;
            }
            if (z) {
                i12 = i18;
            } else {
                i12 = i19;
            }
            boolean z4 = z;
            if (i20 == z3) {
                z2 = z3;
                i13 = abs;
                jz0 = this;
            } else {
                z2 = false;
                jz0 = this;
                i13 = abs;
            }
            if (z2 == ((k90) jz0.x).b(i11, i12)) {
                if (i20 == 2) {
                    return bb0.g0(i18, i19, i8, i7);
                }
                i20++;
            }
            i15 += abs2;
            if (i15 > 0) {
                if (i19 == i5) {
                    i10 = 2;
                    break;
                }
                i19 += i16;
                i15 -= i13;
            }
            i18 += i9;
            abs = i13;
            z = z4;
            z3 = true;
            i14 = 2;
        }
        if (i20 == i10) {
            return bb0.g0(i17, i5, i8, i7);
        }
        return Float.NaN;
    }

    public float X(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        k90 k90 = (k90) this.x;
        float W = W(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = ((float) i) / ((float) (i - i5));
            i5 = 0;
        } else {
            int i7 = k90.w;
            if (i5 >= i7) {
                int i8 = i7 - 1;
                f = ((float) ((i7 - 1) - i)) / ((float) (i5 - i));
                i5 = i8;
            } else {
                f = 1.0f;
            }
        }
        float f3 = (float) i2;
        int i9 = (int) (f3 - (((float) (i4 - i2)) * f));
        if (i9 < 0) {
            f2 = f3 / ((float) (i2 - i9));
        } else {
            int i10 = k90.x;
            if (i9 >= i10) {
                f2 = ((float) ((i10 - 1) - i2)) / ((float) (i9 - i2));
                i6 = i10 - 1;
            } else {
                i6 = i9;
                f2 = 1.0f;
            }
        }
        return (W(i, i2, (int) ((((float) (i5 - i)) * f2) + ((float) i)), i6) + W) - 1.0f;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.concurrent.Executor, java.lang.Object, java.util.concurrent.atomic.AtomicReference, e82] */
    /* JADX WARNING: type inference failed for: r1v0, types: [ho7, com.google.common.util.concurrent.ListenableFuture, x1, java.lang.Object, java.lang.Runnable] */
    public ListenableFuture Y(ct ctVar, Executor executor) {
        executor.getClass();
        ? atomicReference = new AtomicReference(d82.w);
        atomicReference.x = executor;
        atomicReference.w = this;
        jz0 jz0 = new jz0(22, atomicReference, ctVar);
        Object obj = new Object();
        ListenableFuture listenableFuture = (ListenableFuture) ((AtomicReference) this.x).getAndSet(obj);
        ? obj2 = new Object();
        obj2.E = new go7((ho7) obj2, (ct) jz0);
        listenableFuture.a(obj2, atomicReference);
        ListenableFuture e = pt2.e(obj2);
        a70 a70 = new a70((Object) obj2, obj, (Object) listenableFuture, (Object) e, (Object) atomicReference, 2);
        fv1 fv1 = fv1.w;
        e.a(a70, fv1);
        obj2.a(a70, fv1);
        return e;
    }

    public int Z(r66 r66, r66 r662) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        k90 k90 = (k90) this.x;
        int i6 = (int) r66.a;
        int i7 = (int) r66.b;
        int i8 = (int) r662.a;
        int i9 = (int) r662.b;
        int i10 = 0;
        int i11 = 1;
        if (Math.abs(i9 - i7) > Math.abs(i8 - i6)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i12 = i6;
            i6 = i7;
            i7 = i12;
            int i13 = i8;
            i8 = i9;
            i9 = i13;
        }
        int abs = Math.abs(i8 - i6);
        int abs2 = Math.abs(i9 - i7);
        int i14 = (-abs) / 2;
        if (i7 < i9) {
            i = 1;
        } else {
            i = -1;
        }
        if (i6 >= i8) {
            i11 = -1;
        }
        if (z) {
            i2 = i7;
        } else {
            i2 = i6;
        }
        if (z) {
            i3 = i6;
        } else {
            i3 = i7;
        }
        boolean b = k90.b(i2, i3);
        while (i6 != i8) {
            if (z) {
                i4 = i7;
            } else {
                i4 = i6;
            }
            if (z) {
                i5 = i6;
            } else {
                i5 = i7;
            }
            boolean b2 = k90.b(i4, i5);
            if (b2 != b) {
                i10++;
                b = b2;
            }
            i14 += abs2;
            if (i14 > 0) {
                if (i7 == i9) {
                    return i10;
                }
                i7 += i;
                i14 -= abs;
            }
            i6 += i11;
        }
        return i10;
    }

    public Object a() {
        return (gt7) this.x;
    }

    public void a0(ua6 ua6, ArrayList arrayList) {
        ua6.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                ((pd8) this.x).v(ua6, next);
            } catch (SQLException e) {
                j(e);
                ((ar7) this.y).A(ua6, next);
            }
        }
    }

    public boolean b(CharSequence charSequence, int i, int i2, tq7 tq7) {
        Spannable spannable;
        if ((tq7.c & 4) > 0) {
            return true;
        }
        if (((gt7) this.x) == null) {
            if (charSequence instanceof Spannable) {
                spannable = (Spannable) charSequence;
            } else {
                spannable = new SpannableString(charSequence);
            }
            this.x = new gt7(spannable);
        }
        ((kw5) this.y).getClass();
        ((gt7) this.x).setSpan(new uq7(tq7), i, i2, 33);
        return true;
    }

    public void b0(int i, xs0 xs0) {
        Iterator it = (Iterator) this.x;
        while (true) {
            Map.Entry entry = (Map.Entry) this.y;
            if (entry != null && ((xu2) entry.getKey()).w < i) {
                xu2 xu2 = (xu2) ((Map.Entry) this.y).getKey();
                Object value = ((Map.Entry) this.y).getValue();
                pc2 pc2 = pc2.c;
                rc8 rc8 = xu2.x;
                int i2 = xu2.w;
                if (xu2.y) {
                    for (Object next : (List) value) {
                        if (rc8 == rc8.GROUP) {
                            xs0.h0(i2, 3);
                            ((k2) next).f(xs0);
                            xs0.h0(i2, 4);
                        } else {
                            xs0.h0(i2, rc8.x);
                            pc2.k(xs0, rc8, next);
                        }
                    }
                } else if (rc8 == rc8.GROUP) {
                    xs0.h0(i2, 3);
                    ((k2) value).f(xs0);
                    xs0.h0(i2, 4);
                } else {
                    xs0.h0(i2, rc8.x);
                    pc2.k(xs0, rc8, value);
                }
                if (it.hasNext()) {
                    this.y = (Map.Entry) it.next();
                } else {
                    this.y = null;
                }
            } else {
                return;
            }
        }
    }

    public ListenableFuture call() {
        int i = e82.A;
        if (((e82) this.x).compareAndSet(d82.w, d82.y)) {
            return ((ct) this.y).call();
        }
        d93 d93 = d93.D;
        if (d93 != null) {
            return d93;
        }
        return new d93();
    }

    public Object d(fr5 fr5, Object obj) {
        return F(fr5, obj);
    }

    public Object e(h28 h28, Object obj) {
        return null;
    }

    public Object f(r3 r3Var, Object obj) {
        return null;
    }

    public Object g(qz3 qz3, Object obj) {
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: lg7} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [h22] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    public hf7 h(List list) {
        long j;
        ? r1 = 0;
        try {
            int size = list.size();
            int i = 0;
            h22 h22 = null;
            while (i < size) {
                try {
                    h22 h222 = (h22) list.get(i);
                    try {
                        h222.a((i22) this.y);
                        i++;
                        h22 = h222;
                    } catch (Exception e) {
                        e = e;
                        r1 = h222;
                        StringBuilder sb = new StringBuilder();
                        int y2 = ((xs0) ((i22) this.y).B).y();
                        lg7 c = ((i22) this.y).c();
                        i22 i22 = (i22) this.y;
                        sb.append("Error while applying EditCommand batch to buffer (length=" + y2 + ", composition=" + c + ", selection=" + lg7.h(i95.a(i22.x, i22.y)) + "):");
                        sb.append(10);
                        dt0.D0(list, sb, "\n", (String) null, (String) null, new gg0((h22) r1, this), 60);
                        throw new RuntimeException(sb.toString(), e);
                    }
                } catch (Exception e2) {
                    e = e2;
                    r1 = h22;
                    StringBuilder sb2 = new StringBuilder();
                    int y22 = ((xs0) ((i22) this.y).B).y();
                    lg7 c2 = ((i22) this.y).c();
                    i22 i222 = (i22) this.y;
                    sb2.append("Error while applying EditCommand batch to buffer (length=" + y22 + ", composition=" + c2 + ", selection=" + lg7.h(i95.a(i222.x, i222.y)) + "):");
                    sb2.append(10);
                    dt0.D0(list, sb2, "\n", (String) null, (String) null, new gg0((h22) r1, this), 60);
                    throw new RuntimeException(sb2.toString(), e);
                }
            }
            i22 i223 = (i22) this.y;
            i223.getClass();
            vl vlVar = new vl(((xs0) i223.B).toString());
            i22 i224 = (i22) this.y;
            long a = i95.a(i224.x, i224.y);
            lg7 lg7 = new lg7(a);
            if (!lg7.g(((hf7) this.x).b)) {
                r1 = lg7;
            }
            if (r1 != 0) {
                j = r1.a;
            } else {
                j = i95.a(lg7.e(a), lg7.f(a));
            }
            hf7 hf7 = new hf7(vlVar, j, ((i22) this.y).c());
            this.x = hf7;
            return hf7;
        } catch (Exception e3) {
            e = e3;
            StringBuilder sb22 = new StringBuilder();
            int y222 = ((xs0) ((i22) this.y).B).y();
            lg7 c22 = ((i22) this.y).c();
            i22 i2222 = (i22) this.y;
            sb22.append("Error while applying EditCommand batch to buffer (length=" + y222 + ", composition=" + c22 + ", selection=" + lg7.h(i95.a(i2222.x, i2222.y)) + "):");
            sb22.append(10);
            dt0.D0(list, sb22, "\n", (String) null, (String) null, new gg0((h22) r1, this), 60);
            throw new RuntimeException(sb22.toString(), e);
        }
    }

    public float i(de2 de2, de2 de22) {
        int i = (int) de2.b;
        int i2 = (int) de22.b;
        float X = X((int) de2.a, i, (int) de22.a, i2);
        float X2 = X((int) de22.a, i2, (int) de2.a, i);
        if (Float.isNaN(X)) {
            return X2 / 7.0f;
        }
        if (Float.isNaN(X2)) {
            return X / 7.0f;
        }
        return (X + X2) / 14.0f;
    }

    public Object k(jr5 jr5, Object obj) {
        return F(jr5, obj);
    }

    public void l() {
        String str = (String) this.x;
        try {
            md2 md2 = (md2) this.y;
            md2.getClass();
            new File((File) md2.d, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    public void m(bq2 bq2, boolean z) {
        bq2.getClass();
        bq2 bq22 = ((rq2) this.x).y;
        if (bq22 != null) {
            bq22.p().o.m(bq2, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.y).iterator();
        while (it.hasNext()) {
            iq2 iq2 = (iq2) it.next();
            if (z) {
                iq2.getClass();
            }
            xq2 xq2 = iq2.a;
        }
    }

    public void n(bq2 bq2, boolean z) {
        bq2.getClass();
        rq2 rq2 = (rq2) this.x;
        eq2 eq2 = rq2.w.M;
        bq2 bq22 = rq2.y;
        if (bq22 != null) {
            bq22.p().o.n(bq2, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.y).iterator();
        while (it.hasNext()) {
            iq2 iq2 = (iq2) it.next();
            if (z) {
                iq2.getClass();
            }
            xq2 xq2 = iq2.a;
        }
    }

    public void o(bq2 bq2, boolean z) {
        bq2.getClass();
        bq2 bq22 = ((rq2) this.x).y;
        if (bq22 != null) {
            bq22.p().o.o(bq2, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.y).iterator();
        while (it.hasNext()) {
            iq2 iq2 = (iq2) it.next();
            if (z) {
                iq2.getClass();
            }
            xq2 xq2 = iq2.a;
        }
    }

    public void p(bq2 bq2, boolean z) {
        bq2.getClass();
        bq2 bq22 = ((rq2) this.x).y;
        if (bq22 != null) {
            bq22.p().o.p(bq2, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.y).iterator();
        while (it.hasNext()) {
            iq2 iq2 = (iq2) it.next();
            if (z) {
                iq2.getClass();
            }
            xq2 xq2 = iq2.a;
        }
    }

    public yb9 q(Object obj) {
        Boolean bool = (Boolean) obj;
        k91 k91 = (k91) this.y;
        if (!bool.booleanValue()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", (Throwable) null);
            }
            md2 md2 = k91.g;
            for (File delete : md2.f(((File) md2.d).listFiles(k91.r))) {
                delete.delete();
            }
            md2 md22 = ((wa1) k91.m.y).b;
            wa1.a(md2.f(((File) md22.f).listFiles()));
            wa1.a(md2.f(((File) md22.g).listFiles()));
            wa1.a(md2.f(((File) md22.h).listFiles()));
            k91.q.d((Object) null);
            return b35.l((Object) null);
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Sending cached crash reports...", (Throwable) null);
        }
        boolean booleanValue = bool.booleanValue();
        ge1 ge1 = k91.b;
        if (booleanValue) {
            ((xb7) ge1.A).d((Object) null);
            return ((yb9) this.x).l((ya1) k91.e.x, new ns8(13, (Object) this));
        }
        ge1.getClass();
        h.s("An invalid data collection token was used.");
        return null;
    }

    public void r(bq2 bq2, boolean z) {
        bq2.getClass();
        bq2 bq22 = ((rq2) this.x).y;
        if (bq22 != null) {
            bq22.p().o.r(bq2, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.y).iterator();
        while (it.hasNext()) {
            iq2 iq2 = (iq2) it.next();
            if (z) {
                iq2.getClass();
            }
            xq2 xq2 = iq2.a;
        }
    }

    public void s(bq2 bq2, boolean z) {
        n75 n75;
        bq2.getClass();
        bq2 bq22 = ((rq2) this.x).y;
        if (bq22 != null) {
            bq22.p().o.s(bq2, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.y).iterator();
        while (it.hasNext()) {
            iq2 iq2 = (iq2) it.next();
            if (z) {
                iq2.getClass();
            }
            xq2 xq2 = iq2.a;
            rg rgVar = xq2.f;
            rgVar.b("FragmentMonitor %s.onFragmentPaused ", bq2.getClass().getSimpleName());
            WeakHashMap weakHashMap = xq2.a;
            if (!weakHashMap.containsKey(bq2)) {
                rgVar.g("FragmentMonitor: missed a fragment trace from %s", bq2.getClass().getSimpleName());
            } else {
                Trace trace = (Trace) weakHashMap.get(bq2);
                weakHashMap.remove(bq2);
                fr2 fr2 = xq2.e;
                HashMap hashMap = fr2.c;
                rg rgVar2 = fr2.e;
                if (!fr2.d) {
                    rgVar2.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
                    n75 = new n75();
                } else if (!hashMap.containsKey(bq2)) {
                    rgVar2.b("Sub-recording associated with key %s was not started or does not exist", bq2.getClass().getSimpleName());
                    n75 = new n75();
                } else {
                    er2 er2 = (er2) hashMap.remove(bq2);
                    n75 a = fr2.a();
                    if (!a.b()) {
                        rgVar2.b("stopFragment(%s): snapshot() failed", bq2.getClass().getSimpleName());
                        n75 = new n75();
                    } else {
                        er2 er22 = (er2) a.a();
                        n75 = new n75(new er2(er22.a - er2.a, er22.b - er2.b, er22.c - er2.c));
                    }
                }
                if (!n75.b()) {
                    rgVar.g("onFragmentPaused: recorder failed to trace %s", bq2.getClass().getSimpleName());
                } else {
                    ug6.a(trace, (er2) n75.a());
                    trace.stop();
                }
            }
        }
    }

    public Object t(v34 v34, Object obj) {
        return null;
    }

    public String toString() {
        switch (this.w) {
            case 12:
                return "ObservableProperty(value=" + this.x + ')';
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                Formatter formatter = new Formatter();
                try {
                    int i = 0;
                    for (e50 e50 : (e50[]) this.y) {
                        if (e50 == null) {
                            formatter.format("%3d:    |   %n", new Object[]{Integer.valueOf(i)});
                            i++;
                        } else {
                            formatter.format("%3d: %3d|%3d%n", new Object[]{Integer.valueOf(i), Integer.valueOf(e50.f), Integer.valueOf(e50.e)});
                            i++;
                        }
                    }
                    String formatter2 = formatter.toString();
                    formatter.close();
                    return formatter2;
                } catch (Throwable th) {
                    try {
                        formatter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 22:
                return ((ct) this.y).toString();
            default:
                return super.toString();
        }
    }

    public Object u(ut1 ut1, Object obj) {
        return null;
    }

    public void v(bq2 bq2, boolean z) {
        bq2.getClass();
        rq2 rq2 = (rq2) this.x;
        eq2 eq2 = rq2.w.M;
        bq2 bq22 = rq2.y;
        if (bq22 != null) {
            bq22.p().o.v(bq2, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.y).iterator();
        while (it.hasNext()) {
            iq2 iq2 = (iq2) it.next();
            if (z) {
                iq2.getClass();
            }
            xq2 xq2 = iq2.a;
        }
    }

    public void w(bq2 bq2, boolean z) {
        bq2.getClass();
        bq2 bq22 = ((rq2) this.x).y;
        if (bq22 != null) {
            bq22.p().o.w(bq2, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.y).iterator();
        while (it.hasNext()) {
            iq2 iq2 = (iq2) it.next();
            if (z) {
                iq2.getClass();
            }
            xq2 xq2 = iq2.a;
        }
    }

    public Object x(tl4 tl4, Object obj) {
        return null;
    }

    public void y(bq2 bq2, boolean z) {
        String str;
        bq2.getClass();
        bq2 bq22 = ((rq2) this.x).y;
        if (bq22 != null) {
            bq22.p().o.y(bq2, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.y).iterator();
        while (it.hasNext()) {
            iq2 iq2 = (iq2) it.next();
            if (z) {
                iq2.getClass();
            }
            xq2 xq2 = iq2.a;
            xq2.f.b("FragmentMonitor %s.onFragmentResumed", bq2.getClass().getSimpleName());
            Trace trace = new Trace("_st_".concat(bq2.getClass().getSimpleName()), xq2.c, xq2.b, xq2.d);
            trace.start();
            bq2 bq23 = bq2.S;
            if (bq23 == null) {
                str = "No parent";
            } else {
                str = bq23.getClass().getSimpleName();
            }
            trace.putAttribute("Parent_fragment", str);
            if (bq2.l() != null) {
                trace.putAttribute("Hosting_activity", bq2.l().getClass().getSimpleName());
            }
            xq2.a.put(bq2, trace);
            fr2 fr2 = xq2.e;
            HashMap hashMap = fr2.c;
            rg rgVar = fr2.e;
            if (!fr2.d) {
                rgVar.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            } else if (hashMap.containsKey(bq2)) {
                rgVar.b("Cannot start sub-recording because one is already ongoing with the key %s", bq2.getClass().getSimpleName());
            } else {
                n75 a = fr2.a();
                if (!a.b()) {
                    rgVar.b("startFragment(%s): snapshot() failed", bq2.getClass().getSimpleName());
                } else {
                    hashMap.put(bq2, (er2) a.a());
                }
            }
        }
    }

    public void z(bq2 bq2, Bundle bundle, boolean z) {
        bq2.getClass();
        bq2 bq22 = ((rq2) this.x).y;
        if (bq22 != null) {
            bq22.p().o.z(bq2, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.y).iterator();
        while (it.hasNext()) {
            iq2 iq2 = (iq2) it.next();
            if (z) {
                iq2.getClass();
            }
            xq2 xq2 = iq2.a;
        }
    }

    public /* synthetic */ jz0(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    public /* synthetic */ jz0(int i, boolean z) {
        this.w = i;
    }

    public /* synthetic */ jz0(Object obj, boolean z, Object obj2, int i) {
        this.w = i;
        this.y = obj;
        this.x = obj2;
    }

    public jz0(yq3 yq3) {
        this.w = 7;
        yq3.getClass();
        this.x = yq3;
        this.y = yq3;
    }

    public jz0(rq2 rq2) {
        this.w = 27;
        this.x = rq2;
        this.y = new CopyOnWriteArrayList();
    }

    public jz0(fb0 fb0) {
        this.w = 13;
        this.x = new fb0(fb0);
        this.y = new e50[((fb0.i - fb0.h) + 1)];
    }

    public jz0(String str) {
        this.w = 25;
        this.x = str.concat(".lck");
    }

    public jz0(k90 k90, int i) {
        this.w = i;
        switch (i) {
            case h75.g:
                this.x = k90;
                return;
            default:
                this.x = k90;
                this.y = new u88(k90);
                return;
        }
    }

    public jz0(String str, Set set) {
        this.w = 11;
        str.getClass();
        this.x = str;
        this.y = set;
    }

    public jz0(oe2 oe2, we2 we2, wz0 wz0, qz0 qz0, Context context, String str, d01 d01, ScheduledExecutorService scheduledExecutorService) {
        this.w = 1;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.x = linkedHashSet;
        this.y = new a01(oe2, we2, wz0, qz0, context, str, linkedHashSet, d01, scheduledExecutorService);
    }

    public /* synthetic */ jz0(int i, Object obj) {
        this.w = i;
        this.x = obj;
        this.y = null;
    }

    public jz0(Animator animator) {
        this.w = 26;
        this.x = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.y = animatorSet;
        animatorSet.play(animator);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [b32, android.text.Editable$Factory] */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0032 */
    public jz0(EditText editText) {
        this.w = 19;
        this.x = editText;
        o32 o32 = new o32(editText);
        this.y = o32;
        editText.addTextChangedListener(o32);
        if (b32.b == null) {
            synchronized (b32.a) {
                try {
                    if (b32.b == null) {
                        ? factory = new Editable.Factory();
                        b32.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b32.class.getClassLoader());
                        b32.b = factory;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        editText.setEditableFactory(b32.b);
    }

    public jz0(wu2 wu2) {
        this.w = 29;
        pc2 pc2 = wu2.w;
        pc2.getClass();
        Iterator it = ((ds) pc2.a.entrySet()).iterator();
        this.x = it;
        if (it.hasNext()) {
            this.y = (Map.Entry) it.next();
        }
    }
}
