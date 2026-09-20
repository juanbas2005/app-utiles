.class public final Lhs0;
.super Lvv2;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final e:Luq4;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "clone"

    .line 2
    .line 3
    invoke-static {v0}, Luq4;->e(Ljava/lang/String;)Luq4;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lhs0;->e:Luq4;

    .line 8
    .line 9
    return-void
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


# virtual methods
.method public final h()Ljava/util/List;
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    sget-object v1, Lsy6;->j:Lor2;

    .line 3
    .line 4
    iget-object p0, p0, Lvv2;->b:Lj0;

    .line 5
    .line 6
    sget-object v2, Lhs0;->e:Luq4;

    .line 7
    .line 8
    invoke-static {p0, v2, v0, v1}, Lau6;->q1(Lql4;Luq4;ILsy6;)Lau6;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-virtual {p0}, Lj0;->Q()Lqz3;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    invoke-static {p0}, Lts1;->e(Lvj1;)Lfv3;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Lfv3;->e()Lfu6;

    .line 21
    .line 22
    .line 23
    move-result-object v9

    .line 24
    sget-object v10, Lfl4;->z:Lfl4;

    .line 25
    .line 26
    sget-object v11, Lvs1;->c:Lus1;

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    sget-object v6, La42;->w:La42;

    .line 30
    .line 31
    move-object v7, v6

    .line 32
    move-object v8, v6

    .line 33
    invoke-virtual/range {v3 .. v11}, Lau6;->s1(Lqz3;Lqz3;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lvw3;Lfl4;Lus1;)Lau6;

    .line 34
    .line 35
    .line 36
    invoke-static {v3}, Lsg3;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
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
