.class public final Ld14;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lba5;


# instance fields
.field public final a:Lam6;

.field public final b:Lfb4;


# direct methods
.method public constructor <init>(Lpj3;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lam6;

    .line 5
    .line 6
    sget-object v1, Ld63;->R:Ld63;

    .line 7
    .line 8
    new-instance v2, Lrb3;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v2, v3}, Lrb3;-><init>(Ld45;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, p1, v1, v2}, Lam6;-><init>(Lpj3;Lup7;Lnz3;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Ld14;->a:Lam6;

    .line 18
    .line 19
    iget-object p1, p1, Lpj3;->a:Lkb4;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v0, Lfb4;

    .line 25
    .line 26
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 27
    .line 28
    const/high16 v2, 0x3f800000    # 1.0f

    .line 29
    .line 30
    const/4 v3, 0x2

    .line 31
    const/4 v4, 0x3

    .line 32
    invoke-direct {v1, v4, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    .line 33
    .line 34
    .line 35
    new-instance v2, Le18;

    .line 36
    .line 37
    const/4 v3, 0x6

    .line 38
    invoke-direct {v2, v3}, Le18;-><init>(I)V

    .line 39
    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-direct {v0, p1, v1, v2, v3}, Lfb4;-><init>(Lkb4;Ljava/util/concurrent/ConcurrentHashMap;Lvr2;I)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Ld14;->b:Lfb4;

    .line 46
    .line 47
    return-void
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


# virtual methods
.method public final a(Lup2;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ld14;->a:Lam6;

    .line 5
    .line 6
    iget-object p0, p0, Lam6;->x:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lpj3;

    .line 9
    .line 10
    iget-object p0, p0, Lpj3;->b:Ly06;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return p0
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

.method public final b(Lup2;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Ld14;->c(Lup2;)Lc14;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
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

.method public final c(Lup2;)Lc14;
    .locals 4

    .line 1
    iget-object v0, p0, Ld14;->a:Lam6;

    .line 2
    .line 3
    iget-object v0, v0, Lam6;->x:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lpj3;

    .line 6
    .line 7
    iget-object v0, v0, Lpj3;->b:Ly06;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v0, Li16;

    .line 16
    .line 17
    invoke-direct {v0, p1}, Li16;-><init>(Lup2;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lp3;

    .line 21
    .line 22
    const/16 v2, 0x13

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-direct {v1, p0, v3, v0, v2}, Lp3;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Ld14;->b:Lfb4;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    new-instance v0, Lgb4;

    .line 34
    .line 35
    invoke-direct {v0, p1, v1}, Lgb4;-><init>(Ljava/lang/Object;Lsr2;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Lm70;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    if-eqz p0, :cond_0

    .line 43
    .line 44
    check-cast p0, Lc14;

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_0
    const/4 p0, 0x3

    .line 48
    invoke-static {p0}, Lfb4;->a(I)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    throw p0
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

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "LazyJavaPackageFragmentProvider of module "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Ld14;->a:Lam6;

    .line 9
    .line 10
    iget-object p0, p0, Lam6;->x:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lpj3;

    .line 13
    .line 14
    iget-object p0, p0, Lpj3;->o:Lsl4;

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
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

.method public final x(Lup2;Lvr2;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Ld14;->c(Lup2;)Lc14;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, Lc14;->G:Ldb4;

    .line 9
    .line 10
    invoke-virtual {p0}, Lib4;->b()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Ljava/util/List;

    .line 15
    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    sget-object p0, La42;->w:La42;

    .line 19
    .line 20
    :cond_0
    return-object p0
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
