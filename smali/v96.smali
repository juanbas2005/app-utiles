.class public final Lv96;
.super Lbb0;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final b0:Lkg5;

.field public c0:I

.field public d0:Ljava/lang/String;

.field public final e0:Lz53;


# direct methods
.method public constructor <init>(Lye6;Ljava/util/LinkedHashMap;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lv96;->c0:I

    .line 9
    .line 10
    const-string v0, ""

    .line 11
    .line 12
    iput-object v0, p0, Lv96;->d0:Ljava/lang/String;

    .line 13
    .line 14
    sget-object v0, Lwl6;->a:Lz53;

    .line 15
    .line 16
    iput-object v0, p0, Lv96;->e0:Lz53;

    .line 17
    .line 18
    new-instance v0, Lkg5;

    .line 19
    .line 20
    invoke-direct {v0, p1, p2}, Lkg5;-><init>(Lye6;Ljava/util/LinkedHashMap;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lv96;->b0:Lkg5;

    .line 24
    .line 25
    return-void
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


# virtual methods
.method public final E0()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lv96;->b0:Lkg5;

    .line 2
    .line 3
    iget-object v1, p0, Lv96;->d0:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lkg5;->r(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const-string v0, "Unexpected null value for non-nullable argument "

    .line 13
    .line 14
    iget-object p0, p0, Lv96;->d0:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v0, p0}, Lku4;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
    .line 21
.end method

.method public final a()Lz53;
    .locals 0

    .line 1
    iget-object p0, p0, Lv96;->e0:Lz53;

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

.method public final e0()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lv96;->E0()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public final g(Lzr3;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lv96;->E0()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
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

.method public final h(Lll6;)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lv96;->c0:I

    .line 5
    .line 6
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    invoke-interface {p1}, Lll6;->e()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-lt v0, v1, :cond_1

    .line 13
    .line 14
    const/4 p0, -0x1

    .line 15
    return p0

    .line 16
    :cond_1
    invoke-interface {p1, v0}, Lll6;->f(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v2, p0, Lv96;->b0:Lkg5;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v2, v2, Lkg5;->x:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Lye6;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v2, v2, Lye6;->b:Lo9;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object v2, v2, Lo9;->x:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 43
    .line 44
    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_0

    .line 49
    .line 50
    iput v0, p0, Lv96;->c0:I

    .line 51
    .line 52
    iput-object v1, p0, Lv96;->d0:Ljava/lang/String;

    .line 53
    .line 54
    return v0
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public final q(Lll6;)Lok1;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lb35;->v(Lll6;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-interface {p1, v0}, Lll6;->f(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lv96;->d0:Ljava/lang/String;

    .line 16
    .line 17
    iput v0, p0, Lv96;->c0:I

    .line 18
    .line 19
    :cond_0
    return-object p0
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

.method public final w()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lv96;->b0:Lkg5;

    .line 2
    .line 3
    iget-object p0, p0, Lv96;->d0:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lkg5;->r(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
