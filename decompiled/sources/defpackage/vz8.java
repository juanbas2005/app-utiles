package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* renamed from: vz8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vz8 implements Runnable {
    public final Map A;
    public final Object B;
    public final /* synthetic */ in8 C;
    public final /* synthetic */ int w = 1;
    public final URL x;
    public final byte[] y;
    public final String z;

    public vz8(xz8 xz8, String str, URL url, byte[] bArr, Map map, tz8 tz8) {
        Objects.requireNonNull(xz8);
        this.C = xz8;
        z65.h(str);
        z65.k(url);
        this.x = url;
        this.y = bArr;
        this.B = tz8;
        this.z = str;
        this.A = map;
    }

    public void a(int i, IOException iOException, byte[] bArr, Map map) {
        r19 r19 = ((y19) ((b59) this.C).w).C;
        y19.g(r19);
        r19.l1(new a59(this, i, iOException, bArr, map));
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [java.net.URLConnection] */
    /* JADX WARNING: type inference failed for: r0v46, types: [java.net.URLConnection] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x012e, code lost:
        r6 = r3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007a A[ExcHandler: all (th java.lang.Throwable), Splitter:B:8:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0280 A[SYNTHETIC, Splitter:B:142:0x0280] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02af A[SYNTHETIC, Splitter:B:161:0x02af] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02ed A[SYNTHETIC, Splitter:B:171:0x02ed] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0117 A[SYNTHETIC, Splitter:B:55:0x0117] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0143 A[SYNTHETIC, Splitter:B:76:0x0143] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0167 A[SYNTHETIC, Splitter:B:86:0x0167] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x017c  */
    /* JADX WARNING: Unknown variable types count: 2 */
    public final void run() {
        Map<String, List<String>> map;
        IOException iOException;
        int i;
        HttpURLConnection httpURLConnection;
        r19 r19;
        kz8 kz8;
        HttpURLConnection httpURLConnection2;
        Throwable th;
        InputStream inputStream;
        Map<String, List<String>> map2;
        HttpURLConnection httpURLConnection3;
        IOException iOException2;
        OutputStream outputStream;
        Map<String, List<String>> map3;
        HttpURLConnection httpURLConnection4;
        OutputStream outputStream2;
        Throwable th2;
        HttpURLConnection httpURLConnection5;
        InputStream inputStream2;
        Object obj = this.B;
        int i2 = this.w;
        byte[] bArr = this.y;
        Map map4 = this.A;
        URL url = this.x;
        in8 in8 = this.C;
        int i3 = 0;
        String str = this.z;
        switch (i2) {
            case b85.b:
                OutputStream outputStream3 = null;
                xz8 xz8 = (xz8) in8;
                y19 y19 = (y19) xz8.w;
                r19 r192 = ((y19) xz8.w).C;
                y19.g(r192);
                r192.g1();
                try {
                    ? openConnection = url.openConnection();
                    if (openConnection instanceof HttpURLConnection) {
                        httpURLConnection = openConnection;
                        httpURLConnection.setDefaultUseCaches(false);
                        y19.getClass();
                        httpURLConnection.setConnectTimeout(60000);
                        httpURLConnection.setReadTimeout(61000);
                        httpURLConnection.setInstanceFollowRedirects(false);
                        httpURLConnection.setDoInput(true);
                        if (map4 != null) {
                            try {
                                for (Map.Entry entry : map4.entrySet()) {
                                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                }
                            } catch (IOException e) {
                                iOException = e;
                                i = 0;
                                map = null;
                                if (outputStream3 != null) {
                                }
                                if (httpURLConnection != null) {
                                }
                                r19 = y19.C;
                                y19.g(r19);
                                kz8 = new kz8(this.z, (tz8) obj, i, iOException, (byte[]) null, (Map) map);
                                r19.l1(kz8);
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                httpURLConnection2 = httpURLConnection;
                                i = 0;
                                map = null;
                                th = th;
                                if (outputStream3 != null) {
                                }
                                if (httpURLConnection2 != null) {
                                }
                                r19 r193 = y19.C;
                                y19.g(r193);
                                r193.l1(new kz8(this.z, (tz8) obj, i, (IOException) null, (byte[]) null, (Map) map));
                                throw th;
                            }
                        }
                        if (bArr != null) {
                            y89 y89 = xz8.x.C;
                            v89.R(y89);
                            byte[] M1 = y89.M1(bArr);
                            pz8 pz8 = y19.B;
                            y19.g(pz8);
                            mz8 mz8 = pz8.J;
                            int length = M1.length;
                            mz8.b("Uploading data. size", Integer.valueOf(length));
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.connect();
                            OutputStream outputStream4 = httpURLConnection.getOutputStream();
                            try {
                                outputStream4.write(M1);
                                outputStream4.close();
                            } catch (IOException e2) {
                                iOException = e2;
                                i = 0;
                                map = null;
                                outputStream3 = outputStream4;
                            } catch (Throwable th4) {
                                th = th4;
                                i = 0;
                                map = null;
                                outputStream3 = outputStream4;
                                httpURLConnection2 = httpURLConnection;
                                th = th;
                                if (outputStream3 != null) {
                                }
                                if (httpURLConnection2 != null) {
                                }
                                r19 r1932 = y19.C;
                                y19.g(r1932);
                                r1932.l1(new kz8(this.z, (tz8) obj, i, (IOException) null, (byte[]) null, (Map) map));
                                throw th;
                            }
                        }
                        i = httpURLConnection.getResponseCode();
                        try {
                            map = httpURLConnection.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                inputStream = httpURLConnection.getInputStream();
                                try {
                                    byte[] bArr2 = new byte[1024];
                                    while (true) {
                                        int read = inputStream.read(bArr2);
                                        if (read > 0) {
                                            byteArrayOutputStream.write(bArr2, 0, read);
                                        } else {
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            try {
                                                inputStream.close();
                                                httpURLConnection.disconnect();
                                                r19 = y19.C;
                                                y19.g(r19);
                                                kz8 = new kz8(this.z, (tz8) obj, i, (IOException) null, byteArray, (Map) map);
                                            } catch (IOException e3) {
                                                iOException = e3;
                                                if (outputStream3 != null) {
                                                }
                                                if (httpURLConnection != null) {
                                                }
                                                r19 = y19.C;
                                                y19.g(r19);
                                                kz8 = new kz8(this.z, (tz8) obj, i, iOException, (byte[]) null, (Map) map);
                                                r19.l1(kz8);
                                                return;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                httpURLConnection2 = httpURLConnection;
                                                th = th;
                                                if (outputStream3 != null) {
                                                }
                                                if (httpURLConnection2 != null) {
                                                }
                                                r19 r19322 = y19.C;
                                                y19.g(r19322);
                                                r19322.l1(new kz8(this.z, (tz8) obj, i, (IOException) null, (byte[]) null, (Map) map));
                                                throw th;
                                            }
                                            r19.l1(kz8);
                                            return;
                                        }
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                inputStream = null;
                                if (inputStream != null) {
                                }
                                throw th;
                            }
                        } catch (IOException e4) {
                            iOException = e4;
                            map = null;
                            if (outputStream3 != null) {
                            }
                            if (httpURLConnection != null) {
                            }
                            r19 = y19.C;
                            y19.g(r19);
                            kz8 = new kz8(this.z, (tz8) obj, i, iOException, (byte[]) null, (Map) map);
                            r19.l1(kz8);
                            return;
                        } catch (Throwable th8) {
                            th = th8;
                            httpURLConnection2 = httpURLConnection;
                            map = null;
                            th = th;
                            if (outputStream3 != null) {
                            }
                            if (httpURLConnection2 != null) {
                            }
                            r19 r193222 = y19.C;
                            y19.g(r193222);
                            r193222.l1(new kz8(this.z, (tz8) obj, i, (IOException) null, (byte[]) null, (Map) map));
                            throw th;
                        }
                    } else {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                } catch (IOException e5) {
                    iOException = e5;
                    i = 0;
                    httpURLConnection = null;
                    map = null;
                    if (outputStream3 != null) {
                        try {
                            outputStream3.close();
                        } catch (IOException e6) {
                            pz8 pz82 = y19.B;
                            y19.g(pz82);
                            pz82.B.c(pz8.k1(str), e6, "Error closing HTTP compressed POST connection output stream. appId");
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    r19 = y19.C;
                    y19.g(r19);
                    kz8 = new kz8(this.z, (tz8) obj, i, iOException, (byte[]) null, (Map) map);
                    r19.l1(kz8);
                    return;
                } catch (Throwable th9) {
                    th = th9;
                    i = 0;
                    httpURLConnection2 = null;
                    map = null;
                    if (outputStream3 != null) {
                        try {
                            outputStream3.close();
                        } catch (IOException e7) {
                            pz8 pz83 = y19.B;
                            y19.g(pz83);
                            pz83.B.c(pz8.k1(str), e7, "Error closing HTTP compressed POST connection output stream. appId");
                        }
                    }
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    r19 r1932222 = y19.C;
                    y19.g(r1932222);
                    r1932222.l1(new kz8(this.z, (tz8) obj, i, (IOException) null, (byte[]) null, (Map) map));
                    throw th;
                }
            default:
                b59 b59 = (b59) in8;
                y19 y192 = (y19) b59.w;
                r19 r194 = ((y19) b59.w).C;
                y19.g(r194);
                r194.g1();
                try {
                    ? openConnection2 = url.openConnection();
                    if (openConnection2 instanceof HttpURLConnection) {
                        HttpURLConnection httpURLConnection6 = openConnection2;
                        httpURLConnection6.setDefaultUseCaches(false);
                        y192.getClass();
                        httpURLConnection6.setConnectTimeout(60000);
                        httpURLConnection6.setReadTimeout(61000);
                        httpURLConnection6.setInstanceFollowRedirects(false);
                        httpURLConnection6.setDoInput(true);
                        if (map4 != null) {
                            try {
                                for (Map.Entry entry2 : map4.entrySet()) {
                                    httpURLConnection6.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                                }
                            } catch (IOException e8) {
                                pz8 pz84 = y192.B;
                                y19.g(pz84);
                                pz84.B.b("Failed to gzip post request content", e8);
                                throw e8;
                            } catch (IOException e9) {
                                e = e9;
                                httpURLConnection3 = httpURLConnection6;
                                map2 = null;
                                iOException2 = e;
                                outputStream = null;
                                if (outputStream != null) {
                                }
                                if (httpURLConnection3 != null) {
                                }
                                a(i3, iOException2, (byte[]) null, map2);
                                return;
                            } catch (Throwable th10) {
                            }
                        }
                        if (bArr != null) {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.close();
                            byteArrayOutputStream2.close();
                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                            pz8 pz85 = y192.B;
                            y19.g(pz85);
                            mz8 mz82 = pz85.J;
                            int length2 = byteArray2.length;
                            mz82.b("Uploading data. size", Integer.valueOf(length2));
                            httpURLConnection6.setDoOutput(true);
                            httpURLConnection6.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection6.setFixedLengthStreamingMode(length2);
                            httpURLConnection6.connect();
                            outputStream2 = httpURLConnection6.getOutputStream();
                            try {
                                outputStream2.write(byteArray2);
                                outputStream2.close();
                            } catch (IOException e10) {
                                HttpURLConnection httpURLConnection7 = httpURLConnection6;
                                iOException2 = e10;
                                outputStream = outputStream2;
                                httpURLConnection5 = httpURLConnection7;
                            } catch (Throwable th11) {
                                th = th11;
                                httpURLConnection4 = httpURLConnection6;
                                map3 = null;
                                th2 = th;
                                if (outputStream2 != null) {
                                }
                                if (httpURLConnection4 != null) {
                                }
                                a(i3, (IOException) null, (byte[]) null, map3);
                                throw th2;
                            }
                        }
                        int responseCode = httpURLConnection6.getResponseCode();
                        try {
                            map2 = httpURLConnection6.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                inputStream2 = httpURLConnection6.getInputStream();
                                try {
                                    byte[] bArr3 = new byte[1024];
                                    while (true) {
                                        int read2 = inputStream2.read(bArr3);
                                        if (read2 > 0) {
                                            byteArrayOutputStream3.write(bArr3, 0, read2);
                                        } else {
                                            byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                                            try {
                                                inputStream2.close();
                                                httpURLConnection6.disconnect();
                                                a(responseCode, (IOException) null, byteArray3, map2);
                                                return;
                                            } catch (IOException e11) {
                                                e = e11;
                                                i3 = responseCode;
                                                httpURLConnection3 = httpURLConnection6;
                                                iOException2 = e;
                                                outputStream = null;
                                                if (outputStream != null) {
                                                }
                                                if (httpURLConnection3 != null) {
                                                }
                                                a(i3, iOException2, (byte[]) null, map2);
                                                return;
                                            } catch (Throwable th12) {
                                                th = th12;
                                                i3 = responseCode;
                                                map3 = map2;
                                                outputStream2 = null;
                                                httpURLConnection4 = httpURLConnection6;
                                                th2 = th;
                                                if (outputStream2 != null) {
                                                }
                                                if (httpURLConnection4 != null) {
                                                }
                                                a(i3, (IOException) null, (byte[]) null, map3);
                                                throw th2;
                                            }
                                        }
                                    }
                                } catch (Throwable th13) {
                                    th = th13;
                                    if (inputStream2 != null) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th14) {
                                th = th14;
                                inputStream2 = null;
                                if (inputStream2 != null) {
                                    inputStream2.close();
                                }
                                throw th;
                            }
                        } catch (IOException e12) {
                            e = e12;
                            i3 = responseCode;
                            map2 = null;
                            httpURLConnection3 = httpURLConnection6;
                            iOException2 = e;
                            outputStream = null;
                            if (outputStream != null) {
                            }
                            if (httpURLConnection3 != null) {
                            }
                            a(i3, iOException2, (byte[]) null, map2);
                            return;
                        } catch (Throwable th15) {
                            th = th15;
                            httpURLConnection4 = httpURLConnection6;
                            i3 = responseCode;
                            outputStream2 = null;
                            map3 = null;
                            th2 = th;
                            if (outputStream2 != null) {
                            }
                            if (httpURLConnection4 != null) {
                            }
                            a(i3, (IOException) null, (byte[]) null, map3);
                            throw th2;
                        }
                    } else {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                } catch (IOException e13) {
                    iOException2 = e13;
                    outputStream = null;
                    httpURLConnection5 = null;
                    map2 = null;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e14) {
                            pz8 pz86 = y192.B;
                            y19.g(pz86);
                            pz86.B.c(pz8.k1(str), e14, "Error closing HTTP compressed POST connection output stream. appId");
                        }
                    }
                    if (httpURLConnection3 != null) {
                        httpURLConnection3.disconnect();
                    }
                    a(i3, iOException2, (byte[]) null, map2);
                    return;
                } catch (Throwable th16) {
                    th2 = th16;
                    outputStream2 = null;
                    httpURLConnection4 = null;
                    map3 = null;
                    if (outputStream2 != null) {
                        try {
                            outputStream2.close();
                        } catch (IOException e15) {
                            pz8 pz87 = y192.B;
                            y19.g(pz87);
                            pz87.B.c(pz8.k1(str), e15, "Error closing HTTP compressed POST connection output stream. appId");
                        }
                    }
                    if (httpURLConnection4 != null) {
                        httpURLConnection4.disconnect();
                    }
                    a(i3, (IOException) null, (byte[]) null, map3);
                    throw th2;
                }
        }
    }

    public vz8(b59 b59, String str, URL url, byte[] bArr, HashMap hashMap, y49 y49) {
        Objects.requireNonNull(b59);
        this.C = b59;
        z65.h(str);
        this.x = url;
        this.y = bArr;
        this.B = y49;
        this.z = str;
        this.A = hashMap;
    }
}
