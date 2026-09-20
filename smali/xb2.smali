.class public final Lxb2;
.super Lrp2;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final x:Lgg0;

.field public y:Z


# direct methods
.method public constructor <init>(Ltu6;Lgg0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lrp2;-><init>(Ltu6;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lxb2;->x:Lgg0;

    .line 5
    .line 6
    return-void
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
.method public final close()V
    .locals 2

    .line 1
    :try_start_0
    invoke-super {p0}, Lrp2;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    move-exception v0

    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, p0, Lxb2;->y:Z

    .line 8
    .line 9
    iget-object p0, p0, Lxb2;->x:Lgg0;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lgg0;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final flush()V
    .locals 2

    .line 1
    :try_start_0
    invoke-super {p0}, Lrp2;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    move-exception v0

    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, p0, Lxb2;->y:Z

    .line 8
    .line 9
    iget-object p0, p0, Lxb2;->x:Lgg0;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lgg0;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final g0(JLsc0;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lxb2;->y:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p3, p1, p2}, Lsc0;->skip(J)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    :try_start_0
    iget-object v0, p0, Lrp2;->w:Ltu6;

    .line 10
    .line 11
    invoke-interface {v0, p1, p2, p3}, Ltu6;->g0(JLsc0;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    move-exception p1

    .line 16
    const/4 p2, 0x1

    .line 17
    iput-boolean p2, p0, Lxb2;->y:Z

    .line 18
    .line 19
    iget-object p0, p0, Lxb2;->x:Lgg0;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lgg0;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    return-void
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
