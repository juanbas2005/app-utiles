.class public final synthetic Lpn3;
.super Lqp4;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final D:Lpn3;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lpn3;

    .line 2
    .line 3
    const-string v1, "getJvmFlags(Lkotlin/metadata/KmProperty;)I"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const-class v3, Lqn3;

    .line 7
    .line 8
    const-string v4, "jvmFlags"

    .line 9
    .line 10
    invoke-direct {v0, v3, v4, v1, v2}, Lqp4;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lpn3;->D:Lpn3;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public final E(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lsu3;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    sget-object p2, Lqn3;->a:[Lyr3;

    .line 10
    .line 11
    invoke-static {p1}, Ltf4;->z(Lsu3;)Lap3;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput p0, p1, Lap3;->a:I

    .line 16
    .line 17
    return-void
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

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsu3;

    .line 2
    .line 3
    sget-object p0, Lqn3;->a:[Lyr3;

    .line 4
    .line 5
    invoke-static {p1}, Ltf4;->z(Lsu3;)Lap3;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p0, p0, Lap3;->a:I

    .line 10
    .line 11
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
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
