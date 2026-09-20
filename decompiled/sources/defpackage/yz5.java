package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: yz5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yz5 implements fi2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ a06 x;

    public /* synthetic */ yz5(a06 a06, int i) {
        this.w = i;
        this.x = a06;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01eb  */
    public final Object k(Object obj, f61 f61) {
        im0 im0;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String valueOf;
        String valueOf2;
        String valueOf3;
        String valueOf4;
        String valueOf5;
        String valueOf6;
        im0 im02;
        Object obj2;
        is7 is7;
        is7 is72;
        double d;
        int i = this.w;
        vs7 vs7 = vs7.a;
        a06 a06 = this.x;
        switch (i) {
            case b85.b:
                d37 d37 = a06.e;
                d37.l((Object) null, new is7(6, oz5.a((oz5) ((is7) d37.getValue()).a, (yz6) null, 0, 0.0d, 0.0d, 0.0f, 0.0d, ((a54) obj).b(), 2097151)));
                return vs7;
            case 1:
                qm0 qm0 = (qm0) obj;
                d37 d372 = a06.e;
                oz5 oz5 = (oz5) ((is7) d372.getValue()).a;
                km0 km0 = qm0.e;
                if (km0 != null) {
                    String str14 = km0.a;
                    int i2 = km0.e;
                    List list = jm0.a;
                    if (i2 >= 0) {
                        if (k57.u0(str14, "2G", false)) {
                            if (1 > i2 || i2 >= 125) {
                                if (i2 == 0) {
                                    im0 = new im0("E-GSM 900 (B8)", 935.0d);
                                } else if (975 <= i2 && i2 < 1024) {
                                    im0 = new im0("E-GSM 900 (B8)", (((double) (i2 - 1024)) * 0.2d) + 935.0d);
                                } else if (512 <= i2 && i2 < 886) {
                                    im02 = new im0("DCS 1800 (B3)", (((double) (i2 - 512)) * 0.2d) + 1805.2d);
                                } else if (128 <= i2 && i2 < 252) {
                                    im02 = new im0("GSM 850 (B5)", (((double) (i2 - 128)) * 0.2d) + 869.2d);
                                }
                                str = qm0.a;
                                if (str.length() == 0) {
                                    str = "Cubacel";
                                }
                                String str15 = str;
                                String str16 = qm0.b;
                                int i3 = qm0.c;
                                int i4 = qm0.d;
                                if (km0 == null) {
                                    str2 = km0.a;
                                } else {
                                    str2 = "--";
                                }
                                if (km0 != null) {
                                    int i5 = km0.b;
                                    Integer valueOf7 = Integer.valueOf(i5);
                                    if (i5 <= 0) {
                                        valueOf7 = null;
                                    }
                                    if (!(valueOf7 == null || (valueOf6 = String.valueOf(valueOf7.intValue())) == null)) {
                                        str3 = valueOf6;
                                        if (km0 != null) {
                                            int i6 = km0.c;
                                            Integer valueOf8 = Integer.valueOf(i6);
                                            if (i6 <= 0) {
                                                valueOf8 = null;
                                            }
                                            if (!(valueOf8 == null || (valueOf5 = String.valueOf(valueOf8.intValue())) == null)) {
                                                str4 = valueOf5;
                                                if (km0 != null) {
                                                    int i7 = km0.d;
                                                    Integer valueOf9 = Integer.valueOf(i7);
                                                    if (i7 < 0) {
                                                        valueOf9 = null;
                                                    }
                                                    if (!(valueOf9 == null || (valueOf4 = String.valueOf(valueOf9.intValue())) == null)) {
                                                        str5 = valueOf4;
                                                        if (km0 != null) {
                                                            int i8 = km0.e;
                                                            Integer valueOf10 = Integer.valueOf(i8);
                                                            if (i8 <= 0) {
                                                                valueOf10 = null;
                                                            }
                                                            if (!(valueOf10 == null || (valueOf3 = String.valueOf(valueOf10.intValue())) == null)) {
                                                                str6 = valueOf3;
                                                                if (im0 == null) {
                                                                    str7 = im0.a;
                                                                } else {
                                                                    str7 = "--";
                                                                }
                                                                oz5 oz52 = oz5;
                                                                if (im0 == null) {
                                                                    str8 = String.format("%.1f MHz", Arrays.copyOf(new Object[]{Double.valueOf(im0.b)}, 1));
                                                                } else {
                                                                    str8 = "--";
                                                                }
                                                                int i9 = Integer.MIN_VALUE;
                                                                if (km0 != null) {
                                                                    int i10 = km0.h;
                                                                    Integer valueOf11 = Integer.valueOf(i10);
                                                                    if (i10 <= Integer.MIN_VALUE) {
                                                                        valueOf11 = null;
                                                                    }
                                                                    if (valueOf11 != null) {
                                                                        str9 = valueOf11.intValue() + " dB";
                                                                        if (km0 != null) {
                                                                            int i11 = km0.i;
                                                                            Integer valueOf12 = Integer.valueOf(i11);
                                                                            if (i11 <= Integer.MIN_VALUE) {
                                                                                valueOf12 = null;
                                                                            }
                                                                            if (valueOf12 != null) {
                                                                                str10 = (valueOf12.intValue() / 1000) + " MHz";
                                                                                List<km0> list2 = qm0.f;
                                                                                ArrayList arrayList = new ArrayList(et0.e0(list2, 10));
                                                                                for (km0 km02 : list2) {
                                                                                    String str17 = km02.a;
                                                                                    int i12 = km02.b;
                                                                                    Integer valueOf13 = Integer.valueOf(i12);
                                                                                    if (i12 <= 0) {
                                                                                        valueOf13 = null;
                                                                                    }
                                                                                    if (valueOf13 == null || (valueOf2 = String.valueOf(valueOf13.intValue())) == null) {
                                                                                        str11 = "--";
                                                                                    } else {
                                                                                        str11 = valueOf2;
                                                                                    }
                                                                                    int i13 = km02.c;
                                                                                    Integer valueOf14 = Integer.valueOf(i13);
                                                                                    if (i13 <= 0) {
                                                                                        valueOf14 = null;
                                                                                    }
                                                                                    if (valueOf14 == null || (valueOf = String.valueOf(valueOf14.intValue())) == null) {
                                                                                        str12 = "--";
                                                                                    } else {
                                                                                        str12 = valueOf;
                                                                                    }
                                                                                    int i14 = km02.g;
                                                                                    int i15 = km02.f;
                                                                                    if (i15 == i9 || i15 == Integer.MAX_VALUE || i15 >= 0) {
                                                                                        str13 = "--";
                                                                                    } else {
                                                                                        str13 = i15 + " dBm";
                                                                                    }
                                                                                    arrayList.add(new px4(i14, str17, str11, str12, str13));
                                                                                    i9 = Integer.MIN_VALUE;
                                                                                }
                                                                                oz5 oz53 = oz52;
                                                                                oz5 oz54 = new oz5(str15, str16, i3, i4, str2, str3, str4, str5, str6, str7, str8, str9, str10, arrayList, qm0.g, 4161536);
                                                                                yz6 yz6 = oz53.p;
                                                                                long j = oz53.q;
                                                                                double d2 = oz53.r;
                                                                                is7 is73 = new is7(6, oz5.a(oz54, yz6, j, d2, oz53.s, oz53.t, oz53.u, oz53.v, 32767));
                                                                                d372.getClass();
                                                                                d372.l((Object) null, is73);
                                                                                return vs7;
                                                                            }
                                                                        }
                                                                        str10 = "--";
                                                                        List<km0> list22 = qm0.f;
                                                                        ArrayList arrayList2 = new ArrayList(et0.e0(list22, 10));
                                                                        while (r4.hasNext()) {
                                                                        }
                                                                        oz5 oz532 = oz52;
                                                                        oz5 oz542 = new oz5(str15, str16, i3, i4, str2, str3, str4, str5, str6, str7, str8, str9, str10, arrayList2, qm0.g, 4161536);
                                                                        yz6 yz62 = oz532.p;
                                                                        long j2 = oz532.q;
                                                                        double d22 = oz532.r;
                                                                        is7 is732 = new is7(6, oz5.a(oz542, yz62, j2, d22, oz532.s, oz532.t, oz532.u, oz532.v, 32767));
                                                                        d372.getClass();
                                                                        d372.l((Object) null, is732);
                                                                        return vs7;
                                                                    }
                                                                }
                                                                str9 = "--";
                                                                if (km0 != null) {
                                                                }
                                                                str10 = "--";
                                                                List<km0> list222 = qm0.f;
                                                                ArrayList arrayList22 = new ArrayList(et0.e0(list222, 10));
                                                                while (r4.hasNext()) {
                                                                }
                                                                oz5 oz5322 = oz52;
                                                                oz5 oz5422 = new oz5(str15, str16, i3, i4, str2, str3, str4, str5, str6, str7, str8, str9, str10, arrayList22, qm0.g, 4161536);
                                                                yz6 yz622 = oz5322.p;
                                                                long j22 = oz5322.q;
                                                                double d222 = oz5322.r;
                                                                is7 is7322 = new is7(6, oz5.a(oz5422, yz622, j22, d222, oz5322.s, oz5322.t, oz5322.u, oz5322.v, 32767));
                                                                d372.getClass();
                                                                d372.l((Object) null, is7322);
                                                                return vs7;
                                                            }
                                                        }
                                                        str6 = "--";
                                                        if (im0 == null) {
                                                        }
                                                        oz5 oz522 = oz5;
                                                        if (im0 == null) {
                                                        }
                                                        int i92 = Integer.MIN_VALUE;
                                                        if (km0 != null) {
                                                        }
                                                        str9 = "--";
                                                        if (km0 != null) {
                                                        }
                                                        str10 = "--";
                                                        List<km0> list2222 = qm0.f;
                                                        ArrayList arrayList222 = new ArrayList(et0.e0(list2222, 10));
                                                        while (r4.hasNext()) {
                                                        }
                                                        oz5 oz53222 = oz522;
                                                        oz5 oz54222 = new oz5(str15, str16, i3, i4, str2, str3, str4, str5, str6, str7, str8, str9, str10, arrayList222, qm0.g, 4161536);
                                                        yz6 yz6222 = oz53222.p;
                                                        long j222 = oz53222.q;
                                                        double d2222 = oz53222.r;
                                                        is7 is73222 = new is7(6, oz5.a(oz54222, yz6222, j222, d2222, oz53222.s, oz53222.t, oz53222.u, oz53222.v, 32767));
                                                        d372.getClass();
                                                        d372.l((Object) null, is73222);
                                                        return vs7;
                                                    }
                                                }
                                                str5 = "--";
                                                if (km0 != null) {
                                                }
                                                str6 = "--";
                                                if (im0 == null) {
                                                }
                                                oz5 oz5222 = oz5;
                                                if (im0 == null) {
                                                }
                                                int i922 = Integer.MIN_VALUE;
                                                if (km0 != null) {
                                                }
                                                str9 = "--";
                                                if (km0 != null) {
                                                }
                                                str10 = "--";
                                                List<km0> list22222 = qm0.f;
                                                ArrayList arrayList2222 = new ArrayList(et0.e0(list22222, 10));
                                                while (r4.hasNext()) {
                                                }
                                                oz5 oz532222 = oz5222;
                                                oz5 oz542222 = new oz5(str15, str16, i3, i4, str2, str3, str4, str5, str6, str7, str8, str9, str10, arrayList2222, qm0.g, 4161536);
                                                yz6 yz62222 = oz532222.p;
                                                long j2222 = oz532222.q;
                                                double d22222 = oz532222.r;
                                                is7 is732222 = new is7(6, oz5.a(oz542222, yz62222, j2222, d22222, oz532222.s, oz532222.t, oz532222.u, oz532222.v, 32767));
                                                d372.getClass();
                                                d372.l((Object) null, is732222);
                                                return vs7;
                                            }
                                        }
                                        str4 = "--";
                                        if (km0 != null) {
                                        }
                                        str5 = "--";
                                        if (km0 != null) {
                                        }
                                        str6 = "--";
                                        if (im0 == null) {
                                        }
                                        oz5 oz52222 = oz5;
                                        if (im0 == null) {
                                        }
                                        int i9222 = Integer.MIN_VALUE;
                                        if (km0 != null) {
                                        }
                                        str9 = "--";
                                        if (km0 != null) {
                                        }
                                        str10 = "--";
                                        List<km0> list222222 = qm0.f;
                                        ArrayList arrayList22222 = new ArrayList(et0.e0(list222222, 10));
                                        while (r4.hasNext()) {
                                        }
                                        oz5 oz5322222 = oz52222;
                                        oz5 oz5422222 = new oz5(str15, str16, i3, i4, str2, str3, str4, str5, str6, str7, str8, str9, str10, arrayList22222, qm0.g, 4161536);
                                        yz6 yz622222 = oz5322222.p;
                                        long j22222 = oz5322222.q;
                                        double d222222 = oz5322222.r;
                                        is7 is7322222 = new is7(6, oz5.a(oz5422222, yz622222, j22222, d222222, oz5322222.s, oz5322222.t, oz5322222.u, oz5322222.v, 32767));
                                        d372.getClass();
                                        d372.l((Object) null, is7322222);
                                        return vs7;
                                    }
                                }
                                str3 = "--";
                                if (km0 != null) {
                                }
                                str4 = "--";
                                if (km0 != null) {
                                }
                                str5 = "--";
                                if (km0 != null) {
                                }
                                str6 = "--";
                                if (im0 == null) {
                                }
                                oz5 oz522222 = oz5;
                                if (im0 == null) {
                                }
                                int i92222 = Integer.MIN_VALUE;
                                if (km0 != null) {
                                }
                                str9 = "--";
                                if (km0 != null) {
                                }
                                str10 = "--";
                                List<km0> list2222222 = qm0.f;
                                ArrayList arrayList222222 = new ArrayList(et0.e0(list2222222, 10));
                                while (r4.hasNext()) {
                                }
                                oz5 oz53222222 = oz522222;
                                oz5 oz54222222 = new oz5(str15, str16, i3, i4, str2, str3, str4, str5, str6, str7, str8, str9, str10, arrayList222222, qm0.g, 4161536);
                                yz6 yz6222222 = oz53222222.p;
                                long j222222 = oz53222222.q;
                                double d2222222 = oz53222222.r;
                                is7 is73222222 = new is7(6, oz5.a(oz54222222, yz6222222, j222222, d2222222, oz53222222.s, oz53222222.t, oz53222222.u, oz53222222.v, 32767));
                                d372.getClass();
                                d372.l((Object) null, is73222222);
                                return vs7;
                            }
                            im0 = new im0("GSM 900 (B8)", (((double) i2) * 0.2d) + 935.0d);
                            str = qm0.a;
                            if (str.length() == 0) {
                            }
                            String str152 = str;
                            String str162 = qm0.b;
                            int i32 = qm0.c;
                            int i42 = qm0.d;
                            if (km0 == null) {
                            }
                            if (km0 != null) {
                            }
                            str3 = "--";
                            if (km0 != null) {
                            }
                            str4 = "--";
                            if (km0 != null) {
                            }
                            str5 = "--";
                            if (km0 != null) {
                            }
                            str6 = "--";
                            if (im0 == null) {
                            }
                            oz5 oz5222222 = oz5;
                            if (im0 == null) {
                            }
                            int i922222 = Integer.MIN_VALUE;
                            if (km0 != null) {
                            }
                            str9 = "--";
                            if (km0 != null) {
                            }
                            str10 = "--";
                            List<km0> list22222222 = qm0.f;
                            ArrayList arrayList2222222 = new ArrayList(et0.e0(list22222222, 10));
                            while (r4.hasNext()) {
                            }
                            oz5 oz532222222 = oz5222222;
                            oz5 oz542222222 = new oz5(str152, str162, i32, i42, str2, str3, str4, str5, str6, str7, str8, str9, str10, arrayList2222222, qm0.g, 4161536);
                            yz6 yz62222222 = oz532222222.p;
                            long j2222222 = oz532222222.q;
                            double d22222222 = oz532222222.r;
                            is7 is732222222 = new is7(6, oz5.a(oz542222222, yz62222222, j2222222, d22222222, oz532222222.s, oz532222222.t, oz532222222.u, oz532222222.v, 32767));
                            d372.getClass();
                            d372.l((Object) null, is732222222);
                            return vs7;
                        } else if (k57.u0(str14, "3G", false)) {
                            if (10562 <= i2 && i2 < 10839) {
                                im0 = new im0("UMTS 2100 (B1)", ((double) i2) * 0.2d);
                                str = qm0.a;
                                if (str.length() == 0) {
                                }
                                String str1522 = str;
                                String str1622 = qm0.b;
                                int i322 = qm0.c;
                                int i422 = qm0.d;
                                if (km0 == null) {
                                }
                                if (km0 != null) {
                                }
                                str3 = "--";
                                if (km0 != null) {
                                }
                                str4 = "--";
                                if (km0 != null) {
                                }
                                str5 = "--";
                                if (km0 != null) {
                                }
                                str6 = "--";
                                if (im0 == null) {
                                }
                                oz5 oz52222222 = oz5;
                                if (im0 == null) {
                                }
                                int i9222222 = Integer.MIN_VALUE;
                                if (km0 != null) {
                                }
                                str9 = "--";
                                if (km0 != null) {
                                }
                                str10 = "--";
                                List<km0> list222222222 = qm0.f;
                                ArrayList arrayList22222222 = new ArrayList(et0.e0(list222222222, 10));
                                while (r4.hasNext()) {
                                }
                                oz5 oz5322222222 = oz52222222;
                                oz5 oz5422222222 = new oz5(str1522, str1622, i322, i422, str2, str3, str4, str5, str6, str7, str8, str9, str10, arrayList22222222, qm0.g, 4161536);
                                yz6 yz622222222 = oz5322222222.p;
                                long j22222222 = oz5322222222.q;
                                double d222222222 = oz5322222222.r;
                                is7 is7322222222 = new is7(6, oz5.a(oz5422222222, yz622222222, j22222222, d222222222, oz5322222222.s, oz5322222222.t, oz5322222222.u, oz5322222222.v, 32767));
                                d372.getClass();
                                d372.l((Object) null, is7322222222);
                                return vs7;
                            } else if (2937 <= i2 && i2 < 3089) {
                                im0 = new im0("UMTS 900 (B8)", (((double) i2) * 0.2d) + 340.0d);
                                str = qm0.a;
                                if (str.length() == 0) {
                                }
                                String str15222 = str;
                                String str16222 = qm0.b;
                                int i3222 = qm0.c;
                                int i4222 = qm0.d;
                                if (km0 == null) {
                                }
                                if (km0 != null) {
                                }
                                str3 = "--";
                                if (km0 != null) {
                                }
                                str4 = "--";
                                if (km0 != null) {
                                }
                                str5 = "--";
                                if (km0 != null) {
                                }
                                str6 = "--";
                                if (im0 == null) {
                                }
                                oz5 oz522222222 = oz5;
                                if (im0 == null) {
                                }
                                int i92222222 = Integer.MIN_VALUE;
                                if (km0 != null) {
                                }
                                str9 = "--";
                                if (km0 != null) {
                                }
                                str10 = "--";
                                List<km0> list2222222222 = qm0.f;
                                ArrayList arrayList222222222 = new ArrayList(et0.e0(list2222222222, 10));
                                while (r4.hasNext()) {
                                }
                                oz5 oz53222222222 = oz522222222;
                                oz5 oz54222222222 = new oz5(str15222, str16222, i3222, i4222, str2, str3, str4, str5, str6, str7, str8, str9, str10, arrayList222222222, qm0.g, 4161536);
                                yz6 yz6222222222 = oz53222222222.p;
                                long j222222222 = oz53222222222.q;
                                double d2222222222 = oz53222222222.r;
                                is7 is73222222222 = new is7(6, oz5.a(oz54222222222, yz6222222222, j222222222, d2222222222, oz53222222222.s, oz53222222222.t, oz53222222222.u, oz53222222222.v, 32767));
                                d372.getClass();
                                d372.l((Object) null, is73222222222);
                                return vs7;
                            } else if (9662 <= i2 && i2 < 9939) {
                                im0 = new im0("UMTS 1900 (B2)", ((double) i2) * 0.2d);
                                str = qm0.a;
                                if (str.length() == 0) {
                                }
                                String str152222 = str;
                                String str162222 = qm0.b;
                                int i32222 = qm0.c;
                                int i42222 = qm0.d;
                                if (km0 == null) {
                                }
                                if (km0 != null) {
                                }
                                str3 = "--";
                                if (km0 != null) {
                                }
                                str4 = "--";
                                if (km0 != null) {
                                }
                                str5 = "--";
                                if (km0 != null) {
                                }
                                str6 = "--";
                                if (im0 == null) {
                                }
                                oz5 oz5222222222 = oz5;
                                if (im0 == null) {
                                }
                                int i922222222 = Integer.MIN_VALUE;
                                if (km0 != null) {
                                }
                                str9 = "--";
                                if (km0 != null) {
                                }
                                str10 = "--";
                                List<km0> list22222222222 = qm0.f;
                                ArrayList arrayList2222222222 = new ArrayList(et0.e0(list22222222222, 10));
                                while (r4.hasNext()) {
                                }
                                oz5 oz532222222222 = oz5222222222;
                                oz5 oz542222222222 = new oz5(str152222, str162222, i32222, i42222, str2, str3, str4, str5, str6, str7, str8, str9, str10, arrayList2222222222, qm0.g, 4161536);
                                yz6 yz62222222222 = oz532222222222.p;
                                long j2222222222 = oz532222222222.q;
                                double d22222222222 = oz532222222222.r;
                                is7 is732222222222 = new is7(6, oz5.a(oz542222222222, yz62222222222, j2222222222, d22222222222, oz532222222222.s, oz532222222222.t, oz532222222222.u, oz532222222222.v, 32767));
                                d372.getClass();
                                d372.l((Object) null, is732222222222);
                                return vs7;
                            } else if (4357 <= i2 && i2 < 4459) {
                                im0 = new im0("UMTS 850 (B5)", ((double) i2) * 0.2d);
                                str = qm0.a;
                                if (str.length() == 0) {
                                }
                                String str1522222 = str;
                                String str1622222 = qm0.b;
                                int i322222 = qm0.c;
                                int i422222 = qm0.d;
                                if (km0 == null) {
                                }
                                if (km0 != null) {
                                }
                                str3 = "--";
                                if (km0 != null) {
                                }
                                str4 = "--";
                                if (km0 != null) {
                                }
                                str5 = "--";
                                if (km0 != null) {
                                }
                                str6 = "--";
                                if (im0 == null) {
                                }
                                oz5 oz52222222222 = oz5;
                                if (im0 == null) {
                                }
                                int i9222222222 = Integer.MIN_VALUE;
                                if (km0 != null) {
                                }
                                str9 = "--";
                                if (km0 != null) {
                                }
                                str10 = "--";
                                List<km0> list222222222222 = qm0.f;
                                ArrayList arrayList22222222222 = new ArrayList(et0.e0(list222222222222, 10));
                                while (r4.hasNext()) {
                                }
                                oz5 oz5322222222222 = oz52222222222;
                                oz5 oz5422222222222 = new oz5(str1522222, str1622222, i322222, i422222, str2, str3, str4, str5, str6, str7, str8, str9, str10, arrayList22222222222, qm0.g, 4161536);
                                yz6 yz622222222222 = oz5322222222222.p;
                                long j22222222222 = oz5322222222222.q;
                                double d222222222222 = oz5322222222222.r;
                                is7 is7322222222222 = new is7(6, oz5.a(oz5422222222222, yz622222222222, j22222222222, d222222222222, oz5322222222222.s, oz5322222222222.t, oz5322222222222.u, oz5322222222222.v, 32767));
                                d372.getClass();
                                d372.l((Object) null, is7322222222222);
                                return vs7;
                            }
                        } else if (k57.u0(str14, "4G", false)) {
                            Iterator it = jm0.a.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    re3 re3 = ((nd4) obj2).a;
                                    int i16 = re3.w;
                                    if (i2 > re3.x || i16 > i2) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            nd4 nd4 = (nd4) obj2;
                            if (nd4 != null) {
                                im0 = new im0(nd4.b, (((double) (i2 - nd4.a.w)) * 0.1d) + nd4.c);
                                str = qm0.a;
                                if (str.length() == 0) {
                                }
                                String str15222222 = str;
                                String str16222222 = qm0.b;
                                int i3222222 = qm0.c;
                                int i4222222 = qm0.d;
                                if (km0 == null) {
                                }
                                if (km0 != null) {
                                }
                                str3 = "--";
                                if (km0 != null) {
                                }
                                str4 = "--";
                                if (km0 != null) {
                                }
                                str5 = "--";
                                if (km0 != null) {
                                }
                                str6 = "--";
                                if (im0 == null) {
                                }
                                oz5 oz522222222222 = oz5;
                                if (im0 == null) {
                                }
                                int i92222222222 = Integer.MIN_VALUE;
                                if (km0 != null) {
                                }
                                str9 = "--";
                                if (km0 != null) {
                                }
                                str10 = "--";
                                List<km0> list2222222222222 = qm0.f;
                                ArrayList arrayList222222222222 = new ArrayList(et0.e0(list2222222222222, 10));
                                while (r4.hasNext()) {
                                }
                                oz5 oz53222222222222 = oz522222222222;
                                oz5 oz54222222222222 = new oz5(str15222222, str16222222, i3222222, i4222222, str2, str3, str4, str5, str6, str7, str8, str9, str10, arrayList222222222222, qm0.g, 4161536);
                                yz6 yz6222222222222 = oz53222222222222.p;
                                long j222222222222 = oz53222222222222.q;
                                double d2222222222222 = oz53222222222222.r;
                                is7 is73222222222222 = new is7(6, oz5.a(oz54222222222222, yz6222222222222, j222222222222, d2222222222222, oz53222222222222.s, oz53222222222222.t, oz53222222222222.u, oz53222222222222.v, 32767));
                                d372.getClass();
                                d372.l((Object) null, is73222222222222);
                                return vs7;
                            }
                        } else if (k57.u0(str14, "5G", false)) {
                            if (i2 >= 0 && i2 < 600000) {
                                im02 = new im0("5G NR FR1", ((double) i2) * 0.005d);
                            } else if (600000 <= i2 && i2 < 2016667) {
                                im0 = new im0("5G NR FR1", (((double) (i2 - 600000)) * 0.015d) + 3000.0d);
                                str = qm0.a;
                                if (str.length() == 0) {
                                }
                                String str152222222 = str;
                                String str162222222 = qm0.b;
                                int i32222222 = qm0.c;
                                int i42222222 = qm0.d;
                                if (km0 == null) {
                                }
                                if (km0 != null) {
                                }
                                str3 = "--";
                                if (km0 != null) {
                                }
                                str4 = "--";
                                if (km0 != null) {
                                }
                                str5 = "--";
                                if (km0 != null) {
                                }
                                str6 = "--";
                                if (im0 == null) {
                                }
                                oz5 oz5222222222222 = oz5;
                                if (im0 == null) {
                                }
                                int i922222222222 = Integer.MIN_VALUE;
                                if (km0 != null) {
                                }
                                str9 = "--";
                                if (km0 != null) {
                                }
                                str10 = "--";
                                List<km0> list22222222222222 = qm0.f;
                                ArrayList arrayList2222222222222 = new ArrayList(et0.e0(list22222222222222, 10));
                                while (r4.hasNext()) {
                                }
                                oz5 oz532222222222222 = oz5222222222222;
                                oz5 oz542222222222222 = new oz5(str152222222, str162222222, i32222222, i42222222, str2, str3, str4, str5, str6, str7, str8, str9, str10, arrayList2222222222222, qm0.g, 4161536);
                                yz6 yz62222222222222 = oz532222222222222.p;
                                long j2222222222222 = oz532222222222222.q;
                                double d22222222222222 = oz532222222222222.r;
                                is7 is732222222222222 = new is7(6, oz5.a(oz542222222222222, yz62222222222222, j2222222222222, d22222222222222, oz532222222222222.s, oz532222222222222.t, oz532222222222222.u, oz532222222222222.v, 32767));
                                d372.getClass();
                                d372.l((Object) null, is732222222222222);
                                return vs7;
                            }
                        }
                        im0 = im02;
                        str = qm0.a;
                        if (str.length() == 0) {
                        }
                        String str1522222222 = str;
                        String str1622222222 = qm0.b;
                        int i322222222 = qm0.c;
                        int i422222222 = qm0.d;
                        if (km0 == null) {
                        }
                        if (km0 != null) {
                        }
                        str3 = "--";
                        if (km0 != null) {
                        }
                        str4 = "--";
                        if (km0 != null) {
                        }
                        str5 = "--";
                        if (km0 != null) {
                        }
                        str6 = "--";
                        if (im0 == null) {
                        }
                        oz5 oz52222222222222 = oz5;
                        if (im0 == null) {
                        }
                        int i9222222222222 = Integer.MIN_VALUE;
                        if (km0 != null) {
                        }
                        str9 = "--";
                        if (km0 != null) {
                        }
                        str10 = "--";
                        List<km0> list222222222222222 = qm0.f;
                        ArrayList arrayList22222222222222 = new ArrayList(et0.e0(list222222222222222, 10));
                        while (r4.hasNext()) {
                        }
                        oz5 oz5322222222222222 = oz52222222222222;
                        oz5 oz5422222222222222 = new oz5(str1522222222, str1622222222, i322222222, i422222222, str2, str3, str4, str5, str6, str7, str8, str9, str10, arrayList22222222222222, qm0.g, 4161536);
                        yz6 yz622222222222222 = oz5322222222222222.p;
                        long j22222222222222 = oz5322222222222222.q;
                        double d222222222222222 = oz5322222222222222.r;
                        is7 is7322222222222222 = new is7(6, oz5.a(oz5422222222222222, yz622222222222222, j22222222222222, d222222222222222, oz5322222222222222.s, oz5322222222222222.t, oz5322222222222222.u, oz5322222222222222.v, 32767));
                        d372.getClass();
                        d372.l((Object) null, is7322222222222222);
                        return vs7;
                    }
                }
                im0 = null;
                str = qm0.a;
                if (str.length() == 0) {
                }
                String str15222222222 = str;
                String str16222222222 = qm0.b;
                int i3222222222 = qm0.c;
                int i4222222222 = qm0.d;
                if (km0 == null) {
                }
                if (km0 != null) {
                }
                str3 = "--";
                if (km0 != null) {
                }
                str4 = "--";
                if (km0 != null) {
                }
                str5 = "--";
                if (km0 != null) {
                }
                str6 = "--";
                if (im0 == null) {
                }
                oz5 oz522222222222222 = oz5;
                if (im0 == null) {
                }
                int i92222222222222 = Integer.MIN_VALUE;
                if (km0 != null) {
                }
                str9 = "--";
                if (km0 != null) {
                }
                str10 = "--";
                List<km0> list2222222222222222 = qm0.f;
                ArrayList arrayList222222222222222 = new ArrayList(et0.e0(list2222222222222222, 10));
                while (r4.hasNext()) {
                }
                oz5 oz53222222222222222 = oz522222222222222;
                oz5 oz54222222222222222 = new oz5(str15222222222, str16222222222, i3222222222, i4222222222, str2, str3, str4, str5, str6, str7, str8, str9, str10, arrayList222222222222222, qm0.g, 4161536);
                yz6 yz6222222222222222 = oz53222222222222222.p;
                long j222222222222222 = oz53222222222222222.q;
                double d2222222222222222 = oz53222222222222222.r;
                is7 is73222222222222222 = new is7(6, oz5.a(oz54222222222222222, yz6222222222222222, j222222222222222, d2222222222222222, oz53222222222222222.s, oz53222222222222222.t, oz53222222222222222.u, oz53222222222222222.v, 32767));
                d372.getClass();
                d372.l((Object) null, is73222222222222222);
                return vs7;
            default:
                e07 e07 = (e07) obj;
                d37 d373 = a06.e;
                oz5 oz55 = (oz5) ((is7) d373.getValue()).a;
                yz6 yz63 = e07.a;
                long j3 = e07.b;
                double d3 = e07.c;
                double d4 = e07.d;
                float f = e07.e;
                int ordinal = yz63.ordinal();
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        is72 = is7;
                        d = e07.d;
                    } else if (ordinal != 4) {
                        d = 0.0d;
                        is72 = is7;
                    }
                    d373.l((Object) null, new is7(6, oz5.a(oz55, yz63, j3, d3, d4, f, d, false, 2129919)));
                    return vs7;
                }
                is72 = is7;
                d = d3;
                d373.l((Object) null, new is7(6, oz5.a(oz55, yz63, j3, d3, d4, f, d, false, 2129919)));
                return vs7;
        }
    }
}
