package defpackage;

import android.app.Activity;
import cu.lestebang.utiletecsa.data.repository.account.LicensePricingDto;
import cu.lestebang.utiletecsa.data.repository.account.LicenseRequestDto;
import cu.lestebang.utiletecsa.data.repository.profile.ProfileRowDto;
import io.github.jan.supabase.auth.exception.AuthRestException;
import io.github.jan.supabase.auth.user.UserInfo;
import io.github.jan.supabase.exceptions.HttpRequestException;
import io.ktor.client.plugins.HttpRequestTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: p7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p7 {
    public final j77 a;
    public final mb1 b;
    public final dv7 c;
    public final h81 d;

    public p7(j77 j77, mb1 mb1, dv7 dv7, h81 h81) {
        j77.getClass();
        mb1.getClass();
        dv7.getClass();
        this.a = j77;
        this.b = mb1;
        this.c = dv7;
        this.d = h81;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    public static final Object a(p7 p7Var, vr2 vr2, h61 h61) {
        m7 m7Var;
        int i;
        int i2;
        String str;
        p7Var.getClass();
        if (h61 instanceof m7) {
            m7Var = (m7) h61;
            int i3 = m7Var.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                m7Var.B = i3 - Integer.MIN_VALUE;
                Object obj2 = m7Var.z;
                i = m7Var.B;
                if (i != 0) {
                    o85.q(obj2);
                    m7Var.B = 1;
                    Object y = vr2.y(m7Var);
                    p81 p81 = p81.w;
                    if (y == p81) {
                        return p81;
                    }
                    return y;
                } else if (i == 1) {
                    try {
                        o85.q(obj2);
                        return obj2;
                    } catch (HttpRequestTimeoutException e) {
                        throw new IllegalStateException("El servidor tardó demasiado en responder. Revisa tu conexión e inténtalo de nuevo.", e);
                    } catch (HttpRequestException e2) {
                        throw new IllegalStateException("No se pudo conectar con el servidor. Revisa tu conexión e inténtalo de nuevo.", e2);
                    } catch (AuthRestException e3) {
                        yu yuVar = yu.EmailNotConfirmed;
                        yu yuVar2 = e3.x;
                        if (yuVar2 != yuVar) {
                            if (yuVar2 == null) {
                                i2 = -1;
                            } else {
                                i2 = w5.a[yuVar2.ordinal()];
                            }
                            switch (i2) {
                                case 1:
                                    str = "Correo o contraseña incorrectos.";
                                    break;
                                case 2:
                                case 3:
                                    str = "Ya existe una cuenta con ese correo.";
                                    break;
                                case 4:
                                    str = "La contraseña es demasiado débil.";
                                    break;
                                case 5:
                                    str = "El código es incorrecto o ha caducado. Solicita uno nuevo.";
                                    break;
                                case 6:
                                    str = "La nueva contraseña debe ser diferente a la anterior.";
                                    break;
                                case 7:
                                    str = "El envío de códigos está deshabilitado.";
                                    break;
                                case 8:
                                    str = "Demasiados intentos. Espera unos minutos e inténtalo de nuevo.";
                                    break;
                                case 9:
                                    str = "El envío de correos está limitado. Inténtalo más tarde o al día siguiente.";
                                    break;
                                default:
                                    str = e3.getMessage();
                                    if (str == null) {
                                        str = "Error de autenticación.";
                                        break;
                                    }
                                    break;
                            }
                            throw new IllegalStateException(str, e3);
                        }
                        throw new IllegalStateException("Debes confirmar tu correo antes de iniciar sesión.", e3);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        m7Var = new m7(p7Var, h61);
        Object obj22 = m7Var.z;
        i = m7Var.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    public static final Object b(p7 p7Var, String str, byte[] bArr, h61 h61) {
        n7 n7Var;
        int i;
        p7Var.getClass();
        if (h61 instanceof n7) {
            n7Var = (n7) h61;
            int i2 = n7Var.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n7Var.C = i2 - Integer.MIN_VALUE;
                Object obj2 = n7Var.A;
                i = n7Var.C;
                if (i != 0) {
                    o85.q(obj2);
                    String str2 = str + "/" + UUID.randomUUID() + ".jpg";
                    am6 l = a35.k(p7Var.a).l("license-images");
                    j5 j5Var = new j5(1);
                    n7Var.z = str2;
                    n7Var.C = 1;
                    Object U = l.U(str2, bArr, j5Var, n7Var);
                    p81 p81 = p81.w;
                    if (U == p81) {
                        return p81;
                    }
                    return str2;
                } else if (i == 1) {
                    String str3 = n7Var.z;
                    o85.q(obj2);
                    return str3;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        n7Var = new n7(p7Var, h61);
        Object obj22 = n7Var.A;
        i = n7Var.C;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object c(h61 h61) {
        x5 x5Var;
        int i;
        if (h61 instanceof x5) {
            x5Var = (x5) h61;
            int i2 = x5Var.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x5Var.B = i2 - Integer.MIN_VALUE;
                Object obj2 = x5Var.z;
                i = x5Var.B;
                if (i != 0) {
                    o85.q(obj2);
                    y5 y5Var = new y5(this, (f61) null, 0);
                    x5Var.B = 1;
                    obj2 = ar7.e0(this.d, y5Var, x5Var);
                    p81 p81 = p81.w;
                    if (obj2 == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj2);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj2).w;
            }
        }
        x5Var = new x5(this, h61);
        Object obj22 = x5Var.z;
        i = x5Var.B;
        if (i != 0) {
        }
        return ((o66) obj22).w;
    }

    public final c6 d() {
        return new c6(((dy7) this.c).d(), 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object e(String str, h61 h61) {
        h6 h6Var;
        int i;
        if (h61 instanceof h6) {
            h6Var = (h6) h61;
            int i2 = h6Var.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h6Var.B = i2 - Integer.MIN_VALUE;
                Object obj2 = h6Var.z;
                i = h6Var.B;
                if (i != 0) {
                    o85.q(obj2);
                    p0 p0Var = new p0((Object) str, (Object) this, (f61) null, 1);
                    h6Var.B = 1;
                    obj2 = ar7.e0(this.d, p0Var, h6Var);
                    p81 p81 = p81.w;
                    if (obj2 == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj2);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj2).w;
            }
        }
        h6Var = new h6(this, h61);
        Object obj22 = h6Var.z;
        i = h6Var.B;
        if (i != 0) {
        }
        return ((o66) obj22).w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object f(h61 h61) {
        i6 i6Var;
        int i;
        if (h61 instanceof i6) {
            i6Var = (i6) h61;
            int i2 = i6Var.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i6Var.B = i2 - Integer.MIN_VALUE;
                Object obj2 = i6Var.z;
                i = i6Var.B;
                if (i != 0) {
                    o85.q(obj2);
                    y5 y5Var = new y5(this, (f61) null, 1);
                    i6Var.B = 1;
                    obj2 = ar7.e0(this.d, y5Var, i6Var);
                    p81 p81 = p81.w;
                    if (obj2 == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj2);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj2).w;
            }
        }
        i6Var = new i6(this, h61);
        Object obj22 = i6Var.z;
        i = i6Var.B;
        if (i != 0) {
        }
        return ((o66) obj22).w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object g(h61 h61) {
        j6 j6Var;
        int i;
        if (h61 instanceof j6) {
            j6Var = (j6) h61;
            int i2 = j6Var.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j6Var.B = i2 - Integer.MIN_VALUE;
                Object obj2 = j6Var.z;
                i = j6Var.B;
                if (i != 0) {
                    o85.q(obj2);
                    k6 k6Var = new k6(this, (f61) null, 0);
                    j6Var.B = 1;
                    obj2 = ar7.e0(this.d, k6Var, j6Var);
                    p81 p81 = p81.w;
                    if (obj2 == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj2);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj2).w;
            }
        }
        j6Var = new j6(this, h61);
        Object obj22 = j6Var.z;
        i = j6Var.B;
        if (i != 0) {
        }
        return ((o66) obj22).w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object h(h61 h61) {
        l6 l6Var;
        int i;
        if (h61 instanceof l6) {
            l6Var = (l6) h61;
            int i2 = l6Var.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l6Var.B = i2 - Integer.MIN_VALUE;
                Object obj2 = l6Var.z;
                i = l6Var.B;
                if (i != 0) {
                    o85.q(obj2);
                    k6 k6Var = new k6(this, (f61) null, 1);
                    l6Var.B = 1;
                    obj2 = ar7.e0(this.d, k6Var, l6Var);
                    p81 p81 = p81.w;
                    if (obj2 == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj2);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj2).w;
            }
        }
        l6Var = new l6(this, h61);
        Object obj22 = l6Var.z;
        i = l6Var.B;
        if (i != 0) {
        }
        return ((o66) obj22).w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object i(String str, String str2, String str3, String str4, h61 h61) {
        m6 m6Var;
        int i;
        if (h61 instanceof m6) {
            m6Var = (m6) h61;
            int i2 = m6Var.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m6Var.B = i2 - Integer.MIN_VALUE;
                Object obj2 = m6Var.z;
                i = m6Var.B;
                if (i != 0) {
                    o85.q(obj2);
                    p6 p6Var = new p6(this, str2, str3, str, str4, (f61) null);
                    m6Var.B = 1;
                    obj2 = ar7.e0(this.d, p6Var, m6Var);
                    p81 p81 = p81.w;
                    if (obj2 == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj2);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj2).w;
            }
        }
        m6Var = new m6(this, h61);
        Object obj22 = m6Var.z;
        i = m6Var.B;
        if (i != 0) {
        }
        return ((o66) obj22).w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object j(String str, h61 h61) {
        q6 q6Var;
        int i;
        if (h61 instanceof q6) {
            q6Var = (q6) h61;
            int i2 = q6Var.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q6Var.B = i2 - Integer.MIN_VALUE;
                Object obj2 = q6Var.z;
                i = q6Var.B;
                if (i != 0) {
                    o85.q(obj2);
                    s6 s6Var = new s6(this, str, (f61) null, 0);
                    q6Var.B = 1;
                    obj2 = ar7.e0(this.d, s6Var, q6Var);
                    p81 p81 = p81.w;
                    if (obj2 == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj2);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj2).w;
            }
        }
        q6Var = new q6(this, h61);
        Object obj22 = q6Var.z;
        i = q6Var.B;
        if (i != 0) {
        }
        return ((o66) obj22).w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object k(String str, String str2, String str3, h61 h61) {
        t6 t6Var;
        int i;
        if (h61 instanceof t6) {
            t6Var = (t6) h61;
            int i2 = t6Var.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t6Var.B = i2 - Integer.MIN_VALUE;
                Object obj2 = t6Var.z;
                i = t6Var.B;
                if (i != 0) {
                    o85.q(obj2);
                    w6 w6Var = new w6((Object) this, (Object) str, (Object) str2, (Object) str3, (f61) null, 0);
                    t6Var.B = 1;
                    obj2 = ar7.e0(this.d, w6Var, t6Var);
                    p81 p81 = p81.w;
                    if (obj2 == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj2);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj2).w;
            }
        }
        t6Var = new t6(this, h61);
        Object obj22 = t6Var.z;
        i = t6Var.B;
        if (i != 0) {
        }
        return ((o66) obj22).w;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:17|18|69|70) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:19|20|21|66|67) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0078, code lost:
        if (r3 == null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f4, code lost:
        if (r(r1, r7) != r12) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0107, code lost:
        if (t(r0, r14, r7) != r12) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0114, code lost:
        if (s(r7) == r12) goto L_0x0116;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x00f9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x010a */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    public final Object l(UserInfo userInfo, String str, h61 h61) {
        x6 x6Var;
        x6 x6Var2;
        int i;
        String str2;
        UserInfo userInfo2;
        String str3;
        String str4;
        String str5;
        JsonElement jsonElement;
        String str6;
        String id;
        String email;
        String str7;
        String str8;
        JsonElement jsonElement2;
        JsonPrimitive f;
        JsonElement jsonElement3;
        h61 h612 = h61;
        if (h612 instanceof x6) {
            x6Var = (x6) h612;
            int i2 = x6Var.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x6Var.D = i2 - Integer.MIN_VALUE;
                x6Var2 = x6Var;
                Object obj2 = x6Var2.B;
                i = x6Var2.D;
                p81 p812 = p81.w;
                if (i != 0) {
                    o85.q(obj2);
                    JsonObject userMetadata = userInfo.getUserMetadata();
                    if (!(userMetadata == null || (jsonElement3 = (JsonElement) userMetadata.get((Object) "full_name")) == null)) {
                        JsonPrimitive f2 = em3.f(jsonElement3);
                        if (f2 instanceof JsonNull) {
                            str4 = null;
                        } else {
                            str4 = f2.getContent();
                        }
                    }
                    if (!(userMetadata == null || (jsonElement = (JsonElement) userMetadata.get((Object) "name")) == null)) {
                        JsonPrimitive f3 = em3.f(jsonElement);
                        if (!(f3 instanceof JsonNull)) {
                            str5 = f3.getContent();
                            if (str4 == null) {
                                String email2 = userInfo.getEmail();
                                if (email2 == null) {
                                    email2 = "";
                                }
                                str4 = d57.g1(email2, "@");
                            }
                            str6 = str4;
                            id = userInfo.getId();
                            email = userInfo.getEmail();
                            if (email == null) {
                                email = "";
                            }
                            if (!(userMetadata == null || (jsonElement2 = (JsonElement) userMetadata.get((Object) "avatar_url")) == null)) {
                                f = em3.f(jsonElement2);
                                if (!(f instanceof JsonNull)) {
                                    str7 = f.getContent();
                                    if (str7 == null) {
                                        str8 = "";
                                    } else {
                                        str8 = str7;
                                    }
                                    x6Var2.z = userInfo;
                                    x6Var2.A = str;
                                    x6Var2.D = 1;
                                    if (((dy7) this.c).f(id, str6, email, str8, x6Var2) != p812) {
                                        str3 = str;
                                    }
                                    return p812;
                                }
                            }
                            str7 = null;
                            if (str7 == null) {
                            }
                            x6Var2.z = userInfo;
                            x6Var2.A = str;
                            x6Var2.D = 1;
                            if (((dy7) this.c).f(id, str6, email, str8, x6Var2) != p812) {
                            }
                            return p812;
                        }
                    }
                    str5 = null;
                    if (str4 == null) {
                    }
                    str6 = str4;
                    id = userInfo.getId();
                    email = userInfo.getEmail();
                    if (email == null) {
                    }
                    f = em3.f(jsonElement2);
                    if (!(f instanceof JsonNull)) {
                    }
                    str7 = null;
                    if (str7 == null) {
                    }
                    x6Var2.z = userInfo;
                    x6Var2.A = str;
                    x6Var2.D = 1;
                    if (((dy7) this.c).f(id, str6, email, str8, x6Var2) != p812) {
                    }
                    return p812;
                } else if (i == 1) {
                    String str9 = x6Var2.A;
                    UserInfo userInfo3 = x6Var2.z;
                    o85.q(obj2);
                    str3 = str9;
                    userInfo = userInfo3;
                } else if (i == 2) {
                    str2 = x6Var2.A;
                    userInfo2 = x6Var2.z;
                    o85.q(obj2);
                    String id22 = userInfo2.getId();
                    x6Var2.z = null;
                    x6Var2.A = null;
                    x6Var2.D = 3;
                } else if (i == 3) {
                    o85.q(obj2);
                    x6Var2.z = null;
                    x6Var2.A = null;
                    x6Var2.D = 4;
                } else if (i == 4) {
                    try {
                        o85.q(obj2);
                    } catch (Throwable unused) {
                    }
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String id32 = userInfo.getId();
                x6Var2.z = userInfo;
                x6Var2.A = str3;
                x6Var2.D = 2;
            }
        }
        x6Var = new x6(this, h612);
        x6Var2 = x6Var;
        Object obj22 = x6Var2.B;
        i = x6Var2.D;
        p81 p8122 = p81.w;
        if (i != 0) {
        }
        try {
            String id322 = userInfo.getId();
            x6Var2.z = userInfo;
            x6Var2.A = str3;
            x6Var2.D = 2;
        } catch (Throwable unused2) {
        }
        userInfo2 = userInfo;
        str2 = str3;
        String id222 = userInfo2.getId();
        x6Var2.z = null;
        x6Var2.A = null;
        x6Var2.D = 3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object m(String str, h61 h61) {
        y6 y6Var;
        int i;
        if (h61 instanceof y6) {
            y6Var = (y6) h61;
            int i2 = y6Var.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y6Var.B = i2 - Integer.MIN_VALUE;
                Object obj2 = y6Var.z;
                i = y6Var.B;
                if (i != 0) {
                    o85.q(obj2);
                    s6 s6Var = new s6(this, str, (f61) null, 1);
                    y6Var.B = 1;
                    obj2 = ar7.e0(this.d, s6Var, y6Var);
                    p81 p81 = p81.w;
                    if (obj2 == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj2);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj2).w;
            }
        }
        y6Var = new y6(this, h61);
        Object obj22 = y6Var.z;
        i = y6Var.B;
        if (i != 0) {
        }
        return ((o66) obj22).w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object n(String str, String str2, h61 h61) {
        z6 z6Var;
        int i;
        if (h61 instanceof z6) {
            z6Var = (z6) h61;
            int i2 = z6Var.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z6Var.B = i2 - Integer.MIN_VALUE;
                Object obj2 = z6Var.z;
                i = z6Var.B;
                if (i != 0) {
                    o85.q(obj2);
                    c7 c7Var = new c7(this, str, str2, (f61) null, 0);
                    z6Var.B = 1;
                    obj2 = ar7.e0(this.d, c7Var, z6Var);
                    p81 p81 = p81.w;
                    if (obj2 == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj2);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj2).w;
            }
        }
        z6Var = new z6(this, h61);
        Object obj22 = z6Var.z;
        i = z6Var.B;
        if (i != 0) {
        }
        return ((o66) obj22).w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object o(Activity activity, String str, h61 h61) {
        d7 d7Var;
        int i;
        if (h61 instanceof d7) {
            d7Var = (d7) h61;
            int i2 = d7Var.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d7Var.B = i2 - Integer.MIN_VALUE;
                Object obj2 = d7Var.z;
                i = d7Var.B;
                if (i != 0) {
                    o85.q(obj2);
                    f7 f7Var = new f7(this, activity, str, (f61) null);
                    d7Var.B = 1;
                    obj2 = ar7.e0(this.d, f7Var, d7Var);
                    p81 p81 = p81.w;
                    if (obj2 == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj2);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj2).w;
            }
        }
        d7Var = new d7(this, h61);
        Object obj22 = d7Var.z;
        i = d7Var.B;
        if (i != 0) {
        }
        return ((o66) obj22).w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object p(h61 h61) {
        g7 g7Var;
        int i;
        if (h61 instanceof g7) {
            g7Var = (g7) h61;
            int i2 = g7Var.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g7Var.B = i2 - Integer.MIN_VALUE;
                Object obj2 = g7Var.z;
                i = g7Var.B;
                if (i != 0) {
                    o85.q(obj2);
                    p0 p0Var = new p0((Object) this, (f61) null, 2);
                    g7Var.B = 1;
                    obj2 = ar7.e0(this.d, p0Var, g7Var);
                    p81 p81 = p81.w;
                    if (obj2 == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj2);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj2).w;
            }
        }
        g7Var = new g7(this, h61);
        Object obj22 = g7Var.z;
        i = g7Var.B;
        if (i != 0) {
        }
        return ((o66) obj22).w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object q(String str, byte[] bArr, h61 h61) {
        h7 h7Var;
        int i;
        if (h61 instanceof h7) {
            h7Var = (h7) h61;
            int i2 = h7Var.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h7Var.B = i2 - Integer.MIN_VALUE;
                Object obj2 = h7Var.z;
                i = h7Var.B;
                if (i != 0) {
                    o85.q(obj2);
                    i7 i7Var = new i7(str, bArr, this, (f61) null);
                    h7Var.B = 1;
                    obj2 = ar7.e0(this.d, i7Var, h7Var);
                    p81 p81 = p81.w;
                    if (obj2 == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj2);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj2).w;
            }
        }
        h7Var = new h7(this, h61);
        Object obj22 = h7Var.z;
        i = h7Var.B;
        if (i != 0) {
        }
        return ((o66) obj22).w;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (r13 == r7) goto L_0x011d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ec A[Catch:{ all -> 0x00f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f4 A[Catch:{ all -> 0x00f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    public final Object r(String str, h61 h61) {
        j7 j7Var;
        int i;
        String str2;
        p81 p81;
        LicenseRequestDto licenseRequestDto;
        String str3;
        Object h;
        Object obj;
        Date parse;
        long j;
        if (h61 instanceof j7) {
            j7Var = (j7) h61;
            int i2 = j7Var.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j7Var.B = i2 - Integer.MIN_VALUE;
                j7 j7Var22 = j7Var;
                Object obj22 = j7Var22.z;
                i = j7Var22.B;
                str2 = null;
                p81 = p81.w;
                if (i != 0) {
                    o85.q(obj22);
                    hm5 i3 = f55.i(this.a, "license_requests");
                    gm5 gm5 = i3.a;
                    String str4 = i3.c;
                    ku4 ku4 = gm5.c.v;
                    im5 im5 = new im5(str4, ku4);
                    zc9 zc9 = new zc9(ku4, im5.f, 4);
                    str.getClass();
                    zc9.a("user_id", xd2.EQ, str);
                    im5.d("*");
                    h66 h66 = h66.a;
                    String str5 = i3.b;
                    j7Var22.B = 1;
                    obj22 = h66.a(gm5, str5, im5, j7Var22);
                } else if (i == 1) {
                    o85.q(obj22);
                } else if (i == 2) {
                    o85.q(obj22);
                    return obj22;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jm5 jm52 = (jm5) obj22;
                t77 t772 = jm52.b.d;
                String str62 = jm52.a;
                gs3 gs32 = gs3.c;
                licenseRequestDto = (LicenseRequestDto) dt0.y0((List) ((f96) t772).s(b26.c(List.class, x91.C(b26.b(LicenseRequestDto.class))), str62));
                if (licenseRequestDto == null || (str72 = licenseRequestDto.getStatus()) == null) {
                    String str72 = "NONE";
                }
                String str82 = str72;
                if (licenseRequestDto == null) {
                    str3 = licenseRequestDto.getTransferId();
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    str3 = "";
                }
                if (licenseRequestDto != null) {
                    str2 = licenseRequestDto.getActivatedAt();
                }
                long j22 = 0;
                if (str2 != null && !d57.I0(str2) && str2.length() >= 19) {
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                    simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
                    parse = simpleDateFormat2.parse(d57.i1(19, str2));
                    if (parse == null) {
                        j = parse.getTime();
                    } else {
                        j = 0;
                    }
                    obj = Long.valueOf(j);
                    if (obj instanceof m66) {
                        obj = 0L;
                    }
                    j22 = ((Number) obj).longValue();
                }
                j7Var22.B = 2;
                h = ((dy7) this.c).h(str82, str3, j22, j7Var22);
                if (h != p81) {
                    return p81;
                }
                return h;
            }
        }
        j7Var = new j7(this, h61);
        j7 j7Var222 = j7Var;
        Object obj222 = j7Var222.z;
        i = j7Var222.B;
        str2 = null;
        p81 = p81.w;
        if (i != 0) {
        }
        jm5 jm522 = (jm5) obj222;
        t77 t7722 = jm522.b.d;
        String str622 = jm522.a;
        gs3 gs322 = gs3.c;
        licenseRequestDto = (LicenseRequestDto) dt0.y0((List) ((f96) t7722).s(b26.c(List.class, x91.C(b26.b(LicenseRequestDto.class))), str622));
        String str722 = "NONE";
        String str822 = str722;
        if (licenseRequestDto == null) {
        }
        if (str3 == null) {
        }
        if (licenseRequestDto != null) {
        }
        long j222 = 0;
        try {
            SimpleDateFormat simpleDateFormat22 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat22.setTimeZone(TimeZone.getTimeZone("UTC"));
            parse = simpleDateFormat22.parse(d57.i1(19, str2));
            if (parse == null) {
            }
            obj = Long.valueOf(j);
        } catch (Throwable th) {
            obj = new m66(th);
        }
        if (obj instanceof m66) {
        }
        j222 = ((Number) obj).longValue();
        j7Var222.B = 2;
        h = ((dy7) this.c).h(str822, str3, j222, j7Var222);
        if (h != p81) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        if (r10 == r8) goto L_0x0098;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0098 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0099 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    public final Object s(h61 h61) {
        k7 k7Var;
        int i;
        p81 p81;
        Object i2;
        if (h61 instanceof k7) {
            k7Var = (k7) h61;
            int i3 = k7Var.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                k7Var.B = i3 - Integer.MIN_VALUE;
                k7 k7Var22 = k7Var;
                Object obj2 = k7Var22.z;
                i = k7Var22.B;
                p81 = p81.w;
                if (i != 0) {
                    o85.q(obj2);
                    gm5 n = f55.n(this.a);
                    k7Var22.B = 1;
                    bm5 bm5 = n.c;
                    mp1 mp1 = new mp1(bm5.u, bm5.v, 1);
                    ia6[] ia6Arr = ia6.w;
                    mp1.e(i53.c);
                    mp1.e = null;
                    obj2 = h66.a.a(n, "rpc/get_my_license_pricing", mp1, k7Var22);
                } else if (i == 1) {
                    o85.q(obj2);
                } else if (i == 2) {
                    o85.q(obj2);
                    return obj2;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jm5 jm52 = (jm5) obj2;
                t77 t772 = jm52.b.d;
                f96 f962 = (f96) t772;
                LicensePricingDto licensePricingDto2 = (LicensePricingDto) f962.s(b26.b(LicensePricingDto.class), jm52.a);
                k7Var22.B = 2;
                i2 = ((dy7) this.c).i(licensePricingDto2.getTransferAmount(), licensePricingDto2.getSaldoAmount(), licensePricingDto2.getDiscountPercent(), licensePricingDto2.getDiscountSource(), licensePricingDto2.getCouponCode(), k7Var22);
                if (i2 != p81) {
                    return p81;
                }
                return i2;
            }
        }
        k7Var = new k7(this, h61);
        k7 k7Var222 = k7Var;
        Object obj22 = k7Var222.z;
        i = k7Var222.B;
        p81 = p81.w;
        if (i != 0) {
        }
        jm5 jm522 = (jm5) obj22;
        t77 t7722 = jm522.b.d;
        f96 f9622 = (f96) t7722;
        LicensePricingDto licensePricingDto22 = (LicensePricingDto) f9622.s(b26.b(LicensePricingDto.class), jm522.a);
        k7Var222.B = 2;
        i2 = ((dy7) this.c).i(licensePricingDto22.getTransferAmount(), licensePricingDto22.getSaldoAmount(), licensePricingDto22.getDiscountPercent(), licensePricingDto22.getDiscountSource(), licensePricingDto22.getCouponCode(), k7Var222);
        if (i2 != p81) {
        }
    }

    /* JADX WARNING: type inference failed for: r4v7, types: [java.lang.Object, h06] */
    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:579)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:485)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0094, code lost:
        if (r2 == r12) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0138, code lost:
        if (r10 != 0) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013a, code lost:
        r2 = defpackage.f55.i(r7, "profiles");
        r6 = r2.a;
        r7 = new defpackage.vm3();
        defpackage.b96.M(r7, "user_id", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0148, code lost:
        if (r8 == false) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x014a, code lost:
        defpackage.b96.M(r7, "invitation_code", (java.lang.String) r4.w);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0153, code lost:
        if (r10 == 0) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0155, code lost:
        defpackage.b96.M(r7, "registered_with_code", r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x015a, code lost:
        r1 = defpackage.sg3.D(r7.a());
        r5 = r6.d;
        r7 = defpackage.pl3.d;
        r1 = ((defpackage.f96) r5).t(defpackage.b26.c(r13, defpackage.x91.C(defpackage.b26.b(kotlinx.serialization.json.JsonObject.class))), r1);
        r7.getClass();
        r1 = defpackage.em3.d((kotlinx.serialization.json.JsonElement) r7.b(kotlinx.serialization.json.JsonElement.Companion.serializer(), r1));
        r5 = new defpackage.yc3(r2.c, r6.c.v);
        r5.e(defpackage.i53.c);
        r5.e = r1;
        r7 = new java.util.ArrayList();
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01ae, code lost:
        if (r1.hasNext() == false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01b0, code lost:
        defpackage.it0.h0(r7, defpackage.em3.e((kotlinx.serialization.json.JsonElement) r1.next()).keySet());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01c4, code lost:
        r16 = defpackage.dt0.b1(defpackage.dt0.f1(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01d0, code lost:
        if (r16.isEmpty() != false) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01d2, code lost:
        r5.f.put("columns", defpackage.sg3.D(defpackage.dt0.E0(r16, ",", (java.lang.String) null, (java.lang.String) null, (defpackage.vr2) null, 62)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01eb, code lost:
        r1 = defpackage.h66.a;
        r2 = r2.b;
        r3.z = null;
        r3.A = null;
        r3.B = r4;
        r3.C = r8;
        r3.D = r10;
        r3.G = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0201, code lost:
        if (r1.a(r6, r2, r5, r3) != r12) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0204, code lost:
        r5 = r4;
        r4 = r8;
        r1 = r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    public final java.lang.Object t(java.lang.String r23, java.lang.String r24, defpackage.h61 r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r25
            boolean r3 = r2 instanceof defpackage.l7
            if (r3 == 0) goto L_0x0019
            r3 = r2
            l7 r3 = (defpackage.l7) r3
            int r4 = r3.G
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.G = r4
            goto L_0x001e
        L_0x0019:
            l7 r3 = new l7
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.E
            int r4 = r3.G
            java.lang.String r5 = "user_id"
            java.lang.String r6 = "profiles"
            j77 r7 = r0.a
            r8 = 3
            r9 = 2
            r10 = 1
            r11 = 0
            p81 r12 = defpackage.p81.w
            if (r4 == 0) goto L_0x0059
            if (r4 == r10) goto L_0x004b
            if (r4 == r9) goto L_0x0040
            if (r4 != r8) goto L_0x003a
            defpackage.o85.q(r2)
            return r2
        L_0x003a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.h.s(r0)
            return r11
        L_0x0040:
            int r1 = r3.D
            boolean r4 = r3.C
            h06 r5 = r3.B
            defpackage.o85.q(r2)
            goto L_0x0207
        L_0x004b:
            h06 r1 = r3.B
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r3.A
            java.lang.String r4 = r3.z
            defpackage.o85.q(r2)
            r9 = r1
            r1 = r4
            goto L_0x0098
        L_0x0059:
            defpackage.o85.q(r2)
            hm5 r2 = defpackage.f55.i(r7, r6)
            gm5 r4 = r2.a
            bj6 r13 = new bj6
            java.lang.String r14 = r2.c
            bm5 r15 = r4.c
            ku4 r15 = r15.v
            r13.<init>(r14, r15)
            zc9 r14 = new zc9
            java.util.LinkedHashMap r8 = r13.f
            r9 = 4
            r14.<init>(r15, r8, r9)
            r1.getClass()
            xd2 r8 = defpackage.xd2.EQ
            r14.a(r5, r8, r1)
            java.lang.String r8 = "*"
            r13.d(r8)
            h66 r8 = defpackage.h66.a
            java.lang.String r2 = r2.b
            r3.z = r1
            r9 = r24
            r3.A = r9
            r3.B = r11
            r3.G = r10
            java.lang.Object r2 = r8.a(r4, r2, r13, r3)
            if (r2 != r12) goto L_0x0098
            goto L_0x0226
        L_0x0098:
            jm5 r2 = (defpackage.jm5) r2
            gm5 r4 = r2.b
            t77 r4 = r4.d
            java.lang.String r2 = r2.a
            gs3 r8 = defpackage.gs3.c
            java.lang.Class<cu.lestebang.utiletecsa.data.repository.profile.ProfileRowDto> r8 = cu.lestebang.utiletecsa.data.repository.profile.ProfileRowDto.class
            as3 r8 = defpackage.b26.b(r8)
            gs3 r8 = defpackage.x91.C(r8)
            java.lang.Class<java.util.List> r13 = java.util.List.class
            as3 r8 = defpackage.b26.c(r13, r8)
            f96 r4 = (defpackage.f96) r4
            java.lang.Object r2 = r4.s(r8, r2)
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = defpackage.dt0.y0(r2)
            cu.lestebang.utiletecsa.data.repository.profile.ProfileRowDto r2 = (cu.lestebang.utiletecsa.data.repository.profile.ProfileRowDto) r2
            h06 r4 = new h06
            r4.<init>()
            if (r2 == 0) goto L_0x00cc
            java.lang.String r8 = r2.getInvitationCode()
            goto L_0x00cd
        L_0x00cc:
            r8 = r11
        L_0x00cd:
            java.lang.String r14 = ""
            if (r8 != 0) goto L_0x00d2
            r8 = r14
        L_0x00d2:
            r4.w = r8
            boolean r8 = defpackage.d57.I0(r8)
            if (r8 == 0) goto L_0x010b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r15 = 8
            r10.<init>(r15)
            r11 = 0
        L_0x00e2:
            if (r11 >= r15) goto L_0x0102
            p2 r16 = defpackage.wv5.a
            java.util.Random r15 = r16.f()
            r16 = r2
            r2 = 32
            int r2 = r15.nextInt(r2)
            java.lang.String r15 = "ABCDEFGHJKLMNPQRSTUVWXYZ23456789"
            char r2 = r15.charAt(r2)
            r10.append(r2)
            int r11 = r11 + 1
            r2 = r16
            r15 = 8
            goto L_0x00e2
        L_0x0102:
            r16 = r2
            java.lang.String r2 = r10.toString()
            r4.w = r2
            goto L_0x010d
        L_0x010b:
            r16 = r2
        L_0x010d:
            if (r9 == 0) goto L_0x0118
            java.lang.CharSequence r2 = defpackage.d57.k1(r9)
            java.lang.String r2 = r2.toString()
            goto L_0x0119
        L_0x0118:
            r2 = 0
        L_0x0119:
            if (r2 != 0) goto L_0x011c
            goto L_0x011d
        L_0x011c:
            r14 = r2
        L_0x011d:
            int r2 = r14.length()
            if (r2 <= 0) goto L_0x0135
            if (r16 == 0) goto L_0x012a
            java.lang.String r2 = r16.getRegisteredWithCode()
            goto L_0x012b
        L_0x012a:
            r2 = 0
        L_0x012b:
            if (r2 == 0) goto L_0x0133
            boolean r2 = defpackage.d57.I0(r2)
            if (r2 == 0) goto L_0x0135
        L_0x0133:
            r10 = 1
            goto L_0x0136
        L_0x0135:
            r10 = 0
        L_0x0136:
            if (r8 != 0) goto L_0x013a
            if (r10 == 0) goto L_0x020a
        L_0x013a:
            hm5 r2 = defpackage.f55.i(r7, r6)
            gm5 r6 = r2.a
            vm3 r7 = new vm3
            r7.<init>()
            defpackage.b96.M(r7, r5, r1)
            if (r8 == 0) goto L_0x0153
            java.lang.Object r1 = r4.w
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r5 = "invitation_code"
            defpackage.b96.M(r7, r5, r1)
        L_0x0153:
            if (r10 == 0) goto L_0x015a
            java.lang.String r1 = "registered_with_code"
            defpackage.b96.M(r7, r1, r14)
        L_0x015a:
            kotlinx.serialization.json.JsonObject r1 = r7.a()
            java.util.List r1 = defpackage.sg3.D(r1)
            t77 r5 = r6.d
            ol3 r7 = defpackage.pl3.d
            java.lang.Class<kotlinx.serialization.json.JsonObject> r9 = kotlinx.serialization.json.JsonObject.class
            as3 r9 = defpackage.b26.b(r9)
            gs3 r9 = defpackage.x91.C(r9)
            as3 r9 = defpackage.b26.c(r13, r9)
            f96 r5 = (defpackage.f96) r5
            java.lang.String r1 = r5.t(r9, r1)
            r7.getClass()
            dm3 r5 = kotlinx.serialization.json.JsonElement.Companion
            zr3 r5 = r5.serializer()
            zr3 r5 = (defpackage.zr3) r5
            java.lang.Object r1 = r7.b(r5, r1)
            kotlinx.serialization.json.JsonElement r1 = (kotlinx.serialization.json.JsonElement) r1
            kotlinx.serialization.json.JsonArray r1 = defpackage.em3.d(r1)
            qu7 r5 = new qu7
            java.lang.String r7 = r2.c
            bm5 r9 = r6.c
            ku4 r9 = r9.v
            r5.<init>(r7, r9)
            i53 r7 = defpackage.i53.c
            r5.e(r7)
            r5.e = r1
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x01aa:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x01c4
            java.lang.Object r9 = r1.next()
            kotlinx.serialization.json.JsonElement r9 = (kotlinx.serialization.json.JsonElement) r9
            kotlinx.serialization.json.JsonObject r9 = defpackage.em3.e(r9)
            java.util.Set r9 = r9.keySet()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            defpackage.it0.h0(r7, r9)
            goto L_0x01aa
        L_0x01c4:
            java.util.Set r1 = defpackage.dt0.f1(r7)
            java.util.List r16 = defpackage.dt0.b1(r1)
            boolean r1 = r16.isEmpty()
            if (r1 != 0) goto L_0x01eb
            r20 = 0
            r21 = 62
            java.lang.String r17 = ","
            r18 = 0
            r19 = 0
            java.lang.String r1 = defpackage.dt0.E0(r16, r17, r18, r19, r20, r21)
            java.util.List r1 = defpackage.sg3.D(r1)
            java.util.LinkedHashMap r7 = r5.f
            java.lang.String r9 = "columns"
            r7.put(r9, r1)
        L_0x01eb:
            h66 r1 = defpackage.h66.a
            java.lang.String r2 = r2.b
            r7 = 0
            r3.z = r7
            r3.A = r7
            r3.B = r4
            r3.C = r8
            r3.D = r10
            r7 = 2
            r3.G = r7
            java.lang.Object r1 = r1.a(r6, r2, r5, r3)
            if (r1 != r12) goto L_0x0204
            goto L_0x0226
        L_0x0204:
            r5 = r4
            r4 = r8
            r1 = r10
        L_0x0207:
            r10 = r1
            r8 = r4
            r4 = r5
        L_0x020a:
            java.lang.Object r1 = r4.w
            java.lang.String r1 = (java.lang.String) r1
            r7 = 0
            r3.z = r7
            r3.A = r7
            r3.B = r7
            r3.C = r8
            r3.D = r10
            r2 = 3
            r3.G = r2
            dv7 r0 = r0.c
            dy7 r0 = (defpackage.dy7) r0
            java.lang.Object r0 = r0.g(r1, r3)
            if (r0 != r12) goto L_0x0227
        L_0x0226:
            return r12
        L_0x0227:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p7.t(java.lang.String, java.lang.String, h61):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object u(String str, String str2, h61 h61) {
        o7 o7Var;
        int i;
        if (h61 instanceof o7) {
            o7Var = (o7) h61;
            int i2 = o7Var.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o7Var.B = i2 - Integer.MIN_VALUE;
                Object obj = o7Var.z;
                i = o7Var.B;
                if (i != 0) {
                    o85.q(obj);
                    c7 c7Var = new c7(this, str, str2, (f61) null, 1);
                    o7Var.B = 1;
                    obj = ar7.e0(this.d, c7Var, o7Var);
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
        o7Var = new o7(this, h61);
        Object obj2 = o7Var.z;
        i = o7Var.B;
        if (i != 0) {
        }
        return ((o66) obj2).w;
    }
}
