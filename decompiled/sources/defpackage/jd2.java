package defpackage;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: jd2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jd2 implements ks0 {
    public final File a;
    public final tl6 b;
    public final cf3 c;
    public final zh d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final qq4 f = new qq4();

    public jd2(File file, tl6 tl6, cf3 cf3, zh zhVar) {
        tl6.getClass();
        cf3.getClass();
        this.a = file;
        this.b = tl6;
        this.c = cf3;
        this.d = zhVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0072, code lost:
        r7 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0073, code lost:
        r8 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007e, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        defpackage.su0.b(r8, r7);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:34:0x0071, B:40:0x007a] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071 A[SYNTHETIC, Splitter:B:34:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    public final Object a(xe1 xe1, h61 h61) {
        hd2 hd2;
        int i;
        Throwable th;
        fd2 fd2;
        boolean z;
        if (h61 instanceof hd2) {
            hd2 = (hd2) h61;
            int i2 = hd2.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hd2.D = i2 - Integer.MIN_VALUE;
                Object obj = hd2.B;
                i = hd2.D;
                qq4 qq4 = this.f;
                if (i != 0) {
                    o85.q(obj);
                    if (!this.e.get()) {
                        boolean z2 = qq4.g();
                        try {
                            fd2 fd22 = new fd2(this.a, this.b);
                            try {
                                Boolean valueOf = Boolean.valueOf(z2);
                                hd2.A = fd22;
                                hd2.z = z2;
                                hd2.D = 1;
                                Object u = xe1.u(fd22, valueOf, hd2);
                                p81 p81 = p81.w;
                                if (u == p81) {
                                    return p81;
                                }
                                boolean z3 = z2;
                                obj = u;
                                z = z3;
                                fd2 = fd22;
                            } catch (Throwable th2) {
                                boolean z4 = z2;
                                th = th2;
                                z = z4;
                                fd2 = fd22;
                                fd2.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (z2) {
                                qq4.k((Object) null);
                            }
                            throw th;
                        }
                    } else {
                        h.s("StorageConnection has already been disposed.");
                        return null;
                    }
                } else if (i == 1) {
                    z = hd2.z;
                    fd2 = hd2.A;
                    try {
                        o85.q(obj);
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fd2.close();
                th = null;
                if (th != null) {
                    if (z) {
                        qq4.k((Object) null);
                    }
                    return obj;
                }
                throw th;
            }
        }
        hd2 = new hd2(this, h61);
        Object obj2 = hd2.B;
        i = hd2.D;
        qq4 qq42 = this.f;
        if (i != 0) {
        }
        try {
            fd2.close();
            th = null;
        } catch (Throwable th5) {
            th = th5;
        }
        if (th != null) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: qq4} */
    /* JADX WARNING: type inference failed for: r4v3, types: [fd2, java.lang.Object, pd2] */
    /* JADX WARNING: type inference failed for: r2v6, types: [gs2] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0082, code lost:
        if (r2 == r7) goto L_0x00b7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3 A[SYNTHETIC, Splitter:B:41:0x00c3] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0107 A[SYNTHETIC, Splitter:B:58:0x0107] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    public final Object b(if1 if1, h61 h61) {
        id2 id2;
        int i;
        Object obj;
        oq4 oq4;
        File file;
        Throwable th;
        File file2;
        pd2 pd2;
        oq4 oq42;
        boolean z;
        oq4 oq43;
        ? fd2;
        if (h61 instanceof id2) {
            id2 = (id2) h61;
            int i2 = id2.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                id2.E = i2 - Integer.MIN_VALUE;
                Object obj2 = id2.C;
                i = id2.E;
                File file3 = this.a;
                obj = p81.w;
                if (i != 0) {
                    o85.q(obj2);
                    if (!this.e.get()) {
                        File parentFile = file3.getCanonicalFile().getParentFile();
                        if (parentFile != null) {
                            parentFile.mkdirs();
                            if (!parentFile.isDirectory()) {
                                kj6.p("Unable to create parent directories of ", file3);
                                return null;
                            }
                        }
                        id2.z = if1;
                        qq4 qq4 = this.f;
                        id2.A = qq4;
                        id2.E = 1;
                        Object a2 = qq4.a(id2);
                        oq43 = qq4;
                    } else {
                        h.s("StorageConnection has already been disposed.");
                        return null;
                    }
                } else if (i == 1) {
                    o85.q(obj2);
                    oq43 = (oq4) id2.A;
                    if1 = (gs2) id2.z;
                } else if (i == 2) {
                    pd2 = id2.B;
                    file2 = (File) id2.A;
                    oq42 = (oq4) id2.z;
                    try {
                        o85.q(obj2);
                        try {
                            pd2.close();
                            th = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        if (th != null) {
                            try {
                                if (file2.exists()) {
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        z = an.i(file2, file3);
                                    } else {
                                        z = file2.renameTo(file3);
                                    }
                                    if (!z) {
                                        throw new IOException("Unable to rename " + file2 + " to " + file3 + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                }
                                oq42.k((Object) null);
                                return vs7.a;
                            } catch (IOException e2) {
                                e = e2;
                                file = file2;
                                oq4 = oq42;
                            } catch (Throwable th3) {
                                th = th3;
                                oq4 = oq42;
                                oq4.k((Object) null);
                                throw th;
                            }
                        } else {
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oq4 = oq43;
                file = new File(file3.getAbsolutePath() + ".tmp");
                oq4 = oq43;
                try {
                    tl6 tl6 = this.b;
                    tl6.getClass();
                    fd2 = new fd2(file, tl6);
                } catch (IOException e3) {
                    e = e3;
                    oq4 = oq43;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                try {
                    id2.z = oq43;
                    id2.A = file;
                    id2.B = fd2;
                    id2.E = 2;
                    if (if1.H(fd2, id2) != obj) {
                        oq42 = oq43;
                        file2 = file;
                        pd2 = fd2;
                        pd2.close();
                        th = null;
                        if (th != null) {
                        }
                    }
                    return obj;
                } catch (Throwable th5) {
                    oq42 = oq43;
                    file2 = file;
                    th = th5;
                    pd2 = fd2;
                    try {
                        pd2.close();
                    } catch (Throwable th6) {
                        su0.b(th, th6);
                    }
                    throw th;
                }
            }
        }
        id2 = new id2(this, h61);
        Object obj22 = id2.C;
        i = id2.E;
        File file32 = this.a;
        obj = p81.w;
        if (i != 0) {
        }
        try {
            oq4 = oq43;
            file = new File(file32.getAbsolutePath() + ".tmp");
            oq4 = oq43;
            tl6 tl62 = this.b;
            tl62.getClass();
            fd2 = new fd2(file, tl62);
            id2.z = oq43;
            id2.A = file;
            id2.B = fd2;
            id2.E = 2;
            if (if1.H(fd2, id2) != obj) {
            }
            return obj;
        } catch (Throwable th7) {
            th = th7;
            oq4.k((Object) null);
            throw th;
        }
    }

    public final void close() {
        this.e.set(true);
        this.d.b();
    }
}
