package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* renamed from: c50  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c50 implements k40 {
    public final cz7 a;
    public final nz7 b;
    public final qz7 c;
    public final ol7 d;
    public final dv7 e;
    public final n78 f;
    public final h81 g;

    public c50(cz7 cz7, nz7 nz7, qz7 qz7, ol7 ol7, dv7 dv7, n78 n78, h81 h81) {
        cz7.getClass();
        nz7.getClass();
        qz7.getClass();
        ol7.getClass();
        dv7.getClass();
        n78.getClass();
        this.a = cz7;
        this.b = nz7;
        this.c = qz7;
        this.d = ol7;
        this.e = dv7;
        this.f = n78;
        this.g = h81;
        ar7.H(gl0.E(h81), (e81) null, (r81) null, new ot(this, (f61) null, 2), 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        if (r0 == r4) goto L_0x00c6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    public static final Object a(c50 c50, yz7 yz7, String str, h61 h61) {
        b50 b50;
        int i;
        yz7 yz72;
        String str2;
        c50 c502 = c50;
        h61 h612 = h61;
        qz7 qz7 = c502.c;
        if (h612 instanceof b50) {
            b50 = (b50) h612;
            int i2 = b50.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b50.C = i2 - Integer.MIN_VALUE;
                Object obj = b50.A;
                i = b50.C;
                p81 p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    di2 a2 = qz7.a(yz7.c().name(), str);
                    yz72 = yz7;
                    b50.z = yz72;
                    b50.C = 1;
                    obj = gr8.H(a2, b50);
                } else if (i == 1) {
                    yz72 = b50.z;
                    o85.q(obj);
                } else if (i == 2) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = (String) obj;
                Object obj2 = vs7.a;
                if (str2 == null) {
                    LinkedHashMap d2 = yz72.d(yz72.b());
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterable<Map.Entry> entrySet = d2.entrySet();
                    ArrayList arrayList = new ArrayList(et0.e0(entrySet, 10));
                    for (Map.Entry entry : entrySet) {
                        arrayList.add(new pz7(yz72.c().name(), (String) entry.getKey(), (String) entry.getValue(), yz72.b(), currentTimeMillis));
                    }
                    b50.z = null;
                    b50.C = 2;
                    Object e0 = ar7.e0(qz7.b, new zw7(qz7, arrayList, (f61) null, 6), b50);
                    if (e0 == p81) {
                        obj2 = e0;
                    }
                    if (obj2 == p81) {
                        return p81;
                    }
                }
                return obj2;
            }
        }
        b50 = new b50(c502, h612);
        Object obj3 = b50.A;
        i = b50.C;
        p81 p812 = p81.w;
        if (i != 0) {
        }
        str2 = (String) obj3;
        Object obj22 = vs7.a;
        if (str2 == null) {
        }
        return obj22;
    }

    public final di2 b(yz7 yz7, String str, String str2) {
        return gr8.L(new o40(0, this.c.a(yz7.c().name(), str), str2), this.g);
    }

    public final di2 c() {
        return b(vz7.a, "datos", "0.00 MB");
    }

    public final di2 d() {
        return b(vz7.a, "saldo", "0.00");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object e(h61 h61) {
        p40 p40;
        int i;
        if (h61 instanceof p40) {
            p40 = (p40) h61;
            int i2 = p40.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p40.B = i2 - Integer.MIN_VALUE;
                Object obj = p40.z;
                i = p40.B;
                if (i != 0) {
                    o85.q(obj);
                    sz7 sz7 = sz7.a;
                    p40.B = 1;
                    Object l = k(sz7, sz7.c(), p40);
                    p81 p81 = p81.w;
                    if (l == p81) {
                        return p81;
                    }
                    return l;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Exception e3) {
                        return new m66(e3);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        p40 = new p40(this, h61);
        Object obj2 = p40.z;
        i = p40.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object f(h61 h61) {
        q40 q40;
        int i;
        if (h61 instanceof q40) {
            q40 = (q40) h61;
            int i2 = q40.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q40.B = i2 - Integer.MIN_VALUE;
                Object obj = q40.z;
                i = q40.B;
                if (i != 0) {
                    o85.q(obj);
                    rz7 rz7 = rz7.a;
                    q40.B = 1;
                    Object l = k(rz7, rz7.c(), q40);
                    p81 p81 = p81.w;
                    if (l == p81) {
                        return p81;
                    }
                    return l;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Exception e3) {
                        return new m66(e3);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        q40 = new q40(this, h61);
        Object obj2 = q40.z;
        i = q40.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object g(h61 h61) {
        r40 r40;
        int i;
        if (h61 instanceof r40) {
            r40 = (r40) h61;
            int i2 = r40.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r40.B = i2 - Integer.MIN_VALUE;
                Object obj = r40.z;
                i = r40.B;
                if (i != 0) {
                    o85.q(obj);
                    xz7 xz7 = xz7.a;
                    r40.B = 1;
                    Object l = k(xz7, xz7.c(), r40);
                    p81 p81 = p81.w;
                    if (l == p81) {
                        return p81;
                    }
                    return l;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Exception e3) {
                        return new m66(e3);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        r40 = new r40(this, h61);
        Object obj2 = r40.z;
        i = r40.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object h(h61 h61) {
        s40 s40;
        int i;
        if (h61 instanceof s40) {
            s40 = (s40) h61;
            int i2 = s40.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s40.B = i2 - Integer.MIN_VALUE;
                Object obj = s40.z;
                i = s40.B;
                if (i != 0) {
                    o85.q(obj);
                    wz7 wz7 = wz7.a;
                    s40.B = 1;
                    Object l = k(wz7, wz7.c(), s40);
                    p81 p81 = p81.w;
                    if (l == p81) {
                        return p81;
                    }
                    return l;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Exception e3) {
                        return new m66(e3);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        s40 = new s40(this, h61);
        Object obj2 = s40.z;
        i = s40.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0055 A[Catch:{ CancellationException -> 0x006b, Exception -> 0x0064 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058 A[Catch:{ CancellationException -> 0x006b, Exception -> 0x0064 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0062 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    public final Object i(h61 h61) {
        t40 t40;
        int i;
        p81 p81;
        zn6 c2;
        az7 az7;
        Object k;
        if (h61 instanceof t40) {
            t40 = (t40) h61;
            int i2 = t40.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t40.B = i2 - Integer.MIN_VALUE;
                Object obj = t40.z;
                i = t40.B;
                p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    di2 d2 = ((dy7) this.e).d();
                    t40.B = 1;
                    obj = gr8.H(d2, t40);
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else if (i == 2) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Exception e3) {
                        return new m66(e3);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c2 = fb5.c((UserDataPreferences) obj);
                vz7 vz7 = vz7.a;
                if (c2.f != 1) {
                    az7 = c2.t;
                } else {
                    az7 = c2.s;
                }
                t40.B = 2;
                k = k(vz7, az7, t40);
                if (k != p81) {
                    return p81;
                }
                return k;
            }
        }
        t40 = new t40(this, h61);
        Object obj2 = t40.z;
        i = t40.B;
        p81 = p81.w;
        if (i != 0) {
        }
        c2 = fb5.c((UserDataPreferences) obj2);
        vz7 vz72 = vz7.a;
        if (c2.f != 1) {
        }
        t40.B = 2;
        k = k(vz72, az7, t40);
        if (k != p81) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object j(h61 h61) {
        u40 u40;
        int i;
        if (h61 instanceof u40) {
            u40 = (u40) h61;
            int i2 = u40.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u40.B = i2 - Integer.MIN_VALUE;
                Object obj = u40.z;
                i = u40.B;
                if (i != 0) {
                    o85.q(obj);
                    tz7 tz7 = tz7.a;
                    u40.B = 1;
                    Object l = k(tz7, tz7.c(), u40);
                    p81 p81 = p81.w;
                    if (l == p81) {
                        return p81;
                    }
                    return l;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Exception e3) {
                        return new m66(e3);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        u40 = new u40(this, h61);
        Object obj2 = u40.z;
        i = u40.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0083, code lost:
        if (r2 == r12) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x017c, code lost:
        if (defpackage.ar7.e0(r1.g, r0, r8) != r12) goto L_0x017f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030  */
    public final Object k(yz7 yz7, az7 az7, h61 h61) {
        v40 v40;
        int i;
        yz7 yz72;
        String str;
        int i2;
        int i3;
        boolean z;
        yz7 yz73;
        String str2;
        Object H;
        String str3;
        int F;
        TextToSpeech textToSpeech;
        az7 az72 = az7;
        h61 h612 = h61;
        if (h612 instanceof v40) {
            v40 = (v40) h612;
            int i4 = v40.G;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                v40.G = i4 - Integer.MIN_VALUE;
                v40 v402 = v40;
                Object obj = v402.E;
                i = v402.G;
                dv7 dv7 = this.e;
                p81 p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    c6 b2 = this.b.b(az72);
                    yz73 = yz7;
                    v402.z = yz73;
                    v402.A = az72;
                    v402.G = 1;
                    obj = gr8.H(b2, v402);
                } else if (i == 1) {
                    az72 = v402.A;
                    yz73 = v402.z;
                    o85.q(obj);
                    vy7 vy7 = (vy7) obj;
                    if (vy7 == null || (str3 = vy7.c) == null) {
                        throw new IllegalStateException("No USSD code found for ".concat(az72.w).toString());
                    }
                    di2 d2 = ((dy7) dv7).d();
                    v402.z = yz73;
                    v402.A = null;
                    v402.B = str3;
                    v402.G = 2;
                    Object H2 = gr8.H(d2, v402);
                    if (H2 != p81) {
                        String str4 = str3;
                        obj = H2;
                        str2 = str4;
                        int defaultSimSlot = ((UserDataPreferences) obj).getDefaultSimSlot();
                        di2 d3 = ((dy7) dv7).d();
                        v402.z = yz73;
                        v402.A = null;
                        v402.B = str2;
                        v402.C = defaultSimSlot;
                        v402.G = 3;
                        H = gr8.H(d3, v402);
                        if (H != p81) {
                        }
                    }
                    return p81;
                } else if (i == 2) {
                    str2 = v402.B;
                    yz73 = v402.z;
                    o85.q(obj);
                    int defaultSimSlot2 = ((UserDataPreferences) obj).getDefaultSimSlot();
                    di2 d32 = ((dy7) dv7).d();
                    v402.z = yz73;
                    v402.A = null;
                    v402.B = str2;
                    v402.C = defaultSimSlot2;
                    v402.G = 3;
                    H = gr8.H(d32, v402);
                    if (H != p81) {
                        yz7 yz74 = yz73;
                        str = str2;
                        i2 = defaultSimSlot2;
                        obj = H;
                        yz72 = yz74;
                        boolean voiceNotificationsUssdEnabled = ((UserDataPreferences) obj).getVoiceNotificationsUssdEnabled();
                        v402.z = yz72;
                        v402.A = null;
                        v402.B = null;
                        v402.C = i2;
                        v402.D = voiceNotificationsUssdEnabled;
                        v402.G = 4;
                        cz7 cz7 = this.a;
                        cz7.getClass();
                        if (Build.VERSION.SDK_INT < 26) {
                        }
                    }
                    return p81;
                } else if (i == 3) {
                    i2 = v402.C;
                    str = v402.B;
                    yz72 = v402.z;
                    o85.q(obj);
                    boolean voiceNotificationsUssdEnabled2 = ((UserDataPreferences) obj).getVoiceNotificationsUssdEnabled();
                    v402.z = yz72;
                    v402.A = null;
                    v402.B = null;
                    v402.C = i2;
                    v402.D = voiceNotificationsUssdEnabled2;
                    v402.G = 4;
                    cz7 cz72 = this.a;
                    cz72.getClass();
                    if (Build.VERSION.SDK_INT < 26) {
                        Object C = b35.C(30000, new q34((f61) null, cz72, i2, str), v402);
                        if (C != p81) {
                            i3 = i2;
                            z = voiceNotificationsUssdEnabled2;
                            obj = C;
                        }
                        return p81;
                    }
                    kj6.n("USSD reading requires Android 8.0 (API 26) or higher");
                    return null;
                } else if (i == 4) {
                    boolean z2 = v402.D;
                    int i5 = v402.C;
                    yz72 = v402.z;
                    o85.q(obj);
                    z = z2;
                    i3 = i5;
                } else if (i == 5) {
                    o85.q(obj);
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yz7 yz75 = yz72;
                String str5 = (String) obj;
                if (z) {
                    n78 n78 = this.f;
                    n78.getClass();
                    str5.getClass();
                    if (n78.b && !d57.I0(str5) && (textToSpeech = n78.a) != null) {
                        textToSpeech.speak(str5, 1, (Bundle) null, "UtilEsVoice");
                    }
                }
                LinkedHashMap d4 = yz75.d(str5);
                Iterable keySet = yz75.a().keySet();
                F = tf4.F(et0.e0(keySet, 10));
                if (F < 16) {
                    F = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(F);
                for (Object next : keySet) {
                    String str6 = (String) d4.get((String) next);
                    if (str6 == null) {
                        str6 = "";
                    }
                    linkedHashMap.put(next, str6);
                }
                w40 w40 = new w40(this, linkedHashMap, yz75, str5, System.currentTimeMillis(), (f61) null);
                v402.z = null;
                v402.A = null;
                v402.B = null;
                v402.C = i3;
                v402.D = z;
                v402.G = 5;
            }
        }
        v40 = new v40(this, h612);
        v40 v4022 = v40;
        Object obj2 = v4022.E;
        i = v4022.G;
        dv7 dv72 = this.e;
        p81 p812 = p81.w;
        if (i != 0) {
        }
        yz7 yz752 = yz72;
        String str52 = (String) obj2;
        if (z) {
        }
        LinkedHashMap d42 = yz752.d(str52);
        Iterable keySet2 = yz752.a().keySet();
        F = tf4.F(et0.e0(keySet2, 10));
        if (F < 16) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(F);
        while (r2.hasNext()) {
        }
        w40 w402 = new w40(this, linkedHashMap2, yz752, str52, System.currentTimeMillis(), (f61) null);
        v4022.z = null;
        v4022.A = null;
        v4022.B = null;
        v4022.C = i3;
        v4022.D = z;
        v4022.G = 5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object m(h61 h61) {
        x40 x40;
        int i;
        if (h61 instanceof x40) {
            x40 = (x40) h61;
            int i2 = x40.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x40.B = i2 - Integer.MIN_VALUE;
                Object obj = x40.z;
                i = x40.B;
                if (i != 0) {
                    o85.q(obj);
                    uz7 uz7 = uz7.a;
                    x40.B = 1;
                    Object l = k(uz7, uz7.c(), x40);
                    p81 p81 = p81.w;
                    if (l == p81) {
                        return p81;
                    }
                    return l;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Exception e3) {
                        return new m66(e3);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        x40 = new x40(this, h61);
        Object obj2 = x40.z;
        i = x40.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object n(String str, h61 h61) {
        y40 y40;
        int i;
        if (h61 instanceof y40) {
            y40 = (y40) h61;
            int i2 = y40.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y40.B = i2 - Integer.MIN_VALUE;
                Object obj = y40.z;
                i = y40.B;
                if (i != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.e;
                    y40.B = 1;
                    Object L = ((dy7) dv7).L(str, y40);
                    p81 p81 = p81.w;
                    if (L == p81) {
                        return p81;
                    }
                    return L;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Exception e3) {
                        return new m66(e3);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        y40 = new y40(this, h61);
        Object obj2 = y40.z;
        i = y40.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object o(String str, h61 h61) {
        z40 z40;
        int i;
        if (h61 instanceof z40) {
            z40 = (z40) h61;
            int i2 = z40.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z40.B = i2 - Integer.MIN_VALUE;
                Object obj = z40.z;
                i = z40.B;
                if (i != 0) {
                    o85.q(obj);
                    h81 h81 = this.g;
                    a50 a50 = new a50(this, str, (f61) null, 0);
                    z40.B = 1;
                    Object e0 = ar7.e0(h81, a50, z40);
                    p81 p81 = p81.w;
                    if (e0 == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Exception e3) {
                        return new m66(e3);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            }
        }
        z40 = new z40(this, h61);
        Object obj2 = z40.z;
        i = z40.B;
        if (i != 0) {
        }
        return vs7.a;
    }
}
