.class public final Lxm3;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lzr3;


# static fields
.field public static final a:Lxm3;

.field public static final b:Lwm3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lxm3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxm3;->a:Lxm3;

    .line 7
    .line 8
    sget-object v0, Lwm3;->b:Lwm3;

    .line 9
    .line 10
    sput-object v0, Lxm3;->b:Lwm3;

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
.end method


# virtual methods
.method public final deserialize(Lok1;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {p1}, Lmp7;->N(Lok1;)Lbm3;

    .line 2
    .line 3
    .line 4
    new-instance p0, Lkotlinx/serialization/json/JsonObject;

    .line 5
    .line 6
    sget-object v0, Lt47;->a:Lt47;

    .line 7
    .line 8
    sget-object v1, Lgm3;->a:Lgm3;

    .line 9
    .line 10
    new-instance v2, Lty2;

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-direct {v2, v0, v1, v3}, Lty2;-><init>(Lzr3;Lzr3;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, p1}, Lx0;->deserialize(Lok1;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Ljava/util/Map;

    .line 21
    .line 22
    invoke-direct {p0, p1}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    .line 23
    .line 24
    .line 25
    return-object p0
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final getDescriptor()Lll6;
    .locals 0

    .line 1
    sget-object p0, Lxm3;->b:Lwm3;

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
    .locals 3

    .line 1
    check-cast p2, Lkotlinx/serialization/json/JsonObject;

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
    sget-object p0, Lt47;->a:Lt47;

    .line 10
    .line 11
    sget-object v0, Lgm3;->a:Lgm3;

    .line 12
    .line 13
    new-instance v1, Lty2;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v1, p0, v0, v2}, Lty2;-><init>(Lzr3;Lzr3;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p1, p2}, Lty2;->serialize(Lj42;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
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
