.class public final Lyy0;
.super Lhu5;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lsr2;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lyy0;->b:I

    sget-object v0, Lg22;->K:Lg22;

    .line 22
    invoke-direct {p0, p1}, Lhu5;-><init>(Lsr2;)V

    .line 23
    iput-object v0, p0, Lyy0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lvr2;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lyy0;->b:I

    .line 3
    .line 4
    new-instance v0, Lo;

    .line 5
    .line 6
    const/16 v1, 0x16

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lo;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0}, Lhu5;-><init>(Lsr2;)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Lzy0;

    .line 15
    .line 16
    invoke-direct {v0, p1}, Lzy0;-><init>(Lvr2;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lyy0;->c:Ljava/lang/Object;

    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lju5;
    .locals 11

    .line 1
    iget v0, p0, Lyy0;->b:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v3, Lju5;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    move v6, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v6, v1

    .line 15
    :goto_0
    iget-object v0, p0, Lyy0;->c:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v7, v0

    .line 18
    check-cast v7, Lux6;

    .line 19
    .line 20
    const/4 v8, 0x0

    .line 21
    const/4 v9, 0x1

    .line 22
    move-object v4, p0

    .line 23
    move-object v5, p1

    .line 24
    invoke-direct/range {v3 .. v9}, Lju5;-><init>(Lhu5;Ljava/lang/Object;ZLux6;Lvr2;Z)V

    .line 25
    .line 26
    .line 27
    return-object v3

    .line 28
    :pswitch_0
    move-object v4, p0

    .line 29
    move-object v5, p1

    .line 30
    new-instance p0, Lju5;

    .line 31
    .line 32
    if-nez v5, :cond_1

    .line 33
    .line 34
    move v7, v2

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v7, v1

    .line 37
    :goto_1
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x1

    .line 39
    const/4 v8, 0x0

    .line 40
    move-object v6, v5

    .line 41
    move-object v5, v4

    .line 42
    move-object v4, p0

    .line 43
    invoke-direct/range {v4 .. v10}, Lju5;-><init>(Lhu5;Ljava/lang/Object;ZLux6;Lvr2;Z)V

    .line 44
    .line 45
    .line 46
    return-object v4

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
.end method

.method public b()Lc28;
    .locals 1

    .line 1
    iget v0, p0, Lyy0;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lhu5;->b()Lc28;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Lyy0;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lzy0;

    .line 14
    .line 15
    return-object p0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 18
    .line 19
    .line 20
    .line 21
.end method
