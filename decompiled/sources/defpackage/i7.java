package defpackage;

import cu.lestebang.utiletecsa.data.repository.account.LicenseRequestDto;
import io.github.jan.supabase.auth.user.UserInfo;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: i7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i7 extends a97 implements gs2 {
    public String A;
    public Object B;
    public p7 C;
    public UserInfo D;
    public Object E;
    public String F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ String I;
    public final /* synthetic */ byte[] J;
    public final /* synthetic */ p7 K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i7(String str, byte[] bArr, p7 p7Var, f61 f61) {
        super(2, f61);
        this.I = str;
        this.J = bArr;
        this.K = p7Var;
    }

    public final Object H(Object obj, Object obj2) {
        return ((i7) o((f61) obj2, (o81) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        i7 i7Var = new i7(this.I, this.J, this.K, f61);
        i7Var.H = obj;
        return i7Var;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:18|(0)|104|105) */
    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        r5.H = null;
        r5.A = null;
        r5.B = null;
        r5.C = null;
        r5.D = null;
        r5.E = r0;
        r5.F = null;
        r5.G = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x030a, code lost:
        if (defpackage.a35.k(r4.a).l(r2).q(new java.lang.String[]{r1}, r5) == r9) goto L_0x030c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x030c, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x013d, code lost:
        r1 = (defpackage.jm5) r1;
        r2 = r1.b.d;
        r1 = r1.a;
        r3 = defpackage.gs3.c;
        r1 = (cu.lestebang.utiletecsa.data.repository.account.LicenseRequestDto) defpackage.dt0.y0((java.util.List) ((defpackage.f96) r2).s(defpackage.b26.c(r6, defpackage.x91.C(defpackage.b26.b(r16))), r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0161, code lost:
        if (r1 == null) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0163, code lost:
        r1 = r1.getImagePath();
        r27 = r11;
        r11 = r10;
        r10 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x016d, code lost:
        r1 = r11;
        r11 = r10;
        r10 = r1;
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0179, code lost:
        if (r13 == null) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x017b, code lost:
        r2 = r10.getId();
        r5.H = r0;
        r5.A = r12;
        r5.B = r11;
        r5.C = null;
        r5.D = r10;
        r5.E = r1;
        r5.F = null;
        r5.G = 2;
        r2 = defpackage.p7.b(r11, r2, r13, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0195, code lost:
        if (r2 != r9) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x019b, code lost:
        r24 = (java.lang.String) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x019d, code lost:
        r4 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x019f, code lost:
        r24 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r2 = defpackage.f55.i(r4.a, r18);
        r3 = r2.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01c5, code lost:
        r7 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r8 = defpackage.sg3.D(new cu.lestebang.utiletecsa.data.repository.account.LicenseRequestDto(r10.getId(), defpackage.d57.k1(r12).toString(), "PENDING", (java.lang.String) null, r24, 8, (defpackage.hl1) null));
        r10 = r3.d;
        r11 = defpackage.pl3.d;
        r13 = defpackage.gs3.c;
        r6 = ((defpackage.f96) r10).t(defpackage.b26.c(r6, defpackage.x91.C(defpackage.b26.b(r16))), r8);
        r11.getClass();
        r6 = defpackage.em3.d((kotlinx.serialization.json.JsonElement) r11.b(kotlinx.serialization.json.JsonElement.Companion.serializer(), r6));
        r8 = new defpackage.yc3(r2.c, r3.c.v);
        r8.e(defpackage.i53.c);
        r8.e = r6;
        r10 = new java.util.ArrayList();
        r6 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0217, code lost:
        if (r6.hasNext() == false) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        defpackage.it0.h0(r10, defpackage.em3.e((kotlinx.serialization.json.JsonElement) r6.next()).keySet());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x022d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x022e, code lost:
        r1 = r7;
        r2 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r18 = defpackage.dt0.b1(defpackage.dt0.f1(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x023f, code lost:
        if (r18.isEmpty() != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r8.f.put("columns", defpackage.sg3.D(defpackage.dt0.E0(r18, ",", (java.lang.String) null, (java.lang.String) null, (defpackage.vr2) null, 62)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r6 = defpackage.h66.a;
        r2 = r2.b;
        r5.H = r0;
        r5.A = r12;
        r5.B = r4;
        r5.C = null;
        r5.D = null;
        r5.E = r1;
        r5.F = r7;
        r5.G = 3;
        r0 = r6.a(r3, r2, r8, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0274, code lost:
        if (r0 != r9) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0278, code lost:
        r6 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0279, code lost:
        r0 = (defpackage.jm5) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x027b, code lost:
        if (r1 == null) goto L_0x02b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0281, code lost:
        if (r1.equals(r7) != false) goto L_0x02b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r5.H = null;
        r5.A = r6;
        r5.B = r4;
        r5.C = null;
        r5.D = null;
        r5.E = null;
        r5.F = null;
        r5.G = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02a9, code lost:
        if (defpackage.a35.k(r4.a).l(r17).q(new java.lang.String[]{r1}, r5) != r9) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02d6, code lost:
        if (r0 != r9) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02d9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02da, code lost:
        r2 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02dc, code lost:
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02de, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02df, code lost:
        r2 = r17;
        r7 = r24;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:104:0x030d */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02e6  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:90:0x02b0=Splitter:B:90:0x02b0, B:104:0x030d=Splitter:B:104:0x030d} */
    public final Object s(Object obj) {
        Object obj2;
        p7 p7Var;
        String str;
        String str2;
        p7 p7Var2;
        String str3;
        String str4;
        String str5;
        Class<LicenseRequestDto> cls;
        String str6;
        byte[] bArr;
        UserInfo userInfo;
        p7 p7Var3;
        Object obj3;
        o81 o81 = (o81) this.H;
        int i = this.G;
        String str7 = "license-images";
        Class<LicenseRequestDto> cls2 = LicenseRequestDto.class;
        Class<List> cls3 = List.class;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                o85.q(obj);
                str6 = this.I;
                p7Var3 = this.K;
                j77 j77 = p7Var3.a;
                boolean I0 = d57.I0(str6);
                bArr = this.J;
                if (!I0 || bArr != null) {
                    userInfo = rg3.t(j77).j();
                    if (userInfo != null) {
                        if (bArr == null) {
                            str3 = str7;
                            cls = cls2;
                            str5 = "license_requests";
                            break;
                        } else {
                            hm5 i2 = f55.i(j77, "license_requests");
                            gm5 gm5 = i2.a;
                            String str8 = i2.c;
                            cls = cls2;
                            ku4 ku4 = gm5.c.v;
                            im5 im5 = new im5(str8, ku4);
                            str3 = str7;
                            str5 = "license_requests";
                            zc9 zc9 = new zc9(ku4, im5.f, 4);
                            String id = userInfo.getId();
                            id.getClass();
                            zc9.a("user_id", xd2.EQ, id);
                            im5.d("*");
                            h66 h66 = h66.a;
                            String str9 = i2.b;
                            this.H = o81;
                            this.A = str6;
                            this.B = bArr;
                            this.C = p7Var3;
                            this.D = null;
                            this.E = userInfo;
                            this.F = null;
                            this.G = 1;
                            obj3 = h66.a(gm5, str9, im5, this);
                            if (obj3 == p81) {
                                break;
                            }
                        }
                    } else {
                        throw new IllegalStateException("Debes iniciar sesión para enviar el ID de transferencia.");
                    }
                } else {
                    throw new IllegalStateException("Escribe el ID de transferencia o adjunta el comprobante.");
                }
                break;
            case 1:
                hm5 hm5 = (hm5) this.F;
                UserInfo userInfo2 = (UserInfo) this.E;
                f61 f61 = (f61) this.D;
                p7Var3 = this.C;
                byte[] bArr2 = (byte[]) this.B;
                str6 = this.A;
                o85.q(obj);
                str3 = str7;
                cls = cls2;
                str5 = "license_requests";
                bArr = bArr2;
                userInfo = userInfo2;
                obj3 = obj;
                break;
            case 2:
                byte[] bArr3 = (byte[]) this.F;
                str4 = (String) this.E;
                UserInfo userInfo3 = this.D;
                f61 f612 = (f61) this.C;
                p7 p7Var4 = (p7) this.B;
                str6 = this.A;
                o85.q(obj);
                str3 = str7;
                cls = cls2;
                str5 = "license_requests";
                Object obj4 = obj;
                break;
            case 3:
                String str10 = this.F;
                String str11 = (String) this.E;
                f61 f613 = (f61) this.C;
                p7Var = (p7) this.B;
                str = this.A;
                try {
                    o85.q(obj);
                    String str12 = str10;
                    str3 = str7;
                    str4 = str11;
                    Object obj5 = obj;
                    break;
                } catch (Throwable th) {
                    th = th;
                    if (str10 != null) {
                    }
                    throw th;
                }
                break;
            case 4:
                o81 o812 = (o81) this.F;
                th = (Throwable) this.E;
                String str13 = (String) this.D;
                String str14 = (String) this.C;
                UserInfo userInfo4 = (UserInfo) this.B;
                f61 f614 = (f61) this.A;
                o85.q(obj);
                break;
            case 5:
                String str15 = (String) this.E;
                f61 f615 = (f61) this.C;
                p7Var2 = (p7) this.B;
                str2 = this.A;
                try {
                    o85.q(obj);
                    break;
                } catch (Throwable unused) {
                    break;
                }
            case 6:
                String str16 = (String) this.D;
                String str17 = (String) this.C;
                UserInfo userInfo5 = (UserInfo) this.B;
                f61 f616 = (f61) this.A;
                try {
                    o85.q(obj);
                    obj2 = obj;
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    obj2 = new m66(e2);
                    break;
                }
            default:
                h.s("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
        p7Var2 = p7Var;
        str2 = str;
        p7Var = p7Var2;
        str = str2;
        dv7 dv7 = p7Var.c;
        String obj6 = d57.k1(str).toString();
        this.H = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = 6;
        obj2 = ((dy7) dv7).h("PENDING", obj6, 0, this);
        return new o66(obj2);
        p7Var = p7Var2;
        str = str2;
        dv7 dv72 = p7Var.c;
        String obj62 = d57.k1(str).toString();
        this.H = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = 6;
        obj2 = ((dy7) dv72).h("PENDING", obj62, 0, this);
    }
}
