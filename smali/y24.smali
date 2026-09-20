.class public final Ly24;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lx24;


# instance fields
.field public final synthetic a:Lob5;

.field public final synthetic b:Z


# direct methods
.method public constructor <init>(Lob5;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly24;->a:Lob5;

    .line 5
    .line 6
    iput-boolean p2, p0, Ly24;->b:Z

    .line 7
    .line 8
    return-void
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
.method public final a()I
    .locals 4

    .line 1
    iget-object p0, p0, Ly24;->a:Lob5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lob5;->m()Ldb5;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Ldb5;->e:Lz75;

    .line 8
    .line 9
    sget-object v1, Lz75;->w:Lz75;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lob5;->m()Ldb5;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ldb5;->i()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    const-wide v2, 0xffffffffL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    and-long/2addr v0, v2

    .line 27
    :goto_0
    long-to-int p0, v0

    .line 28
    return p0

    .line 29
    :cond_0
    invoke-virtual {p0}, Lob5;->m()Ldb5;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Ldb5;->i()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    const/16 p0, 0x20

    .line 38
    .line 39
    shr-long/2addr v0, p0

    .line 40
    goto :goto_0
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

.method public final b()F
    .locals 2

    .line 1
    iget-object p0, p0, Ly24;->a:Lob5;

    .line 2
    .line 3
    invoke-static {p0}, Lfb5;->f(Lob5;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    long-to-float p0, v0

    .line 8
    return p0
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

.method public final c()I
    .locals 1

    .line 1
    iget-object p0, p0, Ly24;->a:Lob5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lob5;->m()Ldb5;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, Ldb5;->f:I

    .line 8
    .line 9
    neg-int v0, v0

    .line 10
    invoke-virtual {p0}, Lob5;->m()Ldb5;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget p0, p0, Ldb5;->d:I

    .line 15
    .line 16
    add-int/2addr v0, p0

    .line 17
    return v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final d()F
    .locals 2

    .line 1
    iget-object p0, p0, Ly24;->a:Lob5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lob5;->m()Ldb5;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0}, Lob5;->n()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-static {v0, p0}, Lrb5;->a(Ldb5;I)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    long-to-float p0, v0

    .line 16
    return p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final e(ILbi1;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object p0, p0, Ly24;->a:Lob5;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lbi1;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-direct {v0, p0, p1, v1, v2}, Lbi1;-><init>(Ljava/lang/Object;ILf61;I)V

    .line 11
    .line 12
    .line 13
    sget-object p1, Lhq4;->w:Lhq4;

    .line 14
    .line 15
    invoke-virtual {p0, p1, v0, p2}, Lob5;->d(Lhq4;Lgs2;Lh61;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object p1, Lvs7;->a:Lvs7;

    .line 20
    .line 21
    sget-object p2, Lp81;->w:Lp81;

    .line 22
    .line 23
    if-ne p0, p2, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object p0, p1

    .line 27
    :goto_0
    if-ne p0, p2, :cond_1

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_1
    return-object p1
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

.method public final f()Lat0;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-boolean v1, p0, Ly24;->b:Z

    .line 3
    .line 4
    iget-object p0, p0, Ly24;->a:Lob5;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lat0;

    .line 9
    .line 10
    invoke-virtual {p0}, Lob5;->n()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-direct {v1, p0, v0}, Lat0;-><init>(II)V

    .line 15
    .line 16
    .line 17
    return-object v1

    .line 18
    :cond_0
    new-instance v1, Lat0;

    .line 19
    .line 20
    invoke-virtual {p0}, Lob5;->n()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-direct {v1, v0, p0}, Lat0;-><init>(II)V

    .line 25
    .line 26
    .line 27
    return-object v1
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
