.class public final Lqj3;
.super Lai3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final synthetic g:[Lyr3;


# instance fields
.field public final f:Lib4;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lgr5;

    .line 2
    .line 3
    const-class v1, Lqj3;

    .line 4
    .line 5
    const-string v2, "allValueArguments"

    .line 6
    .line 7
    const-string v3, "getAllValueArguments()Ljava/util/Map;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lgr5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [Lyr3;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, Lqj3;->g:[Lyr3;

    .line 19
    .line 20
    return-void
    .line 21
.end method

.method public constructor <init>(Ln06;Lam6;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Lm27;->w:Lup2;

    .line 8
    .line 9
    invoke-direct {p0, p2, p1, v0}, Lai3;-><init>(Lam6;Ln06;Lup2;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p2, Lam6;->x:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Lpj3;

    .line 15
    .line 16
    iget-object p1, p1, Lpj3;->a:Lkb4;

    .line 17
    .line 18
    new-instance p2, Lk3;

    .line 19
    .line 20
    const/16 v0, 0x1a

    .line 21
    .line 22
    invoke-direct {p2, v0, p0}, Lk3;-><init>(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance v0, Lib4;

    .line 29
    .line 30
    invoke-direct {v0, p1, p2}, Lhb4;-><init>(Lkb4;Lsr2;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lqj3;->f:Lib4;

    .line 34
    .line 35
    return-void
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


# virtual methods
.method public final g()Ljava/util/Map;
    .locals 2

    .line 1
    sget-object v0, Lqj3;->g:[Lyr3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, Lqj3;->f:Lib4;

    .line 7
    .line 8
    invoke-static {p0, v0}, Lp25;->q(Lt05;Lyr3;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/util/Map;

    .line 13
    .line 14
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
