package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: v39  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v39 extends ro8 {
    public final /* synthetic */ int y = 2;
    public final Object z;

    public v39(ay4 ay4) {
        super("internal.logger");
        this.z = ay4;
        this.x.put("log", new na9(this, false, true));
        this.x.put("silent", new j69("silent", 1));
        ((ro8) this.x.get("silent")).o("log", new na9(this, true, true));
        this.x.put("unmonitored", new j69("unmonitored", 2));
        ((ro8) this.x.get("unmonitored")).o("log", new na9(this, false, false));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final bq8 a(no7 no7, List list) {
        HashMap hashMap;
        Object obj;
        int i;
        TreeMap treeMap;
        int i2 = this.y;
        String str = this.w;
        qq8 qq8 = bq8.o;
        Object obj2 = this.z;
        String str2 = null;
        switch (i2) {
            case b85.b:
                ya5.x(str, 3, list);
                String g = ((k68) no7.y).r(no7, (bq8) list.get(0)).g();
                k68 k68 = (k68) no7.y;
                long E = (long) ya5.E(k68.r(no7, (bq8) list.get(1)).p().doubleValue());
                bq8 r = k68.r(no7, (bq8) list.get(2));
                if (r instanceof vp8) {
                    hashMap = ya5.G((vp8) r);
                } else {
                    hashMap = new HashMap();
                }
                cf4 cf4 = (cf4) obj2;
                cf4.getClass();
                HashMap hashMap2 = new HashMap();
                for (String str3 : hashMap.keySet()) {
                    HashMap hashMap3 = ((wi8) cf4.x).c;
                    if (hashMap3.containsKey(str3)) {
                        obj = hashMap3.get(str3);
                    } else {
                        obj = null;
                    }
                    hashMap2.put(str3, wi8.b(obj, hashMap.get(str3), str3));
                }
                ((ArrayList) cf4.z).add(new wi8(g, E, hashMap2));
                return qq8;
            case 1:
                ya5.x("getValue", 2, list);
                bq8 r2 = ((k68) no7.y).r(no7, (bq8) list.get(0));
                bq8 r3 = ((k68) no7.y).r(no7, (bq8) list.get(1));
                String g2 = r2.g();
                k68 k682 = (k68) obj2;
                Map map = (Map) ((j19) k682.y).z.get((String) k682.x);
                if (map != null && map.containsKey(g2)) {
                    str2 = map.get(g2);
                }
                if (str2 != null) {
                    return new mq8(str2);
                }
                return r3;
            case 2:
                return qq8;
            case 3:
                try {
                    return ub5.v(((c19) obj2).call());
                } catch (Exception unused) {
                    return qq8;
                }
            default:
                ya5.x(str, 3, list);
                ((k68) no7.y).r(no7, (bq8) list.get(0)).g();
                k68 k683 = (k68) no7.y;
                bq8 r4 = k683.r(no7, (bq8) list.get(1));
                if (r4 instanceof aq8) {
                    bq8 r5 = k683.r(no7, (bq8) list.get(2));
                    if (r5 instanceof vp8) {
                        vp8 vp8 = (vp8) r5;
                        HashMap hashMap4 = vp8.w;
                        if (hashMap4.containsKey("type")) {
                            String g3 = vp8.l("type").g();
                            if (hashMap4.containsKey("priority")) {
                                i = ya5.D(vp8.l("priority").p().doubleValue());
                            } else {
                                i = 1000;
                            }
                            kc9 kc9 = (kc9) obj2;
                            aq8 aq8 = (aq8) r4;
                            kc9.getClass();
                            if ("create".equals(g3)) {
                                treeMap = (TreeMap) kc9.y;
                            } else if ("edit".equals(g3)) {
                                treeMap = (TreeMap) kc9.x;
                            } else {
                                h.s("Unknown callback type: ".concat(String.valueOf(g3)));
                            }
                            if (treeMap.containsKey(Integer.valueOf(i))) {
                                i = ((Integer) treeMap.lastKey()).intValue() + 1;
                            }
                            treeMap.put(Integer.valueOf(i), aq8);
                            return qq8;
                        }
                        h.q("Undefined rule type");
                    } else {
                        h.q("Invalid callback params");
                    }
                } else {
                    h.q("Invalid callback type");
                }
                return null;
        }
    }

    public v39(cf4 cf4) {
        super("internal.eventLogger");
        this.z = cf4;
    }

    public v39(c19 c19) {
        super("internal.appMetadata");
        this.z = c19;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v39(j69 j69, k68 k68) {
        super("getValue");
        this.z = k68;
    }

    public v39(kc9 kc9) {
        super("internal.registerCallback");
        this.z = kc9;
    }
}
