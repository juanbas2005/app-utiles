.class public final Ll28;
.super Lwx3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic x:I

.field public final synthetic y:Lm28;


# direct methods
.method public synthetic constructor <init>(Lm28;I)V
    .locals 0

    .line 1
    iput p2, p0, Ll28;->x:I

    .line 2
    .line 3
    iput-object p1, p0, Ll28;->y:Lm28;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lwx3;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
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
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Ll28;->x:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    iget-object p0, p0, Ll28;->y:Lm28;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Lhz1;

    .line 11
    .line 12
    iget-object v0, p0, Lm28;->b:Lsx2;

    .line 13
    .line 14
    iget v2, p0, Lm28;->k:F

    .line 15
    .line 16
    iget p0, p0, Lm28;->l:F

    .line 17
    .line 18
    invoke-interface {p1}, Lhz1;->j0()Lwr0;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Lwr0;->L()J

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    invoke-virtual {v3}, Lwr0;->D()Lqk0;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    invoke-interface {v6}, Lqk0;->h()V

    .line 31
    .line 32
    .line 33
    :try_start_0
    iget-object v6, v3, Lwr0;->x:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v6, Lji8;

    .line 36
    .line 37
    const-wide/16 v7, 0x0

    .line 38
    .line 39
    invoke-virtual {v6, v2, p0, v7, v8}, Lji8;->E(FFJ)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1}, Lsx2;->a(Lhz1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    invoke-static {v3, v4, v5}, Lb81;->u(Lwr0;J)V

    .line 46
    .line 47
    .line 48
    return-object v1

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    invoke-static {v3, v4, v5}, Lb81;->u(Lwr0;J)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :pswitch_0
    check-cast p1, Lu18;

    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    iput-boolean p1, p0, Lm28;->d:Z

    .line 58
    .line 59
    iget-object p0, p0, Lm28;->f:Lsr2;

    .line 60
    .line 61
    invoke-interface {p0}, Lsr2;->b()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    return-object v1

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
