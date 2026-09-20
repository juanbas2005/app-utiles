package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import cu.lestebang.utiletecsa.R;
import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import cu.lestebang.utiletecsa.feature.settings.service.SpeedOverlayService;
import cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: gw6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gw6 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ Object C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gw6(Object obj, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = obj;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((gw6) o(f61, o81)).s(vs7);
            case 1:
                return ((gw6) o(f61, o81)).s(vs7);
            case 2:
                ((gw6) o(f61, o81)).s(vs7);
                return p81.w;
            case 3:
                return ((gw6) o(f61, o81)).s(vs7);
            case 4:
                return ((gw6) o(f61, o81)).s(vs7);
            case 5:
                return ((gw6) o(f61, o81)).s(vs7);
            case 6:
                return ((gw6) o(f61, o81)).s(vs7);
            case 7:
                return ((gw6) o(f61, o81)).s(vs7);
            case 8:
                return ((gw6) o(f61, o81)).s(vs7);
            case 9:
                return ((gw6) o(f61, o81)).s(vs7);
            case 10:
                return ((gw6) o(f61, o81)).s(vs7);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return ((gw6) o(f61, o81)).s(vs7);
            case 12:
                return ((gw6) o(f61, o81)).s(vs7);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return ((gw6) o(f61, o81)).s(vs7);
            default:
                return ((gw6) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.C;
        switch (i) {
            case b85.b:
                return new gw6((hw6) obj2, f61, 0);
            case 1:
                return new gw6((rz6) obj2, f61, 1);
            case 2:
                return new gw6((SpeedOverlayService) obj2, f61, 2);
            case 3:
                return new gw6((h97) obj2, f61, 3);
            case 4:
                return new gw6((uc1) obj2, f61, 4);
            case 5:
                return new gw6((vr2) obj2, f61, 5);
            case 6:
                return new gw6((c74) obj2, f61, 6);
            case 7:
                return new gw6((xh7) obj2, f61, 7);
            case 8:
                return new gw6((ne1) obj2, f61, 8);
            case 9:
                return new gw6((do7) obj2, f61, 9);
            case 10:
                return new gw6((my7) obj2, f61, 10);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return new gw6((UssdAutoUpdaterService) obj2, f61, 11);
            case 12:
                return new gw6((nz7) obj2, f61, 12);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return new gw6((e88) obj2, f61, 13);
            default:
                return new gw6((bs8) obj2, f61, 14);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:208:?, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00de, code lost:
        if (r5 == r9) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x03f9, code lost:
        if (r0 == r9) goto L_0x03fb;
     */
    public final Object s(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        int i = this.A;
        uy7 uy7 = uy7.SMS_UTIL;
        int i2 = 16;
        vs7 vs7 = vs7.a;
        p81 p81 = p81.w;
        Object obj5 = this.C;
        switch (i) {
            case b85.b:
                vs7 vs72 = vs7;
                hw6 hw6 = (hw6) obj5;
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    c6 c = hw6.b.c(uy7);
                    fw6 fw6 = new fw6(hw6, 1);
                    this.B = 1;
                    if (c.a(fw6, this) == p81) {
                        return p81;
                    }
                } else if (i3 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs72;
            case 1:
                vs7 vs73 = vs7;
                rz6 rz6 = (rz6) obj5;
                Context context = rz6.a;
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (t49.G(1000, this) == p81) {
                        return p81;
                    }
                } else if (i4 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Set set = rz6.f;
                set.getClass();
                boolean isEmpty = set.isEmpty();
                Intent intent = new Intent(context, SpeedOverlayService.class);
                if (!isEmpty && Settings.canDrawOverlays(context)) {
                    try {
                        ag8.H(context, intent);
                    } catch (Exception e) {
                        if (Build.VERSION.SDK_INT < 31 || !e.getClass().getName().equals("android.app.ForegroundServiceStartNotAllowedException")) {
                            throw e;
                        }
                    }
                } else if (isEmpty) {
                    context.stopService(intent);
                }
                return vs73;
            case 2:
                int i5 = this.B;
                if (i5 != 0) {
                    if (i5 != 1) {
                        h.s("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        o85.q(obj);
                        ta1.e();
                    }
                    return null;
                }
                o85.q(obj);
                SpeedOverlayService speedOverlayService = (SpeedOverlayService) obj5;
                d37 d37 = speedOverlayService.J;
                lg lgVar = new lg(13, speedOverlayService);
                this.B = 1;
                d37.a(lgVar, this);
                return p81;
            case 3:
                vs7 vs74 = vs7;
                h97 h97 = (h97) obj5;
                int i6 = this.B;
                if (i6 == 0) {
                    o85.q(obj);
                    PointerInputEventHandler pointerInputEventHandler = h97.M;
                    this.B = 2;
                    if (pointerInputEventHandler.invoke(h97, this) == p81) {
                        return p81;
                    }
                } else if (i6 == 1 || i6 == 2) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs74;
            case 4:
                vs7 vs75 = vs7;
                int i7 = this.B;
                if (i7 == 0) {
                    o85.q(obj);
                    uc1 uc1 = (uc1) obj5;
                    this.B = 1;
                    uc1.getClass();
                    Object L = gl0.L(new tc1(uc1, (f61) null, 0), this);
                    if (L != p81) {
                        L = vs75;
                    }
                    if (L == p81) {
                        return p81;
                    }
                } else if (i7 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs75;
            case 5:
                vs7 vs76 = vs7;
                int i8 = this.B;
                if (i8 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (((vr2) obj5).y(this) == p81) {
                        return p81;
                    }
                } else if (i8 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs76;
            case 6:
                vs7 vs77 = vs7;
                int i9 = this.B;
                if (i9 == 0) {
                    o85.q(obj);
                    c74 c74 = (c74) obj5;
                    this.B = 1;
                    c74.getClass();
                    Object a = c74.a.a().a(new n40(4, new lp4(), c74), this);
                    if (a != p81) {
                        a = vs77;
                    }
                    if (a == p81) {
                        return p81;
                    }
                } else if (i9 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs77;
            case 7:
                vs7 vs78 = vs7;
                xh7 xh7 = (xh7) obj5;
                int i10 = this.B;
                if (i10 == 0) {
                    o85.q(obj);
                    Object obj6 = new Object();
                    di2 a2 = xh7.K.a();
                    n40 n40 = new n40(9, obj6, xh7);
                    this.B = 1;
                    if (a2.a(n40, this) == p81) {
                        return p81;
                    }
                } else if (i10 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs78;
            case 8:
                vs7 vs79 = vs7;
                int i11 = this.B;
                if (i11 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (((ne1) obj5).y(this) == p81) {
                        return p81;
                    }
                } else if (i11 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs79;
            case 9:
                vs7 vs710 = vs7;
                int i12 = this.B;
                if (i12 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (((do7) obj5).f(this) == p81) {
                        return p81;
                    }
                } else if (i12 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs710;
            case 10:
                vs7 vs711 = vs7;
                my7 my7 = (my7) obj5;
                int i13 = this.B;
                if (i13 == 0) {
                    o85.q(obj);
                    di2 d = ((dy7) my7.b).d();
                    this.B = 1;
                    obj2 = gr8.H(d, this);
                    if (obj2 == p81) {
                        return p81;
                    }
                } else if (i13 == 1) {
                    o85.q(obj);
                    obj2 = obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (((UserDataPreferences) obj2).getUssdAutoEnabled()) {
                    my7.a();
                }
                return vs711;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                vs7 vs712 = vs7;
                UssdAutoUpdaterService ussdAutoUpdaterService = (UssdAutoUpdaterService) obj5;
                int i14 = this.B;
                if (i14 == 0) {
                    o85.q(obj);
                    dv7 dv7 = ussdAutoUpdaterService.z;
                    if (dv7 != null) {
                        di2 d2 = ((dy7) dv7).d();
                        lg lgVar2 = new lg(16, ussdAutoUpdaterService);
                        this.B = 1;
                        if (d2.a(lgVar2, this) == p81) {
                            return p81;
                        }
                    } else {
                        sg3.a0("userPreferencesDataSource");
                        throw null;
                    }
                } else if (i14 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs712;
            case 12:
                nz7 nz7 = (nz7) obj5;
                zy7 zy7 = nz7.a;
                int i15 = this.B;
                if (i15 == 0) {
                    o85.q(obj);
                    di2 L2 = gr8.L(t49.E(zy7.a.a, false, new String[]{"ussd_codes"}, new ha7(25)), zy7.b);
                    this.B = 1;
                    obj3 = gr8.H(L2, this);
                    break;
                } else if (i15 == 1) {
                    o85.q(obj);
                    obj3 = obj;
                } else if (i15 == 2) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list = (List) obj3;
                int F = tf4.F(et0.e0(list, 10));
                if (F >= 16) {
                    i2 = F;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
                for (Object next : list) {
                    linkedHashMap.put(((yy7) next).b, next);
                }
                uy7 uy72 = uy7.SALDO;
                vy7 vy7 = new vy7("Consultar Saldo", "*222#", uy72, "Consulta el saldo principal de la línea");
                vy7 vy72 = new vy7("Consultar Saldo Corporativo", "*111#", uy72, "Consulta el saldo corporativo de la línea");
                vy7 vy73 = new vy7("Consultar Saldo TFA", "*118#", uy72, "Consulta el saldo de telefonía fija alternativa (TFA)");
                vy7 vy74 = new vy7("Recargar Saldo", "*662*", uy72, "Prefijo de recarga — se agrega el código de tarjeta");
                uy7 uy73 = uy7.BONO;
                vy7 vy75 = new vy7("Consultar Bono", "*222*266#", uy73, "Consulta el saldo de bono");
                vy7 vy76 = vy74;
                vy7 vy77 = new vy7("Bono Activo", "*222*266*1#", uy73, "Verifica si el bono está activo");
                vy7 vy78 = vy72;
                vy7 vy79 = new vy7("Consultar Saldo Nacional", "*222*732#", uy7.SALDO_NACIONAL, "Consulta el saldo nacional");
                uy7 uy74 = uy7.DATOS;
                vy7 vy710 = new vy7("Consultar Datos", "*222*328#", uy74, "Consulta tarifa y paquetes de datos móviles");
                vy7 vy711 = new vy7("Activar Datos", "*133*1#", uy74, "Activa el servicio de datos móviles");
                vy7 vy712 = vy75;
                uy7 uy75 = uy7.SMS;
                vy7 vy713 = new vy7("Consultar SMS", "*222*767#", uy75, "Consulta el saldo de SMS nacionales");
                vy7 vy714 = new vy7("SMS Internacionales", "*222*768#", uy75, "Consulta el saldo de SMS internacionales");
                uy7 uy76 = uy7.VOZ;
                vy7 vy715 = new vy7("Consultar Minutos", "*222*869#", uy76, "Consulta el saldo de minutos de voz");
                vy7 vy716 = new vy7("Llamadas Internacionales", "*222*869*1#", uy76, "Consulta minutos internacionales");
                vy7 vy717 = vy711;
                uy7 uy77 = uy7.TRANSFERENCIA;
                vy7 vy718 = new vy7("Transferir Saldo", "*234*1*", uy77, "Prefijo de transferencia — se agrega número*contraseña*monto");
                vy7 vy719 = new vy7("Adelanta Saldo", "*234*3*1#", uy77, "Solicita un adelanto de saldo");
                vy7 vy720 = new vy7("Cambiar PIN", "*234*2*", uy77, "Prefijo de cambio de PIN — se agrega pinActual*pinNuevo");
                vy7 vy721 = new vy7("Consultar Adelanto", "*222*233#", uy77, "Consulta el estado del adelanto de saldo");
                vy7 vy722 = new vy7("Plan Amigo", "*222*264#", uy76, "Consulta el estado del Plan Amigos");
                vy7 vy723 = vy721;
                uy7 uy78 = uy7.PLANES;
                vy7 vy724 = new vy7("Bolsa de Mensajería", "*133*1*2", uy78, "Base para activar TODUS/Bolsa de Mensajería");
                vy7 vy725 = new vy7("Plan Voz Base", "*133*3*", uy78, "Base para activar Plan de Voz (añadir índice 1-5)");
                vy7 vy726 = new vy7("Paquete Datos Base", "*133*1*4*", uy78, "Base para Paquetes de Datos y Combinados (añadir índice)");
                vy7 vy727 = new vy7("Bolsa Diaria LTE", "*133*1*3", uy78, "Base para activar Bolsa Diaria LTE");
                vy7 vy728 = new vy7("Plan SMS Base", "*133*2*", uy78, "Base para activar Plan de SMS (añadir índice 1-4)");
                vy7 vy729 = new vy7("Plan Amigo Base", "*133*4*", uy78, "Base para operaciones de Plan Amigo");
                vy7 vy730 = new vy7("Tarifa por Consumo Activar", "*133*1*1*1#", uy78, "Activa la tarifa por consumo de datos");
                vy7 vy731 = new vy7("Tarifa por Consumo Desactivar", "*133*1*1*2#", uy78, "Desactiva la tarifa por consumo de datos");
                uy7 uy79 = uy7.SERVICIOS_UTILES;
                vy7 vy732 = vy731;
                vy7 vy733 = new vy7("Antidroga", "103", uy79, "free");
                vy7 vy734 = new vy7("Ambulancia", "104", uy79, "free");
                vy7 vy735 = new vy7("Bomberos", "105", uy79, "free");
                vy7 vy736 = new vy7("Policía", "106", uy79, "free");
                vy7 vy737 = new vy7("Búsqueda y salvamento marítimo", "107", uy79, "free");
                vy7 vy738 = new vy7("Gestión comercial (TF)", "112", uy79, "free");
                vs7 vs713 = vs7;
                vy7 vy739 = new vy7("Información de abonados (TF)", "113", uy79, "payed");
                vy7 vy740 = new vy7("Información comercial", "118", uy79, "free");
                vy7 vy741 = vy739;
                vy7 vy742 = new vy7("Atención a clientes (Móvil)", "*2266", uy79, "free");
                vy7 vy743 = vy740;
                vy7 vy744 = new vy7("Buzón de Voz", "*123", uy79, "free");
                vy7 vy745 = new vy7("Nauta Hogar", "80043434", uy79, "free");
                vy7 vy746 = new vy7("Ayuda 8888", "2266", uy7, "ayuda");
                vy7 vy747 = new vy7("Tarifa Actual", "2266", uy7, "tarifa");
                vy7 vy748 = new vy7("Oferta de ETECSA", "2266", uy7, "oferta");
                vy7 vy749 = new vy7("Resumen de saldo", "2266", uy7, "resumen");
                vy7 vy750 = new vy7("Planes", "2266", uy7, "planes");
                vy7 vy751 = new vy7("Plan Amigo", "2266", uy7, "amigo");
                vy7 vy752 = new vy7("LTE (Activar 4G)", "2266", uy7, "LTE");
                vy7 vy753 = vy78;
                vy7 vy754 = vy742;
                vy7 vy755 = vy77;
                List<vy7> E = sg3.E(vy7, vy753, vy73, vy76, vy712, vy755, vy79, vy710, vy717, vy713, vy714, vy715, vy716, vy718, vy719, vy720, vy723, vy722, vy724, vy725, vy726, vy727, vy728, vy729, vy730, vy732, vy733, vy734, vy735, vy736, vy737, vy738, vy741, vy743, vy754, vy744, vy745, vy746, vy747, vy748, vy749, vy750, vy751, vy752, new vy7("Turismo", "8000", uy7, "turismo"), new vy7("Cancelar Turismo", "8000", uy7, "CANCELAR TURISMO"), new vy7("Sígueme", "8000", uy7, "sigueme"), new vy7("ONAT", "8000", uy7, "onat"));
                ArrayList arrayList = new ArrayList();
                for (vy7 vy756 : E) {
                    yy7 yy7 = (yy7) linkedHashMap.get(vy756.b);
                    if (yy7 == null) {
                        arrayList.add(new yy7(vy756.a, vy756.b, vy756.c, vy756.d.name(), vy756.e));
                    } else if (sg3.e(nz7.c.get(vy756.b), yy7.c)) {
                        String str = vy756.c;
                        String str2 = yy7.a;
                        String str3 = yy7.b;
                        String str4 = yy7.d;
                        String str5 = yy7.e;
                        str2.getClass();
                        str3.getClass();
                        str.getClass();
                        str4.getClass();
                        str5.getClass();
                        arrayList.add(new yy7(str2, str3, str, str4, str5));
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.B = 2;
                    Object e0 = ar7.e0(zy7.b, new zw7(zy7, arrayList, (f61) null, 4), this);
                    if (e0 != p81) {
                        e0 = vs713;
                        break;
                    }
                }
                return vs713;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                int i16 = this.B;
                if (i16 == 0) {
                    o85.q(obj);
                    v78 v78 = ((e88) obj5).b;
                    this.B = 1;
                    if (v78.h(this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i16 == 1) {
                    o85.q(obj);
                    ((o66) obj).getClass();
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            default:
                bs8 bs8 = (bs8) obj5;
                if (this.B != 0) {
                    try {
                        o85.q(obj);
                        obj4 = obj;
                    } catch (IOException e2) {
                        d37 d372 = bs8.c;
                        String message = e2.getMessage();
                        if (message == null) {
                            Application application = bs8.b;
                            application.getClass();
                            message = application.getString(R.string.no_licenses_available);
                            message.getClass();
                        }
                        pr8 pr8 = new pr8(message);
                        d372.getClass();
                        d372.l((Object) null, pr8);
                        return vs7;
                    }
                } else {
                    o85.q(obj);
                    Application application2 = bs8.b;
                    application2.getClass();
                    e81 e81 = ey8.a;
                    f70 f70 = new f70(application2, (f61) null, 18);
                    this.B = 1;
                    obj4 = ar7.e0(e81, f70, this);
                    if (obj4 == p81) {
                        return p81;
                    }
                }
                ArrayList arrayList2 = (ArrayList) obj4;
                d37 d373 = bs8.c;
                arrayList2.getClass();
                rr8 rr8 = new rr8(arrayList2);
                d373.getClass();
                d373.l((Object) null, rr8);
                return vs7;
        }
    }
}
