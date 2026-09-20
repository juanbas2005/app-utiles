package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* renamed from: xn4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xn4 implements cf3 {
    public final e81 a;
    public final File b;
    public final hn0 c;
    public final String d = ".lock";
    public final String e = ".version";
    public final String f = "fcntl failed: EAGAIN";
    public final qq4 g = new qq4();
    public final z97 h = new z97(new sn4(this, 0));
    public final z97 i = new z97(new sn4(this, 1));

    public xn4(e81 e81, File file) {
        e81.getClass();
        file.getClass();
        this.a = e81;
        this.b = file;
        Object obj = fo4.b;
        this.c = new hn0(new ii3(file, (f61) null), x32.w, -2, vc0.w);
    }

    public static void f(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                kj6.p("Unable to create parent directories of ", file);
                return;
            }
        }
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    public final Object a(h61 h61) {
        z97 z97 = this.i;
        if (z97.a()) {
            jr6 jr6 = (jr6) ((kr6) z97.getValue());
            return new Integer(jr6.b.nativeGetCounterValue(jr6.c));
        }
        return ar7.e0(this.a, new un4(this, (f61) null, 0), h61);
    }

    public final Object b(if1 if1) {
        z97 z97 = this.i;
        if (z97.a()) {
            jr6 jr6 = (jr6) ((kr6) z97.getValue());
            return new Integer(jr6.b.nativeIncrementAndGetCounterValue(jr6.c));
        }
        return ar7.e0(this.a, new un4(this, (f61) null, 1), if1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: qq4} */
    /* JADX WARNING: type inference failed for: r8v18, types: [java.lang.AutoCloseable] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        if (r1 == r6) goto L_0x00ac;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b3 A[SYNTHETIC, Splitter:B:40:0x00b3] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d1 A[SYNTHETIC, Splitter:B:55:0x00d1] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    public final Object c(vr2 vr2, h61 h61) {
        vn4 vn4;
        int i2;
        Object obj;
        oq4 oq4;
        Throwable th;
        Closeable closeable;
        FileLock fileLock;
        oq4 oq42;
        oq4 oq43;
        vr2 vr22;
        FileLock fileLock2;
        Object y;
        oq4 oq44;
        FileOutputStream fileOutputStream;
        Object g2;
        if (h61 instanceof vn4) {
            vn4 = (vn4) h61;
            int i3 = vn4.E;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vn4.E = i3 - Integer.MIN_VALUE;
                Object obj2 = vn4.C;
                i2 = vn4.E;
                obj = p81.w;
                if (i2 != 0) {
                    o85.q(obj2);
                    vn4.z = vr2;
                    qq4 qq4 = this.g;
                    vn4.A = qq4;
                    vn4.E = 1;
                    Object a2 = qq4.a(vn4);
                    oq44 = qq4;
                } else if (i2 == 1) {
                    o85.q(obj2);
                    oq44 = (oq4) vn4.A;
                    vr2 = (vr2) vn4.z;
                } else if (i2 == 2) {
                    closeable = vn4.B;
                    oq43 = (oq4) vn4.A;
                    vr22 = (vr2) vn4.z;
                    try {
                        o85.q(obj2);
                        fileLock2 = (FileLock) obj2;
                        try {
                            vn4.z = oq43;
                            vn4.A = closeable;
                            vn4.B = fileLock2;
                            vn4.E = 3;
                            y = vr22.y(vn4);
                            if (y != obj) {
                                Object obj3 = y;
                                oq42 = oq43;
                                fileLock = fileLock2;
                                obj2 = obj3;
                                if (fileLock != null) {
                                }
                                ed1.i(closeable, (Throwable) null);
                                oq42.k((Object) null);
                                return obj2;
                            }
                            return obj;
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            oq42 = oq43;
                            fileLock = fileLock2;
                            th = th3;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        oq42 = oq43;
                    }
                } else if (i2 == 3) {
                    fileLock = (FileLock) vn4.B;
                    closeable = (Closeable) vn4.A;
                    oq42 = (oq4) vn4.z;
                    try {
                        o85.q(obj2);
                        if (fileLock != null) {
                            try {
                                fileLock.release();
                            } catch (Throwable th5) {
                                ed1.i(closeable, th);
                                throw th5;
                            }
                        }
                        try {
                            ed1.i(closeable, (Throwable) null);
                            oq42.k((Object) null);
                            return obj2;
                        } catch (Throwable th6) {
                            th = th6;
                            oq4 = oq42;
                            oq4.k((Object) null);
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oq4 = oq44;
                fileOutputStream = new FileOutputStream((File) this.h.getValue());
                oq4 = oq44;
                vn4.z = vr2;
                vn4.A = oq44;
                vn4.B = fileOutputStream;
                vn4.E = 2;
                g2 = ts2.g(fileOutputStream, vn4);
                if (g2 != obj) {
                    oq4 oq45 = oq44;
                    obj2 = g2;
                    oq43 = oq45;
                    Closeable closeable2 = fileOutputStream;
                    vr22 = vr2;
                    closeable = closeable2;
                    fileLock2 = (FileLock) obj2;
                    vn4.z = oq43;
                    vn4.A = closeable;
                    vn4.B = fileLock2;
                    vn4.E = 3;
                    y = vr22.y(vn4);
                    if (y != obj) {
                    }
                }
                return obj;
            }
        }
        vn4 = new vn4(this, h61);
        Object obj22 = vn4.C;
        i2 = vn4.E;
        obj = p81.w;
        if (i2 != 0) {
        }
        try {
            oq4 = oq44;
            fileOutputStream = new FileOutputStream((File) this.h.getValue());
            oq4 = oq44;
        } catch (Throwable th8) {
            th = th8;
            oq4.k((Object) null);
            throw th;
        }
        try {
            vn4.z = vr2;
            vn4.A = oq44;
            vn4.B = fileOutputStream;
            vn4.E = 2;
            g2 = ts2.g(fileOutputStream, vn4);
            if (g2 != obj) {
            }
            return obj;
        } catch (Throwable th9) {
            oq42 = oq44;
            closeable = fileOutputStream;
            th = th9;
            fileLock = null;
            if (fileLock != null) {
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00dc A[SYNTHETIC, Splitter:B:60:0x00dc] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    public final Object d(gs2 gs2, h61 h61) {
        wn4 wn4;
        int i2;
        qq4 qq4;
        boolean z;
        FileInputStream fileInputStream;
        qq4 qq42;
        FileLock fileLock;
        boolean z2;
        Throwable th;
        FileLock fileLock2;
        gs2 gs22 = gs2;
        h61 h612 = h61;
        if (h612 instanceof wn4) {
            wn4 = (wn4) h612;
            int i3 = wn4.F;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wn4.F = i3 - Integer.MIN_VALUE;
                Object obj = wn4.D;
                i2 = wn4.F;
                boolean z3 = true;
                if (i2 != 0) {
                    o85.q(obj);
                    qq4 qq43 = this.g;
                    boolean g2 = qq43.g();
                    p81 p81 = p81.w;
                    if (!g2) {
                        try {
                            Boolean bool = Boolean.FALSE;
                            wn4.z = qq43;
                            wn4.C = g2;
                            wn4.F = 1;
                            obj = gs22.H(bool, wn4);
                            if (obj != p81) {
                                qq4 = qq43;
                                z = g2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            qq4 = qq43;
                            z = g2;
                            if (z) {
                                qq4.k((Object) null);
                            }
                            throw th;
                        }
                    } else {
                        FileInputStream fileInputStream2 = new FileInputStream((File) this.h.getValue());
                        try {
                            fileLock2 = fileInputStream2.getChannel().tryLock(0, Long.MAX_VALUE, true);
                        } catch (IOException e2) {
                            String message = e2.getMessage();
                            if (message == null || !k57.u0(message, this.f, false)) {
                                String message2 = e2.getMessage();
                                if (message2 == null || !k57.u0(message2, "Resource deadlock would occur", false)) {
                                    throw e2;
                                }
                            }
                            fileLock2 = null;
                        } catch (Throwable th3) {
                            th = th3;
                            qq42 = qq43;
                            fileLock = null;
                        }
                        if (fileLock2 == null) {
                            z3 = false;
                        }
                        try {
                            Boolean valueOf = Boolean.valueOf(z3);
                            wn4.z = qq43;
                            wn4.A = fileInputStream2;
                            wn4.B = fileLock2;
                            wn4.C = g2;
                            wn4.F = 2;
                            obj = gs22.H(valueOf, wn4);
                            if (obj != p81) {
                                fileLock = fileLock2;
                                qq42 = qq43;
                                z = g2;
                                fileInputStream = fileInputStream2;
                                if (fileLock != null) {
                                }
                                ed1.i(fileInputStream, (Throwable) null);
                                if (z) {
                                }
                                return obj;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            fileLock = fileLock2;
                            qq42 = qq43;
                            z = g2;
                            fileInputStream = fileInputStream2;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    }
                    return p81;
                } else if (i2 == 1) {
                    z = wn4.C;
                    qq4 = wn4.z;
                    try {
                        o85.q(obj);
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } else if (i2 == 2) {
                    z = wn4.C;
                    fileLock = wn4.B;
                    fileInputStream = wn4.A;
                    qq42 = wn4.z;
                    try {
                        o85.q(obj);
                        if (fileLock != null) {
                            try {
                                fileLock.release();
                            } catch (Throwable th6) {
                                try {
                                    ed1.i(fileInputStream, th);
                                    throw th6;
                                } catch (Throwable th7) {
                                    th = th7;
                                    z = z2;
                                    qq4 = qq42;
                                    if (z) {
                                    }
                                    throw th;
                                }
                            }
                        }
                        try {
                            ed1.i(fileInputStream, (Throwable) null);
                            if (z) {
                                qq42.k((Object) null);
                            }
                            return obj;
                        } catch (Throwable th8) {
                            th = th8;
                            qq4 = qq42;
                            if (z) {
                            }
                            throw th;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (z) {
                    qq4.k((Object) null);
                }
                return obj;
            }
        }
        wn4 = new wn4(this, h612);
        Object obj2 = wn4.D;
        i2 = wn4.F;
        boolean z32 = true;
        if (i2 != 0) {
        }
        if (z) {
        }
        return obj2;
    }

    public final di2 e() {
        return this.c;
    }
}
