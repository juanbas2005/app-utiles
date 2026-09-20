package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l extends j {
    public final k a(Object obj) {
        e eVar = (e) obj;
        k kVar = eVar.unknownFields;
        if (kVar != k.f) {
            return kVar;
        }
        k kVar2 = new k(0, new int[8], new Object[8], true);
        eVar.unknownFields = kVar2;
        return kVar2;
    }
}
