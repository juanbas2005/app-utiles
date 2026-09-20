.class public final Ltr7;
.super Lmo5;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final c:Ltr7;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ltr7;

    .line 2
    .line 3
    sget-object v1, Lur7;->a:Lur7;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lmo5;-><init>(Lzr3;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ltr7;->c:Ltr7;

    .line 9
    .line 10
    return-void
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
.method public final d(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lrr7;

    .line 2
    .line 3
    iget-object p0, p1, Lrr7;->w:[J

    .line 4
    .line 5
    array-length p0, p0

    .line 6
    return p0
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

.method public final f(Lgy0;ILjava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p3, Lsr7;

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lmo5;->b:Llo5;

    .line 7
    .line 8
    invoke-interface {p1, p0, p2}, Lgy0;->d(Llo5;I)Lok1;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0}, Lok1;->v()J

    .line 13
    .line 14
    .line 15
    move-result-wide p0

    .line 16
    invoke-static {p3}, Lko5;->c(Lko5;)V

    .line 17
    .line 18
    .line 19
    iget-object p2, p3, Lsr7;->a:[J

    .line 20
    .line 21
    iget v0, p3, Lsr7;->b:I

    .line 22
    .line 23
    add-int/lit8 v1, v0, 0x1

    .line 24
    .line 25
    iput v1, p3, Lsr7;->b:I

    .line 26
    .line 27
    aput-wide p0, p2, v0

    .line 28
    .line 29
    return-void
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

.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lrr7;

    .line 2
    .line 3
    iget-object p0, p1, Lrr7;->w:[J

    .line 4
    .line 5
    new-instance p1, Lsr7;

    .line 6
    .line 7
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p0, p1, Lsr7;->a:[J

    .line 11
    .line 12
    array-length p0, p0

    .line 13
    iput p0, p1, Lsr7;->b:I

    .line 14
    .line 15
    const/16 p0, 0xa

    .line 16
    .line 17
    invoke-virtual {p1, p0}, Lsr7;->b(I)V

    .line 18
    .line 19
    .line 20
    return-object p1
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

.method public final j()Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 p0, 0x0

    .line 2
    new-array p0, p0, [J

    .line 3
    .line 4
    new-instance v0, Lrr7;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lrr7;-><init>([J)V

    .line 7
    .line 8
    .line 9
    return-object v0
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

.method public final k(Lhy0;Ljava/lang/Object;I)V
    .locals 4

    .line 1
    check-cast p2, Lrr7;

    .line 2
    .line 3
    iget-object p2, p2, Lrr7;->w:[J

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    :goto_0
    if-ge v0, p3, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lmo5;->b:Llo5;

    .line 12
    .line 13
    invoke-interface {p1, v1, v0}, Lhy0;->C(Llo5;I)Lj42;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    aget-wide v2, p2, v0

    .line 18
    .line 19
    invoke-interface {v1, v2, v3}, Lj42;->B(J)V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
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
