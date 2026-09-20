.class public abstract Lb33;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Loy6;


# instance fields
.field public final w:Lg73;

.field public final x:Ltp2;

.field public y:Z

.field public final synthetic z:Lh33;


# direct methods
.method public constructor <init>(Lh33;Lg73;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lb33;->z:Lh33;

    .line 8
    .line 9
    iput-object p2, p0, Lb33;->w:Lg73;

    .line 10
    .line 11
    new-instance p2, Ltp2;

    .line 12
    .line 13
    iget-object p1, p1, Lh33;->c:Lwr0;

    .line 14
    .line 15
    iget-object p1, p1, Lwr0;->y:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Lzw5;

    .line 18
    .line 19
    iget-object p1, p1, Lzw5;->w:Loy6;

    .line 20
    .line 21
    invoke-interface {p1}, Loy6;->g()Lri7;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-direct {p2, p1}, Ltp2;-><init>(Lri7;)V

    .line 26
    .line 27
    .line 28
    iput-object p2, p0, Lb33;->x:Ltp2;

    .line 29
    .line 30
    return-void
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
.method public Y(JLsc0;)J
    .locals 2

    .line 1
    iget-object v0, p0, Lb33;->z:Lh33;

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v1, v0, Lh33;->c:Lwr0;

    .line 7
    .line 8
    iget-object v1, v1, Lwr0;->y:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lzw5;

    .line 11
    .line 12
    invoke-virtual {v1, p1, p2, p3}, Lzw5;->Y(JLsc0;)J

    .line 13
    .line 14
    .line 15
    move-result-wide p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return-wide p0

    .line 17
    :catch_0
    move-exception p1

    .line 18
    iget-object p2, v0, Lh33;->b:Lv72;

    .line 19
    .line 20
    invoke-interface {p2}, Lv72;->e()V

    .line 21
    .line 22
    .line 23
    sget-object p2, Lh33;->f:Lbz2;

    .line 24
    .line 25
    invoke-virtual {p0, p2}, Lb33;->a(Lbz2;)V

    .line 26
    .line 27
    .line 28
    throw p1
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

.method public final a(Lbz2;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lb33;->z:Lh33;

    .line 5
    .line 6
    iget v1, v0, Lh33;->d:I

    .line 7
    .line 8
    const/4 v2, 0x6

    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v3, 0x5

    .line 13
    if-ne v1, v3, :cond_2

    .line 14
    .line 15
    iget-object v1, p0, Lb33;->x:Ltp2;

    .line 16
    .line 17
    iget-object v3, v1, Ltp2;->e:Lri7;

    .line 18
    .line 19
    sget-object v4, Lri7;->d:Lqi7;

    .line 20
    .line 21
    iput-object v4, v1, Ltp2;->e:Lri7;

    .line 22
    .line 23
    invoke-virtual {v3}, Lri7;->a()Lri7;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3}, Lri7;->b()Lri7;

    .line 27
    .line 28
    .line 29
    iput v2, v0, Lh33;->d:I

    .line 30
    .line 31
    invoke-virtual {p1}, Lbz2;->size()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-lez v1, :cond_1

    .line 36
    .line 37
    iget-object v0, v0, Lh33;->a:Ld45;

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    iget-object v0, v0, Ld45;->j:Ls61;

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    iget-object p0, p0, Lb33;->w:Lg73;

    .line 46
    .line 47
    invoke-static {v0, p0, p1}, La53;->b(Ls61;Lg73;Lbz2;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    return-void

    .line 51
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    iget p1, v0, Lh33;->d:I

    .line 54
    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v1, "state: "

    .line 58
    .line 59
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p0
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public final g()Lri7;
    .locals 0

    .line 1
    iget-object p0, p0, Lb33;->x:Ltp2;

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
