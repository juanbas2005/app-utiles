.class public final Lsm3;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lzr3;


# static fields
.field public static final a:Lsm3;

.field public static final b:Lnl6;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lsm3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lsm3;->a:Lsm3;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    new-array v0, v0, [Lll6;

    .line 10
    .line 11
    const-string v1, "kotlinx.serialization.json.JsonNull"

    .line 12
    .line 13
    sget-object v2, Lql6;->l:Lql6;

    .line 14
    .line 15
    invoke-static {v1, v2, v0}, Lb85;->g(Ljava/lang/String;Ln85;[Lll6;)Lnl6;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lsm3;->b:Lnl6;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final deserialize(Lok1;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p1}, Lmp7;->N(Lok1;)Lbm3;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Lok1;->w()Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    sget-object p0, Lkotlinx/serialization/json/JsonNull;->INSTANCE:Lkotlinx/serialization/json/JsonNull;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance p0, Lkotlinx/serialization/json/JsonDecodingException;

    .line 14
    .line 15
    const/4 p1, -0x1

    .line 16
    const/4 v0, 0x0

    .line 17
    const-string v1, "Expected \'null\' literal"

    .line 18
    .line 19
    invoke-static {p1, v1, v0, v0, v0}, Lar7;->t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {p0, p1}, Lkotlinx/serialization/json/JsonException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p0
    .line 27
    .line 28
    .line 29
.end method

.method public final getDescriptor()Lll6;
    .locals 0

    .line 1
    sget-object p0, Lsm3;->b:Lnl6;

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
    check-cast p2, Lkotlinx/serialization/json/JsonNull;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lmp7;->M(Lj42;)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Lj42;->e()V

    .line 10
    .line 11
    .line 12
    return-void
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
