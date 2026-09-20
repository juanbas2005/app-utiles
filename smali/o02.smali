.class public final Lo02;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ldev/whyoleg/cryptography/serialization/asn1/modules/AlgorithmIdentifier;


# instance fields
.field public final a:Ldev/whyoleg/cryptography/serialization/asn1/modules/DsaParameters;


# direct methods
.method public constructor <init>(Ldev/whyoleg/cryptography/serialization/asn1/modules/DsaParameters;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo02;->a:Ldev/whyoleg/cryptography/serialization/asn1/modules/DsaParameters;

    .line 5
    .line 6
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final getAlgorithm-STa95mE()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Ldev/whyoleg/cryptography/serialization/asn1/ObjectIdentifier;->Companion:Lu25;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string p0, "1.2.840.10040.4.1"

    .line 7
    .line 8
    invoke-static {p0}, Ldev/whyoleg/cryptography/serialization/asn1/ObjectIdentifier;->constructor-impl(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
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

.method public final getParameters()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lo02;->a:Ldev/whyoleg/cryptography/serialization/asn1/modules/DsaParameters;

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
