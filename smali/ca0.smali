.class public final Lca0;
.super La97;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhs2;


# instance fields
.field public final synthetic A:I

.field public synthetic B:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILf61;)V
    .locals 1

    .line 11
    const/4 v0, 0x0

    iput v0, p0, Lca0;->A:I

    invoke-direct {p0, p1, p2}, La97;-><init>(ILf61;)V

    return-void
.end method

.method public constructor <init>(Ld06;Lf61;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lca0;->A:I

    .line 3
    .line 4
    iput-object p1, p0, Lca0;->B:Ljava/lang/Object;

    .line 5
    .line 6
    const/4 p1, 0x3

    .line 7
    invoke-direct {p0, p1, p2}, La97;-><init>(ILf61;)V

    .line 8
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
.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lca0;->A:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lca0;->B:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ld06;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Ld06;->w:Z

    .line 15
    .line 16
    sget-object p0, Lvs7;->a:Lvs7;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_0
    iget-object p0, p0, Lca0;->B:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Ly53;

    .line 22
    .line 23
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Ly53;->f:Liz0;

    .line 27
    .line 28
    sget-object p1, Lea0;->a:Lau;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Liz0;->d(Lau;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-nez p0, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-static {}, Lku4;->a()V

    .line 38
    .line 39
    .line 40
    :goto_0
    const/4 p0, 0x0

    .line 41
    return-object p0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lca0;->A:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lfi2;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/Throwable;

    .line 11
    .line 12
    check-cast p3, Lf61;

    .line 13
    .line 14
    new-instance p1, Lca0;

    .line 15
    .line 16
    iget-object p0, p0, Lca0;->B:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Ld06;

    .line 19
    .line 20
    invoke-direct {p1, p0, p3}, Lca0;-><init>(Ld06;Lf61;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v1}, Lca0;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    return-object v1

    .line 27
    :pswitch_0
    check-cast p1, Ly53;

    .line 28
    .line 29
    check-cast p2, Lj85;

    .line 30
    .line 31
    check-cast p3, Lf61;

    .line 32
    .line 33
    new-instance p0, Lca0;

    .line 34
    .line 35
    const/4 p2, 0x3

    .line 36
    invoke-direct {p0, p2, p3}, Lca0;-><init>(ILf61;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lca0;->B:Ljava/lang/Object;

    .line 40
    .line 41
    invoke-virtual {p0, v1}, Lca0;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    const/4 p0, 0x0

    .line 45
    return-object p0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
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
