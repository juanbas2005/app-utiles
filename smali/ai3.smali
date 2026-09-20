.class public Lai3;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lwl5;


# static fields
.field public static final synthetic e:[Lyr3;


# instance fields
.field public final a:Lup2;

.field public final b:Lsy6;

.field public final c:Lib4;

.field public final d:Lo06;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lgr5;

    .line 2
    .line 3
    const-class v1, Lai3;

    .line 4
    .line 5
    const-string v2, "type"

    .line 6
    .line 7
    const-string v3, "getType()Lorg/jetbrains/kotlin/types/SimpleType;"

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
    sput-object v1, Lai3;->e:[Lyr3;

    .line 19
    .line 20
    return-void
    .line 21
.end method

.method public constructor <init>(Lam6;Ln06;Lup2;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lam6;->x:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lpj3;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p3, p0, Lai3;->a:Lup2;

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    iget-object p3, v0, Lpj3;->j:Ltd0;

    .line 19
    .line 20
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {p2}, Ltd0;->F(Loi3;)Lsa6;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sget-object p3, Lsy6;->j:Lor2;

    .line 29
    .line 30
    :goto_0
    iput-object p3, p0, Lai3;->b:Lsy6;

    .line 31
    .line 32
    iget-object p3, v0, Lpj3;->a:Lkb4;

    .line 33
    .line 34
    new-instance v0, Lp3;

    .line 35
    .line 36
    const/16 v1, 0xc

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-direct {v0, p1, v2, p0, v1}, Lp3;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    new-instance p1, Lib4;

    .line 46
    .line 47
    invoke-direct {p1, p3, v0}, Lhb4;-><init>(Lkb4;Lsr2;)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lai3;->c:Lib4;

    .line 51
    .line 52
    if-eqz p2, :cond_1

    .line 53
    .line 54
    invoke-virtual {p2}, Ln06;->b()Ljava/util/ArrayList;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, Ldt0;->x0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, Lo06;

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    const/4 p1, 0x0

    .line 66
    :goto_1
    iput-object p1, p0, Lai3;->d:Lo06;

    .line 67
    .line 68
    return-void
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method


# virtual methods
.method public final b()Lvw3;
    .locals 2

    .line 1
    sget-object v0, Lai3;->e:[Lyr3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, Lai3;->c:Lib4;

    .line 7
    .line 8
    invoke-static {p0, v0}, Lp25;->q(Lt05;Lyr3;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, Lfu6;

    .line 16
    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final e()Lsy6;
    .locals 0

    .line 1
    iget-object p0, p0, Lai3;->b:Lsy6;

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

.method public final f()Lup2;
    .locals 0

    .line 1
    iget-object p0, p0, Lai3;->a:Lup2;

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

.method public g()Ljava/util/Map;
    .locals 0

    .line 1
    sget-object p0, Lb42;->w:Lb42;

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
