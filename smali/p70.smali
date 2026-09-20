.class public final Lp70;
.super Lp50;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic b:I

.field public final c:I


# direct methods
.method public constructor <init>(Lq70;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lp70;->b:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    invoke-direct {p0, p1}, Lp50;-><init>(Lx21;)V

    const/4 p1, 0x5

    .line 26
    iput p1, p0, Lp70;->c:I

    return-void
.end method

.method public constructor <init>(Lx21;I)V
    .locals 0

    .line 1
    iput p2, p0, Lp70;->b:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch p2, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p1}, Lp50;-><init>(Lx21;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x6

    .line 13
    iput p1, p0, Lp70;->c:I

    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    invoke-direct {p0, p1}, Lp50;-><init>(Lx21;)V

    .line 17
    .line 18
    .line 19
    const/16 p1, 0x9

    .line 20
    .line 21
    iput p1, p0, Lp70;->c:I

    .line 22
    .line 23
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x4
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
.end method

.method public constructor <init>(Lxy4;I)V
    .locals 1

    iput p2, p0, Lp70;->b:I

    const/4 v0, 0x7

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    packed-switch p2, :pswitch_data_0

    .line 27
    invoke-direct {p0, p1}, Lp50;-><init>(Lx21;)V

    .line 28
    iput v0, p0, Lp70;->c:I

    return-void

    .line 29
    :pswitch_0
    invoke-direct {p0, p1}, Lp50;-><init>(Lx21;)V

    .line 30
    iput v0, p0, Lp70;->c:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final c(Lbe8;)Z
    .locals 2

    .line 1
    iget p0, p0, Lp70;->b:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    packed-switch p0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object p0, p1, Lbe8;->j:Lj31;

    .line 12
    .line 13
    iget-boolean p0, p0, Lj31;->f:Z

    .line 14
    .line 15
    return p0

    .line 16
    :pswitch_0
    iget-object p0, p1, Lbe8;->j:Lj31;

    .line 17
    .line 18
    iget-object p0, p0, Lj31;->a:Lyy4;

    .line 19
    .line 20
    sget-object p1, Lyy4;->y:Lyy4;

    .line 21
    .line 22
    if-ne p0, p1, :cond_0

    .line 23
    .line 24
    move v0, v1

    .line 25
    :cond_0
    return v0

    .line 26
    :pswitch_1
    iget-object p0, p1, Lbe8;->j:Lj31;

    .line 27
    .line 28
    iget-object p0, p0, Lj31;->a:Lyy4;

    .line 29
    .line 30
    sget-object p1, Lyy4;->x:Lyy4;

    .line 31
    .line 32
    if-ne p0, p1, :cond_1

    .line 33
    .line 34
    move v0, v1

    .line 35
    :cond_1
    return v0

    .line 36
    :pswitch_2
    iget-object p0, p1, Lbe8;->j:Lj31;

    .line 37
    .line 38
    iget-boolean p0, p0, Lj31;->e:Z

    .line 39
    .line 40
    return p0

    .line 41
    :pswitch_3
    iget-object p0, p1, Lbe8;->j:Lj31;

    .line 42
    .line 43
    iget-boolean p0, p0, Lj31;->c:Z

    .line 44
    .line 45
    return p0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, Lp70;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget p0, p0, Lp70;->c:I

    .line 7
    .line 8
    return p0

    .line 9
    :pswitch_0
    iget p0, p0, Lp70;->c:I

    .line 10
    .line 11
    return p0

    .line 12
    :pswitch_1
    iget p0, p0, Lp70;->c:I

    .line 13
    .line 14
    return p0

    .line 15
    :pswitch_2
    iget p0, p0, Lp70;->c:I

    .line 16
    .line 17
    return p0

    .line 18
    :pswitch_3
    iget p0, p0, Lp70;->c:I

    .line 19
    .line 20
    return p0

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    iget p0, p0, Lp70;->b:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    :goto_0
    xor-int/2addr p0, v1

    .line 15
    return p0

    .line 16
    :pswitch_0
    check-cast p1, Lvy4;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-boolean p0, p1, Lvy4;->a:Z

    .line 22
    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    iget-boolean p0, p1, Lvy4;->c:Z

    .line 26
    .line 27
    if-nez p0, :cond_0

    .line 28
    .line 29
    iget-boolean p0, p1, Lvy4;->e:Z

    .line 30
    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    :cond_0
    move v0, v1

    .line 34
    :cond_1
    return v0

    .line 35
    :pswitch_1
    check-cast p1, Lvy4;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-boolean p0, p1, Lvy4;->e:Z

    .line 41
    .line 42
    if-nez p0, :cond_2

    .line 43
    .line 44
    iget-boolean p0, p1, Lvy4;->a:Z

    .line 45
    .line 46
    if-eqz p0, :cond_2

    .line 47
    .line 48
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 49
    .line 50
    const/16 v2, 0x1a

    .line 51
    .line 52
    if-lt p0, v2, :cond_3

    .line 53
    .line 54
    iget-boolean p0, p1, Lvy4;->b:Z

    .line 55
    .line 56
    if-nez p0, :cond_3

    .line 57
    .line 58
    :cond_2
    move v0, v1

    .line 59
    :cond_3
    return v0

    .line 60
    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    goto :goto_0

    .line 67
    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    goto :goto_0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 76
.end method
