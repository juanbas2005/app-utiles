.class public final synthetic Ll12;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lav2;


# static fields
.field public static final a:Ll12;

.field private static final descriptor:Lll6;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ll12;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ll12;->a:Ll12;

    .line 7
    .line 8
    new-instance v1, Lub3;

    .line 9
    .line 10
    const-string v2, "dev.whyoleg.cryptography.serialization.asn1.modules.EcParameters"

    .line 11
    .line 12
    invoke-direct {v1, v2, v0}, Lub3;-><init>(Ljava/lang/String;Lav2;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "namedCurve"

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v1, v0, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Ll12;->descriptor:Lll6;

    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method


# virtual methods
.method public final childSerializers()[Lzr3;
    .locals 2

    .line 1
    const/4 p0, 0x1

    .line 2
    new-array p0, p0, [Lzr3;

    .line 3
    .line 4
    sget-object v0, Lt25;->a:Lt25;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aput-object v0, p0, v1

    .line 8
    .line 9
    return-object p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final deserialize(Lok1;)Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p0, Ll12;->descriptor:Lll6;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lok1;->q(Lll6;)Lok1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Lt25;->a:Lt25;

    .line 8
    .line 9
    invoke-interface {p0, p1}, Lok1;->g(Lzr3;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ldev/whyoleg/cryptography/serialization/asn1/ObjectIdentifier;

    .line 14
    .line 15
    invoke-virtual {p0}, Ldev/whyoleg/cryptography/serialization/asn1/ObjectIdentifier;->unbox-impl()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Ldev/whyoleg/cryptography/serialization/asn1/modules/EcParameters;->constructor-impl(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Ldev/whyoleg/cryptography/serialization/asn1/modules/EcParameters;->box-impl(Ljava/lang/String;)Ldev/whyoleg/cryptography/serialization/asn1/modules/EcParameters;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
    .line 28
    .line 29
.end method

.method public final getDescriptor()Lll6;
    .locals 0

    .line 1
    sget-object p0, Ll12;->descriptor:Lll6;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final serialize(Lj42;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ldev/whyoleg/cryptography/serialization/asn1/modules/EcParameters;

    .line 2
    .line 3
    invoke-virtual {p2}, Ldev/whyoleg/cryptography/serialization/asn1/modules/EcParameters;->unbox-impl()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object p2, Ll12;->descriptor:Lll6;

    .line 11
    .line 12
    invoke-interface {p1, p2}, Lj42;->m(Lll6;)Lj42;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    sget-object p2, Lt25;->a:Lt25;

    .line 20
    .line 21
    invoke-static {p0}, Ldev/whyoleg/cryptography/serialization/asn1/ObjectIdentifier;->box-impl(Ljava/lang/String;)Ldev/whyoleg/cryptography/serialization/asn1/ObjectIdentifier;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p1, p2, p0}, Lj42;->g(Lzr3;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method
