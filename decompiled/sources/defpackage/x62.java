package defpackage;

/* renamed from: x62  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum x62 {
    y("Unresolved java class %s", true),
    z("Unresolved type for %s (arrayDimensions=%s)", true),
    A("Return type for function cannot be resolved", false),
    B("Recursive type alias %s", false),
    C("Cyclic upper bounds", false),
    D("Cyclic supertypes", false),
    E("Cannot infer a lambda parameter type", false),
    F("Cannot infer a type variable %s", false),
    G("Unable to substitute type (%s)", false),
    H("Special DONT_CARE type", false),
    I("Error java flexible type with id %s. (%s..%s)", false),
    J("Error raw type %s", false),
    K("Unknown type parameter %s. Please try recompiling module containing \"%s\"", false),
    L("Couldn't deserialize type parameter %s in %s", false),
    M("Inconsistent suspend function type in metadata with constructor %s", false),
    N("Unknown type", false),
    O("Missed a type argument for a type parameter %s", false),
    P("Error constant value %s", false),
    Q("Error property type", false),
    R("Error class", false),
    S("Type for error type constructor (%s)", false),
    T("Intersection of error types %s", false),
    U("Cannot compute erased upper bound of a type parameter %s", false),
    V("Unsigned type %s not found", false),
    W("Not found the corresponding enum class for given enum entry %s.%s", false),
    X("Not found recorded type for %s", false),
    Y("Type for unmapped Java annotation target to Kotlin one", false),
    Z("Unknown type for an array element of a java annotation argument", false),
    a0("No fqName for annotation %s", false);
    
    public final String w;
    public final boolean x;

    /* access modifiers changed from: public */
    x62(String str, boolean z2) {
        this.w = str;
        this.x = z2;
    }
}
