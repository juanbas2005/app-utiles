.class public abstract Lgk7;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lpa5;

.field public static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lpa5;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1, v1, v1}, Lpa5;-><init>(FFFF)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lgk7;->a:Lpa5;

    .line 8
    .line 9
    const/high16 v0, 0x42800000    # 64.0f

    .line 10
    .line 11
    sput v0, Lgk7;->b:F

    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static a(Lqt0;)Lfk7;
    .locals 14

    .line 1
    iget-object v0, p0, Lqt0;->b0:Lfk7;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lfk7;

    .line 6
    .line 7
    sget-object v0, Lh03;->a:Lrt0;

    .line 8
    .line 9
    invoke-static {p0, v0}, Lst0;->d(Lqt0;Lrt0;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    sget-object v0, Lh03;->c:Lrt0;

    .line 14
    .line 15
    invoke-static {p0, v0}, Lst0;->d(Lqt0;Lrt0;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v4

    .line 19
    sget-object v0, Lh03;->b:Lrt0;

    .line 20
    .line 21
    invoke-static {p0, v0}, Lst0;->d(Lqt0;Lrt0;)J

    .line 22
    .line 23
    .line 24
    move-result-wide v6

    .line 25
    sget-object v0, Lh03;->e:Lrt0;

    .line 26
    .line 27
    invoke-static {p0, v0}, Lst0;->d(Lqt0;Lrt0;)J

    .line 28
    .line 29
    .line 30
    move-result-wide v8

    .line 31
    sget-object v0, Lh03;->f:Lrt0;

    .line 32
    .line 33
    invoke-static {p0, v0}, Lst0;->d(Lqt0;Lrt0;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v10

    .line 37
    sget-object v0, Lh03;->d:Lrt0;

    .line 38
    .line 39
    invoke-static {p0, v0}, Lst0;->d(Lqt0;Lrt0;)J

    .line 40
    .line 41
    .line 42
    move-result-wide v12

    .line 43
    invoke-direct/range {v1 .. v13}, Lfk7;-><init>(JJJJJJ)V

    .line 44
    .line 45
    .line 46
    iput-object v1, p0, Lqt0;->b0:Lfk7;

    .line 47
    .line 48
    return-object v1

    .line 49
    :cond_0
    return-object v0
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

.method public static b(Lyt2;)Le64;
    .locals 2

    .line 1
    sget-object v0, Lib8;->w:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-static {p0}, Ln63;->h(Lyt2;)Lib8;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lib8;->g:Lnj;

    .line 8
    .line 9
    invoke-static {p0}, Ln63;->h(Lyt2;)Lib8;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-object p0, p0, Lib8;->b:Lnj;

    .line 14
    .line 15
    new-instance v1, Lss7;

    .line 16
    .line 17
    invoke-direct {v1, v0, p0}, Lss7;-><init>(Laa8;Laa8;)V

    .line 18
    .line 19
    .line 20
    sget p0, Lh75;->g:I

    .line 21
    .line 22
    or-int/lit8 p0, p0, 0x10

    .line 23
    .line 24
    new-instance v0, Le64;

    .line 25
    .line 26
    invoke-direct {v0, v1, p0}, Le64;-><init>(Laa8;I)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public static c(JLyt2;)Lfk7;
    .locals 13

    .line 1
    sget-wide v3, Ljt0;->g:J

    .line 2
    .line 3
    sget-object v0, Lch4;->b:Lt37;

    .line 4
    .line 5
    invoke-virtual {p2, v0}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    check-cast p2, Lzg4;

    .line 10
    .line 11
    iget-object p2, p2, Lzg4;->a:Lqt0;

    .line 12
    .line 13
    invoke-static {p2}, Lgk7;->a(Lqt0;)Lfk7;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    move-wide v5, v3

    .line 18
    move-wide v7, v3

    .line 19
    move-wide v9, v3

    .line 20
    move-wide v11, v3

    .line 21
    move-wide v1, p0

    .line 22
    invoke-virtual/range {v0 .. v12}, Lfk7;->a(JJJJJJ)Lfk7;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
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
