package defpackage;

import android.view.KeyEvent;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.JsonObject;

/* renamed from: m70  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class m70 implements vr2 {
    public final /* synthetic */ int w;
    public final Object x;
    public final Object y;
    public final Object z;

    public /* synthetic */ m70(Object obj, Object obj2, Object obj3, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Throwable th;
        if (i == 3 || i == 4) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i == 3 || i == 4) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        Object[] objArr = new Object[i2];
        if (i == 1) {
            objArr[0] = "map";
        } else if (i == 2) {
            objArr[0] = "compute";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 3) {
            objArr[1] = "recursionDetected";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (!(i == 3 || i == 4)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 3 || i == 4) {
            th = new IllegalStateException(format);
        } else {
            th = new IllegalArgumentException(format);
        }
        throw th;
    }

    public AssertionError e(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Inconsistent key detected. " + jb4.x + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + ((kb4) this.x));
        kb4.e(assertionError);
        return assertionError;
    }

    public AssertionError f(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + ((kb4) this.x));
        kb4.e(assertionError);
        return assertionError;
    }

    public AssertionError k(Object obj, Throwable th) {
        AssertionError assertionError = new AssertionError("Unable to remove " + obj + " under " + ((kb4) this.x), th);
        kb4.e(assertionError);
        return assertionError;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: as3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: as3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: as3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: as3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: as3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: as3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: as3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: as3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: as3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: as3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: as3} */
    /* JADX WARNING: Multi-variable type inference failed */
    public Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        Class<JsonObject> cls = JsonObject.class;
        as3 as3 = null;
        Object obj2 = this.z;
        Object obj3 = this.y;
        Object obj4 = this.x;
        switch (i) {
            case b85.b:
                KeyEvent keyEvent = ((qs3) obj).a;
                aq4 aq4 = (aq4) obj3;
                ek7 ek7 = (ek7) obj4;
                if (!ek7.b()) {
                    aq4.setValue(Boolean.FALSE);
                } else if (rd3.A(keyEvent) == 2 && os3.a(uq3.f(keyEvent.getKeyCode()), os3.u)) {
                    ((aq4) obj2).setValue(Boolean.FALSE);
                    ek7.a();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 1:
                y53 y53 = (y53) obj;
                y53.getClass();
                y53.d(i53.c);
                String str = (String) obj2;
                if (str != null) {
                    y53.a.j.J("redirect_to", str);
                }
                pv8.q(y53, (q51) obj4);
                if (obj3 == null) {
                    y53.d = m15.a;
                    gq3 b = b26.a.b(cls);
                    try {
                        as3 = b26.b(cls);
                    } catch (Throwable unused) {
                    }
                    y53.b(new fp7(b, as3));
                } else if (obj3 instanceof j85) {
                    y53.d = obj3;
                    y53.b((fp7) null);
                } else {
                    y53.d = obj3;
                    gq3 b2 = b26.a.b(cls);
                    try {
                        as3 = b26.b(cls);
                    } catch (Throwable unused2) {
                    }
                    y53.b(new fp7(b2, as3));
                }
                return vs7;
            case 2:
                y53 y532 = (y53) obj;
                y532.getClass();
                y532.d(i53.c);
                String str2 = (String) obj2;
                if (str2 != null) {
                    y532.a.j.J("redirect_to", str2);
                }
                pv8.q(y532, (q51) obj4);
                y532.d = (JsonObject) obj3;
                gq3 b3 = b26.a.b(cls);
                try {
                    as3 = b26.b(cls);
                } catch (Throwable unused3) {
                }
                y532.b(new fp7(b3, as3));
                return vs7;
            default:
                kb4 kb4 = (kb4) obj4;
                td0 td0 = kb4.b;
                du6 du6 = kb4.a;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj3;
                Object obj5 = concurrentHashMap.get(obj);
                Object obj6 = ye8.a;
                Object obj7 = jb4.x;
                if (obj5 == null || obj5 == obj7) {
                    du6.lock();
                    try {
                        Object obj8 = concurrentHashMap.get(obj);
                        Object obj9 = jb4.y;
                        if (obj8 == obj7) {
                            v70 d = kb4.d("", obj);
                            if (d == null) {
                                a(3);
                                throw null;
                            } else if (!d.x) {
                                as3 = d.y;
                                du6.unlock();
                                return as3;
                            } else {
                                obj8 = obj9;
                            }
                        }
                        if (obj8 == obj9) {
                            v70 d2 = kb4.d("", obj);
                            if (d2 == null) {
                                a(3);
                                throw null;
                            } else if (!d2.x) {
                                as3 = d2.y;
                                du6.unlock();
                                return as3;
                            }
                        }
                        if (obj8 != null) {
                            ye8.a(obj8);
                            if (obj8 != obj6) {
                                as3 = obj8;
                            }
                            du6.unlock();
                            return as3;
                        }
                        concurrentHashMap.put(obj, obj7);
                        obj5 = ((vr2) obj2).y(obj);
                        if (obj5 != null) {
                            obj6 = obj5;
                        }
                        Object put = concurrentHashMap.put(obj, obj6);
                        if (put == obj7) {
                            du6.unlock();
                        } else {
                            throw f(obj, put);
                        }
                    } catch (Throwable th) {
                        throw k(obj, th);
                    }
                } else {
                    ye8.a(obj5);
                    if (obj5 == obj6) {
                        return null;
                    }
                }
                return obj5;
        }
    }
}
