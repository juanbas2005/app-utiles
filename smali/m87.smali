.class public final Lm87;
.super Lo87;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final A:Ljava/lang/Object;

.field public final synthetic z:I


# direct methods
.method public constructor <init>(Lir2;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lm87;->z:I

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1, p2}, Lo87;-><init>(Lir2;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lir2;->l(Ljava/lang/String;)Lqr2;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lm87;->A:Ljava/lang/Object;

    .line 18
    .line 19
    return-void
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

.method public constructor <init>(Lir2;Ljava/lang/String;Ll87;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lm87;->z:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    invoke-direct {p0, p1, p2}, Lo87;-><init>(Lir2;Ljava/lang/String;)V

    .line 23
    iput-object p3, p0, Lm87;->A:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lir2;Ljava/lang/String;Ln87;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lm87;->z:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    invoke-direct {p0, p1, p2}, Lo87;-><init>(Lir2;Ljava/lang/String;)V

    .line 21
    iput-object p3, p0, Lm87;->A:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final F(ILjava/lang/String;)V
    .locals 2

    .line 1
    iget v0, p0, Lm87;->z:I

    .line 2
    .line 3
    iget-object v1, p0, Lm87;->A:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lo87;->a()V

    .line 12
    .line 13
    .line 14
    const/16 p0, 0x19

    .line 15
    .line 16
    const-string p1, "column index out of range"

    .line 17
    .line 18
    invoke-static {p0, p1}, Ll55;->w(ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    throw p0

    .line 23
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lo87;->a()V

    .line 27
    .line 28
    .line 29
    check-cast v1, Lqr2;

    .line 30
    .line 31
    invoke-interface {v1, p1, p2}, Lk87;->r(ILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    check-cast v1, Ln87;

    .line 39
    .line 40
    invoke-virtual {v1, p1, p2}, Ln87;->F(ILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 46
    .line 47
.end method

.method public J()Z
    .locals 1

    .line 1
    iget v0, p0, Lm87;->z:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lo87;->J()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Lm87;->A:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ln87;

    .line 14
    .line 15
    invoke-interface {p0}, Lab6;->J()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final K(D)V
    .locals 2

    .line 1
    iget v0, p0, Lm87;->z:I

    .line 2
    .line 3
    iget-object v1, p0, Lm87;->A:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lo87;->a()V

    .line 9
    .line 10
    .line 11
    const/16 p0, 0x19

    .line 12
    .line 13
    const-string p1, "column index out of range"

    .line 14
    .line 15
    invoke-static {p0, p1}, Ll55;->w(ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0

    .line 20
    :pswitch_0
    invoke-virtual {p0}, Lo87;->a()V

    .line 21
    .line 22
    .line 23
    check-cast v1, Lqr2;

    .line 24
    .line 25
    const/4 p0, 0x3

    .line 26
    invoke-interface {v1, p1, p2, p0}, Lk87;->W(DI)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    check-cast v1, Ln87;

    .line 31
    .line 32
    invoke-virtual {v1, p1, p2}, Ln87;->K(D)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public final R(I)Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lm87;->z:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "no row"

    .line 5
    .line 6
    const/16 v3, 0x15

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lo87;->a()V

    .line 12
    .line 13
    .line 14
    invoke-static {v3, v2}, Ll55;->w(ILjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v1

    .line 18
    :pswitch_0
    invoke-virtual {p0}, Lo87;->a()V

    .line 19
    .line 20
    .line 21
    invoke-static {v3, v2}, Ll55;->w(ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v1

    .line 25
    :pswitch_1
    iget-object p0, p0, Lm87;->A:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ln87;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ln87;->R(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public final close()V
    .locals 3

    .line 1
    iget v0, p0, Lm87;->z:I

    .line 2
    .line 3
    iget-object v1, p0, Lm87;->A:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iput-boolean v2, p0, Lo87;->y:Z

    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    check-cast v1, Lqr2;

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    .line 15
    .line 16
    .line 17
    iput-boolean v2, p0, Lo87;->y:Z

    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    check-cast v1, Ln87;

    .line 21
    .line 22
    invoke-virtual {v1}, Ln87;->close()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final f(JI)V
    .locals 2

    .line 1
    iget v0, p0, Lm87;->z:I

    .line 2
    .line 3
    iget-object v1, p0, Lm87;->A:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lo87;->a()V

    .line 9
    .line 10
    .line 11
    const/16 p0, 0x19

    .line 12
    .line 13
    const-string p1, "column index out of range"

    .line 14
    .line 15
    invoke-static {p0, p1}, Ll55;->w(ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0

    .line 20
    :pswitch_0
    invoke-virtual {p0}, Lo87;->a()V

    .line 21
    .line 22
    .line 23
    check-cast v1, Lqr2;

    .line 24
    .line 25
    invoke-interface {v1, p1, p2, p3}, Lk87;->f(JI)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_1
    check-cast v1, Ln87;

    .line 30
    .line 31
    invoke-virtual {v1, p1, p2, p3}, Ln87;->f(JI)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final getBlob(I)[B
    .locals 4

    .line 1
    iget v0, p0, Lm87;->z:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "no row"

    .line 5
    .line 6
    const/16 v3, 0x15

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lo87;->a()V

    .line 12
    .line 13
    .line 14
    invoke-static {v3, v2}, Ll55;->w(ILjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v1

    .line 18
    :pswitch_0
    invoke-virtual {p0}, Lo87;->a()V

    .line 19
    .line 20
    .line 21
    invoke-static {v3, v2}, Ll55;->w(ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v1

    .line 25
    :pswitch_1
    iget-object p0, p0, Lm87;->A:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ln87;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ln87;->getBlob(I)[B

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public final getColumnCount()I
    .locals 2

    .line 1
    iget v0, p0, Lm87;->z:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lo87;->a()V

    .line 8
    .line 9
    .line 10
    return v1

    .line 11
    :pswitch_0
    invoke-virtual {p0}, Lo87;->a()V

    .line 12
    .line 13
    .line 14
    return v1

    .line 15
    :pswitch_1
    iget-object p0, p0, Lm87;->A:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Ln87;

    .line 18
    .line 19
    invoke-virtual {p0}, Ln87;->getColumnCount()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final getColumnName(I)Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lm87;->z:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "no row"

    .line 5
    .line 6
    const/16 v3, 0x15

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lo87;->a()V

    .line 12
    .line 13
    .line 14
    invoke-static {v3, v2}, Ll55;->w(ILjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v1

    .line 18
    :pswitch_0
    invoke-virtual {p0}, Lo87;->a()V

    .line 19
    .line 20
    .line 21
    invoke-static {v3, v2}, Ll55;->w(ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v1

    .line 25
    :pswitch_1
    iget-object p0, p0, Lm87;->A:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ln87;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ln87;->getColumnName(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public final getDouble(I)D
    .locals 4

    .line 1
    iget v0, p0, Lm87;->z:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "no row"

    .line 5
    .line 6
    const/16 v3, 0x15

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lo87;->a()V

    .line 12
    .line 13
    .line 14
    invoke-static {v3, v2}, Ll55;->w(ILjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v1

    .line 18
    :pswitch_0
    invoke-virtual {p0}, Lo87;->a()V

    .line 19
    .line 20
    .line 21
    invoke-static {v3, v2}, Ll55;->w(ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v1

    .line 25
    :pswitch_1
    iget-object p0, p0, Lm87;->A:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ln87;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ln87;->getDouble(I)D

    .line 30
    .line 31
    .line 32
    move-result-wide p0

    .line 33
    return-wide p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public final getLong(I)J
    .locals 4

    .line 1
    iget v0, p0, Lm87;->z:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "no row"

    .line 5
    .line 6
    const/16 v3, 0x15

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lo87;->a()V

    .line 12
    .line 13
    .line 14
    invoke-static {v3, v2}, Ll55;->w(ILjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v1

    .line 18
    :pswitch_0
    invoke-virtual {p0}, Lo87;->a()V

    .line 19
    .line 20
    .line 21
    invoke-static {v3, v2}, Ll55;->w(ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v1

    .line 25
    :pswitch_1
    iget-object p0, p0, Lm87;->A:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ln87;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ln87;->getLong(I)J

    .line 30
    .line 31
    .line 32
    move-result-wide p0

    .line 33
    return-wide p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public final h(I[B)V
    .locals 2

    .line 1
    iget v0, p0, Lm87;->z:I

    .line 2
    .line 3
    iget-object v1, p0, Lm87;->A:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lo87;->a()V

    .line 9
    .line 10
    .line 11
    const/16 p0, 0x19

    .line 12
    .line 13
    const-string p1, "column index out of range"

    .line 14
    .line 15
    invoke-static {p0, p1}, Ll55;->w(ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0

    .line 20
    :pswitch_0
    invoke-virtual {p0}, Lo87;->a()V

    .line 21
    .line 22
    .line 23
    check-cast v1, Lqr2;

    .line 24
    .line 25
    invoke-interface {v1, p1, p2}, Lk87;->h(I[B)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_1
    check-cast v1, Ln87;

    .line 30
    .line 31
    invoke-virtual {v1, p1, p2}, Ln87;->h(I[B)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final i0()Z
    .locals 6

    .line 1
    iget v0, p0, Lm87;->z:I

    .line 2
    .line 3
    iget-object v1, p0, Lo87;->w:Lir2;

    .line 4
    .line 5
    iget-object v2, p0, Lm87;->A:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v2, Ll87;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_6

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    if-eq p0, v0, :cond_5

    .line 21
    .line 22
    const/4 v0, 0x2

    .line 23
    if-eq p0, v0, :cond_4

    .line 24
    .line 25
    const/4 v0, 0x3

    .line 26
    if-eq p0, v0, :cond_3

    .line 27
    .line 28
    const/4 v0, 0x4

    .line 29
    if-ne p0, v0, :cond_2

    .line 30
    .line 31
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    iget-object v0, v1, Lir2;->w:Landroid/database/sqlite/SQLiteDatabase;

    .line 36
    .line 37
    sget-object v2, Lir2;->A:Lnz3;

    .line 38
    .line 39
    invoke-interface {v2}, Lnz3;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    check-cast v4, Ljava/lang/reflect/Method;

    .line 44
    .line 45
    if-eqz v4, :cond_1

    .line 46
    .line 47
    sget-object v4, Lir2;->z:Lnz3;

    .line 48
    .line 49
    invoke-interface {v4}, Lnz3;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    check-cast v5, Ljava/lang/reflect/Method;

    .line 54
    .line 55
    if-eqz v5, :cond_1

    .line 56
    .line 57
    invoke-interface {v2}, Lnz3;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Ljava/lang/reflect/Method;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-interface {v4}, Lnz3;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Ljava/lang/reflect/Method;

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    const/4 v4, 0x0

    .line 76
    invoke-virtual {v2, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    if-eqz v0, :cond_0

    .line 81
    .line 82
    filled-new-array {p0, v4, p0, v4}, [Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {v1, v0, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    const-string p0, "Required value was null."

    .line 91
    .line 92
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    invoke-virtual {v1}, Lir2;->a()V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_2
    invoke-static {}, Lh;->c()V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_3
    invoke-virtual {v1}, Lir2;->k()V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_4
    invoke-virtual {v1}, Lir2;->a()V

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_5
    invoke-virtual {v1}, Lir2;->o()V

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_6
    invoke-virtual {v1}, Lir2;->B()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1}, Lir2;->o()V

    .line 120
    .line 121
    .line 122
    :goto_0
    return v3

    .line 123
    :pswitch_0
    invoke-virtual {p0}, Lo87;->a()V

    .line 124
    .line 125
    .line 126
    check-cast v2, Lqr2;

    .line 127
    .line 128
    iget-object p0, v2, Lqr2;->x:Landroid/database/sqlite/SQLiteStatement;

    .line 129
    .line 130
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteStatement;->execute()V

    .line 131
    .line 132
    .line 133
    return v3

    .line 134
    :pswitch_1
    check-cast v2, Ln87;

    .line 135
    .line 136
    invoke-virtual {v2}, Ln87;->i0()Z

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    invoke-virtual {v2, v3}, Ln87;->R(I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    const-string v2, "wal"

    .line 145
    .line 146
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-eqz v0, :cond_7

    .line 151
    .line 152
    iget-object v0, v1, Lir2;->w:Landroid/database/sqlite/SQLiteDatabase;

    .line 153
    .line 154
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->enableWriteAheadLogging()Z

    .line 155
    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_7
    iget-object v0, v1, Lir2;->w:Landroid/database/sqlite/SQLiteDatabase;

    .line 159
    .line 160
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->disableWriteAheadLogging()V

    .line 161
    .line 162
    .line 163
    :goto_1
    return p0

    .line 164
    nop

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public final isNull(I)Z
    .locals 4

    .line 1
    iget v0, p0, Lm87;->z:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "no row"

    .line 5
    .line 6
    const/16 v3, 0x15

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lo87;->a()V

    .line 12
    .line 13
    .line 14
    invoke-static {v3, v2}, Ll55;->w(ILjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v1

    .line 18
    :pswitch_0
    invoke-virtual {p0}, Lo87;->a()V

    .line 19
    .line 20
    .line 21
    invoke-static {v3, v2}, Ll55;->w(ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v1

    .line 25
    :pswitch_1
    iget-object p0, p0, Lm87;->A:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ln87;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ln87;->isNull(I)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public final m(I)V
    .locals 2

    .line 1
    iget v0, p0, Lm87;->z:I

    .line 2
    .line 3
    iget-object v1, p0, Lm87;->A:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lo87;->a()V

    .line 9
    .line 10
    .line 11
    const/16 p0, 0x19

    .line 12
    .line 13
    const-string p1, "column index out of range"

    .line 14
    .line 15
    invoke-static {p0, p1}, Ll55;->w(ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0

    .line 20
    :pswitch_0
    invoke-virtual {p0}, Lo87;->a()V

    .line 21
    .line 22
    .line 23
    check-cast v1, Lqr2;

    .line 24
    .line 25
    invoke-interface {v1, p1}, Lk87;->m(I)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_1
    check-cast v1, Ln87;

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Ln87;->m(I)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public n()V
    .locals 2

    .line 1
    iget v0, p0, Lm87;->z:I

    .line 2
    .line 3
    iget-object v1, p0, Lm87;->A:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Lo87;->n()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-virtual {p0}, Lo87;->a()V

    .line 13
    .line 14
    .line 15
    check-cast v1, Lqr2;

    .line 16
    .line 17
    invoke-interface {v1}, Lk87;->n()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_1
    check-cast v1, Ln87;

    .line 22
    .line 23
    invoke-virtual {v1}, Ln87;->n()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public reset()V
    .locals 1

    .line 1
    iget v0, p0, Lm87;->z:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lo87;->reset()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p0, p0, Lm87;->A:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ln87;

    .line 13
    .line 14
    invoke-virtual {p0}, Ln87;->reset()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 20
    .line 21
.end method
