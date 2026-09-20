package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.os.Build;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ul5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ul5 implements yw1 {
    public static final Map y;
    public static final List z = sg3.E(InetAddress.getByAddress(new byte[]{8, 8, 8, 8}), InetAddress.getByAddress(new byte[]{1, 1, 1, 1}));
    public final ay4 w;
    public final ConcurrentHashMap x = new ConcurrentHashMap();

    static {
        Map singletonMap = Collections.singletonMap("secure.etecsa.net", sg3.D(InetAddress.getByAddress(new byte[]{10, -76, 0, 30})));
        singletonMap.getClass();
        y = singletonMap;
    }

    public ul5(ay4 ay4) {
        ay4.getClass();
        this.w = ay4;
    }

    public static int d(int i, byte[] bArr) {
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    public static int f(int i, byte[] bArr) {
        int i2 = -1;
        while (true) {
            byte b = bArr[i];
            byte b2 = b & 255;
            if (b2 == 0) {
                break;
            } else if ((b & 192) == 192) {
                if (i2 < 0) {
                    i2 = i + 2;
                }
                i = (bArr[i + 1] & 255) | ((b & 63) << 8);
            } else {
                i += b2 + 1;
            }
        }
        int i3 = i + 1;
        if (i2 >= 0) {
            return i2;
        }
        return i3;
    }

    public final void a(String str, List list) {
        this.x.put(str, new yb5(Long.valueOf(System.currentTimeMillis()), list));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: a42} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final List b(String str) {
        List list;
        Object obj;
        ConnectivityManager connectivityManager;
        Network j;
        Object obj2;
        Network j2;
        Object obj3;
        long j3;
        str.getClass();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        List list2 = (List) y.get(lowerCase);
        if (list2 != null) {
            return list2;
        }
        ConcurrentHashMap concurrentHashMap = this.x;
        yb5 yb5 = (yb5) concurrentHashMap.get(lowerCase);
        if (yb5 != null) {
            long longValue = ((Number) yb5.w).longValue();
            List list3 = (List) yb5.x;
            if (list3.isEmpty()) {
                j3 = 15000;
            } else {
                j3 = 60000;
            }
            if (System.currentTimeMillis() - longValue < j3) {
                return list3;
            }
        }
        ay4 ay4 = this.w;
        ConnectivityManager connectivityManager2 = (ConnectivityManager) ay4.x;
        List list4 = a42.w;
        Object obj4 = null;
        if (connectivityManager2 == null || (j2 = ay4.j()) == null) {
            list = list4;
        } else {
            try {
                LinkProperties linkProperties = connectivityManager2.getLinkProperties(j2);
                if (linkProperties != null) {
                    obj3 = linkProperties.getDnsServers();
                } else {
                    obj3 = null;
                }
            } catch (Throwable th) {
                obj3 = new m66(th);
            }
            if (obj3 instanceof m66) {
                obj3 = null;
            }
            List list5 = (List) obj3;
            if (list5 == null) {
                list5 = list4;
            }
            ArrayList arrayList = new ArrayList();
            for (Object next : list5) {
                if (next instanceof InetAddress) {
                    arrayList.add(next);
                }
            }
            list = arrayList;
        }
        List e = e(str, list);
        if (!e.isEmpty()) {
            a(lowerCase, e);
            return e;
        }
        List e2 = e(str, z);
        if (!e2.isEmpty()) {
            a(lowerCase, e2);
            return e2;
        }
        boolean z2 = false;
        if (!(Build.VERSION.SDK_INT < 28 || (connectivityManager = (ConnectivityManager) ay4.x) == null || (j = ay4.j()) == null)) {
            try {
                LinkProperties linkProperties2 = connectivityManager.getLinkProperties(j);
                if (linkProperties2 != null) {
                    obj2 = Boolean.valueOf(linkProperties2.isPrivateDnsActive());
                } else {
                    obj2 = null;
                }
            } catch (Throwable th2) {
                obj2 = new m66(th2);
            }
            if (obj2 instanceof m66) {
                obj2 = null;
            }
            z2 = sg3.e(obj2, Boolean.TRUE);
        }
        if (!z2) {
            try {
                InetAddress[] allByName = InetAddress.getAllByName(str);
                allByName.getClass();
                obj = qs.p1(allByName);
            } catch (NullPointerException e3) {
                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                unknownHostException.initCause(e3);
                throw unknownHostException;
            } catch (Throwable th3) {
                obj = new m66(th3);
            }
            if (!(obj instanceof m66)) {
                obj4 = obj;
            }
            List list6 = (List) obj4;
            if (list6 == null) {
                list6 = list4;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : list6) {
                InetAddress inetAddress = (InetAddress) next2;
                if (!inetAddress.isAnyLocalAddress() && !inetAddress.isLoopbackAddress()) {
                    arrayList2.add(next2);
                }
            }
            if (!arrayList2.isEmpty()) {
                a(lowerCase, arrayList2);
                return arrayList2;
            }
        }
        concurrentHashMap.put(lowerCase, new yb5(Long.valueOf(System.currentTimeMillis()), list4));
        return list4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: a42} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final List c(InetAddress inetAddress, String str) {
        Throwable th;
        List<String> W0 = d57.W0(d57.l1(str, '.'), new String[]{"."}, 6);
        int i = 0;
        for (String length : W0) {
            i += length.length() + 1;
        }
        byte[] bArr = new byte[(i + 1)];
        int i2 = 0;
        for (String str2 : W0) {
            int i3 = i2 + 1;
            bArr[i2] = (byte) str2.length();
            byte[] bytes = str2.getBytes(mo0.d);
            bytes.getClass();
            qs.O0(bytes, bArr, i3, 0, 0, 12);
            i2 = str2.length() + i3;
        }
        bArr[i2] = 0;
        int nextInt = wv5.a.f().nextInt(65536);
        ByteBuffer allocate = ByteBuffer.allocate(i + 17);
        allocate.putShort((short) nextInt);
        allocate.putShort(256);
        allocate.putShort(1);
        allocate.putShort(0);
        allocate.putShort(0);
        allocate.putShort(0);
        allocate.put(bArr);
        allocate.putShort(1);
        allocate.putShort(1);
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            ay4 ay4 = this.w;
            ay4.getClass();
            Network j = ay4.j();
            if (j != null) {
                try {
                    j.bindSocket(datagramSocket);
                } catch (Throwable unused) {
                }
            }
            datagramSocket.setSoTimeout(2000);
            datagramSocket.send(new DatagramPacket(allocate.array(), allocate.position(), new InetSocketAddress(inetAddress, 53)));
            byte[] bArr2 = new byte[512];
            DatagramPacket datagramPacket = new DatagramPacket(bArr2, 512);
            datagramSocket.receive(datagramPacket);
            int length2 = datagramPacket.getLength();
            a42 a42 = a42.w;
            int i4 = 12;
            if (length2 >= 12) {
                if (d(0, bArr2) == nextInt) {
                    if ((d(2, bArr2) & 15) == 0) {
                        int d = d(4, bArr2);
                        int d2 = d(6, bArr2);
                        for (int i5 = 0; i5 < d; i5++) {
                            i4 = f(i4, bArr2) + 4;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i6 = 0; i6 < d2; i6++) {
                            int f = f(i4, bArr2);
                            int d3 = d(f, bArr2);
                            int d4 = d(f + 8, bArr2);
                            if (d3 == 1 && d4 == 4) {
                                arrayList.add(InetAddress.getByAddress(qs.P0(bArr2, f + 10, f + 14)));
                            }
                            i4 = d4 + 10 + f;
                        }
                        a42 = arrayList;
                    }
                }
            }
            datagramSocket.close();
            return a42;
        } catch (Throwable th2) {
            Throwable th3 = th2;
            ed1.i(datagramSocket, th);
            throw th3;
        }
    }

    public final List e(String str, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                obj = c((InetAddress) it.next(), str);
            } catch (Throwable th) {
                obj = new m66(th);
            }
            if (obj instanceof m66) {
                obj = null;
            }
            List list2 = (List) obj;
            if (list2 != null && !list2.isEmpty()) {
                return list2;
            }
        }
        return a42.w;
    }
}
