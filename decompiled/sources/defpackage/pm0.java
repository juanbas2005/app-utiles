package defpackage;

import android.content.Context;
import android.os.Build;
import android.telephony.CellIdentity;
import android.telephony.CellIdentityNr;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.SignalStrength;
import java.util.List;
import java.util.Map;

/* renamed from: pm0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pm0 {
    public final Context a;
    public final h81 b;

    public pm0(Context context, h81 h81) {
        this.a = context;
        this.b = h81;
    }

    public static final km0 a(pm0 pm0, CellInfo cellInfo, SignalStrength signalStrength) {
        Map map;
        CellInfoNr cellInfoNr;
        CellIdentityNr cellIdentityNr;
        CellSignalStrengthNr cellSignalStrengthNr;
        Integer num;
        int dbm;
        CellInfo cellInfo2 = cellInfo;
        pm0.getClass();
        int i = Integer.MIN_VALUE;
        Map map2 = b42.w;
        if (signalStrength == null) {
            map = null;
        } else if (Build.VERSION.SDK_INT < 29) {
            map = map2;
        } else {
            ze4 ze4 = new ze4();
            List<CellSignalStrength> n = signalStrength.getCellSignalStrengths();
            n.getClass();
            for (CellSignalStrength cellSignalStrength : n) {
                if (cellSignalStrength instanceof CellSignalStrengthLte) {
                    num = 3;
                } else if (cellSignalStrength instanceof CellSignalStrengthGsm) {
                    num = 1;
                } else if (cellSignalStrength instanceof CellSignalStrengthWcdma) {
                    num = 4;
                } else if (wk0.w(cellSignalStrength)) {
                    num = 6;
                } else {
                    num = null;
                }
                if (!(num == null || (dbm = cellSignalStrength.getDbm()) == Integer.MIN_VALUE || dbm == Integer.MAX_VALUE || dbm >= 0)) {
                    ze4.put(num, new rt6(cellSignalStrength.getDbm(), cellSignalStrength.getLevel()));
                }
            }
            map = ze4.b();
        }
        if (map != null) {
            map2 = map;
        }
        if (cellInfo2 instanceof CellInfoLte) {
            CellInfoLte cellInfoLte = (CellInfoLte) cellInfo2;
            int ci = cellInfoLte.getCellIdentity().getCi();
            int tac = cellInfoLte.getCellIdentity().getTac();
            int pci = cellInfoLte.getCellIdentity().getPci();
            int earfcn = cellInfoLte.getCellIdentity().getEarfcn();
            int a2 = cellInfoLte.getCellSignalStrength().getRsrp();
            int level = cellInfoLte.getCellSignalStrength().getLevel();
            int A = cellInfoLte.getCellSignalStrength().getRsrq();
            if (Build.VERSION.SDK_INT >= 28) {
                i = cellInfoLte.getCellIdentity().getBandwidth();
            }
            return b("4G LTE", ci, tac, pci, earfcn, a2, level, (rt6) map2.get(3), A, i);
        } else if (cellInfo2 instanceof CellInfoGsm) {
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo2;
            return c(pm0, "2G GSM", cellInfoGsm.getCellIdentity().getCid(), cellInfoGsm.getCellIdentity().getLac(), cellInfoGsm.getCellIdentity().getBsic(), cellInfoGsm.getCellIdentity().getArfcn(), cellInfoGsm.getCellSignalStrength().getRssi(), cellInfoGsm.getCellSignalStrength().getLevel(), (rt6) map2.get(1), 0, 768);
        } else if (cellInfo2 instanceof CellInfoWcdma) {
            CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo2;
            return c(pm0, "3G UMTS", cellInfoWcdma.getCellIdentity().getCid(), cellInfoWcdma.getCellIdentity().getLac(), cellInfoWcdma.getCellIdentity().getPsc(), cellInfoWcdma.getCellIdentity().getUarfcn(), cellInfoWcdma.getCellSignalStrength().getDbm(), cellInfoWcdma.getCellSignalStrength().getLevel(), (rt6) map2.get(4), 0, 768);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                if (wk0.v(cellInfo2)) {
                    cellInfoNr = wk0.j(cellInfo2);
                } else {
                    cellInfoNr = null;
                }
                if (cellInfoNr != null) {
                    CellIdentity h = cellInfoNr.getCellIdentity();
                    if (wk0.x(h)) {
                        cellIdentityNr = wk0.i(h);
                    } else {
                        cellIdentityNr = null;
                    }
                    if (cellIdentityNr != null) {
                        CellSignalStrength k = cellInfoNr.getCellSignalStrength();
                        if (wk0.w(k)) {
                            cellSignalStrengthNr = wk0.l(k);
                        } else {
                            cellSignalStrengthNr = null;
                        }
                        if (cellSignalStrengthNr != null) {
                            return c(pm0, "5G NR", (int) (cellIdentityNr.getNci() & 2147483647L), cellIdentityNr.getTac(), cellIdentityNr.getPci(), cellIdentityNr.getNrarfcn(), cellSignalStrengthNr.getSsRsrp(), cellSignalStrengthNr.getLevel(), (rt6) map2.get(6), cellSignalStrengthNr.getSsRsrq(), 512);
                        }
                    }
                }
            }
            return null;
        }
    }

    public static km0 b(String str, int i, int i2, int i3, int i4, int i5, int i6, rt6 rt6, int i7, int i8) {
        int i9;
        int i10;
        boolean z;
        int i11;
        rt6 rt62 = rt6;
        if (rt62 != null) {
            i9 = rt62.a;
        } else {
            i9 = i5;
        }
        if (rt62 != null) {
            i10 = rt62.b;
        } else {
            i10 = i6;
        }
        int i12 = 0;
        if (i9 == Integer.MIN_VALUE || i9 == Integer.MAX_VALUE || i9 >= 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i11 = i9;
        } else {
            i11 = Integer.MIN_VALUE;
        }
        if (z) {
            i12 = z65.p(i10, 0, 4);
        }
        return new km0(str, i, i2, i3, i4, i11, i12, i7, i8);
    }

    public static /* synthetic */ km0 c(pm0 pm0, String str, int i, int i2, int i3, int i4, int i5, int i6, rt6 rt6, int i7, int i8) {
        int i9;
        if ((i8 & 256) != 0) {
            i9 = Integer.MIN_VALUE;
        } else {
            i9 = i7;
        }
        pm0.getClass();
        return b(str, i, i2, i3, i4, i5, i6, rt6, i9, Integer.MIN_VALUE);
    }
}
