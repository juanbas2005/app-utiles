package defpackage;

import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import cu.lestebang.utiletecsa.data.repository.spots.SpotFeedDto;
import java.util.UUID;

/* renamed from: d17  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d17 {
    public final j77 a;
    public final dv7 b;
    public final h81 c;

    public d17(j77 j77, dv7 dv7, h81 h81) {
        j77.getClass();
        dv7.getClass();
        this.a = j77;
        this.b = dv7;
        this.c = h81;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (r5 == r4) goto L_0x0070;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    public static final Object a(d17 d17, h61 h61) {
        x07 x07;
        int i;
        String spotsDeviceId;
        dv7 dv7 = d17.b;
        if (h61 instanceof x07) {
            x07 = (x07) h61;
            int i2 = x07.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x07.C = i2 - Integer.MIN_VALUE;
                Object obj = x07.A;
                i = x07.C;
                p81 p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    di2 d = ((dy7) dv7).d();
                    x07.C = 1;
                    obj = gr8.H(d, x07);
                } else if (i == 1) {
                    o85.q(obj);
                } else if (i == 2) {
                    String str = x07.z;
                    o85.q(obj);
                    return str;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                spotsDeviceId = ((UserDataPreferences) obj).getSpotsDeviceId();
                if (spotsDeviceId.length() <= 0) {
                    return spotsDeviceId;
                }
                String uuid = UUID.randomUUID().toString();
                uuid.getClass();
                x07.z = uuid;
                x07.C = 2;
                if (((dy7) dv7).H(uuid, x07) == p81) {
                    return p81;
                }
                return uuid;
            }
        }
        x07 = new x07(d17, h61);
        Object obj2 = x07.A;
        i = x07.C;
        p81 p812 = p81.w;
        if (i != 0) {
        }
        spotsDeviceId = ((UserDataPreferences) obj2).getSpotsDeviceId();
        if (spotsDeviceId.length() <= 0) {
        }
    }

    public static final o11 b(d17 d17, SpotFeedDto spotFeedDto, String str, int i) {
        Object obj;
        Object obj2;
        String str2;
        String str3;
        d17.getClass();
        try {
            obj = r11.valueOf(spotFeedDto.getConnectionType());
        } catch (Throwable th) {
            obj = new m66(th);
        }
        if (obj instanceof m66) {
            obj = null;
        }
        r11 r11 = (r11) obj;
        if (r11 == null) {
            return null;
        }
        try {
            obj2 = q07.valueOf(spotFeedDto.getQuality());
        } catch (Throwable th2) {
            obj2 = new m66(th2);
        }
        if (obj2 instanceof m66) {
            obj2 = null;
        }
        q07 q07 = (q07) obj2;
        if (q07 == null) {
            return null;
        }
        String id = spotFeedDto.getId();
        String nick = spotFeedDto.getNick();
        String address = spotFeedDto.getAddress();
        String province = spotFeedDto.getProvince();
        if (province == null) {
            str2 = "";
        } else {
            str2 = province;
        }
        String note = spotFeedDto.getNote();
        if (note == null) {
            str3 = "";
        } else {
            str3 = note;
        }
        return new o11(id, nick, r11, q07, address, str2, str3, spotFeedDto.getLatitude(), spotFeedDto.getLongitude(), d57.i1(10, spotFeedDto.getCreatedAt()), spotFeedDto.getLikes(), spotFeedDto.getDislikes(), i, sg3.e(spotFeedDto.getDeviceId(), str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object c(dz4 dz4, h61 h61) {
        t07 t07;
        int i;
        if (h61 instanceof t07) {
            t07 = (t07) h61;
            int i2 = t07.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t07.B = i2 - Integer.MIN_VALUE;
                Object obj = t07.z;
                i = t07.B;
                if (i != 0) {
                    o85.q(obj);
                    u07 u07 = new u07(dz4, this, (f61) null);
                    t07.B = 1;
                    obj = ar7.e0(this.c, u07, t07);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj).w;
            }
        }
        t07 = new t07(this, h61);
        Object obj2 = t07.z;
        i = t07.B;
        if (i != 0) {
        }
        return ((o66) obj2).w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object d(String str, h61 h61) {
        v07 v07;
        int i;
        if (h61 instanceof v07) {
            v07 = (v07) h61;
            int i2 = v07.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v07.B = i2 - Integer.MIN_VALUE;
                Object obj = v07.z;
                i = v07.B;
                if (i != 0) {
                    o85.q(obj);
                    w07 w07 = new w07(this, str, (f61) null);
                    v07.B = 1;
                    obj = ar7.e0(this.c, w07, v07);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj).w;
            }
        }
        v07 = new v07(this, h61);
        Object obj2 = v07.z;
        i = v07.B;
        if (i != 0) {
        }
        return ((o66) obj2).w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object e(h61 h61) {
        y07 y07;
        int i;
        if (h61 instanceof y07) {
            y07 = (y07) h61;
            int i2 = y07.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y07.B = i2 - Integer.MIN_VALUE;
                Object obj = y07.z;
                i = y07.B;
                if (i != 0) {
                    o85.q(obj);
                    ng ngVar = new ng(this, (f61) null, 19);
                    y07.B = 1;
                    obj = ar7.e0(this.c, ngVar, y07);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj).w;
            }
        }
        y07 = new y07(this, h61);
        Object obj2 = y07.z;
        i = y07.B;
        if (i != 0) {
        }
        return ((o66) obj2).w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object f(String str, boolean z, h61 h61) {
        b17 b17;
        int i;
        if (h61 instanceof b17) {
            b17 = (b17) h61;
            int i2 = b17.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b17.B = i2 - Integer.MIN_VALUE;
                Object obj = b17.z;
                i = b17.B;
                if (i != 0) {
                    o85.q(obj);
                    c17 c17 = new c17(this, str, z, (f61) null);
                    b17.B = 1;
                    obj = ar7.e0(this.c, c17, b17);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj).w;
            }
        }
        b17 = new b17(this, h61);
        Object obj2 = b17.z;
        i = b17.B;
        if (i != 0) {
        }
        return ((o66) obj2).w;
    }
}
