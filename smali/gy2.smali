.class public final Lgy2;
.super Lh81;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lso1;


# instance fields
.field public final A:Z

.field public final B:Lgy2;

.field public final y:Landroid/os/Handler;

.field public final z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 23
    invoke-direct {p0, p1, v0, v1}, Lgy2;-><init>(Landroid/os/Handler;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lh81;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgy2;->y:Landroid/os/Handler;

    .line 5
    .line 6
    iput-object p2, p0, Lgy2;->z:Ljava/lang/String;

    .line 7
    .line 8
    iput-boolean p3, p0, Lgy2;->A:Z

    .line 9
    .line 10
    if-eqz p3, :cond_0

    .line 11
    .line 12
    move-object p3, p0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p3, Lgy2;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-direct {p3, p1, p2, v0}, Lgy2;-><init>(Landroid/os/Handler;Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    :goto_0
    iput-object p3, p0, Lgy2;->B:Lgy2;

    .line 21
    .line 22
    return-void
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


# virtual methods
.method public final D(Le81;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lgy2;->y:Landroid/os/Handler;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, Lgy2;->o0(Le81;Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
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

.method public final a(JLsi7;Le81;)Lmw1;
    .locals 3

    .line 1
    const-wide v0, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v2, p1, v0

    .line 7
    .line 8
    if-lez v2, :cond_0

    .line 9
    .line 10
    move-wide p1, v0

    .line 11
    :cond_0
    iget-object v0, p0, Lgy2;->y:Landroid/os/Handler;

    .line 12
    .line 13
    invoke-virtual {v0, p3, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    new-instance p1, Lfy2;

    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    invoke-direct {p1, p2, p0, p3}, Lfy2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_1
    invoke-virtual {p0, p4, p3}, Lgy2;->o0(Le81;Ljava/lang/Runnable;)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lf05;->w:Lf05;

    .line 30
    .line 31
    return-object p0
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

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lgy2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lgy2;

    .line 6
    .line 7
    iget-object v0, p1, Lgy2;->y:Landroid/os/Handler;

    .line 8
    .line 9
    iget-object v1, p0, Lgy2;->y:Landroid/os/Handler;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    iget-boolean p1, p1, Lgy2;->A:Z

    .line 14
    .line 15
    iget-boolean p0, p0, Lgy2;->A:Z

    .line 16
    .line 17
    if-ne p1, p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lgy2;->y:Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-boolean p0, p0, Lgy2;->A:Z

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/16 p0, 0x4cf

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/16 p0, 0x4d5

    .line 15
    .line 16
    :goto_0
    xor-int/2addr p0, v0

    .line 17
    return p0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final k(JLkk0;)V
    .locals 4

    .line 1
    new-instance v0, Lga;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    invoke-direct {v0, v1, p3, p0}, Lga;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const-wide v1, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    cmp-long v3, p1, v1

    .line 14
    .line 15
    if-lez v3, :cond_0

    .line 16
    .line 17
    move-wide p1, v1

    .line 18
    :cond_0
    iget-object v1, p0, Lgy2;->y:Landroid/os/Handler;

    .line 19
    .line 20
    invoke-virtual {v1, v0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    new-instance p1, Lm0;

    .line 27
    .line 28
    const/16 p2, 0x17

    .line 29
    .line 30
    invoke-direct {p1, p2, p0, v0}, Lm0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p3, p1}, Lkk0;->x(Lvr2;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    iget-object p1, p3, Lkk0;->A:Le81;

    .line 38
    .line 39
    invoke-virtual {p0, p1, v0}, Lgy2;->o0(Le81;Ljava/lang/Runnable;)V

    .line 40
    .line 41
    .line 42
    return-void
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public final m0(Le81;)Z
    .locals 0

    .line 1
    iget-boolean p1, p0, Lgy2;->A:Z

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p0, p0, Lgy2;->y:Landroid/os/Handler;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p1, p0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0

    .line 24
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 25
    return p0
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final n0(I)Lh81;
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    invoke-static {p1}, Lsu0;->g(I)V

    .line 3
    .line 4
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final o0(Le81;Ljava/lang/Runnable;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "The task was rejected, the handler underlying the dispatcher \'"

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, "\' was closed"

    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-direct {v0, p0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1, v0}, Lr16;->u(Le81;Ljava/util/concurrent/CancellationException;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Law1;->a:Ldn1;

    .line 29
    .line 30
    sget-object p0, Lcm1;->y:Lcm1;

    .line 31
    .line 32
    invoke-virtual {p0, p1, p2}, Lcm1;->D(Le81;Ljava/lang/Runnable;)V

    .line 33
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

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Law1;->a:Ldn1;

    .line 2
    .line 3
    sget-object v0, Lpe4;->a:Lgy2;

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const-string v0, "Dispatchers.Main"

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :try_start_0
    iget-object v0, v0, Lgy2;->B:Lgy2;
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catch_0
    move-object v0, v1

    .line 15
    :goto_0
    if-ne p0, v0, :cond_1

    .line 16
    .line 17
    const-string v0, "Dispatchers.Main.immediate"

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move-object v0, v1

    .line 21
    :goto_1
    if-nez v0, :cond_3

    .line 22
    .line 23
    iget-object v0, p0, Lgy2;->z:Ljava/lang/String;

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    iget-object v0, p0, Lgy2;->y:Landroid/os/Handler;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/os/Handler;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :cond_2
    iget-boolean p0, p0, Lgy2;->A:Z

    .line 34
    .line 35
    if-eqz p0, :cond_3

    .line 36
    .line 37
    const-string p0, ".immediate"

    .line 38
    .line 39
    invoke-static {v0, p0}, Lb81;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    move-object v0, p0

    .line 44
    :cond_3
    return-object v0
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
